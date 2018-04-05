package com.honours.louis.politicsgame;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class FinishActivity extends AppCompatActivity implements View.OnClickListener {

    TextView winLoss;
    TextView approval;
    TextView budget;
    TextView stability;
    TextView description;

    double a;
    double b;
    double s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        //Button
        Button question = findViewById(R.id.buttonQ);
        question.setOnClickListener(this);

        //TextViews
        winLoss = findViewById(R.id.textWinLose);
        approval = findViewById(R.id.textApprovalLeft);
        budget = findViewById(R.id.textBudgetLeft);
        stability = findViewById(R.id.textStabilityLeft);
        description = findViewById(R.id.textGameDescription);

        a = getIntent().getDoubleExtra("Approval", 0);
        b = getIntent().getDoubleExtra("Budget", 0);
        s = getIntent().getDoubleExtra("Stability", 0);

        setValues();
    }

    //Set values from intent
    private void setValues(){
        if(getIntent().getBooleanExtra("Win", false)){
            winLoss.setText("You Win!");
            winLoss.setTextColor(Color.parseColor("#019acc"));
            getDescription(true);
        } else {
            winLoss.setText("You Lose!");
            winLoss.setTextColor(Color.parseColor("#cf1313"));
            getDescription(false);
        }

        approval.setText((String.format("%.0f", a)));
        budget.setText((String.format("%.0f", b)));
        stability.setText((String.format("%.1f", s)));
    }

    private void getDescription(boolean win){
        if(win){
            description.setText("Congratulations! You were re-elected. The election was " + getConditions());
        } else {
            if(a < 40) {
                description.setText(" Your approval rating was low. The public was unhappy.");
            }
            if(b < 20000) {
                description.append(" You ran the budget into the ground. There was no more money.");
            }
            if(s < 2){
                description.append(" Your government became too unstable. Your own party wanted to oust you.");
            }
        }
    }

    private String getConditions(){
        if(a > 60 && s > 4 && b > 35000){
            return "a landslide victory!";
        } else if(a < 60 && a > 45 && s > 2.5 && b >= 20000){
            return "hard fought and well won.";
        }
        return "very close. You won the battles for votes in key areas.";
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.buttonQ:
                //Start Questionnaire Activity
                Intent i = new Intent(FinishActivity.this, QActivity.class);
                startActivity(i);
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
        b.setMessage("Please proceed to the questionnaire. If you exit now no evaluation data will be sent.").setNeutralButton("Okay", dialogClickListener).show();
    }
}
