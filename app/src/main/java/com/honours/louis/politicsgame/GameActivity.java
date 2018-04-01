package com.honours.louis.politicsgame;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GameActivity extends AppCompatActivity {


    //Game loop
    private boolean gameOver;
    private boolean paused;

    //TextViews
    private TextView dateText;
    private TextView appText;
    private TextView budText;
    private TextView stabText;
    private TextView appEffect;
    private TextView budEffect;
    private TextView stabEffect;
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
    private double appChange;
    private double budChange;
    private double stabChange;

    //Country Details
    private String countryName;
    private int govType;
    //Bonus variables
    private int appBonus;
    private int budBonus;
    private int stabBonus;

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
        //Effects
        appEffect = findViewById(R.id.textAppEffect);
        budEffect = findViewById(R.id.textBudEffect);
        stabEffect = findViewById(R.id.textStabEffect);

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
        budBonus = bonuses[1] ;
        stabBonus = bonuses[2];

        //Set Starting Resources
        approval =  50;
        budget = 50000;
        stability = 3;

        //Events
        eventSystem = new EventSystem(getApplicationContext(), countryName, govType);
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
        if(getScore() >= 3){
            return true;
        }
        return false;
    }

    //Get score based on resources
    private int getScore(){
        int score = 0;
        if(approval >= 40){
            score += 1;
        }
        if(budget >= 15000){
            score += 1;
        }
        if(stability >= 3){
            score += 1;
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
        dateText.setText("D:" + day + " M:" + month + " Y:" + year);
        //Resources
        appText.setText(String.format("%.0f", approval) + "%");
        budText.setText("£" + String.format("%.0f", budget));
        stabText.setText(String.format("%.1f", stability));

    }

    //Change resources
    private void changeResources(double[] effects){
        //Clean existing
        appChange = 0;
        budChange = 0;
        stabChange = 0;

        //If no election
        if(!election) {
            //Spread changes out over 30 ticks
            appChange = effects[0] / 30;
            budChange = effects[1] / 30;
            stabChange = effects[2] / 30;
            bonuses();

            changes = true;
        } else if (election){
            //Change resources absolutely
            appChange = effects[0];
            budChange = effects[1];
            stabChange = effects[2];
            bonuses();
            resourceChunk();

            changes = false;
        }
    }

    //Apply bonuses
    private void bonuses(){
        appChange += ((appChange/100) * appBonus);
        budChange += ((budChange/100) * budBonus);
        stabChange += ((stabChange/100) * stabBonus);
    }

    //Change resources per tick, if one reaches 0 game over
    private void resourceTick(){
        if(changes) {
            approval += appChange;
            if (approval > 100) {
                approval = 100;
            }
            if (approval < 0) {
                approval = 0;
                gameOver = true;
            }

            //Budget - Don't go below 0
            budget += budChange;
            if (budget < 0) {
                budget = 0;
                gameOver = true;
            }

            //Stability - Don't go over 5, under 0
            stability += stabChange;
            if (stability > 5) {
                stability = 5;
            }
            if (stability < 0) {
                stability = 0;
                gameOver = true;
            }
        }
    }

    //Change resources at once, check for 0
    private void resourceChunk(){
        approval += appChange;
        if (approval > 100) {
            approval = 100;
        }
        if (approval < 0) {
            approval = 0;
            gameOver = true;
        }

        //Budget - Don't go below 0
        budget += budChange;
        if (budget < 0) {
            budget = 0;
            gameOver = true;
        }

        //Stability - Don't go over 5, under 0
        stability += stabChange;
        if (stability > 5) {
            stability = 5;
        }
        if (stability < 0) {
            stability = 0;
            gameOver = true;
        }
    }

    //Check for events
    private boolean eventCheck(){
        //Start of Election Events
        if (dayTotal == 250 && year == 4) {
            election = true;
        } else if (dayTotal == 359 && year == 4){
            Toast toast = Toast.makeText(getApplicationContext(), "Game Finished", Toast.LENGTH_SHORT);
            toast.show();
            gameOver = true;
        }

        if(election){
            //Special case near the end of the game
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
            //Event - 1/25 chance of happening
            if(new Random().nextInt(25)==0){
                //Apply event lock
                eventLock = true;
                return true;
            }
        }
        return false;
    }

    //Get an Event
    private Event getEvent(){
        Event e = new Event();
        //Scripted event name
        String name = eventName;
        //AI Flag
        boolean flag = false;

        if (name == null){
            //Normal Event
            if(!flag){
                //Training Event
                e = eventSystem.t.getTrainingEvent();

                //Random premade event
                //e = eventSystem.getPremadeEvent("None", true);
            }

            //AI Event
            if(flag){
                //Feed game state
            }
        } else {
            //Get Premade Event Using Name, Override Event lock
            e = eventSystem.getPremadeEvent(name, false);
            eventName = null;
        }

        return e;
    }

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
        TextView c1Bud = eView.findViewById(R.id.c1Bud);
        TextView c1Stab = eView.findViewById(R.id.c1Stab);
        //Budget
        TextView c2App = eView.findViewById(R.id.c2App);
        TextView c2Bud = eView.findViewById(R.id.c2Bud);
        TextView c2Stab = eView.findViewById(R.id.c2Stab);
        //Stability
        TextView c3App = eView.findViewById(R.id.c3App);
        TextView c3Bud = eView.findViewById(R.id.c3Bud);
        TextView c3Stab = eView.findViewById(R.id.c3Stab);
        //Button
        Button button1 = eView.findViewById(R.id.button1);
        Button button2 = eView.findViewById(R.id.button2);
        Button button3 = eView.findViewById(R.id.button3);


        //Set text views text
        title.setText(e.getEventTitle());
        //Dismissive
        c1App.setText(String.format("%.0f", e.getDisEffectByIndex(0)) + "%");
        c1Bud.setText("£" + String.format("%.0f", e.getDisEffectByIndex(1)));
        c1Stab.setText(String.format("%.1f", e.getDisEffectByIndex(2)));
        //Normal
        c2App.setText(String.format("%.0f", e.getNormEffectByIndex(0)) + "%");
        c2Bud.setText("£" + String.format("%.0f", e.getNormEffectByIndex(1)));
        c2Stab.setText(String.format("%.1f",e.getNormEffectByIndex(2)));
        //Extreme
        c3App.setText(String.format("%.0f", e.getExtEffectByIndex(0)) + "%");
        c3Bud.setText("£" + String.format("%.0f", e.getExtEffectByIndex(1)));
        c3Stab.setText(String.format("%.1f",e.getExtEffectByIndex(2)));

        //Set Button Text
        button1.setText(e.getDisChoice());
        button2.setText(e.getNormChoice());
        button3.setText(e.getExtChoice());

        choiceNumber = 0;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choiceNumber = 1;
                paused = false;
                eventDialog.dismiss();
                eventSystem.getGameState(approval, budget, stability, dayTotal, year, choiceNumber);
                getChoice(e);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choiceNumber = 2;
                paused = false;
                eventDialog.dismiss();
                eventSystem.getGameState(approval, budget, stability, dayTotal, year, choiceNumber);
                getChoice(e);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choiceNumber = 3;
                paused = false;
                eventDialog.dismiss();
                eventSystem.getGameState(approval, budget, stability, dayTotal, year, choiceNumber);
                getChoice(e);
            }
        });

        //Create Dialog
        eventAlertBuilder.setView(eView);
        eventDialog = eventAlertBuilder.create();
        //Prevent Dismissal
        eventDialog.setCanceledOnTouchOutside(false);
        eventDialog.setCancelable(false);
        //Show
        eventDialog.show();
    }

    //Handle choice made
    private void getChoice(Event e) {
        if (choiceNumber == 1) {
            //Dismissive
            changeResources(e.getDisEffects());
            choiceText.setText(e.getDisChoice());
            if(e.getDisEffectByIndex(0) == 0){
                appEffect.setText("None");
            } else {
                appEffect.setText(String.valueOf(e.getDisEffectByIndex(0)));
            }
            if (e.getDisEffectByIndex(1) == 0){
                budEffect.setText("None");
            } else {
                budEffect.setText(String.valueOf(e.getDisEffectByIndex(1)));
            }
            if (e.getDisEffectByIndex(2) == 0){
                stabEffect.setText("None");
            } else {
                stabEffect.setText(String.format("%.1f", (e.getDisEffectByIndex(2))));
            }

            choiceNumber = 0;
        } else if (choiceNumber == 2) {
            //Normal
            changeResources(e.getNormEffects());
            choiceText.setText(e.getNormChoice());

            if(e.getNormEffectByIndex(0) == 0){
                appEffect.setText("None");
            } else {
                appEffect.setText(String.valueOf(e.getNormEffectByIndex(0)));
            }
            if (e.getNormEffectByIndex(1) == 0){
                budEffect.setText("None");
            } else {
                budEffect.setText(String.valueOf(e.getNormEffectByIndex(1)));
            }
            if (e.getNormEffectByIndex(2) == 0){
                stabEffect.setText("None");
            } else {
                stabEffect.setText(String.format("%.1f", (e.getNormEffectByIndex(2))));
            }

            choiceNumber = 0;
        } else if (choiceNumber == 3) {
            //Extreme
            changeResources(e.getExtEffects());
            choiceText.setText(e.getExtChoice());

            if(e.getExtEffectByIndex(0) == 0){
                appEffect.setText("None");
            } else {
                appEffect.setText(String.valueOf(e.getExtEffectByIndex(0)));
            }
            if (e.getExtEffectByIndex(1) == 0){
                budEffect.setText("None");
            } else {
                budEffect.setText(String.valueOf(e.getExtEffectByIndex(1)));
            }
            if (e.getExtEffectByIndex(2) == 0){
                stabEffect.setText("None");
            } else {
                stabEffect.setText(String.format("%.1f", (e.getExtEffectByIndex(2))));
            }

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
            e = eventSystem.getPremadeEvent("GameStart", false);
        } else if (day == 6){
            e = eventSystem.getPremadeEvent("Example", false);
        } else if (day == 8) {
            e = eventSystem.getPremadeEvent("Resources", false);
        }

        return e;
    }

    //Handle back button
    @Override
    public void onBackPressed(){

        //Confirmation dialogue
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int c) {
                switch (c) {
                    case DialogInterface.BUTTON_POSITIVE:
                        //Call super on back pressed to exit activity
                        GameActivity.super.onBackPressed();
                        break;
                    case DialogInterface.BUTTON_NEGATIVE:
                        //Do nothing
                        break;
                }
            }
        };

        android.support.v7.app.AlertDialog.Builder b = new android.support.v7.app.AlertDialog.Builder(this);
        b.setMessage("Return to main menu? The game will end.").setPositiveButton("Yes", dialogClickListener).setNegativeButton("No", dialogClickListener).show();
    }

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


    //TODO
    //Add more random events

    //Questionnaire
}
