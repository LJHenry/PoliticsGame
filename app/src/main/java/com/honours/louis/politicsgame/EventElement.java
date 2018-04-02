package com.honours.louis.politicsgame;

/**
 * An element that makes up an event, one of three.
 * Must be a Object, Context or Subject.
 * Created by loujh on 12/02/2018.
 */

public class EventElement {

    private String name;
    private String choice;
    private double effect;
    private enum type {Object, Context, Subject}
    private type label;

    public EventElement(String name, String choice, double effect, String label){
        this.name = name;
        this.choice = choice;
        this.effect = effect;
        this.label = type.valueOf(label);
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public String getChoice(){
        return this.choice;
    }

    public double getEffect(){
        return this.effect;
    }

    public String getEffectAsString(){
        String s = String.valueOf(effect);
        return s;
    }

    //Return label as String
    public String getLabel(){
        return this.label.toString();
    }



}
