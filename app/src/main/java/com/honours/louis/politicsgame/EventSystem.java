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
    private String logFilePath;
    private FileOutputStream outputStream;
    private Context c;

    public EventSystem(Context context, String cn, int gt) {
        c = context.getApplicationContext();
        countryName = cn;
        govType = gt;
        logFilename = Settings.Secure.getString(c.getContentResolver(), Settings.Secure.ANDROID_ID) + "Log";
        pool = new EventPool();
    }

    public void getGameState(double a, double b, double s, int d, int y, int c) {
        approval = a;
        budget = b;
        stability = s;
        day = d;
        year = y;
        choice = c;
        situation = getSituation();
        String state = String.format("%.0f", approval) + "," + String.format("%.0f", budget) + "," + String.format("%.1f", stability) + "," + day + "," + year + "," + situation + "," + choice + "\n";
        log(state);
        new SendToServer().execute(logFilename); //THIS MUST BE MOVED
        lastEventSituation = situation;
    }

    //Write out game state to log - INTERNAL PRIVATE STORAGE
    private void log(String state) {
        try {
            outputStream = c.openFileOutput(logFilename, Context.MODE_APPEND);
            if (this.lastEventSituation == null) {
                outputStream.write(("NEW GAME - Name:" + countryName + " Type:" + String.valueOf(govType) + "\n").getBytes());
            }
            outputStream.write(state.getBytes());
            outputStream.close();
            Toast toast = Toast.makeText(c, "Written to Log", Toast.LENGTH_SHORT);
            toast.show();

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

        String label = "Default";
        int score;

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
            score += 15;
        } else if (approval < 40) {
            score += 5;
        }

        //Budget
        if (budget < 25000) {
            score += 15;
        } else if (budget < 35000) {
            score += 5;
        }

        //Stability
        if (stability < 1.5) {
            score += 15;
        } else if (stability < 2) {
            score += 5;
        }

        if (lastEventSituation != null) {
            //Add a percentage of the score depending on the last events label
            switch (lastEventSituation) {
                case "Low":
                    score += (score / 100 * 1);
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

    /*
    ---------- Training Events Suite ----------
     */
    public Event getTrainingEvent() {
        //Create an event for training
        //Random positive and negative values in a boundary for each choice
        double[] dis;
        double[] norm;
        double[] ext;

        //Ensure choices will have at least 1 positive and negative
        dis = makeSense(getEffects(1), 1);
        norm = makeSense(getEffects(2), 2);
        ext = makeSense(getEffects(3), 3);

        EventElement a = new EventElement("Training Event", "Dismissive", dis, "Object");
        EventElement b = new EventElement("Created by", "Normal", norm, "Context");
        EventElement c = new EventElement("getTrainingEvent()", "Extreme", ext, "Subject");

        Event e = new Event(a, b, c);

        return e;
    }

    private double[] getEffects(int choice) {
        double[] effects = new double[3];
        effects[0] = getRandomValue("approval", choice);
        effects[1] = getRandomValue("budget", choice);
        effects[2] = getRandomValue("stability", choice);

        return effects;
    }

    //Ensure there is at least 1 positive or Negative effect in each choice
    private double[] makeSense(double[] effects, int choice) {
        int posCount = 0;
        int index;
        boolean zero = false;
        int zeroIndex = -1;

        if (isEmpty(effects)) {
            effects = makeSense(getEffects(choice), choice);
        }

        //Iterate
        for (int i = 0; i < 3; i++) {
            if (effects[i] > 0) {
                //Count Positives
                posCount++;
            } else if (effects[i] == 0) {
                //Account for 0
                zero = true;
                zeroIndex = i;
            }
        }

        if (posCount == 3) { //3 Positives
            //Make 1 random index negative
            effects[index = new Random().nextInt(2)] = -effects[index];
        } else if (posCount == 0) { //3 Negatives
            //Make 1 random index positive
            effects[index = new Random().nextInt(2)] = Math.abs(effects[index]);
        }

        if (zero && posCount == 2) { //2 Positives Only
            //Make 1 non zero index negative
            index = randomIndex(zeroIndex);
            effects[index] = -effects[index];

        } else if (zero && posCount == 0) { //2 Negatives Only
            //Make 1 non zero index positive
            index = randomIndex(zeroIndex);
            effects[index] = Math.abs(effects[index]);
        }
        return effects;
    }

    private int randomIndex(int exclude) {
        int i = ThreadLocalRandom.current().nextInt(0, 2);
        if (i == exclude)
            i = randomIndex(exclude);
        return i;
    }

    //Ensure the effects of a choice are not empty
    private boolean isEmpty(double[] effects) {
        int zeroCount = 0;

        for (int i = 0; i < 3; i++) {
            if (effects[i] == 0) {
                zeroCount++;
            }
        }

        if (zeroCount == 2 | zeroCount == 3) {
            return true;
        }
        return false;
    }

    //Get random value for Training events
    private double getRandomValue(String resource, int choice) {

        double i = 0;

        if (choice == 1) {
            if (resource == "approval")
                i = ThreadLocalRandom.current().nextInt(0, 5);

            if (resource == "budget")
                i = ThreadLocalRandom.current().nextInt(0, 5000);

            if (resource == "stability")
                i = ThreadLocalRandom.current().nextDouble(0.1, 0.3);

        } else if (choice == 2) {
            if (resource == "approval")
                i = ThreadLocalRandom.current().nextInt(5, 10);

            if (resource == "budget")
                i = ThreadLocalRandom.current().nextInt(5000, 10000);

            if (resource == "stability")
                i = ThreadLocalRandom.current().nextDouble(0.3, 0.8);

        } else if (choice == 3) {
            if (resource == "approval")
                i = ThreadLocalRandom.current().nextInt(10, 15);

            if (resource == "budget")
                i = ThreadLocalRandom.current().nextInt(10000, 15000);

            if (resource == "stability")
                i = ThreadLocalRandom.current().nextDouble(0.8, 1);
        }

        //Chance to be -
        if (ThreadLocalRandom.current().nextInt(1, 10) < 6) {
            i = -i;
        } else {
            //Reduce positive effects
            i = i / 2;
        }
        //Chance to be 0
        if (ThreadLocalRandom.current().nextInt(1, 6) < 3) {
            i = 0;
        }

        return i;
    }
    /*
    ---------- END Training Events ----------
     */

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
    //Working 28/03/2018
    //Uploads to 000webhost server via FTP
    //Apache Commons Net Jar provides FTP Client functionality
    private class SendToServer extends AsyncTask<String, Void, String> {

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

