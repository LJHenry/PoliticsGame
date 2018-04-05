package com.honours.louis.politicsgame;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

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

    //Name of log file
    String logFilename;

    private boolean safe;

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

        logFilename = Settings.Secure.getString(getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID) + "_Log";
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
                                //Send game data to server
                                new SendToServer().execute(logFilename);
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

        answer5 = q5Spinner.getSelectedItem().toString();

        return "Evaluation Answers --- Q1: " + String.valueOf(answer1) + " Q2: " + String.valueOf(answer2) + " Q3: " + answer3 + " Q4: " + answer4 + " Q5: " + answer5 + "\n";
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

    //Finish the activity once the data is sent
    private void finishAfterSend(){
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


        //Uploads to Hostinger file server via FTP
        //Apache Commons Net Jar provides FTP Client functionality
        protected String doInBackground(String... params) {

            String filename = params[0];
            FTPClient con;

            try {
                con = new FTPClient();
                con.connect("ftp.politicsgame.xyz");

                if (con.login("u279076413", "uQhL9lfZ8kL6JV")) {
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

        @Override
        protected void onPostExecute(String s) {
            //Cancel progress dialog
            progress.cancel();
            //Call onFinish from Activity
            finishAfterSend();
        }
    }
}
