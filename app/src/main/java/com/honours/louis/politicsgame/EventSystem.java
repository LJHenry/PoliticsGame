package com.honours.louis.politicsgame;

import android.content.Context;
import android.provider.Settings;
import android.widget.Toast;

import com.honours.louis.politicsgame.org.pielot.rf.PoliticsGameRandomForest;
import com.honours.louis.politicsgame.org.pielot.rf.Prediction;

import java.io.FileOutputStream;
import java.util.ArrayList;

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
    private ArrayList<String> situations;
    private String lastSituation;
    private double negativeMultiplier;
    //Event
    private int choice;
    private String lastEffects;
    private String isNegative;
    private EventPool pool;
    private String tier;
    //Event Memory (Difficulty Adjustment)
    private ArrayList<Event> events;
    private boolean positiveOverride;
    //Log File
    private String logFilename; //Device Android ID - unique and recommended secure ID method by Google
    private Context c;
    //AI
    private TrainingSuite t;
    private PoliticsGameRandomForest rf;
    private boolean flagUseAi; //If false AI will not be used
    private String predictedChoice;

    public EventSystem(Context context, String cn, int gt, String e, boolean useAi) {
        c = context.getApplicationContext();
        //Parameters to send for new log entry
        countryName = cn;
        govType = gt;
        engagement = e;
        //Situation memory
        situations = new ArrayList<>();
        negativeMultiplier = 0;
        //Name of log file
        logFilename = Settings.Secure.getString(c.getContentResolver(), Settings.Secure.ANDROID_ID) + "_Log";
        //Initialise events
        pool = new EventPool();
        events = new ArrayList<>();
        positiveOverride = false;
        //Training events
        t = new TrainingSuite();
        //Random Forest
        flagUseAi = useAi;
        if(flagUseAi){
            rf = new PoliticsGameRandomForest();
        }
    }

    public void getGameState(double a, double b, double s, int c, boolean negative, String t) {
        //Resources
        approval = a;
        budget = b;
        stability = s;
        //Choice and event
        tier = t;
        choice = c;
        if (negative) {
            isNegative = "negative";
        } else {
            isNegative = "positive";
        }
        //Calculate situation
        //situation = getSituation();
        //Log game state
        String state = getResources() + "," + tier + "," + isNegative + "," + choice + "\n"; // " --" +  "PREDICTED: " + predictedChoice +
        log(state);
        //Remember last situation
        lastSituation = "";
    }

    //Get resources as string
    private String getResources(){

        //Percent
        //% of approval
        //double a = (approval/100) * 100;
        //% of budget
        //double b = (budget/100000) * 100;
        //% of stability
        //double s = (stability/5) * 100;


        //Actual
        double a = approval;
        double b = budget;
        double s = stability;

        return String.format("%.1f", a) + "," + String.format("%.1f", b) + "," + String.format("%.1f", s);
    }

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

    //Find event in pool
    public Event findEvent(String label, boolean random) {
        if (random) {
            Event e;
            //Get event
            if(positiveOverride){
                e = pool.getRandomEvent(getSituation(), negativeMultiplier, true);
            } else {
                e = pool.getRandomEvent(getSituation(), negativeMultiplier, false);
            }
            //AI
            if(flagUseAi){
                //Predict choice
                String choice = getPrediction(approval, budget, stability, isNegative);
                modifyEffectBySituation(e, choice);

                //DEBUG - Output
                Toast toast2 = Toast.makeText(c, choice, Toast.LENGTH_SHORT);
                toast2.show();
            }
            rememberEvent(e);
            return e;
        } else {
            //Pool A - Scripted
            //Time based events (game start, election)
            switch (label) {
                case "GameStart":
                    //Welcome
                    return getEvent(label);
                case "Example":
                    //Event Example
                    return getEvent(label);
                case "Resources":
                    //Resources Description
                    return getEvent(label);
                case "ElectionWarning":
                    //Election Primer Event
                    return getEvent(label);
                case "BeginCampaign":
                    //Start of Campaign
                    return getEvent(label);
                case "OppositionCampaign":
                    //opposition start Campaign
                    return getEvent(label);
                case "ElectionProgress":
                    //Election Progresses
                    return getEvent(label);
                case "ElectionTwist":
                    //Twist in Election
                    return getEvent(label);
                case "ElectionLoosing":
                    //Player is likely to loose
                    return getEvent(label);
                case "ElectionClose":
                    //Election is about to occur
                    return getEvent(label);
                default:
                    break;
            }
        }
        return null;
    }

    //Fetch scripted event from pool A
    private Event getEvent(String label){
        Event e;
        e = pool.getEventByName(label);
        if(flagUseAi){
            //Predict choice
            String choice = getPrediction(approval, budget, stability, isNegative);
            modifyEffectBySituation(e, choice);
        }
        rememberEvent(e);
        return e;
    }

    //Get training event
    public Event getTrainingEvent(){
        //Get event
        Event e = t.getTrainingEvent(getSituation(), negativeMultiplier);
        //DEBUG - Output
        Toast toast1 = Toast.makeText(c, getSituation(), Toast.LENGTH_SHORT);
        toast1.show();
        if(flagUseAi){
            //Predict choice
            String choice = getPrediction(approval, budget, stability, isNegative);
            modifyEffectBySituation(e, choice);

            //DEBUG - Output
            Toast toast2 = Toast.makeText(c, choice, Toast.LENGTH_SHORT);
            toast2.show();
        }
        return e;
    }

    private String getSituation() {
        //Determine Situation Label

        //Use incremental system to build a score
        //Higher score = worse situation
        //Closer to election score is naturally higher

        String label = "Critical"; //Only stays as this if score is over 60 = critical
        double score = 0;

        score = calculateScore();

        if (score <= 20) {
            //Low
            label = "Low";
        } else if (score <= 30) {
            //Moderate
            label = "Moderate";
        } else if (score <= 40) {
            //Substantial
            label = "Substantial";
        } else if (score <= 50) {
            //Severe
            label = "Severe";
        } else if (score <= 60) {
            //Critical
            label = "Critical";
        }

        rememberSituation(label);
        return label;
    }

    //Add up score based on game situation - higher = worse situation
    private double calculateScore() {

        double score = 0;

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
        if (approval < 20) {
            score += 20;
        } else if (approval < 40) {
            score += 15;
        } else if (approval < 60){
            score += 10;
        } else if(approval < 80){
            score += 5;
        }

        //Budget
        if (budget < 20000) {
            score += 20;
        } else if (budget < 40000) {
            score += 15;
        } else if (budget < 60000){
            score += 10;
        } else if(budget < 80000){
            score += 5;
        }

        //Stability
        if (stability < 0.5) {
            score += 20;
        } else if (stability < 1.5) {
            score += 15;
        } else if (stability < 2.5){
            score += 10;
        } else if(stability < 3.5){
            score += 5;
        }

        if (lastSituation != null) {
            //Add a percentage of the score depending on the last events label
            switch (lastSituation) {
                case "Low":
                    score += (score / 100);
                    break;
                case "Moderate":
                    score += (score / 100 * 5);
                    break;
                case "Substantial":
                    score += (score / 100 * 10);
                    break;
                case "Severe":
                    score += (score / 100 * 15);
                    break;
                case "Critical":
                    score += (score / 100 * 20);
                    break;
            }
        }

        return score;
    }

    //Keep a running tally of situations
    private void rememberSituation(String s){
        situations.add(s);
        entropy();
    }

    //Keep a log of events
    private void rememberEvent(Event e){
        events.add(e);
        //Check events
        checkEvents();
    }

    //Increase chance of negative events based on situations over time
    private void entropy(){

        //Assess situations
        int[] situ = new int[5];
        //Initialise
        for(int i = 0; i < situ.length; i++){
            situ[i] = 0;
        }
        for(String s : situations){
            if(s == "Low"){
                situ[0]++;
            } else if(s == "Moderate"){
                situ[1]++;
            } else if(s == "Substantial"){
                situ[2]++;
            } else if(s == "Severe"){
                situ[3]++;
            } else if(s == "Critical"){
                situ[4]++;
            }
        }

        //Find most prevalent situation
        int max = situ[0];
        for(int i = 0; i < situ.length; i++){
            if(situ[i] > max){ //If equal take the lowest situation
                max = i;
            }
        }

        //Increase negative chance based on general situation
        if(max == 0){
            negativeMultiplier = 2;
        } else if(max == 1){
            negativeMultiplier = 1.75;
        }  else if(max == 2){
            negativeMultiplier = 1.5;
        }  else if(max == 3){
            negativeMultiplier = 1.25;
        }  else if(max == 4){
            negativeMultiplier = 1;
        }
    }

    //Check events for adjusting difficulty
    private void checkEvents(){
        int count = 0;
        //If 3 negatives in a row
        for(Event e : events){
            if(e.isNegative()){
                count++;
            } else {
                count = 0;
            }
        }
        if(count >= 3){
            //Push for positive
            positiveOverride = true;
        }
    }

    //Run situation through AI choice prediction
    private String getPrediction(double approval, double budget, double stability, String type){
        //Update fields with game state
        rf.updateFields(approval, budget, stability, type);
        //Run classification to get prediction
        Prediction p = rf.runClassification();
        //Return the prediction as String
        predictedChoice = p.label;
        return p.label;
    }

    //Modify the effect of the choice predicted by the classifier
    private void modifyEffectBySituation(Event e, String choice){
        //Positive/Negative modifier
        double modifierP  = 0;
        double modifierN  = 0;

        //Get game situation
        switch (getSituation()){
            case "Low":
                modifierN = 1.75;
                modifierP = 0.50;
                break;
            case "Moderate":
                modifierN = 1.50;
                modifierP = 0.75;
                break;
            case "Substantial":
                modifierN = 1.2;
                modifierP = 1.2;
                break;
            case "Severe":
                modifierN = 0.75;
                modifierP = 1.50;
                break;
            case "Critical":
                modifierN = 0.50;
                modifierP = 1.75;
                break;
        }

        //Get predicted effect
        double effect = e.getEffectByLabel(choice);
        //Apply modifier by multiplying
        if(e.isNegative()){
            effect = effect * modifierN;
        } else if(!e.isNegative()){
            effect = effect * modifierP;
        }
        e.setEffect(choice, effect);
    }

}

