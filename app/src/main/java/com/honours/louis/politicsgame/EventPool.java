package com.honours.louis.politicsgame;

import java.util.ArrayList;
import java.util.Random;

public class EventPool {

    private ArrayList<Event> poolA;
    private ArrayList<Event> poolB;

    public EventPool(){
        poolA = new ArrayList< >();
        poolB = new ArrayList< >();

        fillPoolA();
        fillPoolB();
    }

    //Make event - arguments allow control over all elements
    private Event makeEvent(String eventName, String obj, String objChoice, double a, String con, String conChoice, double b, String sub, String subChoice, double s){
        //Choice effects
        double approval = a;

        double budget = b;

        double stability = s;

        //Make event elements, Object, Context, Subject
        EventElement object = new EventElement(obj, objChoice, a, "Object");
        EventElement context = new EventElement(con, conChoice, b, "Context");
        EventElement subject = new EventElement(sub, subChoice, s, "Subject");

        //Fill event
        Event e = new Event(object, context, subject);
        //Set name
        e.setEventName(eventName);

        return e;

    }

    private void fillPoolA(){
        //Intro
        poolA.add(makeEvent("GameStart", "Welcome", "Ok", 0,"To", "Ok", 0, "Politics Game", "Ok",0));
        poolA.add(makeEvent("Example", "Events", "You Must", 0, "Appear", "Make", 0,"Here", "A Choice",0));
        poolA.add(makeEvent("Resources", "Balance", "Approval", 0, "Your", "Budget", 0, "Resources", "Stability",0));
        //Election
        poolA.add(makeEvent("ElectionWarning", "General Election", "Make Party Speech", 5, "To Be Held", "Strategize Campaign", 0, "Soon", "Raise Funds", 0));
        poolA.add(makeEvent("BeginCampaign", "Government", "Focus on People", 4, "Begins", "Focus on Economy", 4, "Election Campaign", "Focus on Party Issues",0));
        poolA.add(makeEvent("OppositionCampaign", "Opposition", "Criticise Policies", 2, "Begins", "Release Sound Bites", 2, "Election Campaign", "Counter Campaign", 4));
        poolA.add(makeEvent("ElectionProgress", "Election Campaigns", "Ease Funding", 0, "Make Progress", "Continue Funding", 1, "Around the Country", "Increase Funding", 4));
        poolA.add(makeEvent("ElectionTwist", "Opposition", "Ignore Them", -8, "Targets", "Change Focus Areas", 4, "Government Weaknesses", "Aggressive Campaigning", 10));
        // -- BROKEN --poolA.add(makeEvent("ElectionLosing", "Opposition", "Focus on Party", 0, 0, 0.5, "Surging Ahead", "Make Keynote Speech", 8, 0, 0, "In Latest Polls", "Hold Fundraiser",0, 10000, 0));
        poolA.add(makeEvent("ElectionClose", "Few Days", "We Will Win", 0, "Remain", "Rally Supporters", 0, "For Election Campaigns", "Grasp For Votes", 0));
    }

    //TODO
    //May need a 'used' list, ID event by number (as the name)
    //Add event to list by ID when it is chosen, If event is chosen and matches ID in list do not use
    //For this to work there must be enough events in the list to last maximum event number per game or no event will be selected
    private void fillPoolB(){
        /*
        poolB.add(makeEvent("None", "Opposition", "Divert Attention", 3, 0, -0.3, "Criticizes", "Counter Criticism", -5, 0, 0.2, "Housing Policy", "Review Policy", 6, -7500, -0.4));
        poolB.add(makeEvent("None", "Industry Leaders", "Ignore Them", -6, 0, 0, "Bemoan", "Give Explanation", -4, 0, 0.4, "Employment Figures", "Aid Job Creation", 4, -15000, 0));
        poolB.add(makeEvent("None", "Universities", "Downplay Academia", -4, 10000, 0, "Scrutinize", "Provide Reasoning", 2, 0, 0.2, "Education Funding Cuts", "Pledge Increases", 6, -25000, -0.2));
        poolB.add(makeEvent("None", "Foreign Power", "Disparage Them", 4, 0, -0.5, "Exposes Self in", "Start Inquiry", 0, -10000, 0.5, "Espionage Incident", "Impose Sanctions", 7, -15000, 1));
        poolB.add(makeEvent("None", "Economic Plan", "As Expected", 5, 0, 0, "Boosts", "Continue Plan", 3, 0, 0.2, "Growth Figures", "Claim Victory", -5, 0, 0.7));
        poolB.add(makeEvent("None", "Internet Providers", "Keep Policies", -5, 0, 0, "Warn About", "Divert Attention", -3, -30000, 0, "Data Privacy", "Repeal Policies", 6, 0, -0.6));
        poolB.add(makeEvent("None", "Economic", "Deflect Blame", 4, -10000, -0.2, "Downturn", "Adhere to Budget", -3, -7500, 0, "Looming", "Austerity Measures", -4, -50000, 0.4));
        poolB.add(makeEvent("None", "Equality Row", "Abscond It", 3, 0, 0.3, "Grips", "Engage Debate", 6, 0, -0.6, "Parliment", "Blame Opposition", -10, 0, 0.7));
        poolB.add(makeEvent("None", "Mounting Debt", "Blame Previous Government", 4, -7500, 0, "Cuts", "Rebudget Services", 0, -5000, 0.2, "Public Funds", "Borrow Funds", 0, 20000, -1));
        poolB.add(makeEvent("None", "Opposition", "Divert Attention", 4, 0, -0.3, "Doubt", "Promise Voters", 4, -5000, 0.2, "Government Manifesto Targets", "Reach for Them", 7, -12500, 0.3));
        poolB.add(makeEvent("None", "Public Housing", "Accuse Contractors", -7, 0, 0, "Materials Scandal", "Pledge Funds", 6, -10000, 0, "Points to Government Policy", "Retract Policy", 8, 0, -0.5));
        poolB.add(makeEvent("None", "Organisations", "Pacify Concerns", -5, 0, 0.4, "Lament", "Share Concerns", 5, 0, -0.3, "Youth Voting Figures", "Engage Them", 6, -7500, 0.2));
        */
    }

    public Event getEventByName(String eventName){
        //For PoolA
        Event e;
        for(int i = 0; i < poolA.size(); i++) {
            e = poolA.get(i);
            if (e.getEventName().equals(eventName)) {
                return e;
            }
        }
        return null;
    }

    public Event getEvent(){
        //Random
        Random index = new Random();
        int x = index.nextInt(poolB.size());

        System.out.println("RANDOM NUMBER: " + x);

        return poolB.get(x);
    }

}

