package com.honours.louis.politicsgame;

/**
 * An element that makes up an event, one of three.
 * Must be a Object, Context or Subject.
 * Created by loujh on 12/02/2018.
 */

public class EventElement {

    private String name;
    private String choice;
    private double[] effects;
    private enum type {Object, Context, Subject}
    private type label;

    public EventElement(String name, String choice, double[] effects, String label){
        this.name = name;
        this.choice = choice;
        this.effects = effects;
        this.label = type.valueOf(label);
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public String getChoice(){
        return this.choice;
    }

    public double[] getEffects(){
        return this.effects;
    }
    public double getEffect(int i){return this.effects[i];}
    public String getEffectsAsString(){
        String s;
        s = String.valueOf(effects[0]) + " " + String.valueOf(effects[1]) + " " + String.valueOf(effects[2]);
        return s;
    }

    //Return label as String
    public String getLabel(){
        return this.label.toString();
    }



}
