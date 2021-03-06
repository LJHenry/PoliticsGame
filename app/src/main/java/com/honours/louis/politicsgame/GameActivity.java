package com.honours.louis.politicsgame;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

/**
 * The game. Runs a loop wrapped in a count down timer. Loop interrupted
 * when game end is met or loss conditions met.
 * Created by Louis Henry.
 */

public class GameActivity extends AppCompatActivity {

    //Training mode, uses percentages for easier choice making
    boolean training = false;
    //Set the use of AI or not here
    boolean useAI = true;

    //Game loop
    private boolean gameOver;
    private boolean paused;

    //TextViews
    private TextView dateText;
    private TextView appText;
    private TextView budText;
    private TextView stabText;
    private TextView textEffect;
    private TextView eventText;
    private TextView choiceText;

    //Progress bar for in game date
    private ProgressBar dateBar;

    //Resource variables
    private double approval; //0 to 100, a percentage
    private double budget; //Large number
    private double stability; //Level from 0 to 5
    //Subtract/add a fraction of choice effects over time
    private boolean changes;
    private double resourceChange;
    private String changedResource;

    //Country Details
    private String countryName;
    private int govType;
    //Bonus variables
    private double appBonus;
    private double budBonus;
    private double stabBonus;

    //Date variables
    private int day;
    private int month;
    private int year;
    private int dayTotal; //For progress bar

    //Event variables
    private int eventCounter;
    private boolean eventLock;
    private int choiceNumber;
    private String eventName;
    private boolean election;
    //Event dialog objects
    private AlertDialog.Builder eventAlertBuilder;
    private AlertDialog eventDialog;
    //Event System Object
    private EventSystem eventSystem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Get extras from intent
        countryName = getIntent().getStringExtra("Name");
        govType = getIntent().getIntExtra("Type", 0);

        //Views
        //Country name
        TextView textName = findViewById(R.id.textCoName);
        textName.setText(countryName);
        //Date
        dateText = findViewById(R.id.textDate);
        dateBar = findViewById(R.id.progressBarDate);
        //Resources
        appText = findViewById(R.id.textAppr);
        budText = findViewById(R.id.textBudg);
        stabText = findViewById(R.id.textStab);
        //Event
        eventText = findViewById(R.id.textLastEvent);
        choiceText = findViewById(R.id.textLastChoice);
        //Effect
        textEffect = findViewById(R.id.textEffect);

        //Begin
        setup(getIntent().getIntArrayExtra("Bonuses"));
        gameOver = false;
    }

    //Set necessary parameters before game start, takes bonuses as argument
    private void setup(int[] bonuses){
        //Set date
        day = 1; dayTotal = 1; month = 1; year = 1;

        //Determine bonuses from government type
        appBonus = bonuses[0];
        budBonus = bonuses[1];
        stabBonus = bonuses[2];

        appBonus = appBonus * 5;
        budBonus = budBonus * 1000;
        stabBonus = stabBonus / 10;

        //Set Starting Resources - 50%
        approval += appBonus + 50;
        budget += budBonus += 50000;
        stability = stabBonus += 2.5;

        //Events
        eventSystem = new EventSystem(getApplicationContext(), countryName, govType, getIntent().getStringExtra("Engagement"), useAI);
        eventCounter = 0;
        eventLock = true;
        eventAlertBuilder = new AlertDialog.Builder(GameActivity.this);

        //Start game loop
        paused = false;
        gameLoop();
    }

    //Game loop
    private void gameLoop() {
        //Begin game loop with timer, Current: 1 day = 0.1 sec
        new CountDownTimer(86400000, 100) {
            //Per Tick - 1 year = 360 days = 1800 ticks
            public void onTick(long millisUntilFinished) {
                //Check if paused
                if(paused){
                    //Don't progress
                } else {
                    //Check win condition
                    if(gameOver){
                        this.onFinish();
                    } else {
                        //---------------- Process
                        Event e;
                        //Resources - must occur before eventCheck
                        resourceTick();
                        //If Game Start
                        if(year == 1 && month == 1 && ((day == 4) | (day == 6) | (day == 8))) {
                            //3 Introductory Events
                            e = intro();
                            showEvent(e);
                        } else if(eventCheck()){
                            //Event
                            e = getEvent();
                            showEvent(e);
                        }
                        //---------------- Update
                        updateTime();
                        //---------------- Draw
                        draw();
                    }
                }
            }
            public void onFinish() {
                //End
                this.cancel();
                endGame();
            }
        }.start();
    }

    //Conditions for Winning the election
    private boolean elected(){
        //Use score to calculate
        if(getScore() >= 4){
            return true;
        }
        return false;
    }

    //Get score based on resources
    private double getScore(){
        double score = 0;

        //Approval
        if(approval <= 35){
            score += 0;
        } else if(approval >= 35 && approval <= 45){
            score += 1.5;
        } else if(approval > 45){
            score+= 2;
        }

        //Budget
        if(budget < 15000){
            score += 0;
        } else if(budget >= 15000 && budget <= 35000){
            score += 1.5;
        } else if(budget > 35000){
            score += 2;
        }

        //Stability
        if(stability < 1.75){
            score += 0;
        } else if(stability >= 1.75 && stability <= 2.5){
            score += 1.5;
        } else if(stability > 2.5) {
            score += 2;
        }

        return score;
    }

    //Advance in game time
    private void updateTime() {
        //Check Day
        if(day == 30){
            //Check Month
            if(month == 12){
                //Increment Year
                year++; month = 1; day = 1; dayTotal = 1;
            } else {
                //Increment Month
                month++; day = 1; dayTotal++;
            }
        } else {
            //Increment Day
            day++; dayTotal++;
        }
    }

    //Update UI
    private void draw(){
        //Date
        dateBar.setProgress(dayTotal);
        dateBar.invalidate();
        dateText.setText(" Month:" + month + " Year:" + year);
        //Resources
        if(training){
            appText.setText(String.format("%.2f", (approval/100) * 100) + "%");
            budText.setText(String.format("%.2f", (budget/100000) * 100)  + "%");
            stabText.setText(String.format("%.2f", (stability/5) * 100)  + "%");
        } else {
            appText.setText(String.format("%.0f", approval) + "%");
            budText.setText("£" + String.format("%.0f", budget));
            stabText.setText(String.format("%.2f", stability));
        }


    }

    //Change resources
    private void changeResources(double effect, String resource){
        //Clean existing
        resourceChange = 0;
        //Set resource to be changed
        changedResource = resource;

        //If no election
        if(!election) {
            //Spread changes out over 30 ticks
            resourceChange = effect / 30;

            changes = true;
        } else if (election){
            //Change resources absolutely
            resourceChange = effect;
            resourceChunk();

            changes = false;
        }
    }

    //Change resources per tick, if one reaches 0 game over
    private void resourceTick(){
        if(changes) {
            switch(changedResource){
                case "Approval":
                    //Approval - Don't go below 0, above 100
                    approval += resourceChange;
                    if (approval > 100) {
                        approval = 100;
                    }
                    if (approval < 0) {
                        approval = 0;
                        gameOver = true;
                    }
                    break;

                case "Budget":
                    //Budget - Don't go below 0, above 100000
                    budget += resourceChange;
                    if(budget > 100000){
                        budget = 100000;
                    }
                    if (budget < 0) {
                        budget = 0;
                        gameOver = true;
                    }
                    break;

                case "Stability":
                    //Stability - Don't go below 0, above 5
                    stability += resourceChange;
                    if (stability > 5) {
                        stability = 5;
                    }
                    if (stability < 0) {
                        stability = 0;
                        gameOver = true;
                    }
                    break;
            }
        }
    }

    //Change resources at once, check for 0
    private void resourceChunk(){
        switch(changedResource){
            case "Approval":
                approval += resourceChange;
                if (approval > 100) {
                    approval = 100;
                }
                if (approval < 0) {
                    approval = 0;
                    gameOver = true;
                }
                break;

            case "Budget":
                //Budget - Don't go below 0
                budget += resourceChange;
                if (budget < 0) {
                    budget = 0;
                    gameOver = true;
                }
                break;

            case "Stability":
                //Stability - Don't go over 5, under 0
                stability += resourceChange;
                if (stability > 5) {
                    stability = 5;
                }
                if (stability < 0) {
                    stability = 0;
                    gameOver = true;
                }
                break;
        }
    }

    //Check for events
    private boolean eventCheck(){
        //Start of Election Events
        if (dayTotal == 250 && year == 4) {
            election = true;
        } else if (dayTotal == 359 && year == 4){
            //End of Game
            Toast toast = Toast.makeText(getApplicationContext(), "Game Finished", Toast.LENGTH_SHORT);
            toast.show();
            gameOver = true;
        }

        if(election){
            //Election override
            if(timeCheck()){
                return true;
            } else {
                return false;
            }
        } else if (eventLock){
            eventCounter++;
            //30 ticks after last event - then % chance to happen every tick
            if(eventCounter >= 30) {
                //After 30 ticks turn event lock and resource changes off
                eventLock = false;
                changes = false;
                eventCounter = 0;
                //Recursive call to ensure 1st tick isn't skipped
                eventCheck();
            }
        } else {
            //Event - 1/40 chance of happening
            if(new Random().nextInt(40)==0){
                //Apply event lock
                eventLock = true;
                return true;
            }
        }
        return false;
    }

    //Get an Event
    private Event getEvent(){
        Event e;
        //Scripted event name
        String name = eventName;

        if (name == null){
            //Normal Event
            //Random event
            e = eventSystem.findEvent("None", true);
        } else {
            //Get Pre-made Event Using Name, Override Event lock
            e = eventSystem.findEvent(name, false);
            eventName = null;
        }

        return e;
    }

    //Fire events at certain time
    private boolean timeCheck(){
        //Election Events
        if (dayTotal == 290 && year ==  4){
            eventName = "BeginCampaign";
            return true;
        } else if (dayTotal == 302 && year == 4){
            eventName = "OppositionCampaign";
            return true;
        } else if (dayTotal == 280 && year == 4){
            eventName = "ElectionWarning";
            System.out.println(eventName);
            return true;
        } else if (dayTotal == 320 && year == 4){
            eventName = "ElectionProgress";
            return true;
        } else if (dayTotal == 335 && year == 4){
            eventName = "ElectionTwist";
            return true;
        //} else if (dayTotal == 345 && year == 4 && approval <= 30){
            //eventName = "ElectionLosing";
            //return true;
        } else if (dayTotal == 355 && year == 4){
            eventName = "ElectionClose";
            return true;
        }
        return false;
    }

    //Show selected event
    private void showEvent(Event e){
        //Pause game loop
        paused = true;
        //Show event
        eventPopup(e);
    }

    //Event popup
    private void eventPopup(final Event e){
        //Event Alert Dialog Popup
        View eView = getLayoutInflater().inflate(R.layout.dialog_choices, null);
        //Text
        TextView title = eView.findViewById(R.id.EventTitle);

        //Approval
        TextView c1App = eView.findViewById(R.id.c1App);
        //Budget
        TextView c2Bud = eView.findViewById(R.id.c2Bud);
        //Stability
        TextView c3Stab = eView.findViewById(R.id.c3Stab);
        //Button
        Button button1 = eView.findViewById(R.id.button1);
        Button button2 = eView.findViewById(R.id.button2);
        Button button3 = eView.findViewById(R.id.button3);

        //Set text view text
        title.setText(e.getEventTitle());

        if(training){
            //Output effects as a percentage
            double a; double b; double s;
            a = (e.getEffectA()/100) * 100;
            b = (e.getEffectB()/100000) * 100;
            s = (e.getEffectS()/5) * 100;
            //Approval
            c1App.setText(String.format("%.2f", a) + "%");
            //Budget
            c2Bud.setText(String.format("%.2f", b) + "%");
            //Stability
            c3Stab.setText(String.format("%.2f", s)+ "%");
        } else {
            //Approval
            c1App.setText(String.format("%.0f", e.getEffectA()) + "%");
            //Budget, must account for £ sign
            double bud = e.getEffectB();
            if (bud < 0){
                bud = Math.abs(bud);
                c2Bud.setText("-£" + String.format("%.0f", bud));
            } else {
                c2Bud.setText("£" + String.format("%.0f", e.getEffectB()));
            }
            //Stability
            c3Stab.setText(String.format("%.2f",e.getEffectS()));
        }

        //Set Button Text
        button1.setText(e.getChoiceA());
        button2.setText(e.getChoiceB());
        button3.setText(e.getChoiceS());

        choiceNumber = 0;

        //Set choice, resume time, dismiss dialog, log game state, get choice effects

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choiceNumber = 1;
                paused = false;
                eventDialog.dismiss();
                eventSystem.getGameState(approval, budget, stability, choiceNumber, e.isNegative(), e.getTierAsString());
                getChoice(e);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choiceNumber = 2;
                paused = false;
                eventDialog.dismiss();
                eventSystem.getGameState(approval, budget, stability, choiceNumber, e.isNegative(), e.getTierAsString());
                getChoice(e);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choiceNumber = 3;
                paused = false;
                eventDialog.dismiss();
                eventSystem.getGameState(approval, budget, stability, choiceNumber, e.isNegative(), e.getTierAsString());
                getChoice(e);
            }
        });

        //Create Dialog
        eventAlertBuilder.setView(eView);
        eventDialog = eventAlertBuilder.create();
        eventDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //Prevent Dismissal
        eventDialog.setCanceledOnTouchOutside(false);
        eventDialog.setCancelable(false);
        //Get window
        Window w = eventDialog.getWindow();
        WindowManager.LayoutParams wlp = w.getAttributes();
        //Set lower than centre so resources can always be seen
        wlp.y = 150;
        w.setAttributes(wlp);
        //Show
        eventDialog.show();
    }

    //Apply choice
    private void getChoice(Event e) {
        //Approval
        if (choiceNumber == 1) {
            changeResources(e.getEffectA(), "Approval");
            choiceText.setText(e.getChoiceA());
            textEffect.setTextColor(Color.parseColor("#cf1313"));
            textEffect.setText(String.format("%.0f", e.getEffectA()));
            choiceNumber = 0;

        //Budget
        } else if (choiceNumber == 2) {
            changeResources(e.getEffectB(), "Budget");
            choiceText.setText(e.getChoiceB());
            textEffect.setTextColor(Color.parseColor("#7cd175"));
            textEffect.setText(String.format("%.0f", e.getEffectB()));
            choiceNumber = 0;

        //Stability
        } else if (choiceNumber == 3) {
            changeResources(e.getEffectS(), "Stability");
            choiceText.setText(e.getChoiceS());
            textEffect.setTextColor(Color.parseColor("#019acc"));
            textEffect.setText(String.format("%.2f", e.getEffectS()));
            choiceNumber = 0;

        } else {
            //Error
        }

        //Show event title
        eventText.setText(e.getEventTitle());
    }

    //Special Intro Events
    private Event intro(){
        Event e = new Event();

        if(day == 4){
            e = eventSystem.findEvent("GameStart", false);
        } else if (day == 6){
            e = eventSystem.findEvent("Example", false);
        } else if (day == 8) {
            e = eventSystem.findEvent("Resources", false);
        }

        return e;
    }

    //Handle back button
    @Override
    public void onBackPressed(){
        paused = true;
        //Confirmation dialogue
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int c) {
                switch (c) {
                    case DialogInterface.BUTTON_POSITIVE:
                        //Send to questionnaire
                        Intent i = new Intent(GameActivity.this, QActivity.class);
                        GameActivity.super.onBackPressed();
                        startActivity(i);
                        break;
                    case DialogInterface.BUTTON_NEGATIVE:
                        //Do nothing
                        paused = false;
                        break;
                }
            }
        };

        android.support.v7.app.AlertDialog.Builder b = new android.support.v7.app.AlertDialog.Builder(this);
        b.setMessage("End the game? You will be taken to the evaluation questionnaire?").setPositiveButton("Yes", dialogClickListener).setNegativeButton("No", dialogClickListener).show();
    }

    //Go to finish screen
    public void endGame(){
        //Start Finish activity with win or loss
        Intent i = new Intent(GameActivity.this, FinishActivity.class);
        i.putExtra("Name", countryName);
        i.putExtra("Approval" , approval);
        i.putExtra("Budget", budget);
        i.putExtra("Stability", stability);
        //Check Win conditions
        if(elected()){
            i.putExtra("Win", true);
        } else {
            i.putExtra("Win", false);
        }


        startActivity(i);
        this.finish();
    }
}
