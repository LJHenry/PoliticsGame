package com.honours.louis.politicsgame;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Questionnaire, sends the data to the server from log.
 * Created by Louis Henry.
 */

public class QActivity extends AppCompatActivity implements View.OnClickListener {

    //Elements
    SeekBar q1;
    SeekBar q2;
    Switch q3;
    Switch q4;
    Spinner q5Spinner;
    Button submit;

    //Answers
    int answer1;
    int answer2;
    String answer3;
    String answer4;
    String answer5;

    //Log file
    String logFilename;
    String logContent;

    private boolean winOrLoss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q);

        //Seek bars - Q1 Q2
        q1 = findViewById(R.id.seekBarQ1);
        q2 = findViewById(R.id.seekBarQ2);

        //Switches - Q3 Q4
        q3 = findViewById(R.id.switchQ3);
        q4 = findViewById(R.id.switchQ4);
        answer3 = "no";
        answer4 = "no";

        //Spinner - Q5
        q5Spinner = findViewById(R.id.spinnerQ5);
        ArrayAdapter<CharSequence> q5SpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.age, android.R.layout.simple_spinner_item);
        q5SpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        q5Spinner.setAdapter(q5SpinnerAdapter);

        //Button
        submit = findViewById(R.id.buttonSubmitQuestionnaire);
        submit.setOnClickListener(this);

        //Win Loss
        winOrLoss = getIntent().getBooleanExtra("WinLoss", false);

        logFilename = FirebaseInstanceId.getInstance().getId() + "-Log";
    }

    //Send data to server then return to menu
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.buttonSubmitQuestionnaire:
                //Prompt confirmation
                DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int c) {
                        switch (c) {
                            case DialogInterface.BUTTON_POSITIVE:
                                //Log answers
                                log(getAnswers());
                                //Get log content
                                logContent = getLog(getApplicationContext(), logFilename);
                                //Send game data to server
                                new SendToServer().execute(logFilename, logContent);
                                //Return to main menu

                                break;
                            case DialogInterface.BUTTON_NEGATIVE:

                                //Do nothing
                                break;
                        }
                    }
                };

                AlertDialog.Builder b = new AlertDialog.Builder(this);
                b.setMessage("Are these your final answers? Your game data and answers will now be sent for evaluation.").setPositiveButton("Yes", dialogClickListener).setNegativeButton("No", dialogClickListener).show();

                break;
        }
    }

    //Handle back button
    @Override
    public void onBackPressed(){
        //Alert dialogue
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int c) {
                switch (c) {
                    case DialogInterface.BUTTON_NEUTRAL:
                        //Stay in activity
                        break;
                }
            }
        };

        android.support.v7.app.AlertDialog.Builder b = new android.support.v7.app.AlertDialog.Builder(this);
        b.setMessage("Please fill out the questionnaire. If you exit now no evaluation data will be sent.").setNeutralButton("Okay", dialogClickListener).show();
    }

    private String getAnswers(){
        //SeekBar index 0-4 so add 1 to get 1-5
        answer1 = q1.getProgress() + 1;
        answer2 = q2.getProgress() + 1;
        //Switch
        if(q3.isChecked()){
            answer3 = "yes";
        }
        if(q4.isChecked()){
            answer4 = "yes";
        }
        //Spinner
        answer5 = q5Spinner.getSelectedItem().toString();

        //Win
        String w;
        if(winOrLoss){
            w = "Win";
        } else {
            w = "Loss";
        }

        return "Game:" + w + " Evaluation Answers --- Q1:" + String.valueOf(answer1) + " Q2:" + String.valueOf(answer2) + " Q3:" + answer3 + " Q4:" + answer4 + " Q5:" + answer5 + "." + "\n";
    }

    //Get the log file as string
    public String getLog(Context context, String filename) {
        try {
            FileInputStream fis = context.openFileInput(filename);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            return sb.toString();
        } catch (FileNotFoundException e) {
            return "";
        } catch (UnsupportedEncodingException e) {
            return "";
        } catch (IOException e) {
            return "";
        }
    }

    //Write out answers to log - INTERNAL PRIVATE STORAGE
    private void log(String answers) {
        FileOutputStream outputStream;
        try {
            outputStream = getApplicationContext().openFileOutput(logFilename, Context.MODE_APPEND);
            outputStream.write(answers.getBytes());
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Clear Log
    private void deleteLog(){
        getApplicationContext().deleteFile(logFilename);
    }

    //Finish the activity once the data is sent
    private void finishAfterSend(){
        //Delete log file
        deleteLog();
        //Finish
        this.finish();
    }

    // ----- UPLOAD LOG FILE -----
    private class SendToServer extends AsyncTask<String, Void, String> {

        ProgressDialog progress;

        @Override
        protected void onPreExecute() {
            progress = new ProgressDialog(QActivity.this);
            progress.setMessage("Sending... (Server may be slow. Please Wait.)");
            progress.setCancelable(false);
            progress.show();
        }

        //Uploads to Hostinger database
        protected String doInBackground(String... params) {
            HttpURLConnection con;
            try {
                //URL
                String s = "http://www.politicsgame.xyz/upload.php";
                URL url = new URL(s);
                //Connection
                con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("POST");
                //Timeout
                con.setReadTimeout(20000);
                con.setConnectTimeout(20000);
                //Input
                con.setDoInput(true);
                con.setDoOutput(true);

                //Parameters - encoding applied
                Uri.Builder builder = new Uri.Builder().appendQueryParameter("user", logFilename).appendQueryParameter("log", logContent);
                String query = builder.build().getEncodedQuery();

                //Write log details to server, upload.php
                OutputStream os = con.getOutputStream();
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(os, "UTF-8"));
                writer.write(query);
                writer.flush();
                writer.close();
                os.close();

                System.out.println("SERVER RESPONSE: " + con.getResponseCode());

                //Connect
                con.connect();
            } catch (Exception e) {
                //Nothing
                System.out.println("SEND TO SERVER ERROR: " + e.getMessage());
            }

            return "Done";
        }

        @Override
        protected void onPostExecute(String s) {
            //Cancel progress dialog
            progress.cancel();
            //Call onFinish from Activity
            finishAfterSend();
        }
    }
}
