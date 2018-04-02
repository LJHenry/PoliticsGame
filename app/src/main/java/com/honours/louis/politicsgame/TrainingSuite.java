package com.honours.louis.politicsgame;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TrainingSuite {

    private double difficulty;

    public TrainingSuite(){
        //Set factor positive effects are reduced by
        difficulty = 1.25;
    }

    public Event getTrainingEvent() {
        //Create an event for training
        //Random positive and negative values in a boundary for each choice
        double app;
        double bud;
        double stab;

        //Get effects
        app = getEffect(1);
        bud = getEffect(2);
        stab = getEffect(3);

        //Round
        round(app, 1);
        round(bud, 2 );
        round(stab, 3);

        EventElement a = new EventElement("Training Event", "Dismissive", app, "Object");
        EventElement b = new EventElement("Created by", "Normal", bud, "Context");
        EventElement c = new EventElement("getTrainingEvent()", "Extreme", stab, "Subject");

        Event e = new Event(a, b, c);

        return e;
    }

    private double getEffect(int choice) {
        double effect;
        effect = getRandomValue(choice);

        return effect;
    }

    //Get random value for Training events
    private double getRandomValue(int choice) {

        double i = 0;

        if (choice == 1) {
            //Approval
            i = ThreadLocalRandom.current().nextInt(1, 10);
        } else if (choice == 2) {
            //Budget
            i = ThreadLocalRandom.current().nextInt(5000, 125000);
        } else if (choice == 3) {
            //Stability
            i = ThreadLocalRandom.current().nextDouble(0.1, 0.5);
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
        if(choice < 2){
            effect = Math.round(effect);
        } else if (choice == 2){
            //Ensure stability isn't rounded to 0
            if(effect < 0 && effect > 0.1){
                effect = effect - 0.1;
            } else if (effect > 0 && effect < 0.1){
                effect = effect + 0.1;
            }
            DecimalFormat df = new DecimalFormat("#.#");
            String s = df.format(effect);
            effect = Double.parseDouble(s);
        }

        return effect;
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
