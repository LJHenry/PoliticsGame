package com.honours.louis.politicsgame;

import com.honours.louis.politicsgame.org.pielot.rf.RandomForest;

import java.util.ArrayList;
import java.util.Random;

public class EventPool {

    private ArrayList<Event> poolA;
    private ArrayList<Event> pool1Negative;
    private ArrayList<Event> pool1Positive;
    private ArrayList<Event> pool2Negative;
    private ArrayList<Event> pool2Positive;
    private ArrayList<Event> pool3Negative;
    private ArrayList<Event> pool3Positive;
    private ArrayList<Event> pool4Negative;
    private ArrayList<Event> pool4Positive;
    private ArrayList<Event> pool5Negative;
    private ArrayList<Event> pool5Positive;

    public EventPool(){
        poolA = new ArrayList<>();
        pool1Negative = new ArrayList<>();
        pool1Positive = new ArrayList<>();
        pool2Negative = new ArrayList<>();
        pool2Positive = new ArrayList<>();
        pool3Negative = new ArrayList<>();
        pool3Positive = new ArrayList<>();
        pool4Negative = new ArrayList<>();
        pool4Positive = new ArrayList<>();
        pool5Negative = new ArrayList<>();
        pool5Positive = new ArrayList<>();

        fillPoolA();
        fillBPools();
    }

    //Make event - arguments allow control over all elements
    private Event makeEvent(String eventName, String obj, String objChoice, double a, String con, String conChoice, double b, String sub, String subChoice, double s, boolean negative, int tier){
        //Make event elements, Object, Context, Subject
        EventElement object = new EventElement(obj, objChoice, a, "Object");
        EventElement context = new EventElement(con, conChoice, b, "Context");
        EventElement subject = new EventElement(sub, subChoice, s, "Subject");

        //Fill event
        Event e = new Event(object, context, subject);
        //Set name
        e.setEventName(eventName);
        //Make negative
        if(negative){
            e.setNegative();
        }
        //Set tier
        e.setTier(tier);

        return e;
    }

    //Fill Definite Events
    private void fillPoolA(){
        //Intro
        poolA.add(makeEvent("GameStart", "Welcome", "Ok", 0,"To", "Ok", 0, "Politics Game", "Ok",0, false,0));
        poolA.add(makeEvent("Example", "Events", "You Must", 0, "Appear", "Make", 0,"Here", "A Choice",0, false,0));
        poolA.add(makeEvent("Resources", "Balance", "Approval", 0, "Your", "Budget", 0, "Resources", "Stability",0, false,0));
        //Election
        poolA.add(makeEvent("ElectionWarning", "General Election", "Make a Speech", 5, "To Be Held", "Hold Fundraiser", 7500, "Soon", "Organise Party", 0.25, false,0));
        poolA.add(makeEvent("BeginCampaign", "The Government", "Focus on People", 10, "Begin", "Focus on Economy", 7500, "Their Election Campaign", "Focus on Parliament",0.3, false,0));
        poolA.add(makeEvent("OppositionCampaign", "The Opposition", "Battle in Parliament", -12, "Begin", "Fund our Campaign", -12500, "Their Election Campaign", "Battle on the Streets", -0.4, true,0));
        poolA.add(makeEvent("ElectionProgress", "Government", "Rally Supporters", 6, "Election Campaign", "Raise more Funds", 5000, "Makes Progress", "Increase Funding", 0.3, false,0));
        poolA.add(makeEvent("ElectionTwist", "Opposition", "Stick to the Plan", -10, "Increase Campaigning", "Focus in These Areas", -7500, "At Critical Voting Areas", "Defend Them Immediately", -0.5, true,0));
        poolA.add(makeEvent("ElectionClose", "Election Day", "Go Door to Door", 5, "is Almost", "Scrounge Funds", 5000, "Here", "Confide with MP's", 0.2, false,0));
    }

    //Fill Random Events
    private void fillBPools(){
        //Tier 1 +
        pool1Positive.add(makeEvent("None", "Local Councils", "Fill them Immediately", 5, "Plagued by", "Prioritize in Budget", 2500, "Pothole Complaints", "Blame the Last Government", 0.1, false, 1));
        pool1Positive.add(makeEvent("None", "Increasing Automation", "Trial a UBI Scheme", 5, "Raises Concern Over", "Promote Entrepreneurship", 2500, "Job Availability", "Impose Automation Policy", 0.1, false, 1));
        pool1Positive.add(makeEvent("None", "Public and Experts", "Share Concerns", 5, "Express Joint Concern over", "Promote Recycling", 2500, "State of the Environment", "Enforce Environment Policy", 0.1, false, 1));
        pool1Positive.add(makeEvent("None", "Local Currency", "Praise Hard Work", 5, "Performing Well in", "Capitalize", 2500, "Global Markets", "Pay Debts", 0.1, false, 1));
        pool1Positive.add(makeEvent("None", "Parliament:", "Be Decisive", 5, "Latest Debate", "Filibuster", 2500, "Goes Back and Forth", "Slate Opposition", 0.1, false, 1));
        pool1Positive.add(makeEvent("None", "Party MP", "Join In", 5, "Unfairly Defames", "Dismiss Them", 2500, "Opposition Minister", "Maintain Order", 0.1, false, 1));
        pool1Positive.add(makeEvent("None", "Polls Show", "Publish Poll", 5, "Government", "Quiet Confidence", 2500, "Working Well Under Pressure", "Quote Poll", 0.1, false, 1));
        pool1Positive.add(makeEvent("None", "Government Unified", "Make Strong Speech", 5, "as Backbenchers Express", "Use Support", 2500, "Satisfaction", "Hold Conference", 0.1, false, 1));
        //Tier 1 -
        pool1Negative.add(makeEvent("None", "Migrant Surge", "Cannot Accept More", -5, "Stresses", "Must Accept Them", -2500, "Border Control", "Bring to Debate", -0.1, true, 1));
        pool1Negative.add(makeEvent("None", "Bickering Among", "Ignore It", -5, "Cabinet Ministers", "Publish Distracting Media", -2500, "Exploited by Opposition", "Whip Them", -0.1, true, 1));
        pool1Negative.add(makeEvent("None", "Government", "Implicate Contractors", -5, "Questioned on", "Concede Shortcomings", -2500, "Housing Safety Standards", "Brush Off", -0.1, true, 1));
        pool1Negative.add(makeEvent("None", "Opposition", "Keep Policies", -5, "Criticize", "Revise Policies", -2500, "New Government Housing Policies", "Debate Them", -0.1, true, 1));
        pool1Negative.add(makeEvent("None", "Industry Leaders", "Ignore Them", -5, "Bemoan", "Spur Job Creation", -2500, "Dwindling Employment Figures", "Focus on Other Issues", -0.1, true, 1));
        pool1Negative.add(makeEvent("None", "Shadow Chancellor", "Brush Off", -5, "Criticizes Government", "Publish Figures", -2500, "Budget Plan", "Debate", -0.1, true, 1));
        pool1Negative.add(makeEvent("None", "Anti-Government Media", "Ignore It", -5, "Jump On", "Spur Pro Media", -2500, "Latest Bandwagon", "Bring it To Parliament", -0.1, true, 1));
        pool1Negative.add(makeEvent("None", "Opposition Leader", "Distract", -5, "Brings Tough Questions", "Prepare Quotes", -2500, "To Government", "Debate Unprepared", -0.1, true, 1));
        //Tier 2
        pool2Negative.add(makeEvent("None", "Equal Pay Row", "Ignore It", -6, "Grips", "Solve It", -5000, "Parliament", "Get Involved", -0.2, true, 2));
        pool2Positive.add(makeEvent("None", "Government Victory", "Thank Supporters", 6, "as New Motion", "Implement Changes", 5000, "Passed in Parliament", "Galvanize Party", 0.2, false, 2));
        pool2Negative.add(makeEvent("None", "Contentious Infrastructure Project", "Delay It", -7, "Raises Concerns", "Revise Planning", -5000, "In Parliament", "Go Ahead Anyway", -0.2, true, 2));
        pool2Positive.add(makeEvent("None", "Successful Trade Deals", "Relax Taxation", 7, "Bring Economic Boost to", "Reap the Rewards", 5000, "the Country", "Leverage in Parliament", 0.2, false, 2));
        pool2Negative.add(makeEvent("None", "Aging Transport Infrastructure", "Can't Afford It", -6, "is Inefficient,", "Inject Funding", -5000, "Costing Millions", "Blame Previous Governments", -0.2, true, 2));
        pool2Positive.add(makeEvent("None", "Youth Organizations", "Utilize Social Media", 6, "Pressure Government on", "Plan an Event", 5000, "Low Youth Voting Figures", "Send MPs to Schools", 0.2, false, 2));
        pool2Negative.add(makeEvent("None", "Studies Show Obesity Epidemic", "Form a Long Term Plan", -6, "is Effecting", "Boost Health Services", -5000, "Poorest in Society", "Pressure Industry", -0.2, true, 2));
        pool2Positive.add(makeEvent("None", "Nationalistic Sentiment", "Diffuse Arguments", 8, "Rising Amidst", "Poll Public on Referendum", 5000, "Immigration Debate", "Discuss in Parliament", 0.2, false, 2));
        pool2Negative.add(makeEvent("None", "Aging Population", "Keep Current Scheme", -7, "Putting Stress on", "Aid Care Sector", -5000, "Care Services", "Reform Scheme", -0.2, true, 2));
        pool2Positive.add(makeEvent("None", "Pollution Levels", "Promote Public Transport", 6, "Becoming Unhealthy", "Time is Money", 5000, "in Cities", "Employ Traffic Management", 0.2, false, 2));
        pool2Negative.add(makeEvent("None", "Trade Deal", "Cut Contact", -6, "With Distant Country", "Forfiet Monthly Tariffs", -5000, "Falls Through", "Attempt to Save", -0.2, true, 2));
        pool2Positive.add(makeEvent("None", "Whistleblower", "Publicly Reprimand", 7, "Reveals Scandal,", "Fund Investigation", 5000, "Implicates Large Corporation", "Award Penalties", 0.2, false, 2));
        pool2Negative.add(makeEvent("None", "Emergency Services", "Not Possible", -8, "Plead for", "Absolutely", -5000, "More Spending", "Reduce Other Services", -0.2, true, 2));
        pool2Positive.add(makeEvent("None", "Tragic Accident", "Never Again", 7, "Raises", "Raise Repair Funds", 5000, "Safety Concerns", "Review Policies", 0.2, false, 2));
        //Tier 3
        pool3Positive.add(makeEvent("None", "Rogue Nation", "Write them Off", 9, "Increases", "Increase Defence Budget", 7500, "Hostile Rhetoric", "Respond in Kind", 0.3, false, 3));
        pool3Negative.add(makeEvent("None", "Tabloid Newspapers", "Allow Them", -10, "Threaten to Expose", "Keep them Quiet", -7500, "MP's Misconduct", "Beat them to It", -0.3, true, 3));
        pool3Positive.add(makeEvent("None", "Large Economic Bloc", "Negotiate Best Deal", 9, "Proposes", "Accept", 7500, "New Trade Deal", "Refuse", 0.3, false, 3));
        pool3Negative.add(makeEvent("None", "Universities", "Deny Them", -9, "Scrutinize", "Provide More Funds", -7500, "Limited Education Funding", "Concede Policies", -0.3, true, 3));
        pool3Positive.add(makeEvent("None", "Housing Market", "Encourage Buying", 9, "Recovering Well", "Good", 7500, "After Previous Dip", "Implicate Our Policies", 0.3, false, 3));
        pool3Negative.add(makeEvent("None", "Health Service", "Its Doomed", -10, "Mismanagement", "Grant More Funding", -7500, "Causing Hospital Bed Shortages", "Take Blame", -0.3, true, 3));
        pool3Positive.add(makeEvent("None", "Lobby Group", "Deny Them Publicly", 10, "Pressures Government on", "Accept Them", 7500, "Critical Policy Vote", "Refuse", 0.3, false, 3));
        pool3Negative.add(makeEvent("None", "Project", "Make Promises", -10, "Mired In Development Problems", "Carry On", -7500, "Costing Government Dearly", "Scrap It", -0.3, true, 3));
        pool3Positive.add(makeEvent("None", "Debate Erupts", "Support Progress", 9, "Over", "Support Neither", 7500, "Tradition and Progress", "Support Tradition", 0.3, false, 3));
        pool3Negative.add(makeEvent("None", "Farmers Union", "Say No", -10, "Demands Greater", "Grant Them", -7500, "Subsidies, Quotes Damning Figure", "Make U-Turn", -0.3, true, 3));
        pool3Positive.add(makeEvent("None", "College and University", "Applaud Public", 10, "Grade Figures", "Ease Spending", 7500, "At Record High", "Promote Industries", 0.3, false, 3));
        pool3Negative.add(makeEvent("None", "Irresponsible Data Sharing", "Do Nothing", -9, "by Large Company", "Enforce Stronger Data Rights", -7500, "Causes Outrage", "Criticize Company", -0.3, true, 3));
        //Tier 4
        pool4Negative.add(makeEvent("None", "Mounting Public Debt", "Raise Taxes", -11, "Reduces", "Power Through It", -10000, "Public Funds", "Re-budget Services", -0.4, true, 4));
        pool4Positive.add(makeEvent("None", "Rival Foreign Power", "Begin Public Inquiry", 12, "Exposes Itself in", "Justify Military Funding", 10000, "Botched Espionage Incident", "Expel Diplomats", 0.4, false, 4));
        pool4Negative.add(makeEvent("None", "Growing Trouble Abroad", "Accept None", -12, "Creates", "Accept Many", -10000, "Refugee Crisis", "Accept Some", -0.4, true, 4));
        pool4Positive.add(makeEvent("None", "Top Scientist", "Promote Benefits of AI", 12, "Warns of", "Set up A Committee", 10000, "Future AI Threat", "Give Research Grants", 0.4, false, 4));
        pool4Negative.add(makeEvent("None", "More Frequent Extreme Weather", "Enforce Emissions Targets", -11, "Linked to", "Research Renewables", -10000, "Rising Global Temperatures", "We Can't Control It", -0.4, true, 4));
        pool4Positive.add(makeEvent("None", "Teachers Strike:", "Agree Terms", 11, "Claim They are Overworked,", "Reallocate Resources", 10000, "Underpaid", "Discuss Policies", 0.4, false, 4));
        pool4Negative.add(makeEvent("None", "Security Secretary", "Play Down Fears", -11, "Sows Fear of", "Appoint Specialists", -10000, "Chemical Weapons Threat", "Fire Fearmonger", -0.4, true, 4));
        pool4Positive.add(makeEvent("None", "Violent Crime", "Assure Families", 11, "Growing Problematic", "Gang Crackdown", 10000, "in The Capital", "Encourage Mayor", 0.4, false, 4));
        pool4Negative.add(makeEvent("None", "Internet Experts", "Restrict Data", -12, "Warn Public About", "Increase Cybersecurity", -10000, "Data Safety", "Keep Data Free", -0.4, true, 4));
        pool4Positive.add(makeEvent("None", "International Organisation", "Cycle Into Economy", 11, "Awards Government", "Take it All", 10000, "Large Development Grant", "Streamline Bureaucracy", 0.4, false, 4));
        //Tier 5
        pool5Negative.add(makeEvent("None", "Deadly Extremist Attack", "Lockdown!", -14, "Occurs in", "Deploy Counter Terror", -12500, "the Nations Capital", "Condemn It", -0.5, true, 5));
        pool5Positive.add(makeEvent("None", "Government Fiscal Strategy", "For the People", 13, "Gives Boost to", "Excellent!", 12500, "the Economy", "A Party Success", 0.5, false, 5));
        pool5Negative.add(makeEvent("None", "Fatal Storm", "We Weren't Prepared", -14, "Brings Flooding and Powercuts,", "Contingency Plan", -12500, "Emergency Service Funding Criticized", "Express Condolences", -0.5, true, 5));
        pool5Positive.add(makeEvent("None", "Large Oil Field", "Promote Employment", 15, "Discovered in", "Promote Exports", 12500, "Our Territory", "Boost Infrastructure", 0.5, false, 5));
        pool5Negative.add(makeEvent("None", "Religious Tensions", "Intervene", -15, "Boil Over Into", "Aid International Efforts", -12500, "Deadly Civil War Abroad", "Don't get Involved", -0.5, true, 5));
        pool5Positive.add(makeEvent("None", "Global Tech Giant", "Award Grants", 14, "Establishes New HQ,", "Boost Local Economy", 12500, "Brings Job Opportunities", "Provide Contracts", 0.5, false, 5));
        pool5Negative.add(makeEvent("None", "Alternate Sources Needed", "Keep Using Them", -13, "As", "Fund Nuclear Research", -12500, "Fossil Fuel Reserves Run Out", "Push for Renewables", -0.5, true, 5));
        pool5Positive.add(makeEvent("None", "Patience Pays Off", "Spend Surplus on Services", 14, "As Huge Infrastructure Work", "Good", 12500, "is Completed on Time", "Share Success with Party", 0.5, false, 5));
    }

    //Get Definite Event by Name
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

    //Get Random event, based on Tier and Negativity
    public Event getRandomEvent(String situation, double negativeMultiplier)                                            {

        Event e = new Event();
        int tier;
        //Determine positive or negative
        boolean negative = negativeChance(situation, negativeMultiplier);

        //Determine Tier
        tier = getTier();

        int i;

        //Check for empty, if empty use generic, else select event and delete from pool
        if(tier == 1){
            if(negative){
                if(!pool1Negative.isEmpty()){
                    i = randomEventIndex(pool1Negative.size());
                    e = pool1Negative.get(i);
                    pool1Negative.remove(i);
                } else {
                    e = getGeneric(1, true);
                }
            } else{
                if(!pool1Positive.isEmpty()){
                    i = randomEventIndex(pool1Positive.size());
                    e = pool1Positive.get(i);
                    pool1Positive.remove(i);
                } else {
                    e = getGeneric(1, false);
                }
            }
        } else if(tier == 2){
            if(negative){
                if(!pool2Negative.isEmpty()){
                    i = randomEventIndex(pool2Negative.size());
                    e = pool2Negative.get(i);
                    pool2Negative.remove(i);
                } else {
                    e = getGeneric(2, true);
                }
            } else{
                if(!pool2Positive.isEmpty()){
                    i = randomEventIndex(pool2Positive.size());
                    e = pool2Positive.get(i);
                    pool2Positive.remove(i);
                } else {
                    e = getGeneric(2, false);
                }
            }
        } else if(tier == 3){
            if(negative){
                if(!pool3Negative.isEmpty()){
                    i = randomEventIndex(pool3Negative.size());
                    e = pool3Negative.get(i);
                    pool3Negative.remove(i);
                } else {
                    e = getGeneric(3, true);
                }
            } else{
                if(!pool3Positive.isEmpty()){
                    i = randomEventIndex(pool3Positive.size());
                    e = pool3Positive.get(i);
                    pool3Positive.remove(i);
                } else {
                    e = getGeneric(3, false);
                }
            }
        } else if(tier == 4){
            if(negative){
                if(!pool4Negative.isEmpty()){
                    i = randomEventIndex(pool4Negative.size());
                    e = pool4Negative.get(i);
                    pool4Negative.remove(i);
                } else {
                    e = getGeneric(4, true);
                }
            } else{
                if(!pool4Positive.isEmpty()){
                    i = randomEventIndex(pool4Positive.size());
                    e = pool4Positive.get(i);
                    pool4Positive.remove(i);
                } else {
                    e = getGeneric(4, false);
                }
            }
        } else if(tier == 5){
            if(negative){
                if(!pool5Negative.isEmpty()){
                    i = randomEventIndex(pool5Negative.size());
                    e = pool5Negative.get(i);
                    pool5Negative.remove(i);
                } else {
                    e = getGeneric(5, true);
                }
            } else{
                if(!pool5Positive.isEmpty()){
                    i = randomEventIndex(pool5Positive.size());
                    e = pool5Positive.get(i);
                    pool5Positive.remove(i);
                } else {
                    e = getGeneric(5, false);
                }
            }
        }

        return e;
    }

    //Return a generic event of tier and negativity
    private Event getGeneric(int tier, boolean negative){
        if(tier == 1 ){
            if(negative){
                return makeEvent("None", "Minor Hindrances", "Ignore Them", -5,"Continue to Grieve", "Have them Fixed", -2500, "Government", "Defer to MPs",-0.1, true,1);
            } else {
                return (makeEvent("None", "", "", 0,"", "", 0, "", "",0, false,1));
            }
        } else if(tier == 2){
            if(negative){
                return makeEvent("None", "", "", 0,"", "", 0, "", "",0, true,2);
            } else {
                return makeEvent("None", "", "", 0,"", "", 0, "", "",0, false,2);
            }
        } else if(tier == 3){
            if(negative){
                return makeEvent("None", "", "", 0,"", "", 0, "", "",0, true,3);
            } else {
                return makeEvent("None", "", "", 0,"", "", 0, "", "",0, false,3);
            }
        } else if(tier == 4){
            if(negative){
                return makeEvent("None", "", "", 0,"", "", 0, "", "",0, true,4);
            } else {
                return makeEvent("None", "", "", 0,"", "", 0, "", "",0, false,4);
            }
        } else if(tier == 5){
            if(negative){
                return makeEvent("None", "", "", 0,"", "", 0, "", "",0, true,5);
            } else {
                return makeEvent("None", "", "", 0,"", "", 0, "", "",0, false,5);
            }
        }
        return null;
    }

    //Random Event Index
    private int randomEventIndex(int size){
        return new Random().nextInt(size);
    }

    //Chance for negative events based on Situation
    private boolean negativeChance(String situation, double multiplier){
        double i = new Random().nextInt(20) + 1;
        //Higher the number more likely to be negative
        i = i * multiplier;
        switch(situation) {
            case "Low":
                if(i >= 11){
                    return true;
                }
                break;
            case "Moderate":
                if(i >= 10){
                    return true;
                }
                break;
            case "Substantial":
                if(i >= 9){
                    return true;
                }
                break;
            case "Severe":
                if(i >= 8){
                    return true;
                }
                break;
            case "Critical":
                if(i >= 7){
                    return true;
                }
                break;
        }
        return false;
    }

    //Random event tier
    private int getTier(){
        //% Chance to have event from each Tier
        int i = new Random().nextInt(100) + 1;

        if(i < 30){
            //Tier 1
            return 1;
        } else if(i < 55){
            //Tier 2
            return 2;
        } else if(i < 75){
            //Tier 3
            return 3;
        } else if(i < 90){
            //Tier 4
            return 4;
        } else {
            //Tier 5
            return 5;
        }
    }

}

