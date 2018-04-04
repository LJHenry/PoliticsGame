package com.honours.louis.politicsgame;

import android.content.Context;
import android.os.AsyncTask;
import android.provider.Settings;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * System will take game parameters and produce a suitable event.
 * Will be manipulated by the AI.
 * Created by Louis Henry.
 */

public class EventSystem {

    private String countryName;
    private int govType;
    private String engagement;
    private double approval;
    private double budget;
    private double stability;
    private int day;
    private int year;
    private String situation;
    private int choice;
    private String lastSituation;
    private String lastEffects;
    private String isNegative;
    //Event Pool
    private EventPool pool;
    //Log File
    private String logFilename; //Will use devices Android id - unique and recommended secure ID method by Google
    private Context c;
    //AI Training
    private TrainingSuite t;

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
        //////////////
        deleteLog();
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
        situation = getSituation();
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


    //Write out game state to log - INTERNAL PRIVATE STORAGE
    private void log(String state) {
        FileOutputStream outputStream;
        try {
            outputStream = c.openFileOutput(logFilename, Context.MODE_APPEND);
            if (lastSituation == null) {
                outputStream.write(("NEW GAME - Name:" + countryName + " Type:" + String.valueOf(govType) + " Engagement:" + engagement + "\n").getBytes());
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
        Event e = t.getTrainingEvent();
        //lastEffects = getEffectsPercent(e);
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
    private String getEffectsPercent(Event e){
        double a; double b; double s;
        a = (e.getEffectA()/100) * 100;
        b = (e.getEffectB()/100000) * 100;
        s = (e.getEffectS()/5) * 100;
        return String.format("%.1f", a) + "," + String.format("%.1f", b) + "," + String.format("%.1f", s);
    }

    //Difficulty modifier
    //Run event through AI choice prediction
    //Given prediction modify numbers
    //Aim to change the choice made

    //---Dynamic Generation---
    //Look up keyword table
    //Find compatible Object, Context and Subject
    //Get choice effects
    //Check against label
    //Apply modifier based on game state
}

