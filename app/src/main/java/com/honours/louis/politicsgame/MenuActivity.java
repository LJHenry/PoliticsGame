package com.honours.louis.politicsgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
                //Begin Game with Setup
                Intent i = new Intent(MenuActivity.this, SetupActivity.class);
                startActivity(i);
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
