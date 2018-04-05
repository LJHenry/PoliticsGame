package com.honours.louis.politicsgame;

import android.util.Log;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TrainingSuite {

    public Event getTrainingEvent() {
        //Create an event for training
        //Random positive and negative values in a boundary for each choice
        double app;
        double bud;
        double stab;

        int tier = ThreadLocalRandom.current().nextInt(1, 4);
        Log.d("TRAINING SUITE", "Random tier value: " + String.valueOf(tier));
        //Get effects
        app = getEffect(1, tier);
        bud = getEffect(2, tier);
        stab = getEffect(3, tier);

        boolean negative = negativeChance();

        if(negative){
            app = -app;
            bud = -bud;
            stab = -stab;
        }

        //Round
        app = round(app, 1);
        bud = round(bud, 2 );
        stab = round(stab, 3);

        EventElement a = new EventElement("Training Event", "Approval", app, "Object");
        EventElement b = new EventElement("Created by", "Budget", bud, "Context");
        EventElement c = new EventElement("getTrainingEvent()", "Stability", stab, "Subject");

        Event e = new Event(a, b, c);
        if(negative)
            e.setNegative();

        return e;
    }

    private double getEffect(int choice, int tier) {
        double effect;
        effect = getRandomValue(choice, tier);

        return effect;
    }

    //Get random value for Training events
    private double getRandomValue(int choice, int tier) {

        double i = 0;

        //3 Tiers
        if(tier == 1){
            if (choice == 1) {
                //Approval
                i = ThreadLocalRandom.current().nextInt(1, 5);
            } else if (choice == 2) {
                //Budget
                i = ThreadLocalRandom.current().nextInt(0, 5000)  + 2500;
            } else if (choice == 3) {
                //Stability
                i = ThreadLocalRandom.current().nextDouble(0, 0.15) + 0.1;
            }
        } else if(tier == 2){
            if (choice == 1) {
                //Approval
                i = ThreadLocalRandom.current().nextInt(5, 10);
            } else if (choice == 2) {
                //Budget
                i = ThreadLocalRandom.current().nextInt(5000, 7500) + 2500;
            } else if (choice == 3) {
                //Stability
                i = ThreadLocalRandom.current().nextDouble(0.15, 0.25) + 0.1;
            }
        } else if(tier == 3){
            if (choice == 1) {
                //Approval
                i = ThreadLocalRandom.current().nextInt(9, 15);
            } else if (choice == 2) {
                //Budget
                i = ThreadLocalRandom.current().nextInt(7500, 10000)  + 2500;
            } else if (choice == 3) {
                //Stability
                i = ThreadLocalRandom.current().nextDouble(0.25, 0.5) + 0.1;
            }
        }

        /*
        //Chance to be -
        if (ThreadLocalRandom.current().nextInt(1, 10) < 6) {
            i = -i;
        } else {
            //Reduce positive effects
            i = i / difficulty;
        }
        //Chance to be 0
        if (ThreadLocalRandom.current().nextInt(1, 6) < 3) {
            i = 0;
        }
        */

        return i;
    }

    private double round(double effect, int choice){
        //Round numbers
        if(choice <= 2){
            effect = Math.round(effect);
        } else if (choice == 3){
            //Ensure stability isn't rounded to 0
            DecimalFormat df = new DecimalFormat("#.#");
            String s = df.format(effect);
            effect = Double.parseDouble(s);
        }
        return effect;
    }

    private boolean negativeChance(){
        if(ThreadLocalRandom.current().nextInt(0, 9) < 5){
            return true;
        }
        return false;
    }


    /*
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
            effects[index = new Random().nextInt(2)] = -effects[index] * difficulty;
        } else if (posCount == 0) { //3 Negatives
            //Make 1 random index positive
            effects[index = new Random().nextInt(2)] = Math.abs(effects[index]) / difficulty;
        }

        if (zero && posCount == 2) { //2 Positives Only
            //Make 1 non zero index negative
            index = randomIndex(zeroIndex);
            effects[index] = -effects[index] * difficulty;

        } else if (zero && posCount == 0) { //2 Negatives Only
            //Make 1 non zero index positive
            index = randomIndex(zeroIndex);
            effects[index] = Math.abs(effects[index]) / difficulty;
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
    */
}
