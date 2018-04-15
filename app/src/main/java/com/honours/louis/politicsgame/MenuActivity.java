package com.honours.louis.politicsgame;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Main Menu.
 * Created by Louis Henry on 06/02/2018.
 */

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    Button bPlay, bHelp, bInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Buttons
        bPlay = findViewById(R.id.buttonPlay);
        bHelp = findViewById(R.id.buttonHelp);
        bInfo = findViewById(R.id.buttonInfo);
        //Event Listeners
        bPlay.setOnClickListener(this);
        bHelp.setOnClickListener(this);
        bInfo.setOnClickListener(this);

    }

    //onClick Event
    @Override
    public void onClick(View v){
        //Switch case for buttons
        switch (v.getId()) {
            case R.id.buttonPlay:
                //Get user confirmation that app will record and send data
                DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int c) {
                        switch (c) {
                            case DialogInterface.BUTTON_NEUTRAL:
                                //Begin Game with Setup
                                Intent i = new Intent(MenuActivity.this, SetupActivity.class);
                                startActivity(i);
                                break;
                        }
                    }
                };
                //Show dialog
                AlertDialog.Builder b = new AlertDialog.Builder(this);
                b.setMessage("Please ensure you are connected to the internet while playing this game. By continuing to use this application, you consent to send anonymous gameplay and evaluation data (including age) to a server for the purpose of academic research. This data will not be shared. If you require more information please consult the project information page from the main menu.").setNeutralButton("Okay", dialogClickListener).show();
                break;
            case R.id.buttonHelp:
                //Game Help Page
                Intent j = new Intent(MenuActivity.this, HelpActivity.class);
                startActivity(j);
                break;
            case R.id.buttonInfo:
                //Project Information Page
                Intent l = new Intent(MenuActivity.this, InfoActivity.class);
                startActivity(l);
                break;
        }
    }

}
