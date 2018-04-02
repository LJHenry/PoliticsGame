package com.honours.louis.politicsgame;

/**
 * Class for events that will happen throughout the game.
 * An event holds 3 Event Elements.
 * Created by Louis Henry on 06/02/2018.
 */

public class Event {

    //The object, context and subject of the event
    private EventElement eventObj;
    private EventElement eventCon;
    private EventElement eventSub;
    private String eventName;
    private boolean isNegative;

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
    //Approval
    public String getChoiceA(){
        return eventObj.getChoice();
    }

    public double getEffectA(){
        return eventObj.getEffect();
    }

    public String getStringEffectA(){return eventObj.getEffectAsString();}


    //Budget
    public String getChoiceB(){
        return eventObj.getChoice();
    }

    public double getEffectB(){
        return eventObj.getEffect();
    }

    public String getStringEffectB(){return eventObj.getEffectAsString();}

    //Stability
    public String getChoiceS(){
        return eventObj.getChoice();
    }

    public double getEffectS(){
        return eventObj.getEffect();
    }

    public String getStringEffectS(){return eventObj.getEffectAsString();}







}
