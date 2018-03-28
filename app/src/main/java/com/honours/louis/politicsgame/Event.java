package com.honours.louis.politicsgame;

/**
 * Class for events that will happen throughout the game.
 * An event holds 3 EventInstances.
 * Created by Louis Henry on 06/02/2018.
 */

public class Event {

    //The object, context and subject of the event
    private EventElement eventObj;
    private EventElement eventCon;
    private EventElement eventSub;
    private String eventName;

    public Event(){
        //For null event
    }

    public Event(EventElement o, EventElement c, EventElement s){
        this.eventObj = o;
        this.eventCon = c;
        this.eventSub = s;
    }

    public void setEventName(String n){
        eventName = n;
    }

    public String getEventName(){
        return this.eventName;
    }


    public String getEventTitle(){
        String title = this.eventObj.getName() + " " + this.eventCon.getName() + " " + this.eventSub.getName();
        return title;
    }

    //Get choices
    //Dismissive
    public String getDisChoice(){
        return eventObj.getChoice();
    }
    public double[] getDisEffects(){
        return eventObj.getEffects();
    }
    public double getDisEffectByIndex(int i){
        return eventObj.getEffect(i);
    }
    public String getDisEffectsAsString(){return eventObj.getEffectsAsString();}

    //Normal
    public String getNormChoice(){
        return eventCon.getChoice();
    }
    public double[] getNormEffects(){return eventCon.getEffects();}
    public double getNormEffectByIndex(int i){
        return eventCon.getEffect(i);
    }
    public String getNormEffectsAsString(){return eventCon.getEffectsAsString();}

    //Extreme
    public String getExtChoice(){
        return eventSub.getChoice();
    }
    public double[] getExtEffects(){
        return eventSub.getEffects();
    }
    public double getExtEffectByIndex(int i){
        return eventSub.getEffect(i);
    }
    public String getExtEffectsAsString(){return eventSub.getEffectsAsString();}







}
