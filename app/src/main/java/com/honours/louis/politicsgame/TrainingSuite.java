package com.honours.louis.politicsgame;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TrainingSuite {

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

        EventElement a = new EventElement("Training Event", "Dismissive", dis, "Object");
        EventElement b = new EventElement("Created by", "Normal", norm, "Context");
        EventElement c = new EventElement("getTrainingEvent()", "Extreme", ext, "Subject");

        Event e = new Event(a, b, c);

        return e;
    }

    private double[] getEffects(int choice) {
        double[] effects = new double[3];
        effects[0] = Math.round(getRandomValue("approval", choice));
        effects[1] = Math.round(getRandomValue("budget", choice));
        //Round stability
        DecimalFormat df = new DecimalFormat("#.#");
        String s = df.format(getRandomValue("stability", choice));
        effects[2] = Double.parseDouble(s);

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
            effects[index = new Random().nextInt(2)] = -effects[index];
        } else if (posCount == 0) { //3 Negatives
            //Make 1 random index positive
            effects[index = new Random().nextInt(2)] = Math.abs(effects[index]);
        }

        if (zero && posCount == 2) { //2 Positives Only
            //Make 1 non zero index negative
            index = randomIndex(zeroIndex);
            effects[index] = -effects[index];

        } else if (zero && posCount == 0) { //2 Negatives Only
            //Make 1 non zero index positive
            index = randomIndex(zeroIndex);
            effects[index] = Math.abs(effects[index]);
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
                i = ThreadLocalRandom.current().nextInt(0, 5);

            if (resource == "budget")
                i = ThreadLocalRandom.current().nextInt(0, 5000);

            if (resource == "stability")
                i = ThreadLocalRandom.current().nextDouble(0.1, 0.3);

        } else if (choice == 2) {
            if (resource == "approval")
                i = ThreadLocalRandom.current().nextInt(5, 10);

            if (resource == "budget")
                i = ThreadLocalRandom.current().nextInt(5000, 10000);

            if (resource == "stability")
                i = ThreadLocalRandom.current().nextDouble(0.3, 0.8);

        } else if (choice == 3) {
            if (resource == "approval")
                i = ThreadLocalRandom.current().nextInt(10, 15);

            if (resource == "budget")
                i = ThreadLocalRandom.current().nextInt(10000, 15000);

            if (resource == "stability")
                i = ThreadLocalRandom.current().nextDouble(0.8, 1);
        }

        //Chance to be -
        if (ThreadLocalRandom.current().nextInt(1, 10) < 6) {
            i = -i;
        } else {
            //Reduce positive effects
            i = i / 2;
        }
        //Chance to be 0
        if (ThreadLocalRandom.current().nextInt(1, 6) < 3) {
            i = 0;
        }

        return i;
    }
}
