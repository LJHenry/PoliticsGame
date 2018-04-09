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
    private int tier;

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
        return eventCon.getChoice();
    }

    public double getEffectB(){
        return eventCon.getEffect();
    }

    public String getStringEffectB(){return eventCon.getEffectAsString();}

    //Stability
    public String getChoiceS(){
        return eventSub.getChoice();
    }

    public double getEffectS(){
        return eventSub.getEffect();
    }

    public String getStringEffectS(){return eventSub.getEffectAsString();}

    //Negativity
    public void setNegative(){
        this.isNegative = true;
    }

    //Return negativity
    public boolean isNegative(){
        if(isNegative)
            return true;

        return false;
    }

    //Get effect by string 1, 2, 3
    public double getEffectByLabel(String label){
        if(label == "1"){
            return this.getEffectA();
        } else if(label == "2"){
            return this.getEffectB();
        } else if(label == "3") {
            return this.getEffectS();
        }
        return 0;
    }

    //Modify effect by string 1, 2, 3
    public void setEffect(String effect, double value){
        if(effect == "1"){
            this.eventObj.setEffect(value);
        } else if(effect == "2"){
            this.eventCon.setEffect(value);
        } else if(effect == "3") {
            this.eventSub.setEffect(value);
        }
    }

    //Tier
    public void setTier(int i){
        this.tier = i;
    }

    public int getTier(){
        return this.tier;
    }

}
