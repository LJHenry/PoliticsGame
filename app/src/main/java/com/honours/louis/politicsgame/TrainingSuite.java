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
        double[] dis;
        double[] norm;
        double[] ext;

        //Ensure choices will have at least 1 positive and negative
        dis = makeSense(getEffects(1), 1);
        norm = makeSense(getEffects(2), 2);
        ext = makeSense(getEffects(3), 3);

        //Round
        round(dis);
        round(norm);
        round(ext);

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

    //Get random value for Training events
    private double getRandomValue(String resource, int choice) {

        double i = 0;

        if (choice == 1) {
            if (resource == "approval")
                i = ThreadLocalRandom.current().nextInt(1, 5);

            if (resource == "budget")
                i = ThreadLocalRandom.current().nextInt(5000, 7500);

            if (resource == "stability")
                i = ThreadLocalRandom.current().nextDouble(0.1, 0.3);

        } else if (choice == 2) {
            if (resource == "approval")
                i = ThreadLocalRandom.current().nextInt(6, 10);

            if (resource == "budget")
                i = ThreadLocalRandom.current().nextInt(7500, 10000);

            if (resource == "stability")
                i = ThreadLocalRandom.current().nextDouble(0.3, 0.5);

        } else if (choice == 3) {
            if (resource == "approval")
                i = ThreadLocalRandom.current().nextInt(11, 15);

            if (resource == "budget")
                i = ThreadLocalRandom.current().nextInt(10000, 12500);

            if (resource == "stability")
                i = ThreadLocalRandom.current().nextDouble(0.5, 0.7);
        }

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

        return i;
    }

    private double[] round(double[] effects){
        //Round numbers
        effects[0] = Math.round(effects[0]);
        effects[1] = Math.round(effects[1]);
        //Ensure stability isn't rounded to 0
        if(effects[2] < 0 && effects[2] > 0.1){
            effects[2] = effects[2] - 0.1;
        } else if (effects[2] > 0 && effects[2] < 0.1){
            effects[2] = effects[2] + 0.1;
        }
        DecimalFormat df = new DecimalFormat("#.#");
        String s = df.format(effects[2]);
        effects[2] = Double.parseDouble(s);

        return effects;
    }
}
