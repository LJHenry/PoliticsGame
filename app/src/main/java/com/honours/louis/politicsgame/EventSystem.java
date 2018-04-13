package com.honours.louis.politicsgame;

import android.content.Context;
import android.provider.Settings;
import android.widget.Toast;

import com.honours.louis.politicsgame.org.pielot.rf.NegativePoliticsGameRandomForest;
import com.honours.louis.politicsgame.org.pielot.rf.PositivePoliticsGameRandomForest;
import com.honours.louis.politicsgame.org.pielot.rf.Prediction;

import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 * System will take game parameters and produce a suitable event.
 * Logs game situation and calculates situation score.
 * Gets prediction from AI to modify difficulty.
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
    private String approvalString;
    private String budgetString;
    private String stabilityString;
    //Game Situation
    private int day;
    private int year;
    private ArrayList<String> situations;
    private String lastSituation;
    private double negativeMultiplier;
    private double score;
    //Event
    private int choice;
    private String isNegative;
    private EventPool pool;
    //Event Memory (Difficulty Adjustment)
    private ArrayList<Event> events;
    private boolean positiveOverride;
    //Log File
    private String logFilename; //Device Android ID - unique and recommended secure ID method by Google
    private Context c;
    //AI
    private TrainingSuite t;
    private PositivePoliticsGameRandomForest rfPositive;
    private NegativePoliticsGameRandomForest rfNegative;
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
        score = 0;
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
            rfPositive = new PositivePoliticsGameRandomForest();
            rfNegative = new NegativePoliticsGameRandomForest();
        }
    }

    public void getGameState(double a, double b, double s, int c, boolean negative, String tier) {
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
        String state = getResources() + "," + calculateScore() + "," + tier + "," + choice + "," + isNegative + "\n"; // " --" +  "PREDICTED: " + predictedChoice +
        log(state);
        //Use last situation
        if(situations.isEmpty()) {
            lastSituation = "";
        } else {
            lastSituation = situations.get(situations.size() -1);
        }
    }

    //Get resources as string
    private String getResources(){

        //Percent
        //% of approval
        double a = (approval/100) * 100;
        //% of budget
        double b = (budget/100000) * 100;
        //% of stability
        double s = (stability/5) * 100;


        //return String.format("%.1f", a) + "," + String.format("%.1f", b) + "," + String.format("%.1f", s);
        //return getResourceNominal(a) + "," + getResourceNominal(b) + "," + getResourceNominal(s);
        return compareResources(a, b, s);
    }

    //Get resource value as a string low, below, average, above, high
    private String getResourceNominal(double resource){
        if(resource >= 45 && resource <= 55){
            return "average";
        } else if(resource >= 25 && resource <= 44){
            return "below";
        } else if(resource <= 24){
            return "low";
        } else if(resource >= 56 && resource <= 65){
            return "above";
        } else if(resource > 65){
            return "high";
        }

        return "default";
    }

    //Work out high medium and low
    private String compareResources(double a, double b, double s){
        //Account for all possible situations
        String app = "default"; String bud = "default"; String stab = "default";

        //All 3 equal
        if(a == b && b == s){
            app = "medium";
            bud = "medium";
            stab = "medium";
        }

        //Approval, high or low
        if(a > b && a > s){
            app = "high";
            if(b == s){
                bud = "medium";
                stab = "medium";
            } else if(b > s){
                bud = "medium";
                stab = "low";
            } else {
                bud = "low";
                stab = "medium";
            }
        } else if(a < b && a < s){
            app = "low";
            if(b == s){
                bud = "medium";
                stab = "medium";
            } else if(b < s){
                bud = "medium";
                stab = "high";
            } else {
                bud = "high";
                stab = "medium";
            }
        }

        //Budget, high or low
        if(b > a && b > s){
            bud = "high";
            if(a == s){
                app = "medium";
                stab = "medium";
            } else if(a > s){
                app = "medium";
                stab = "low";
            } else {
                app = "low";
                stab = "medium";
            }
        } else if(b < a && b < s){
            bud = "low";
            if(a == s){
                app = "medium";
                stab = "medium";
            } else if(a < s){
                app = "medium";
                stab = "high";
            } else {
                app = "high";
                stab = "medium";
            }
        }

        //Budget, high or low
        if(s > a && s > b){
            stab = "high";
            if(a == b){
                app = "medium";
                bud = "medium";
            } else if(a > b){
                app = "medium";
                bud = "low";
            } else {
                app = "low";
                bud = "medium";
            }
        } else if(s < a && s < b){
            stab = "low";
            if(a == b){
                app = "medium";
                bud = "medium";
            } else if(a < b){
                bud = "medium";
                app = "high";
            } else {
                app = "high";
                bud = "medium";
            }
        }
        approvalString = app;
        budgetString = bud;
        stabilityString = stab;

        return app + "," + bud + "," + stab;
    }

    //Find event in pool
    public Event findEvent(String label, boolean random) {
        if (random) {
            Event e;
            //Get event
            if(positiveOverride){
                e = pool.getRandomEvent(getSituation(), negativeMultiplier, true);
                positiveOverride = false;
            } else {
                e = pool.getRandomEvent(getSituation(), negativeMultiplier, false);
            }
            //AI
            if(flagUseAi){
                //Predict choice
                String choice = getPrediction(approvalString, budgetString, stabilityString, isNegative, e.getTierAsString());
                modifyEffect(e, choice);

                //DEBUG - Output
                Toast toast2 = Toast.makeText(c, choice + "| " +  getSituation(), Toast.LENGTH_SHORT);
                toast2.show();
            }
            rememberEvent(e);
            return e;
        } else {
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
            if(approvalString == null && budgetString == null && stabilityString == null){
                //Skip start
                return e;
            }
            String choice = getPrediction(approvalString, budgetString, stabilityString, isNegative, e.getTierAsString());
            modifyEffect(e, choice);
        }
        rememberEvent(e);
        return e;
    }

    private String getSituation() {
        //Determine Situation Label

        //Use incremental system to build a score
        //Higher score = worse situation
        //Closer to election score is naturally higher

        String label = "Critical"; //Only stays as this if score is over 40 = critical
        double score = 0;

        score = calculateScore();

        if (score <= 20) {
            //Low
            label = "Low";
        } else if (score <= 30) {
            //Moderate
            label = "Moderate";
        } else if (score <= 35) {
            //Substantial
            label = "Substantial";
        } else if (score <= 40) {
            //Severe
            label = "Severe";
        } else if (score <= 45) {
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
                score += 8;
            }
            score += 5;
        } else if (year == 3) {
            if (day > 180) {
                //Getting closer to election year
                score += 5;
            }
            score += 2;
        }

        //Approval
        if (approval < 10) {
            score += 28;
        } else if (approval < 15) {
            score += 25;
        } else if (approval < 15) {
            score += 20;
        } else if (approval < 25) {
            score += 18;
        } else if (approval < 30) {
            score += 16;
        } else if (approval < 35){
            score += 14;
        } else if(approval < 40){
            score += 12;
        } else if(approval < 45){
            score += 10;
        } else if(approval < 50){
            score += 8;
        } else if(approval < 55){
            score += 5;
        }

        //Budget
        if (budget < 10000) {
            score += 28;
        } else if (budget < 15000) {
            score += 25;
        } else if (budget < 20000) {
            score += 20;
        } else if (budget < 25000) {
            score += 18;
        } else if (budget < 30000){
            score += 16;
        } else if(budget < 35000){
            score += 14;
        } else if(budget < 40000){
            score += 12;
        } else if(budget < 45000){
            score += 10;
        } else if(budget < 50000){
            score += 8;
        } else if(budget < 55000){
            score += 5;
        }

        //Stability
        if (stability < 1) {
            score += 20;
        } else if (stability < 1.5) {
            score += 18;
        } else if (stability < 2.0){
            score += 16;
        } else if (stability < 2.5){
            score += 14;
        } else if (stability < 3.0){
            score += 12;
        } else if(stability < 3.5){
            score += 10;
        } else if (stability < 4){
            score += 5;
        }

        if (lastSituation != null) {
            //Add a percentage of the score depending on the last events
            switch (lastSituation) {
                case "Low":
                    score += (score / 100); //1%
                    break;
                case "Moderate":
                    score += (score / 100 * 5); //5%
                    break;
                case "Substantial":
                    score += (score / 100 * 10); //10%
                    break;
                case "Severe":
                    score += (score / 100 * 15); //15%
                    break;
                case "Critical":
                    score += (score / 100 * 20); //20%
                    break;
            }
        }

        this.score = score;
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
            negativeMultiplier = 2.2;
        } else if(max == 1){
            negativeMultiplier = 2;
        }  else if(max == 2){
            negativeMultiplier = 1.75;
        }  else if(max == 3){
            negativeMultiplier = 1.5;
        }  else if(max == 4){
            negativeMultiplier = 1.25;
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
    private String getPrediction(String a, String b, String s, String type, String tier){
        //Positive or Negative model
        if(type == "positive"){
            //Update fields with game state
            rfPositive.updateFields(a, b, s, score, tier);
            //Run classification to get prediction
            Prediction p = rfPositive.runClassification();
            //Return the prediction as String
            predictedChoice = p.label;
            return p.label;
        } else if(type == "negative"){
            //Update fields with game state
            rfNegative.updateFields(a, b, s, score, tier);
            //Run classification to get prediction
            Prediction p = rfNegative.runClassification();
            //Return the prediction as String
            predictedChoice = p.label;
            return p.label;
        }
        return "0";
    }

    //Modify the effect of the predicted choice based on situation
    private void modifyEffect(Event e, String choice){
        //Positive/Negative modifier
        double modifierN  = getModifier(true, choice); //Bias towards negative effects, attempting to make the game hard, keep user attention
        double modifierP  = getModifier(false, choice);

        //Get effect
        double effect = e.getEffectByLabel(choice);
        if(effect == 0){
            //Don't modify Intro events
            return;
        }

        //Apply modifier
        if(e.isNegative()){
            if(choice == "3"){
                effect -= modifierN;
            } else {
                effect = effect * modifierN;
            }
        } else if(!e.isNegative()){
            if(choice == "3"){
                effect += modifierP;
            } else {
                effect = effect * modifierP;
            }
        }

        //Round
        if(choice == "3"){
            //No need
        } else {
            effect = Math.round(effect);
        }

        e.setEffect(choice, effect);
    }

    //Get a modifier
    private double getModifier(boolean neg, String choice){
        //Get game situation
        switch (getSituation()){
            case "Low":                         //Greatly reduce positive effects, greatly increase negatives
                if(choice == "1"){
                    if(neg){ return 1.75;}
                    else { return 0.50;}
                } else if(choice == "2"){
                    if(neg){ return 1.50;}
                    else { return 0.75;}
                } else if(choice == "3"){
                    if(neg){ return 0.15;}
                    else { return -0.05;}
                }
                break;
            case "Moderate":                    //Reduce positive effects, increase negatives
                if(choice == "1"){
                    if(neg){ return 1.50;}
                    else { return 0.75;}
                } else if(choice == "2"){
                    if(neg){ return 1.25;}
                    else { return 0.85;}
                } else if(choice == "3"){
                    if(neg){ return 0.07;}
                    else { return -0.02;}
                }
                break;
            case "Substantial":                 //Boost both effects, at mercy of RNG as to which way it goes
                if(choice == "1"){
                    if(neg){ return 1.25;}
                    else { return 1.05;}
                } else if(choice == "2"){
                    if(neg){ return 1.15;}
                    else { return 1.1;}
                } else if(choice == "3"){
                    if(neg){ return 0.05;}
                    else { return 0.01;}
                }
                break;
            case "Severe":                      //Reduce negative effects slightly, increase positives slightly
                if(choice == "1"){
                    if(neg){ return 1;}
                    else { return 1.15;}
                } else if(choice == "2"){
                    if(neg){ return 0.85;}
                    else { return 1.2;}
                } else if(choice == "3"){
                    if(neg){ return 0.02;}
                    else { return 0.02;}
                }
                break;
            case "Critical":                    //Greatly reduce negative effects, increase positives
                if(choice == "1"){
                    if(neg){ return 0.75;}
                    else { return 1.25;}
                } else if(choice == "2"){
                    if(neg){ return 0.75;}
                    else { return 1.35;}
                } else if(choice == "3"){
                    if(neg){ return 0.01;}
                    else { return 0.05;}
                }
                break;
        }
        return 0;
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

    //Get training event
    public Event getTrainingEvent(){
        //Get event
        Event e = t.getTrainingEvent(getSituation(), negativeMultiplier);
        //DEBUG - Output
        Toast toast1 = Toast.makeText(c, getSituation(), Toast.LENGTH_SHORT);
        toast1.show();
        if(flagUseAi){
            //Predict choice
            String choice = getPrediction(approvalString, budgetString, stabilityString, isNegative, e.getTierAsString());
            modifyEffect(e, choice);

            //DEBUG - Output
            Toast toast2 = Toast.makeText(c, choice, Toast.LENGTH_SHORT);
            toast2.show();
        }
        return e;
    }
}

