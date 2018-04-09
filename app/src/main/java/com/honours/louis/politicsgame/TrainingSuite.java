package com.honours.louis.politicsgame;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TrainingSuite {

    public Event getTrainingEvent(String situation, double negativeMultiplyer) {
        //Create an event for training
        //Random positive and negative values in a boundary for each choice
        double app;
        double bud;
        double stab;

        //Random tier
        Random r = new Random();
        int tier = r.nextInt(5);
        //Get effects
        app = getEffect(1, tier);
        bud = getEffect(2, tier);
        stab = getEffect(3, tier);

        boolean negative = negativeChance(situation, negativeMultiplyer);

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
        //effect = getRandomValue(choice, tier);
        effect = getSetValue(choice, tier);

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

    //Get set value (Event tier 1 - 5)
    private double getSetValue(int choice, int tier){
        double i = 0;
        if(tier == 0) {
            if (choice == 1){
                i = 5;
            } else if(choice == 2){
                i = 2500;
            } else if(choice == 3){
                i = 0.1;
            }
        } else if(tier == 1){
            if (choice == 1){
                i = 8;
            } else if(choice == 2){
                i = 5000;
            } else if(choice == 3){
                i = 0.2;
            }
        } else if(tier == 2){
            if (choice == 1){
                i = 10;
            } else if(choice == 2){
                i = 7500;
            } else if(choice == 3){
                i = 0.3;
            }
        } else if(tier == 3){
            if (choice == 1){
                i = 12;
            } else if(choice == 2){
                i = 10000;
            } else if(choice == 3){
                i = 0.4;
            }
        } else if(tier == 4){
            if (choice == 1){
                i = 15;
            } else if(choice == 2){
                i = 12500;
            } else if(choice == 3){
                i = 0.5;
            }
        }
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

    //Chance for negative events based on Situation
    private boolean negativeChance(String situation, double multiplyer){
        double i = new Random().nextInt(20);
        //Higher the number more likely to be negative
        i = i * multiplyer;
        switch(situation) {
            case "Low":
                if(i <= 11){
                    return true;
                }
                break;
            case "Moderate":
                if(i <= 10){
                    return true;
                }
                break;
            case "Substantial":
                if(i <= 9){
                    return true;
                }
                break;
            case "Severe":
                if(i <= 8){
                    return true;
                }
                break;
            case "Critical":
                if(i <= 7){
                    return true;
                }
                break;
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
