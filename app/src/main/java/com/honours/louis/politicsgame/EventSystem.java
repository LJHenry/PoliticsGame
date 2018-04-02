package com.honours.louis.politicsgame;

import android.content.Context;
import android.os.AsyncTask;
import android.provider.Settings;
import android.util.Log;
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
    private double approval;
    private double budget;
    private double stability;
    private int day;
    private int year;
    private String situation;
    private int choice;
    private String lastEventSituation;
    private EventPool pool;
    //Log File
    private String logFilename; //Will use devices Android id - unique and recommended secure ID method by Google
    private Context c;
    //AI Training
    public TrainingSuite t;

    public EventSystem(Context context, String cn, int gt) {
        c = context.getApplicationContext();
        countryName = cn;
        govType = gt;
        logFilename = Settings.Secure.getString(c.getContentResolver(), Settings.Secure.ANDROID_ID) + "_Log";
        pool = new EventPool();
        t = new TrainingSuite();
    }

    public void getGameState(double a, double b, double s, int d, int y, int c) {
        approval = a;
        budget = b;
        stability = s;
        //day = d;
        //year = y;
        choice = c;
        situation = getSituation();
        String state = getResourceState() + "," + situation + "," + choice + "\n"; //+ day + "," + year + ","
        log(state);
        new SendToServer().execute(logFilename);
        lastEventSituation = situation;
    }

    //Use keywords High, Medium and Low for resource levels
    private String getResourceState(){

        String a = "Default";
        if(approval >= 50){
            //High
            a = "High";
        } else if(approval < 50 && approval >= 40){
            //Medium
            a = "Medium";
        } else if(approval < 40){
            //Low
            a = "Low";
        }

        String b = "Default";
        if(budget >= 40000){
            //High
            b = "High";
        } else if(budget < 40000 && budget >= 30000){
            //Medium
            b = "Medium";
        } else if(budget < 30000){
            //Low
            b = "Low";
        }

        String s = "Default";
        if(stability >= 3.5){
            //High
            s = "High";
        } else if(stability < 3.5 && stability >= 2){
            //Medium
            s = "Medium";
        } else if(stability < 2){
            //Low
            s = "Low";
        }

        return a + "," + b + "," + s;
    }

    //Write out game state to log - INTERNAL PRIVATE STORAGE
    private void log(String state) {
        FileOutputStream outputStream;
        try {
            outputStream = c.openFileOutput(logFilename, Context.MODE_APPEND);
            if (this.lastEventSituation == null) {
                outputStream.write(("NEW GAME - Name:" + countryName + " Type:" + String.valueOf(govType) + "\n").getBytes());
            }
            outputStream.write(state.getBytes());
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Get a new event
    public void getNewEvent(double a, double b, double s, int d, int y, String l) {
        //Get game state
        approval = a;
        budget = b;
        stability = s;
        day = d;
        year = y;
        lastEventSituation = l;

        //String label = getSituation();

        //Do relevant stuff
    }

    //Get premade event from pools
    public Event getPremadeEvent(String label, boolean random) {

        if (random) {
            //Pool B - Random
            return pool.getEvent();
        } else {
            //Pool A - Scripted
            //Time based events (game start, election)
            switch (label) {
                case "GameStart":
                    //Welcome
                    return pool.getEventByName(label);
                case "Example":
                    //Event Example
                    return pool.getEventByName(label);
                case "Resources":
                    //Resources Description
                    return pool.getEventByName(label);
                case "ElectionWarning":
                    //Election Primer Event
                    return pool.getEventByName(label);
                case "BeginCampaign":
                    //Start of Campaign
                    return pool.getEventByName(label);
                case "OppositionCampaign":
                    //opposition start Campaign
                    return pool.getEventByName(label);
                case "ElectionProgress":
                    //Election Progresses
                    return pool.getEventByName(label);
                case "ElectionTwist":
                    //Twist in Election
                    return pool.getEventByName(label);
                case "ElectionLoosing":
                    //Player is likely to loose
                    return pool.getEventByName(label);
                case "ElectionClose":
                    //Election is about to occur
                    return pool.getEventByName(label);
                default:
                    break;
            }

            //Election
            //Starter

            //Campaign Events

            //Getting closer Event

            //Last Ditch

            //Election

        }
        return null;
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

        if (lastEventSituation != null) {
            //Add a percentage of the score depending on the last events label
            switch (lastEventSituation) {
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

    // ----- UPLOAD LOG FILE -----
    private static class SendToServer extends AsyncTask<String, Void, String> {

        //Uploads to 000webhost server via FTP
        //Apache Commons Net Jar provides FTP Client functionality
        protected String doInBackground(String... params) {

            String filename = params[0];
            FTPClient con;

            try {
                con = new FTPClient();
                con.connect("files.000webhost.com");

                if (con.login("politicsgamedatabase", "qq6k^7x5WbVOPcw!zL)O")) {
                    con.enterLocalPassiveMode(); // Important!
                    con.setFileType(FTP.BINARY_FILE_TYPE);
                    File data = new File("data/data/com.honours.louis.politicsgame/files/" + filename);
                    FileInputStream in = new FileInputStream(data);
                    boolean result = con.storeFile(filename, in);
                    in.close();
                    if (result) Log.v("Log File Upload", "Success");
                    con.logout();
                    con.disconnect();
                    return "Success";
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "Failure";
        }

        protected void onPostExecute() {
            //Must be Implemented
        }
    }
}

