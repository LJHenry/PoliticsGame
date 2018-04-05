package com.honours.louis.politicsgame;

import android.content.Context;
import android.provider.Settings;
import android.widget.Toast;

import com.honours.louis.politicsgame.org.pielot.rf.PoliticsGameRandomForest;
import com.honours.louis.politicsgame.org.pielot.rf.Prediction;

import java.io.FileOutputStream;

/**
 * System will take game parameters and produce a suitable event.
 * Logs game situation and calculates situation score.
 * Will be manipulated by the AI.
 * Created by Louis Henry.
 */

public class EventSystem {

    //Specifics
    private String countryName;
    private int govType;
    private String engagement;
    //Resources
    private double approval;
    private double budget;
    private double stability;
    //Game Situation
    private int day;
    private int year;
    private String situation;
    private String lastSituation;
    //Event
    private int choice;
    private String lastEffects;
    private String isNegative;
    private EventPool pool;
    //Log File
    private String logFilename; //Device Android ID - unique and recommended secure ID method by Google
    private Context c;
    //AI
    private TrainingSuite t;
    private PoliticsGameRandomForest rf;
    private boolean flagUseAi; //If false AI will not be used

    public EventSystem(Context context, String cn, int gt, String e) {
        c = context.getApplicationContext();
        //Parameters to send for new log entry
        countryName = cn;
        govType = gt;
        engagement = e;
        //Name of log file
        logFilename = Settings.Secure.getString(c.getContentResolver(), Settings.Secure.ANDROID_ID) + "_Log";
        //Initialise events
        pool = new EventPool();
        //Training events
        t = new TrainingSuite();
        //Random Forest
        rf = new PoliticsGameRandomForest();
    }

    public void getGameState(double a, double b, double s, int c, boolean negative) {
        //Resources
        approval = a;
        budget = b;
        stability = s;
        //Choice and event
        choice = c;
        if (negative) {
            isNegative = "negative";
        } else {
            isNegative = "positive";
        }
        //Calculate situation
        //situation = getSituation();
        //Log game state
        String state = getResourcePercentage() + "," + isNegative + "," + choice + "\n";
        log(state);
        //Remember last situation
        lastSituation = situation;
    }

    //Get resources as percentage(string)
    private String getResourcePercentage(){

        //% of approval
        double a = (approval/100) * 100;

        //% of budget
        double b = (budget/100000) * 100;

        //% of stability
        double s = (stability/5) * 100;

        return String.format("%.1f", a) + "," + String.format("%.1f", b) + "," + String.format("%.1f", s);
    }

    /*
    //Get choice as a word
    private String getChoiceAsWord(int c){
        String s = "";
        if(c == 1){
            s = "one";
        } else if(c == 2){
            s = "two";
        } else if(c == 3){
            s = "three";
        }
        return s;
    }
    */

    //Write out game state to log - INTERNAL PRIVATE STORAGE
    private void log(String state) {
        FileOutputStream outputStream;
        try {
            outputStream = c.openFileOutput(logFilename, Context.MODE_APPEND);
            if (lastSituation == null) {
                outputStream.write(("\nNEW GAME - Name:" + countryName + " Type:" + String.valueOf(govType) + " Engagement:" + engagement + "\n").getBytes());
            }
            outputStream.write(state.getBytes());
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Clear Log
    private void deleteLog(){
        c.deleteFile(logFilename);
    }

    //Get a new event
    public void getNewEvent(double a, double b, double s, int d, int y, String l) {
        //Get game state
        approval = a;
        budget = b;
        stability = s;
        day = d;
        year = y;
        lastSituation = l;

        //String label = getSituation();

        //Do relevant stuff
    }

    //Find event in pool
    public Event findPremadeEvent(String label, boolean random) {
        if (random) {
            //Pool B - Random
            return pool.getEvent();
        } else {
            //Pool A - Scripted
            //Time based events (game start, election)
            switch (label) {
                case "GameStart":
                    //Welcome
                    return getPremadeEvent(label);
                case "Example":
                    //Event Example
                    return getPremadeEvent(label);
                case "Resources":
                    //Resources Description
                    return getPremadeEvent(label);
                case "ElectionWarning":
                    //Election Primer Event
                    return getPremadeEvent(label);
                case "BeginCampaign":
                    //Start of Campaign
                    return getPremadeEvent(label);
                case "OppositionCampaign":
                    //opposition start Campaign
                    return getPremadeEvent(label);
                case "ElectionProgress":
                    //Election Progresses
                    return getPremadeEvent(label);
                case "ElectionTwist":
                    //Twist in Election
                    return getPremadeEvent(label);
                case "ElectionLoosing":
                    //Player is likely to loose
                    return getPremadeEvent(label);
                case "ElectionClose":
                    //Election is about to occur
                    return getPremadeEvent(label);
                default:
                    break;
            }
        }
        return null;
    }

    //Fetch event from pool
    private Event getPremadeEvent(String label){
        Event e;
        e = pool.getEventByName(label);
        //lastEffects = getEffectsPercent(e);
        return e;
    }

    //Get training event
    public Event getTrainingEvent(){
        //Get event
        Event e = t.getTrainingEvent();
        //Predict choice
        String choice = getPrediction(approval, budget, stability, isNegative);
        modifyEffectBySituation(e, choice);
        //DEBUG - Output
        Toast toast = Toast.makeText(c, choice, Toast.LENGTH_SHORT);
        toast.show();
        return e;
    }

    private String getSituation() {
        //Determine Situation Label

        //Use incremental system to build a score
        //Higher score = worse situation
        //Closer to election score is naturally higher

        String label = "Critical"; //Only stays as this if score is over 40 = critical
        int score = 0;

        score = calculateScore();

        if (score <= 9) {
            //Low
            label = "Low";
        } else if (score <= 19) {
            //Moderate
            label = "Moderate";
        } else if (score <= 29) {
            //Substantial
            label = "Substantial";
        } else if (score <= 39) {
            //Severe
            label = "Severe";
        } else if (score <= 40) {
            //Critical
            label = "Critical";
        }

        return label;
    }

    //Add up score based on game situation - higher = worse situation
    private int calculateScore() {

        int score = 0;

        //Check time remaining till election (end year 4)
        if (year == 4) {
            if (day > 180) {
                //Nearing game end
                score += 5;
            }
            score += 5;
        } else if (year == 3) {
            if (day > 180) {
                //Getting closer to election year
                score += 2;
            }
            score += 1;
        }

        //Check 3 Resources for closeness to 0

        //Approval
        if (approval < 30) {
            score += 20;
        } else if (approval < 40) {
            score += 10;
        }

        //Budget
        if (budget < 25000) {
            score += 20;
        } else if (budget < 35000) {
            score += 10;
        }

        //Stability
        if (stability < 1.5) {
            score += 20;
        } else if (stability < 2) {
            score += 10;
        }

        if (lastSituation != null) {
            //Add a percentage of the score depending on the last events label
            switch (lastSituation) {
                case "Low":
                    score += (score / 100);
                    break;
                case "Moderate":
                    score += (score / 100 * 4);
                    break;
                case "Substantial":
                    score += (score / 100 * 6);
                    break;
                case "Severe":
                    score += (score / 100 * 10);
                    break;
                case "Critical":
                    score += (score / 100 * 15);
                    break;
            }
        }

        return score;
    }

    //Log effects
    private String getEffectsAmount(Event e){
        //Get Percentage
        double a; double b; double s;
        a = (e.getEffectA()/100) * 100;
        b = (e.getEffectB()/100000) * 100;
        s = (e.getEffectS()/5) * 100;

        return String.format("%.1f", a) + "," + String.format("%.1f", b) + "," + String.format("%.1f", s);
    }

    //Run situation through AI choice prediction
    private String getPrediction(double approval, double budget, double stability, String type){
        //Update fields with game state
        rf.updateFields(approval, budget, stability, type);
        //Run classification to get prediction
        Prediction p = rf.runClassification();
        //Return the prediction as String
        return p.label;
    }

    //Modify the effect of the choice predicted by the classifier
    private void modifyEffectBySituation(Event e, String choice){
        double modifier  = 0;

        //Get game situation
        switch (getSituation()){
            case "Low":
                modifier = 1.75;
                break;
            case "Moderate":
                modifier = 1.50;
                break;
            case "Substantial":
                modifier = 1.35;
                break;
            case "Severe":
                modifier = 1.25;
                break;
            case "Critical":
                modifier = 1.15;
                break;
        }

        //Get predicted effect
        double effect = e.getEffectByLabel(choice);
        //Apply modifier
        effect = effect * modifier;
        e.setEffect(choice, effect);
    }

    //---Dynamic Generation---
    //Look up keyword table
    //Find compatible Object, Context and Subject
    //Get choice effects
    //Check against label
    //Apply modifier based on game state
}

