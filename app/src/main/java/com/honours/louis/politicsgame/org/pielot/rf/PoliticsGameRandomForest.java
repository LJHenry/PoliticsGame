package com.honours.louis.politicsgame.org.pielot.rf;

/*
 * This Class has been generated from text output from Weka 3.8.
 * A RandomForest classifier was run on a Training data set taken from
 * game data and randomly generated data. It had 468 instances balanced
 * across 3 classes. Exactly half were 'positive' and 'negative' events.
 * There are 100 trees in this forest.
 * Using 10 fold cross validation the model had 82% accuracy.
 * Against a test set the model showed 80% accuracy. The model
 * showed good performance. 100% accuracy is not desirable for this game.
 * For 26 gameplay instances, 21 were correctly classified, 5 were
 * incorrectly classified.
 *
 * Python script to_java_source.py available under the MIT license
 * by Martin Pielot: https://github.com/mpielot/androidrf
 *
 */

import java.util.List;

public class PoliticsGameRandomForest extends RandomForest {

private double stability;
private double budget;
private double approval;
private String type;

public void updateFields(double a, double b, double s, String t){
	this.approval = a; this.budget = b; this.stability = s; this.type = t;
}

public String toString() {
StringBuilder b = new StringBuilder();
b.append("MyClass: ");
b.append(MyClass);
b.append(", stability: ");
b.append(stability);
b.append(", approval: ");
b.append(approval);
b.append(", type: ");
b.append(type);
b.append(", budget: ");
b.append(budget);
return b.toString();
}

protected void runClassifiers(List<Prediction> predictions) {
	predictions.add(runTree0());
	predictions.add(runTree1());
	predictions.add(runTree2());
	predictions.add(runTree3());
	predictions.add(runTree4());
	predictions.add(runTree5());
	predictions.add(runTree6());
	predictions.add(runTree7());
	predictions.add(runTree8());
	predictions.add(runTree9());
	predictions.add(runTree10());
	predictions.add(runTree11());
	predictions.add(runTree12());
	predictions.add(runTree13());
	predictions.add(runTree14());
	predictions.add(runTree15());
	predictions.add(runTree16());
	predictions.add(runTree17());
	predictions.add(runTree18());
	predictions.add(runTree19());
	predictions.add(runTree20());
	predictions.add(runTree21());
	predictions.add(runTree22());
	predictions.add(runTree23());
	predictions.add(runTree24());
	predictions.add(runTree25());
	predictions.add(runTree26());
	predictions.add(runTree27());
	predictions.add(runTree28());
	predictions.add(runTree29());
	predictions.add(runTree30());
	predictions.add(runTree31());
	predictions.add(runTree32());
	predictions.add(runTree33());
	predictions.add(runTree34());
	predictions.add(runTree35());
	predictions.add(runTree36());
	predictions.add(runTree37());
	predictions.add(runTree38());
	predictions.add(runTree39());
	predictions.add(runTree40());
	predictions.add(runTree41());
	predictions.add(runTree42());
	predictions.add(runTree43());
	predictions.add(runTree44());
	predictions.add(runTree45());
	predictions.add(runTree46());
	predictions.add(runTree47());
	predictions.add(runTree48());
	predictions.add(runTree49());
	predictions.add(runTree50());
	predictions.add(runTree51());
	predictions.add(runTree52());
	predictions.add(runTree53());
	predictions.add(runTree54());
	predictions.add(runTree55());
	predictions.add(runTree56());
	predictions.add(runTree57());
	predictions.add(runTree58());
	predictions.add(runTree59());
	predictions.add(runTree60());
	predictions.add(runTree61());
	predictions.add(runTree62());
	predictions.add(runTree63());
	predictions.add(runTree64());
	predictions.add(runTree65());
	predictions.add(runTree66());
	predictions.add(runTree67());
	predictions.add(runTree68());
	predictions.add(runTree69());
	predictions.add(runTree70());
	predictions.add(runTree71());
	predictions.add(runTree72());
	predictions.add(runTree73());
	predictions.add(runTree74());
	predictions.add(runTree75());
	predictions.add(runTree76());
	predictions.add(runTree77());
	predictions.add(runTree78());
	predictions.add(runTree79());
	predictions.add(runTree80());
	predictions.add(runTree81());
	predictions.add(runTree82());
	predictions.add(runTree83());
	predictions.add(runTree84());
	predictions.add(runTree85());
	predictions.add(runTree86());
	predictions.add(runTree87());
	predictions.add(runTree88());
	predictions.add(runTree89());
	predictions.add(runTree90());
	predictions.add(runTree91());
	predictions.add(runTree92());
	predictions.add(runTree93());
	predictions.add(runTree94());
	predictions.add(runTree95());
	predictions.add(runTree96());
	predictions.add(runTree97());
	predictions.add(runTree98());
	predictions.add(runTree99());
}

private Prediction runTree0() {
	if( stability < 91.65 ) { 
	if( approval < 90.9 ) { 
	if( approval >= 38.8 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 59.45 ) { 
	if( stability < 67.4 ) { 
	if( approval >= 71.85 ) { 
		if( stability < 56.35 ) { return new Prediction("2", 2, 0); }
		if( stability >= 56.35 ) { return new Prediction("1", 3, 0); }
	}
		if( approval < 71.85 ) { return new Prediction("2", 21, 0); }
	}
	if( stability >= 67.4 ) { 
		if( budget >= 85.2 ) { return new Prediction("2", 2, 0); }
		if( budget < 85.2 ) { return new Prediction("3", 6, 0); }
	}
	}
	if( budget < 59.45 ) { 
	if( stability < 51.2 ) { 
	if( approval >= 48.5 ) { 
		if( budget < 54.15 ) { return new Prediction("1", 20, 0); }
	if( budget >= 54.15 ) { 
		if( approval < 68.05 ) { return new Prediction("2", 1, 0); }
		if( approval >= 68.05 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( approval < 48.5 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 9, 0); }
	if( budget < 48.85 ) { 
		if( approval >= 47.5 ) { return new Prediction("1", 5, 0); }
	if( approval < 47.5 ) { 
		if( budget < 43.25 ) { return new Prediction("1", 4, 0); }
		if( budget >= 43.25 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	if( stability >= 51.2 ) { 
	if( approval >= 51.5 ) { 
		if( approval >= 69.2 ) { return new Prediction("1", 9, 0); }
	if( approval < 69.2 ) { 
		if( budget >= 43.2 ) { return new Prediction("1", 4, 0); }
	if( budget < 43.2 ) { 
		if( stability >= 67.65 ) { return new Prediction("3", 4, 0); }
		if( stability < 67.65 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( approval < 51.5 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 47.4 ) { 
	if( stability < 50.15 ) { 
	if( budget < 49.5 ) { 
	if( approval < 45 ) { 
		if( stability < 43.15 ) { return new Prediction("3", 2, 0); }
		if( stability >= 43.15 ) { return new Prediction("1", 1, 0); }
	}
		if( approval >= 45 ) { return new Prediction("3", 7, 0); }
	}
		if( budget >= 49.5 ) { return new Prediction("3", 32, 0); }
	}
	if( stability >= 50.15 ) { 
	if( approval >= 70.4 ) { 
		if( budget < 70.2 ) { return new Prediction("2", 8, 0); }
		if( budget >= 70.2 ) { return new Prediction("3", 5, 0); }
	}
	if( approval < 70.4 ) { 
		if( budget >= 51.8 ) { return new Prediction("1", 5, 0); }
	if( budget < 51.8 ) { 
	if( approval >= 49 ) { 
		if( approval < 54 ) { return new Prediction("3", 1, 0); }
		if( approval >= 54 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 49 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	if( budget < 47.4 ) { 
	if( stability < 45.65 ) { 
	if( budget >= 22.15 ) { 
	if( approval >= 47.4 ) { 
	if( budget < 44.4 ) { 
		if( budget >= 30.15 ) { return new Prediction("2", 3, 0); }
		if( budget < 30.15 ) { return new Prediction("3", 1, 0); }
	}
		if( budget >= 44.4 ) { return new Prediction("3", 3, 0); }
	}
	if( approval < 47.4 ) { 
		if( stability >= 39.75 ) { return new Prediction("2", 1, 0); }
		if( stability < 39.75 ) { return new Prediction("3", 12, 0); }
	}
	}
		if( budget < 22.15 ) { return new Prediction("2", 8, 0); }
	}
		if( stability >= 45.65 ) { return new Prediction("2", 29, 0); }
	}
	}
	}
	if( approval < 38.8 ) { 
	if( approval >= 1.6 ) { 
	if( approval >= 7.45 ) { 
	if( budget < 51.25 ) { 
		if( budget < 3.65 ) { return new Prediction("1", 8, 0); }
	if( budget >= 3.65 ) { 
	if( stability >= 6.35 ) { 
	if( stability >= 9.05 ) { 
	if( stability < 19.05 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 13.25 ) { return new Prediction("2", 1, 0); }
		if( budget < 13.25 ) { return new Prediction("3", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 5, 0); }
	}
	if( stability >= 19.05 ) { 
	if( approval >= 18.05 ) { 
	if( stability >= 41.3 ) { 
		if( budget >= 32.6 ) { return new Prediction("3", 9, 0); }
	if( budget < 32.6 ) { 
		if( approval < 28.5 ) { return new Prediction("1", 1, 0); }
		if( approval >= 28.5 ) { return new Prediction("2", 5, 0); }
	}
	}
	if( stability < 41.3 ) { 
	if( budget < 40.75 ) { 
	if( budget >= 19.7 ) { 
	if( approval < 23.65 ) { 
		if( approval >= 18.7 ) { return new Prediction("3", 4, 0); }
		if( approval < 18.7 ) { return new Prediction("1", 1, 0); }
	}
	if( approval >= 23.65 ) { 
	if( stability >= 23.55 ) { 
	if( budget >= 32.5 ) { 
	if( approval < 35.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 4, 0); }
	}
	if( approval >= 35.5 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 37.5 ) { 
		if( approval >= 36.5 ) { return new Prediction("1", 4, 2); }
		if( approval < 36.5 ) { return new Prediction("2", 2, 0); }
	}
	if( approval >= 37.5 ) { 
		if( stability < 37.3 ) { return new Prediction("1", 4, 0); }
		if( stability >= 37.3 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 37.5 ) { 
		if( stability < 36.4 ) { return new Prediction("3", 5, 0); }
		if( stability >= 36.4 ) { return new Prediction("1", 2, 0); }
	}
		if( approval >= 37.5 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( budget < 32.5 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 29.9 ) { return new Prediction("1", 3, 0); }
		if( budget >= 29.9 ) { return new Prediction("2", 3, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget >= 27 ) { 
		if( approval < 32 ) { return new Prediction("3", 1, 0); }
		if( approval >= 32 ) { return new Prediction("2", 2, 0); }
	}
		if( budget < 27 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( stability < 23.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 3, 0); }
	}
	}
	}
		if( budget < 19.7 ) { return new Prediction("2", 3, 0); }
	}
	if( budget >= 40.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 7, 0); }
	}
	}
	}
	if( approval < 18.05 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 7, 0); }
	}
	}
	}
	if( stability < 9.05 ) { 
		if( approval >= 9.4 ) { return new Prediction("2", 1, 0); }
		if( approval < 9.4 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( stability < 6.35 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 8, 0); }
	}
	}
	}
	if( budget >= 51.25 ) { 
	if( stability >= 28.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 24, 0); }
	}
		if( stability < 28.4 ) { return new Prediction("2", 4, 0); }
	}
	}
	if( approval < 7.45 ) { 
	if( stability < 7.4 ) { 
	if( budget < 7.3 ) { 
	if( stability >= 6.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 5, 0); }
	}
	if( stability < 6.45 ) { 
		if( approval < 2.25 ) { return new Prediction("3", 2, 0); }
	if( approval >= 2.25 ) { 
	if( approval < 4.3 ) { 
		if( stability < 5.05 ) { return new Prediction("2", 8, 0); }
		if( stability >= 5.05 ) { return new Prediction("1", 2, 0); }
	}
	if( approval >= 4.3 ) { 
	if( approval < 5.5 ) { 
	if( stability < 3.35 ) { 
		if( approval >= 5 ) { return new Prediction("1", 2, 0); }
		if( approval < 5 ) { return new Prediction("3", 5, 0); }
	}
	if( stability >= 3.35 ) { 
		if( budget < 5.4 ) { return new Prediction("1", 4, 0); }
		if( budget >= 5.4 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval >= 5.5 ) { 
		if( stability >= 4.15 ) { return new Prediction("2", 5, 0); }
		if( stability < 4.15 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	}
		if( budget >= 7.3 ) { return new Prediction("2", 8, 0); }
	}
	if( stability >= 7.4 ) { 
	if( stability < 9.3 ) { 
		if( approval < 3.2 ) { return new Prediction("3", 1, 0); }
		if( approval >= 3.2 ) { return new Prediction("2", 8, 0); }
	}
		if( stability >= 9.3 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
		if( approval < 1.6 ) { return new Prediction("1", 7, 0); }
	}
	}
	if( approval >= 90.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 11, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 6, 0); }
	}
	}
	if( stability >= 91.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 10, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 1, 0); }
	}
return null;
}
private Prediction runTree1() {
	if( stability < 91.65 ) { 
	if( approval >= 27.35 ) { 
		if( budget >= 95.8 ) { return new Prediction("2", 11, 0); }
	if( budget < 95.8 ) { 
	if( budget >= 33.35 ) { 
	if( approval < 80.15 ) { 
	if( approval < 57.35 ) { 
	if( budget < 69.7 ) { 
	if( stability < 49.4 ) { 
		if( approval < 30.45 ) { return new Prediction("3", 5, 0); }
	if( approval >= 30.45 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 37.5 ) { 
		if( stability >= 37.6 ) { return new Prediction("3", 3, 0); }
		if( stability < 37.6 ) { return new Prediction("2", 9, 0); }
	}
	if( approval >= 37.5 ) { 
		if( budget < 47.3 ) { return new Prediction("1", 10, 0); }
	if( budget >= 47.3 ) { 
		if( stability < 42.75 ) { return new Prediction("2", 11, 0); }
	if( stability >= 42.75 ) { 
	if( approval >= 48.5 ) { 
		if( budget < 52.85 ) { return new Prediction("1", 6, 0); }
		if( budget >= 52.85 ) { return new Prediction("2", 3, 0); }
	}
	if( approval < 48.5 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 5, 0); }
	if( budget < 48.85 ) { 
		if( approval >= 47.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 47.5 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 36.9 ) { 
	if( budget < 45.55 ) { 
	if( approval < 37.5 ) { 
		if( budget < 36.8 ) { return new Prediction("2", 1, 0); }
		if( budget >= 36.8 ) { return new Prediction("1", 6, 0); }
	}
	if( approval >= 37.5 ) { 
	if( stability >= 39.75 ) { 
		if( approval >= 40.5 ) { return new Prediction("2", 16, 0); }
		if( approval < 40.5 ) { return new Prediction("1", 1, 0); }
	}
	if( stability < 39.75 ) { 
		if( approval >= 39 ) { return new Prediction("3", 3, 0); }
		if( approval < 39 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( budget >= 45.55 ) { 
	if( approval < 45 ) { 
	if( stability < 40.4 ) { 
		if( budget < 47.45 ) { return new Prediction("1", 1, 0); }
		if( budget >= 47.45 ) { return new Prediction("3", 2, 0); }
	}
		if( stability >= 40.4 ) { return new Prediction("1", 9, 0); }
	}
		if( approval >= 45 ) { return new Prediction("3", 9, 0); }
	}
	}
		if( stability < 36.9 ) { return new Prediction("3", 13, 0); }
	}
	}
	}
	if( stability >= 49.4 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 51.85 ) { 
		if( stability < 59.45 ) { return new Prediction("3", 9, 0); }
	if( stability >= 59.45 ) { 
		if( budget < 65.3 ) { return new Prediction("3", 4, 0); }
		if( budget >= 65.3 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( approval >= 51.85 ) { 
	if( approval >= 54.75 ) { 
	if( approval >= 56.25 ) { 
		if( stability < 57 ) { return new Prediction("1", 1, 0); }
		if( stability >= 57 ) { return new Prediction("3", 2, 0); }
	}
		if( approval < 56.25 ) { return new Prediction("3", 2, 0); }
	}
		if( approval < 54.75 ) { return new Prediction("1", 6, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( approval < 56.35 ) { return new Prediction("1", 10, 0); }
	if( approval >= 56.35 ) { 
		if( budget >= 59.3 ) { return new Prediction("1", 2, 0); }
		if( budget < 59.3 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	if( budget >= 69.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 11, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 6, 0); }
	}
	}
	if( approval >= 57.35 ) { 
	if( approval < 68.9 ) { 
	if( budget < 83.3 ) { 
	if( approval < 66.4 ) { 
	if( budget >= 52.95 ) { 
		if( approval < 65.4 ) { return new Prediction("3", 13, 0); }
		if( approval >= 65.4 ) { return new Prediction("2", 2, 0); }
	}
		if( budget < 52.95 ) { return new Prediction("2", 2, 0); }
	}
		if( approval >= 66.4 ) { return new Prediction("3", 11, 0); }
	}
		if( budget >= 83.3 ) { return new Prediction("2", 3, 0); }
	}
	if( approval >= 68.9 ) { 
	if( budget < 54 ) { 
	if( approval >= 75.5 ) { 
		if( stability < 66.9 ) { return new Prediction("2", 2, 0); }
		if( stability >= 66.9 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 75.5 ) { return new Prediction("1", 1, 0); }
	}
		if( budget >= 54 ) { return new Prediction("2", 7, 0); }
	}
	}
	}
	if( approval >= 80.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 16, 0); }
	if( "positive".equals(type) ) { 
		if( stability >= 76.7 ) { return new Prediction("2", 1, 0); }
		if( stability < 76.7 ) { return new Prediction("3", 18, 0); }
	}
	}
	}
	if( budget < 33.35 ) { 
	if( budget >= 27.65 ) { 
		if( stability < 82.85 ) { return new Prediction("2", 17, 0); }
		if( stability >= 82.85 ) { return new Prediction("3", 1, 0); }
	}
	if( budget < 27.65 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 74.3 ) { return new Prediction("1", 6, 0); }
	if( approval < 74.3 ) { 
		if( approval >= 69.1 ) { return new Prediction("3", 1, 0); }
	if( approval < 69.1 ) { 
		if( approval >= 52.95 ) { return new Prediction("1", 8, 0); }
	if( approval < 52.95 ) { 
		if( stability >= 41.7 ) { return new Prediction("3", 2, 0); }
		if( stability < 41.7 ) { return new Prediction("1", 6, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 24.15 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 3, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 6, 0); }
	}
		if( budget < 24.15 ) { return new Prediction("2", 21, 0); }
	}
	}
	}
	}
	}
	if( approval < 27.35 ) { 
	if( approval < 6.9 ) { 
	if( budget < 7.4 ) { 
	if( approval >= 3.05 ) { 
	if( budget >= 5.45 ) { 
		if( budget < 6.3 ) { return new Prediction("3", 3, 0); }
		if( budget >= 6.3 ) { return new Prediction("1", 1, 0); }
	}
	if( budget < 5.45 ) { 
	if( stability >= 2.45 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 5.2 ) { return new Prediction("3", 2, 0); }
	if( approval < 5.2 ) { 
		if( approval >= 3.6 ) { return new Prediction("2", 4, 0); }
		if( approval < 3.6 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 2.95 ) { 
	if( approval >= 4.85 ) { 
		if( budget >= 3.45 ) { return new Prediction("2", 3, 0); }
		if( budget < 3.45 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 4.85 ) { return new Prediction("1", 1, 0); }
	}
		if( budget < 2.95 ) { return new Prediction("2", 6, 0); }
	}
	}
	if( stability < 2.45 ) { 
		if( approval >= 5 ) { return new Prediction("1", 1, 0); }
		if( approval < 5 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( approval < 3.05 ) { 
	if( budget < 3.65 ) { 
		if( approval < 1.9 ) { return new Prediction("1", 1, 0); }
	if( approval >= 1.9 ) { 
		if( approval >= 2.65 ) { return new Prediction("1", 1, 0); }
		if( approval < 2.65 ) { return new Prediction("3", 3, 0); }
	}
	}
		if( budget >= 3.65 ) { return new Prediction("1", 7, 0); }
	}
	}
		if( budget >= 7.4 ) { return new Prediction("2", 11, 0); }
	}
	if( approval >= 6.9 ) { 
	if( stability < 4.35 ) { 
		if( budget >= 3.4 ) { return new Prediction("3", 7, 0); }
		if( budget < 3.4 ) { return new Prediction("1", 6, 0); }
	}
	if( stability >= 4.35 ) { 
	if( stability < 47.65 ) { 
	if( stability >= 8.55 ) { 
	if( approval < 12.2 ) { 
		if( approval >= 10.75 ) { return new Prediction("3", 2, 0); }
	if( approval < 10.75 ) { 
		if( approval >= 9.55 ) { return new Prediction("2", 4, 0); }
	if( approval < 9.55 ) { 
		if( stability < 9.3 ) { return new Prediction("2", 2, 0); }
		if( stability >= 9.3 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	if( approval >= 12.2 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 13.5 ) { return new Prediction("2", 3, 0); }
		if( budget < 13.5 ) { return new Prediction("3", 1, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 19.4 ) { 
		if( budget >= 16.5 ) { return new Prediction("1", 12, 0); }
		if( budget < 16.5 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 19.4 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( stability < 8.55 ) { 
		if( approval >= 9.45 ) { return new Prediction("2", 1, 0); }
	if( approval < 9.45 ) { 
		if( budget >= 9.35 ) { return new Prediction("2", 1, 0); }
		if( budget < 9.35 ) { return new Prediction("1", 20, 0); }
	}
	}
	}
		if( stability >= 47.65 ) { return new Prediction("1", 15, 0); }
	}
	}
	}
	}
		if( stability >= 91.65 ) { return new Prediction("3", 8, 0); }
return null;
}
private Prediction runTree2() {
	if( budget < 38.85 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 7.35 ) { 
	if( stability < 5.6 ) { 
	if( budget < 3.1 ) { 
		if( approval >= 2.65 ) { return new Prediction("1", 4, 0); }
		if( approval < 2.65 ) { return new Prediction("3", 2, 0); }
	}
	if( budget >= 3.1 ) { 
		if( stability < 3.3 ) { return new Prediction("2", 12, 0); }
	if( stability >= 3.3 ) { 
		if( budget >= 6.35 ) { return new Prediction("2", 3, 0); }
		if( budget < 6.35 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( stability >= 5.6 ) { return new Prediction("3", 10, 0); }
	}
	if( approval >= 7.35 ) { 
	if( stability < 34.05 ) { 
	if( stability >= 8.3 ) { 
	if( approval < 23.1 ) { 
	if( approval >= 15 ) { 
		if( approval < 17.1 ) { return new Prediction("1", 1, 0); }
		if( approval >= 17.1 ) { return new Prediction("3", 1, 0); }
	}
	if( approval < 15 ) { 
		if( budget < 10.05 ) { return new Prediction("3", 1, 0); }
		if( budget >= 10.05 ) { return new Prediction("2", 3, 0); }
	}
	}
	if( approval >= 23.1 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 13, 0); }
	if( budget >= 29.9 ) { 
		if( approval < 32.5 ) { return new Prediction("2", 1, 0); }
	if( approval >= 32.5 ) { 
		if( approval < 37.5 ) { return new Prediction("1", 5, 1); }
		if( approval >= 37.5 ) { return new Prediction("1", 7, 0); }
	}
	}
	}
	}
		if( stability < 8.3 ) { return new Prediction("1", 15, 0); }
	}
	if( stability >= 34.05 ) { 
		if( approval < 44.5 ) { return new Prediction("3", 12, 0); }
	if( approval >= 44.5 ) { 
		if( stability < 82.7 ) { return new Prediction("1", 11, 0); }
		if( stability >= 82.7 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 7.4 ) { 
		if( approval >= 6.85 ) { return new Prediction("3", 8, 0); }
	if( approval < 6.85 ) { 
		if( budget < 2.4 ) { return new Prediction("2", 6, 0); }
	if( budget >= 2.4 ) { 
		if( stability < 3.2 ) { return new Prediction("3", 4, 0); }
	if( stability >= 3.2 ) { 
	if( stability < 4.85 ) { 
		if( approval >= 2.45 ) { return new Prediction("2", 3, 0); }
		if( approval < 2.45 ) { return new Prediction("1", 2, 0); }
	}
		if( stability >= 4.85 ) { return new Prediction("1", 15, 0); }
	}
	}
	}
	}
	if( stability >= 7.4 ) { 
	if( approval < 23.05 ) { 
		if( budget >= 16.5 ) { return new Prediction("1", 7, 0); }
		if( budget < 16.5 ) { return new Prediction("2", 15, 0); }
	}
	if( approval >= 23.05 ) { 
	if( budget >= 35.5 ) { 
	if( stability >= 33.25 ) { 
		if( approval < 35.5 ) { return new Prediction("1", 2, 0); }
		if( approval >= 35.5 ) { return new Prediction("2", 12, 0); }
	}
		if( stability < 33.25 ) { return new Prediction("3", 4, 0); }
	}
	if( budget < 35.5 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 31, 0); }
	if( stability < 28.6 ) { 
		if( approval >= 30.95 ) { return new Prediction("3", 3, 0); }
	if( approval < 30.95 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 7, 0); }
		if( budget >= 25.7 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( budget >= 38.85 ) { 
	if( approval < 36.15 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 40.65 ) { return new Prediction("2", 10, 0); }
	if( stability >= 40.65 ) { 
		if( budget >= 61.25 ) { return new Prediction("2", 1, 0); }
		if( budget < 61.25 ) { return new Prediction("3", 8, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( stability >= 27.5 ) { return new Prediction("1", 33, 0); }
		if( stability < 27.5 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( approval >= 36.15 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 72.55 ) { 
		if( budget < 77.5 ) { return new Prediction("1", 13, 0); }
	if( budget >= 77.5 ) { 
		if( approval < 87.5 ) { return new Prediction("2", 3, 0); }
		if( approval >= 87.5 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( approval < 72.55 ) { 
	if( stability < 49.4 ) { 
		if( approval < 37.5 ) { return new Prediction("3", 2, 0); }
	if( approval >= 37.5 ) { 
	if( budget < 49.5 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 7, 0); }
		if( approval < 48.5 ) { return new Prediction("2", 5, 0); }
	}
		if( budget >= 49.5 ) { return new Prediction("2", 15, 0); }
	}
	}
	if( stability >= 49.4 ) { 
	if( budget < 69 ) { 
		if( stability >= 66.25 ) { return new Prediction("3", 8, 0); }
	if( stability < 66.25 ) { 
	if( budget < 57.75 ) { 
	if( stability < 56.85 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 4, 0); }
		if( approval < 51.5 ) { return new Prediction("3", 6, 0); }
	}
		if( stability >= 56.85 ) { return new Prediction("3", 5, 0); }
	}
		if( budget >= 57.75 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( budget >= 69 ) { 
		if( stability >= 83.5 ) { return new Prediction("3", 6, 0); }
		if( stability < 83.5 ) { return new Prediction("2", 9, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 44.4 ) { 
	if( approval >= 38.8 ) { 
		if( budget >= 41.3 ) { return new Prediction("3", 37, 0); }
	if( budget < 41.3 ) { 
		if( approval >= 49 ) { return new Prediction("3", 3, 0); }
		if( approval < 49 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( approval < 38.8 ) { 
		if( approval < 37.15 ) { return new Prediction("3", 3, 0); }
		if( approval >= 37.15 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( stability >= 44.4 ) { 
	if( approval >= 50.2 ) { 
	if( stability < 61.8 ) { 
		if( budget < 44.4 ) { return new Prediction("2", 2, 0); }
	if( budget >= 44.4 ) { 
	if( stability >= 56.2 ) { 
		if( budget >= 69.2 ) { return new Prediction("3", 2, 0); }
		if( budget < 69.2 ) { return new Prediction("2", 2, 0); }
	}
		if( stability < 56.2 ) { return new Prediction("3", 14, 0); }
	}
	}
	if( stability >= 61.8 ) { 
	if( approval >= 67.55 ) { 
		if( budget < 75.55 ) { return new Prediction("2", 11, 0); }
		if( budget >= 75.55 ) { return new Prediction("3", 1, 0); }
	}
	if( approval < 67.55 ) { 
		if( budget >= 67.25 ) { return new Prediction("1", 1, 0); }
		if( budget < 67.25 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( approval < 50.2 ) { 
	if( budget < 47.1 ) { 
		if( approval < 41.5 ) { return new Prediction("1", 1, 0); }
		if( approval >= 41.5 ) { return new Prediction("2", 3, 0); }
	}
	if( budget >= 47.1 ) { 
	if( approval >= 45.7 ) { 
		if( stability >= 49 ) { return new Prediction("1", 4, 0); }
		if( stability < 49 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 45.7 ) { return new Prediction("1", 7, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree3() {
	if( approval < 35.5 ) { 
	if( approval < 7.4 ) { 
	if( approval < 3.25 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 1.25 ) { return new Prediction("3", 2, 0); }
	if( budget >= 1.25 ) { 
		if( approval >= 2.65 ) { return new Prediction("1", 1, 0); }
		if( approval < 2.65 ) { return new Prediction("2", 2, 0); }
	}
	}
		if( "positive".equals(type) ) { return new Prediction("1", 9, 0); }
	}
	if( approval >= 3.25 ) { 
	if( budget < 2.85 ) { 
		if( approval >= 6.95 ) { return new Prediction("3", 2, 0); }
		if( approval < 6.95 ) { return new Prediction("2", 14, 0); }
	}
	if( budget >= 2.85 ) { 
		if( budget < 3.8 ) { return new Prediction("3", 4, 0); }
	if( budget >= 3.8 ) { 
	if( stability >= 6.35 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 6, 0); }
	if( "positive".equals(type) ) { 
		if( approval >= 6.15 ) { return new Prediction("2", 3, 0); }
		if( approval < 6.15 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( stability < 6.35 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 5.2 ) { 
		if( approval < 6.3 ) { return new Prediction("1", 1, 0); }
		if( approval >= 6.3 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 5.2 ) { return new Prediction("2", 7, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability < 4.1 ) { return new Prediction("3", 5, 0); }
		if( stability >= 4.1 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	}
	}
	}
	if( approval >= 7.4 ) { 
	if( budget >= 3.75 ) { 
	if( budget >= 65.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 18, 0); }
	}
	if( budget < 65.5 ) { 
	if( stability >= 4.65 ) { 
	if( stability < 21.4 ) { 
		if( stability < 6.3 ) { return new Prediction("1", 8, 0); }
	if( stability >= 6.3 ) { 
		if( stability >= 19.55 ) { return new Prediction("1", 4, 0); }
	if( stability < 19.55 ) { 
	if( stability >= 8.05 ) { 
		if( budget >= 11.15 ) { return new Prediction("2", 8, 0); }
	if( budget < 11.15 ) { 
		if( stability >= 12.3 ) { return new Prediction("3", 1, 0); }
		if( stability < 12.3 ) { return new Prediction("2", 4, 0); }
	}
	}
	if( stability < 8.05 ) { 
		if( approval >= 9.4 ) { return new Prediction("2", 1, 0); }
		if( approval < 9.4 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	if( stability >= 21.4 ) { 
	if( stability >= 64.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 10, 0); }
	if( "positive".equals(type) ) { 
		if( approval >= 24.7 ) { return new Prediction("2", 3, 0); }
		if( approval < 24.7 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( stability < 64.5 ) { 
	if( budget < 47.3 ) { 
	if( stability < 27.8 ) { 
		if( budget >= 33.55 ) { return new Prediction("3", 2, 0); }
	if( budget < 33.55 ) { 
	if( approval < 29 ) { 
		if( budget >= 22 ) { return new Prediction("2", 1, 0); }
		if( budget < 22 ) { return new Prediction("1", 2, 0); }
	}
		if( approval >= 29 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( stability >= 27.8 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 6, 0); }
	if( "positive".equals(type) ) { 
		if( stability >= 33.3 ) { return new Prediction("1", 3, 0); }
		if( stability < 33.3 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
		if( budget >= 47.3 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
		if( stability < 4.65 ) { return new Prediction("3", 6, 0); }
	}
	}
		if( budget < 3.75 ) { return new Prediction("1", 15, 0); }
	}
	}
	if( approval >= 35.5 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 82.75 ) { 
	if( budget < 69.7 ) { 
	if( stability < 49.4 ) { 
		if( approval >= 54.7 ) { return new Prediction("1", 13, 0); }
	if( approval < 54.7 ) { 
	if( budget >= 39.15 ) { 
		if( stability < 42.75 ) { return new Prediction("2", 22, 0); }
	if( stability >= 42.75 ) { 
	if( budget < 47.45 ) { 
		if( approval >= 42 ) { return new Prediction("1", 2, 0); }
		if( approval < 42 ) { return new Prediction("3", 3, 0); }
	}
	if( budget >= 47.45 ) { 
	if( approval >= 48.5 ) { 
		if( approval >= 50 ) { return new Prediction("2", 2, 0); }
		if( approval < 50 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 48.5 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	if( budget < 39.15 ) { 
	if( approval >= 36.5 ) { 
	if( stability >= 40.45 ) { 
		if( approval >= 42.5 ) { return new Prediction("1", 3, 0); }
		if( approval < 42.5 ) { return new Prediction("3", 2, 0); }
	}
		if( stability < 40.45 ) { return new Prediction("1", 8, 0); }
	}
	if( approval < 36.5 ) { 
		if( budget < 33.9 ) { return new Prediction("3", 2, 0); }
		if( budget >= 33.9 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	}
	if( stability >= 49.4 ) { 
	if( approval >= 51.95 ) { 
	if( budget >= 59.45 ) { 
		if( budget < 64.95 ) { return new Prediction("3", 1, 0); }
		if( budget >= 64.95 ) { return new Prediction("1", 1, 0); }
	}
		if( budget < 59.45 ) { return new Prediction("1", 17, 0); }
	}
	if( approval < 51.95 ) { 
		if( budget >= 66.15 ) { return new Prediction("2", 1, 0); }
		if( budget < 66.15 ) { return new Prediction("3", 17, 0); }
	}
	}
	}
	if( budget >= 69.7 ) { 
	if( budget >= 88.45 ) { 
		if( approval < 89.95 ) { return new Prediction("2", 11, 0); }
		if( approval >= 89.95 ) { return new Prediction("1", 2, 0); }
	}
		if( budget < 88.45 ) { return new Prediction("2", 20, 0); }
	}
	}
		if( stability >= 82.75 ) { return new Prediction("3", 18, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 40.2 ) { 
		if( stability >= 38.05 ) { return new Prediction("2", 39, 0); }
	if( stability < 38.05 ) { 
	if( stability >= 35.5 ) { 
		if( approval >= 43 ) { return new Prediction("3", 1, 0); }
	if( approval < 43 ) { 
		if( budget < 34.4 ) { return new Prediction("2", 1, 0); }
		if( budget >= 34.4 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( stability < 35.5 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 4, 0); }
	if( budget < 31.95 ) { 
		if( stability < 13.9 ) { return new Prediction("3", 2, 0); }
	if( stability >= 13.9 ) { 
		if( stability >= 28 ) { return new Prediction("2", 8, 0); }
	if( stability < 28 ) { 
		if( budget < 21.4 ) { return new Prediction("2", 2, 0); }
		if( budget >= 21.4 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( budget >= 40.2 ) { 
	if( approval >= 47.5 ) { 
		if( stability >= 67.9 ) { return new Prediction("2", 5, 0); }
	if( stability < 67.9 ) { 
	if( budget < 45.8 ) { 
		if( stability >= 26.3 ) { return new Prediction("2", 6, 0); }
		if( stability < 26.3 ) { return new Prediction("3", 1, 0); }
	}
	if( budget >= 45.8 ) { 
		if( budget >= 59 ) { return new Prediction("3", 26, 0); }
	if( budget < 59 ) { 
		if( stability < 53.9 ) { return new Prediction("3", 14, 0); }
	if( stability >= 53.9 ) { 
		if( approval < 66.45 ) { return new Prediction("1", 1, 0); }
		if( approval >= 66.45 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
	if( approval < 47.5 ) { 
	if( stability < 48.15 ) { 
	if( approval < 44.5 ) { 
	if( stability < 40.15 ) { 
	if( budget < 41.45 ) { 
		if( stability >= 36.9 ) { return new Prediction("1", 1, 0); }
		if( stability < 36.9 ) { return new Prediction("3", 3, 0); }
	}
		if( budget >= 41.45 ) { return new Prediction("3", 4, 0); }
	}
		if( stability >= 40.15 ) { return new Prediction("1", 3, 0); }
	}
		if( approval >= 44.5 ) { return new Prediction("3", 9, 0); }
	}
		if( stability >= 48.15 ) { return new Prediction("1", 6, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree4() {
	if( approval < 90.9 ) { 
	if( budget < 93.3 ) { 
	if( stability < 7.5 ) { 
	if( approval >= 2.9 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 7.4 ) { 
	if( stability < 5.25 ) { 
		if( budget < 6.1 ) { return new Prediction("1", 3, 0); }
		if( budget >= 6.1 ) { return new Prediction("2", 4, 0); }
	}
		if( stability >= 5.25 ) { return new Prediction("3", 5, 0); }
	}
		if( approval >= 7.4 ) { return new Prediction("1", 18, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability >= 6.85 ) { return new Prediction("1", 5, 0); }
	if( stability < 6.85 ) { 
		if( budget < 2.85 ) { return new Prediction("2", 7, 0); }
	if( budget >= 2.85 ) { 
	if( stability >= 4.65 ) { 
		if( approval >= 5.05 ) { return new Prediction("2", 4, 0); }
		if( approval < 5.05 ) { return new Prediction("1", 1, 0); }
	}
	if( stability < 4.65 ) { 
		if( approval < 3.8 ) { return new Prediction("1", 1, 0); }
		if( approval >= 3.8 ) { return new Prediction("3", 12, 0); }
	}
	}
	}
	}
	}
		if( approval < 2.9 ) { return new Prediction("1", 12, 0); }
	}
	if( stability >= 7.5 ) { 
	if( stability >= 33.8 ) { 
	if( approval < 67.9 ) { 
	if( approval < 49.7 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 42 ) { 
		if( budget < 47.3 ) { return new Prediction("1", 10, 0); }
	if( budget >= 47.3 ) { 
		if( approval < 47.8 ) { return new Prediction("2", 9, 0); }
	if( approval >= 47.8 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 1, 0); }
	if( approval < 48.5 ) { 
		if( stability < 46.75 ) { return new Prediction("2", 4, 0); }
	if( stability >= 46.75 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 3, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	}
	if( approval < 42 ) { 
	if( budget < 71.9 ) { 
		if( stability < 34.05 ) { return new Prediction("1", 3, 0); }
	if( stability >= 34.05 ) { 
		if( stability >= 37.6 ) { return new Prediction("3", 22, 0); }
	if( stability < 37.6 ) { 
		if( approval >= 27.65 ) { return new Prediction("2", 3, 0); }
		if( approval < 27.65 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
		if( budget >= 71.9 ) { return new Prediction("2", 7, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 39.65 ) { 
		if( approval < 39.25 ) { return new Prediction("1", 27, 0); }
	if( approval >= 39.25 ) { 
	if( budget < 47.1 ) { 
		if( stability < 41.85 ) { return new Prediction("3", 3, 0); }
	if( stability >= 41.85 ) { 
		if( approval < 41.5 ) { return new Prediction("1", 1, 0); }
		if( approval >= 41.5 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( budget >= 47.1 ) { 
	if( stability < 48.9 ) { 
	if( approval < 45 ) { 
		if( approval >= 42 ) { return new Prediction("1", 3, 0); }
	if( approval < 42 ) { 
		if( stability >= 43.9 ) { return new Prediction("1", 1, 0); }
		if( stability < 43.9 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( approval >= 45 ) { return new Prediction("3", 6, 0); }
	}
		if( stability >= 48.9 ) { return new Prediction("1", 9, 0); }
	}
	}
	}
	if( budget < 39.65 ) { 
	if( approval < 35.5 ) { 
		if( budget < 26.75 ) { return new Prediction("2", 2, 0); }
	if( budget >= 26.75 ) { 
	if( stability >= 75.65 ) { 
		if( budget < 29.1 ) { return new Prediction("1", 1, 0); }
		if( budget >= 29.1 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 75.65 ) { return new Prediction("1", 6, 0); }
	}
	}
	if( approval >= 35.5 ) { 
		if( stability >= 34.8 ) { return new Prediction("2", 16, 0); }
	if( stability < 34.8 ) { 
		if( approval < 37 ) { return new Prediction("3", 1, 0); }
		if( approval >= 37 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
	if( approval >= 49.7 ) { 
	if( stability < 81.9 ) { 
	if( budget >= 38.65 ) { 
	if( stability >= 43.4 ) { 
	if( stability >= 50.4 ) { 
	if( approval >= 51.95 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 8, 0); }
	if( approval >= 56.35 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 1, 0); }
	if( budget >= 52.75 ) { 
	if( budget < 65.45 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 57 ) { return new Prediction("1", 3, 0); }
		if( stability >= 57 ) { return new Prediction("3", 3, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 2, 0); }
	}
		if( budget >= 65.45 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
		if( approval < 51.95 ) { return new Prediction("3", 9, 0); }
	}
	if( stability < 50.4 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 52.9 ) { 
		if( stability >= 48 ) { return new Prediction("3", 2, 0); }
		if( stability < 48 ) { return new Prediction("1", 4, 0); }
	}
		if( budget >= 52.9 ) { return new Prediction("2", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 14, 0); }
	}
	}
	if( stability < 43.4 ) { 
		if( approval >= 63.05 ) { return new Prediction("2", 3, 0); }
		if( approval < 63.05 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( budget < 38.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 4, 0); }
	}
	}
	if( stability >= 81.9 ) { 
		if( stability < 94.3 ) { return new Prediction("3", 9, 0); }
	if( stability >= 94.3 ) { 
		if( approval < 59.25 ) { return new Prediction("3", 1, 0); }
		if( approval >= 59.25 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	if( approval >= 67.9 ) { 
	if( budget >= 53.65 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 57.85 ) { 
		if( stability >= 67.55 ) { return new Prediction("2", 1, 0); }
		if( stability < 67.55 ) { return new Prediction("1", 2, 0); }
	}
		if( stability < 57.85 ) { return new Prediction("2", 8, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 70.2 ) { 
		if( stability >= 54.05 ) { return new Prediction("2", 4, 0); }
		if( stability < 54.05 ) { return new Prediction("3", 1, 0); }
	}
		if( budget >= 70.2 ) { return new Prediction("3", 7, 0); }
	}
	}
	if( budget < 53.65 ) { 
	if( budget < 40.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 10, 0); }
	}
	if( budget >= 40.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	if( stability < 33.8 ) { 
	if( approval >= 75.35 ) { 
	if( budget < 54.05 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 1, 0); }
	}
	if( budget >= 54.05 ) { 
		if( approval < 86.8 ) { return new Prediction("3", 4, 0); }
	if( approval >= 86.8 ) { 
		if( approval >= 88.8 ) { return new Prediction("3", 1, 0); }
		if( approval < 88.8 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( approval < 75.35 ) { 
	if( approval >= 35.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 8, 0); }
	if( "positive".equals(type) ) { 
	if( budget >= 22.15 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 15, 0); }
	if( budget < 31.95 ) { 
		if( budget >= 29.35 ) { return new Prediction("2", 1, 0); }
		if( budget < 29.35 ) { return new Prediction("3", 3, 0); }
	}
	}
		if( budget < 22.15 ) { return new Prediction("2", 9, 0); }
	}
	}
	if( approval < 35.2 ) { 
	if( stability >= 25.5 ) { 
	if( budget >= 20 ) { 
		if( approval >= 27.65 ) { return new Prediction("2", 3, 0); }
		if( approval < 27.65 ) { return new Prediction("1", 2, 0); }
	}
		if( budget < 20 ) { return new Prediction("1", 2, 0); }
	}
	if( stability < 25.5 ) { 
	if( budget >= 7.8 ) { 
	if( budget >= 19.7 ) { 
	if( approval >= 12.7 ) { 
	if( budget < 47.3 ) { 
		if( approval >= 28.05 ) { return new Prediction("3", 1, 0); }
	if( approval < 28.05 ) { 
	if( approval < 18.2 ) { 
		if( stability >= 19.1 ) { return new Prediction("3", 1, 0); }
		if( stability < 19.1 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 18.2 ) { return new Prediction("2", 2, 0); }
	}
	}
		if( budget >= 47.3 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 12.7 ) { return new Prediction("2", 5, 0); }
	}
	if( budget < 19.7 ) { 
	if( budget >= 18.75 ) { 
		if( approval >= 22.5 ) { return new Prediction("2", 3, 0); }
		if( approval < 22.5 ) { return new Prediction("1", 2, 0); }
	}
		if( budget < 18.75 ) { return new Prediction("2", 8, 0); }
	}
	}
	if( budget < 7.8 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 7.85 ) { return new Prediction("3", 6, 0); }
		if( approval >= 7.85 ) { return new Prediction("1", 2, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 2.7 ) { return new Prediction("1", 1, 0); }
		if( approval >= 2.7 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
	if( budget >= 93.3 ) { 
		if( approval < 32.4 ) { return new Prediction("1", 4, 0); }
	if( approval >= 32.4 ) { 
		if( stability >= 14 ) { return new Prediction("2", 18, 0); }
		if( stability < 14 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( approval >= 90.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 12, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 5, 0); }
	}
return null;
}
private Prediction runTree5() {
	if( stability < 90.7 ) { 
	if( stability < 7.45 ) { 
	if( stability >= 5.2 ) { 
		if( approval >= 7 ) { return new Prediction("1", 13, 0); }
	if( approval < 7 ) { 
	if( approval < 5.35 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 12, 0); }
	}
	if( approval >= 5.35 ) { 
		if( approval >= 6 ) { return new Prediction("3", 2, 0); }
		if( approval < 6 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( stability < 5.2 ) { 
	if( approval >= 7.5 ) { 
		if( budget >= 6.8 ) { return new Prediction("1", 3, 0); }
	if( budget < 6.8 ) { 
		if( budget < 2.85 ) { return new Prediction("1", 2, 0); }
		if( budget >= 2.85 ) { return new Prediction("3", 6, 0); }
	}
	}
	if( approval < 7.5 ) { 
	if( budget >= 4.05 ) { 
	if( approval >= 1.7 ) { 
		if( budget >= 6.4 ) { return new Prediction("2", 7, 0); }
	if( budget < 6.4 ) { 
		if( approval >= 4.7 ) { return new Prediction("1", 3, 0); }
		if( approval < 4.7 ) { return new Prediction("2", 2, 0); }
	}
	}
		if( approval < 1.7 ) { return new Prediction("1", 3, 0); }
	}
	if( budget < 4.05 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 4.25 ) { return new Prediction("1", 3, 0); }
		if( approval < 4.25 ) { return new Prediction("3", 4, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability < 3.35 ) { 
		if( approval >= 3.95 ) { return new Prediction("3", 5, 0); }
		if( approval < 3.95 ) { return new Prediction("2", 1, 0); }
	}
		if( stability >= 3.35 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
	}
	}
	if( stability >= 7.45 ) { 
	if( budget < 40.55 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 37.5 ) { 
	if( approval < 35.7 ) { 
	if( approval < 28.5 ) { 
		if( approval >= 27.3 ) { return new Prediction("2", 2, 0); }
	if( approval < 27.3 ) { 
		if( budget < 9.3 ) { return new Prediction("3", 7, 0); }
	if( budget >= 9.3 ) { 
		if( stability >= 17.2 ) { return new Prediction("3", 5, 0); }
		if( stability < 17.2 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( approval >= 28.5 ) { 
		if( stability < 31.95 ) { return new Prediction("1", 6, 0); }
		if( stability >= 31.95 ) { return new Prediction("3", 6, 0); }
	}
	}
	if( approval >= 35.7 ) { 
		if( stability < 39.25 ) { return new Prediction("2", 8, 0); }
		if( stability >= 39.25 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval >= 37.5 ) { 
	if( stability >= 39.3 ) { 
	if( approval < 54.9 ) { 
		if( budget >= 37.75 ) { return new Prediction("1", 1, 0); }
		if( budget < 37.75 ) { return new Prediction("3", 6, 0); }
	}
	if( approval >= 54.9 ) { 
		if( budget >= 13.85 ) { return new Prediction("1", 6, 0); }
		if( budget < 13.85 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( stability < 39.3 ) { return new Prediction("1", 6, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 34.25 ) { 
	if( approval < 35.5 ) { 
	if( budget >= 27.1 ) { 
		if( stability >= 75.65 ) { return new Prediction("2", 1, 0); }
		if( stability < 75.65 ) { return new Prediction("1", 4, 0); }
	}
		if( budget < 27.1 ) { return new Prediction("2", 2, 0); }
	}
		if( approval >= 35.5 ) { return new Prediction("2", 33, 0); }
	}
	if( stability < 34.25 ) { 
	if( approval < 31.2 ) { 
	if( budget < 25.7 ) { 
		if( approval < 2.7 ) { return new Prediction("1", 2, 0); }
	if( approval >= 2.7 ) { 
	if( budget >= 16.4 ) { 
	if( approval < 21 ) { 
		if( stability < 15.05 ) { return new Prediction("3", 1, 0); }
		if( stability >= 15.05 ) { return new Prediction("1", 1, 0); }
	}
		if( approval >= 21 ) { return new Prediction("2", 3, 0); }
	}
		if( budget < 16.4 ) { return new Prediction("2", 15, 0); }
	}
	}
	if( budget >= 25.7 ) { 
		if( stability >= 29.65 ) { return new Prediction("1", 5, 0); }
		if( stability < 29.65 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval >= 31.2 ) { 
	if( budget < 33.6 ) { 
	if( approval >= 34.5 ) { 
		if( stability >= 28.65 ) { return new Prediction("2", 6, 0); }
	if( stability < 28.65 ) { 
		if( budget < 18.95 ) { return new Prediction("2", 1, 0); }
		if( budget >= 18.95 ) { return new Prediction("3", 3, 0); }
	}
	}
		if( approval < 34.5 ) { return new Prediction("3", 3, 0); }
	}
		if( budget >= 33.6 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	}
	if( budget >= 40.55 ) { 
	if( stability < 32.2 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 70.8 ) { return new Prediction("2", 16, 0); }
		if( approval >= 70.8 ) { return new Prediction("1", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 19, 0); }
	}
	if( stability >= 32.2 ) { 
	if( approval >= 45.7 ) { 
	if( stability < 61.8 ) { 
	if( budget >= 69.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 10, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 17, 0); }
	}
	if( budget < 69.9 ) { 
	if( approval < 48.15 ) { 
		if( budget >= 55.05 ) { return new Prediction("1", 4, 0); }
	if( budget < 55.05 ) { 
	if( budget >= 48.85 ) { 
	if( budget < 49.5 ) { 
		if( approval >= 47.5 ) { return new Prediction("3", 3, 0); }
	if( approval < 47.5 ) { 
		if( stability >= 49 ) { return new Prediction("1", 1, 0); }
		if( stability < 49 ) { return new Prediction("3", 2, 0); }
	}
	}
		if( budget >= 49.5 ) { return new Prediction("2", 4, 0); }
	}
	if( budget < 48.85 ) { 
		if( stability < 43.55 ) { return new Prediction("2", 4, 0); }
	if( stability >= 43.55 ) { 
		if( budget < 43.25 ) { return new Prediction("1", 1, 0); }
		if( budget >= 43.25 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	}
	if( approval >= 48.15 ) { 
	if( stability < 59.2 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 48 ) { 
	if( approval >= 52 ) { 
		if( stability < 57 ) { return new Prediction("1", 5, 0); }
		if( stability >= 57 ) { return new Prediction("3", 3, 0); }
	}
		if( approval < 52 ) { return new Prediction("3", 6, 0); }
	}
	if( stability < 48 ) { 
		if( approval >= 53 ) { return new Prediction("2", 1, 0); }
		if( approval < 53 ) { return new Prediction("1", 8, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( budget >= 51.9 ) { return new Prediction("3", 8, 0); }
	if( budget < 51.9 ) { 
		if( approval >= 53.5 ) { return new Prediction("2", 1, 0); }
		if( approval < 53.5 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
		if( stability >= 59.2 ) { return new Prediction("1", 6, 0); }
	}
	}
	}
	if( stability >= 61.8 ) { 
	if( stability < 83.55 ) { 
		if( budget < 42.55 ) { return new Prediction("3", 2, 0); }
	if( budget >= 42.55 ) { 
		if( approval >= 91.55 ) { return new Prediction("1", 4, 0); }
	if( approval < 91.55 ) { 
	if( stability >= 69.25 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 70.1 ) { return new Prediction("3", 2, 0); }
		if( approval >= 70.1 ) { return new Prediction("2", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 3, 0); }
	}
	if( stability < 69.25 ) { 
		if( approval >= 84.35 ) { return new Prediction("3", 1, 0); }
	if( approval < 84.35 ) { 
		if( budget >= 59.55 ) { return new Prediction("2", 12, 0); }
	if( budget < 59.55 ) { 
		if( approval >= 76.15 ) { return new Prediction("2", 3, 0); }
		if( approval < 76.15 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( stability >= 83.55 ) { 
		if( approval < 78.05 ) { return new Prediction("3", 5, 0); }
		if( approval >= 78.05 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	if( approval < 45.7 ) { 
	if( budget < 64.1 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 41.25 ) { return new Prediction("2", 3, 0); }
		if( stability >= 41.25 ) { return new Prediction("3", 14, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 39.85 ) { 
	if( approval >= 42 ) { 
		if( budget < 44.95 ) { return new Prediction("2", 1, 0); }
		if( budget >= 44.95 ) { return new Prediction("1", 5, 0); }
	}
		if( approval < 42 ) { return new Prediction("1", 16, 0); }
	}
	if( stability < 39.85 ) { 
		if( approval >= 39 ) { return new Prediction("3", 1, 0); }
	if( approval < 39 ) { 
		if( stability >= 36.9 ) { return new Prediction("1", 3, 0); }
	if( stability < 36.9 ) { 
		if( approval < 26.25 ) { return new Prediction("1", 1, 0); }
		if( approval >= 26.25 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	if( budget >= 64.1 ) { 
	if( budget >= 80.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 16, 0); }
	}
	if( budget < 80.75 ) { 
	if( approval < 40.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 4, 0); }
	}
		if( approval >= 40.15 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	}
	}
	}
	}
		if( stability >= 90.7 ) { return new Prediction("3", 9, 0); }
return null;
}
private Prediction runTree6() {
	if( stability < 90.7 ) { 
	if( stability < 7.45 ) { 
	if( approval < 7.35 ) { 
		if( approval < 2 ) { return new Prediction("1", 6, 0); }
	if( approval >= 2 ) { 
	if( budget >= 1.65 ) { 
	if( budget < 7.3 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 3 ) { 
		if( approval < 5.25 ) { return new Prediction("2", 1, 0); }
		if( approval >= 5.25 ) { return new Prediction("1", 1, 0); }
	}
	if( stability >= 3 ) { 
		if( stability >= 5 ) { return new Prediction("3", 4, 0); }
	if( stability < 5 ) { 
		if( approval >= 3.95 ) { return new Prediction("1", 1, 0); }
		if( approval < 3.95 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 5.35 ) { 
		if( stability >= 2.8 ) { return new Prediction("1", 7, 0); }
		if( stability < 2.8 ) { return new Prediction("3", 2, 0); }
	}
		if( approval >= 5.35 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( budget >= 7.3 ) { 
		if( stability < 3.85 ) { return new Prediction("3", 2, 0); }
		if( stability >= 3.85 ) { return new Prediction("2", 3, 0); }
	}
	}
		if( budget < 1.65 ) { return new Prediction("2", 3, 0); }
	}
	}
	if( approval >= 7.35 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 17, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 7, 0); }
	}
	}
	if( stability >= 7.45 ) { 
	if( approval < 90.9 ) { 
	if( budget < 19.1 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 8.95 ) { 
	if( stability < 64.8 ) { 
	if( budget >= 13.25 ) { 
		if( approval >= 37.8 ) { return new Prediction("1", 2, 0); }
		if( approval < 37.8 ) { return new Prediction("3", 1, 0); }
	}
		if( budget < 13.25 ) { return new Prediction("1", 6, 0); }
	}
		if( stability >= 64.8 ) { return new Prediction("3", 1, 0); }
	}
	if( approval < 8.95 ) { 
		if( budget >= 8.1 ) { return new Prediction("2", 2, 0); }
		if( budget < 8.1 ) { return new Prediction("3", 6, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( approval < 2.7 ) { return new Prediction("1", 2, 0); }
		if( approval >= 2.7 ) { return new Prediction("2", 27, 0); }
	}
	}
	if( budget >= 19.1 ) { 
		if( stability < 13.65 ) { return new Prediction("3", 12, 0); }
	if( stability >= 13.65 ) { 
	if( budget >= 89.4 ) { 
		if( approval >= 41.35 ) { return new Prediction("2", 12, 0); }
	if( approval < 41.35 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 5, 0); }
	}
	}
	if( budget < 89.4 ) { 
	if( approval >= 32.85 ) { 
	if( stability < 59.85 ) { 
	if( stability < 47.65 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 45.8 ) { 
	if( approval >= 36.5 ) { 
		if( approval >= 42.5 ) { return new Prediction("1", 9, 0); }
	if( approval < 42.5 ) { 
	if( budget >= 36.75 ) { 
		if( budget >= 39.2 ) { return new Prediction("3", 1, 0); }
	if( budget < 39.2 ) { 
		if( stability >= 36.55 ) { return new Prediction("3", 3, 0); }
		if( stability < 36.55 ) { return new Prediction("1", 3, 0); }
	}
	}
		if( budget < 36.75 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( approval < 36.5 ) { 
		if( stability >= 37.6 ) { return new Prediction("3", 5, 0); }
	if( stability < 37.6 ) { 
		if( budget < 33.9 ) { return new Prediction("3", 3, 0); }
		if( budget >= 33.9 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	if( budget >= 45.8 ) { 
	if( approval >= 47.5 ) { 
	if( budget >= 50.5 ) { 
		if( approval < 76.5 ) { return new Prediction("2", 11, 0); }
		if( approval >= 76.5 ) { return new Prediction("1", 1, 0); }
	}
	if( budget < 50.5 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 7, 0); }
	if( approval < 48.5 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 2, 0); }
	if( budget < 48.85 ) { 
		if( stability >= 44.3 ) { return new Prediction("1", 1, 0); }
		if( stability < 44.3 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
		if( approval < 47.5 ) { return new Prediction("2", 10, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 38.85 ) { 
	if( stability >= 28 ) { 
		if( budget < 34.2 ) { return new Prediction("2", 14, 0); }
	if( budget >= 34.2 ) { 
	if( approval < 35.5 ) { 
		if( stability >= 35.85 ) { return new Prediction("1", 1, 0); }
		if( stability < 35.85 ) { return new Prediction("3", 1, 0); }
	}
	if( approval >= 35.5 ) { 
		if( stability < 36.6 ) { return new Prediction("3", 3, 0); }
		if( stability >= 36.6 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
		if( stability < 28 ) { return new Prediction("3", 4, 0); }
	}
	if( budget >= 38.85 ) { 
		if( budget >= 47.4 ) { return new Prediction("3", 15, 0); }
	if( budget < 47.4 ) { 
	if( stability < 40.15 ) { 
	if( approval < 38.55 ) { 
		if( budget < 40.75 ) { return new Prediction("3", 2, 0); }
		if( budget >= 40.75 ) { return new Prediction("1", 5, 0); }
	}
		if( approval >= 38.55 ) { return new Prediction("3", 8, 0); }
	}
	if( stability >= 40.15 ) { 
		if( approval < 41.5 ) { return new Prediction("1", 4, 0); }
	if( approval >= 41.5 ) { 
		if( approval >= 51.5 ) { return new Prediction("3", 1, 0); }
		if( approval < 51.5 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( stability >= 47.65 ) { 
	if( budget < 42.8 ) { 
		if( approval >= 64.35 ) { return new Prediction("2", 2, 0); }
		if( approval < 64.35 ) { return new Prediction("3", 5, 0); }
	}
	if( budget >= 42.8 ) { 
	if( stability >= 50.4 ) { 
	if( budget < 74.8 ) { 
	if( approval >= 47.5 ) { 
		if( stability < 51.2 ) { return new Prediction("1", 4, 0); }
	if( stability >= 51.2 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 47.3 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 51.5 ) { return new Prediction("3", 5, 0); }
	}
		if( budget >= 47.3 ) { return new Prediction("3", 8, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 56.35 ) { return new Prediction("1", 2, 0); }
		if( approval >= 56.35 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
		if( approval < 47.5 ) { return new Prediction("1", 6, 0); }
	}
	if( budget >= 74.8 ) { 
		if( approval < 79.65 ) { return new Prediction("2", 1, 0); }
		if( approval >= 79.65 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( stability < 50.4 ) { 
	if( stability >= 47.85 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 52.4 ) { return new Prediction("2", 1, 0); }
		if( budget < 52.4 ) { return new Prediction("3", 3, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 7, 0); }
	}
		if( stability < 47.85 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	if( stability >= 59.85 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 68.5 ) { 
	if( stability < 69.2 ) { 
		if( budget < 54.6 ) { return new Prediction("3", 1, 0); }
		if( budget >= 54.6 ) { return new Prediction("2", 7, 0); }
	}
		if( stability >= 69.2 ) { return new Prediction("3", 9, 0); }
	}
	if( approval >= 68.5 ) { 
		if( budget < 27.2 ) { return new Prediction("3", 1, 0); }
	if( budget >= 27.2 ) { 
		if( budget >= 78.4 ) { return new Prediction("2", 1, 0); }
		if( budget < 78.4 ) { return new Prediction("1", 10, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 71.65 ) { 
	if( budget >= 49.3 ) { 
		if( approval < 67.85 ) { return new Prediction("1", 3, 0); }
		if( approval >= 67.85 ) { return new Prediction("2", 6, 0); }
	}
		if( budget < 49.3 ) { return new Prediction("2", 23, 0); }
	}
	if( budget >= 71.65 ) { 
		if( approval >= 70.4 ) { return new Prediction("3", 1, 0); }
		if( approval < 70.4 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	}
	if( approval < 32.85 ) { 
	if( budget >= 65.5 ) { 
		if( stability < 47.65 ) { return new Prediction("2", 3, 0); }
		if( stability >= 47.65 ) { return new Prediction("1", 8, 0); }
	}
	if( budget < 65.5 ) { 
	if( budget < 32 ) { 
		if( budget >= 28 ) { return new Prediction("1", 4, 0); }
	if( budget < 28 ) { 
	if( stability >= 28.6 ) { 
		if( approval < 19.4 ) { return new Prediction("3", 1, 0); }
		if( approval >= 19.4 ) { return new Prediction("2", 1, 0); }
	}
	if( stability < 28.6 ) { 
	if( budget >= 19.7 ) { 
	if( approval >= 16 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 5, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 23 ) { return new Prediction("1", 2, 0); }
		if( approval >= 23 ) { return new Prediction("3", 3, 0); }
	}
	}
		if( approval < 16 ) { return new Prediction("3", 2, 0); }
	}
		if( budget < 19.7 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	if( budget >= 32 ) { 
	if( stability < 41.9 ) { 
	if( approval >= 29.05 ) { 
		if( stability >= 32.5 ) { return new Prediction("1", 2, 0); }
		if( stability < 32.5 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 29.05 ) { return new Prediction("3", 3, 0); }
	}
		if( stability >= 41.9 ) { return new Prediction("3", 16, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( approval >= 90.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 10, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 8, 0); }
	}
	}
	}
		if( stability >= 90.7 ) { return new Prediction("3", 13, 0); }
return null;
}
private Prediction runTree7() {
	if( approval < 84.75 ) { 
	if( budget < 83.9 ) { 
	if( budget < 36.85 ) { 
	if( budget < 7.35 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 4.5 ) { 
		if( approval < 7.3 ) { return new Prediction("3", 10, 0); }
		if( approval >= 7.3 ) { return new Prediction("1", 9, 0); }
	}
		if( stability < 4.5 ) { return new Prediction("1", 10, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 4.65 ) { 
	if( approval < 5.35 ) { 
		if( stability < 7.4 ) { return new Prediction("1", 9, 0); }
	if( stability >= 7.4 ) { 
		if( budget < 1.75 ) { return new Prediction("1", 1, 0); }
		if( budget >= 1.75 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( approval >= 5.35 ) { return new Prediction("2", 12, 0); }
	}
	if( stability < 4.65 ) { 
	if( approval < 4.15 ) { 
		if( approval >= 2.45 ) { return new Prediction("2", 3, 0); }
		if( approval < 2.45 ) { return new Prediction("1", 1, 0); }
	}
		if( approval >= 4.15 ) { return new Prediction("3", 8, 0); }
	}
	}
	}
	if( budget >= 7.35 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 56.7 ) { return new Prediction("3", 10, 0); }
	if( stability < 56.7 ) { 
	if( approval < 28.5 ) { 
	if( stability < 13.8 ) { 
		if( budget >= 9.05 ) { return new Prediction("2", 9, 0); }
	if( budget < 9.05 ) { 
		if( approval >= 8.1 ) { return new Prediction("1", 2, 0); }
		if( approval < 8.1 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( stability >= 13.8 ) { 
	if( approval < 23.1 ) { 
	if( approval >= 15 ) { 
		if( budget < 16.65 ) { return new Prediction("3", 1, 0); }
		if( budget >= 16.65 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 15 ) { return new Prediction("3", 2, 0); }
	}
	if( approval >= 23.1 ) { 
		if( budget < 26.2 ) { return new Prediction("1", 1, 0); }
		if( budget >= 26.2 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( approval >= 28.5 ) { 
	if( approval < 37 ) { 
		if( approval < 33.5 ) { return new Prediction("1", 2, 0); }
		if( approval >= 33.5 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 37 ) { return new Prediction("1", 12, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 30.75 ) { 
		if( budget >= 27.85 ) { return new Prediction("1", 6, 0); }
	if( budget < 27.85 ) { 
	if( approval >= 18.05 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 4, 0); }
	if( budget >= 25.7 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 2, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( approval < 18.05 ) { 
	if( stability < 15.05 ) { 
	if( budget >= 8.35 ) { 
		if( budget >= 14.15 ) { return new Prediction("3", 1, 0); }
		if( budget < 14.15 ) { return new Prediction("2", 3, 0); }
	}
		if( budget < 8.35 ) { return new Prediction("3", 1, 0); }
	}
		if( stability >= 15.05 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	if( approval >= 30.75 ) { 
		if( approval >= 55.3 ) { return new Prediction("2", 11, 0); }
	if( approval < 55.3 ) { 
		if( stability >= 33 ) { return new Prediction("2", 23, 0); }
	if( stability < 33 ) { 
		if( budget < 18.6 ) { return new Prediction("2", 3, 0); }
	if( budget >= 18.6 ) { 
	if( stability >= 28.65 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 1, 0); }
		if( budget < 31.95 ) { return new Prediction("2", 2, 0); }
	}
		if( stability < 28.65 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( budget >= 36.85 ) { 
	if( stability >= 29.3 ) { 
	if( approval >= 42 ) { 
	if( approval >= 48.5 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 56.4 ) { 
		if( budget >= 58.85 ) { return new Prediction("2", 7, 0); }
	if( budget < 58.85 ) { 
		if( budget < 49.5 ) { return new Prediction("1", 10, 0); }
	if( budget >= 49.5 ) { 
		if( budget < 50.45 ) { return new Prediction("3", 2, 0); }
	if( budget >= 50.45 ) { 
	if( stability < 49.8 ) { 
		if( budget < 52.85 ) { return new Prediction("1", 1, 0); }
		if( budget >= 52.85 ) { return new Prediction("2", 1, 0); }
	}
		if( stability >= 49.8 ) { return new Prediction("1", 7, 0); }
	}
	}
	}
	}
	if( stability >= 56.4 ) { 
		if( approval < 69 ) { return new Prediction("3", 14, 0); }
	if( approval >= 69 ) { 
	if( budget < 71.3 ) { 
		if( stability >= 86.15 ) { return new Prediction("3", 1, 0); }
		if( stability < 86.15 ) { return new Prediction("1", 5, 0); }
	}
		if( budget >= 71.3 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 53.55 ) { 
	if( budget >= 38.4 ) { 
	if( budget < 44.4 ) { 
		if( budget < 40.95 ) { return new Prediction("3", 3, 0); }
		if( budget >= 40.95 ) { return new Prediction("2", 1, 0); }
	}
		if( budget >= 44.4 ) { return new Prediction("3", 18, 0); }
	}
		if( budget < 38.4 ) { return new Prediction("2", 2, 0); }
	}
	if( stability >= 53.55 ) { 
	if( stability >= 78.1 ) { 
		if( budget >= 61.1 ) { return new Prediction("1", 3, 0); }
		if( budget < 61.1 ) { return new Prediction("2", 2, 0); }
	}
		if( stability < 78.1 ) { return new Prediction("2", 11, 0); }
	}
	}
	}
	if( approval < 48.5 ) { 
	if( stability < 50.7 ) { 
	if( budget >= 38.25 ) { 
	if( budget < 49.5 ) { 
		if( stability < 43.55 ) { return new Prediction("2", 4, 0); }
	if( stability >= 43.55 ) { 
	if( budget >= 41.1 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 45.5 ) { 
		if( budget >= 45.15 ) { return new Prediction("2", 1, 0); }
		if( budget < 45.15 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 45.5 ) { return new Prediction("2", 4, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 2, 0); }
	}
		if( budget < 41.1 ) { return new Prediction("2", 5, 0); }
	}
	}
	if( budget >= 49.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 1, 0); }
	}
	}
		if( budget < 38.25 ) { return new Prediction("1", 2, 0); }
	}
	if( stability >= 50.7 ) { 
		if( approval < 47.3 ) { return new Prediction("1", 5, 0); }
	if( approval >= 47.3 ) { 
		if( budget >= 60.25 ) { return new Prediction("2", 1, 0); }
		if( budget < 60.25 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	if( approval < 42 ) { 
	if( budget >= 44.8 ) { 
	if( stability < 78 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 20, 0); }
	}
	if( stability >= 78 ) { 
		if( budget >= 73.3 ) { return new Prediction("1", 1, 0); }
		if( budget < 73.3 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( budget < 44.8 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 40.55 ) { 
		if( stability >= 36.55 ) { return new Prediction("3", 2, 0); }
	if( stability < 36.55 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 3, 0); }
	if( budget < 39.15 ) { 
		if( approval < 37.5 ) { return new Prediction("1", 3, 1); }
		if( approval >= 37.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( budget >= 40.55 ) { 
	if( budget >= 41.1 ) { 
		if( stability < 40.75 ) { return new Prediction("2", 1, 0); }
		if( stability >= 40.75 ) { return new Prediction("3", 4, 0); }
	}
		if( budget < 41.1 ) { return new Prediction("3", 8, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 36.9 ) { 
		if( approval >= 40.5 ) { return new Prediction("2", 1, 0); }
		if( approval < 40.5 ) { return new Prediction("1", 14, 0); }
	}
		if( stability < 36.9 ) { return new Prediction("3", 9, 0); }
	}
	}
	}
	}
	if( stability < 29.3 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 11, 0); }
	}
	}
	}
	if( budget >= 83.9 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 49.45 ) { 
		if( stability >= 76.5 ) { return new Prediction("3", 1, 0); }
		if( stability < 76.5 ) { return new Prediction("2", 9, 0); }
	}
		if( approval >= 49.45 ) { return new Prediction("2", 19, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 60.1 ) { return new Prediction("1", 9, 0); }
		if( approval >= 60.1 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	if( approval >= 84.75 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 89.65 ) { return new Prediction("1", 19, 0); }
		if( stability >= 89.65 ) { return new Prediction("3", 1, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget < 42.8 ) { return new Prediction("2", 3, 0); }
		if( budget >= 42.8 ) { return new Prediction("3", 10, 0); }
	}
	}
return null;
}
private Prediction runTree8() {
	if( stability < 90.35 ) { 
	if( approval >= 35.2 ) { 
	if( approval < 83.2 ) { 
	if( budget >= 93.85 ) { 
		if( approval < 77.55 ) { return new Prediction("2", 13, 0); }
		if( approval >= 77.55 ) { return new Prediction("3", 1, 0); }
	}
	if( budget < 93.85 ) { 
	if( budget >= 41.1 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 49.4 ) { 
	if( budget < 52.9 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 16, 0); }
	if( approval < 48.5 ) { 
		if( budget >= 45.15 ) { return new Prediction("2", 12, 0); }
	if( budget < 45.15 ) { 
		if( approval >= 42 ) { return new Prediction("1", 1, 0); }
	if( approval < 42 ) { 
		if( stability >= 41.65 ) { return new Prediction("3", 1, 0); }
		if( stability < 41.65 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
		if( budget >= 52.9 ) { return new Prediction("2", 11, 0); }
	}
	if( stability >= 49.4 ) { 
	if( budget < 67.8 ) { 
	if( approval >= 51.95 ) { 
		if( stability < 57 ) { return new Prediction("1", 7, 0); }
	if( stability >= 57 ) { 
		if( approval < 69 ) { return new Prediction("3", 6, 0); }
		if( approval >= 69 ) { return new Prediction("1", 4, 0); }
	}
	}
		if( approval < 51.95 ) { return new Prediction("3", 10, 0); }
	}
	if( budget >= 67.8 ) { 
		if( stability >= 75.85 ) { return new Prediction("3", 3, 0); }
	if( stability < 75.85 ) { 
		if( approval < 64.75 ) { return new Prediction("2", 8, 0); }
		if( approval >= 64.75 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 47.5 ) { 
	if( stability < 54.95 ) { 
		if( budget < 45.55 ) { return new Prediction("2", 2, 0); }
	if( budget >= 45.55 ) { 
	if( stability >= 52.2 ) { 
		if( approval >= 65.55 ) { return new Prediction("3", 2, 0); }
		if( approval < 65.55 ) { return new Prediction("1", 1, 0); }
	}
		if( stability < 52.2 ) { return new Prediction("3", 19, 0); }
	}
	}
	if( stability >= 54.95 ) { 
	if( budget >= 68.75 ) { 
		if( budget < 81.75 ) { return new Prediction("1", 1, 0); }
		if( budget >= 81.75 ) { return new Prediction("3", 1, 0); }
	}
	if( budget < 68.75 ) { 
		if( stability >= 57.05 ) { return new Prediction("2", 5, 0); }
		if( stability < 57.05 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( approval < 47.5 ) { 
	if( stability < 44.25 ) { 
	if( approval < 38.55 ) { 
		if( approval >= 36.65 ) { return new Prediction("1", 3, 0); }
		if( approval < 36.65 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 38.55 ) { return new Prediction("3", 6, 0); }
	}
		if( stability >= 44.25 ) { return new Prediction("1", 17, 0); }
	}
	}
	}
	if( budget < 41.1 ) { 
	if( stability >= 32 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 37.15 ) { 
		if( approval < 44.5 ) { return new Prediction("3", 15, 0); }
	if( approval >= 44.5 ) { 
	if( stability < 65.5 ) { 
		if( stability < 54.7 ) { return new Prediction("1", 5, 0); }
	if( stability >= 54.7 ) { 
		if( budget >= 18.45 ) { return new Prediction("3", 1, 0); }
		if( budget < 18.45 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( stability >= 65.5 ) { return new Prediction("3", 6, 0); }
	}
	}
	if( stability < 37.15 ) { 
		if( approval < 37.5 ) { return new Prediction("2", 5, 0); }
		if( approval >= 37.5 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 37.5 ) { 
	if( stability < 36.4 ) { 
		if( stability >= 33.75 ) { return new Prediction("3", 5, 0); }
	if( stability < 33.75 ) { 
		if( budget < 31.35 ) { return new Prediction("2", 1, 0); }
		if( budget >= 31.35 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( stability >= 36.4 ) { 
		if( stability >= 38.55 ) { return new Prediction("2", 6, 0); }
		if( stability < 38.55 ) { return new Prediction("1", 4, 0); }
	}
	}
	if( approval >= 37.5 ) { 
		if( budget < 40.75 ) { return new Prediction("2", 26, 0); }
	if( budget >= 40.75 ) { 
		if( stability >= 42 ) { return new Prediction("2", 3, 0); }
		if( stability < 42 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	if( stability < 32 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 9, 0); }
	}
	}
	}
	}
	if( approval >= 83.2 ) { 
	if( budget >= 54.45 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 84.9 ) { return new Prediction("2", 1, 0); }
		if( approval >= 84.9 ) { return new Prediction("1", 5, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 51.9 ) { 
		if( budget < 68.8 ) { return new Prediction("2", 1, 0); }
		if( budget >= 68.8 ) { return new Prediction("3", 1, 0); }
	}
		if( stability < 51.9 ) { return new Prediction("3", 6, 0); }
	}
	}
		if( budget < 54.45 ) { return new Prediction("1", 13, 0); }
	}
	}
	if( approval < 35.2 ) { 
	if( budget < 50.65 ) { 
	if( stability >= 31.9 ) { 
	if( budget >= 25.25 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 9, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 32.5 ) { return new Prediction("1", 13, 0); }
	if( approval >= 32.5 ) { 
		if( stability < 35.9 ) { return new Prediction("3", 1, 0); }
		if( stability >= 35.9 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	if( budget < 25.25 ) { 
		if( budget < 21.9 ) { return new Prediction("3", 2, 0); }
		if( budget >= 21.9 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( stability < 31.9 ) { 
	if( stability < 3.45 ) { 
	if( budget >= 1.65 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 6 ) { return new Prediction("1", 4, 0); }
	if( approval < 6 ) { 
		if( approval < 2.85 ) { return new Prediction("3", 3, 0); }
		if( approval >= 2.85 ) { return new Prediction("2", 3, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( approval < 3.8 ) { return new Prediction("1", 4, 0); }
		if( approval >= 3.8 ) { return new Prediction("3", 13, 0); }
	}
	}
	if( budget < 1.65 ) { 
		if( approval >= 6.4 ) { return new Prediction("1", 2, 0); }
	if( approval < 6.4 ) { 
		if( budget < 1.45 ) { return new Prediction("2", 2, 0); }
		if( budget >= 1.45 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( stability >= 3.45 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 5.55 ) { 
	if( stability >= 8.55 ) { 
	if( budget >= 16.95 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 4, 0); }
		if( budget >= 29.9 ) { return new Prediction("2", 1, 0); }
	}
	if( budget < 16.95 ) { 
	if( approval < 12.3 ) { 
		if( approval >= 9.55 ) { return new Prediction("2", 2, 0); }
		if( approval < 9.55 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 12.3 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( stability < 8.55 ) { 
		if( budget < 7.3 ) { return new Prediction("1", 19, 0); }
	if( budget >= 7.3 ) { 
		if( approval < 8.25 ) { return new Prediction("2", 1, 0); }
		if( approval >= 8.25 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( approval < 5.55 ) { 
	if( stability >= 4.45 ) { 
		if( budget < 7.7 ) { return new Prediction("3", 8, 0); }
		if( budget >= 7.7 ) { return new Prediction("2", 1, 0); }
	}
	if( stability < 4.45 ) { 
		if( approval < 4.8 ) { return new Prediction("2", 2, 0); }
		if( approval >= 4.8 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 2.9 ) { 
	if( budget >= 16.4 ) { 
		if( approval < 23 ) { return new Prediction("1", 5, 0); }
		if( approval >= 23 ) { return new Prediction("2", 1, 0); }
	}
	if( budget < 16.4 ) { 
	if( stability >= 4.4 ) { 
		if( approval >= 5.05 ) { return new Prediction("2", 21, 0); }
	if( approval < 5.05 ) { 
		if( budget < 3.2 ) { return new Prediction("2", 4, 0); }
		if( budget >= 3.2 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( stability < 4.4 ) { 
		if( budget >= 4.05 ) { return new Prediction("3", 2, 0); }
		if( budget < 4.05 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
		if( approval < 2.9 ) { return new Prediction("1", 7, 0); }
	}
	}
	}
	}
	if( budget >= 50.65 ) { 
	if( stability >= 29.85 ) { 
	if( budget >= 74.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 8, 0); }
	}
		if( budget < 74.15 ) { return new Prediction("1", 11, 0); }
	}
		if( stability < 29.85 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	if( stability >= 90.35 ) { 
		if( budget >= 62.05 ) { return new Prediction("3", 8, 0); }
	if( budget < 62.05 ) { 
		if( budget < 57.95 ) { return new Prediction("3", 6, 0); }
		if( budget >= 57.95 ) { return new Prediction("2", 1, 0); }
	}
	}
return null;
}
private Prediction runTree9() {
	if( approval >= 89.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 14, 0); }
	if( "positive".equals(type) ) { 
		if( budget < 54.65 ) { return new Prediction("2", 1, 0); }
		if( budget >= 54.65 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval < 89.75 ) { 
		if( budget >= 97.65 ) { return new Prediction("2", 8, 0); }
	if( budget < 97.65 ) { 
	if( stability < 82.45 ) { 
	if( stability < 7.45 ) { 
	if( stability >= 6.45 ) { 
		if( approval >= 7.1 ) { return new Prediction("1", 11, 0); }
	if( approval < 7.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 4, 0); }
	}
	}
	if( stability < 6.45 ) { 
	if( approval >= 6.85 ) { 
		if( budget < 3.05 ) { return new Prediction("1", 9, 0); }
	if( budget >= 3.05 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 6, 0); }
	}
	}
	if( approval < 6.85 ) { 
		if( approval < 1.8 ) { return new Prediction("1", 3, 0); }
	if( approval >= 1.8 ) { 
	if( budget < 3.8 ) { 
	if( stability < 5.25 ) { 
	if( stability < 4.55 ) { 
		if( stability >= 3.4 ) { return new Prediction("2", 3, 0); }
	if( stability < 3.4 ) { 
		if( stability < 1.8 ) { return new Prediction("2", 1, 0); }
		if( stability >= 1.8 ) { return new Prediction("3", 7, 0); }
	}
	}
		if( stability >= 4.55 ) { return new Prediction("3", 7, 0); }
	}
	if( stability >= 5.25 ) { 
		if( approval >= 4.35 ) { return new Prediction("2", 1, 0); }
		if( approval < 4.35 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( budget >= 3.8 ) { 
		if( budget >= 7.1 ) { return new Prediction("2", 7, 0); }
	if( budget < 7.1 ) { 
	if( stability < 6.1 ) { 
		if( stability < 3.2 ) { return new Prediction("2", 4, 0); }
	if( stability >= 3.2 ) { 
		if( approval < 5.5 ) { return new Prediction("1", 5, 0); }
	if( approval >= 5.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 3, 0); }
	}
	}
	}
		if( stability >= 6.1 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( stability >= 7.45 ) { 
		if( stability < 8.95 ) { return new Prediction("2", 10, 0); }
	if( stability >= 8.95 ) { 
	if( approval >= 34.7 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 60.8 ) { 
	if( stability < 49.4 ) { 
	if( approval >= 39.5 ) { 
		if( budget < 45.8 ) { return new Prediction("1", 8, 0); }
	if( budget >= 45.8 ) { 
	if( approval >= 48.5 ) { 
		if( stability >= 48.3 ) { return new Prediction("2", 1, 0); }
		if( stability < 48.3 ) { return new Prediction("1", 11, 0); }
	}
		if( approval < 48.5 ) { return new Prediction("2", 10, 0); }
	}
	}
	if( approval < 39.5 ) { 
		if( stability < 35.65 ) { return new Prediction("1", 4, 0); }
	if( stability >= 35.65 ) { 
	if( budget >= 41.1 ) { 
		if( stability >= 41.65 ) { return new Prediction("3", 1, 0); }
		if( stability < 41.65 ) { return new Prediction("2", 2, 0); }
	}
		if( budget < 41.1 ) { return new Prediction("3", 9, 0); }
	}
	}
	}
	if( stability >= 49.4 ) { 
		if( approval < 51.85 ) { return new Prediction("3", 13, 0); }
	if( approval >= 51.85 ) { 
	if( stability >= 68.8 ) { 
		if( approval < 77.3 ) { return new Prediction("3", 4, 0); }
		if( approval >= 77.3 ) { return new Prediction("1", 3, 0); }
	}
		if( stability < 68.8 ) { return new Prediction("1", 9, 0); }
	}
	}
	}
	if( budget >= 60.8 ) { 
	if( approval >= 69.45 ) { 
		if( budget < 77.5 ) { return new Prediction("1", 2, 0); }
		if( budget >= 77.5 ) { return new Prediction("2", 2, 0); }
	}
		if( approval < 69.45 ) { return new Prediction("2", 18, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 40.2 ) { 
		if( approval < 35.5 ) { return new Prediction("3", 6, 0); }
	if( approval >= 35.5 ) { 
	if( budget >= 23.35 ) { 
	if( approval >= 47.4 ) { 
		if( stability < 46.05 ) { return new Prediction("3", 5, 0); }
		if( stability >= 46.05 ) { return new Prediction("2", 2, 0); }
	}
	if( approval < 47.4 ) { 
	if( stability >= 33 ) { 
		if( approval >= 36.5 ) { return new Prediction("2", 8, 0); }
	if( approval < 36.5 ) { 
		if( budget < 33.6 ) { return new Prediction("2", 3, 0); }
	if( budget >= 33.6 ) { 
		if( stability < 39 ) { return new Prediction("3", 1, 0); }
		if( stability >= 39 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( stability < 33 ) { 
	if( approval >= 36.5 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 2, 0); }
		if( budget < 31.95 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 36.5 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
		if( budget < 23.35 ) { return new Prediction("2", 9, 0); }
	}
	}
	if( budget >= 40.2 ) { 
	if( approval >= 40.6 ) { 
	if( stability >= 51.4 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 5, 0); }
	if( approval >= 56.35 ) { 
	if( stability < 61.8 ) { 
		if( budget >= 69.2 ) { return new Prediction("3", 5, 0); }
	if( budget < 69.2 ) { 
	if( approval < 67.1 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 1, 0); }
		if( budget >= 52.75 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 67.1 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( stability >= 61.8 ) { 
		if( budget >= 71.4 ) { return new Prediction("3", 2, 0); }
		if( budget < 71.4 ) { return new Prediction("2", 7, 0); }
	}
	}
	}
	if( stability < 51.4 ) { 
	if( approval < 48.15 ) { 
	if( budget < 47.1 ) { 
		if( stability >= 42 ) { return new Prediction("2", 4, 0); }
		if( stability < 42 ) { return new Prediction("3", 4, 0); }
	}
	if( budget >= 47.1 ) { 
	if( stability < 46.65 ) { 
		if( stability < 45 ) { return new Prediction("3", 3, 0); }
	if( stability >= 45 ) { 
		if( approval < 45 ) { return new Prediction("1", 1, 0); }
		if( approval >= 45 ) { return new Prediction("3", 5, 0); }
	}
	}
		if( stability >= 46.65 ) { return new Prediction("3", 5, 0); }
	}
	}
		if( approval >= 48.15 ) { return new Prediction("3", 22, 0); }
	}
	}
	if( approval < 40.6 ) { 
		if( stability >= 36.9 ) { return new Prediction("1", 12, 0); }
		if( stability < 36.9 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	if( approval < 34.7 ) { 
	if( stability >= 19.55 ) { 
	if( budget < 13.75 ) { 
		if( budget < 13.1 ) { return new Prediction("1", 1, 0); }
		if( budget >= 13.1 ) { return new Prediction("2", 5, 0); }
	}
	if( budget >= 13.75 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 27.75 ) { 
		if( approval < 13.35 ) { return new Prediction("2", 1, 0); }
		if( approval >= 13.35 ) { return new Prediction("1", 9, 0); }
	}
	if( stability >= 27.75 ) { 
		if( budget < 40.8 ) { return new Prediction("3", 7, 0); }
	if( budget >= 40.8 ) { 
		if( stability >= 69.4 ) { return new Prediction("3", 2, 0); }
		if( stability < 69.4 ) { return new Prediction("2", 7, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 32.85 ) { 
		if( stability >= 27.5 ) { return new Prediction("1", 24, 0); }
		if( stability < 27.5 ) { return new Prediction("3", 1, 0); }
	}
	if( budget < 32.85 ) { 
		if( approval < 26.75 ) { return new Prediction("1", 5, 0); }
	if( approval >= 26.75 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 4, 0); }
	if( stability < 28.6 ) { 
		if( stability >= 25 ) { return new Prediction("3", 2, 0); }
	if( stability < 25 ) { 
		if( approval < 30.5 ) { return new Prediction("2", 2, 0); }
		if( approval >= 30.5 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( stability < 19.55 ) { 
	if( stability < 9.8 ) { 
		if( approval >= 8.95 ) { return new Prediction("1", 2, 0); }
		if( approval < 8.95 ) { return new Prediction("3", 3, 0); }
	}
	if( stability >= 9.8 ) { 
		if( approval >= 30.95 ) { return new Prediction("3", 2, 0); }
	if( approval < 30.95 ) { 
	if( approval < 18.2 ) { 
	if( stability < 13.8 ) { 
	if( budget >= 18.75 ) { 
		if( approval >= 12.7 ) { return new Prediction("3", 1, 0); }
		if( approval < 12.7 ) { return new Prediction("2", 1, 0); }
	}
		if( budget < 18.75 ) { return new Prediction("2", 8, 0); }
	}
		if( stability >= 13.8 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 18.2 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( stability >= 82.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 23, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 31.7 ) { return new Prediction("1", 3, 0); }
		if( approval >= 31.7 ) { return new Prediction("2", 8, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree10() {
		if( stability >= 92.55 ) { return new Prediction("3", 8, 0); }
	if( stability < 92.55 ) { 
	if( approval < 29.1 ) { 
	if( budget >= 59.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 15, 0); }
	}
	if( budget < 59.2 ) { 
	if( stability >= 29.05 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 8, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 4, 0); }
	}
	if( stability < 29.05 ) { 
	if( stability < 7.45 ) { 
	if( stability >= 5.75 ) { 
		if( budget < 4.9 ) { return new Prediction("1", 11, 0); }
	if( budget >= 4.9 ) { 
		if( budget < 6 ) { return new Prediction("3", 4, 0); }
	if( budget >= 6 ) { 
		if( budget < 7.6 ) { return new Prediction("1", 6, 0); }
	if( budget >= 7.6 ) { 
		if( budget < 8.5 ) { return new Prediction("3", 1, 0); }
		if( budget >= 8.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( stability < 5.75 ) { 
	if( approval < 5.15 ) { 
	if( approval >= 3.35 ) { 
		if( stability >= 2.2 ) { return new Prediction("2", 9, 0); }
	if( stability < 2.2 ) { 
		if( approval < 4.2 ) { return new Prediction("2", 2, 0); }
		if( approval >= 4.2 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( approval < 3.35 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 2 ) { return new Prediction("2", 1, 0); }
		if( approval >= 2 ) { return new Prediction("3", 3, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget < 2.5 ) { return new Prediction("2", 1, 0); }
		if( budget >= 2.5 ) { return new Prediction("1", 6, 0); }
	}
	}
	}
	if( approval >= 5.15 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 5.55 ) { return new Prediction("1", 17, 0); }
		if( stability >= 5.55 ) { return new Prediction("2", 2, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 7.3 ) { return new Prediction("2", 1, 0); }
		if( approval >= 7.3 ) { return new Prediction("3", 8, 0); }
	}
	}
	}
	}
	if( stability >= 7.45 ) { 
	if( stability >= 19.55 ) { 
	if( approval < 16.05 ) { 
		if( budget >= 19.7 ) { return new Prediction("3", 1, 0); }
		if( budget < 19.7 ) { return new Prediction("1", 4, 0); }
	}
	if( approval >= 16.05 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 29.9 ) { return new Prediction("1", 5, 0); }
		if( budget >= 29.9 ) { return new Prediction("2", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 3, 0); }
	}
	}
	if( stability < 19.55 ) { 
	if( stability < 8.75 ) { 
		if( budget < 6.2 ) { return new Prediction("2", 6, 0); }
		if( budget >= 6.2 ) { return new Prediction("1", 1, 0); }
	}
	if( stability >= 8.75 ) { 
	if( approval >= 5.05 ) { 
		if( approval >= 23.25 ) { return new Prediction("3", 1, 0); }
	if( approval < 23.25 ) { 
		if( budget >= 19.7 ) { return new Prediction("2", 2, 0); }
	if( budget < 19.7 ) { 
	if( stability < 13.8 ) { 
		if( budget >= 16.5 ) { return new Prediction("3", 1, 0); }
	if( budget < 16.5 ) { 
		if( approval >= 8.95 ) { return new Prediction("2", 8, 0); }
	if( approval < 8.95 ) { 
		if( approval >= 7.9 ) { return new Prediction("3", 1, 0); }
		if( approval < 7.9 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
		if( stability >= 13.8 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
		if( approval < 5.05 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( approval >= 29.1 ) { 
		if( stability < 13.45 ) { return new Prediction("3", 11, 0); }
	if( stability >= 13.45 ) { 
	if( approval < 90.9 ) { 
	if( budget < 92.7 ) { 
	if( budget < 37.2 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 31.95 ) { return new Prediction("3", 6, 0); }
	if( approval >= 31.95 ) { 
	if( stability >= 35.7 ) { 
		if( approval < 57.95 ) { return new Prediction("3", 5, 0); }
	if( approval >= 57.95 ) { 
		if( budget < 30.55 ) { return new Prediction("1", 3, 0); }
		if( budget >= 30.55 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( stability < 35.7 ) { return new Prediction("1", 9, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( approval < 30.75 ) { return new Prediction("1", 1, 0); }
	if( approval >= 30.75 ) { 
		if( stability >= 34.25 ) { return new Prediction("2", 29, 0); }
	if( stability < 34.25 ) { 
	if( budget < 32 ) { 
		if( approval >= 34.5 ) { return new Prediction("2", 8, 0); }
		if( approval < 34.5 ) { return new Prediction("3", 1, 0); }
	}
		if( budget >= 32 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	}
	if( budget >= 37.2 ) { 
	if( budget >= 55.95 ) { 
	if( approval >= 38.65 ) { 
	if( budget < 59.25 ) { 
	if( budget < 57.45 ) { 
		if( stability < 54 ) { return new Prediction("3", 5, 0); }
	if( stability >= 54 ) { 
		if( stability < 56.85 ) { return new Prediction("1", 5, 0); }
		if( stability >= 56.85 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( budget >= 57.45 ) { 
		if( approval < 73.6 ) { return new Prediction("1", 2, 0); }
	if( approval >= 73.6 ) { 
		if( budget < 57.95 ) { return new Prediction("1", 1, 0); }
		if( budget >= 57.95 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( budget >= 59.25 ) { 
		if( approval >= 90.6 ) { return new Prediction("2", 3, 0); }
	if( approval < 90.6 ) { 
	if( approval >= 52.65 ) { 
	if( approval < 69.05 ) { 
	if( budget >= 74.15 ) { 
		if( budget >= 74.45 ) { return new Prediction("3", 1, 0); }
		if( budget < 74.45 ) { return new Prediction("1", 2, 0); }
	}
		if( budget < 74.15 ) { return new Prediction("3", 12, 0); }
	}
	if( approval >= 69.05 ) { 
	if( approval >= 79.75 ) { 
		if( stability < 19.65 ) { return new Prediction("1", 1, 0); }
	if( stability >= 19.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 9, 0); }
	}
	}
		if( approval < 79.75 ) { return new Prediction("2", 3, 0); }
	}
	}
	if( approval < 52.65 ) { 
	if( budget >= 62.25 ) { 
	if( budget >= 68.05 ) { 
		if( budget >= 78.4 ) { return new Prediction("3", 1, 0); }
		if( budget < 78.4 ) { return new Prediction("2", 3, 0); }
	}
		if( budget < 68.05 ) { return new Prediction("3", 4, 0); }
	}
		if( budget < 62.25 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	}
	if( approval < 38.65 ) { 
	if( stability < 61.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 4, 0); }
	}
	if( stability >= 61.65 ) { 
		if( budget < 72.6 ) { return new Prediction("3", 2, 0); }
		if( budget >= 72.6 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	if( budget < 55.95 ) { 
	if( approval < 69.8 ) { 
	if( approval >= 48.5 ) { 
	if( stability < 48.85 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 52.85 ) { return new Prediction("1", 12, 0); }
		if( budget >= 52.85 ) { return new Prediction("2", 1, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 50.5 ) { return new Prediction("3", 2, 0); }
	if( approval >= 50.5 ) { 
		if( approval < 52.5 ) { return new Prediction("2", 1, 0); }
		if( approval >= 52.5 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( stability >= 48.85 ) { 
	if( budget >= 51.8 ) { 
		if( approval >= 51.6 ) { return new Prediction("1", 1, 0); }
		if( approval < 51.6 ) { return new Prediction("3", 2, 0); }
	}
		if( budget < 51.8 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( approval < 48.5 ) { 
	if( approval >= 47.5 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 6, 0); }
	if( budget < 48.85 ) { 
		if( stability < 43.55 ) { return new Prediction("2", 2, 0); }
		if( stability >= 43.55 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( budget < 47.1 ) { return new Prediction("2", 5, 0); }
		if( budget >= 47.1 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( approval < 47.5 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 37.6 ) { 
		if( approval < 37.5 ) { return new Prediction("3", 11, 0); }
	if( approval >= 37.5 ) { 
	if( stability < 49.25 ) { 
	if( budget < 43.25 ) { 
		if( budget >= 37.75 ) { return new Prediction("1", 2, 0); }
		if( budget < 37.75 ) { return new Prediction("3", 1, 0); }
	}
		if( budget >= 43.25 ) { return new Prediction("2", 8, 0); }
	}
		if( stability >= 49.25 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( stability < 37.6 ) { 
	if( approval < 37.5 ) { 
	if( budget < 38.55 ) { 
		if( approval >= 36.5 ) { return new Prediction("2", 3, 1); }
		if( approval < 36.5 ) { return new Prediction("2", 1, 0); }
	}
		if( budget >= 38.55 ) { return new Prediction("2", 4, 0); }
	}
		if( approval >= 37.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( stability < 36.4 ) { return new Prediction("3", 5, 0); }
	if( stability >= 36.4 ) { 
	if( budget >= 41.9 ) { 
		if( stability < 44.25 ) { return new Prediction("3", 4, 0); }
	if( stability >= 44.25 ) { 
	if( stability < 46.75 ) { 
		if( approval < 45 ) { return new Prediction("1", 6, 0); }
		if( approval >= 45 ) { return new Prediction("3", 3, 0); }
	}
		if( stability >= 46.75 ) { return new Prediction("1", 6, 0); }
	}
	}
	if( budget < 41.9 ) { 
	if( approval >= 39 ) { 
		if( stability < 39.15 ) { return new Prediction("3", 1, 0); }
		if( stability >= 39.15 ) { return new Prediction("2", 5, 0); }
	}
		if( approval < 39 ) { return new Prediction("1", 6, 0); }
	}
	}
	}
	}
	}
	}
	if( approval >= 69.8 ) { 
	if( stability >= 61.35 ) { 
		if( stability < 66.9 ) { return new Prediction("2", 5, 0); }
	if( stability >= 66.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 3, 0); }
	}
	}
		if( stability < 61.35 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	}
		if( budget >= 92.7 ) { return new Prediction("2", 15, 0); }
	}
	if( approval >= 90.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 11, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree11() {
	if( stability >= 90.75 ) { 
	if( stability >= 94.8 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 94.8 ) { return new Prediction("3", 14, 0); }
	}
	if( stability < 90.75 ) { 
	if( approval < 90.1 ) { 
	if( approval < 27.2 ) { 
	if( stability >= 39.45 ) { 
		if( approval < 12.15 ) { return new Prediction("2", 1, 0); }
		if( approval >= 12.15 ) { return new Prediction("1", 17, 0); }
	}
	if( stability < 39.45 ) { 
	if( approval >= 2.9 ) { 
		if( budget >= 51.9 ) { return new Prediction("2", 5, 0); }
	if( budget < 51.9 ) { 
	if( approval >= 4.25 ) { 
	if( stability < 7.45 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 7.35 ) { 
	if( stability < 5.4 ) { 
		if( stability < 1.95 ) { return new Prediction("1", 2, 0); }
	if( stability >= 1.95 ) { 
		if( budget >= 6.4 ) { return new Prediction("2", 2, 0); }
		if( budget < 6.4 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( stability >= 5.4 ) { return new Prediction("3", 2, 0); }
	}
		if( approval >= 7.35 ) { return new Prediction("1", 10, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 4.4 ) { 
		if( budget < 4.3 ) { return new Prediction("2", 1, 0); }
	if( budget >= 4.3 ) { 
		if( approval < 7.15 ) { return new Prediction("1", 3, 0); }
		if( approval >= 7.15 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( stability < 4.4 ) { return new Prediction("3", 10, 0); }
	}
	}
	if( stability >= 7.45 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 11.25 ) { 
	if( stability >= 16.95 ) { 
	if( approval >= 15 ) { 
		if( approval < 17.1 ) { return new Prediction("1", 1, 0); }
		if( approval >= 17.1 ) { return new Prediction("3", 2, 0); }
	}
		if( approval < 15 ) { return new Prediction("3", 3, 0); }
	}
		if( stability < 16.95 ) { return new Prediction("2", 5, 0); }
	}
	if( budget < 11.25 ) { 
		if( stability >= 9.05 ) { return new Prediction("3", 6, 0); }
		if( stability < 9.05 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( budget >= 16.5 ) { return new Prediction("1", 5, 0); }
		if( budget < 16.5 ) { return new Prediction("2", 12, 0); }
	}
	}
	}
	if( approval < 4.25 ) { 
	if( budget < 3.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 7, 0); }
	}
	if( budget >= 3.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 5, 0); }
	}
	}
	}
	}
	if( approval < 2.9 ) { 
		if( stability >= 8.2 ) { return new Prediction("3", 1, 0); }
		if( stability < 8.2 ) { return new Prediction("1", 8, 0); }
	}
	}
	}
	if( approval >= 27.2 ) { 
	if( budget < 93.3 ) { 
	if( budget < 31.55 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 12.55 ) { 
		if( stability < 72.95 ) { return new Prediction("1", 10, 0); }
		if( stability >= 72.95 ) { return new Prediction("3", 3, 0); }
	}
		if( budget < 12.55 ) { return new Prediction("3", 2, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 28, 0); }
	if( stability < 28.6 ) { 
		if( budget < 20.6 ) { return new Prediction("2", 4, 0); }
	if( budget >= 20.6 ) { 
	if( approval < 30.2 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 1, 0); }
		if( budget >= 25.7 ) { return new Prediction("3", 2, 0); }
	}
		if( approval >= 30.2 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	if( budget >= 31.55 ) { 
	if( stability < 24.4 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 70.7 ) { return new Prediction("1", 1, 0); }
		if( approval < 70.7 ) { return new Prediction("2", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 19, 0); }
	}
	if( stability >= 24.4 ) { 
	if( stability >= 32.25 ) { 
	if( approval < 56.15 ) { 
		if( budget >= 73.6 ) { return new Prediction("1", 9, 0); }
	if( budget < 73.6 ) { 
	if( budget < 69.95 ) { 
	if( approval >= 51.95 ) { 
		if( stability < 47.65 ) { return new Prediction("3", 3, 0); }
	if( stability >= 47.65 ) { 
		if( stability >= 74.65 ) { return new Prediction("3", 1, 0); }
		if( stability < 74.65 ) { return new Prediction("1", 11, 0); }
	}
	}
	if( approval < 51.95 ) { 
	if( stability < 48.85 ) { 
	if( approval >= 48.5 ) { 
	if( budget < 52.85 ) { 
		if( budget >= 38.4 ) { return new Prediction("1", 11, 0); }
		if( budget < 38.4 ) { return new Prediction("2", 1, 0); }
	}
		if( budget >= 52.85 ) { return new Prediction("2", 3, 0); }
	}
	if( approval < 48.5 ) { 
	if( stability >= 38.55 ) { 
	if( budget >= 36.75 ) { 
	if( approval < 37.5 ) { 
	if( stability < 42.6 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 2, 0); }
	}
		if( stability >= 42.6 ) { return new Prediction("3", 12, 0); }
	}
	if( approval >= 37.5 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 45 ) { 
		if( budget < 41.35 ) { return new Prediction("3", 2, 0); }
		if( budget >= 41.35 ) { return new Prediction("2", 6, 0); }
	}
	if( approval >= 45 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 5, 0); }
	if( budget < 48.85 ) { 
	if( approval >= 47.5 ) { 
		if( stability >= 44.3 ) { return new Prediction("1", 2, 0); }
		if( stability < 44.3 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 41.9 ) { 
	if( approval < 45 ) { 
		if( stability >= 42.4 ) { return new Prediction("1", 5, 0); }
		if( stability < 42.4 ) { return new Prediction("3", 3, 0); }
	}
		if( approval >= 45 ) { return new Prediction("3", 11, 0); }
	}
		if( budget < 41.9 ) { return new Prediction("2", 8, 0); }
	}
	}
	}
		if( budget < 36.75 ) { return new Prediction("2", 5, 0); }
	}
	if( stability < 38.55 ) { 
	if( budget < 45.45 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 38.55 ) { return new Prediction("1", 5, 0); }
		if( budget >= 38.55 ) { return new Prediction("2", 1, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval >= 36.5 ) { return new Prediction("3", 7, 0); }
	if( approval < 36.5 ) { 
	if( budget < 40.75 ) { 
		if( approval < 32.5 ) { return new Prediction("1", 3, 0); }
		if( approval >= 32.5 ) { return new Prediction("3", 6, 0); }
	}
		if( budget >= 40.75 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
		if( budget >= 45.45 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( stability >= 48.85 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 14, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 48.9 ) { return new Prediction("1", 4, 0); }
	if( approval >= 48.9 ) { 
		if( approval >= 50.9 ) { return new Prediction("3", 2, 0); }
		if( approval < 50.9 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
		if( budget >= 69.95 ) { return new Prediction("2", 7, 0); }
	}
	}
	if( approval >= 56.15 ) { 
		if( stability >= 78.25 ) { return new Prediction("3", 8, 0); }
	if( stability < 78.25 ) { 
	if( budget >= 55.95 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 67.4 ) { 
		if( budget >= 64.2 ) { return new Prediction("2", 4, 0); }
		if( budget < 64.2 ) { return new Prediction("1", 3, 0); }
	}
		if( stability >= 67.4 ) { return new Prediction("3", 2, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 64.15 ) { 
		if( budget < 57.65 ) { return new Prediction("3", 3, 0); }
		if( budget >= 57.65 ) { return new Prediction("2", 1, 0); }
	}
		if( budget >= 64.15 ) { return new Prediction("3", 12, 0); }
	}
	}
	if( budget < 55.95 ) { 
		if( approval < 78.85 ) { return new Prediction("2", 4, 0); }
	if( approval >= 78.85 ) { 
	if( approval >= 80.8 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 5, 0); }
	}
		if( approval < 80.8 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	if( stability < 32.25 ) { 
	if( budget < 41.6 ) { 
		if( approval >= 59.95 ) { return new Prediction("1", 2, 0); }
		if( approval < 59.95 ) { return new Prediction("3", 2, 0); }
	}
	if( budget >= 41.6 ) { 
		if( approval >= 44.2 ) { return new Prediction("3", 1, 0); }
		if( approval < 44.2 ) { return new Prediction("2", 10, 0); }
	}
	}
	}
	}
	}
		if( budget >= 93.3 ) { return new Prediction("2", 14, 0); }
	}
	}
	if( approval >= 90.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 15, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 9, 0); }
	}
	}
return null;
}
private Prediction runTree12() {
	if( stability < 91.65 ) { 
	if( approval < 90.9 ) { 
		if( stability < 1.3 ) { return new Prediction("1", 5, 0); }
	if( stability >= 1.3 ) { 
		if( stability < 2 ) { return new Prediction("2", 6, 0); }
	if( stability >= 2 ) { 
	if( budget < 67.8 ) { 
	if( budget >= 56.2 ) { 
	if( budget >= 62.6 ) { 
		if( approval < 53.15 ) { return new Prediction("3", 7, 0); }
	if( approval >= 53.15 ) { 
		if( budget >= 65.65 ) { return new Prediction("3", 2, 0); }
		if( budget < 65.65 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( budget < 62.6 ) { 
		if( budget >= 60.95 ) { return new Prediction("1", 2, 0); }
	if( budget < 60.95 ) { 
		if( stability < 54 ) { return new Prediction("3", 10, 0); }
	if( stability >= 54 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 56.85 ) { return new Prediction("1", 1, 0); }
		if( stability >= 56.85 ) { return new Prediction("3", 3, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( budget < 56.2 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 48.9 ) { 
	if( stability < 35.65 ) { 
	if( approval < 5.25 ) { 
	if( stability < 4.3 ) { 
		if( budget >= 3 ) { return new Prediction("2", 9, 0); }
		if( budget < 3 ) { return new Prediction("3", 2, 0); }
	}
	if( stability >= 4.3 ) { 
		if( budget >= 7.75 ) { return new Prediction("2", 1, 0); }
		if( budget < 7.75 ) { return new Prediction("3", 5, 0); }
	}
	}
	if( approval >= 5.25 ) { 
	if( stability >= 9.35 ) { 
	if( budget >= 16 ) { 
	if( approval >= 15 ) { 
	if( budget < 38.55 ) { 
		if( budget >= 37.75 ) { return new Prediction("1", 3, 1); }
		if( budget < 37.75 ) { return new Prediction("1", 10, 0); }
	}
		if( budget >= 38.55 ) { return new Prediction("2", 5, 0); }
	}
	if( approval < 15 ) { 
		if( stability >= 19.1 ) { return new Prediction("3", 2, 0); }
		if( stability < 19.1 ) { return new Prediction("2", 3, 0); }
	}
	}
		if( budget < 16 ) { return new Prediction("3", 6, 0); }
	}
		if( stability < 9.35 ) { return new Prediction("1", 18, 0); }
	}
	}
	if( stability >= 35.65 ) { 
	if( budget >= 44.8 ) { 
	if( stability < 49.25 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 15, 0); }
	if( budget < 48.85 ) { 
	if( approval >= 47.5 ) { 
		if( stability >= 44.3 ) { return new Prediction("1", 1, 0); }
		if( stability < 44.3 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("2", 4, 0); }
	}
	}
		if( stability >= 49.25 ) { return new Prediction("3", 3, 0); }
	}
	if( budget < 44.8 ) { 
		if( approval < 44.5 ) { return new Prediction("3", 24, 0); }
	if( approval >= 44.5 ) { 
		if( approval < 47.9 ) { return new Prediction("1", 2, 0); }
		if( approval >= 47.9 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	if( approval >= 48.9 ) { 
	if( stability < 81.35 ) { 
		if( stability < 51.2 ) { return new Prediction("1", 16, 0); }
	if( stability >= 51.2 ) { 
		if( approval < 54.2 ) { return new Prediction("3", 3, 0); }
	if( approval >= 54.2 ) { 
	if( stability >= 75.8 ) { 
		if( approval < 78.6 ) { return new Prediction("3", 1, 0); }
		if( approval >= 78.6 ) { return new Prediction("1", 2, 0); }
	}
		if( stability < 75.8 ) { return new Prediction("1", 12, 0); }
	}
	}
	}
		if( stability >= 81.35 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 51.1 ) { 
	if( approval < 56.35 ) { 
		if( budget >= 42.5 ) { return new Prediction("1", 8, 0); }
	if( budget < 42.5 ) { 
		if( approval < 28.6 ) { return new Prediction("1", 3, 0); }
		if( approval >= 28.6 ) { return new Prediction("2", 9, 0); }
	}
	}
		if( approval >= 56.35 ) { return new Prediction("2", 18, 0); }
	}
	if( stability < 51.1 ) { 
	if( approval >= 6.15 ) { 
	if( budget < 38.85 ) { 
	if( stability >= 4.4 ) { 
		if( budget < 17.7 ) { return new Prediction("2", 21, 0); }
	if( budget >= 17.7 ) { 
		if( stability >= 35.5 ) { return new Prediction("2", 14, 0); }
	if( stability < 35.5 ) { 
	if( approval < 31.2 ) { 
	if( stability >= 28.6 ) { 
		if( approval < 29 ) { return new Prediction("2", 3, 0); }
		if( approval >= 29 ) { return new Prediction("1", 1, 0); }
	}
	if( stability < 28.6 ) { 
	if( budget < 25.7 ) { 
		if( approval < 21 ) { return new Prediction("1", 1, 0); }
		if( approval >= 21 ) { return new Prediction("2", 1, 0); }
	}
		if( budget >= 25.7 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( approval >= 31.2 ) { 
	if( budget < 32 ) { 
		if( stability < 29.15 ) { return new Prediction("3", 7, 0); }
		if( stability >= 29.15 ) { return new Prediction("2", 5, 0); }
	}
		if( budget >= 32 ) { return new Prediction("3", 7, 0); }
	}
	}
	}
	}
		if( stability < 4.4 ) { return new Prediction("3", 9, 0); }
	}
	if( budget >= 38.85 ) { 
	if( budget < 45.55 ) { 
	if( stability >= 39.75 ) { 
		if( stability >= 45.25 ) { return new Prediction("2", 4, 0); }
	if( stability < 45.25 ) { 
	if( budget >= 39.8 ) { 
	if( stability < 41.5 ) { 
		if( approval >= 42.5 ) { return new Prediction("2", 2, 0); }
		if( approval < 42.5 ) { return new Prediction("1", 1, 0); }
	}
	if( stability >= 41.5 ) { 
		if( approval >= 45.5 ) { return new Prediction("2", 2, 0); }
		if( approval < 45.5 ) { return new Prediction("1", 3, 0); }
	}
	}
		if( budget < 39.8 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( stability < 39.75 ) { 
	if( approval < 38.5 ) { 
		if( approval < 32.05 ) { return new Prediction("3", 3, 0); }
		if( approval >= 32.05 ) { return new Prediction("1", 4, 0); }
	}
		if( approval >= 38.5 ) { return new Prediction("3", 7, 0); }
	}
	}
	if( budget >= 45.55 ) { 
	if( approval < 45 ) { 
		if( approval < 31.05 ) { return new Prediction("3", 2, 0); }
		if( approval >= 31.05 ) { return new Prediction("1", 6, 0); }
	}
		if( approval >= 45 ) { return new Prediction("3", 13, 0); }
	}
	}
	}
	if( approval < 6.15 ) { 
	if( budget < 2.4 ) { 
		if( approval < 2.05 ) { return new Prediction("1", 1, 0); }
		if( approval >= 2.05 ) { return new Prediction("2", 2, 0); }
	}
	if( budget >= 2.4 ) { 
	if( budget < 4.65 ) { 
		if( approval >= 3.5 ) { return new Prediction("3", 1, 0); }
		if( approval < 3.5 ) { return new Prediction("1", 2, 0); }
	}
		if( budget >= 4.65 ) { return new Prediction("1", 7, 0); }
	}
	}
	}
	}
	}
	}
	if( budget >= 67.8 ) { 
	if( approval < 42.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 19, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 23, 0); }
	}
	if( approval >= 42.2 ) { 
	if( approval < 79.4 ) { 
		if( budget < 69.7 ) { return new Prediction("1", 2, 0); }
	if( budget >= 69.7 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 84.55 ) { return new Prediction("2", 20, 0); }
		if( stability >= 84.55 ) { return new Prediction("3", 2, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability < 50.15 ) { return new Prediction("3", 3, 0); }
		if( stability >= 50.15 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( approval >= 79.4 ) { 
		if( approval >= 90.6 ) { return new Prediction("2", 2, 0); }
	if( approval < 90.6 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 10, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( approval >= 90.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 11, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 3, 0); }
	}
	}
		if( stability >= 91.65 ) { return new Prediction("3", 7, 0); }
return null;
}
private Prediction runTree13() {
	if( stability < 90.7 ) { 
	if( approval < 90.9 ) { 
	if( approval < 29.1 ) { 
	if( budget >= 65.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 8, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 16, 0); }
	}
	if( budget < 65.5 ) { 
	if( stability >= 29.05 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 8, 0); }
	}
	if( stability < 29.05 ) { 
	if( stability < 7.25 ) { 
	if( budget < 7.3 ) { 
	if( approval < 9.65 ) { 
	if( approval < 7.15 ) { 
	if( approval < 3 ) { 
		if( budget >= 2.15 ) { return new Prediction("1", 7, 0); }
	if( budget < 2.15 ) { 
		if( approval >= 2.65 ) { return new Prediction("1", 2, 0); }
		if( approval < 2.65 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( approval >= 3 ) { 
	if( approval >= 4.05 ) { 
	if( approval >= 6.05 ) { 
		if( stability >= 6.45 ) { return new Prediction("3", 3, 0); }
		if( stability < 6.45 ) { return new Prediction("2", 2, 0); }
	}
	if( approval < 6.05 ) { 
	if( approval >= 4.6 ) { 
	if( budget >= 2 ) { 
	if( stability >= 3.25 ) { 
		if( budget < 5.35 ) { return new Prediction("1", 3, 0); }
	if( budget >= 5.35 ) { 
		if( budget < 6.3 ) { return new Prediction("3", 3, 0); }
		if( budget >= 6.3 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( stability < 3.25 ) { return new Prediction("3", 2, 0); }
	}
		if( budget < 2 ) { return new Prediction("1", 2, 0); }
	}
	if( approval < 4.6 ) { 
		if( budget < 5.85 ) { return new Prediction("1", 3, 0); }
		if( budget >= 5.85 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( approval < 4.05 ) { 
		if( stability < 4.35 ) { return new Prediction("2", 6, 0); }
		if( stability >= 4.35 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( approval >= 7.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 12, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 4, 0); }
	}
	}
		if( approval >= 9.65 ) { return new Prediction("3", 4, 0); }
	}
	if( budget >= 7.3 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 5, 0); }
	}
	}
	if( stability >= 7.25 ) { 
	if( stability < 8.95 ) { 
		if( approval < 2.7 ) { return new Prediction("1", 1, 0); }
		if( approval >= 2.7 ) { return new Prediction("2", 12, 0); }
	}
	if( stability >= 8.95 ) { 
	if( approval >= 8.95 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 34.6 ) { 
	if( approval < 21 ) { 
		if( approval < 11.7 ) { return new Prediction("1", 3, 0); }
		if( approval >= 11.7 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 21 ) { return new Prediction("1", 4, 0); }
	}
		if( budget >= 34.6 ) { return new Prediction("2", 1, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 25.7 ) { 
	if( approval < 21 ) { 
		if( approval < 11.7 ) { return new Prediction("2", 1, 0); }
		if( approval >= 11.7 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 21 ) { return new Prediction("2", 2, 0); }
	}
	if( budget >= 25.7 ) { 
		if( approval >= 21.05 ) { return new Prediction("3", 1, 0); }
		if( approval < 21.05 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( approval < 8.95 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	if( approval >= 29.1 ) { 
	if( budget < 40.55 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 44.5 ) { 
		if( stability >= 37.15 ) { return new Prediction("3", 9, 0); }
	if( stability < 37.15 ) { 
	if( approval >= 35.2 ) { 
		if( approval < 37.5 ) { return new Prediction("2", 4, 0); }
		if( approval >= 37.5 ) { return new Prediction("1", 2, 0); }
	}
		if( approval < 35.2 ) { return new Prediction("1", 4, 0); }
	}
	}
		if( approval >= 44.5 ) { return new Prediction("1", 16, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 34.25 ) { 
	if( approval < 37 ) { 
		if( budget < 36.8 ) { return new Prediction("2", 10, 0); }
		if( budget >= 36.8 ) { return new Prediction("1", 2, 0); }
	}
		if( approval >= 37 ) { return new Prediction("2", 36, 0); }
	}
	if( stability < 34.25 ) { 
		if( budget >= 27 ) { return new Prediction("3", 8, 0); }
	if( budget < 27 ) { 
		if( stability >= 20 ) { return new Prediction("2", 14, 0); }
	if( stability < 20 ) { 
		if( approval >= 30.95 ) { return new Prediction("3", 3, 0); }
		if( approval < 30.95 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	}
	if( budget >= 40.55 ) { 
	if( budget < 60.5 ) { 
	if( approval < 37.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 7, 0); }
	if( "positive".equals(type) ) { 
		if( stability >= 36.9 ) { return new Prediction("1", 5, 0); }
		if( stability < 36.9 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( approval >= 37.5 ) { 
	if( approval >= 47.5 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 49.4 ) { 
		if( stability >= 48.3 ) { return new Prediction("2", 2, 0); }
	if( stability < 48.3 ) { 
		if( budget < 53.55 ) { return new Prediction("1", 15, 0); }
	if( budget >= 53.55 ) { 
		if( approval < 66.55 ) { return new Prediction("2", 1, 0); }
		if( approval >= 66.55 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( stability >= 49.4 ) { 
	if( approval >= 51.5 ) { 
		if( budget < 53.7 ) { return new Prediction("1", 4, 0); }
	if( budget >= 53.7 ) { 
		if( stability < 57 ) { return new Prediction("1", 2, 0); }
		if( stability >= 57 ) { return new Prediction("3", 3, 0); }
	}
	}
		if( approval < 51.5 ) { return new Prediction("3", 12, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 49.95 ) { 
	if( approval >= 54.5 ) { 
		if( budget < 43.85 ) { return new Prediction("3", 1, 0); }
		if( budget >= 43.85 ) { return new Prediction("2", 3, 0); }
	}
	if( approval < 54.5 ) { 
		if( budget < 44.4 ) { return new Prediction("2", 2, 0); }
		if( budget >= 44.4 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( budget >= 49.95 ) { 
		if( stability < 53.9 ) { return new Prediction("3", 20, 0); }
	if( stability >= 53.9 ) { 
		if( approval < 66.45 ) { return new Prediction("1", 3, 0); }
		if( approval >= 66.45 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	if( approval < 47.5 ) { 
	if( stability < 44.25 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 7, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 38.55 ) { return new Prediction("1", 2, 0); }
		if( approval >= 38.55 ) { return new Prediction("3", 8, 0); }
	}
	}
	if( stability >= 44.25 ) { 
	if( budget >= 48.85 ) { 
		if( approval >= 39.4 ) { return new Prediction("1", 6, 0); }
		if( approval < 39.4 ) { return new Prediction("3", 1, 0); }
	}
	if( budget < 48.85 ) { 
		if( stability < 45.65 ) { return new Prediction("1", 1, 0); }
		if( stability >= 45.65 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
	}
	if( budget >= 60.5 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 74.75 ) { 
		if( stability >= 73.85 ) { return new Prediction("3", 4, 0); }
	if( stability < 73.85 ) { 
		if( stability < 15.7 ) { return new Prediction("1", 2, 0); }
	if( stability >= 15.7 ) { 
		if( approval < 68.05 ) { return new Prediction("2", 8, 0); }
		if( approval >= 68.05 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( budget >= 74.75 ) { return new Prediction("2", 22, 0); }
	}
	if( "positive".equals(type) ) { 
	if( approval < 57.5 ) { 
		if( stability >= 26.65 ) { return new Prediction("1", 8, 0); }
		if( stability < 26.65 ) { return new Prediction("3", 1, 0); }
	}
	if( approval >= 57.5 ) { 
	if( stability >= 58.1 ) { 
		if( budget < 75.55 ) { return new Prediction("2", 4, 0); }
		if( budget >= 75.55 ) { return new Prediction("3", 1, 0); }
	}
		if( stability < 58.1 ) { return new Prediction("3", 11, 0); }
	}
	}
	}
	}
	}
	}
	if( approval >= 90.9 ) { 
	if( budget >= 77.55 ) { 
		if( budget < 97.25 ) { return new Prediction("3", 6, 0); }
		if( budget >= 97.25 ) { return new Prediction("1", 1, 0); }
	}
		if( budget < 77.55 ) { return new Prediction("1", 13, 0); }
	}
	}
	if( stability >= 90.7 ) { 
		if( budget >= 62.05 ) { return new Prediction("3", 11, 0); }
	if( budget < 62.05 ) { 
		if( budget >= 39.65 ) { return new Prediction("2", 1, 0); }
		if( budget < 39.65 ) { return new Prediction("3", 4, 0); }
	}
	}
return null;
}
private Prediction runTree14() {
	if( budget >= 35.85 ) { 
	if( stability >= 78.25 ) { 
	if( budget >= 83 ) { 
		if( approval >= 47.75 ) { return new Prediction("2", 1, 0); }
		if( approval < 47.75 ) { return new Prediction("1", 3, 0); }
	}
	if( budget < 83 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 23, 0); }
	if( "positive".equals(type) ) { 
		if( stability < 84.75 ) { return new Prediction("1", 1, 0); }
		if( stability >= 84.75 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( stability < 78.25 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 69.7 ) { 
	if( approval >= 48.5 ) { 
	if( stability < 49.4 ) { 
		if( budget < 53.5 ) { return new Prediction("1", 17, 0); }
	if( budget >= 53.5 ) { 
		if( budget >= 66 ) { return new Prediction("1", 1, 0); }
		if( budget < 66 ) { return new Prediction("2", 4, 0); }
	}
	}
	if( stability >= 49.4 ) { 
	if( stability < 67.6 ) { 
	if( approval >= 52 ) { 
	if( approval < 63.5 ) { 
		if( stability < 57 ) { return new Prediction("1", 6, 0); }
		if( stability >= 57 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 63.5 ) { return new Prediction("1", 8, 0); }
	}
		if( approval < 52 ) { return new Prediction("3", 7, 0); }
	}
		if( stability >= 67.6 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( approval < 48.5 ) { 
	if( stability >= 41.3 ) { 
		if( approval < 39.1 ) { return new Prediction("3", 12, 0); }
	if( approval >= 39.1 ) { 
	if( budget >= 48.85 ) { 
		if( stability < 48.75 ) { return new Prediction("2", 12, 0); }
	if( stability >= 48.75 ) { 
		if( approval < 43.7 ) { return new Prediction("2", 1, 0); }
		if( approval >= 43.7 ) { return new Prediction("3", 2, 0); }
	}
	}
		if( budget < 48.85 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( stability < 41.3 ) { 
	if( approval >= 36.5 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 6, 0); }
	if( budget < 39.15 ) { 
		if( approval < 37.5 ) { return new Prediction("2", 3, 1); }
		if( approval >= 37.5 ) { return new Prediction("1", 3, 0); }
	}
	}
		if( approval < 36.5 ) { return new Prediction("2", 7, 0); }
	}
	}
	}
	if( budget >= 69.7 ) { 
		if( budget < 98.7 ) { return new Prediction("2", 28, 0); }
		if( budget >= 98.7 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 47.5 ) { 
	if( budget < 55.65 ) { 
		if( stability >= 51.4 ) { return new Prediction("2", 11, 0); }
	if( stability < 51.4 ) { 
	if( budget < 44.4 ) { 
		if( approval < 52.55 ) { return new Prediction("2", 6, 0); }
		if( approval >= 52.55 ) { return new Prediction("3", 4, 0); }
	}
		if( budget >= 44.4 ) { return new Prediction("3", 9, 0); }
	}
	}
	if( budget >= 55.65 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 2, 0); }
		if( approval >= 56.35 ) { return new Prediction("3", 26, 0); }
	}
	}
	if( approval < 47.5 ) { 
	if( budget >= 39.8 ) { 
	if( stability >= 40.6 ) { 
		if( approval < 45 ) { return new Prediction("1", 28, 0); }
	if( approval >= 45 ) { 
		if( stability >= 49 ) { return new Prediction("1", 3, 0); }
		if( stability < 49 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( stability < 40.6 ) { 
		if( stability < 37.45 ) { return new Prediction("3", 9, 0); }
	if( stability >= 37.45 ) { 
		if( approval >= 39 ) { return new Prediction("3", 3, 0); }
		if( approval < 39 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( budget < 39.8 ) { 
		if( approval < 37 ) { return new Prediction("3", 5, 0); }
		if( approval >= 37 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
	}
	if( budget < 35.85 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 4.8 ) { 
		if( approval >= 3.4 ) { return new Prediction("2", 9, 0); }
	if( approval < 3.4 ) { 
		if( stability < 2.15 ) { return new Prediction("1", 1, 0); }
	if( stability >= 2.15 ) { 
		if( approval < 1.9 ) { return new Prediction("2", 1, 0); }
	if( approval >= 1.9 ) { 
		if( budget >= 7.75 ) { return new Prediction("2", 1, 0); }
		if( budget < 7.75 ) { return new Prediction("3", 8, 0); }
	}
	}
	}
	}
	if( approval >= 4.8 ) { 
	if( budget >= 5.25 ) { 
	if( stability >= 4.5 ) { 
	if( stability >= 54.05 ) { 
		if( approval < 65.35 ) { return new Prediction("3", 8, 0); }
		if( approval >= 65.35 ) { return new Prediction("1", 3, 0); }
	}
	if( stability < 54.05 ) { 
	if( approval < 28.5 ) { 
	if( budget >= 16 ) { 
	if( budget >= 19.05 ) { 
		if( budget < 26.2 ) { return new Prediction("1", 1, 0); }
		if( budget >= 26.2 ) { return new Prediction("2", 1, 0); }
	}
		if( budget < 19.05 ) { return new Prediction("2", 3, 0); }
	}
	if( budget < 16 ) { 
		if( budget < 6.6 ) { return new Prediction("3", 4, 0); }
	if( budget >= 6.6 ) { 
		if( approval >= 11.55 ) { return new Prediction("3", 2, 0); }
		if( approval < 11.55 ) { return new Prediction("1", 6, 0); }
	}
	}
	}
		if( approval >= 28.5 ) { return new Prediction("1", 16, 0); }
	}
	}
		if( stability < 4.5 ) { return new Prediction("2", 4, 0); }
	}
	if( budget < 5.25 ) { 
		if( stability >= 9.35 ) { return new Prediction("3", 1, 0); }
		if( stability < 9.35 ) { return new Prediction("1", 28, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 30.75 ) { 
		if( stability >= 32.25 ) { return new Prediction("1", 9, 0); }
	if( stability < 32.25 ) { 
	if( stability < 3.1 ) { 
	if( budget >= 2 ) { 
		if( approval >= 2.9 ) { return new Prediction("3", 8, 0); }
		if( approval < 2.9 ) { return new Prediction("1", 1, 0); }
	}
		if( budget < 2 ) { return new Prediction("2", 1, 0); }
	}
	if( stability >= 3.1 ) { 
	if( budget >= 5.75 ) { 
	if( approval >= 6.95 ) { 
	if( stability >= 7.9 ) { 
	if( stability >= 22.85 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 1, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 3, 0); }
	}
	if( stability < 22.85 ) { 
		if( stability < 18.55 ) { return new Prediction("2", 6, 0); }
	if( stability >= 18.55 ) { 
		if( approval >= 23.5 ) { return new Prediction("2", 1, 0); }
		if( approval < 23.5 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
		if( stability < 7.9 ) { return new Prediction("3", 3, 0); }
	}
		if( approval < 6.95 ) { return new Prediction("1", 6, 0); }
	}
	if( budget < 5.75 ) { 
	if( approval >= 2.9 ) { 
		if( approval >= 4.25 ) { return new Prediction("2", 14, 0); }
	if( approval < 4.25 ) { 
		if( budget < 3.55 ) { return new Prediction("2", 5, 0); }
		if( budget >= 3.55 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( approval < 2.9 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	}
	if( approval >= 30.75 ) { 
	if( budget >= 20.3 ) { 
	if( approval >= 44.8 ) { 
		if( stability >= 28 ) { return new Prediction("2", 3, 0); }
		if( stability < 28 ) { return new Prediction("3", 3, 0); }
	}
	if( approval < 44.8 ) { 
		if( stability >= 33 ) { return new Prediction("2", 17, 0); }
	if( stability < 33 ) { 
	if( approval >= 34.7 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 1, 0); }
		if( budget < 31.95 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 34.7 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
		if( budget < 20.3 ) { return new Prediction("2", 9, 0); }
	}
	}
	}
return null;
}
private Prediction runTree15() {
	if( approval >= 27.35 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 81.5 ) { 
	if( budget < 69.7 ) { 
	if( approval >= 54.7 ) { 
		if( stability >= 72.9 ) { return new Prediction("3", 1, 0); }
	if( stability < 72.9 ) { 
		if( budget < 55 ) { return new Prediction("1", 26, 0); }
	if( budget >= 55 ) { 
	if( approval < 63.5 ) { 
		if( stability < 57 ) { return new Prediction("1", 1, 0); }
		if( stability >= 57 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 63.5 ) { return new Prediction("1", 7, 0); }
	}
	}
	}
	if( approval < 54.7 ) { 
		if( stability >= 50.9 ) { return new Prediction("3", 15, 0); }
	if( stability < 50.9 ) { 
	if( budget < 52.85 ) { 
	if( approval >= 47.5 ) { 
		if( stability < 48.75 ) { return new Prediction("1", 14, 0); }
	if( stability >= 48.75 ) { 
		if( budget < 50.45 ) { return new Prediction("3", 1, 0); }
		if( budget >= 50.45 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( approval < 47.5 ) { 
	if( budget >= 36.75 ) { 
		if( approval < 35.5 ) { return new Prediction("3", 3, 0); }
	if( approval >= 35.5 ) { 
	if( budget >= 39.15 ) { 
		if( stability < 39.95 ) { return new Prediction("2", 6, 0); }
	if( stability >= 39.95 ) { 
		if( approval >= 40 ) { return new Prediction("2", 2, 0); }
		if( approval < 40 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( budget < 39.15 ) { 
	if( stability < 39.25 ) { 
		if( stability >= 34.75 ) { return new Prediction("2", 4, 0); }
	if( stability < 34.75 ) { 
		if( approval < 37.5 ) { return new Prediction("1", 2, 1); }
		if( approval >= 37.5 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( stability >= 39.25 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( budget < 36.75 ) { 
	if( approval >= 35.2 ) { 
		if( approval < 37 ) { return new Prediction("3", 1, 0); }
		if( approval >= 37 ) { return new Prediction("1", 3, 0); }
	}
		if( approval < 35.2 ) { return new Prediction("1", 7, 0); }
	}
	}
	}
		if( budget >= 52.85 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
	if( budget >= 69.7 ) { 
		if( approval >= 86.95 ) { return new Prediction("1", 4, 0); }
		if( approval < 86.95 ) { return new Prediction("2", 24, 0); }
	}
	}
		if( stability >= 81.5 ) { return new Prediction("3", 19, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability < 61.8 ) { 
	if( budget < 38.85 ) { 
	if( stability >= 32.95 ) { 
	if( approval >= 33 ) { 
		if( approval >= 36.5 ) { return new Prediction("2", 17, 0); }
	if( approval < 36.5 ) { 
		if( stability >= 35.5 ) { return new Prediction("2", 3, 0); }
	if( stability < 35.5 ) { 
		if( budget >= 32.95 ) { return new Prediction("3", 1, 0); }
		if( budget < 32.95 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
		if( approval < 33 ) { return new Prediction("1", 2, 0); }
	}
	if( stability < 32.95 ) { 
		if( budget < 20.6 ) { return new Prediction("2", 6, 0); }
	if( budget >= 20.6 ) { 
	if( approval < 30.2 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 3, 0); }
	if( budget >= 25.7 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 2, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 3, 0); }
	}
	}
		if( approval >= 30.2 ) { return new Prediction("3", 8, 0); }
	}
	}
	}
	if( budget >= 38.85 ) { 
	if( stability < 40.4 ) { 
		if( approval >= 38.05 ) { return new Prediction("3", 32, 0); }
	if( approval < 38.05 ) { 
		if( stability < 36.4 ) { return new Prediction("3", 9, 0); }
		if( stability >= 36.4 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( stability >= 40.4 ) { 
	if( approval >= 45.7 ) { 
		if( budget < 45.55 ) { return new Prediction("2", 5, 0); }
	if( budget >= 45.55 ) { 
	if( stability >= 51.15 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 8, 0); }
	if( approval >= 56.35 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 1, 0); }
		if( budget >= 52.75 ) { return new Prediction("3", 5, 0); }
	}
	}
		if( stability < 51.15 ) { return new Prediction("3", 24, 0); }
	}
	}
	if( approval < 45.7 ) { 
	if( budget < 43.4 ) { 
		if( approval >= 39.5 ) { return new Prediction("2", 1, 0); }
		if( approval < 39.5 ) { return new Prediction("1", 2, 0); }
	}
		if( budget >= 43.4 ) { return new Prediction("1", 13, 0); }
	}
	}
	}
	}
	if( stability >= 61.8 ) { 
		if( budget < 70.35 ) { return new Prediction("2", 26, 0); }
		if( budget >= 70.35 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	if( approval < 27.35 ) { 
	if( approval < 14.75 ) { 
	if( stability < 8.75 ) { 
	if( approval >= 3.05 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 6.9 ) { 
		if( stability >= 4.45 ) { return new Prediction("3", 7, 0); }
	if( stability < 4.45 ) { 
		if( approval < 5.15 ) { return new Prediction("2", 8, 0); }
	if( approval >= 5.15 ) { 
		if( budget < 6.9 ) { return new Prediction("1", 2, 0); }
		if( budget >= 6.9 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( approval >= 6.9 ) { 
		if( budget >= 9.4 ) { return new Prediction("2", 1, 0); }
		if( budget < 9.4 ) { return new Prediction("1", 23, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 5.95 ) { 
		if( approval >= 5.55 ) { return new Prediction("2", 7, 0); }
		if( approval < 5.55 ) { return new Prediction("1", 3, 0); }
	}
	if( stability < 5.95 ) { 
		if( approval < 4.15 ) { return new Prediction("2", 3, 0); }
	if( approval >= 4.15 ) { 
	if( stability >= 4.7 ) { 
		if( approval < 7.05 ) { return new Prediction("1", 1, 0); }
		if( approval >= 7.05 ) { return new Prediction("3", 1, 0); }
	}
		if( stability < 4.7 ) { return new Prediction("3", 16, 0); }
	}
	}
	}
	}
	if( approval < 3.05 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 2.65 ) { return new Prediction("1", 1, 0); }
	if( approval < 2.65 ) { 
		if( budget < 5.7 ) { return new Prediction("3", 3, 0); }
		if( budget >= 5.7 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( "positive".equals(type) ) { return new Prediction("1", 14, 0); }
	}
	}
	if( stability >= 8.75 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 63.25 ) { return new Prediction("3", 13, 0); }
		if( budget >= 63.25 ) { return new Prediction("2", 2, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability < 14.3 ) { return new Prediction("2", 2, 0); }
		if( stability >= 14.3 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	if( approval >= 14.75 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 21.55 ) { return new Prediction("2", 3, 0); }
	if( approval < 21.55 ) { 
		if( budget < 20.5 ) { return new Prediction("1", 1, 0); }
		if( budget >= 20.5 ) { return new Prediction("3", 2, 0); }
	}
	}
		if( "positive".equals(type) ) { return new Prediction("1", 19, 0); }
	}
	}
return null;
}
private Prediction runTree16() {
	if( approval >= 27.35 ) { 
	if( approval >= 91.05 ) { 
		if( stability >= 62.8 ) { return new Prediction("1", 6, 0); }
	if( stability < 62.8 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 9, 0); }
	}
	}
	if( approval < 91.05 ) { 
	if( stability < 91.7 ) { 
	if( budget < 85.4 ) { 
	if( budget < 36.85 ) { 
	if( budget >= 13.35 ) { 
	if( approval < 69.8 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 35.7 ) { 
		if( budget < 19.75 ) { return new Prediction("1", 2, 0); }
		if( budget >= 19.75 ) { return new Prediction("3", 8, 0); }
	}
	if( stability < 35.7 ) { 
		if( approval >= 33 ) { return new Prediction("1", 5, 0); }
		if( approval < 33 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 34.6 ) { 
	if( budget < 33.6 ) { 
		if( stability >= 28 ) { return new Prediction("2", 5, 0); }
	if( stability < 28 ) { 
		if( budget >= 24.15 ) { return new Prediction("3", 3, 0); }
	if( budget < 24.15 ) { 
		if( approval < 30.7 ) { return new Prediction("2", 3, 0); }
		if( approval >= 30.7 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( budget >= 33.6 ) { 
		if( approval >= 33 ) { return new Prediction("3", 2, 0); }
		if( approval < 33 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( stability >= 34.6 ) { return new Prediction("2", 20, 0); }
	}
	}
	if( approval >= 69.8 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 10, 0); }
	}
	}
		if( budget < 13.35 ) { return new Prediction("3", 5, 0); }
	}
	if( budget >= 36.85 ) { 
	if( stability >= 28.7 ) { 
	if( budget < 71.65 ) { 
	if( budget < 59.25 ) { 
	if( approval < 35.5 ) { 
	if( stability >= 38.55 ) { 
		if( approval < 30.55 ) { return new Prediction("3", 2, 0); }
	if( approval >= 30.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 3, 0); }
	}
	}
		if( stability < 38.55 ) { return new Prediction("3", 5, 0); }
	}
	if( approval >= 35.5 ) { 
	if( budget >= 40.05 ) { 
	if( budget >= 43.75 ) { 
	if( budget < 45.8 ) { 
		if( approval < 37.5 ) { return new Prediction("1", 1, 0); }
		if( approval >= 37.5 ) { return new Prediction("2", 6, 0); }
	}
	if( budget >= 45.8 ) { 
	if( approval >= 48.5 ) { 
	if( budget < 48.95 ) { 
	if( budget < 47.3 ) { 
		if( stability < 42.2 ) { return new Prediction("3", 2, 0); }
	if( stability >= 42.2 ) { 
	if( approval >= 50 ) { 
	if( stability >= 48.45 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 51.5 ) { return new Prediction("3", 2, 0); }
	}
		if( stability < 48.45 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 50 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( budget >= 47.3 ) { return new Prediction("3", 5, 0); }
	}
	if( budget >= 48.95 ) { 
		if( approval < 50.5 ) { return new Prediction("1", 7, 0); }
	if( approval >= 50.5 ) { 
	if( approval >= 52 ) { 
	if( stability >= 50.4 ) { 
	if( stability < 57 ) { 
		if( budget < 49.95 ) { return new Prediction("2", 1, 0); }
		if( budget >= 49.95 ) { return new Prediction("1", 6, 0); }
	}
	if( stability >= 57 ) { 
		if( approval < 63.5 ) { return new Prediction("3", 5, 0); }
		if( approval >= 63.5 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( stability < 50.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 4, 0); }
	}
	}
	if( approval < 52 ) { 
		if( stability < 48.85 ) { return new Prediction("2", 1, 0); }
		if( stability >= 48.85 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	if( approval < 48.5 ) { 
	if( budget < 49.5 ) { 
		if( budget < 47.45 ) { return new Prediction("1", 2, 0); }
	if( budget >= 47.45 ) { 
		if( stability >= 51 ) { return new Prediction("1", 2, 0); }
	if( stability < 51 ) { 
	if( stability < 46.75 ) { 
		if( stability < 43.15 ) { return new Prediction("3", 1, 0); }
	if( stability >= 43.15 ) { 
		if( approval < 45 ) { return new Prediction("1", 3, 0); }
		if( approval >= 45 ) { return new Prediction("3", 4, 0); }
	}
	}
		if( stability >= 46.75 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	if( budget >= 49.5 ) { 
		if( stability < 48.5 ) { return new Prediction("2", 11, 0); }
	if( stability >= 48.5 ) { 
		if( budget < 53.25 ) { return new Prediction("3", 1, 0); }
		if( budget >= 53.25 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	if( budget < 43.75 ) { 
	if( approval < 75.25 ) { 
	if( stability >= 42.95 ) { 
		if( budget >= 41.1 ) { return new Prediction("1", 1, 0); }
		if( budget < 41.1 ) { return new Prediction("3", 6, 0); }
	}
	if( stability < 42.95 ) { 
	if( approval >= 40 ) { 
	if( approval >= 45.5 ) { 
		if( budget >= 41.75 ) { return new Prediction("1", 1, 0); }
		if( budget < 41.75 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 45.5 ) { return new Prediction("3", 1, 0); }
	}
	if( approval < 40 ) { 
		if( stability >= 36.9 ) { return new Prediction("1", 11, 0); }
		if( stability < 36.9 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
		if( approval >= 75.25 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( budget < 40.05 ) { 
	if( budget < 38.1 ) { 
		if( approval >= 48 ) { return new Prediction("2", 1, 0); }
	if( approval < 48 ) { 
		if( stability >= 35.25 ) { return new Prediction("1", 4, 0); }
	if( stability < 35.25 ) { 
		if( approval < 37.5 ) { return new Prediction("1", 2, 1); }
		if( approval >= 37.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( budget >= 38.1 ) { 
		if( stability >= 38.65 ) { return new Prediction("2", 8, 0); }
	if( stability < 38.65 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 2, 0); }
	if( budget < 39.15 ) { 
		if( approval >= 43 ) { return new Prediction("3", 1, 0); }
		if( approval < 43 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( budget >= 59.25 ) { 
		if( budget >= 70.1 ) { return new Prediction("3", 6, 0); }
	if( budget < 70.1 ) { 
	if( approval >= 68.95 ) { 
		if( approval < 75.75 ) { return new Prediction("1", 2, 0); }
		if( approval >= 75.75 ) { return new Prediction("2", 4, 0); }
	}
	if( approval < 68.95 ) { 
	if( stability < 67.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 5, 0); }
	}
		if( stability >= 67.4 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	}
	if( budget >= 71.65 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 82.1 ) { return new Prediction("3", 1, 0); }
		if( budget < 82.1 ) { return new Prediction("2", 9, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 67.9 ) { return new Prediction("1", 9, 0); }
		if( approval >= 67.9 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( stability < 28.7 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 70.7 ) { return new Prediction("1", 1, 0); }
		if( approval < 70.7 ) { return new Prediction("2", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 15, 0); }
	}
	}
	}
	if( budget >= 85.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 18, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 4, 0); }
	}
	}
	if( stability >= 91.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 13, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( approval < 27.35 ) { 
	if( stability < 45.75 ) { 
	if( stability < 7.45 ) { 
		if( stability >= 6.85 ) { return new Prediction("1", 13, 0); }
	if( stability < 6.85 ) { 
	if( budget < 8.4 ) { 
	if( approval < 3 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 2.65 ) { return new Prediction("1", 2, 0); }
		if( approval < 2.65 ) { return new Prediction("3", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 9, 0); }
	}
	if( approval >= 3 ) { 
	if( approval >= 9.55 ) { 
		if( budget >= 3.15 ) { return new Prediction("3", 6, 0); }
		if( budget < 3.15 ) { return new Prediction("1", 2, 0); }
	}
	if( approval < 9.55 ) { 
	if( approval >= 3.15 ) { 
	if( budget < 4.3 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 7 ) { return new Prediction("1", 5, 0); }
	if( approval < 7 ) { 
		if( budget >= 3.5 ) { return new Prediction("2", 1, 0); }
		if( budget < 3.5 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 9.3 ) { 
		if( stability < 3.45 ) { return new Prediction("3", 4, 0); }
		if( stability >= 3.45 ) { return new Prediction("2", 3, 0); }
	}
		if( approval >= 9.3 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( budget >= 4.3 ) { 
	if( stability < 6.1 ) { 
	if( budget < 7.3 ) { 
	if( stability >= 2.85 ) { 
		if( stability >= 4.5 ) { return new Prediction("1", 11, 0); }
	if( stability < 4.5 ) { 
		if( approval < 6.8 ) { return new Prediction("1", 4, 0); }
		if( approval >= 6.8 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( stability < 2.85 ) { return new Prediction("2", 1, 0); }
	}
		if( budget >= 7.3 ) { return new Prediction("2", 2, 0); }
	}
		if( stability >= 6.1 ) { return new Prediction("3", 2, 0); }
	}
	}
		if( approval < 3.15 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( budget >= 8.4 ) { 
	if( approval < 9.3 ) { 
		if( budget >= 9.05 ) { return new Prediction("2", 4, 0); }
	if( budget < 9.05 ) { 
		if( approval >= 7.9 ) { return new Prediction("1", 1, 0); }
		if( approval < 7.9 ) { return new Prediction("2", 2, 0); }
	}
	}
		if( approval >= 9.3 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( stability >= 7.45 ) { 
		if( stability < 8.95 ) { return new Prediction("2", 7, 0); }
	if( stability >= 8.95 ) { 
	if( budget >= 64.65 ) { 
		if( approval < 20 ) { return new Prediction("2", 6, 0); }
		if( approval >= 20 ) { return new Prediction("1", 2, 0); }
	}
	if( budget < 64.65 ) { 
		if( approval < 2.5 ) { return new Prediction("2", 2, 0); }
	if( approval >= 2.5 ) { 
	if( stability >= 19.4 ) { 
		if( budget < 16.65 ) { return new Prediction("3", 2, 0); }
		if( budget >= 16.65 ) { return new Prediction("1", 5, 0); }
	}
	if( stability < 19.4 ) { 
	if( budget >= 6.55 ) { 
	if( budget >= 18.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 3, 0); }
	}
	if( budget < 18.75 ) { 
		if( stability >= 12.3 ) { return new Prediction("3", 1, 0); }
		if( stability < 12.3 ) { return new Prediction("2", 3, 0); }
	}
	}
	if( budget < 6.55 ) { 
		if( approval >= 8.95 ) { return new Prediction("1", 2, 0); }
		if( approval < 8.95 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( stability >= 45.75 ) { 
		if( budget >= 65.5 ) { return new Prediction("1", 15, 0); }
	if( budget < 65.5 ) { 
		if( budget < 49.15 ) { return new Prediction("1", 5, 0); }
		if( budget >= 49.15 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
return null;
}
private Prediction runTree17() {
	if( stability < 90.7 ) { 
	if( budget < 7.45 ) { 
	if( budget < 6.65 ) { 
	if( stability < 4.35 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 1.95 ) { 
		if( approval >= 4.6 ) { return new Prediction("1", 3, 0); }
		if( approval < 4.6 ) { return new Prediction("2", 3, 0); }
	}
	if( budget < 1.95 ) { 
		if( budget >= 1.65 ) { return new Prediction("3", 3, 0); }
		if( budget < 1.65 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( approval >= 3.95 ) { return new Prediction("3", 15, 0); }
		if( approval < 3.95 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( stability >= 4.35 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 7.3 ) { return new Prediction("3", 4, 0); }
	if( approval >= 7.3 ) { 
		if( budget >= 5.55 ) { return new Prediction("3", 1, 0); }
		if( budget < 5.55 ) { return new Prediction("1", 15, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 7.7 ) { 
	if( budget >= 1.3 ) { 
		if( approval >= 5.05 ) { return new Prediction("2", 4, 0); }
		if( approval < 5.05 ) { return new Prediction("1", 11, 0); }
	}
		if( budget < 1.3 ) { return new Prediction("2", 2, 0); }
	}
		if( stability >= 7.7 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
		if( budget >= 6.65 ) { return new Prediction("1", 11, 0); }
	}
	if( budget >= 7.45 ) { 
	if( stability < 30.3 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 65.75 ) { return new Prediction("1", 5, 0); }
	if( approval < 65.75 ) { 
	if( budget < 34.6 ) { 
	if( stability >= 12.3 ) { 
		if( approval < 22 ) { return new Prediction("3", 3, 0); }
		if( approval >= 22 ) { return new Prediction("1", 2, 0); }
	}
	if( stability < 12.3 ) { 
		if( approval < 9.3 ) { return new Prediction("2", 9, 0); }
	if( approval >= 9.3 ) { 
		if( approval >= 11.8 ) { return new Prediction("2", 1, 0); }
		if( approval < 11.8 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( budget >= 34.6 ) { return new Prediction("2", 16, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( budget >= 24.15 ) { return new Prediction("3", 21, 0); }
	if( budget < 24.15 ) { 
	if( approval >= 11.8 ) { 
		if( budget < 17.4 ) { return new Prediction("2", 8, 0); }
	if( budget >= 17.4 ) { 
	if( approval < 21 ) { 
		if( stability < 15.05 ) { return new Prediction("3", 1, 0); }
		if( stability >= 15.05 ) { return new Prediction("1", 1, 0); }
	}
	if( approval >= 21 ) { 
		if( stability < 19.2 ) { return new Prediction("3", 1, 0); }
		if( stability >= 19.2 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( approval < 11.8 ) { 
		if( budget < 14.1 ) { return new Prediction("3", 4, 0); }
		if( budget >= 14.1 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	if( stability >= 30.3 ) { 
	if( budget < 88.05 ) { 
	if( approval < 71.7 ) { 
	if( approval < 48.15 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 43.15 ) { 
	if( stability < 34.05 ) { 
	if( budget < 38.55 ) { 
		if( approval < 37.5 ) { return new Prediction("1", 6, 2); }
		if( approval >= 37.5 ) { return new Prediction("1", 4, 0); }
	}
		if( budget >= 38.55 ) { return new Prediction("2", 3, 0); }
	}
	if( stability >= 34.05 ) { 
		if( approval >= 42.5 ) { return new Prediction("1", 3, 0); }
	if( approval < 42.5 ) { 
		if( stability >= 37.6 ) { return new Prediction("3", 16, 0); }
	if( stability < 37.6 ) { 
	if( approval >= 27.65 ) { 
		if( budget < 35.7 ) { return new Prediction("3", 1, 0); }
		if( budget >= 35.7 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 27.65 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	if( budget >= 43.15 ) { 
		if( stability >= 70.15 ) { return new Prediction("3", 3, 0); }
	if( stability < 70.15 ) { 
		if( approval < 47.8 ) { return new Prediction("2", 19, 0); }
	if( approval >= 47.8 ) { 
		if( stability < 48.75 ) { return new Prediction("2", 5, 0); }
		if( stability >= 48.75 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 45.55 ) { 
	if( approval >= 40.5 ) { 
	if( budget >= 39.95 ) { 
		if( approval >= 45.5 ) { return new Prediction("2", 1, 0); }
	if( approval < 45.5 ) { 
		if( stability >= 42 ) { return new Prediction("2", 2, 0); }
		if( stability < 42 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( budget < 39.95 ) { return new Prediction("2", 12, 0); }
	}
	if( approval < 40.5 ) { 
	if( budget < 36.8 ) { 
		if( stability >= 81.25 ) { return new Prediction("1", 2, 0); }
	if( stability < 81.25 ) { 
		if( approval < 30.75 ) { return new Prediction("1", 2, 0); }
	if( approval >= 30.75 ) { 
		if( stability >= 33.25 ) { return new Prediction("2", 7, 0); }
	if( stability < 33.25 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 1, 0); }
		if( budget < 31.95 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	if( budget >= 36.8 ) { 
	if( budget >= 37.75 ) { 
		if( stability < 36.4 ) { return new Prediction("3", 2, 0); }
	if( stability >= 36.4 ) { 
	if( budget >= 41.75 ) { 
		if( stability < 41.85 ) { return new Prediction("3", 1, 0); }
		if( stability >= 41.85 ) { return new Prediction("1", 1, 0); }
	}
		if( budget < 41.75 ) { return new Prediction("1", 4, 0); }
	}
	}
		if( budget < 37.75 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( budget >= 45.55 ) { 
	if( budget < 50.45 ) { 
		if( stability < 44.65 ) { return new Prediction("3", 5, 0); }
	if( stability >= 44.65 ) { 
	if( stability < 49.75 ) { 
		if( approval >= 45.5 ) { return new Prediction("3", 2, 0); }
		if( approval < 45.5 ) { return new Prediction("1", 5, 0); }
	}
		if( stability >= 49.75 ) { return new Prediction("1", 4, 0); }
	}
	}
		if( budget >= 50.45 ) { return new Prediction("1", 18, 0); }
	}
	}
	}
	if( approval >= 48.15 ) { 
	if( approval < 50.5 ) { 
		if( approval < 48.9 ) { return new Prediction("3", 6, 0); }
	if( approval >= 48.9 ) { 
	if( budget >= 40.35 ) { 
		if( stability < 39.15 ) { return new Prediction("3", 3, 0); }
	if( stability >= 39.15 ) { 
	if( stability >= 48 ) { 
		if( approval < 49.7 ) { return new Prediction("1", 1, 0); }
		if( approval >= 49.7 ) { return new Prediction("3", 2, 0); }
	}
		if( stability < 48 ) { return new Prediction("1", 12, 0); }
	}
	}
		if( budget < 40.35 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( approval >= 50.5 ) { 
	if( approval >= 52.1 ) { 
	if( approval < 57.5 ) { 
	if( budget < 62.65 ) { 
	if( budget < 49.95 ) { 
		if( stability < 52.05 ) { return new Prediction("2", 4, 0); }
	if( stability >= 52.05 ) { 
		if( approval < 54.9 ) { return new Prediction("3", 1, 0); }
		if( approval >= 54.9 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( budget >= 49.95 ) { 
	if( budget >= 56.2 ) { 
		if( stability < 54 ) { return new Prediction("3", 3, 0); }
		if( stability >= 54 ) { return new Prediction("1", 3, 0); }
	}
		if( budget < 56.2 ) { return new Prediction("1", 6, 0); }
	}
	}
	if( budget >= 62.65 ) { 
		if( stability >= 76.7 ) { return new Prediction("3", 1, 0); }
		if( stability < 76.7 ) { return new Prediction("2", 5, 0); }
	}
	}
	if( approval >= 57.5 ) { 
		if( stability >= 79.05 ) { return new Prediction("3", 9, 0); }
	if( stability < 79.05 ) { 
	if( budget >= 52.95 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 71.6 ) { return new Prediction("2", 2, 0); }
		if( budget < 71.6 ) { return new Prediction("3", 1, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval >= 66.5 ) { return new Prediction("3", 4, 0); }
	if( approval < 66.5 ) { 
		if( stability < 64.45 ) { return new Prediction("3", 3, 0); }
		if( stability >= 64.45 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( budget < 52.95 ) { 
		if( stability >= 60.65 ) { return new Prediction("2", 5, 0); }
		if( stability < 60.65 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	if( approval < 52.1 ) { 
	if( stability < 48.85 ) { 
		if( budget < 44.4 ) { return new Prediction("2", 2, 0); }
	if( budget >= 44.4 ) { 
		if( approval >= 51.5 ) { return new Prediction("3", 1, 0); }
		if( approval < 51.5 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( stability >= 48.85 ) { return new Prediction("3", 15, 0); }
	}
	}
	}
	}
	if( approval >= 71.7 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 82.15 ) { return new Prediction("1", 16, 0); }
		if( budget >= 82.15 ) { return new Prediction("2", 1, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget < 73.5 ) { return new Prediction("2", 17, 0); }
		if( budget >= 73.5 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	if( budget >= 88.05 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 89.4 ) { return new Prediction("2", 11, 0); }
		if( budget < 89.4 ) { return new Prediction("1", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 9, 0); }
	}
	}
	}
	}
	if( stability >= 90.7 ) { 
	if( budget >= 11.4 ) { 
		if( budget >= 62.05 ) { return new Prediction("3", 8, 0); }
	if( budget < 62.05 ) { 
		if( budget < 57.95 ) { return new Prediction("3", 5, 0); }
		if( budget >= 57.95 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( budget < 11.4 ) { return new Prediction("2", 2, 0); }
	}
return null;
}
private Prediction runTree18() {
	if( stability >= 92.55 ) { 
		if( approval < 59.25 ) { return new Prediction("3", 8, 0); }
	if( approval >= 59.25 ) { 
		if( approval < 64 ) { return new Prediction("2", 1, 0); }
		if( approval >= 64 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( stability < 92.55 ) { 
	if( approval < 30.2 ) { 
	if( stability >= 67.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 10, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 14, 0); }
	}
	if( stability < 67.55 ) { 
	if( budget >= 28.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 12, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 11, 0); }
	}
	if( budget < 28.45 ) { 
	if( stability < 9.15 ) { 
	if( approval < 7.4 ) { 
	if( approval >= 3.35 ) { 
	if( stability < 1.25 ) { 
		if( budget >= 2.95 ) { return new Prediction("3", 1, 0); }
		if( budget < 2.95 ) { return new Prediction("1", 3, 0); }
	}
	if( stability >= 1.25 ) { 
	if( approval < 5.5 ) { 
	if( approval >= 4.35 ) { 
		if( budget < 5.35 ) { return new Prediction("1", 2, 0); }
	if( budget >= 5.35 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 1, 0); }
	}
	}
		if( approval < 4.35 ) { return new Prediction("2", 6, 0); }
	}
	if( approval >= 5.5 ) { 
	if( approval >= 6.5 ) { 
	if( approval >= 6.7 ) { 
	if( stability < 3.85 ) { 
		if( budget < 8.25 ) { return new Prediction("3", 1, 0); }
		if( budget >= 8.25 ) { return new Prediction("2", 2, 0); }
	}
		if( stability >= 3.85 ) { return new Prediction("2", 4, 0); }
	}
		if( approval < 6.7 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 6.5 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
	if( approval < 3.35 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 2.15 ) { return new Prediction("1", 2, 0); }
	if( stability >= 2.15 ) { 
		if( budget < 5.7 ) { return new Prediction("3", 5, 0); }
		if( budget >= 5.7 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( "positive".equals(type) ) { return new Prediction("1", 8, 0); }
	}
	}
	if( approval >= 7.4 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 8.85 ) { return new Prediction("1", 13, 0); }
	if( approval >= 8.85 ) { 
		if( budget < 9.55 ) { return new Prediction("1", 9, 0); }
		if( budget >= 9.55 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( "positive".equals(type) ) { return new Prediction("3", 4, 0); }
	}
	}
	if( stability >= 9.15 ) { 
	if( approval >= 8.95 ) { 
	if( budget >= 18.75 ) { 
	if( approval < 23.65 ) { 
		if( stability >= 21.85 ) { return new Prediction("3", 5, 0); }
	if( stability < 21.85 ) { 
		if( approval >= 16 ) { return new Prediction("1", 2, 0); }
	if( approval < 16 ) { 
		if( stability < 15.05 ) { return new Prediction("3", 1, 0); }
		if( stability >= 15.05 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	if( approval >= 23.65 ) { 
		if( approval >= 29.5 ) { return new Prediction("1", 1, 0); }
	if( approval < 29.5 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 2, 0); }
	if( budget >= 25.7 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 1, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	if( budget < 18.75 ) { 
	if( stability >= 12.3 ) { 
		if( approval < 16.05 ) { return new Prediction("3", 1, 0); }
	if( approval >= 16.05 ) { 
		if( approval < 18.15 ) { return new Prediction("2", 1, 0); }
		if( approval >= 18.15 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( stability < 12.3 ) { return new Prediction("2", 4, 0); }
	}
	}
		if( approval < 8.95 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	}
	if( approval >= 30.2 ) { 
	if( budget < 31.55 ) { 
	if( stability >= 71.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 10, 0); }
	}
	if( stability < 71.45 ) { 
	if( stability >= 25.4 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 54.7 ) { return new Prediction("1", 8, 0); }
	if( stability >= 54.7 ) { 
		if( approval < 57.45 ) { return new Prediction("3", 1, 0); }
		if( approval >= 57.45 ) { return new Prediction("1", 3, 0); }
	}
	}
		if( "positive".equals(type) ) { return new Prediction("2", 23, 0); }
	}
	if( stability < 25.4 ) { 
		if( budget < 18.6 ) { return new Prediction("2", 2, 0); }
		if( budget >= 18.6 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( budget >= 31.55 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 48.5 ) { 
	if( budget < 69.7 ) { 
	if( stability < 57 ) { 
		if( budget < 54.15 ) { return new Prediction("1", 18, 0); }
	if( budget >= 54.15 ) { 
		if( approval < 54.45 ) { return new Prediction("2", 2, 0); }
		if( approval >= 54.45 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( stability >= 57 ) { 
		if( approval < 69 ) { return new Prediction("3", 7, 0); }
		if( approval >= 69 ) { return new Prediction("1", 13, 0); }
	}
	}
	if( budget >= 69.7 ) { 
		if( approval < 87.5 ) { return new Prediction("2", 18, 0); }
		if( approval >= 87.5 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( approval < 48.5 ) { 
	if( stability >= 39.3 ) { 
	if( budget >= 46 ) { 
		if( budget >= 82.1 ) { return new Prediction("3", 5, 0); }
	if( budget < 82.1 ) { 
	if( approval < 39.1 ) { 
		if( stability >= 67.75 ) { return new Prediction("3", 2, 0); }
	if( stability < 67.75 ) { 
		if( approval < 38.4 ) { return new Prediction("2", 2, 0); }
		if( approval >= 38.4 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval >= 39.1 ) { 
		if( approval < 47.8 ) { return new Prediction("2", 11, 0); }
	if( approval >= 47.8 ) { 
		if( stability >= 49.95 ) { return new Prediction("3", 1, 0); }
		if( stability < 49.95 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	}
	if( budget < 46 ) { 
		if( approval < 45 ) { return new Prediction("3", 12, 0); }
		if( approval >= 45 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( stability < 39.3 ) { 
		if( approval < 37.5 ) { return new Prediction("2", 11, 0); }
	if( approval >= 37.5 ) { 
		if( budget >= 43.9 ) { return new Prediction("2", 3, 0); }
		if( budget < 43.9 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( stability < 36.4 ) { return new Prediction("3", 36, 0); }
	if( stability >= 36.4 ) { 
	if( approval >= 40.6 ) { 
	if( stability >= 51.4 ) { 
	if( approval >= 67.55 ) { 
		if( budget < 66.05 ) { return new Prediction("2", 6, 0); }
		if( budget >= 66.05 ) { return new Prediction("3", 5, 0); }
	}
	if( approval < 67.55 ) { 
	if( budget >= 42.85 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 10, 0); }
	if( approval >= 56.35 ) { 
		if( approval >= 57.05 ) { return new Prediction("1", 3, 0); }
	if( approval < 57.05 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 1, 0); }
		if( budget >= 52.75 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
		if( budget < 42.85 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( stability < 51.4 ) { 
	if( budget < 45.55 ) { 
		if( approval < 49.5 ) { return new Prediction("2", 10, 0); }
		if( approval >= 49.5 ) { return new Prediction("3", 1, 0); }
	}
	if( budget >= 45.55 ) { 
	if( approval < 45 ) { 
		if( stability < 43.15 ) { return new Prediction("3", 3, 0); }
		if( stability >= 43.15 ) { return new Prediction("1", 3, 0); }
	}
		if( approval >= 45 ) { return new Prediction("3", 29, 0); }
	}
	}
	}
	if( approval < 40.6 ) { 
		if( budget >= 37.4 ) { return new Prediction("1", 18, 0); }
		if( budget < 37.4 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree19() {
	if( approval < 40.05 ) { 
	if( budget < 50.45 ) { 
	if( approval >= 3.35 ) { 
	if( stability < 4.35 ) { 
	if( budget >= 3.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 20, 0); }
	}
	if( budget < 3.4 ) { 
		if( approval >= 5.8 ) { return new Prediction("1", 5, 0); }
	if( approval < 5.8 ) { 
		if( approval >= 4.05 ) { return new Prediction("3", 1, 0); }
		if( approval < 4.05 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( stability >= 4.35 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 34.05 ) { 
		if( approval < 7.3 ) { return new Prediction("3", 7, 0); }
	if( approval >= 7.3 ) { 
	if( budget >= 19.7 ) { 
		if( approval < 21 ) { return new Prediction("2", 2, 0); }
	if( approval >= 21 ) { 
	if( approval >= 34.5 ) { 
	if( approval >= 36.5 ) { 
		if( approval < 37.5 ) { return new Prediction("1", 3, 1); }
		if( approval >= 37.5 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 36.5 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 34.5 ) { return new Prediction("1", 8, 0); }
	}
	}
	if( budget < 19.7 ) { 
	if( stability >= 9.35 ) { 
		if( approval >= 15 ) { return new Prediction("1", 1, 0); }
		if( approval < 15 ) { return new Prediction("3", 2, 0); }
	}
		if( stability < 9.35 ) { return new Prediction("1", 20, 0); }
	}
	}
	}
	if( stability >= 34.05 ) { 
	if( stability >= 37.15 ) { 
		if( approval < 37.5 ) { return new Prediction("3", 16, 0); }
		if( approval >= 37.5 ) { return new Prediction("2", 1, 0); }
	}
	if( stability < 37.15 ) { 
		if( approval >= 27.65 ) { return new Prediction("2", 2, 0); }
		if( approval < 27.65 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 6.15 ) { 
	if( stability >= 37.5 ) { 
	if( approval >= 39 ) { 
		if( stability < 41.85 ) { return new Prediction("3", 1, 0); }
		if( stability >= 41.85 ) { return new Prediction("1", 1, 0); }
	}
	if( approval < 39 ) { 
	if( stability >= 42.95 ) { 
		if( approval < 28.5 ) { return new Prediction("1", 3, 0); }
	if( approval >= 28.5 ) { 
		if( approval < 37 ) { return new Prediction("2", 2, 0); }
		if( approval >= 37 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( stability < 42.95 ) { return new Prediction("1", 7, 0); }
	}
	}
	if( stability < 37.5 ) { 
		if( approval < 9.5 ) { return new Prediction("2", 12, 0); }
	if( approval >= 9.5 ) { 
	if( budget < 32.8 ) { 
	if( approval >= 18.05 ) { 
	if( budget >= 27 ) { 
	if( approval < 32 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 1, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 2, 0); }
	}
		if( approval >= 32 ) { return new Prediction("2", 1, 0); }
	}
		if( budget < 27 ) { return new Prediction("2", 7, 0); }
	}
	if( approval < 18.05 ) { 
	if( budget < 14.75 ) { 
		if( approval < 11.95 ) { return new Prediction("3", 3, 0); }
		if( approval >= 11.95 ) { return new Prediction("2", 4, 0); }
	}
	if( budget >= 14.75 ) { 
		if( stability < 15.05 ) { return new Prediction("3", 2, 0); }
		if( stability >= 15.05 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	if( budget >= 32.8 ) { 
		if( approval < 32.5 ) { return new Prediction("1", 1, 0); }
		if( approval >= 32.5 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	}
		if( approval < 6.15 ) { return new Prediction("1", 9, 0); }
	}
	}
	}
	if( approval < 3.35 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 1.6 ) { return new Prediction("3", 5, 0); }
		if( budget < 1.6 ) { return new Prediction("1", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 11, 0); }
	}
	}
	if( budget >= 50.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 10, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 24, 0); }
	}
	}
	if( approval >= 40.05 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 48.9 ) { 
		if( budget >= 60.55 ) { return new Prediction("2", 13, 0); }
	if( budget < 60.55 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 20, 0); }
	if( approval < 48.5 ) { 
	if( budget >= 45 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 10, 0); }
	if( budget < 48.85 ) { 
	if( approval >= 47.5 ) { 
		if( stability >= 44.3 ) { return new Prediction("1", 1, 0); }
		if( stability < 44.3 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( budget < 45 ) { return new Prediction("1", 6, 0); }
	}
	}
	}
	if( stability >= 48.9 ) { 
	if( budget < 85.4 ) { 
	if( approval >= 65.7 ) { 
	if( stability >= 72.9 ) { 
		if( approval < 88.45 ) { return new Prediction("3", 5, 0); }
		if( approval >= 88.45 ) { return new Prediction("1", 1, 0); }
	}
		if( stability < 72.9 ) { return new Prediction("1", 10, 0); }
	}
	if( approval < 65.7 ) { 
	if( budget < 69.7 ) { 
	if( stability < 56.4 ) { 
		if( approval >= 52 ) { return new Prediction("1", 4, 0); }
		if( approval < 52 ) { return new Prediction("3", 8, 0); }
	}
		if( stability >= 56.4 ) { return new Prediction("3", 18, 0); }
	}
	if( budget >= 69.7 ) { 
	if( approval < 58.5 ) { 
		if( stability >= 75.85 ) { return new Prediction("3", 2, 0); }
		if( stability < 75.85 ) { return new Prediction("2", 6, 0); }
	}
		if( approval >= 58.5 ) { return new Prediction("3", 8, 0); }
	}
	}
	}
	if( budget >= 85.4 ) { 
		if( approval < 87.5 ) { return new Prediction("2", 14, 0); }
		if( approval >= 87.5 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 45.25 ) { 
	if( stability < 62.15 ) { 
		if( budget < 44.95 ) { return new Prediction("2", 12, 0); }
	if( budget >= 44.95 ) { 
	if( approval >= 47.5 ) { 
		if( budget >= 59.45 ) { return new Prediction("3", 10, 0); }
	if( budget < 59.45 ) { 
	if( stability >= 51.4 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 1, 0); }
	if( approval >= 56.35 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 2, 0); }
	if( budget >= 52.75 ) { 
		if( approval < 67.1 ) { return new Prediction("3", 2, 0); }
		if( approval >= 67.1 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
		if( stability < 51.4 ) { return new Prediction("3", 6, 0); }
	}
	}
	if( approval < 47.5 ) { 
	if( stability < 46.75 ) { 
		if( approval < 45 ) { return new Prediction("1", 1, 0); }
		if( approval >= 45 ) { return new Prediction("3", 1, 0); }
	}
		if( stability >= 46.75 ) { return new Prediction("1", 6, 0); }
	}
	}
	}
	if( stability >= 62.15 ) { 
		if( budget < 58.75 ) { return new Prediction("2", 18, 0); }
		if( budget >= 58.75 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( stability < 45.25 ) { 
	if( budget < 44.4 ) { 
		if( stability >= 38.6 ) { return new Prediction("2", 5, 0); }
	if( stability < 38.6 ) { 
		if( budget >= 22.15 ) { return new Prediction("3", 8, 0); }
		if( budget < 22.15 ) { return new Prediction("2", 5, 0); }
	}
	}
		if( budget >= 44.4 ) { return new Prediction("3", 38, 0); }
	}
	}
	}
return null;
}
private Prediction runTree20() {
	if( stability < 8.75 ) { 
	if( approval < 7.35 ) { 
	if( budget < 7.3 ) { 
		if( approval < 3 ) { return new Prediction("1", 9, 0); }
	if( approval >= 3 ) { 
		if( budget < 1.75 ) { return new Prediction("2", 5, 0); }
	if( budget >= 1.75 ) { 
	if( stability >= 2.2 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 5.35 ) { return new Prediction("3", 3, 0); }
		if( stability < 5.35 ) { return new Prediction("2", 4, 0); }
	}
	if( "positive".equals(type) ) { 
	if( approval < 5.35 ) { 
		if( budget < 3.55 ) { return new Prediction("2", 3, 0); }
		if( budget >= 3.55 ) { return new Prediction("1", 8, 0); }
	}
	if( approval >= 5.35 ) { 
		if( budget >= 4.2 ) { return new Prediction("2", 3, 0); }
		if( budget < 4.2 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( stability < 2.2 ) { 
		if( approval >= 5.8 ) { return new Prediction("1", 2, 0); }
		if( approval < 5.8 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	if( budget >= 7.3 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 12, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 2, 0); }
	}
	}
	if( approval >= 7.35 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 8.85 ) { return new Prediction("1", 18, 0); }
	if( approval >= 8.85 ) { 
		if( budget < 9.55 ) { return new Prediction("1", 8, 0); }
		if( budget >= 9.55 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( approval >= 9.55 ) { return new Prediction("3", 3, 0); }
		if( approval < 9.55 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( stability >= 8.75 ) { 
	if( stability < 19.6 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 9.3 ) { 
	if( stability < 9.15 ) { 
		if( approval < 5.7 ) { return new Prediction("3", 1, 0); }
		if( approval >= 5.7 ) { return new Prediction("1", 1, 0); }
	}
		if( stability >= 9.15 ) { return new Prediction("3", 8, 0); }
	}
	if( budget >= 9.3 ) { 
		if( approval >= 74.8 ) { return new Prediction("1", 1, 0); }
		if( approval < 74.8 ) { return new Prediction("2", 15, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 15.55 ) { 
	if( stability < 14.2 ) { 
		if( approval < 11.7 ) { return new Prediction("2", 1, 0); }
		if( approval >= 11.7 ) { return new Prediction("3", 6, 0); }
	}
		if( stability >= 14.2 ) { return new Prediction("2", 2, 0); }
	}
		if( stability >= 15.55 ) { return new Prediction("3", 7, 0); }
	}
	}
	if( stability >= 19.6 ) { 
	if( stability < 91.65 ) { 
	if( approval >= 89.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 14, 0); }
	if( "positive".equals(type) ) { 
		if( budget < 73.5 ) { return new Prediction("2", 2, 0); }
		if( budget >= 73.5 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( approval < 89.75 ) { 
	if( budget < 86 ) { 
	if( budget < 31.55 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 71.45 ) { return new Prediction("3", 6, 0); }
	if( stability < 71.45 ) { 
		if( approval >= 52.95 ) { return new Prediction("1", 9, 0); }
	if( approval < 52.95 ) { 
		if( approval >= 35.2 ) { return new Prediction("3", 4, 0); }
	if( approval < 35.2 ) { 
		if( stability < 27.8 ) { return new Prediction("1", 5, 0); }
		if( stability >= 27.8 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( approval < 23.05 ) { return new Prediction("1", 4, 0); }
	if( approval >= 23.05 ) { 
		if( stability >= 20.5 ) { return new Prediction("2", 30, 0); }
		if( stability < 20.5 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( budget >= 31.55 ) { 
	if( stability >= 79.05 ) { 
		if( stability < 88.8 ) { return new Prediction("3", 9, 0); }
		if( stability >= 88.8 ) { return new Prediction("1", 1, 0); }
	}
	if( stability < 79.05 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 66.7 ) { 
	if( approval >= 48.5 ) { 
	if( budget < 60.8 ) { 
		if( approval < 50.5 ) { return new Prediction("1", 12, 0); }
	if( approval >= 50.5 ) { 
	if( approval < 64.15 ) { 
		if( stability < 57 ) { return new Prediction("1", 4, 0); }
		if( stability >= 57 ) { return new Prediction("3", 6, 0); }
	}
		if( approval >= 64.15 ) { return new Prediction("1", 9, 0); }
	}
	}
		if( budget >= 60.8 ) { return new Prediction("2", 2, 0); }
	}
	if( approval < 48.5 ) { 
	if( stability < 49.25 ) { 
	if( budget < 42.1 ) { 
	if( approval < 37.5 ) { 
	if( stability < 39.4 ) { 
		if( approval >= 36.5 ) { return new Prediction("1", 2, 0); }
		if( approval < 36.5 ) { return new Prediction("2", 3, 0); }
	}
		if( stability >= 39.4 ) { return new Prediction("3", 7, 0); }
	}
		if( approval >= 37.5 ) { return new Prediction("1", 12, 0); }
	}
	if( budget >= 42.1 ) { 
		if( approval < 30.45 ) { return new Prediction("3", 1, 0); }
	if( approval >= 30.45 ) { 
		if( stability < 46.75 ) { return new Prediction("2", 17, 0); }
	if( stability >= 46.75 ) { 
	if( approval >= 47.5 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 1, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
		if( stability >= 49.25 ) { return new Prediction("3", 12, 0); }
	}
	}
		if( budget >= 66.7 ) { return new Prediction("2", 17, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability < 54.6 ) { 
	if( budget < 40.75 ) { 
	if( stability >= 38.05 ) { 
	if( approval < 37.5 ) { 
		if( budget < 36.6 ) { return new Prediction("2", 1, 0); }
		if( budget >= 36.6 ) { return new Prediction("1", 1, 0); }
	}
		if( approval >= 37.5 ) { return new Prediction("2", 9, 0); }
	}
	if( stability < 38.05 ) { 
	if( stability >= 33.75 ) { 
		if( approval >= 43 ) { return new Prediction("3", 2, 0); }
	if( approval < 43 ) { 
		if( budget >= 37.4 ) { return new Prediction("1", 2, 0); }
	if( budget < 37.4 ) { 
		if( approval >= 33 ) { return new Prediction("3", 1, 0); }
		if( approval < 33 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( stability < 33.75 ) { return new Prediction("3", 8, 0); }
	}
	}
	if( budget >= 40.75 ) { 
		if( approval < 38.55 ) { return new Prediction("1", 15, 0); }
	if( approval >= 38.55 ) { 
	if( approval < 49.7 ) { 
	if( stability < 48.9 ) { 
		if( stability < 44.25 ) { return new Prediction("3", 13, 0); }
	if( stability >= 44.25 ) { 
	if( budget < 47.1 ) { 
		if( budget < 44.05 ) { return new Prediction("1", 1, 0); }
		if( budget >= 44.05 ) { return new Prediction("2", 1, 0); }
	}
	if( budget >= 47.1 ) { 
		if( approval < 45 ) { return new Prediction("1", 1, 0); }
		if( approval >= 45 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
		if( stability >= 48.9 ) { return new Prediction("1", 5, 0); }
	}
	if( approval >= 49.7 ) { 
	if( budget < 49.95 ) { 
		if( approval >= 53.5 ) { return new Prediction("2", 1, 0); }
		if( approval < 53.5 ) { return new Prediction("3", 1, 0); }
	}
		if( budget >= 49.95 ) { return new Prediction("3", 23, 0); }
	}
	}
	}
	}
	if( stability >= 54.6 ) { 
	if( budget < 66.7 ) { 
		if( approval < 56.15 ) { return new Prediction("1", 1, 0); }
		if( approval >= 56.15 ) { return new Prediction("2", 14, 0); }
	}
	if( budget >= 66.7 ) { 
		if( approval >= 70.4 ) { return new Prediction("3", 3, 0); }
		if( approval < 70.4 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
	}
	}
	}
	if( budget >= 86 ) { 
		if( approval < 38.5 ) { return new Prediction("1", 8, 0); }
		if( approval >= 38.5 ) { return new Prediction("2", 7, 0); }
	}
	}
	}
		if( stability >= 91.65 ) { return new Prediction("3", 9, 0); }
	}
	}
return null;
}
private Prediction runTree21() {
	if( stability < 90.3 ) { 
	if( approval >= 82.9 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 85.85 ) { 
		if( budget < 63.15 ) { return new Prediction("1", 3, 0); }
		if( budget >= 63.15 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 85.85 ) { return new Prediction("1", 16, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget < 59.4 ) { return new Prediction("2", 2, 0); }
	if( budget >= 59.4 ) { 
		if( stability >= 67.95 ) { return new Prediction("2", 1, 0); }
		if( stability < 67.95 ) { return new Prediction("3", 8, 0); }
	}
	}
	}
	if( approval < 82.9 ) { 
	if( approval >= 68.65 ) { 
		if( budget < 51.5 ) { return new Prediction("2", 13, 0); }
	if( budget >= 51.5 ) { 
	if( approval >= 74.05 ) { 
	if( stability >= 56.2 ) { 
	if( budget >= 71.75 ) { 
		if( approval < 76.55 ) { return new Prediction("3", 1, 0); }
		if( approval >= 76.55 ) { return new Prediction("2", 1, 0); }
	}
		if( budget < 71.75 ) { return new Prediction("2", 2, 0); }
	}
		if( stability < 56.2 ) { return new Prediction("3", 2, 0); }
	}
	if( approval < 74.05 ) { 
		if( stability < 58.05 ) { return new Prediction("2", 5, 0); }
	if( stability >= 58.05 ) { 
		if( budget < 84.55 ) { return new Prediction("1", 2, 0); }
		if( budget >= 84.55 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	if( approval < 68.65 ) { 
	if( budget < 76 ) { 
	if( approval >= 49.3 ) { 
		if( stability < 34.05 ) { return new Prediction("3", 9, 0); }
	if( stability >= 34.05 ) { 
	if( budget < 49.5 ) { 
	if( stability >= 66.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 2, 0); }
	}
	if( stability < 66.15 ) { 
	if( approval < 54.25 ) { 
		if( approval < 50.5 ) { return new Prediction("1", 3, 0); }
		if( approval >= 50.5 ) { return new Prediction("3", 3, 0); }
	}
	if( approval >= 54.25 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 9, 0); }
	}
	}
	}
	if( budget >= 49.5 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 57 ) { 
	if( stability < 44.35 ) { 
		if( approval < 52.5 ) { return new Prediction("1", 3, 0); }
		if( approval >= 52.5 ) { return new Prediction("2", 3, 0); }
	}
	if( stability >= 44.35 ) { 
		if( approval < 50.5 ) { return new Prediction("3", 2, 0); }
		if( approval >= 50.5 ) { return new Prediction("1", 11, 0); }
	}
	}
	if( stability >= 57 ) { 
		if( budget < 69.7 ) { return new Prediction("3", 11, 0); }
		if( budget >= 69.7 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( stability < 53.9 ) { return new Prediction("3", 18, 0); }
		if( stability >= 53.9 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
	}
	if( approval < 49.3 ) { 
	if( stability >= 1.6 ) { 
	if( budget >= 6.55 ) { 
	if( budget >= 27 ) { 
	if( approval >= 23.55 ) { 
	if( stability >= 25.4 ) { 
	if( stability >= 33.75 ) { 
	if( budget >= 35.55 ) { 
	if( approval >= 37.05 ) { 
	if( budget < 40.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 11, 0); }
	}
	if( budget >= 40.75 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 4, 0); }
	if( approval < 48.5 ) { 
	if( stability < 49.25 ) { 
		if( budget >= 45 ) { return new Prediction("2", 14, 0); }
		if( budget < 45 ) { return new Prediction("1", 1, 0); }
	}
	if( stability >= 49.25 ) { 
		if( budget >= 62.5 ) { return new Prediction("2", 4, 0); }
		if( budget < 62.5 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 44.25 ) { 
		if( approval >= 39 ) { return new Prediction("3", 10, 0); }
		if( approval < 39 ) { return new Prediction("1", 2, 0); }
	}
	if( stability >= 44.25 ) { 
	if( budget >= 41.9 ) { 
		if( stability >= 47.4 ) { return new Prediction("1", 9, 0); }
	if( stability < 47.4 ) { 
	if( stability < 46.65 ) { 
		if( approval < 45 ) { return new Prediction("1", 5, 0); }
		if( approval >= 45 ) { return new Prediction("3", 1, 0); }
	}
		if( stability >= 46.65 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( budget < 41.9 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	if( approval < 37.05 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 67.55 ) { return new Prediction("3", 8, 0); }
		if( budget >= 67.55 ) { return new Prediction("2", 1, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability < 36.4 ) { 
	if( budget < 38.2 ) { 
		if( approval >= 33 ) { return new Prediction("3", 1, 0); }
		if( approval < 33 ) { return new Prediction("1", 3, 0); }
	}
		if( budget >= 38.2 ) { return new Prediction("3", 2, 0); }
	}
	if( stability >= 36.4 ) { 
		if( budget < 36.8 ) { return new Prediction("2", 2, 0); }
		if( budget >= 36.8 ) { return new Prediction("1", 12, 0); }
	}
	}
	}
	}
	if( budget < 35.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 4, 0); }
	}
	}
	if( stability < 33.75 ) { 
	if( budget < 38.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 4, 0); }
	}
		if( budget >= 38.55 ) { return new Prediction("2", 11, 0); }
	}
	}
		if( stability < 25.4 ) { return new Prediction("3", 5, 0); }
	}
	if( approval < 23.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 10, 0); }
	}
	}
	if( budget < 27 ) { 
	if( budget < 7.35 ) { 
		if( approval >= 9.25 ) { return new Prediction("2", 1, 0); }
	if( approval < 9.25 ) { 
		if( stability < 4.9 ) { return new Prediction("2", 1, 0); }
		if( stability >= 4.9 ) { return new Prediction("1", 7, 0); }
	}
	}
	if( budget >= 7.35 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 19.1 ) { 
	if( stability < 27.8 ) { 
		if( approval < 22 ) { return new Prediction("3", 1, 0); }
		if( approval >= 22 ) { return new Prediction("1", 4, 0); }
	}
		if( stability >= 27.8 ) { return new Prediction("3", 4, 0); }
	}
	if( stability < 19.1 ) { 
		if( approval < 8.25 ) { return new Prediction("2", 7, 0); }
	if( approval >= 8.25 ) { 
		if( budget >= 11.25 ) { return new Prediction("2", 3, 0); }
	if( budget < 11.25 ) { 
		if( approval < 11.65 ) { return new Prediction("1", 2, 0); }
		if( approval >= 11.65 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( approval >= 11.8 ) { return new Prediction("2", 20, 0); }
	if( approval < 11.8 ) { 
		if( approval >= 6.5 ) { return new Prediction("3", 2, 0); }
		if( approval < 6.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	if( budget < 6.55 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 7.3 ) { 
		if( stability >= 4.45 ) { return new Prediction("3", 15, 0); }
	if( stability < 4.45 ) { 
		if( approval >= 4.45 ) { return new Prediction("1", 2, 0); }
	if( approval < 4.45 ) { 
		if( approval < 2.85 ) { return new Prediction("3", 1, 0); }
		if( approval >= 2.85 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( approval >= 7.3 ) { 
		if( budget < 5.1 ) { return new Prediction("1", 12, 0); }
		if( budget >= 5.1 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 4.25 ) { 
	if( stability >= 5.95 ) { 
	if( approval < 5.15 ) { 
	if( budget < 2.55 ) { 
		if( budget < 1.75 ) { return new Prediction("1", 1, 0); }
		if( budget >= 1.75 ) { return new Prediction("2", 1, 0); }
	}
		if( budget >= 2.55 ) { return new Prediction("1", 3, 0); }
	}
		if( approval >= 5.15 ) { return new Prediction("2", 8, 0); }
	}
	if( stability < 5.95 ) { 
		if( stability < 4.85 ) { return new Prediction("2", 2, 0); }
		if( stability >= 4.85 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( stability < 4.25 ) { 
		if( approval >= 4.05 ) { return new Prediction("3", 11, 0); }
		if( approval < 4.05 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	}
	if( stability < 1.6 ) { 
		if( stability < 1.25 ) { return new Prediction("1", 4, 0); }
	if( stability >= 1.25 ) { 
		if( approval < 4.1 ) { return new Prediction("1", 2, 0); }
		if( approval >= 4.1 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	if( budget >= 76 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 12, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 13, 0); }
	}
	}
	}
	}
	if( stability >= 90.3 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 14, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 2, 0); }
	}
return null;
}
private Prediction runTree22() {
	if( budget >= 96.15 ) { 
		if( stability >= 14 ) { return new Prediction("2", 11, 0); }
		if( stability < 14 ) { return new Prediction("3", 1, 0); }
	}
	if( budget < 96.15 ) { 
	if( stability < 90.3 ) { 
	if( approval < 29.1 ) { 
	if( budget < 67.85 ) { 
	if( stability < 3.45 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 2.55 ) { 
	if( approval < 5.15 ) { 
		if( budget < 2.85 ) { return new Prediction("1", 1, 0); }
		if( budget >= 2.85 ) { return new Prediction("2", 2, 0); }
	}
		if( approval >= 5.15 ) { return new Prediction("1", 4, 0); }
	}
		if( approval < 2.55 ) { return new Prediction("3", 2, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval >= 3.95 ) { return new Prediction("3", 9, 0); }
		if( approval < 3.95 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( stability >= 3.45 ) { 
	if( stability < 7.45 ) { 
	if( approval >= 7.1 ) { 
		if( approval >= 9.45 ) { return new Prediction("2", 1, 0); }
	if( approval < 9.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 20, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval < 7.1 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 6.4 ) { return new Prediction("2", 3, 0); }
	if( budget < 6.4 ) { 
		if( budget >= 5.25 ) { return new Prediction("3", 5, 0); }
	if( budget < 5.25 ) { 
		if( approval < 3.9 ) { return new Prediction("3", 1, 0); }
		if( approval >= 3.9 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 5.15 ) { 
		if( stability < 4.8 ) { return new Prediction("2", 1, 0); }
		if( stability >= 4.8 ) { return new Prediction("1", 9, 0); }
	}
		if( approval >= 5.15 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( stability >= 7.45 ) { 
	if( budget >= 18.75 ) { 
	if( approval < 21.4 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 19.7 ) { return new Prediction("3", 5, 0); }
		if( budget < 19.7 ) { return new Prediction("1", 1, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability < 15.05 ) { return new Prediction("3", 2, 0); }
		if( stability >= 15.05 ) { return new Prediction("1", 8, 0); }
	}
	}
	if( approval >= 21.4 ) { 
	if( stability < 51.25 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 25.2 ) { return new Prediction("1", 3, 0); }
		if( approval < 25.2 ) { return new Prediction("2", 1, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 2, 0); }
	if( stability < 28.6 ) { 
		if( approval < 28.5 ) { return new Prediction("3", 2, 0); }
		if( approval >= 28.5 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
		if( stability >= 51.25 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( budget < 18.75 ) { 
	if( approval >= 1.6 ) { 
		if( budget >= 6.55 ) { return new Prediction("2", 9, 0); }
	if( budget < 6.55 ) { 
		if( stability < 9.3 ) { return new Prediction("2", 4, 0); }
		if( stability >= 9.3 ) { return new Prediction("3", 4, 0); }
	}
	}
		if( approval < 1.6 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( budget >= 67.85 ) { 
	if( stability >= 28.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 14, 0); }
	}
		if( stability < 28.4 ) { return new Prediction("2", 4, 0); }
	}
	}
	if( approval >= 29.1 ) { 
	if( approval < 82.35 ) { 
	if( stability < 56.45 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 59.85 ) { 
	if( approval >= 48.5 ) { 
	if( stability >= 48 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 9, 0); }
		if( approval < 51.5 ) { return new Prediction("3", 3, 0); }
	}
		if( stability < 48 ) { return new Prediction("1", 18, 0); }
	}
	if( approval < 48.5 ) { 
	if( budget >= 38.25 ) { 
	if( stability >= 42.4 ) { 
	if( budget < 46.15 ) { 
		if( approval >= 42 ) { return new Prediction("1", 1, 0); }
		if( approval < 42 ) { return new Prediction("3", 7, 0); }
	}
	if( budget >= 46.15 ) { 
		if( stability < 48.75 ) { return new Prediction("2", 4, 0); }
		if( stability >= 48.75 ) { return new Prediction("3", 6, 0); }
	}
	}
		if( stability < 42.4 ) { return new Prediction("2", 18, 0); }
	}
	if( budget < 38.25 ) { 
	if( stability >= 35.5 ) { 
		if( stability < 37.45 ) { return new Prediction("2", 2, 0); }
	if( stability >= 37.45 ) { 
		if( approval < 44.5 ) { return new Prediction("3", 3, 0); }
		if( approval >= 44.5 ) { return new Prediction("1", 4, 0); }
	}
	}
		if( stability < 35.5 ) { return new Prediction("1", 11, 0); }
	}
	}
	}
		if( budget >= 59.85 ) { return new Prediction("2", 15, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 40.15 ) { 
	if( stability < 34.6 ) { 
	if( approval < 31.2 ) { 
		if( budget >= 24.6 ) { return new Prediction("1", 1, 0); }
		if( budget < 24.6 ) { return new Prediction("2", 1, 0); }
	}
	if( approval >= 31.2 ) { 
	if( budget < 32 ) { 
		if( stability >= 28 ) { return new Prediction("2", 6, 0); }
	if( stability < 28 ) { 
		if( approval < 69.4 ) { return new Prediction("3", 5, 0); }
		if( approval >= 69.4 ) { return new Prediction("2", 2, 0); }
	}
	}
		if( budget >= 32 ) { return new Prediction("3", 6, 0); }
	}
	}
	if( stability >= 34.6 ) { 
		if( budget < 38.85 ) { return new Prediction("2", 17, 0); }
	if( budget >= 38.85 ) { 
		if( stability >= 38.65 ) { return new Prediction("2", 4, 0); }
		if( stability < 38.65 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( budget >= 40.15 ) { 
	if( approval >= 47.5 ) { 
	if( budget < 49.95 ) { 
		if( stability < 45.65 ) { return new Prediction("3", 6, 0); }
		if( stability >= 45.65 ) { return new Prediction("2", 6, 0); }
	}
	if( budget >= 49.95 ) { 
		if( stability < 53.9 ) { return new Prediction("3", 12, 0); }
		if( stability >= 53.9 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( approval < 47.5 ) { 
	if( budget < 53.25 ) { 
	if( approval < 45 ) { 
	if( approval >= 42 ) { 
	if( stability >= 42 ) { 
		if( budget < 44.95 ) { return new Prediction("2", 2, 0); }
		if( budget >= 44.95 ) { return new Prediction("1", 4, 0); }
	}
		if( stability < 42 ) { return new Prediction("3", 1, 0); }
	}
	if( approval < 42 ) { 
	if( approval < 38.55 ) { 
		if( stability >= 35.75 ) { return new Prediction("1", 6, 0); }
		if( stability < 35.75 ) { return new Prediction("3", 2, 0); }
	}
		if( approval >= 38.55 ) { return new Prediction("3", 4, 0); }
	}
	}
		if( approval >= 45 ) { return new Prediction("3", 6, 0); }
	}
		if( budget >= 53.25 ) { return new Prediction("1", 9, 0); }
	}
	}
	}
	}
	if( stability >= 56.45 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 68.1 ) { return new Prediction("3", 19, 0); }
	if( stability < 68.1 ) { 
	if( budget < 63.25 ) { 
		if( approval < 61.55 ) { return new Prediction("3", 14, 0); }
		if( approval >= 61.55 ) { return new Prediction("1", 3, 0); }
	}
		if( budget >= 63.25 ) { return new Prediction("2", 8, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 68.75 ) { 
		if( approval >= 70.4 ) { return new Prediction("3", 4, 0); }
		if( approval < 70.4 ) { return new Prediction("1", 2, 0); }
	}
	if( budget < 68.75 ) { 
		if( approval < 31.1 ) { return new Prediction("1", 1, 0); }
		if( approval >= 31.1 ) { return new Prediction("2", 18, 0); }
	}
	}
	}
	}
	if( approval >= 82.35 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 81.25 ) { 
		if( approval >= 90.5 ) { return new Prediction("1", 2, 0); }
		if( approval < 90.5 ) { return new Prediction("2", 1, 0); }
	}
		if( budget < 81.25 ) { return new Prediction("1", 17, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability >= 71.75 ) { return new Prediction("2", 2, 0); }
		if( stability < 71.75 ) { return new Prediction("3", 16, 0); }
	}
	}
	}
	}
	if( stability >= 90.3 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 11, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 2, 0); }
	}
	}
return null;
}
private Prediction runTree23() {
	if( stability < 82.75 ) { 
	if( approval < 90.15 ) { 
	if( approval < 31.25 ) { 
	if( stability >= 3.5 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 9 ) { 
	if( stability >= 19.55 ) { 
	if( stability < 27.75 ) { 
	if( approval >= 15 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 6, 0); }
		if( budget >= 29.9 ) { return new Prediction("2", 4, 0); }
	}
		if( approval < 15 ) { return new Prediction("3", 2, 0); }
	}
	if( stability >= 27.75 ) { 
		if( budget >= 68.95 ) { return new Prediction("2", 8, 0); }
		if( budget < 68.95 ) { return new Prediction("3", 6, 0); }
	}
	}
		if( stability < 19.55 ) { return new Prediction("2", 19, 0); }
	}
	if( budget < 9 ) { 
	if( approval < 7.05 ) { 
		if( budget >= 6.35 ) { return new Prediction("2", 1, 0); }
		if( budget < 6.35 ) { return new Prediction("3", 9, 0); }
	}
		if( approval >= 7.05 ) { return new Prediction("1", 12, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( stability >= 31.55 ) { return new Prediction("1", 25, 0); }
	if( stability < 31.55 ) { 
	if( approval >= 6.15 ) { 
	if( budget >= 16.5 ) { 
	if( approval >= 21.05 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 1, 0); }
	if( stability < 28.6 ) { 
		if( approval < 26.05 ) { return new Prediction("3", 2, 0); }
	if( approval >= 26.05 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 1, 0); }
		if( budget >= 25.7 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( approval < 21.05 ) { 
		if( stability < 15.05 ) { return new Prediction("3", 1, 0); }
		if( stability >= 15.05 ) { return new Prediction("1", 4, 0); }
	}
	}
	if( budget < 16.5 ) { 
		if( stability >= 5.2 ) { return new Prediction("2", 15, 0); }
		if( stability < 5.2 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval < 6.15 ) { 
		if( budget < 2.4 ) { return new Prediction("2", 3, 0); }
		if( budget >= 2.4 ) { return new Prediction("1", 17, 0); }
	}
	}
	}
	}
	if( stability < 3.5 ) { 
	if( budget < 7.4 ) { 
		if( budget >= 5.55 ) { return new Prediction("1", 3, 0); }
	if( budget < 5.55 ) { 
	if( budget < 2.35 ) { 
		if( approval < 3.75 ) { return new Prediction("3", 2, 0); }
		if( approval >= 3.75 ) { return new Prediction("1", 5, 0); }
	}
		if( budget >= 2.35 ) { return new Prediction("3", 9, 0); }
	}
	}
	if( budget >= 7.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	if( approval >= 31.25 ) { 
	if( budget < 60.5 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 48.4 ) { 
	if( stability < 49.4 ) { 
		if( stability >= 48.3 ) { return new Prediction("2", 2, 0); }
		if( stability < 48.3 ) { return new Prediction("1", 15, 0); }
	}
	if( stability >= 49.4 ) { 
		if( approval < 51.85 ) { return new Prediction("3", 9, 0); }
	if( approval >= 51.85 ) { 
		if( stability >= 72.9 ) { return new Prediction("3", 4, 0); }
	if( stability < 72.9 ) { 
		if( budget >= 59.45 ) { return new Prediction("3", 1, 0); }
	if( budget < 59.45 ) { 
	if( budget >= 51.2 ) { 
	if( approval < 63.5 ) { 
		if( stability < 57 ) { return new Prediction("1", 1, 0); }
		if( stability >= 57 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 63.5 ) { return new Prediction("1", 3, 0); }
	}
		if( budget < 51.2 ) { return new Prediction("1", 9, 0); }
	}
	}
	}
	}
	}
	if( approval < 48.4 ) { 
	if( budget >= 48.85 ) { 
		if( stability < 49.25 ) { return new Prediction("2", 20, 0); }
		if( stability >= 49.25 ) { return new Prediction("3", 4, 0); }
	}
	if( budget < 48.85 ) { 
	if( approval < 44.5 ) { 
	if( stability >= 35.4 ) { 
		if( stability >= 39.85 ) { return new Prediction("3", 10, 0); }
	if( stability < 39.85 ) { 
		if( budget < 37.55 ) { return new Prediction("3", 1, 0); }
		if( budget >= 37.55 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( stability < 35.4 ) { 
	if( stability >= 32 ) { 
		if( budget < 38.55 ) { return new Prediction("1", 2, 1); }
		if( budget >= 38.55 ) { return new Prediction("2", 4, 0); }
	}
		if( stability < 32 ) { return new Prediction("1", 3, 0); }
	}
	}
		if( approval >= 44.5 ) { return new Prediction("1", 8, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 57.15 ) { 
	if( budget < 40.15 ) { 
		if( approval < 35.5 ) { return new Prediction("3", 5, 0); }
	if( approval >= 35.5 ) { 
	if( budget >= 31.95 ) { 
		if( stability >= 36.55 ) { return new Prediction("2", 5, 0); }
		if( stability < 36.55 ) { return new Prediction("3", 5, 0); }
	}
	if( budget < 31.95 ) { 
		if( stability >= 28.65 ) { return new Prediction("2", 12, 0); }
		if( stability < 28.65 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( budget >= 40.15 ) { 
	if( approval >= 47.5 ) { 
	if( budget < 49.95 ) { 
		if( stability < 45.65 ) { return new Prediction("3", 5, 0); }
	if( stability >= 45.65 ) { 
	if( approval < 52.5 ) { 
		if( budget < 47.1 ) { return new Prediction("2", 1, 0); }
		if( budget >= 47.1 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 52.5 ) { return new Prediction("2", 3, 0); }
	}
	}
		if( budget >= 49.95 ) { return new Prediction("3", 10, 0); }
	}
	if( approval < 47.5 ) { 
	if( budget < 50.45 ) { 
	if( approval < 38.55 ) { 
		if( stability >= 35.75 ) { return new Prediction("1", 5, 0); }
		if( stability < 35.75 ) { return new Prediction("3", 1, 0); }
	}
	if( approval >= 38.55 ) { 
	if( approval >= 42 ) { 
		if( stability < 45 ) { return new Prediction("3", 5, 0); }
	if( stability >= 45 ) { 
		if( budget < 44.95 ) { return new Prediction("2", 1, 0); }
	if( budget >= 44.95 ) { 
		if( stability >= 49 ) { return new Prediction("1", 1, 0); }
	if( stability < 49 ) { 
		if( approval < 45 ) { return new Prediction("1", 2, 0); }
		if( approval >= 45 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
		if( approval < 42 ) { return new Prediction("3", 8, 0); }
	}
	}
		if( budget >= 50.45 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
		if( stability >= 57.15 ) { return new Prediction("2", 19, 0); }
	}
	}
	if( budget >= 60.5 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 75 ) { return new Prediction("2", 34, 0); }
	if( stability >= 75 ) { 
		if( approval < 70.1 ) { return new Prediction("3", 1, 0); }
		if( approval >= 70.1 ) { return new Prediction("2", 3, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( budget < 63.25 ) { return new Prediction("2", 2, 0); }
	if( budget >= 63.25 ) { 
	if( approval < 67.1 ) { 
		if( approval < 43.4 ) { return new Prediction("1", 2, 0); }
	if( approval >= 43.4 ) { 
		if( approval < 61.6 ) { return new Prediction("3", 2, 0); }
		if( approval >= 61.6 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( approval >= 67.1 ) { return new Prediction("3", 15, 0); }
	}
	}
	}
	}
	}
	if( approval >= 90.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 16, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 98.3 ) { return new Prediction("3", 7, 0); }
		if( approval >= 98.3 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( stability >= 82.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 19, 0); }
	if( "positive".equals(type) ) { 
		if( approval >= 33.65 ) { return new Prediction("2", 5, 0); }
		if( approval < 33.65 ) { return new Prediction("1", 1, 0); }
	}
	}
return null;
}
private Prediction runTree24() {
	if( approval < 84.9 ) { 
	if( budget >= 81.25 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 21, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 54.65 ) { return new Prediction("1", 15, 0); }
		if( approval >= 54.65 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( budget < 81.25 ) { 
	if( stability < 7.45 ) { 
	if( budget < 7.35 ) { 
	if( budget < 6.65 ) { 
		if( stability < 1.45 ) { return new Prediction("1", 4, 0); }
	if( stability >= 1.45 ) { 
	if( stability >= 5.15 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 6.95 ) { return new Prediction("1", 8, 0); }
		if( approval < 6.95 ) { return new Prediction("3", 5, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget >= 3.45 ) { 
		if( approval < 5.15 ) { return new Prediction("1", 6, 0); }
		if( approval >= 5.15 ) { return new Prediction("2", 3, 0); }
	}
		if( budget < 3.45 ) { return new Prediction("1", 4, 0); }
	}
	}
	if( stability < 5.15 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 4.6 ) { return new Prediction("1", 9, 0); }
	if( approval < 4.6 ) { 
		if( budget >= 3 ) { return new Prediction("2", 1, 0); }
		if( budget < 3 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( budget < 2.5 ) { return new Prediction("2", 2, 0); }
		if( budget >= 2.5 ) { return new Prediction("3", 9, 0); }
	}
	}
	}
	}
		if( budget >= 6.65 ) { return new Prediction("1", 7, 0); }
	}
	if( budget >= 7.35 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 9.15 ) { return new Prediction("1", 2, 0); }
		if( approval < 9.15 ) { return new Prediction("2", 6, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 5, 0); }
	}
	}
	if( stability >= 7.45 ) { 
	if( budget >= 35.25 ) { 
	if( stability >= 29.3 ) { 
	if( stability < 82.95 ) { 
		if( budget >= 78.3 ) { return new Prediction("3", 5, 0); }
	if( budget < 78.3 ) { 
	if( budget >= 72.45 ) { 
	if( approval >= 38.65 ) { 
		if( approval >= 54.6 ) { return new Prediction("2", 1, 0); }
		if( approval < 54.6 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 38.65 ) { return new Prediction("2", 5, 0); }
	}
	if( budget < 72.45 ) { 
	if( approval >= 28.55 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 48.5 ) { 
	if( stability >= 48 ) { 
	if( approval >= 51.95 ) { 
		if( budget >= 63.05 ) { return new Prediction("3", 1, 0); }
	if( budget < 63.05 ) { 
		if( budget < 53.25 ) { return new Prediction("1", 5, 0); }
	if( budget >= 53.25 ) { 
	if( approval < 63.5 ) { 
		if( stability < 57 ) { return new Prediction("1", 2, 0); }
		if( stability >= 57 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 63.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( approval < 51.95 ) { return new Prediction("3", 7, 0); }
	}
		if( stability < 48 ) { return new Prediction("1", 17, 0); }
	}
	if( approval < 48.5 ) { 
	if( stability >= 39.3 ) { 
		if( budget < 46.15 ) { return new Prediction("3", 9, 0); }
	if( budget >= 46.15 ) { 
		if( stability < 48.75 ) { return new Prediction("2", 8, 0); }
	if( stability >= 48.75 ) { 
		if( budget < 65.3 ) { return new Prediction("3", 3, 0); }
		if( budget >= 65.3 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
	if( stability < 39.3 ) { 
	if( approval < 37.5 ) { 
		if( stability >= 37.6 ) { return new Prediction("3", 1, 0); }
		if( stability < 37.6 ) { return new Prediction("2", 8, 0); }
	}
	if( approval >= 37.5 ) { 
		if( budget >= 43.9 ) { return new Prediction("2", 4, 0); }
		if( budget < 43.9 ) { return new Prediction("1", 9, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 47.5 ) { 
	if( stability < 54.6 ) { 
	if( budget < 49.95 ) { 
		if( approval >= 54.5 ) { return new Prediction("2", 5, 0); }
	if( approval < 54.5 ) { 
	if( budget < 45.55 ) { 
		if( approval < 49.5 ) { return new Prediction("2", 6, 0); }
		if( approval >= 49.5 ) { return new Prediction("3", 1, 0); }
	}
		if( budget >= 45.55 ) { return new Prediction("3", 6, 0); }
	}
	}
		if( budget >= 49.95 ) { return new Prediction("3", 17, 0); }
	}
	if( stability >= 54.6 ) { 
		if( approval < 58.6 ) { return new Prediction("1", 3, 0); }
		if( approval >= 58.6 ) { return new Prediction("2", 7, 0); }
	}
	}
	if( approval < 47.5 ) { 
	if( stability >= 35.5 ) { 
	if( budget >= 41.9 ) { 
	if( stability < 44.25 ) { 
		if( approval >= 39 ) { return new Prediction("3", 6, 0); }
		if( approval < 39 ) { return new Prediction("1", 2, 0); }
	}
	if( stability >= 44.25 ) { 
		if( approval < 45 ) { return new Prediction("1", 7, 0); }
	if( approval >= 45 ) { 
	if( budget < 52.75 ) { 
		if( stability >= 49 ) { return new Prediction("1", 1, 0); }
		if( stability < 49 ) { return new Prediction("3", 1, 0); }
	}
		if( budget >= 52.75 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( budget < 41.9 ) { 
	if( approval >= 39 ) { 
		if( stability < 39.15 ) { return new Prediction("3", 3, 0); }
		if( stability >= 39.15 ) { return new Prediction("2", 3, 0); }
	}
	if( approval < 39 ) { 
		if( budget < 36.8 ) { return new Prediction("2", 2, 0); }
		if( budget >= 36.8 ) { return new Prediction("1", 7, 0); }
	}
	}
	}
		if( stability < 35.5 ) { return new Prediction("3", 10, 0); }
	}
	}
	}
	if( approval < 28.55 ) { 
		if( stability < 71 ) { return new Prediction("1", 8, 0); }
		if( stability >= 71 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	if( stability >= 82.95 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 13, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 3, 0); }
	}
	}
	if( stability < 29.3 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 15, 0); }
	}
	}
	if( budget < 35.25 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 49.75 ) { 
	if( budget >= 10.75 ) { 
	if( approval < 21 ) { 
		if( approval < 12.3 ) { return new Prediction("2", 1, 0); }
		if( approval >= 12.3 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 21 ) { return new Prediction("1", 8, 0); }
	}
	if( budget < 10.75 ) { 
	if( stability < 9.15 ) { 
		if( approval < 5.7 ) { return new Prediction("3", 1, 0); }
		if( approval >= 5.7 ) { return new Prediction("1", 1, 0); }
	}
		if( stability >= 9.15 ) { return new Prediction("3", 8, 0); }
	}
	}
		if( stability >= 49.75 ) { return new Prediction("3", 8, 0); }
	}
	if( "positive".equals(type) ) { 
	if( approval < 23.05 ) { 
		if( budget < 13 ) { return new Prediction("2", 12, 0); }
	if( budget >= 13 ) { 
	if( approval >= 13.3 ) { 
		if( stability < 15.05 ) { return new Prediction("3", 1, 0); }
		if( stability >= 15.05 ) { return new Prediction("1", 2, 0); }
	}
		if( approval < 13.3 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( approval >= 23.05 ) { 
		if( stability >= 33 ) { return new Prediction("2", 30, 0); }
	if( stability < 33 ) { 
	if( budget < 25.7 ) { 
		if( budget < 20.6 ) { return new Prediction("2", 5, 0); }
	if( budget >= 20.6 ) { 
		if( stability >= 21.35 ) { return new Prediction("2", 3, 0); }
		if( stability < 21.35 ) { return new Prediction("3", 2, 0); }
	}
	}
		if( budget >= 25.7 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( approval >= 84.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 25, 0); }
	if( "positive".equals(type) ) { 
	if( stability >= 60.9 ) { 
		if( approval < 87.85 ) { return new Prediction("3", 1, 0); }
		if( approval >= 87.85 ) { return new Prediction("2", 3, 0); }
	}
		if( stability < 60.9 ) { return new Prediction("3", 9, 0); }
	}
	}
return null;
}
private Prediction runTree25() {
	if( budget >= 87.75 ) { 
	if( approval >= 25.1 ) { 
	if( approval < 89.95 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 23, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 2, 0); }
	}
		if( approval >= 89.95 ) { return new Prediction("1", 4, 0); }
	}
	if( approval < 25.1 ) { 
		if( approval < 10.9 ) { return new Prediction("2", 1, 0); }
		if( approval >= 10.9 ) { return new Prediction("1", 12, 0); }
	}
	}
	if( budget < 87.75 ) { 
	if( stability < 80.1 ) { 
	if( approval >= 89.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 8, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 5, 0); }
	}
	if( approval < 89.75 ) { 
	if( stability >= 33.55 ) { 
	if( budget < 40.2 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 37 ) { 
		if( approval < 35.7 ) { return new Prediction("3", 5, 0); }
		if( approval >= 35.7 ) { return new Prediction("2", 3, 0); }
	}
		if( approval >= 37 ) { return new Prediction("1", 12, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 30.75 ) { return new Prediction("1", 5, 0); }
	if( approval >= 30.75 ) { 
		if( stability >= 38.05 ) { return new Prediction("2", 25, 0); }
	if( stability < 38.05 ) { 
	if( approval < 37 ) { 
		if( budget >= 37.4 ) { return new Prediction("1", 2, 0); }
	if( budget < 37.4 ) { 
		if( budget < 32.8 ) { return new Prediction("2", 1, 0); }
		if( budget >= 32.8 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( approval >= 37 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
	if( budget >= 40.2 ) { 
	if( approval >= 34.45 ) { 
	if( stability < 44.4 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 37.5 ) { return new Prediction("3", 4, 0); }
	if( approval >= 37.5 ) { 
		if( budget < 43.95 ) { return new Prediction("1", 1, 0); }
	if( budget >= 43.95 ) { 
		if( stability >= 43.4 ) { return new Prediction("1", 1, 0); }
	if( stability < 43.4 ) { 
	if( approval >= 49 ) { 
		if( approval >= 50.95 ) { return new Prediction("2", 4, 0); }
		if( approval < 50.95 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 49 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( approval < 38.5 ) { return new Prediction("1", 4, 0); }
		if( approval >= 38.5 ) { return new Prediction("3", 18, 0); }
	}
	}
	if( stability >= 44.4 ) { 
	if( budget >= 53.75 ) { 
	if( stability < 60.7 ) { 
	if( approval >= 50.2 ) { 
		if( approval >= 76.2 ) { return new Prediction("2", 2, 0); }
	if( approval < 76.2 ) { 
		if( stability < 48.85 ) { return new Prediction("2", 2, 0); }
	if( stability >= 48.85 ) { 
	if( approval >= 53.35 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 1, 0); }
	if( approval >= 56.35 ) { 
		if( stability >= 60.15 ) { return new Prediction("1", 1, 0); }
		if( stability < 60.15 ) { return new Prediction("3", 6, 0); }
	}
	}
		if( approval < 53.35 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	if( approval < 50.2 ) { 
		if( approval >= 38.65 ) { return new Prediction("1", 4, 0); }
		if( approval < 38.65 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( stability >= 60.7 ) { 
		if( approval < 37.65 ) { return new Prediction("3", 2, 0); }
	if( approval >= 37.65 ) { 
	if( stability >= 65.3 ) { 
		if( budget >= 65.35 ) { return new Prediction("3", 2, 0); }
		if( budget < 65.35 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 65.3 ) { return new Prediction("2", 7, 0); }
	}
	}
	}
	if( budget < 53.75 ) { 
	if( approval >= 38 ) { 
	if( approval >= 45.7 ) { 
	if( budget >= 48.85 ) { 
	if( budget >= 50.95 ) { 
		if( approval >= 50.1 ) { return new Prediction("1", 2, 0); }
		if( approval < 50.1 ) { return new Prediction("2", 1, 0); }
	}
	if( budget < 50.95 ) { 
	if( approval < 55.5 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 6, 0); }
		if( approval < 48.5 ) { return new Prediction("3", 2, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability >= 51.4 ) { return new Prediction("1", 3, 0); }
		if( stability < 51.4 ) { return new Prediction("3", 5, 0); }
	}
	}
	if( approval >= 55.5 ) { 
		if( approval >= 68.15 ) { return new Prediction("1", 1, 0); }
		if( approval < 68.15 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( budget < 48.85 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 47.5 ) { 
	if( approval < 51.85 ) { 
		if( stability < 49.55 ) { return new Prediction("1", 4, 0); }
		if( stability >= 49.55 ) { return new Prediction("3", 3, 0); }
	}
		if( approval >= 51.85 ) { return new Prediction("1", 6, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("2", 3, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 5, 0); }
	}
	}
	if( approval < 45.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 5, 0); }
	if( "positive".equals(type) ) { 
		if( budget >= 41.9 ) { return new Prediction("1", 11, 0); }
		if( budget < 41.9 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
		if( approval < 38 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( approval < 34.45 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 68.95 ) { return new Prediction("2", 7, 0); }
		if( budget < 68.95 ) { return new Prediction("3", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 17, 0); }
	}
	}
	}
	if( stability < 33.55 ) { 
	if( budget >= 21.7 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 38.55 ) { return new Prediction("1", 4, 0); }
		if( budget >= 38.55 ) { return new Prediction("2", 5, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 29.55 ) { 
		if( budget < 32 ) { return new Prediction("2", 7, 0); }
	if( budget >= 32 ) { 
		if( approval < 31.15 ) { return new Prediction("1", 1, 0); }
		if( approval >= 31.15 ) { return new Prediction("3", 11, 0); }
	}
	}
		if( stability < 29.55 ) { return new Prediction("3", 25, 0); }
	}
	}
	if( budget < 21.7 ) { 
	if( stability < 7.45 ) { 
	if( budget < 7.3 ) { 
	if( budget < 6.1 ) { 
	if( stability >= 3.6 ) { 
	if( budget >= 5.25 ) { 
		if( stability < 6.8 ) { return new Prediction("3", 5, 0); }
	if( stability >= 6.8 ) { 
		if( approval >= 5.65 ) { return new Prediction("3", 1, 0); }
		if( approval < 5.65 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( budget < 5.25 ) { 
	if( stability < 6.15 ) { 
		if( budget >= 1.35 ) { return new Prediction("1", 10, 0); }
		if( budget < 1.35 ) { return new Prediction("3", 2, 0); }
	}
	if( stability >= 6.15 ) { 
		if( approval < 4.1 ) { return new Prediction("1", 1, 0); }
	if( approval >= 4.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	if( stability < 3.6 ) { 
	if( budget >= 4.15 ) { 
		if( stability < 2.4 ) { return new Prediction("3", 1, 0); }
		if( stability >= 2.4 ) { return new Prediction("2", 3, 0); }
	}
	if( budget < 4.15 ) { 
		if( approval >= 9.45 ) { return new Prediction("1", 1, 0); }
		if( approval < 9.45 ) { return new Prediction("3", 8, 0); }
	}
	}
	}
	if( budget >= 6.1 ) { 
	if( approval < 4.65 ) { 
		if( approval < 3.7 ) { return new Prediction("1", 4, 0); }
		if( approval >= 3.7 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 4.65 ) { return new Prediction("1", 7, 0); }
	}
	}
	if( budget >= 7.3 ) { 
	if( approval >= 8.1 ) { 
		if( budget < 8.5 ) { return new Prediction("3", 1, 0); }
		if( budget >= 8.5 ) { return new Prediction("1", 2, 0); }
	}
	if( approval < 8.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 10, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( stability >= 7.45 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 8.55 ) { 
		if( approval < 2.5 ) { return new Prediction("2", 1, 0); }
		if( approval >= 2.5 ) { return new Prediction("3", 7, 0); }
	}
	if( approval >= 8.55 ) { 
	if( stability < 13.8 ) { 
		if( budget < 10.15 ) { return new Prediction("1", 2, 0); }
		if( budget >= 10.15 ) { return new Prediction("2", 4, 0); }
	}
	if( stability >= 13.8 ) { 
		if( budget < 16.65 ) { return new Prediction("3", 3, 0); }
		if( budget >= 16.65 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 6.15 ) { 
		if( budget < 16.8 ) { return new Prediction("2", 14, 0); }
	if( budget >= 16.8 ) { 
		if( approval >= 21.5 ) { return new Prediction("2", 1, 0); }
		if( approval < 21.5 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval < 6.15 ) { 
		if( budget >= 11.15 ) { return new Prediction("1", 2, 0); }
	if( budget < 11.15 ) { 
		if( approval >= 3.5 ) { return new Prediction("2", 2, 0); }
		if( approval < 3.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
	if( stability >= 80.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 29, 0); }
	if( "positive".equals(type) ) { 
		if( approval >= 40.6 ) { return new Prediction("2", 7, 0); }
	if( approval < 40.6 ) { 
		if( stability < 85.05 ) { return new Prediction("2", 1, 0); }
		if( stability >= 85.05 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree26() {
	if( "negative".equals(type) ) { 
	if( approval < 84.9 ) { 
	if( budget >= 71.4 ) { 
	if( budget < 76.4 ) { 
		if( stability < 76.8 ) { return new Prediction("2", 7, 0); }
		if( stability >= 76.8 ) { return new Prediction("3", 2, 0); }
	}
		if( budget >= 76.4 ) { return new Prediction("2", 17, 0); }
	}
	if( budget < 71.4 ) { 
	if( stability < 49.4 ) { 
	if( budget < 7.35 ) { 
	if( approval < 6.8 ) { 
		if( stability >= 4.45 ) { return new Prediction("3", 9, 0); }
	if( stability < 4.45 ) { 
		if( approval >= 4.45 ) { return new Prediction("1", 2, 0); }
	if( approval < 4.45 ) { 
		if( approval < 2.85 ) { return new Prediction("3", 1, 0); }
		if( approval >= 2.85 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( approval >= 6.8 ) { 
		if( stability >= 9.35 ) { return new Prediction("3", 1, 0); }
		if( stability < 9.35 ) { return new Prediction("1", 24, 0); }
	}
	}
	if( budget >= 7.35 ) { 
	if( stability >= 12.3 ) { 
	if( approval >= 40.5 ) { 
		if( budget < 47.3 ) { return new Prediction("1", 14, 0); }
	if( budget >= 47.3 ) { 
	if( approval >= 48.5 ) { 
		if( approval < 50.5 ) { return new Prediction("1", 9, 0); }
		if( approval >= 50.5 ) { return new Prediction("2", 3, 0); }
	}
	if( approval < 48.5 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 8, 0); }
	if( budget < 48.85 ) { 
	if( approval >= 47.5 ) { 
		if( stability >= 44.3 ) { return new Prediction("1", 1, 0); }
		if( stability < 44.3 ) { return new Prediction("2", 2, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	if( approval < 40.5 ) { 
	if( stability >= 37.6 ) { 
		if( approval < 37.5 ) { return new Prediction("3", 8, 0); }
	if( approval >= 37.5 ) { 
		if( stability >= 39.85 ) { return new Prediction("3", 2, 0); }
		if( stability < 39.85 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( stability < 37.6 ) { 
	if( approval >= 25.2 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 7, 0); }
	if( budget >= 29.9 ) { 
	if( approval < 37.5 ) { 
		if( approval >= 36.5 ) { return new Prediction("2", 3, 1); }
		if( approval < 36.5 ) { return new Prediction("2", 4, 0); }
	}
		if( approval >= 37.5 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( approval < 25.2 ) { 
	if( stability >= 19.55 ) { 
		if( approval < 17.1 ) { return new Prediction("1", 1, 0); }
		if( approval >= 17.1 ) { return new Prediction("3", 2, 0); }
	}
	if( stability < 19.55 ) { 
	if( approval < 18.2 ) { 
		if( budget < 14.45 ) { return new Prediction("3", 2, 0); }
		if( budget >= 14.45 ) { return new Prediction("2", 2, 0); }
	}
		if( approval >= 18.2 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	}
	}
	if( stability < 12.3 ) { 
	if( approval >= 8.1 ) { 
		if( stability < 5.55 ) { return new Prediction("1", 4, 0); }
	if( stability >= 5.55 ) { 
		if( budget >= 9.35 ) { return new Prediction("2", 4, 0); }
		if( budget < 9.35 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( approval < 8.1 ) { return new Prediction("2", 11, 0); }
	}
	}
	}
	if( stability >= 49.4 ) { 
	if( approval >= 52.35 ) { 
		if( stability < 57.8 ) { return new Prediction("1", 7, 0); }
	if( stability >= 57.8 ) { 
		if( approval >= 71.85 ) { return new Prediction("1", 3, 0); }
		if( approval < 71.85 ) { return new Prediction("3", 14, 0); }
	}
	}
	if( approval < 52.35 ) { 
		if( budget < 66.7 ) { return new Prediction("3", 17, 0); }
	if( budget >= 66.7 ) { 
		if( approval < 40.55 ) { return new Prediction("2", 4, 0); }
		if( approval >= 40.55 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
		if( approval >= 84.9 ) { return new Prediction("1", 21, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 45.8 ) { 
	if( approval < 37.5 ) { 
	if( approval >= 2.9 ) { 
	if( budget >= 27.85 ) { 
	if( stability >= 32.95 ) { 
	if( budget < 36.8 ) { 
	if( approval >= 30.85 ) { 
		if( stability >= 35.5 ) { return new Prediction("2", 5, 0); }
	if( stability < 35.5 ) { 
		if( budget < 33.6 ) { return new Prediction("2", 4, 0); }
		if( budget >= 33.6 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( approval < 30.85 ) { return new Prediction("1", 7, 0); }
	}
		if( budget >= 36.8 ) { return new Prediction("1", 9, 0); }
	}
	if( stability < 32.95 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 7, 0); }
		if( budget < 31.95 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( budget < 27.85 ) { 
	if( budget >= 2.45 ) { 
	if( stability >= 5.95 ) { 
		if( approval < 5.15 ) { return new Prediction("1", 1, 0); }
	if( approval >= 5.15 ) { 
	if( approval < 31.95 ) { 
	if( stability < 15.05 ) { 
		if( budget >= 14.15 ) { return new Prediction("3", 1, 0); }
		if( budget < 14.15 ) { return new Prediction("2", 9, 0); }
	}
	if( stability >= 15.05 ) { 
		if( approval < 16.05 ) { return new Prediction("1", 1, 0); }
		if( approval >= 16.05 ) { return new Prediction("2", 6, 0); }
	}
	}
		if( approval >= 31.95 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( stability < 5.95 ) { 
	if( budget < 4 ) { 
		if( stability < 3.35 ) { return new Prediction("3", 7, 0); }
		if( stability >= 3.35 ) { return new Prediction("2", 2, 0); }
	}
		if( budget >= 4 ) { return new Prediction("3", 15, 0); }
	}
	}
		if( budget < 2.45 ) { return new Prediction("2", 8, 0); }
	}
	}
		if( approval < 2.9 ) { return new Prediction("1", 12, 0); }
	}
	if( approval >= 37.5 ) { 
	if( budget < 40.75 ) { 
		if( stability >= 18.85 ) { return new Prediction("2", 36, 0); }
	if( stability < 18.85 ) { 
		if( approval >= 63.65 ) { return new Prediction("2", 1, 0); }
		if( approval < 63.65 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( budget >= 40.75 ) { 
		if( stability < 41.85 ) { return new Prediction("3", 4, 0); }
		if( stability >= 41.85 ) { return new Prediction("2", 7, 0); }
	}
	}
	}
	if( budget >= 45.8 ) { 
		if( approval < 45.2 ) { return new Prediction("1", 27, 0); }
	if( approval >= 45.2 ) { 
	if( stability >= 51.4 ) { 
	if( approval >= 54.6 ) { 
	if( stability < 61.8 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 3, 0); }
		if( budget >= 52.75 ) { return new Prediction("3", 10, 0); }
	}
	if( stability >= 61.8 ) { 
		if( approval >= 67.55 ) { return new Prediction("2", 2, 0); }
	if( approval < 67.55 ) { 
		if( budget >= 61.1 ) { return new Prediction("1", 2, 0); }
		if( budget < 61.1 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
		if( approval < 54.6 ) { return new Prediction("1", 7, 0); }
	}
		if( stability < 51.4 ) { return new Prediction("3", 37, 0); }
	}
	}
	}
return null;
}
private Prediction runTree27() {
	if( approval < 50.4 ) { 
		if( stability >= 90.75 ) { return new Prediction("3", 4, 0); }
	if( stability < 90.75 ) { 
	if( budget < 66.85 ) { 
	if( approval >= 48.65 ) { 
	if( stability >= 41.6 ) { 
		if( stability >= 48 ) { return new Prediction("3", 1, 0); }
		if( stability < 48 ) { return new Prediction("1", 9, 0); }
	}
	if( stability < 41.6 ) { 
		if( approval < 49.5 ) { return new Prediction("2", 1, 0); }
		if( approval >= 49.5 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval < 48.65 ) { 
	if( budget >= 55.05 ) { 
		if( approval < 34.2 ) { return new Prediction("1", 5, 0); }
	if( approval >= 34.2 ) { 
		if( budget >= 56.75 ) { return new Prediction("3", 4, 0); }
		if( budget < 56.75 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( budget < 55.05 ) { 
	if( budget >= 2.45 ) { 
	if( approval >= 47.5 ) { 
	if( stability < 46.65 ) { 
	if( budget < 43.25 ) { 
		if( stability < 43.55 ) { return new Prediction("2", 4, 0); }
		if( stability >= 43.55 ) { return new Prediction("1", 1, 0); }
	}
		if( budget >= 43.25 ) { return new Prediction("2", 9, 0); }
	}
	if( stability >= 46.65 ) { 
		if( budget >= 48.85 ) { return new Prediction("3", 4, 0); }
	if( budget < 48.85 ) { 
		if( budget < 43.7 ) { return new Prediction("2", 1, 0); }
		if( budget >= 43.7 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( approval < 47.5 ) { 
	if( stability < 3.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 13, 0); }
	}
	if( stability >= 3.45 ) { 
	if( budget < 32 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 5.25 ) { 
		if( stability < 5.85 ) { return new Prediction("2", 4, 0); }
	if( stability >= 5.85 ) { 
		if( budget >= 7.75 ) { return new Prediction("2", 1, 0); }
		if( budget < 7.75 ) { return new Prediction("3", 6, 0); }
	}
	}
	if( approval >= 5.25 ) { 
	if( stability < 27.8 ) { 
		if( approval >= 15 ) { return new Prediction("1", 10, 0); }
	if( approval < 15 ) { 
	if( stability >= 9.35 ) { 
	if( approval >= 9.55 ) { 
		if( budget >= 11.25 ) { return new Prediction("2", 4, 0); }
		if( budget < 11.25 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 9.55 ) { return new Prediction("3", 2, 0); }
	}
	if( stability < 9.35 ) { 
	if( approval < 7.4 ) { 
	if( budget >= 5.25 ) { 
		if( approval < 6.9 ) { return new Prediction("3", 2, 0); }
		if( approval >= 6.9 ) { return new Prediction("2", 1, 0); }
	}
		if( budget < 5.25 ) { return new Prediction("1", 3, 0); }
	}
		if( approval >= 7.4 ) { return new Prediction("1", 9, 0); }
	}
	}
	}
		if( stability >= 27.8 ) { return new Prediction("3", 5, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 26.75 ) { 
		if( approval < 5.35 ) { return new Prediction("1", 9, 0); }
	if( approval >= 5.35 ) { 
		if( budget >= 16.5 ) { return new Prediction("1", 11, 0); }
	if( budget < 16.5 ) { 
		if( stability >= 5.95 ) { return new Prediction("2", 16, 0); }
	if( stability < 5.95 ) { 
		if( approval >= 8.15 ) { return new Prediction("3", 1, 0); }
		if( approval < 8.15 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	if( approval >= 26.75 ) { 
		if( stability >= 28.65 ) { return new Prediction("2", 21, 0); }
	if( stability < 28.65 ) { 
		if( approval >= 30.95 ) { return new Prediction("3", 4, 0); }
		if( approval < 30.95 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	}
	if( budget >= 32 ) { 
	if( stability >= 33.75 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 41.7 ) { 
	if( approval >= 40 ) { 
		if( budget < 49.5 ) { return new Prediction("2", 3, 0); }
		if( budget >= 49.5 ) { return new Prediction("3", 3, 0); }
	}
		if( approval < 40 ) { return new Prediction("3", 12, 0); }
	}
	if( stability < 41.7 ) { 
	if( budget < 39.55 ) { 
		if( approval < 41.5 ) { return new Prediction("2", 1, 0); }
		if( approval >= 41.5 ) { return new Prediction("1", 5, 0); }
	}
		if( budget >= 39.55 ) { return new Prediction("2", 5, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 39.75 ) { 
	if( approval < 43.7 ) { 
	if( budget >= 39.8 ) { 
	if( stability >= 45.25 ) { 
		if( budget < 44.95 ) { return new Prediction("2", 2, 0); }
		if( budget >= 44.95 ) { return new Prediction("1", 2, 0); }
	}
		if( stability < 45.25 ) { return new Prediction("1", 4, 0); }
	}
		if( budget < 39.8 ) { return new Prediction("2", 3, 0); }
	}
	if( approval >= 43.7 ) { 
		if( budget < 49.5 ) { return new Prediction("1", 3, 0); }
		if( budget >= 49.5 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( stability < 39.75 ) { 
		if( approval >= 39 ) { return new Prediction("3", 5, 0); }
	if( approval < 39 ) { 
	if( budget < 40.75 ) { 
		if( approval < 35.5 ) { return new Prediction("1", 3, 0); }
		if( approval >= 35.5 ) { return new Prediction("3", 3, 0); }
	}
		if( budget >= 40.75 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
	}
	if( stability < 33.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 10, 0); }
	}
	}
	}
	}
	}
	if( budget < 2.45 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 4.25 ) { return new Prediction("1", 10, 0); }
	if( approval < 4.25 ) { 
		if( stability >= 2.9 ) { return new Prediction("3", 2, 0); }
		if( stability < 2.9 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( "positive".equals(type) ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
	if( budget >= 66.85 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 17, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 16, 0); }
	}
	}
	}
	if( approval >= 50.4 ) { 
	if( budget < 29.2 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 60.05 ) { return new Prediction("1", 2, 0); }
	if( approval >= 60.05 ) { 
		if( approval < 64.4 ) { return new Prediction("3", 1, 0); }
	if( approval >= 64.4 ) { 
		if( approval >= 68.6 ) { return new Prediction("3", 1, 0); }
		if( approval < 68.6 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( stability < 14.15 ) { return new Prediction("3", 1, 0); }
		if( stability >= 14.15 ) { return new Prediction("2", 21, 0); }
	}
	}
	if( budget >= 29.2 ) { 
	if( budget < 93.3 ) { 
	if( stability >= 42.1 ) { 
	if( stability >= 79.05 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 17, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 3, 0); }
	}
	if( stability < 79.05 ) { 
	if( budget >= 77.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 10, 0); }
	}
	if( budget < 77.55 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 69 ) { 
	if( stability < 52.8 ) { 
		if( budget < 52.9 ) { return new Prediction("1", 4, 0); }
		if( budget >= 52.9 ) { return new Prediction("2", 3, 0); }
	}
	if( stability >= 52.8 ) { 
	if( approval < 56.8 ) { 
		if( approval < 54.15 ) { return new Prediction("3", 3, 0); }
		if( approval >= 54.15 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 56.8 ) { return new Prediction("3", 7, 0); }
	}
	}
		if( approval >= 69 ) { return new Prediction("1", 12, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget < 49.95 ) { return new Prediction("2", 8, 0); }
	if( budget >= 49.95 ) { 
	if( stability >= 56.2 ) { 
		if( approval >= 67.55 ) { return new Prediction("2", 6, 0); }
		if( approval < 67.55 ) { return new Prediction("1", 3, 0); }
	}
		if( stability < 56.2 ) { return new Prediction("3", 8, 0); }
	}
	}
	}
	}
	}
	if( stability < 42.1 ) { 
		if( approval < 94.4 ) { return new Prediction("3", 19, 0); }
	if( approval >= 94.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	if( budget >= 93.3 ) { 
		if( approval < 78.9 ) { return new Prediction("2", 12, 0); }
	if( approval >= 78.9 ) { 
		if( budget < 98.05 ) { return new Prediction("3", 2, 0); }
		if( budget >= 98.05 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree28() {
	if( stability >= 85.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 29, 0); }
	if( "positive".equals(type) ) { 
		if( budget >= 59.65 ) { return new Prediction("1", 1, 0); }
	if( budget < 59.65 ) { 
		if( approval < 31.7 ) { return new Prediction("1", 1, 0); }
		if( approval >= 31.7 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	if( stability < 85.65 ) { 
	if( budget >= 83.35 ) { 
	if( approval >= 27.95 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 88.05 ) { return new Prediction("2", 5, 0); }
	if( budget >= 88.05 ) { 
		if( approval < 89.95 ) { return new Prediction("2", 8, 0); }
		if( approval >= 89.95 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( approval < 60.1 ) { return new Prediction("1", 2, 0); }
		if( approval >= 60.1 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( approval < 27.95 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 16, 0); }
	}
	}
	if( budget < 83.35 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 69.5 ) { 
	if( stability < 57.65 ) { 
	if( budget >= 50.95 ) { 
		if( stability < 55.95 ) { return new Prediction("2", 16, 0); }
		if( stability >= 55.95 ) { return new Prediction("1", 5, 0); }
	}
	if( budget < 50.95 ) { 
	if( budget < 4.1 ) { 
		if( approval >= 6.7 ) { return new Prediction("1", 15, 0); }
	if( approval < 6.7 ) { 
		if( budget >= 1.6 ) { return new Prediction("3", 7, 0); }
	if( budget < 1.6 ) { 
		if( approval >= 2.65 ) { return new Prediction("1", 1, 0); }
		if( approval < 2.65 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( budget >= 4.1 ) { 
	if( stability >= 5.2 ) { 
	if( budget >= 39.15 ) { 
	if( approval >= 48.5 ) { 
	if( budget < 49.5 ) { 
		if( approval < 50.5 ) { return new Prediction("1", 10, 0); }
	if( approval >= 50.5 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 51.5 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( budget >= 49.5 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 1, 0); }
	if( approval < 51.5 ) { 
		if( stability < 47 ) { return new Prediction("1", 1, 0); }
		if( stability >= 47 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	if( approval < 48.5 ) { 
		if( stability < 41.5 ) { return new Prediction("2", 11, 0); }
	if( stability >= 41.5 ) { 
	if( approval >= 47.5 ) { 
		if( stability < 48.75 ) { return new Prediction("1", 1, 0); }
		if( stability >= 48.75 ) { return new Prediction("3", 1, 0); }
	}
	if( approval < 47.5 ) { 
	if( budget >= 45 ) { 
		if( stability < 49.25 ) { return new Prediction("2", 3, 0); }
		if( stability >= 49.25 ) { return new Prediction("3", 2, 0); }
	}
		if( budget < 45 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	if( budget < 39.15 ) { 
		if( budget < 6.6 ) { return new Prediction("3", 6, 0); }
	if( budget >= 6.6 ) { 
	if( approval < 49.4 ) { 
	if( stability < 34.05 ) { 
	if( approval < 23.1 ) { 
		if( approval < 11.5 ) { return new Prediction("1", 3, 0); }
		if( approval >= 11.5 ) { return new Prediction("3", 4, 0); }
	}
		if( approval >= 23.1 ) { return new Prediction("1", 9, 0); }
	}
	if( stability >= 34.05 ) { 
	if( approval >= 42.5 ) { 
		if( approval < 47.9 ) { return new Prediction("1", 3, 0); }
		if( approval >= 47.9 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 42.5 ) { return new Prediction("3", 13, 0); }
	}
	}
		if( approval >= 49.4 ) { return new Prediction("1", 7, 0); }
	}
	}
	}
	if( stability < 5.2 ) { 
	if( stability >= 1.05 ) { 
		if( approval >= 7.75 ) { return new Prediction("1", 1, 0); }
	if( approval < 7.75 ) { 
		if( approval < 4.95 ) { return new Prediction("2", 6, 0); }
	if( approval >= 4.95 ) { 
		if( approval < 6.45 ) { return new Prediction("1", 1, 0); }
		if( approval >= 6.45 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
		if( stability < 1.05 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	if( stability >= 57.65 ) { 
		if( budget < 67.8 ) { return new Prediction("3", 21, 0); }
	if( budget >= 67.8 ) { 
		if( approval >= 60.95 ) { return new Prediction("3", 1, 0); }
		if( approval < 60.95 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
		if( approval >= 69.5 ) { return new Prediction("1", 27, 0); }
	}
	if( "positive".equals(type) ) { 
	if( approval < 56.1 ) { 
	if( budget < 45.55 ) { 
	if( approval >= 2.9 ) { 
	if( stability < 36.4 ) { 
	if( approval < 31.2 ) { 
	if( stability >= 5.95 ) { 
		if( stability >= 32.25 ) { return new Prediction("1", 3, 0); }
	if( stability < 32.25 ) { 
	if( stability >= 7.3 ) { 
	if( budget >= 16.5 ) { 
	if( approval < 21 ) { 
		if( stability < 15.05 ) { return new Prediction("3", 1, 0); }
		if( stability >= 15.05 ) { return new Prediction("1", 3, 0); }
	}
		if( approval >= 21 ) { return new Prediction("2", 5, 0); }
	}
		if( budget < 16.5 ) { return new Prediction("2", 11, 0); }
	}
	if( stability < 7.3 ) { 
		if( approval < 5.35 ) { return new Prediction("1", 4, 0); }
		if( approval >= 5.35 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	if( stability < 5.95 ) { 
	if( budget >= 3.15 ) { 
	if( approval >= 4.6 ) { 
	if( stability >= 4.65 ) { 
		if( approval >= 8.15 ) { return new Prediction("3", 1, 0); }
		if( approval < 8.15 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 4.65 ) { return new Prediction("3", 11, 0); }
	}
	if( approval < 4.6 ) { 
		if( budget < 4.3 ) { return new Prediction("3", 1, 0); }
		if( budget >= 4.3 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( budget < 3.15 ) { return new Prediction("2", 7, 0); }
	}
	}
	if( approval >= 31.2 ) { 
	if( budget < 32 ) { 
	if( approval >= 34.5 ) { 
		if( approval >= 43.45 ) { return new Prediction("3", 3, 0); }
		if( approval < 43.45 ) { return new Prediction("2", 6, 0); }
	}
		if( approval < 34.5 ) { return new Prediction("3", 4, 0); }
	}
		if( budget >= 32 ) { return new Prediction("3", 7, 0); }
	}
	}
	if( stability >= 36.4 ) { 
		if( approval >= 38.35 ) { return new Prediction("2", 11, 0); }
	if( approval < 38.35 ) { 
	if( stability < 42.55 ) { 
		if( budget < 35.8 ) { return new Prediction("2", 1, 0); }
		if( budget >= 35.8 ) { return new Prediction("1", 5, 0); }
	}
	if( stability >= 42.55 ) { 
		if( approval < 25.4 ) { return new Prediction("1", 1, 0); }
		if( approval >= 25.4 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
		if( approval < 2.9 ) { return new Prediction("1", 7, 0); }
	}
	if( budget >= 45.55 ) { 
	if( approval >= 45.7 ) { 
		if( stability >= 51.4 ) { return new Prediction("1", 7, 0); }
		if( stability < 51.4 ) { return new Prediction("3", 14, 0); }
	}
	if( approval < 45.7 ) { 
		if( stability >= 25.5 ) { return new Prediction("1", 22, 0); }
		if( stability < 25.5 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( approval >= 56.1 ) { 
		if( budget >= 69.6 ) { return new Prediction("3", 12, 0); }
	if( budget < 69.6 ) { 
	if( budget >= 51.8 ) { 
	if( approval >= 66.2 ) { 
		if( stability >= 54.05 ) { return new Prediction("2", 11, 0); }
		if( stability < 54.05 ) { return new Prediction("3", 5, 0); }
	}
		if( approval < 66.2 ) { return new Prediction("3", 3, 0); }
	}
		if( budget < 51.8 ) { return new Prediction("2", 19, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree29() {
	if( approval >= 28.05 ) { 
	if( approval < 83.45 ) { 
		if( stability < 13.65 ) { return new Prediction("3", 11, 0); }
	if( stability >= 13.65 ) { 
		if( budget >= 92.65 ) { return new Prediction("2", 10, 0); }
	if( budget < 92.65 ) { 
	if( budget < 63.25 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 49.4 ) { 
	if( approval < 37.5 ) { 
	if( stability >= 29.3 ) { 
	if( stability >= 35.4 ) { 
		if( budget >= 41.1 ) { return new Prediction("2", 1, 0); }
		if( budget < 41.1 ) { return new Prediction("3", 7, 0); }
	}
		if( stability < 35.4 ) { return new Prediction("2", 2, 0); }
	}
		if( stability < 29.3 ) { return new Prediction("1", 5, 0); }
	}
	if( approval >= 37.5 ) { 
		if( budget < 43.15 ) { return new Prediction("1", 11, 0); }
	if( budget >= 43.15 ) { 
		if( budget >= 50.95 ) { return new Prediction("2", 7, 0); }
	if( budget < 50.95 ) { 
	if( stability < 46.75 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 7, 0); }
		if( approval < 48.5 ) { return new Prediction("2", 11, 0); }
	}
		if( stability >= 46.75 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
	}
	if( stability >= 49.4 ) { 
		if( approval < 51.85 ) { return new Prediction("3", 18, 0); }
	if( approval >= 51.85 ) { 
	if( budget >= 17.75 ) { 
	if( approval >= 54.5 ) { 
	if( stability < 66.8 ) { 
	if( approval < 62.05 ) { 
		if( stability < 57 ) { return new Prediction("1", 1, 0); }
		if( stability >= 57 ) { return new Prediction("3", 3, 0); }
	}
		if( approval >= 62.05 ) { return new Prediction("1", 3, 0); }
	}
		if( stability >= 66.8 ) { return new Prediction("3", 6, 0); }
	}
		if( approval < 54.5 ) { return new Prediction("1", 1, 0); }
	}
		if( budget < 17.75 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 38.85 ) { 
	if( stability < 34.6 ) { 
	if( budget < 32 ) { 
		if( approval >= 34.5 ) { return new Prediction("2", 9, 0); }
	if( approval < 34.5 ) { 
		if( approval >= 30.95 ) { return new Prediction("3", 3, 0); }
		if( approval < 30.95 ) { return new Prediction("2", 2, 0); }
	}
	}
		if( budget >= 32 ) { return new Prediction("3", 6, 0); }
	}
		if( stability >= 34.6 ) { return new Prediction("2", 35, 0); }
	}
	if( budget >= 38.85 ) { 
	if( stability >= 51.4 ) { 
		if( approval >= 63.3 ) { return new Prediction("2", 10, 0); }
	if( approval < 63.3 ) { 
		if( stability < 53.9 ) { return new Prediction("2", 2, 0); }
		if( stability >= 53.9 ) { return new Prediction("1", 8, 0); }
	}
	}
	if( stability < 51.4 ) { 
	if( approval < 45 ) { 
	if( stability >= 36.3 ) { 
	if( approval >= 39 ) { 
		if( budget >= 45.95 ) { return new Prediction("1", 2, 0); }
	if( budget < 45.95 ) { 
		if( approval < 41.5 ) { return new Prediction("3", 2, 0); }
		if( approval >= 41.5 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( approval < 39 ) { return new Prediction("1", 11, 0); }
	}
		if( stability < 36.3 ) { return new Prediction("3", 9, 0); }
	}
	if( approval >= 45 ) { 
	if( budget < 45.9 ) { 
		if( budget >= 39.8 ) { return new Prediction("2", 3, 0); }
		if( budget < 39.8 ) { return new Prediction("3", 1, 0); }
	}
		if( budget >= 45.9 ) { return new Prediction("3", 15, 0); }
	}
	}
	}
	}
	}
	if( budget >= 63.25 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 69.2 ) { 
	if( budget < 69.7 ) { 
		if( approval >= 63.65 ) { return new Prediction("1", 1, 0); }
		if( approval < 63.65 ) { return new Prediction("2", 2, 0); }
	}
		if( budget >= 69.7 ) { return new Prediction("2", 12, 0); }
	}
	if( stability >= 69.2 ) { 
		if( budget < 80.6 ) { return new Prediction("3", 10, 0); }
		if( budget >= 80.6 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( stability >= 70.2 ) { return new Prediction("1", 2, 0); }
	if( stability < 70.2 ) { 
		if( approval < 42.25 ) { return new Prediction("1", 1, 0); }
		if( approval >= 42.25 ) { return new Prediction("3", 13, 0); }
	}
	}
	}
	}
	}
	}
	if( approval >= 83.45 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 89.65 ) { 
		if( budget < 76.9 ) { return new Prediction("1", 15, 0); }
	if( budget >= 76.9 ) { 
		if( approval < 87.5 ) { return new Prediction("2", 1, 0); }
		if( approval >= 87.5 ) { return new Prediction("1", 6, 0); }
	}
	}
		if( stability >= 89.65 ) { return new Prediction("3", 1, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget >= 66.75 ) { return new Prediction("3", 5, 0); }
		if( budget < 66.75 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	if( approval < 28.05 ) { 
	if( approval < 7.4 ) { 
	if( approval >= 6.15 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 6.7 ) { 
		if( approval < 6.9 ) { return new Prediction("2", 1, 0); }
		if( approval >= 6.9 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 6.7 ) { return new Prediction("3", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 10, 0); }
	}
	if( approval < 6.15 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 6.35 ) { return new Prediction("2", 8, 0); }
	if( budget < 6.35 ) { 
		if( approval >= 5.2 ) { return new Prediction("1", 3, 0); }
	if( approval < 5.2 ) { 
	if( stability < 3 ) { 
		if( approval < 3.2 ) { return new Prediction("1", 1, 0); }
		if( approval >= 3.2 ) { return new Prediction("2", 4, 0); }
	}
		if( stability >= 3 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 3.1 ) { 
		if( budget < 2.2 ) { return new Prediction("2", 2, 0); }
		if( budget >= 2.2 ) { return new Prediction("3", 3, 0); }
	}
	if( stability >= 3.1 ) { 
	if( budget < 3.7 ) { 
		if( approval < 2.7 ) { return new Prediction("1", 5, 0); }
		if( approval >= 2.7 ) { return new Prediction("2", 4, 0); }
	}
		if( budget >= 3.7 ) { return new Prediction("1", 12, 0); }
	}
	}
	}
	}
	if( approval >= 7.4 ) { 
	if( stability >= 78.9 ) { 
		if( approval >= 17.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 17.5 ) { return new Prediction("3", 9, 0); }
	}
	if( stability < 78.9 ) { 
	if( budget < 9.55 ) { 
	if( stability >= 8.55 ) { 
		if( approval >= 11.05 ) { return new Prediction("3", 1, 0); }
		if( approval < 11.05 ) { return new Prediction("2", 1, 0); }
	}
	if( stability < 8.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 30, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 5, 0); }
	}
	}
	if( budget >= 9.55 ) { 
	if( stability >= 19.55 ) { 
	if( budget >= 73.7 ) { 
		if( stability >= 67.55 ) { return new Prediction("1", 7, 0); }
	if( stability < 67.55 ) { 
	if( approval < 26.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 3, 0); }
	}
		if( approval >= 26.15 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( budget < 73.7 ) { 
		if( budget >= 28.2 ) { return new Prediction("1", 14, 0); }
	if( budget < 28.2 ) { 
		if( stability >= 25 ) { return new Prediction("3", 3, 0); }
	if( stability < 25 ) { 
		if( approval >= 15 ) { return new Prediction("1", 5, 0); }
	if( approval < 15 ) { 
		if( budget >= 19.7 ) { return new Prediction("3", 1, 0); }
		if( budget < 19.7 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	if( stability < 19.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 7, 0); }
	if( "positive".equals(type) ) { 
		if( budget < 14.75 ) { return new Prediction("2", 2, 0); }
		if( budget >= 14.75 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree30() {
	if( approval < 30.2 ) { 
	if( budget >= 65.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 17, 0); }
	}
	if( budget < 65.5 ) { 
	if( stability >= 32.25 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 10, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 11, 0); }
	}
	if( stability < 32.25 ) { 
	if( stability < 7.7 ) { 
	if( stability >= 4.65 ) { 
	if( budget < 9.3 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 6.3 ) { return new Prediction("3", 4, 0); }
		if( approval >= 6.3 ) { return new Prediction("1", 17, 0); }
	}
	if( "positive".equals(type) ) { 
	if( approval < 5.35 ) { 
		if( stability < 7.4 ) { return new Prediction("1", 13, 0); }
	if( stability >= 7.4 ) { 
		if( approval < 2.7 ) { return new Prediction("1", 1, 0); }
		if( approval >= 2.7 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( approval >= 5.35 ) { return new Prediction("2", 3, 0); }
	}
	}
		if( budget >= 9.3 ) { return new Prediction("2", 2, 0); }
	}
	if( stability < 4.65 ) { 
	if( stability >= 3.55 ) { 
	if( approval < 7.4 ) { 
		if( approval < 2.75 ) { return new Prediction("3", 1, 0); }
		if( approval >= 2.75 ) { return new Prediction("2", 11, 0); }
	}
		if( approval >= 7.4 ) { return new Prediction("1", 3, 0); }
	}
	if( stability < 3.55 ) { 
	if( approval < 4.2 ) { 
		if( approval >= 3.35 ) { return new Prediction("2", 5, 0); }
	if( approval < 3.35 ) { 
		if( budget < 3.9 ) { return new Prediction("3", 2, 0); }
		if( budget >= 3.9 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( approval >= 4.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 10, 0); }
	}
	}
	}
	}
	if( stability >= 7.7 ) { 
		if( stability < 8.75 ) { return new Prediction("2", 7, 0); }
	if( stability >= 8.75 ) { 
	if( budget < 4 ) { 
	if( budget >= 2.1 ) { 
		if( budget >= 2.75 ) { return new Prediction("3", 1, 0); }
		if( budget < 2.75 ) { return new Prediction("1", 3, 0); }
	}
		if( budget < 2.1 ) { return new Prediction("3", 1, 0); }
	}
	if( budget >= 4 ) { 
	if( stability >= 19.55 ) { 
	if( approval >= 18.05 ) { 
	if( budget < 36.05 ) { 
	if( stability >= 25 ) { 
		if( stability >= 30.35 ) { return new Prediction("2", 1, 0); }
		if( stability < 30.35 ) { return new Prediction("3", 2, 0); }
	}
	if( stability < 25 ) { 
		if( approval >= 29.5 ) { return new Prediction("1", 1, 0); }
	if( approval < 29.5 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 28.5 ) { 
		if( budget < 26.2 ) { return new Prediction("1", 1, 0); }
		if( budget >= 26.2 ) { return new Prediction("2", 3, 0); }
	}
		if( approval >= 28.5 ) { return new Prediction("1", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 4, 0); }
	}
	}
	}
		if( budget >= 36.05 ) { return new Prediction("3", 2, 0); }
	}
	if( approval < 18.05 ) { 
		if( stability >= 21.85 ) { return new Prediction("3", 1, 0); }
		if( stability < 21.85 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( stability < 19.55 ) { 
	if( budget < 6.15 ) { 
		if( approval >= 5.05 ) { return new Prediction("2", 2, 0); }
		if( approval < 5.05 ) { return new Prediction("3", 1, 0); }
	}
		if( budget >= 6.15 ) { return new Prediction("2", 10, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( approval >= 30.2 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 53.55 ) { 
	if( stability < 48.75 ) { 
	if( budget < 44.15 ) { 
	if( stability >= 37.15 ) { 
		if( approval >= 42.5 ) { return new Prediction("1", 5, 0); }
		if( approval < 42.5 ) { return new Prediction("3", 10, 0); }
	}
	if( stability < 37.15 ) { 
	if( approval < 37.5 ) { 
	if( approval >= 35.2 ) { 
		if( approval >= 36.5 ) { return new Prediction("2", 7, 3); }
		if( approval < 36.5 ) { return new Prediction("2", 2, 0); }
	}
		if( approval < 35.2 ) { return new Prediction("1", 4, 0); }
	}
		if( approval >= 37.5 ) { return new Prediction("1", 7, 0); }
	}
	}
	if( budget >= 44.15 ) { 
	if( budget < 50.45 ) { 
	if( approval >= 47.5 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 4, 0); }
	if( approval < 48.5 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 1, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( approval < 47.5 ) { return new Prediction("2", 10, 0); }
	}
		if( budget >= 50.45 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( stability >= 48.75 ) { 
	if( budget < 47.3 ) { 
	if( approval < 65.35 ) { 
		if( stability >= 54.05 ) { return new Prediction("3", 10, 0); }
	if( stability < 54.05 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 3, 0); }
		if( approval < 51.5 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( approval >= 65.35 ) { return new Prediction("1", 7, 0); }
	}
	if( budget >= 47.3 ) { 
		if( approval < 52.5 ) { return new Prediction("3", 9, 0); }
		if( approval >= 52.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( budget >= 53.55 ) { 
		if( approval >= 85.95 ) { return new Prediction("1", 7, 0); }
	if( approval < 85.95 ) { 
	if( budget < 85.4 ) { 
	if( approval < 69.5 ) { 
	if( stability < 69.2 ) { 
		if( stability < 56.95 ) { return new Prediction("2", 13, 0); }
	if( stability >= 56.95 ) { 
		if( budget < 66.25 ) { return new Prediction("3", 3, 0); }
		if( budget >= 66.25 ) { return new Prediction("2", 6, 0); }
	}
	}
		if( stability >= 69.2 ) { return new Prediction("3", 7, 0); }
	}
	if( approval >= 69.5 ) { 
		if( approval >= 72.45 ) { return new Prediction("3", 2, 0); }
		if( approval < 72.45 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( budget >= 85.4 ) { return new Prediction("2", 19, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 40.15 ) { 
	if( stability >= 38.05 ) { 
	if( approval < 35.5 ) { 
		if( approval >= 33.95 ) { return new Prediction("1", 1, 0); }
		if( approval < 33.95 ) { return new Prediction("2", 5, 0); }
	}
		if( approval >= 35.5 ) { return new Prediction("2", 33, 0); }
	}
	if( stability < 38.05 ) { 
	if( budget >= 22.15 ) { 
	if( stability >= 28.65 ) { 
		if( budget < 32 ) { return new Prediction("2", 6, 0); }
		if( budget >= 32 ) { return new Prediction("3", 4, 0); }
	}
		if( stability < 28.65 ) { return new Prediction("3", 7, 0); }
	}
		if( budget < 22.15 ) { return new Prediction("2", 10, 0); }
	}
	}
	if( budget >= 40.15 ) { 
	if( approval >= 40.6 ) { 
	if( stability >= 52.2 ) { 
	if( approval >= 70.4 ) { 
		if( budget < 70.2 ) { return new Prediction("2", 8, 0); }
		if( budget >= 70.2 ) { return new Prediction("3", 10, 0); }
	}
	if( approval < 70.4 ) { 
		if( approval < 58.6 ) { return new Prediction("1", 7, 0); }
	if( approval >= 58.6 ) { 
		if( approval < 62.85 ) { return new Prediction("2", 1, 0); }
		if( approval >= 62.85 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( stability < 52.2 ) { 
		if( stability < 41.05 ) { return new Prediction("3", 17, 0); }
	if( stability >= 41.05 ) { 
	if( budget < 49.5 ) { 
		if( approval < 45 ) { return new Prediction("2", 2, 0); }
	if( approval >= 45 ) { 
		if( budget < 45.55 ) { return new Prediction("2", 2, 0); }
	if( budget >= 45.55 ) { 
		if( stability >= 49 ) { return new Prediction("2", 2, 0); }
		if( stability < 49 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
		if( budget >= 49.5 ) { return new Prediction("3", 17, 0); }
	}
	}
	}
	if( approval < 40.6 ) { 
		if( budget >= 49.75 ) { return new Prediction("1", 5, 0); }
	if( budget < 49.75 ) { 
	if( approval >= 36.65 ) { 
		if( approval < 38.55 ) { return new Prediction("1", 5, 0); }
	if( approval >= 38.55 ) { 
		if( stability < 41.85 ) { return new Prediction("3", 2, 0); }
		if( stability >= 41.85 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( approval < 36.65 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree31() {
	if( stability < 91.65 ) { 
	if( budget < 82.4 ) { 
	if( budget < 78.15 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 69.2 ) { 
	if( budget >= 52.35 ) { 
	if( stability < 55.95 ) { 
		if( approval < 78.1 ) { return new Prediction("2", 17, 0); }
		if( approval >= 78.1 ) { return new Prediction("1", 3, 0); }
	}
	if( stability >= 55.95 ) { 
		if( approval < 56.8 ) { return new Prediction("2", 2, 0); }
	if( approval >= 56.8 ) { 
		if( stability < 57 ) { return new Prediction("1", 3, 0); }
	if( stability >= 57 ) { 
		if( approval < 64.95 ) { return new Prediction("3", 1, 0); }
		if( approval >= 64.95 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	if( budget < 52.35 ) { 
	if( stability >= 41.3 ) { 
		if( approval < 44.5 ) { return new Prediction("3", 14, 0); }
	if( approval >= 44.5 ) { 
	if( stability < 48.75 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 6, 0); }
	if( approval < 48.5 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 4, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( stability >= 48.75 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 9, 0); }
		if( approval < 51.5 ) { return new Prediction("3", 10, 0); }
	}
	}
	}
	if( stability < 41.3 ) { 
	if( budget < 6.6 ) { 
	if( approval < 6.8 ) { 
		if( stability >= 3.75 ) { return new Prediction("3", 11, 0); }
		if( stability < 3.75 ) { return new Prediction("2", 2, 0); }
	}
	if( approval >= 6.8 ) { 
		if( budget >= 5.55 ) { return new Prediction("3", 1, 0); }
		if( budget < 5.55 ) { return new Prediction("1", 12, 0); }
	}
	}
	if( budget >= 6.6 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 16, 0); }
	if( approval < 48.5 ) { 
		if( approval < 7.7 ) { return new Prediction("2", 7, 0); }
	if( approval >= 7.7 ) { 
	if( approval < 10.1 ) { 
		if( stability >= 5.75 ) { return new Prediction("1", 5, 0); }
	if( stability < 5.75 ) { 
		if( budget < 9.55 ) { return new Prediction("1", 4, 0); }
		if( budget >= 9.55 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( approval >= 10.1 ) { 
	if( budget < 38.55 ) { 
	if( budget < 31.25 ) { 
	if( approval < 23.65 ) { 
		if( approval < 12.3 ) { return new Prediction("2", 1, 0); }
	if( approval >= 12.3 ) { 
		if( stability >= 21.85 ) { return new Prediction("3", 5, 0); }
	if( stability < 21.85 ) { 
		if( approval >= 15 ) { return new Prediction("1", 1, 0); }
		if( approval < 15 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( approval >= 23.65 ) { 
		if( approval >= 35.2 ) { return new Prediction("3", 1, 0); }
		if( approval < 35.2 ) { return new Prediction("1", 6, 0); }
	}
	}
	if( budget >= 31.25 ) { 
	if( stability < 37.45 ) { 
	if( approval >= 36.5 ) { 
		if( approval < 37.5 ) { return new Prediction("1", 8, 3); }
		if( approval >= 37.5 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 36.5 ) { return new Prediction("2", 3, 0); }
	}
	if( stability >= 37.45 ) { 
		if( approval >= 42.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 42.5 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
		if( budget >= 38.55 ) { return new Prediction("2", 9, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( stability >= 69.2 ) { 
		if( approval >= 78.25 ) { return new Prediction("1", 3, 0); }
		if( approval < 78.25 ) { return new Prediction("3", 23, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 45.8 ) { 
		if( approval < 3.1 ) { return new Prediction("1", 9, 0); }
	if( approval >= 3.1 ) { 
	if( stability >= 3.55 ) { 
	if( stability < 42.55 ) { 
	if( budget < 34.2 ) { 
	if( approval < 5.15 ) { 
	if( approval >= 4 ) { 
		if( budget < 3.2 ) { return new Prediction("2", 1, 0); }
		if( budget >= 3.2 ) { return new Prediction("1", 2, 0); }
	}
		if( approval < 4 ) { return new Prediction("2", 1, 0); }
	}
	if( approval >= 5.15 ) { 
		if( budget < 6.15 ) { return new Prediction("2", 14, 0); }
	if( budget >= 6.15 ) { 
	if( stability >= 20.5 ) { 
	if( budget >= 27 ) { 
		if( approval >= 41.9 ) { return new Prediction("3", 2, 0); }
	if( approval < 41.9 ) { 
		if( budget < 32 ) { return new Prediction("2", 7, 0); }
	if( budget >= 32 ) { 
		if( stability < 35.8 ) { return new Prediction("3", 1, 0); }
		if( stability >= 35.8 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
		if( budget < 27 ) { return new Prediction("2", 13, 0); }
	}
	if( stability < 20.5 ) { 
	if( budget < 25.85 ) { 
	if( stability < 16.45 ) { 
	if( approval < 9.5 ) { 
		if( stability >= 7.1 ) { return new Prediction("2", 1, 0); }
		if( stability < 7.1 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 9.5 ) { return new Prediction("3", 4, 0); }
	}
		if( stability >= 16.45 ) { return new Prediction("2", 1, 0); }
	}
	if( budget >= 25.85 ) { 
		if( approval < 25.5 ) { return new Prediction("1", 1, 0); }
		if( approval >= 25.5 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	if( budget >= 34.2 ) { 
	if( approval < 37.5 ) { 
	if( approval >= 29.05 ) { 
		if( stability >= 33.3 ) { return new Prediction("1", 9, 0); }
		if( stability < 33.3 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 29.05 ) { return new Prediction("3", 1, 0); }
	}
	if( approval >= 37.5 ) { 
	if( stability >= 38.55 ) { 
		if( budget >= 41.75 ) { return new Prediction("3", 1, 0); }
		if( budget < 41.75 ) { return new Prediction("2", 5, 0); }
	}
		if( stability < 38.55 ) { return new Prediction("3", 7, 0); }
	}
	}
	}
	if( stability >= 42.55 ) { 
		if( approval < 28.5 ) { return new Prediction("1", 2, 0); }
		if( approval >= 28.5 ) { return new Prediction("2", 37, 0); }
	}
	}
	if( stability < 3.55 ) { 
		if( approval >= 3.95 ) { return new Prediction("3", 15, 0); }
		if( approval < 3.95 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( budget >= 45.8 ) { 
	if( stability >= 51.4 ) { 
	if( budget >= 70.9 ) { 
		if( budget < 71.65 ) { return new Prediction("3", 2, 0); }
		if( budget >= 71.65 ) { return new Prediction("1", 1, 0); }
	}
	if( budget < 70.9 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 9, 0); }
	if( approval >= 56.35 ) { 
		if( stability >= 78.45 ) { return new Prediction("1", 4, 0); }
	if( stability < 78.45 ) { 
	if( approval < 58.55 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 4, 0); }
		if( budget >= 52.75 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 58.55 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
	}
	if( stability < 51.4 ) { 
	if( approval < 44.5 ) { 
		if( stability < 26.95 ) { return new Prediction("3", 4, 0); }
	if( stability >= 26.95 ) { 
	if( stability < 40.4 ) { 
		if( approval >= 28.25 ) { return new Prediction("3", 1, 0); }
		if( approval < 28.25 ) { return new Prediction("1", 2, 0); }
	}
		if( stability >= 40.4 ) { return new Prediction("1", 12, 0); }
	}
	}
		if( approval >= 44.5 ) { return new Prediction("3", 25, 0); }
	}
	}
	}
	}
		if( budget >= 78.15 ) { return new Prediction("3", 8, 0); }
	}
	if( budget >= 82.4 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 84.1 ) { 
		if( stability < 84.55 ) { return new Prediction("2", 20, 0); }
		if( stability >= 84.55 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 84.1 ) { return new Prediction("1", 5, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget < 88.95 ) { return new Prediction("1", 6, 0); }
	if( budget >= 88.95 ) { 
	if( budget >= 90.45 ) { 
		if( approval >= 60.7 ) { return new Prediction("3", 1, 0); }
		if( approval < 60.7 ) { return new Prediction("1", 2, 0); }
	}
		if( budget < 90.45 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
		if( stability >= 91.65 ) { return new Prediction("3", 14, 0); }
return null;
}
private Prediction runTree32() {
	if( stability < 91.65 ) { 
	if( approval < 44.7 ) { 
	if( budget >= 65.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 16, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 21, 0); }
	}
	if( budget < 65.5 ) { 
	if( stability < 7.5 ) { 
	if( stability >= 5.1 ) { 
	if( budget >= 4.95 ) { 
		if( stability < 5.85 ) { return new Prediction("1", 3, 0); }
	if( stability >= 5.85 ) { 
	if( budget >= 5.55 ) { 
	if( stability < 6.8 ) { 
		if( approval < 3 ) { return new Prediction("1", 1, 0); }
		if( approval >= 3 ) { return new Prediction("3", 3, 0); }
	}
		if( stability >= 6.8 ) { return new Prediction("1", 5, 0); }
	}
		if( budget < 5.55 ) { return new Prediction("3", 7, 0); }
	}
	}
	if( budget < 4.95 ) { 
		if( approval >= 9.45 ) { return new Prediction("2", 1, 0); }
		if( approval < 9.45 ) { return new Prediction("1", 17, 0); }
	}
	}
	if( stability < 5.1 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 5.2 ) { 
	if( approval < 7.4 ) { 
		if( approval < 6.3 ) { return new Prediction("1", 2, 0); }
		if( approval >= 6.3 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 7.4 ) { return new Prediction("1", 11, 0); }
	}
	if( approval < 5.2 ) { 
	if( budget < 3.1 ) { 
		if( budget < 1.25 ) { return new Prediction("3", 1, 0); }
		if( budget >= 1.25 ) { return new Prediction("1", 1, 0); }
	}
		if( budget >= 3.1 ) { return new Prediction("2", 9, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 3.45 ) { 
		if( stability >= 1.7 ) { return new Prediction("3", 13, 0); }
		if( stability < 1.7 ) { return new Prediction("1", 1, 0); }
	}
	if( stability >= 3.45 ) { 
		if( budget >= 4.75 ) { return new Prediction("3", 2, 0); }
		if( budget < 4.75 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	}
	if( stability >= 7.5 ) { 
	if( budget >= 27 ) { 
	if( stability >= 33.75 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 35.95 ) { 
		if( budget >= 41.1 ) { return new Prediction("2", 3, 0); }
	if( budget < 41.1 ) { 
		if( stability < 35.65 ) { return new Prediction("1", 1, 0); }
		if( stability >= 35.65 ) { return new Prediction("3", 5, 0); }
	}
	}
		if( approval < 35.95 ) { return new Prediction("3", 15, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget >= 41.9 ) { 
	if( stability < 40.4 ) { 
		if( approval >= 39 ) { return new Prediction("3", 1, 0); }
		if( approval < 39 ) { return new Prediction("1", 1, 0); }
	}
		if( stability >= 40.4 ) { return new Prediction("1", 14, 0); }
	}
	if( budget < 41.9 ) { 
	if( approval < 37.5 ) { 
	if( stability < 36.4 ) { 
		if( approval < 33.5 ) { return new Prediction("1", 2, 0); }
		if( approval >= 33.5 ) { return new Prediction("3", 1, 0); }
	}
	if( stability >= 36.4 ) { 
	if( stability >= 75.65 ) { 
		if( approval < 24.8 ) { return new Prediction("1", 2, 0); }
		if( approval >= 24.8 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 75.65 ) { return new Prediction("1", 9, 0); }
	}
	}
		if( approval >= 37.5 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( stability < 33.75 ) { 
	if( budget < 29.8 ) { 
	if( stability >= 28.6 ) { 
		if( approval < 23.05 ) { return new Prediction("1", 1, 0); }
		if( approval >= 23.05 ) { return new Prediction("2", 1, 0); }
	}
	if( stability < 28.6 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 5, 0); }
	}
	}
	if( budget >= 29.8 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 9, 0); }
	if( "positive".equals(type) ) { 
		if( budget < 32 ) { return new Prediction("2", 3, 0); }
		if( budget >= 32 ) { return new Prediction("3", 10, 0); }
	}
	}
	}
	}
	if( budget < 27 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 27.8 ) { 
	if( budget < 15.35 ) { 
		if( approval < 5.7 ) { return new Prediction("3", 2, 0); }
		if( approval >= 5.7 ) { return new Prediction("1", 3, 0); }
	}
	if( budget >= 15.35 ) { 
	if( stability >= 19.1 ) { 
		if( approval < 22 ) { return new Prediction("3", 1, 0); }
		if( approval >= 22 ) { return new Prediction("1", 2, 0); }
	}
		if( stability < 19.1 ) { return new Prediction("2", 4, 0); }
	}
	}
		if( stability >= 27.8 ) { return new Prediction("3", 4, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget >= 17.8 ) { 
		if( stability < 19.2 ) { return new Prediction("3", 4, 0); }
	if( stability >= 19.2 ) { 
		if( approval < 21 ) { return new Prediction("1", 1, 0); }
		if( approval >= 21 ) { return new Prediction("2", 10, 0); }
	}
	}
		if( budget < 17.8 ) { return new Prediction("2", 18, 0); }
	}
	}
	}
	}
	}
	if( approval >= 44.7 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 49.5 ) { 
	if( approval < 72.95 ) { 
	if( stability >= 48 ) { 
		if( approval < 51.85 ) { return new Prediction("3", 7, 0); }
	if( approval >= 51.85 ) { 
		if( stability < 68.4 ) { return new Prediction("1", 4, 0); }
		if( stability >= 68.4 ) { return new Prediction("3", 5, 0); }
	}
	}
		if( stability < 48 ) { return new Prediction("1", 7, 0); }
	}
		if( approval >= 72.95 ) { return new Prediction("1", 14, 0); }
	}
	if( budget >= 49.5 ) { 
	if( stability < 49.9 ) { 
		if( approval >= 76.9 ) { return new Prediction("1", 5, 0); }
	if( approval < 76.9 ) { 
		if( budget >= 50.5 ) { return new Prediction("2", 14, 0); }
	if( budget < 50.5 ) { 
		if( stability >= 39.3 ) { return new Prediction("1", 4, 0); }
		if( stability < 39.3 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( stability >= 49.9 ) { 
	if( budget < 80.6 ) { 
	if( approval < 69 ) { 
	if( approval >= 49.3 ) { 
		if( stability < 57 ) { return new Prediction("1", 1, 0); }
		if( stability >= 57 ) { return new Prediction("3", 17, 0); }
	}
	if( approval < 49.3 ) { 
		if( approval < 47.3 ) { return new Prediction("3", 1, 0); }
		if( approval >= 47.3 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( approval >= 69 ) { return new Prediction("1", 3, 0); }
	}
	if( budget >= 80.6 ) { 
		if( approval >= 91.55 ) { return new Prediction("1", 1, 0); }
		if( approval < 91.55 ) { return new Prediction("2", 15, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 51.1 ) { 
	if( budget < 61.35 ) { 
	if( budget >= 50.85 ) { 
		if( approval < 60.85 ) { return new Prediction("1", 3, 0); }
		if( approval >= 60.85 ) { return new Prediction("2", 5, 0); }
	}
		if( budget < 50.85 ) { return new Prediction("2", 15, 0); }
	}
	if( budget >= 61.35 ) { 
		if( approval < 69 ) { return new Prediction("1", 2, 0); }
		if( approval >= 69 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( stability < 51.1 ) { 
	if( budget < 44.4 ) { 
		if( budget < 32.1 ) { return new Prediction("2", 7, 0); }
	if( budget >= 32.1 ) { 
		if( approval < 49.5 ) { return new Prediction("2", 5, 0); }
	if( approval >= 49.5 ) { 
		if( budget < 40.95 ) { return new Prediction("3", 5, 0); }
		if( budget >= 40.95 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
		if( budget >= 44.4 ) { return new Prediction("3", 51, 0); }
	}
	}
	}
	}
		if( stability >= 91.65 ) { return new Prediction("3", 13, 0); }
return null;
}
private Prediction runTree33() {
	if( approval < 90.9 ) { 
	if( stability < 91.65 ) { 
	if( budget < 92.05 ) { 
	if( stability < 1.3 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 8, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 1, 0); }
	}
	if( stability >= 1.3 ) { 
	if( approval < 2.75 ) { 
	if( budget < 7.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 12, 0); }
	}
		if( budget >= 7.7 ) { return new Prediction("2", 6, 0); }
	}
	if( approval >= 2.75 ) { 
	if( approval >= 7.45 ) { 
		if( budget < 3.55 ) { return new Prediction("1", 10, 0); }
	if( budget >= 3.55 ) { 
	if( stability >= 4.95 ) { 
	if( budget < 37.2 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 28.5 ) { 
	if( budget >= 9.4 ) { 
	if( stability >= 19.1 ) { 
		if( approval < 23.65 ) { return new Prediction("3", 6, 0); }
		if( approval >= 23.65 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 19.1 ) { return new Prediction("2", 8, 0); }
	}
	if( budget < 9.4 ) { 
		if( approval < 8.55 ) { return new Prediction("3", 1, 0); }
		if( approval >= 8.55 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( approval >= 28.5 ) { 
	if( stability < 63.9 ) { 
	if( stability >= 35.7 ) { 
		if( approval < 53.1 ) { return new Prediction("3", 3, 0); }
		if( approval >= 53.1 ) { return new Prediction("1", 6, 0); }
	}
		if( stability < 35.7 ) { return new Prediction("1", 9, 0); }
	}
	if( stability >= 63.9 ) { 
		if( approval < 80.65 ) { return new Prediction("3", 8, 0); }
		if( approval >= 80.65 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 21 ) { 
	if( stability < 15.05 ) { 
	if( budget < 14.75 ) { 
	if( approval >= 9.55 ) { 
		if( approval >= 11.8 ) { return new Prediction("2", 2, 0); }
		if( approval < 11.8 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 9.55 ) { return new Prediction("2", 3, 0); }
	}
		if( budget >= 14.75 ) { return new Prediction("3", 2, 0); }
	}
		if( stability >= 15.05 ) { return new Prediction("1", 4, 0); }
	}
	if( approval >= 21 ) { 
	if( stability < 32.9 ) { 
		if( approval < 31.25 ) { return new Prediction("2", 9, 0); }
	if( approval >= 31.25 ) { 
	if( stability >= 26.1 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 1, 0); }
		if( budget < 31.95 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 26.1 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( stability >= 32.9 ) { 
		if( approval >= 30.85 ) { return new Prediction("2", 31, 0); }
		if( approval < 30.85 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( budget >= 37.2 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 69.35 ) { 
		if( budget < 77.5 ) { return new Prediction("1", 8, 0); }
	if( budget >= 77.5 ) { 
		if( budget < 88.25 ) { return new Prediction("2", 2, 0); }
		if( budget >= 88.25 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( approval < 69.35 ) { 
	if( stability < 39.15 ) { 
	if( stability >= 32.25 ) { 
	if( budget < 38.55 ) { 
		if( approval >= 42 ) { return new Prediction("1", 1, 0); }
		if( approval < 42 ) { return new Prediction("1", 4, 2); }
	}
		if( budget >= 38.55 ) { return new Prediction("2", 9, 0); }
	}
		if( stability < 32.25 ) { return new Prediction("2", 10, 0); }
	}
	if( stability >= 39.15 ) { 
		if( stability >= 67.9 ) { return new Prediction("3", 15, 0); }
	if( stability < 67.9 ) { 
		if( budget >= 62.5 ) { return new Prediction("2", 12, 0); }
	if( budget < 62.5 ) { 
	if( approval >= 47.5 ) { 
	if( stability < 48.75 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 6, 0); }
	if( approval < 48.5 ) { 
		if( stability < 46.75 ) { return new Prediction("2", 6, 0); }
	if( stability >= 46.75 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 2, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	if( stability >= 48.75 ) { 
	if( approval >= 52 ) { 
		if( stability < 57 ) { return new Prediction("1", 4, 0); }
		if( stability >= 57 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 52 ) { return new Prediction("3", 6, 0); }
	}
	}
	if( approval < 47.5 ) { 
	if( budget >= 46 ) { 
		if( stability < 49.25 ) { return new Prediction("2", 5, 0); }
		if( stability >= 49.25 ) { return new Prediction("3", 5, 0); }
	}
		if( budget < 46 ) { return new Prediction("3", 13, 0); }
	}
	}
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 47.5 ) { 
	if( stability >= 51 ) { 
		if( budget < 70.2 ) { return new Prediction("2", 15, 0); }
	if( budget >= 70.2 ) { 
		if( approval >= 70.4 ) { return new Prediction("3", 5, 0); }
		if( approval < 70.4 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( stability < 51 ) { 
	if( approval < 49.5 ) { 
		if( budget < 52.05 ) { return new Prediction("2", 2, 0); }
		if( budget >= 52.05 ) { return new Prediction("3", 2, 0); }
	}
		if( approval >= 49.5 ) { return new Prediction("3", 19, 0); }
	}
	}
	if( approval < 47.5 ) { 
	if( stability < 48.15 ) { 
	if( stability >= 34.15 ) { 
	if( approval >= 39 ) { 
	if( budget >= 39.95 ) { 
	if( approval < 45 ) { 
	if( budget >= 41.9 ) { 
		if( stability < 41.85 ) { return new Prediction("3", 1, 0); }
		if( stability >= 41.85 ) { return new Prediction("1", 5, 0); }
	}
		if( budget < 41.9 ) { return new Prediction("3", 4, 0); }
	}
		if( approval >= 45 ) { return new Prediction("3", 4, 0); }
	}
		if( budget < 39.95 ) { return new Prediction("2", 3, 0); }
	}
	if( approval < 39 ) { 
	if( stability < 36.4 ) { 
		if( approval < 26.25 ) { return new Prediction("1", 1, 0); }
		if( approval >= 26.25 ) { return new Prediction("3", 1, 0); }
	}
		if( stability >= 36.4 ) { return new Prediction("1", 13, 0); }
	}
	}
	if( stability < 34.15 ) { 
		if( approval >= 24.3 ) { return new Prediction("3", 10, 0); }
		if( approval < 24.3 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( stability >= 48.15 ) { return new Prediction("1", 22, 0); }
	}
	}
	}
	}
		if( stability < 4.95 ) { return new Prediction("3", 9, 0); }
	}
	}
	if( approval < 7.45 ) { 
	if( stability < 9.1 ) { 
	if( budget >= 2.45 ) { 
	if( stability < 7.25 ) { 
	if( stability < 6.25 ) { 
	if( stability < 3.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 5, 0); }
	if( "positive".equals(type) ) { 
		if( stability < 3.1 ) { return new Prediction("3", 6, 0); }
	if( stability >= 3.1 ) { 
		if( approval < 5.1 ) { return new Prediction("1", 1, 0); }
		if( approval >= 5.1 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( stability >= 3.45 ) { 
		if( budget >= 5.3 ) { return new Prediction("2", 5, 0); }
	if( budget < 5.3 ) { 
		if( approval < 4.2 ) { return new Prediction("2", 2, 0); }
		if( approval >= 4.2 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
		if( stability >= 6.25 ) { return new Prediction("3", 9, 0); }
	}
		if( stability >= 7.25 ) { return new Prediction("2", 8, 0); }
	}
		if( budget < 2.45 ) { return new Prediction("2", 5, 0); }
	}
		if( stability >= 9.1 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	}
	if( budget >= 92.05 ) { 
		if( approval < 35.3 ) { return new Prediction("1", 2, 0); }
		if( approval >= 35.3 ) { return new Prediction("2", 10, 0); }
	}
	}
	if( stability >= 91.65 ) { 
	if( approval < 64 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 64 ) { return new Prediction("3", 7, 0); }
	}
	}
	if( approval >= 90.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 12, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 98.3 ) { return new Prediction("3", 3, 0); }
		if( approval >= 98.3 ) { return new Prediction("2", 1, 0); }
	}
	}
return null;
}
private Prediction runTree34() {
	if( approval >= 34.7 ) { 
	if( budget >= 40.05 ) { 
	if( budget < 53.55 ) { 
	if( budget < 50.45 ) { 
	if( stability >= 51.8 ) { 
	if( approval >= 49 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 81.85 ) { return new Prediction("3", 2, 0); }
		if( approval >= 81.85 ) { return new Prediction("1", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 7, 0); }
	}
		if( approval < 49 ) { return new Prediction("1", 4, 0); }
	}
	if( stability < 51.8 ) { 
	if( stability < 48.75 ) { 
	if( approval >= 48.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 15, 0); }
	if( "positive".equals(type) ) { 
		if( approval >= 51.5 ) { return new Prediction("3", 3, 0); }
	if( approval < 51.5 ) { 
		if( approval < 50.5 ) { return new Prediction("3", 1, 0); }
		if( approval >= 50.5 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( approval < 48.5 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 37.5 ) { 
		if( budget < 40.55 ) { return new Prediction("2", 1, 0); }
	if( budget >= 40.55 ) { 
		if( stability < 39.6 ) { return new Prediction("2", 1, 0); }
		if( stability >= 39.6 ) { return new Prediction("3", 7, 0); }
	}
	}
	if( approval >= 37.5 ) { 
		if( budget < 43.15 ) { return new Prediction("1", 2, 0); }
	if( budget >= 43.15 ) { 
	if( approval >= 47.5 ) { 
		if( stability >= 44.3 ) { return new Prediction("1", 1, 0); }
		if( stability < 44.3 ) { return new Prediction("2", 2, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 45 ) { 
	if( stability < 40.55 ) { 
	if( approval < 38.55 ) { 
		if( stability >= 36.9 ) { return new Prediction("1", 4, 0); }
		if( stability < 36.9 ) { return new Prediction("3", 4, 0); }
	}
		if( approval >= 38.55 ) { return new Prediction("3", 6, 0); }
	}
		if( stability >= 40.55 ) { return new Prediction("1", 7, 0); }
	}
	if( approval >= 45 ) { 
		if( budget < 47.1 ) { return new Prediction("2", 3, 0); }
		if( budget >= 47.1 ) { return new Prediction("3", 9, 0); }
	}
	}
	}
	}
	if( stability >= 48.75 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 51.5 ) { return new Prediction("3", 10, 0); }
	}
	}
	}
		if( budget >= 50.45 ) { return new Prediction("1", 11, 0); }
	}
	if( budget >= 53.55 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 83.3 ) { 
	if( approval < 84.9 ) { 
		if( stability < 56.5 ) { return new Prediction("2", 17, 0); }
	if( stability >= 56.5 ) { 
	if( budget < 69.7 ) { 
		if( approval >= 65.6 ) { return new Prediction("1", 1, 0); }
		if( approval < 65.6 ) { return new Prediction("3", 5, 0); }
	}
		if( budget >= 69.7 ) { return new Prediction("2", 11, 0); }
	}
	}
		if( approval >= 84.9 ) { return new Prediction("1", 7, 0); }
	}
		if( stability >= 83.3 ) { return new Prediction("3", 14, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 60.55 ) { 
		if( approval < 60.25 ) { return new Prediction("1", 2, 0); }
		if( approval >= 60.25 ) { return new Prediction("2", 5, 0); }
	}
	if( stability < 60.55 ) { 
		if( approval >= 49 ) { return new Prediction("3", 30, 0); }
	if( approval < 49 ) { 
		if( stability >= 34.95 ) { return new Prediction("1", 4, 0); }
		if( stability < 34.95 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	}
	if( budget < 40.05 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 36.8 ) { 
	if( approval >= 54.75 ) { 
		if( budget < 30.55 ) { return new Prediction("1", 6, 0); }
		if( budget >= 30.55 ) { return new Prediction("3", 3, 0); }
	}
		if( approval < 54.75 ) { return new Prediction("3", 6, 0); }
	}
	if( budget >= 36.8 ) { 
	if( approval >= 36.5 ) { 
	if( stability < 40.9 ) { 
		if( approval < 37.5 ) { return new Prediction("1", 4, 1); }
		if( approval >= 37.5 ) { return new Prediction("1", 6, 0); }
	}
		if( stability >= 40.9 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 36.5 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 32.95 ) { 
		if( budget < 38.85 ) { return new Prediction("2", 43, 0); }
	if( budget >= 38.85 ) { 
		if( stability >= 38.65 ) { return new Prediction("2", 3, 0); }
		if( stability < 38.65 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( stability < 32.95 ) { 
	if( budget < 33.6 ) { 
		if( approval < 51.3 ) { return new Prediction("2", 1, 0); }
	if( approval >= 51.3 ) { 
		if( approval < 69.4 ) { return new Prediction("3", 2, 0); }
		if( approval >= 69.4 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( budget >= 33.6 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	}
	if( approval < 34.7 ) { 
	if( budget < 50.65 ) { 
	if( budget < 18.65 ) { 
	if( stability < 7.6 ) { 
	if( stability >= 5.2 ) { 
		if( approval < 5.25 ) { return new Prediction("1", 14, 0); }
	if( approval >= 5.25 ) { 
	if( approval < 7.05 ) { 
		if( budget >= 3.4 ) { return new Prediction("3", 3, 0); }
		if( budget < 3.4 ) { return new Prediction("2", 2, 0); }
	}
	if( approval >= 7.05 ) { 
		if( approval >= 9.45 ) { return new Prediction("2", 1, 0); }
	if( approval < 9.45 ) { 
		if( budget >= 9.35 ) { return new Prediction("2", 1, 0); }
		if( budget < 9.35 ) { return new Prediction("1", 10, 0); }
	}
	}
	}
	}
	if( stability < 5.2 ) { 
	if( stability < 1.8 ) { 
	if( budget < 6.9 ) { 
		if( stability >= 1.6 ) { return new Prediction("2", 2, 0); }
		if( stability < 1.6 ) { return new Prediction("1", 10, 0); }
	}
		if( budget >= 6.9 ) { return new Prediction("2", 3, 0); }
	}
	if( stability >= 1.8 ) { 
		if( budget >= 8.9 ) { return new Prediction("2", 3, 0); }
	if( budget < 8.9 ) { 
	if( approval >= 4.25 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 4, 0); }
	if( "positive".equals(type) ) { 
		if( approval >= 4.55 ) { return new Prediction("3", 11, 0); }
	if( approval < 4.55 ) { 
		if( budget < 6.75 ) { return new Prediction("1", 1, 0); }
		if( budget >= 6.75 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( approval < 4.25 ) { 
		if( approval >= 3.35 ) { return new Prediction("2", 3, 0); }
	if( approval < 3.35 ) { 
		if( budget >= 3.95 ) { return new Prediction("1", 2, 0); }
		if( budget < 3.95 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	}
	}
	if( stability >= 7.6 ) { 
	if( approval < 26.3 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 9.3 ) { return new Prediction("3", 4, 0); }
	if( budget >= 9.3 ) { 
		if( approval >= 16.1 ) { return new Prediction("3", 2, 0); }
		if( approval < 16.1 ) { return new Prediction("2", 7, 0); }
	}
	}
		if( "positive".equals(type) ) { return new Prediction("2", 13, 0); }
	}
		if( approval >= 26.3 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( budget >= 18.65 ) { 
	if( approval >= 15 ) { 
	if( budget >= 37.75 ) { 
		if( approval < 30.45 ) { return new Prediction("3", 4, 0); }
		if( approval >= 30.45 ) { return new Prediction("2", 1, 0); }
	}
	if( budget < 37.75 ) { 
		if( approval < 18.65 ) { return new Prediction("1", 4, 0); }
	if( approval >= 18.65 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 30.05 ) { return new Prediction("3", 3, 0); }
		if( stability < 30.05 ) { return new Prediction("1", 6, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 28.6 ) { 
		if( budget >= 28.2 ) { return new Prediction("1", 3, 0); }
		if( budget < 28.2 ) { return new Prediction("2", 2, 0); }
	}
	if( stability < 28.6 ) { 
	if( approval < 30.7 ) { 
		if( budget >= 23.4 ) { return new Prediction("3", 1, 0); }
		if( budget < 23.4 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 30.7 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	}
	if( approval < 15 ) { 
	if( budget >= 25.6 ) { 
		if( approval >= 13.1 ) { return new Prediction("3", 1, 0); }
		if( approval < 13.1 ) { return new Prediction("1", 1, 0); }
	}
		if( budget < 25.6 ) { return new Prediction("3", 7, 0); }
	}
	}
	}
	if( budget >= 50.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 9, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 23, 0); }
	}
	}
return null;
}
private Prediction runTree35() {
	if( stability >= 83.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 31, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 31.7 ) { return new Prediction("1", 2, 0); }
		if( approval >= 31.7 ) { return new Prediction("2", 4, 0); }
	}
	}
	if( stability < 83.1 ) { 
	if( approval >= 89.75 ) { 
	if( budget >= 77.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 7, 0); }
	}
		if( budget < 77.55 ) { return new Prediction("1", 16, 0); }
	}
	if( approval < 89.75 ) { 
	if( budget < 93.3 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 69.7 ) { 
	if( stability >= 50.9 ) { 
	if( approval < 51.85 ) { 
		if( budget >= 62.5 ) { return new Prediction("2", 1, 0); }
		if( budget < 62.5 ) { return new Prediction("3", 17, 0); }
	}
	if( approval >= 51.85 ) { 
	if( stability < 72.15 ) { 
	if( approval < 62.2 ) { 
		if( stability < 57 ) { return new Prediction("1", 6, 0); }
		if( stability >= 57 ) { return new Prediction("3", 2, 0); }
	}
		if( approval >= 62.2 ) { return new Prediction("1", 12, 0); }
	}
		if( stability >= 72.15 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( stability < 50.9 ) { 
	if( budget >= 48.85 ) { 
	if( approval >= 48.5 ) { 
		if( budget < 54.15 ) { return new Prediction("1", 15, 0); }
	if( budget >= 54.15 ) { 
		if( approval < 69.75 ) { return new Prediction("2", 3, 0); }
		if( approval >= 69.75 ) { return new Prediction("1", 3, 0); }
	}
	}
		if( approval < 48.5 ) { return new Prediction("2", 17, 0); }
	}
	if( budget < 48.85 ) { 
	if( approval < 37.5 ) { 
		if( stability >= 37.15 ) { return new Prediction("3", 9, 0); }
	if( stability < 37.15 ) { 
	if( budget >= 6.85 ) { 
	if( approval < 28.5 ) { 
	if( approval < 12.3 ) { 
	if( approval >= 8.1 ) { 
		if( budget >= 9.4 ) { return new Prediction("2", 2, 0); }
		if( budget < 9.4 ) { return new Prediction("1", 3, 0); }
	}
		if( approval < 8.1 ) { return new Prediction("2", 10, 0); }
	}
	if( approval >= 12.3 ) { 
		if( approval >= 20.3 ) { return new Prediction("2", 3, 0); }
	if( approval < 20.3 ) { 
		if( stability >= 12.3 ) { return new Prediction("3", 5, 0); }
		if( stability < 12.3 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( approval >= 28.5 ) { 
		if( stability >= 34.75 ) { return new Prediction("2", 1, 0); }
	if( stability < 34.75 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 1, 0); }
		if( budget < 39.15 ) { return new Prediction("1", 11, 0); }
	}
	}
	}
	if( budget < 6.85 ) { 
	if( stability < 9.15 ) { 
	if( stability >= 2.9 ) { 
	if( approval < 7.05 ) { 
	if( stability < 4.05 ) { 
		if( approval >= 3.95 ) { return new Prediction("1", 1, 0); }
		if( approval < 3.95 ) { return new Prediction("3", 1, 0); }
	}
		if( stability >= 4.05 ) { return new Prediction("3", 5, 0); }
	}
		if( approval >= 7.05 ) { return new Prediction("1", 11, 0); }
	}
		if( stability < 2.9 ) { return new Prediction("1", 6, 0); }
	}
		if( stability >= 9.15 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
		if( approval >= 37.5 ) { return new Prediction("1", 21, 0); }
	}
	}
	}
		if( budget >= 69.7 ) { return new Prediction("2", 20, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 45.8 ) { 
	if( approval >= 2.9 ) { 
	if( stability >= 38.55 ) { 
		if( approval >= 40.5 ) { return new Prediction("2", 22, 0); }
	if( approval < 40.5 ) { 
		if( stability < 48.65 ) { return new Prediction("1", 7, 0); }
	if( stability >= 48.65 ) { 
		if( approval < 28.5 ) { return new Prediction("1", 2, 0); }
		if( approval >= 28.5 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	if( stability < 38.55 ) { 
	if( budget < 32 ) { 
	if( stability >= 3.55 ) { 
	if( approval >= 6.15 ) { 
	if( budget >= 25.45 ) { 
		if( approval < 23.05 ) { return new Prediction("1", 1, 0); }
		if( approval >= 23.05 ) { return new Prediction("2", 6, 0); }
	}
	if( budget < 25.45 ) { 
	if( stability >= 5.45 ) { 
		if( budget < 17.7 ) { return new Prediction("2", 21, 0); }
	if( budget >= 17.7 ) { 
		if( stability >= 21.35 ) { return new Prediction("2", 1, 0); }
		if( stability < 21.35 ) { return new Prediction("3", 3, 0); }
	}
	}
		if( stability < 5.45 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( approval < 6.15 ) { 
		if( budget < 3.8 ) { return new Prediction("2", 8, 0); }
		if( budget >= 3.8 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( stability < 3.55 ) { 
		if( approval >= 4.05 ) { return new Prediction("3", 11, 0); }
	if( approval < 4.05 ) { 
		if( approval >= 3.35 ) { return new Prediction("2", 2, 0); }
		if( approval < 3.35 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( budget >= 32 ) { 
	if( stability >= 35.5 ) { 
		if( approval >= 39.5 ) { return new Prediction("3", 3, 0); }
		if( approval < 39.5 ) { return new Prediction("1", 3, 0); }
	}
		if( stability < 35.5 ) { return new Prediction("3", 18, 0); }
	}
	}
	}
		if( approval < 2.9 ) { return new Prediction("1", 12, 0); }
	}
	if( budget >= 45.8 ) { 
	if( approval >= 47.5 ) { 
	if( stability >= 52.2 ) { 
	if( approval < 72.35 ) { 
		if( stability < 61.55 ) { return new Prediction("1", 3, 0); }
	if( stability >= 61.55 ) { 
		if( approval >= 63.3 ) { return new Prediction("2", 1, 0); }
		if( approval < 63.3 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( approval >= 72.35 ) { return new Prediction("3", 5, 0); }
	}
		if( stability < 52.2 ) { return new Prediction("3", 22, 0); }
	}
	if( approval < 47.5 ) { 
	if( approval >= 34.55 ) { 
	if( stability < 48.15 ) { 
	if( budget < 85 ) { 
		if( stability < 44.25 ) { return new Prediction("3", 7, 0); }
	if( stability >= 44.25 ) { 
		if( budget < 49.95 ) { return new Prediction("3", 1, 0); }
		if( budget >= 49.95 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( budget >= 85 ) { return new Prediction("1", 2, 0); }
	}
		if( stability >= 48.15 ) { return new Prediction("1", 7, 0); }
	}
		if( approval < 34.55 ) { return new Prediction("1", 12, 0); }
	}
	}
	}
	}
	if( budget >= 93.3 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 13, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 1, 0); }
	}
	}
	}
return null;
}
private Prediction runTree36() {
	if( approval < 89.65 ) { 
		if( stability >= 92.55 ) { return new Prediction("3", 13, 0); }
	if( stability < 92.55 ) { 
	if( approval < 34 ) { 
	if( budget >= 61.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 17, 0); }
	}
	if( budget < 61.55 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 7.4 ) { 
	if( stability < 5.6 ) { 
	if( budget < 3.1 ) { 
		if( approval >= 2.55 ) { return new Prediction("1", 2, 0); }
		if( approval < 2.55 ) { return new Prediction("3", 1, 0); }
	}
	if( budget >= 3.1 ) { 
		if( budget >= 6.35 ) { return new Prediction("2", 10, 0); }
	if( budget < 6.35 ) { 
		if( approval >= 4.85 ) { return new Prediction("1", 2, 0); }
		if( approval < 4.85 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
		if( stability >= 5.6 ) { return new Prediction("3", 10, 0); }
	}
	if( approval >= 7.4 ) { 
		if( approval < 10 ) { return new Prediction("1", 21, 0); }
	if( approval >= 10 ) { 
	if( stability < 27.75 ) { 
	if( approval >= 15 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 8, 0); }
		if( budget >= 29.9 ) { return new Prediction("2", 1, 0); }
	}
	if( approval < 15 ) { 
	if( budget >= 11.25 ) { 
		if( stability >= 19.1 ) { return new Prediction("3", 1, 0); }
		if( stability < 19.1 ) { return new Prediction("2", 3, 0); }
	}
		if( budget < 11.25 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( stability >= 27.75 ) { 
		if( approval < 30.45 ) { return new Prediction("3", 6, 0); }
		if( approval >= 30.45 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( approval < 3.8 ) { return new Prediction("1", 8, 0); }
	if( approval >= 3.8 ) { 
	if( stability >= 32.25 ) { 
		if( stability < 57.4 ) { return new Prediction("1", 8, 0); }
	if( stability >= 57.4 ) { 
		if( approval >= 22.15 ) { return new Prediction("2", 3, 0); }
		if( approval < 22.15 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( stability < 32.25 ) { 
	if( approval >= 6.15 ) { 
	if( budget < 40.1 ) { 
	if( stability >= 4.4 ) { 
	if( stability >= 25 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 2, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 1, 0); }
	}
		if( stability < 25 ) { return new Prediction("2", 15, 0); }
	}
		if( stability < 4.4 ) { return new Prediction("3", 3, 0); }
	}
		if( budget >= 40.1 ) { return new Prediction("3", 1, 0); }
	}
	if( approval < 6.15 ) { 
		if( budget < 6.2 ) { return new Prediction("2", 5, 0); }
		if( budget >= 6.2 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	}
	}
	}
	if( approval >= 34 ) { 
	if( budget >= 62.85 ) { 
	if( stability >= 13.75 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 75.6 ) { 
	if( approval < 70.95 ) { 
		if( stability < 69.2 ) { return new Prediction("2", 29, 0); }
	if( stability >= 69.2 ) { 
		if( approval < 48.05 ) { return new Prediction("2", 1, 0); }
		if( approval >= 48.05 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval >= 70.95 ) { 
		if( budget < 77.5 ) { return new Prediction("1", 2, 0); }
		if( budget >= 77.5 ) { return new Prediction("2", 6, 0); }
	}
	}
		if( stability >= 75.6 ) { return new Prediction("3", 5, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget < 63.25 ) { return new Prediction("2", 3, 0); }
	if( budget >= 63.25 ) { 
		if( approval >= 73.25 ) { return new Prediction("3", 4, 0); }
	if( approval < 73.25 ) { 
		if( budget < 78 ) { return new Prediction("1", 3, 0); }
	if( budget >= 78 ) { 
		if( approval < 48.05 ) { return new Prediction("1", 1, 0); }
		if( approval >= 48.05 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
		if( stability < 13.75 ) { return new Prediction("3", 6, 0); }
	}
	if( budget < 62.85 ) { 
	if( budget < 36.85 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 33.75 ) { 
		if( budget >= 27.65 ) { return new Prediction("3", 5, 0); }
	if( budget < 27.65 ) { 
		if( approval < 64.4 ) { return new Prediction("3", 3, 0); }
	if( approval >= 64.4 ) { 
		if( stability < 72.15 ) { return new Prediction("1", 3, 0); }
		if( stability >= 72.15 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
		if( budget >= 33.75 ) { return new Prediction("1", 3, 0); }
	}
	if( "positive".equals(type) ) { 
	if( approval < 67 ) { 
	if( stability >= 28 ) { 
		if( budget < 32 ) { return new Prediction("2", 14, 0); }
	if( budget >= 32 ) { 
	if( approval < 37.5 ) { 
		if( stability < 39 ) { return new Prediction("3", 3, 0); }
		if( stability >= 39 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 37.5 ) { return new Prediction("2", 6, 0); }
	}
	}
		if( stability < 28 ) { return new Prediction("3", 4, 0); }
	}
		if( approval >= 67 ) { return new Prediction("2", 16, 0); }
	}
	}
	if( budget >= 36.85 ) { 
	if( budget < 56.4 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 48.5 ) { 
	if( budget < 54.15 ) { 
	if( stability >= 48 ) { 
		if( approval < 51.85 ) { return new Prediction("3", 7, 0); }
	if( approval >= 51.85 ) { 
		if( budget < 40.65 ) { return new Prediction("3", 2, 0); }
		if( budget >= 40.65 ) { return new Prediction("1", 14, 0); }
	}
	}
		if( stability < 48 ) { return new Prediction("1", 19, 0); }
	}
	if( budget >= 54.15 ) { 
		if( stability < 53.65 ) { return new Prediction("2", 1, 0); }
		if( stability >= 53.65 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval < 48.5 ) { 
	if( budget < 43.15 ) { 
	if( stability >= 39.3 ) { 
		if( approval >= 43 ) { return new Prediction("1", 2, 0); }
		if( approval < 43 ) { return new Prediction("3", 3, 0); }
	}
	if( stability < 39.3 ) { 
	if( budget < 39.55 ) { 
	if( approval >= 36.5 ) { 
		if( approval < 37.5 ) { return new Prediction("1", 3, 1); }
		if( approval >= 37.5 ) { return new Prediction("1", 3, 0); }
	}
		if( approval < 36.5 ) { return new Prediction("2", 1, 0); }
	}
		if( budget >= 39.55 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( budget >= 43.15 ) { 
		if( stability < 48.75 ) { return new Prediction("2", 15, 0); }
		if( stability >= 48.75 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 45.7 ) { 
	if( approval < 55.5 ) { 
	if( budget < 45.55 ) { 
		if( approval < 49.5 ) { return new Prediction("2", 2, 0); }
		if( approval >= 49.5 ) { return new Prediction("3", 1, 0); }
	}
		if( budget >= 45.55 ) { return new Prediction("3", 13, 0); }
	}
	if( approval >= 55.5 ) { 
		if( budget >= 38.4 ) { return new Prediction("2", 7, 0); }
		if( budget < 38.4 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval < 45.7 ) { 
	if( budget < 42.45 ) { 
	if( stability >= 38.6 ) { 
		if( approval >= 39 ) { return new Prediction("2", 2, 0); }
		if( approval < 39 ) { return new Prediction("1", 5, 0); }
	}
	if( stability < 38.6 ) { 
	if( stability >= 35.25 ) { 
		if( approval >= 39.5 ) { return new Prediction("3", 4, 0); }
		if( approval < 39.5 ) { return new Prediction("1", 1, 0); }
	}
		if( stability < 35.25 ) { return new Prediction("3", 7, 0); }
	}
	}
	if( budget >= 42.45 ) { 
		if( stability >= 42.4 ) { return new Prediction("1", 8, 0); }
	if( stability < 42.4 ) { 
	if( approval >= 36.65 ) { 
		if( budget >= 47 ) { return new Prediction("3", 1, 0); }
		if( budget < 47 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 36.65 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	if( budget >= 56.4 ) { 
	if( approval >= 57.05 ) { 
		if( budget >= 61.25 ) { return new Prediction("1", 3, 0); }
	if( budget < 61.25 ) { 
		if( approval >= 81.5 ) { return new Prediction("1", 2, 0); }
		if( approval < 81.5 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( approval < 57.05 ) { 
	if( budget < 61.05 ) { 
	if( stability < 56.85 ) { 
		if( stability < 54 ) { return new Prediction("3", 5, 0); }
		if( stability >= 54 ) { return new Prediction("1", 3, 0); }
	}
		if( stability >= 56.85 ) { return new Prediction("3", 10, 0); }
	}
	if( budget >= 61.05 ) { 
		if( approval >= 43.9 ) { return new Prediction("2", 1, 0); }
		if( approval < 43.9 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
	if( approval >= 89.65 ) { 
	if( budget >= 77.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 6, 0); }
	}
	if( budget < 77.55 ) { 
		if( stability < 82.65 ) { return new Prediction("1", 17, 0); }
		if( stability >= 82.65 ) { return new Prediction("2", 1, 0); }
	}
	}
return null;
}
private Prediction runTree37() {
	if( stability < 80.1 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 69.7 ) { 
	if( stability < 48.75 ) { 
	if( budget >= 41.55 ) { 
		if( stability < 15.7 ) { return new Prediction("1", 3, 0); }
	if( stability >= 15.7 ) { 
	if( approval >= 48.5 ) { 
	if( approval >= 50.95 ) { 
	if( approval >= 53.45 ) { 
	if( approval < 73.15 ) { 
		if( budget < 57.1 ) { return new Prediction("1", 1, 0); }
		if( budget >= 57.1 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 73.15 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 53.45 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 50.95 ) { return new Prediction("1", 9, 0); }
	}
	if( approval < 48.5 ) { 
		if( stability < 46.75 ) { return new Prediction("2", 17, 0); }
	if( stability >= 46.75 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 3, 0); }
	if( budget < 48.85 ) { 
		if( approval >= 47.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 47.5 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
	if( budget < 41.55 ) { 
	if( approval < 7.3 ) { 
	if( stability < 3.85 ) { 
		if( stability >= 1.05 ) { return new Prediction("2", 8, 0); }
		if( stability < 1.05 ) { return new Prediction("1", 1, 0); }
	}
	if( stability >= 3.85 ) { 
	if( approval < 2.6 ) { 
		if( budget < 6.2 ) { return new Prediction("3", 4, 0); }
		if( budget >= 6.2 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 2.6 ) { return new Prediction("3", 11, 0); }
	}
	}
	if( approval >= 7.3 ) { 
	if( stability >= 9.35 ) { 
	if( stability >= 36 ) { 
		if( approval >= 42.5 ) { return new Prediction("1", 5, 0); }
		if( approval < 42.5 ) { return new Prediction("3", 9, 0); }
	}
	if( stability < 36 ) { 
	if( approval < 23.1 ) { 
	if( approval >= 15 ) { 
		if( approval < 17.1 ) { return new Prediction("1", 1, 0); }
		if( approval >= 17.1 ) { return new Prediction("3", 1, 0); }
	}
	if( approval < 15 ) { 
		if( budget >= 11.25 ) { return new Prediction("2", 4, 0); }
		if( budget < 11.25 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( approval >= 23.1 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 9, 0); }
	if( budget >= 29.9 ) { 
	if( approval < 37.5 ) { 
	if( approval >= 36.5 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 1, 0); }
		if( budget < 39.15 ) { return new Prediction("1", 5, 2); }
	}
		if( approval < 36.5 ) { return new Prediction("2", 3, 0); }
	}
		if( approval >= 37.5 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
	}
		if( stability < 9.35 ) { return new Prediction("1", 25, 0); }
	}
	}
	}
	if( stability >= 48.75 ) { 
		if( approval >= 71.85 ) { return new Prediction("1", 10, 0); }
	if( approval < 71.85 ) { 
		if( approval < 51.85 ) { return new Prediction("3", 12, 0); }
	if( approval >= 51.85 ) { 
		if( approval < 55.5 ) { return new Prediction("1", 4, 0); }
	if( approval >= 55.5 ) { 
		if( approval < 68.5 ) { return new Prediction("3", 7, 0); }
	if( approval >= 68.5 ) { 
		if( approval >= 70.55 ) { return new Prediction("3", 1, 0); }
		if( approval < 70.55 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( budget >= 69.7 ) { 
		if( budget >= 89.4 ) { return new Prediction("2", 16, 0); }
	if( budget < 89.4 ) { 
		if( approval < 87.5 ) { return new Prediction("2", 17, 0); }
		if( approval >= 87.5 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 40.2 ) { 
	if( stability >= 4.4 ) { 
	if( stability < 33.05 ) { 
	if( approval >= 28.05 ) { 
		if( stability < 14.15 ) { return new Prediction("3", 5, 0); }
	if( stability >= 14.15 ) { 
	if( approval >= 36.5 ) { 
	if( approval < 76.8 ) { 
	if( approval < 54.9 ) { 
		if( approval >= 41.9 ) { return new Prediction("3", 1, 0); }
		if( approval < 41.9 ) { return new Prediction("2", 3, 0); }
	}
		if( approval >= 54.9 ) { return new Prediction("2", 4, 0); }
	}
		if( approval >= 76.8 ) { return new Prediction("3", 1, 0); }
	}
	if( approval < 36.5 ) { 
		if( budget >= 23.4 ) { return new Prediction("3", 7, 0); }
		if( budget < 23.4 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( approval < 28.05 ) { 
		if( stability >= 20.6 ) { return new Prediction("2", 8, 0); }
	if( stability < 20.6 ) { 
	if( approval >= 6.15 ) { 
	if( budget < 14.75 ) { 
	if( stability < 6.15 ) { 
		if( approval >= 8.15 ) { return new Prediction("3", 1, 0); }
		if( approval < 8.15 ) { return new Prediction("2", 2, 0); }
	}
		if( stability >= 6.15 ) { return new Prediction("2", 10, 0); }
	}
		if( budget >= 14.75 ) { return new Prediction("1", 1, 0); }
	}
	if( approval < 6.15 ) { 
	if( budget >= 1.3 ) { 
	if( approval >= 4.85 ) { 
		if( approval >= 5.8 ) { return new Prediction("1", 1, 0); }
		if( approval < 5.8 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 4.85 ) { return new Prediction("1", 7, 0); }
	}
		if( budget < 1.3 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	if( stability >= 33.05 ) { 
		if( approval >= 36.5 ) { return new Prediction("2", 24, 0); }
	if( approval < 36.5 ) { 
	if( budget < 33.6 ) { 
		if( approval < 28.5 ) { return new Prediction("1", 1, 0); }
		if( approval >= 28.5 ) { return new Prediction("2", 5, 0); }
	}
	if( budget >= 33.6 ) { 
		if( stability >= 41.6 ) { return new Prediction("2", 1, 0); }
		if( stability < 41.6 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
	}
	if( stability < 4.4 ) { 
		if( approval < 2.75 ) { return new Prediction("1", 1, 0); }
		if( approval >= 2.75 ) { return new Prediction("3", 14, 0); }
	}
	}
	if( budget >= 40.2 ) { 
	if( approval < 45 ) { 
	if( stability < 40.4 ) { 
	if( approval < 36.15 ) { 
		if( budget < 40.75 ) { return new Prediction("3", 3, 0); }
		if( budget >= 40.75 ) { return new Prediction("1", 7, 0); }
	}
	if( approval >= 36.15 ) { 
	if( budget < 47.25 ) { 
		if( budget < 43.5 ) { return new Prediction("3", 5, 0); }
		if( budget >= 43.5 ) { return new Prediction("1", 2, 0); }
	}
		if( budget >= 47.25 ) { return new Prediction("3", 6, 0); }
	}
	}
	if( stability >= 40.4 ) { 
	if( budget < 43.4 ) { 
		if( approval >= 40 ) { return new Prediction("2", 1, 0); }
		if( approval < 40 ) { return new Prediction("1", 2, 0); }
	}
		if( budget >= 43.4 ) { return new Prediction("1", 23, 0); }
	}
	}
	if( approval >= 45 ) { 
	if( stability >= 51.4 ) { 
	if( budget >= 50.85 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 3, 0); }
	if( approval >= 56.35 ) { 
		if( stability >= 73.35 ) { return new Prediction("1", 1, 0); }
		if( stability < 73.35 ) { return new Prediction("3", 7, 0); }
	}
	}
	if( budget < 50.85 ) { 
	if( stability < 58.95 ) { 
		if( approval >= 52 ) { return new Prediction("2", 2, 0); }
		if( approval < 52 ) { return new Prediction("1", 1, 0); }
	}
		if( stability >= 58.95 ) { return new Prediction("2", 4, 0); }
	}
	}
	if( stability < 51.4 ) { 
	if( budget < 45.55 ) { 
		if( approval < 59.9 ) { return new Prediction("2", 2, 0); }
		if( approval >= 59.9 ) { return new Prediction("3", 2, 0); }
	}
		if( budget >= 45.55 ) { return new Prediction("3", 43, 0); }
	}
	}
	}
	}
	}
	if( stability >= 80.1 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 73.45 ) { return new Prediction("3", 27, 0); }
	if( approval >= 73.45 ) { 
		if( approval >= 77.6 ) { return new Prediction("3", 3, 0); }
		if( approval < 77.6 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( approval < 26.75 ) { return new Prediction("1", 3, 0); }
		if( approval >= 26.75 ) { return new Prediction("2", 9, 0); }
	}
	}
return null;
}
private Prediction runTree38() {
	if( approval < 90.9 ) { 
	if( stability < 90.7 ) { 
	if( stability >= 1.6 ) { 
	if( stability < 3.05 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 5.9 ) { return new Prediction("2", 2, 0); }
		if( approval >= 5.9 ) { return new Prediction("1", 3, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval >= 4 ) { return new Prediction("3", 15, 0); }
		if( approval < 4 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( stability >= 3.05 ) { 
	if( stability < 7.7 ) { 
		if( budget >= 8.55 ) { return new Prediction("2", 7, 0); }
	if( budget < 8.55 ) { 
	if( approval < 9.5 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 7.05 ) { 
		if( stability >= 4.45 ) { return new Prediction("3", 5, 0); }
	if( stability < 4.45 ) { 
		if( approval < 4.95 ) { return new Prediction("2", 1, 0); }
		if( approval >= 4.95 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( approval >= 7.05 ) { return new Prediction("1", 11, 0); }
	}
	if( "positive".equals(type) ) { 
	if( approval < 5.35 ) { 
	if( budget < 2.5 ) { 
		if( approval < 2.05 ) { return new Prediction("1", 1, 0); }
		if( approval >= 2.05 ) { return new Prediction("2", 5, 0); }
	}
		if( budget >= 2.5 ) { return new Prediction("1", 9, 0); }
	}
		if( approval >= 5.35 ) { return new Prediction("2", 4, 0); }
	}
	}
		if( approval >= 9.5 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( stability >= 7.7 ) { 
	if( budget < 19.1 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 13.05 ) { 
		if( approval >= 16.1 ) { return new Prediction("3", 1, 0); }
		if( approval < 16.1 ) { return new Prediction("2", 2, 0); }
	}
		if( budget < 13.05 ) { return new Prediction("3", 10, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 23, 0); }
	}
	if( budget >= 19.1 ) { 
	if( budget >= 65.7 ) { 
	if( approval >= 59 ) { 
	if( stability >= 33.9 ) { 
	if( budget < 70.5 ) { 
		if( budget >= 69.2 ) { return new Prediction("1", 1, 0); }
		if( budget < 69.2 ) { return new Prediction("2", 2, 0); }
	}
	if( budget >= 70.5 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 65.55 ) { return new Prediction("2", 5, 0); }
		if( approval < 65.55 ) { return new Prediction("3", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 4, 0); }
	}
	}
		if( stability < 33.9 ) { return new Prediction("3", 8, 0); }
	}
	if( approval < 59 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 27, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 19, 0); }
	}
	}
	if( budget < 65.7 ) { 
	if( approval < 83.45 ) { 
	if( stability >= 13.75 ) { 
	if( approval >= 69.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 7, 0); }
	if( "positive".equals(type) ) { 
		if( budget < 51.5 ) { return new Prediction("2", 9, 0); }
	if( budget >= 51.5 ) { 
		if( budget < 57.65 ) { return new Prediction("3", 1, 0); }
		if( budget >= 57.65 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( approval < 69.2 ) { 
		if( budget >= 61.9 ) { return new Prediction("3", 8, 0); }
	if( budget < 61.9 ) { 
	if( approval < 57.7 ) { 
	if( approval < 52.7 ) { 
	if( budget >= 39.5 ) { 
	if( stability >= 37.65 ) { 
	if( stability < 48.85 ) { 
	if( budget < 47.3 ) { 
	if( stability < 40.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 1, 0); }
	if( "positive".equals(type) ) { 
	if( stability < 39.15 ) { 
		if( approval >= 40.5 ) { return new Prediction("3", 9, 0); }
		if( approval < 40.5 ) { return new Prediction("1", 6, 0); }
	}
		if( stability >= 39.15 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( stability >= 40.15 ) { 
		if( approval >= 40 ) { return new Prediction("2", 4, 0); }
		if( approval < 40 ) { return new Prediction("3", 8, 0); }
	}
	}
	if( budget >= 47.3 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 47.5 ) { 
		if( budget >= 52.25 ) { return new Prediction("2", 3, 0); }
	if( budget < 52.25 ) { 
		if( approval >= 49 ) { return new Prediction("1", 2, 0); }
	if( approval < 49 ) { 
		if( stability >= 44.3 ) { return new Prediction("1", 4, 0); }
		if( stability < 44.3 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
		if( approval < 47.5 ) { return new Prediction("2", 8, 0); }
	}
	if( "positive".equals(type) ) { 
	if( approval < 45 ) { 
		if( stability < 40.4 ) { return new Prediction("3", 1, 0); }
		if( stability >= 40.4 ) { return new Prediction("1", 4, 0); }
	}
		if( approval >= 45 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	if( stability >= 48.85 ) { 
		if( stability < 51.3 ) { return new Prediction("3", 8, 0); }
	if( stability >= 51.3 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 51.85 ) { return new Prediction("3", 10, 0); }
		if( approval >= 51.85 ) { return new Prediction("1", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 8, 0); }
	}
	}
	}
	if( stability < 37.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 13, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 4, 0); }
	}
	}
	if( budget < 39.5 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 37.5 ) { 
		if( stability >= 33.8 ) { return new Prediction("3", 8, 0); }
	if( stability < 33.8 ) { 
	if( approval < 21 ) { 
		if( stability >= 19.1 ) { return new Prediction("3", 1, 0); }
		if( stability < 19.1 ) { return new Prediction("2", 1, 0); }
	}
	if( approval >= 21 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 6, 0); }
	if( budget >= 29.9 ) { 
	if( budget >= 35.1 ) { 
		if( approval >= 36.5 ) { return new Prediction("2", 3, 1); }
		if( approval < 36.5 ) { return new Prediction("2", 1, 0); }
	}
		if( budget < 35.1 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	if( approval >= 37.5 ) { 
		if( budget < 33.75 ) { return new Prediction("3", 5, 0); }
	if( budget >= 33.75 ) { 
		if( stability >= 40.45 ) { return new Prediction("3", 1, 0); }
		if( stability < 40.45 ) { return new Prediction("1", 6, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 38.05 ) { 
		if( approval < 28.5 ) { return new Prediction("1", 4, 0); }
		if( approval >= 28.5 ) { return new Prediction("2", 23, 0); }
	}
	if( stability < 38.05 ) { 
	if( budget >= 27 ) { 
	if( stability >= 32.95 ) { 
	if( approval >= 33 ) { 
		if( budget < 32.8 ) { return new Prediction("2", 1, 0); }
	if( budget >= 32.8 ) { 
		if( approval >= 43 ) { return new Prediction("3", 2, 0); }
	if( approval < 43 ) { 
		if( budget >= 37.4 ) { return new Prediction("1", 1, 0); }
		if( budget < 37.4 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
		if( approval < 33 ) { return new Prediction("1", 2, 0); }
	}
	if( stability < 32.95 ) { 
	if( budget < 32.55 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 1, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 3, 0); }
	}
		if( budget >= 32.55 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( budget < 27 ) { 
	if( approval >= 17 ) { 
		if( stability < 19.2 ) { return new Prediction("3", 1, 0); }
		if( stability >= 19.2 ) { return new Prediction("2", 9, 0); }
	}
		if( approval < 17 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	}
	if( approval >= 52.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 6, 0); }
	}
	}
	if( approval >= 57.7 ) { 
	if( stability < 69.2 ) { 
		if( budget >= 48.05 ) { return new Prediction("3", 1, 0); }
		if( budget < 48.05 ) { return new Prediction("2", 2, 0); }
	}
		if( stability >= 69.2 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	}
		if( stability < 13.75 ) { return new Prediction("3", 8, 0); }
	}
	if( approval >= 83.45 ) { 
		if( approval < 88.7 ) { return new Prediction("1", 7, 0); }
		if( approval >= 88.7 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( stability < 1.6 ) { 
		if( budget < 6.9 ) { return new Prediction("1", 7, 0); }
		if( budget >= 6.9 ) { return new Prediction("2", 3, 0); }
	}
	}
	if( stability >= 90.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 10, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 2, 0); }
	}
	}
	if( approval >= 90.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 13, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 7, 0); }
	}
return null;
}
private Prediction runTree39() {
	if( approval >= 34.7 ) { 
	if( budget >= 54.1 ) { 
	if( budget >= 92.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 9, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 2, 0); }
	}
	if( budget < 92.65 ) { 
	if( approval >= 91.05 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 6, 0); }
	}
	if( approval < 91.05 ) { 
	if( approval >= 38.65 ) { 
	if( stability >= 86.1 ) { 
		if( budget >= 62.85 ) { return new Prediction("3", 11, 0); }
	if( budget < 62.85 ) { 
		if( approval >= 69.15 ) { return new Prediction("3", 3, 0); }
		if( approval < 69.15 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( stability < 86.1 ) { 
	if( stability < 61.8 ) { 
	if( budget < 56.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 2, 0); }
	}
	if( budget >= 56.4 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 57.45 ) { return new Prediction("3", 4, 0); }
	if( budget >= 57.45 ) { 
		if( budget < 60.8 ) { return new Prediction("1", 1, 0); }
		if( budget >= 60.8 ) { return new Prediction("2", 3, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 52.2 ) { 
		if( approval < 62.3 ) { return new Prediction("1", 1, 0); }
	if( approval >= 62.3 ) { 
		if( budget < 64.75 ) { return new Prediction("2", 1, 0); }
		if( budget >= 64.75 ) { return new Prediction("3", 3, 0); }
	}
	}
		if( stability < 52.2 ) { return new Prediction("3", 22, 0); }
	}
	}
	}
	if( stability >= 61.8 ) { 
	if( budget < 63.7 ) { 
		if( stability >= 75.1 ) { return new Prediction("1", 1, 0); }
	if( stability < 75.1 ) { 
		if( budget >= 59.55 ) { return new Prediction("2", 7, 0); }
	if( budget < 59.55 ) { 
		if( approval < 79.65 ) { return new Prediction("1", 1, 0); }
		if( approval >= 79.65 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( budget >= 63.7 ) { 
	if( stability >= 66.45 ) { 
	if( budget >= 68.25 ) { 
	if( stability >= 68.25 ) { 
	if( approval >= 65.45 ) { 
		if( approval >= 71.75 ) { return new Prediction("2", 2, 0); }
		if( approval < 71.75 ) { return new Prediction("1", 1, 0); }
	}
	if( approval < 65.45 ) { 
		if( approval < 56.45 ) { return new Prediction("2", 1, 0); }
		if( approval >= 56.45 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( stability < 68.25 ) { return new Prediction("3", 3, 0); }
	}
		if( budget < 68.25 ) { return new Prediction("3", 6, 0); }
	}
		if( stability < 66.45 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	}
	if( approval < 38.65 ) { 
		if( approval < 37.15 ) { return new Prediction("3", 2, 0); }
		if( approval >= 37.15 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	if( budget < 54.1 ) { 
		if( approval >= 82.9 ) { return new Prediction("1", 12, 0); }
	if( approval < 82.9 ) { 
	if( approval >= 36.65 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 48.75 ) { 
	if( budget < 43.15 ) { 
	if( budget >= 37.75 ) { 
		if( stability >= 35.25 ) { return new Prediction("1", 11, 0); }
	if( stability < 35.25 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 1, 0); }
		if( budget < 39.15 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( budget < 37.75 ) { 
		if( budget >= 36.75 ) { return new Prediction("3", 3, 0); }
		if( budget < 36.75 ) { return new Prediction("1", 6, 0); }
	}
	}
	if( budget >= 43.15 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 4, 0); }
	if( approval < 48.5 ) { 
		if( stability < 46.75 ) { return new Prediction("2", 14, 0); }
	if( stability >= 46.75 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 1, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( stability >= 48.75 ) { 
		if( approval < 51.85 ) { return new Prediction("3", 9, 0); }
	if( approval >= 51.85 ) { 
		if( stability < 66.65 ) { return new Prediction("1", 9, 0); }
		if( stability >= 66.65 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 44.8 ) { 
	if( stability >= 51.4 ) { 
	if( stability >= 54.75 ) { 
		if( approval < 56.15 ) { return new Prediction("1", 4, 0); }
		if( approval >= 56.15 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 54.75 ) { return new Prediction("2", 3, 0); }
	}
	if( stability < 51.4 ) { 
		if( budget < 45.45 ) { return new Prediction("1", 1, 0); }
	if( budget >= 45.45 ) { 
		if( approval < 45 ) { return new Prediction("1", 9, 0); }
		if( approval >= 45 ) { return new Prediction("3", 11, 0); }
	}
	}
	}
	if( budget < 44.8 ) { 
	if( stability < 40.15 ) { 
	if( budget >= 22.15 ) { 
		if( budget >= 36.45 ) { return new Prediction("3", 10, 0); }
	if( budget < 36.45 ) { 
		if( approval >= 42.4 ) { return new Prediction("3", 5, 0); }
		if( approval < 42.4 ) { return new Prediction("2", 2, 0); }
	}
	}
		if( budget < 22.15 ) { return new Prediction("2", 7, 0); }
	}
		if( stability >= 40.15 ) { return new Prediction("2", 21, 0); }
	}
	}
	}
	if( approval < 36.65 ) { 
	if( budget >= 37.75 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 35.7 ) { return new Prediction("3", 4, 0); }
		if( stability < 35.7 ) { return new Prediction("2", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 8, 0); }
	}
	if( budget < 37.75 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 37.15 ) { return new Prediction("3", 5, 0); }
		if( stability < 37.15 ) { return new Prediction("2", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 7, 0); }
	}
	}
	}
	}
	}
	if( approval < 34.7 ) { 
	if( budget < 45.8 ) { 
	if( budget >= 33.45 ) { 
		if( stability >= 39.1 ) { return new Prediction("3", 7, 0); }
	if( stability < 39.1 ) { 
	if( approval >= 29.05 ) { 
		if( approval < 30.25 ) { return new Prediction("1", 1, 0); }
		if( approval >= 30.25 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 29.05 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( budget < 33.45 ) { 
	if( budget >= 3.75 ) { 
	if( approval < 6.9 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 5.1 ) { 
		if( approval < 2.75 ) { return new Prediction("2", 2, 0); }
		if( approval >= 2.75 ) { return new Prediction("3", 3, 0); }
	}
		if( stability < 5.1 ) { return new Prediction("2", 12, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 5.35 ) { return new Prediction("1", 11, 0); }
		if( approval >= 5.35 ) { return new Prediction("2", 5, 0); }
	}
	}
	if( approval >= 6.9 ) { 
	if( stability >= 4.65 ) { 
	if( budget < 26.3 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 27.8 ) { 
	if( budget >= 9.35 ) { 
		if( stability >= 19.1 ) { return new Prediction("1", 2, 0); }
		if( stability < 19.1 ) { return new Prediction("2", 4, 0); }
	}
	if( budget < 9.35 ) { 
		if( stability >= 8.3 ) { return new Prediction("3", 3, 0); }
		if( stability < 8.3 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( stability >= 27.8 ) { return new Prediction("3", 7, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 6.35 ) { 
	if( budget >= 16.5 ) { 
		if( approval >= 21.5 ) { return new Prediction("2", 4, 0); }
		if( approval < 21.5 ) { return new Prediction("3", 1, 0); }
	}
		if( budget < 16.5 ) { return new Prediction("2", 7, 0); }
	}
		if( stability < 6.35 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( budget >= 26.3 ) { 
		if( budget >= 29.7 ) { return new Prediction("2", 2, 0); }
	if( budget < 29.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 7, 0); }
	if( "positive".equals(type) ) { 
	if( stability >= 28.6 ) { 
		if( approval < 23.05 ) { return new Prediction("1", 3, 0); }
		if( approval >= 23.05 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 28.6 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	if( stability < 4.65 ) { 
		if( stability >= 2.1 ) { return new Prediction("3", 9, 0); }
		if( stability < 2.1 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	if( budget < 3.75 ) { 
	if( approval < 7.3 ) { 
	if( budget >= 2.65 ) { 
	if( stability >= 7.15 ) { 
		if( approval >= 4 ) { return new Prediction("2", 1, 0); }
		if( approval < 4 ) { return new Prediction("3", 1, 0); }
	}
		if( stability < 7.15 ) { return new Prediction("3", 4, 0); }
	}
	if( budget < 2.65 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 2.15 ) { return new Prediction("1", 5, 0); }
		if( stability >= 2.15 ) { return new Prediction("3", 3, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval >= 2.45 ) { return new Prediction("2", 4, 0); }
		if( approval < 2.45 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
		if( approval >= 7.3 ) { return new Prediction("1", 13, 0); }
	}
	}
	}
	if( budget >= 45.8 ) { 
	if( budget >= 72.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 9, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 18, 0); }
	}
	if( budget < 72.45 ) { 
		if( stability < 71 ) { return new Prediction("1", 15, 0); }
		if( stability >= 71 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
return null;
}
private Prediction runTree40() {
	if( budget < 93.3 ) { 
	if( stability < 82.95 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 72 ) { 
	if( stability < 56.45 ) { 
		if( budget >= 58.85 ) { return new Prediction("2", 13, 0); }
	if( budget < 58.85 ) { 
	if( approval >= 5.2 ) { 
		if( budget < 5.4 ) { return new Prediction("1", 18, 0); }
	if( budget >= 5.4 ) { 
	if( approval >= 48.5 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 14, 0); }
	if( approval < 51.5 ) { 
	if( stability >= 47.4 ) { 
		if( stability < 49.4 ) { return new Prediction("2", 1, 0); }
		if( stability >= 49.4 ) { return new Prediction("3", 4, 0); }
	}
		if( stability < 47.4 ) { return new Prediction("1", 9, 0); }
	}
	}
	if( approval < 48.5 ) { 
	if( stability < 48.75 ) { 
	if( budget < 42.1 ) { 
	if( approval < 37.5 ) { 
	if( stability < 27.8 ) { 
		if( approval < 6.1 ) { return new Prediction("3", 2, 0); }
	if( approval >= 6.1 ) { 
	if( stability < 13.8 ) { 
	if( approval < 10.1 ) { 
	if( approval < 9.05 ) { 
		if( budget >= 9.4 ) { return new Prediction("2", 3, 0); }
	if( budget < 9.4 ) { 
		if( approval >= 7.55 ) { return new Prediction("1", 3, 0); }
		if( approval < 7.55 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( approval >= 9.05 ) { return new Prediction("1", 3, 0); }
	}
		if( approval >= 10.1 ) { return new Prediction("2", 6, 0); }
	}
	if( stability >= 13.8 ) { 
	if( budget >= 10.75 ) { 
		if( budget < 26.2 ) { return new Prediction("1", 6, 0); }
		if( budget >= 26.2 ) { return new Prediction("2", 1, 0); }
	}
		if( budget < 10.75 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( stability >= 27.8 ) { 
		if( budget < 33.95 ) { return new Prediction("3", 6, 0); }
	if( budget >= 33.95 ) { 
		if( stability < 39.4 ) { return new Prediction("2", 4, 0); }
		if( stability >= 39.4 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
		if( approval >= 37.5 ) { return new Prediction("1", 11, 0); }
	}
	if( budget >= 42.1 ) { 
	if( approval >= 47.5 ) { 
		if( stability < 46.75 ) { return new Prediction("2", 4, 0); }
	if( stability >= 46.75 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 1, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( approval < 47.5 ) { return new Prediction("2", 11, 0); }
	}
	}
		if( stability >= 48.75 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	if( approval < 5.2 ) { 
	if( stability >= 2.8 ) { 
		if( budget < 7.45 ) { return new Prediction("3", 9, 0); }
		if( budget >= 7.45 ) { return new Prediction("2", 4, 0); }
	}
		if( stability < 2.8 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	if( stability >= 56.45 ) { 
		if( budget >= 68.75 ) { return new Prediction("2", 9, 0); }
		if( budget < 68.75 ) { return new Prediction("3", 15, 0); }
	}
	}
		if( approval >= 72 ) { return new Prediction("1", 21, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 47.1 ) { 
	if( stability < 40.15 ) { 
	if( budget < 36.8 ) { 
	if( stability < 6.2 ) { 
		if( approval >= 4.25 ) { return new Prediction("3", 11, 0); }
	if( approval < 4.25 ) { 
		if( budget < 2.05 ) { return new Prediction("2", 3, 0); }
		if( budget >= 2.05 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( stability >= 6.2 ) { 
	if( approval < 31.2 ) { 
	if( budget < 14.75 ) { 
		if( stability >= 7.35 ) { return new Prediction("2", 15, 0); }
	if( stability < 7.35 ) { 
		if( approval >= 4.45 ) { return new Prediction("2", 1, 0); }
		if( approval < 4.45 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( budget >= 14.75 ) { 
		if( stability < 15.05 ) { return new Prediction("3", 1, 0); }
	if( stability >= 15.05 ) { 
		if( budget >= 28.45 ) { return new Prediction("1", 2, 0); }
	if( budget < 28.45 ) { 
		if( approval < 23 ) { return new Prediction("1", 5, 0); }
		if( approval >= 23 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
	if( approval >= 31.2 ) { 
	if( stability >= 20.5 ) { 
		if( budget < 34.2 ) { return new Prediction("2", 20, 0); }
	if( budget >= 34.2 ) { 
		if( approval < 37 ) { return new Prediction("3", 2, 0); }
		if( approval >= 37 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( stability < 20.5 ) { 
		if( approval < 69.4 ) { return new Prediction("3", 5, 0); }
		if( approval >= 69.4 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	if( budget >= 36.8 ) { 
		if( approval >= 38.05 ) { return new Prediction("3", 9, 0); }
	if( approval < 38.05 ) { 
		if( budget < 40.75 ) { return new Prediction("3", 3, 0); }
		if( budget >= 40.75 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	if( stability >= 40.15 ) { 
	if( approval < 40.85 ) { 
		if( approval >= 36.5 ) { return new Prediction("1", 5, 0); }
	if( approval < 36.5 ) { 
		if( stability >= 81.25 ) { return new Prediction("1", 2, 0); }
		if( stability < 81.25 ) { return new Prediction("2", 6, 0); }
	}
	}
		if( approval >= 40.85 ) { return new Prediction("2", 34, 0); }
	}
	}
	if( budget >= 47.1 ) { 
	if( stability >= 51.4 ) { 
	if( stability >= 52.2 ) { 
		if( approval < 71.4 ) { return new Prediction("1", 27, 0); }
	if( approval >= 71.4 ) { 
		if( approval < 80.15 ) { return new Prediction("2", 6, 0); }
		if( approval >= 80.15 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( stability < 52.2 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 4, 0); }
		if( budget >= 52.75 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( stability < 51.4 ) { 
	if( stability >= 29.9 ) { 
	if( approval < 45 ) { 
		if( stability >= 42.4 ) { return new Prediction("1", 6, 0); }
	if( stability < 42.4 ) { 
		if( approval < 34.15 ) { return new Prediction("1", 2, 0); }
		if( approval >= 34.15 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( approval >= 45 ) { return new Prediction("3", 20, 0); }
	}
		if( stability < 29.9 ) { return new Prediction("3", 9, 0); }
	}
	}
	}
	}
	if( stability >= 82.95 ) { 
	if( approval >= 41.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 18, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 11, 0); }
	}
	if( approval < 41.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	if( budget >= 93.3 ) { 
		if( approval >= 83.85 ) { return new Prediction("3", 1, 0); }
		if( approval < 83.85 ) { return new Prediction("2", 10, 0); }
	}
return null;
}
private Prediction runTree41() {
	if( approval < 9.85 ) { 
	if( budget >= 1.6 ) { 
	if( stability >= 3.15 ) { 
	if( approval >= 7.45 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 8.55 ) { 
		if( approval < 8.4 ) { return new Prediction("1", 8, 0); }
		if( approval >= 8.4 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 8.55 ) { return new Prediction("1", 24, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability < 5.4 ) { return new Prediction("3", 3, 0); }
		if( stability >= 5.4 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( approval < 7.45 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 6.7 ) { return new Prediction("2", 5, 0); }
	if( budget < 6.7 ) { 
	if( approval >= 5.55 ) { 
		if( budget >= 5.2 ) { return new Prediction("3", 1, 0); }
		if( budget < 5.2 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 5.55 ) { return new Prediction("3", 7, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 5.5 ) { 
	if( budget >= 2.9 ) { 
		if( approval >= 5.05 ) { return new Prediction("2", 5, 0); }
		if( approval < 5.05 ) { return new Prediction("1", 6, 0); }
	}
		if( budget < 2.9 ) { return new Prediction("2", 5, 0); }
	}
	if( budget >= 5.5 ) { 
		if( approval >= 6.5 ) { return new Prediction("3", 1, 0); }
		if( approval < 6.5 ) { return new Prediction("1", 10, 0); }
	}
	}
	}
	}
	if( stability < 3.15 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 6.9 ) { 
		if( approval < 2.85 ) { return new Prediction("3", 1, 0); }
		if( approval >= 2.85 ) { return new Prediction("2", 10, 0); }
	}
		if( approval >= 6.9 ) { return new Prediction("1", 5, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 9, 0); }
	}
	}
	if( budget < 1.6 ) { 
		if( approval >= 6.95 ) { return new Prediction("3", 1, 0); }
		if( approval < 6.95 ) { return new Prediction("2", 8, 0); }
	}
	}
	if( approval >= 9.85 ) { 
	if( budget >= 12.55 ) { 
	if( stability < 90.35 ) { 
	if( stability < 44.4 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 44.15 ) { 
	if( approval < 37.5 ) { 
	if( budget >= 16 ) { 
	if( budget < 40.55 ) { 
		if( stability >= 37.15 ) { return new Prediction("3", 3, 0); }
	if( stability < 37.15 ) { 
		if( approval < 29 ) { return new Prediction("2", 5, 0); }
	if( approval >= 29 ) { 
		if( budget < 30.85 ) { return new Prediction("1", 1, 0); }
	if( budget >= 30.85 ) { 
	if( budget >= 37.75 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 1, 0); }
		if( budget < 39.15 ) { return new Prediction("2", 3, 1); }
	}
		if( budget < 37.75 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	if( budget >= 40.55 ) { 
	if( budget >= 41.1 ) { 
		if( approval < 30.45 ) { return new Prediction("3", 2, 0); }
		if( approval >= 30.45 ) { return new Prediction("2", 3, 0); }
	}
		if( budget < 41.1 ) { return new Prediction("3", 5, 0); }
	}
	}
	if( budget < 16 ) { 
		if( budget >= 13.25 ) { return new Prediction("3", 5, 0); }
		if( budget < 13.25 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( approval >= 37.5 ) { 
	if( stability >= 40.45 ) { 
		if( approval >= 42.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 42.5 ) { return new Prediction("3", 1, 0); }
	}
		if( stability < 40.45 ) { return new Prediction("1", 7, 0); }
	}
	}
	if( budget >= 44.15 ) { 
		if( approval < 75.1 ) { return new Prediction("2", 35, 0); }
		if( approval >= 75.1 ) { return new Prediction("1", 7, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 38.8 ) { 
	if( budget < 40.75 ) { 
	if( budget >= 37.4 ) { 
		if( approval < 49.5 ) { return new Prediction("2", 8, 0); }
		if( approval >= 49.5 ) { return new Prediction("3", 1, 0); }
	}
	if( budget < 37.4 ) { 
		if( budget < 18.95 ) { return new Prediction("2", 2, 0); }
		if( budget >= 18.95 ) { return new Prediction("3", 8, 0); }
	}
	}
		if( budget >= 40.75 ) { return new Prediction("3", 21, 0); }
	}
	if( approval < 38.8 ) { 
	if( budget >= 38.4 ) { 
		if( stability >= 25.5 ) { return new Prediction("1", 11, 0); }
		if( stability < 25.5 ) { return new Prediction("3", 1, 0); }
	}
	if( budget < 38.4 ) { 
	if( approval >= 18.05 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 5, 0); }
	if( budget >= 25.7 ) { 
		if( approval >= 36.5 ) { return new Prediction("2", 3, 0); }
	if( approval < 36.5 ) { 
		if( stability >= 35.5 ) { return new Prediction("2", 1, 0); }
	if( stability < 35.5 ) { 
		if( approval >= 31.5 ) { return new Prediction("3", 8, 0); }
	if( approval < 31.5 ) { 
		if( approval < 29 ) { return new Prediction("3", 1, 0); }
		if( approval >= 29 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	if( approval < 18.05 ) { 
		if( approval >= 16 ) { return new Prediction("1", 1, 0); }
	if( approval < 16 ) { 
		if( stability < 15.05 ) { return new Prediction("3", 2, 0); }
		if( stability >= 15.05 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( stability >= 44.4 ) { 
	if( stability >= 52.6 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 67.8 ) { 
		if( approval >= 69.2 ) { return new Prediction("1", 10, 0); }
	if( approval < 69.2 ) { 
		if( budget < 14.45 ) { return new Prediction("1", 3, 0); }
	if( budget >= 14.45 ) { 
		if( stability >= 56.7 ) { return new Prediction("3", 18, 0); }
		if( stability < 56.7 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( budget >= 67.8 ) { 
	if( stability < 82.45 ) { 
	if( approval >= 72.55 ) { 
		if( stability >= 66.95 ) { return new Prediction("2", 2, 0); }
	if( stability < 66.95 ) { 
		if( stability < 56.35 ) { return new Prediction("2", 1, 0); }
		if( stability >= 56.35 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( approval < 72.55 ) { return new Prediction("2", 15, 0); }
	}
		if( stability >= 82.45 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 63.3 ) { 
		if( budget >= 74.65 ) { return new Prediction("3", 3, 0); }
		if( budget < 74.65 ) { return new Prediction("2", 28, 0); }
	}
	if( approval < 63.3 ) { 
	if( approval >= 32.85 ) { 
		if( budget < 42.1 ) { return new Prediction("2", 4, 0); }
		if( budget >= 42.1 ) { return new Prediction("1", 12, 0); }
	}
		if( approval < 32.85 ) { return new Prediction("1", 13, 0); }
	}
	}
	}
	if( stability < 52.6 ) { 
	if( approval < 50.5 ) { 
	if( budget >= 41.1 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 8, 0); }
	if( approval < 48.5 ) { 
	if( approval >= 47.5 ) { 
	if( budget >= 48.85 ) { 
	if( stability >= 47.4 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 48.75 ) { return new Prediction("2", 2, 0); }
		if( stability >= 48.75 ) { return new Prediction("3", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 1, 0); }
	}
		if( stability < 47.4 ) { return new Prediction("3", 3, 0); }
	}
	if( budget < 48.85 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 1, 0); }
	}
	}
	if( approval < 47.5 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 45 ) { return new Prediction("2", 1, 0); }
		if( budget < 45 ) { return new Prediction("3", 1, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability < 46.75 ) { 
		if( approval < 43.5 ) { return new Prediction("1", 2, 0); }
		if( approval >= 43.5 ) { return new Prediction("3", 1, 0); }
	}
		if( stability >= 46.75 ) { return new Prediction("1", 12, 0); }
	}
	}
	}
	}
		if( budget < 41.1 ) { return new Prediction("2", 4, 0); }
	}
	if( approval >= 50.5 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 75.7 ) { 
		if( budget >= 48.4 ) { return new Prediction("1", 3, 0); }
	if( budget < 48.4 ) { 
		if( approval < 54.2 ) { return new Prediction("3", 2, 0); }
		if( approval >= 54.2 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( budget >= 75.7 ) { return new Prediction("2", 1, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability >= 51.4 ) { return new Prediction("2", 1, 0); }
		if( stability < 51.4 ) { return new Prediction("3", 10, 0); }
	}
	}
	}
	}
	}
	if( stability >= 90.35 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 10, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 1, 0); }
	}
	}
	if( budget < 12.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 6, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 11.95 ) { return new Prediction("3", 4, 0); }
		if( approval >= 11.95 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
return null;
}
private Prediction runTree42() {
	if( budget < 89.85 ) { 
	if( stability < 82.6 ) { 
		if( stability >= 81.2 ) { return new Prediction("1", 5, 0); }
	if( stability < 81.2 ) { 
	if( stability < 7.5 ) { 
	if( budget >= 9.05 ) { 
		if( stability >= 2.3 ) { return new Prediction("2", 8, 0); }
		if( stability < 2.3 ) { return new Prediction("1", 1, 0); }
	}
	if( budget < 9.05 ) { 
	if( stability < 4.35 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 3.4 ) { return new Prediction("2", 7, 0); }
		if( budget < 3.4 ) { return new Prediction("1", 7, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 2.85 ) { 
		if( approval >= 4.25 ) { return new Prediction("3", 1, 0); }
		if( approval < 4.25 ) { return new Prediction("2", 3, 0); }
	}
	if( budget >= 2.85 ) { 
		if( approval < 2.95 ) { return new Prediction("1", 1, 0); }
		if( approval >= 2.95 ) { return new Prediction("3", 10, 0); }
	}
	}
	}
	if( stability >= 4.35 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 7.2 ) { return new Prediction("1", 12, 0); }
		if( approval < 7.2 ) { return new Prediction("3", 9, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget >= 4.15 ) { 
		if( budget >= 7.55 ) { return new Prediction("3", 1, 0); }
		if( budget < 7.55 ) { return new Prediction("1", 13, 0); }
	}
	if( budget < 4.15 ) { 
		if( budget >= 3.45 ) { return new Prediction("2", 2, 0); }
	if( budget < 3.45 ) { 
		if( approval >= 4.45 ) { return new Prediction("2", 1, 0); }
		if( approval < 4.45 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( stability >= 7.5 ) { 
	if( stability < 9.3 ) { 
		if( budget >= 5.95 ) { return new Prediction("1", 1, 0); }
	if( budget < 5.95 ) { 
		if( approval < 2.7 ) { return new Prediction("1", 1, 0); }
		if( approval >= 2.7 ) { return new Prediction("2", 11, 0); }
	}
	}
	if( stability >= 9.3 ) { 
	if( budget >= 6.55 ) { 
	if( stability < 13.35 ) { 
	if( approval >= 12.7 ) { 
	if( approval < 29.8 ) { 
		if( budget >= 14.15 ) { return new Prediction("3", 2, 0); }
		if( budget < 14.15 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 29.8 ) { return new Prediction("3", 7, 0); }
	}
		if( approval < 12.7 ) { return new Prediction("2", 3, 0); }
	}
	if( stability >= 13.35 ) { 
	if( budget < 15.15 ) { 
	if( stability < 46.6 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 12.3 ) { return new Prediction("2", 2, 0); }
		if( approval >= 12.3 ) { return new Prediction("3", 3, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 9, 0); }
	}
		if( stability >= 46.6 ) { return new Prediction("1", 2, 0); }
	}
	if( budget >= 15.15 ) { 
	if( stability >= 15.65 ) { 
	if( approval < 49.5 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 49.5 ) { 
	if( budget >= 32.05 ) { 
	if( approval < 37.5 ) { 
	if( stability < 39.4 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 6, 0); }
	if( budget < 39.15 ) { 
		if( budget >= 37.75 ) { return new Prediction("2", 4, 1); }
		if( budget < 37.75 ) { return new Prediction("2", 3, 0); }
	}
	}
		if( stability >= 39.4 ) { return new Prediction("3", 10, 0); }
	}
	if( approval >= 37.5 ) { 
		if( budget < 43.95 ) { return new Prediction("1", 8, 0); }
	if( budget >= 43.95 ) { 
	if( approval >= 47.5 ) { 
	if( stability < 50.7 ) { 
		if( stability < 43.2 ) { return new Prediction("2", 1, 0); }
	if( stability >= 43.2 ) { 
	if( budget >= 48.85 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 48.5 ) { return new Prediction("2", 1, 0); }
	}
		if( budget < 48.85 ) { return new Prediction("1", 3, 0); }
	}
	}
		if( stability >= 50.7 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
	if( budget < 32.05 ) { 
		if( approval < 23.65 ) { return new Prediction("3", 3, 0); }
	if( approval >= 23.65 ) { 
		if( stability >= 31.65 ) { return new Prediction("3", 4, 0); }
		if( stability < 31.65 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
	if( budget >= 49.5 ) { 
	if( approval < 21.15 ) { 
		if( budget < 70.95 ) { return new Prediction("3", 2, 0); }
		if( budget >= 70.95 ) { return new Prediction("2", 3, 0); }
	}
		if( approval >= 21.15 ) { return new Prediction("2", 15, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 38.85 ) { 
	if( stability >= 32.95 ) { 
		if( approval < 35.5 ) { return new Prediction("1", 6, 0); }
		if( approval >= 35.5 ) { return new Prediction("2", 14, 0); }
	}
	if( stability < 32.95 ) { 
		if( approval < 21 ) { return new Prediction("1", 2, 0); }
	if( approval >= 21 ) { 
	if( approval < 30.7 ) { 
	if( approval < 28.5 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 3, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 28.5 ) { return new Prediction("2", 1, 0); }
	}
	if( approval >= 30.7 ) { 
		if( approval < 36 ) { return new Prediction("3", 6, 0); }
	if( approval >= 36 ) { 
		if( approval >= 41.9 ) { return new Prediction("3", 1, 0); }
		if( approval < 41.9 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
	if( budget >= 38.85 ) { 
		if( stability < 36.4 ) { return new Prediction("3", 9, 0); }
	if( stability >= 36.4 ) { 
	if( approval >= 45.7 ) { 
		if( budget < 47.1 ) { return new Prediction("2", 1, 0); }
	if( budget >= 47.1 ) { 
		if( approval >= 47.5 ) { return new Prediction("3", 3, 0); }
	if( approval < 47.5 ) { 
		if( stability >= 49 ) { return new Prediction("1", 2, 0); }
		if( stability < 49 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	if( approval < 45.7 ) { 
	if( approval >= 42 ) { 
		if( budget < 44.95 ) { return new Prediction("2", 1, 0); }
		if( budget >= 44.95 ) { return new Prediction("1", 3, 0); }
	}
	if( approval < 42 ) { 
		if( stability >= 39.85 ) { return new Prediction("1", 16, 0); }
	if( stability < 39.85 ) { 
		if( stability < 39.15 ) { return new Prediction("1", 7, 0); }
		if( stability >= 39.15 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( approval >= 49.5 ) { 
	if( stability < 61.8 ) { 
	if( budget >= 58.95 ) { 
	if( approval < 85.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 11, 0); }
	}
	if( approval >= 85.55 ) { 
		if( budget >= 85.1 ) { return new Prediction("1", 2, 0); }
		if( budget < 85.1 ) { return new Prediction("3", 9, 0); }
	}
	}
	if( budget < 58.95 ) { 
	if( budget < 44.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 6, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 80.15 ) { return new Prediction("2", 4, 0); }
		if( approval >= 80.15 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( budget >= 44.4 ) { 
		if( stability < 45.65 ) { return new Prediction("3", 6, 0); }
	if( stability >= 45.65 ) { 
	if( approval >= 51.5 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 11, 0); }
	if( approval >= 56.35 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 1, 0); }
	if( budget >= 52.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	if( approval < 51.5 ) { 
	if( stability < 48.85 ) { 
		if( approval < 50.5 ) { return new Prediction("1", 1, 0); }
		if( approval >= 50.5 ) { return new Prediction("2", 2, 0); }
	}
		if( stability >= 48.85 ) { return new Prediction("3", 10, 0); }
	}
	}
	}
	}
	}
	if( stability >= 61.8 ) { 
	if( approval < 74.5 ) { 
	if( stability < 69.2 ) { 
		if( approval < 69.75 ) { return new Prediction("2", 5, 0); }
		if( approval >= 69.75 ) { return new Prediction("1", 1, 0); }
	}
	if( stability >= 69.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 9, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 1, 0); }
	}
	}
	if( approval >= 74.5 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 82.15 ) { return new Prediction("1", 5, 0); }
		if( budget >= 82.15 ) { return new Prediction("2", 3, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 12, 0); }
	}
	}
	}
	}
	if( stability < 15.65 ) { 
		if( approval < 63.75 ) { return new Prediction("2", 3, 0); }
		if( approval >= 63.75 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
	}
		if( budget < 6.55 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	}
	if( stability >= 82.6 ) { 
	if( stability < 90.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 13, 0); }
	if( "positive".equals(type) ) { 
		if( approval >= 40.6 ) { return new Prediction("2", 3, 0); }
		if( approval < 40.6 ) { return new Prediction("1", 3, 0); }
	}
	}
		if( stability >= 90.7 ) { return new Prediction("3", 19, 0); }
	}
	}
	if( budget >= 89.85 ) { 
		if( approval < 29.3 ) { return new Prediction("1", 8, 0); }
		if( approval >= 29.3 ) { return new Prediction("2", 10, 0); }
	}
return null;
}
private Prediction runTree43() {
	if( approval >= 48.4 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 74.35 ) { 
		if( budget < 88.05 ) { return new Prediction("2", 8, 0); }
	if( budget >= 88.05 ) { 
		if( approval >= 81.25 ) { return new Prediction("1", 4, 0); }
		if( approval < 81.25 ) { return new Prediction("2", 5, 0); }
	}
	}
	if( budget < 74.35 ) { 
	if( stability < 56.65 ) { 
	if( budget < 53.5 ) { 
		if( stability < 51.2 ) { return new Prediction("1", 11, 0); }
	if( stability >= 51.2 ) { 
		if( approval < 54.2 ) { return new Prediction("3", 1, 0); }
		if( approval >= 54.2 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( budget >= 53.5 ) { 
		if( approval < 55.7 ) { return new Prediction("2", 3, 0); }
		if( approval >= 55.7 ) { return new Prediction("1", 4, 0); }
	}
	}
	if( stability >= 56.65 ) { 
	if( approval < 87.5 ) { 
	if( approval >= 65.7 ) { 
		if( stability < 66.8 ) { return new Prediction("1", 2, 0); }
	if( stability >= 66.8 ) { 
		if( approval < 81.9 ) { return new Prediction("3", 11, 0); }
	if( approval >= 81.9 ) { 
		if( approval < 84.15 ) { return new Prediction("1", 1, 0); }
		if( approval >= 84.15 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( approval < 65.7 ) { 
		if( stability >= 66.85 ) { return new Prediction("3", 13, 0); }
	if( stability < 66.85 ) { 
		if( budget < 63.2 ) { return new Prediction("3", 7, 0); }
		if( budget >= 63.2 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
		if( approval >= 87.5 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 36.55 ) { 
	if( stability >= 73.35 ) { 
		if( approval < 78.2 ) { return new Prediction("1", 3, 0); }
		if( approval >= 78.2 ) { return new Prediction("2", 1, 0); }
	}
	if( stability < 73.35 ) { 
	if( budget < 62 ) { 
		if( budget >= 57.85 ) { return new Prediction("2", 2, 0); }
	if( budget < 57.85 ) { 
	if( stability < 53.9 ) { 
	if( approval < 49.5 ) { 
		if( budget < 41.85 ) { return new Prediction("2", 2, 0); }
		if( budget >= 41.85 ) { return new Prediction("3", 1, 0); }
	}
	if( approval >= 49.5 ) { 
	if( stability >= 51.4 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 1, 0); }
		if( budget >= 52.75 ) { return new Prediction("3", 3, 0); }
	}
		if( stability < 51.4 ) { return new Prediction("3", 15, 0); }
	}
	}
	if( stability >= 53.9 ) { 
		if( approval >= 72.5 ) { return new Prediction("2", 1, 0); }
		if( approval < 72.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( budget >= 62 ) { return new Prediction("3", 23, 0); }
	}
	}
	if( budget < 36.55 ) { 
		if( approval >= 55.3 ) { return new Prediction("2", 14, 0); }
		if( approval < 55.3 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( approval < 48.4 ) { 
	if( approval >= 37.05 ) { 
	if( budget >= 27 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 43.75 ) { 
		if( budget >= 43.9 ) { return new Prediction("2", 14, 0); }
		if( budget < 43.9 ) { return new Prediction("1", 7, 0); }
	}
	if( stability >= 43.75 ) { 
	if( budget >= 50.5 ) { 
		if( stability < 80.9 ) { return new Prediction("2", 10, 0); }
		if( stability >= 80.9 ) { return new Prediction("3", 1, 0); }
	}
	if( budget < 50.5 ) { 
		if( stability < 48.5 ) { return new Prediction("2", 2, 0); }
		if( stability >= 48.5 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 45.55 ) { 
	if( stability >= 39.75 ) { 
	if( budget >= 41.9 ) { 
		if( approval < 44 ) { return new Prediction("1", 1, 0); }
		if( approval >= 44 ) { return new Prediction("2", 2, 0); }
	}
		if( budget < 41.9 ) { return new Prediction("2", 13, 0); }
	}
	if( stability < 39.75 ) { 
		if( approval >= 39 ) { return new Prediction("3", 5, 0); }
		if( approval < 39 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( budget >= 45.55 ) { 
	if( approval >= 44.3 ) { 
	if( approval >= 46.3 ) { 
		if( stability < 49.75 ) { return new Prediction("3", 7, 0); }
		if( stability >= 49.75 ) { return new Prediction("1", 6, 0); }
	}
		if( approval < 46.3 ) { return new Prediction("3", 2, 0); }
	}
	if( approval < 44.3 ) { 
		if( stability >= 41.15 ) { return new Prediction("1", 7, 0); }
	if( stability < 41.15 ) { 
		if( approval >= 39.5 ) { return new Prediction("3", 1, 0); }
		if( approval < 39.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
		if( budget < 27 ) { return new Prediction("2", 13, 0); }
	}
	if( approval < 37.05 ) { 
	if( budget >= 65.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 9, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 18, 0); }
	}
	if( budget < 65.5 ) { 
	if( approval >= 4.45 ) { 
		if( stability < 1.25 ) { return new Prediction("1", 7, 0); }
	if( stability >= 1.25 ) { 
	if( stability >= 4.15 ) { 
	if( stability < 6.95 ) { 
	if( budget >= 5.45 ) { 
		if( approval >= 8.1 ) { return new Prediction("1", 3, 0); }
	if( approval < 8.1 ) { 
		if( approval < 4.9 ) { return new Prediction("1", 2, 0); }
		if( approval >= 4.9 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( budget < 5.45 ) { 
		if( budget >= 5.3 ) { return new Prediction("2", 1, 0); }
	if( budget < 5.3 ) { 
		if( stability < 6.75 ) { return new Prediction("1", 8, 0); }
	if( stability >= 6.75 ) { 
		if( approval < 8.55 ) { return new Prediction("1", 2, 0); }
		if( approval >= 8.55 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	if( stability >= 6.95 ) { 
	if( budget < 26.3 ) { 
	if( stability >= 26.75 ) { 
		if( approval >= 26.1 ) { return new Prediction("2", 1, 0); }
		if( approval < 26.1 ) { return new Prediction("3", 4, 0); }
	}
	if( stability < 26.75 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 7.85 ) { return new Prediction("3", 5, 0); }
	if( approval >= 7.85 ) { 
	if( stability >= 16.95 ) { 
		if( approval >= 15 ) { return new Prediction("1", 2, 0); }
		if( approval < 15 ) { return new Prediction("3", 1, 0); }
	}
	if( stability < 16.95 ) { 
		if( approval < 11.7 ) { return new Prediction("1", 2, 0); }
		if( approval >= 11.7 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 16.5 ) { 
		if( stability < 19.2 ) { return new Prediction("3", 2, 0); }
	if( stability >= 19.2 ) { 
		if( approval >= 17 ) { return new Prediction("2", 3, 0); }
		if( approval < 17 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( budget < 16.5 ) { return new Prediction("2", 14, 0); }
	}
	}
	}
	if( budget >= 26.3 ) { 
	if( budget >= 29.7 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 37.15 ) { return new Prediction("3", 14, 0); }
	if( stability < 37.15 ) { 
	if( approval >= 36.5 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 3, 0); }
		if( budget < 39.15 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 36.5 ) { return new Prediction("2", 8, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 36.9 ) { 
		if( stability >= 72.85 ) { return new Prediction("2", 2, 0); }
		if( stability < 72.85 ) { return new Prediction("1", 9, 0); }
	}
	if( stability < 36.9 ) { 
	if( approval < 32.5 ) { 
		if( stability >= 28.55 ) { return new Prediction("1", 2, 0); }
		if( stability < 28.55 ) { return new Prediction("3", 3, 0); }
	}
		if( approval >= 32.5 ) { return new Prediction("3", 15, 0); }
	}
	}
	}
	if( budget < 29.7 ) { 
		if( approval < 26.75 ) { return new Prediction("1", 8, 0); }
	if( approval >= 26.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	if( stability < 4.15 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 7.2 ) { return new Prediction("1", 2, 0); }
		if( approval < 7.2 ) { return new Prediction("2", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 17, 0); }
	}
	}
	}
	if( approval < 4.45 ) { 
	if( approval < 2.75 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 5.4 ) { return new Prediction("3", 2, 0); }
		if( budget >= 5.4 ) { return new Prediction("2", 4, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 8, 0); }
	}
	if( approval >= 2.75 ) { 
		if( budget < 3.3 ) { return new Prediction("2", 9, 0); }
	if( budget >= 3.3 ) { 
	if( approval >= 3.4 ) { 
		if( approval < 4.3 ) { return new Prediction("2", 7, 0); }
		if( approval >= 4.3 ) { return new Prediction("3", 2, 0); }
	}
		if( approval < 3.4 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree44() {
	if( stability >= 84.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 31, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 31.7 ) { return new Prediction("1", 2, 0); }
		if( approval >= 31.7 ) { return new Prediction("2", 7, 0); }
	}
	}
	if( stability < 84.45 ) { 
	if( stability < 82.2 ) { 
	if( approval >= 83.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 23, 0); }
	if( "positive".equals(type) ) { 
		if( budget < 66.3 ) { return new Prediction("2", 4, 0); }
		if( budget >= 66.3 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( approval < 83.75 ) { 
		if( approval < 2 ) { return new Prediction("1", 6, 0); }
	if( approval >= 2 ) { 
	if( stability >= 28.5 ) { 
	if( stability >= 35.75 ) { 
	if( approval >= 26.5 ) { 
	if( budget < 38.85 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 42 ) { 
		if( budget >= 24.75 ) { return new Prediction("1", 4, 0); }
	if( budget < 24.75 ) { 
		if( approval < 57.45 ) { return new Prediction("3", 3, 0); }
	if( approval >= 57.45 ) { 
		if( approval >= 68.6 ) { return new Prediction("3", 1, 0); }
		if( approval < 68.6 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( approval < 42 ) { 
		if( approval < 35.7 ) { return new Prediction("3", 9, 0); }
	if( approval >= 35.7 ) { 
		if( stability >= 37.15 ) { return new Prediction("3", 3, 0); }
		if( stability < 37.15 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
		if( "positive".equals(type) ) { return new Prediction("2", 23, 0); }
	}
	if( budget >= 38.85 ) { 
	if( stability < 69.8 ) { 
	if( budget < 52.9 ) { 
	if( approval < 41.5 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 42.95 ) { return new Prediction("2", 1, 0); }
		if( budget < 42.95 ) { return new Prediction("3", 2, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 43.95 ) { 
		if( stability < 36.4 ) { return new Prediction("3", 1, 0); }
	if( stability >= 36.4 ) { 
	if( budget >= 41.9 ) { 
		if( stability < 41.85 ) { return new Prediction("3", 1, 0); }
		if( stability >= 41.85 ) { return new Prediction("1", 2, 0); }
	}
		if( budget < 41.9 ) { return new Prediction("1", 6, 0); }
	}
	}
		if( budget >= 43.95 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( approval >= 41.5 ) { 
	if( approval >= 48.5 ) { 
	if( approval < 56 ) { 
	if( stability < 54.2 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 48 ) { 
		if( approval >= 51 ) { return new Prediction("1", 3, 0); }
		if( approval < 51 ) { return new Prediction("3", 1, 0); }
	}
		if( stability < 48 ) { return new Prediction("1", 14, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 3, 0); }
	}
		if( stability >= 54.2 ) { return new Prediction("3", 3, 0); }
	}
	if( approval >= 56 ) { 
		if( budget < 49.5 ) { return new Prediction("2", 4, 0); }
		if( budget >= 49.5 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( approval < 48.5 ) { 
	if( budget < 46.95 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 9, 0); }
	}
	if( budget >= 46.95 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 50.7 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 9, 0); }
	if( budget < 48.85 ) { 
		if( approval >= 47.5 ) { return new Prediction("1", 2, 0); }
		if( approval < 47.5 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( stability >= 50.7 ) { return new Prediction("3", 2, 0); }
	}
	if( "positive".equals(type) ) { 
	if( approval >= 45.7 ) { 
		if( stability < 49.75 ) { return new Prediction("3", 9, 0); }
		if( stability >= 49.75 ) { return new Prediction("1", 3, 0); }
	}
		if( approval < 45.7 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
	}
	}
	if( budget >= 52.9 ) { 
		if( approval < 32.7 ) { return new Prediction("1", 4, 0); }
	if( approval >= 32.7 ) { 
	if( budget >= 71.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 9, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 48.9 ) { return new Prediction("1", 1, 0); }
		if( approval >= 48.9 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( budget < 71.4 ) { 
	if( stability < 54 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 16, 0); }
	}
	if( stability >= 54 ) { 
	if( stability < 66.1 ) { 
	if( budget >= 57.5 ) { 
	if( approval >= 54.7 ) { 
		if( approval < 75.05 ) { return new Prediction("1", 2, 0); }
		if( approval >= 75.05 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 54.7 ) { return new Prediction("2", 1, 0); }
	}
	if( budget < 57.5 ) { 
		if( stability < 56.85 ) { return new Prediction("1", 2, 0); }
		if( stability >= 56.85 ) { return new Prediction("3", 3, 0); }
	}
	}
		if( stability >= 66.1 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	}
	}
	if( stability >= 69.8 ) { 
	if( stability >= 75.1 ) { 
		if( approval < 68.9 ) { return new Prediction("1", 4, 0); }
	if( approval >= 68.9 ) { 
		if( approval >= 82.9 ) { return new Prediction("1", 1, 0); }
		if( approval < 82.9 ) { return new Prediction("2", 4, 0); }
	}
	}
		if( stability < 75.1 ) { return new Prediction("2", 7, 0); }
	}
	}
	}
	if( approval < 26.5 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 53.2 ) { return new Prediction("2", 2, 0); }
		if( budget < 53.2 ) { return new Prediction("3", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 12, 0); }
	}
	}
	if( stability < 35.75 ) { 
	if( approval < 39.05 ) { 
	if( budget >= 32.95 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 37.5 ) { return new Prediction("2", 4, 0); }
		if( approval >= 37.5 ) { return new Prediction("1", 3, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 32.5 ) { return new Prediction("1", 3, 0); }
		if( approval >= 32.5 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( budget < 32.95 ) { 
		if( approval < 23.65 ) { return new Prediction("3", 2, 0); }
		if( approval >= 23.65 ) { return new Prediction("2", 11, 0); }
	}
	}
		if( approval >= 39.05 ) { return new Prediction("2", 12, 0); }
	}
	}
	if( stability < 28.5 ) { 
	if( approval < 31.7 ) { 
	if( approval < 6.9 ) { 
	if( approval < 6.55 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 3.5 ) { 
		if( stability < 4.9 ) { return new Prediction("2", 5, 0); }
		if( stability >= 4.9 ) { return new Prediction("3", 4, 0); }
	}
		if( budget < 3.5 ) { return new Prediction("3", 6, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 2.8 ) { 
	if( approval < 5.15 ) { 
		if( budget >= 2.9 ) { return new Prediction("1", 5, 0); }
		if( budget < 2.9 ) { return new Prediction("2", 3, 0); }
	}
		if( approval >= 5.15 ) { return new Prediction("2", 4, 0); }
	}
	if( stability < 2.8 ) { 
		if( approval >= 3.95 ) { return new Prediction("3", 7, 0); }
		if( approval < 3.95 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
		if( approval >= 6.55 ) { return new Prediction("2", 6, 0); }
	}
	if( approval >= 6.9 ) { 
	if( budget < 29.9 ) { 
	if( budget >= 3.75 ) { 
	if( approval >= 8.2 ) { 
	if( approval >= 9.25 ) { 
	if( stability >= 16.95 ) { 
	if( stability >= 22.75 ) { 
		if( approval >= 29.5 ) { return new Prediction("1", 2, 0); }
		if( approval < 29.5 ) { return new Prediction("3", 5, 0); }
	}
	if( stability < 22.75 ) { 
	if( approval >= 18.05 ) { 
		if( budget >= 23.4 ) { return new Prediction("1", 1, 0); }
		if( budget < 23.4 ) { return new Prediction("2", 2, 0); }
	}
		if( approval < 18.05 ) { return new Prediction("1", 6, 0); }
	}
	}
	if( stability < 16.95 ) { 
	if( stability >= 6.35 ) { 
		if( approval < 12.3 ) { return new Prediction("2", 5, 0); }
		if( approval >= 12.3 ) { return new Prediction("3", 2, 0); }
	}
		if( stability < 6.35 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( approval < 9.25 ) { 
		if( budget >= 9.4 ) { return new Prediction("2", 1, 0); }
	if( budget < 9.4 ) { 
		if( stability >= 3.75 ) { return new Prediction("1", 10, 0); }
		if( stability < 3.75 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( approval < 8.2 ) { 
		if( stability >= 4.15 ) { return new Prediction("2", 4, 0); }
		if( stability < 4.15 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( budget < 3.75 ) { 
		if( stability >= 9.35 ) { return new Prediction("3", 1, 0); }
		if( stability < 9.35 ) { return new Prediction("1", 11, 0); }
	}
	}
		if( budget >= 29.9 ) { return new Prediction("2", 5, 0); }
	}
	}
	if( approval >= 31.7 ) { 
	if( budget >= 21.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 23, 0); }
	}
	if( budget < 21.7 ) { 
		if( budget < 18.5 ) { return new Prediction("2", 1, 0); }
		if( budget >= 18.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	}
		if( stability >= 82.2 ) { return new Prediction("2", 6, 0); }
	}
return null;
}
private Prediction runTree45() {
	if( approval < 30.2 ) { 
	if( approval < 7.4 ) { 
		if( approval < 2 ) { return new Prediction("1", 6, 0); }
	if( approval >= 2 ) { 
		if( budget >= 8.85 ) { return new Prediction("2", 9, 0); }
	if( budget < 8.85 ) { 
	if( approval < 3 ) { 
		if( budget >= 2.45 ) { return new Prediction("1", 3, 0); }
	if( budget < 2.45 ) { 
		if( approval >= 2.65 ) { return new Prediction("1", 1, 0); }
		if( approval < 2.65 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( approval >= 3 ) { 
	if( budget >= 2.95 ) { 
	if( approval < 5.5 ) { 
	if( approval < 4.2 ) { 
		if( budget >= 5.25 ) { return new Prediction("3", 1, 0); }
		if( budget < 5.25 ) { return new Prediction("2", 2, 0); }
	}
	if( approval >= 4.2 ) { 
		if( stability < 3.65 ) { return new Prediction("3", 4, 0); }
	if( stability >= 3.65 ) { 
		if( approval < 4.9 ) { return new Prediction("1", 2, 0); }
	if( approval >= 4.9 ) { 
		if( stability < 6.95 ) { return new Prediction("3", 2, 0); }
		if( stability >= 6.95 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( approval >= 5.5 ) { 
	if( stability < 3.85 ) { 
		if( stability >= 2.2 ) { return new Prediction("3", 5, 0); }
		if( stability < 2.2 ) { return new Prediction("2", 1, 0); }
	}
	if( stability >= 3.85 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 6.9 ) { return new Prediction("3", 1, 0); }
		if( approval >= 6.9 ) { return new Prediction("2", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 6, 0); }
	}
	}
	}
	if( budget < 2.95 ) { 
		if( approval >= 6.95 ) { return new Prediction("3", 2, 0); }
		if( approval < 6.95 ) { return new Prediction("2", 13, 0); }
	}
	}
	}
	}
	}
	if( approval >= 7.4 ) { 
		if( budget < 3.55 ) { return new Prediction("1", 17, 0); }
	if( budget >= 3.55 ) { 
	if( budget >= 65.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 16, 0); }
	}
	if( budget < 65.5 ) { 
	if( stability >= 26.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 16, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 9, 0); }
	}
	if( stability < 26.75 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 9.4 ) { 
	if( approval >= 15 ) { 
		if( budget < 34.6 ) { return new Prediction("1", 6, 0); }
		if( budget >= 34.6 ) { return new Prediction("2", 2, 0); }
	}
		if( approval < 15 ) { return new Prediction("2", 6, 0); }
	}
	if( budget < 9.4 ) { 
		if( stability >= 9.05 ) { return new Prediction("3", 3, 0); }
		if( stability < 9.05 ) { return new Prediction("1", 12, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 7.9 ) { 
	if( stability >= 19.4 ) { 
		if( approval < 21 ) { return new Prediction("1", 2, 0); }
	if( approval >= 21 ) { 
		if( approval >= 28.05 ) { return new Prediction("3", 1, 0); }
		if( approval < 28.05 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( stability < 19.4 ) { 
		if( budget >= 16.4 ) { return new Prediction("3", 4, 0); }
		if( budget < 16.4 ) { return new Prediction("2", 4, 0); }
	}
	}
		if( stability < 7.9 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	}
	}
	}
	if( approval >= 30.2 ) { 
	if( approval < 90.9 ) { 
	if( stability >= 37.95 ) { 
		if( budget >= 92.65 ) { return new Prediction("2", 10, 0); }
	if( budget < 92.65 ) { 
	if( budget < 52.3 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 48.75 ) { 
	if( budget >= 46 ) { 
	if( budget < 50.45 ) { 
	if( budget >= 48.85 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 3, 0); }
		if( approval < 48.5 ) { return new Prediction("2", 4, 0); }
	}
		if( budget < 48.85 ) { return new Prediction("2", 2, 0); }
	}
	if( budget >= 50.45 ) { 
	if( budget >= 50.95 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 3, 0); }
		if( approval < 51.5 ) { return new Prediction("2", 1, 0); }
	}
		if( budget < 50.95 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( budget < 46 ) { 
		if( approval >= 42.5 ) { return new Prediction("1", 8, 0); }
		if( approval < 42.5 ) { return new Prediction("3", 5, 0); }
	}
	}
	if( stability >= 48.75 ) { 
		if( approval < 51.85 ) { return new Prediction("3", 17, 0); }
	if( approval >= 51.85 ) { 
	if( stability >= 72.9 ) { 
		if( approval < 77.3 ) { return new Prediction("3", 5, 0); }
		if( approval >= 77.3 ) { return new Prediction("1", 3, 0); }
	}
		if( stability < 72.9 ) { return new Prediction("1", 7, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 40.2 ) { 
	if( approval < 35.5 ) { 
		if( approval >= 33.95 ) { return new Prediction("1", 1, 0); }
		if( approval < 33.95 ) { return new Prediction("2", 3, 0); }
	}
		if( approval >= 35.5 ) { return new Prediction("2", 18, 0); }
	}
	if( budget >= 40.2 ) { 
	if( approval >= 47.5 ) { 
	if( approval < 65.2 ) { 
		if( budget < 45.55 ) { return new Prediction("2", 3, 0); }
		if( budget >= 45.55 ) { return new Prediction("3", 7, 0); }
	}
		if( approval >= 65.2 ) { return new Prediction("2", 2, 0); }
	}
	if( approval < 47.5 ) { 
		if( approval < 38.5 ) { return new Prediction("1", 9, 0); }
	if( approval >= 38.5 ) { 
		if( stability < 44.25 ) { return new Prediction("3", 6, 0); }
	if( stability >= 44.25 ) { 
		if( approval < 41.5 ) { return new Prediction("1", 2, 0); }
	if( approval >= 41.5 ) { 
		if( budget < 44.95 ) { return new Prediction("2", 3, 0); }
		if( budget >= 44.95 ) { return new Prediction("1", 7, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( budget >= 52.3 ) { 
	if( approval < 48.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 10, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 3, 0); }
	}
	if( approval >= 48.15 ) { 
	if( approval < 87.85 ) { 
	if( stability >= 52.2 ) { 
	if( approval >= 50.2 ) { 
	if( budget >= 57.25 ) { 
	if( budget >= 60.25 ) { 
		if( approval < 57.45 ) { return new Prediction("2", 3, 0); }
	if( approval >= 57.45 ) { 
	if( stability >= 64.95 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 10, 0); }
	if( "positive".equals(type) ) { 
		if( budget >= 78.3 ) { return new Prediction("3", 1, 0); }
		if( budget < 78.3 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( stability < 64.95 ) { 
	if( approval >= 74.05 ) { 
		if( approval < 83.2 ) { return new Prediction("3", 3, 0); }
		if( approval >= 83.2 ) { return new Prediction("2", 1, 0); }
	}
	if( approval < 74.05 ) { 
		if( approval >= 71.2 ) { return new Prediction("1", 1, 0); }
		if( approval < 71.2 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	if( budget < 60.25 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 5, 0); }
	}
	}
	if( budget < 57.25 ) { 
		if( stability < 57 ) { return new Prediction("1", 4, 0); }
		if( stability >= 57 ) { return new Prediction("3", 8, 0); }
	}
	}
		if( approval < 50.2 ) { return new Prediction("1", 3, 0); }
	}
	if( stability < 52.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 18, 0); }
	}
	}
		if( approval >= 87.85 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
	if( stability < 37.95 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 29.8 ) { return new Prediction("1", 2, 0); }
	if( budget >= 29.8 ) { 
		if( stability >= 37.6 ) { return new Prediction("3", 1, 0); }
		if( stability < 37.6 ) { return new Prediction("2", 18, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 32 ) { 
		if( stability >= 20.5 ) { return new Prediction("2", 9, 0); }
		if( stability < 20.5 ) { return new Prediction("3", 8, 0); }
	}
		if( budget >= 32 ) { return new Prediction("3", 25, 0); }
	}
	}
	}
	if( approval >= 90.9 ) { 
	if( budget >= 77.55 ) { 
		if( approval < 96.05 ) { return new Prediction("3", 5, 0); }
		if( approval >= 96.05 ) { return new Prediction("1", 1, 0); }
	}
	if( budget < 77.55 ) { 
		if( stability >= 28 ) { return new Prediction("1", 9, 0); }
	if( stability < 28 ) { 
		if( approval >= 96.2 ) { return new Prediction("3", 1, 0); }
		if( approval < 96.2 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree46() {
	if( stability < 90.7 ) { 
	if( approval >= 4.45 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 69.7 ) { 
	if( stability < 49.4 ) { 
	if( approval < 45 ) { 
	if( budget >= 37.75 ) { 
	if( stability >= 35.7 ) { 
		if( approval < 37.5 ) { return new Prediction("3", 3, 0); }
		if( approval >= 37.5 ) { return new Prediction("2", 3, 0); }
	}
		if( stability < 35.7 ) { return new Prediction("2", 10, 0); }
	}
	if( budget < 37.75 ) { 
	if( budget < 7.35 ) { 
		if( stability < 6.95 ) { return new Prediction("1", 19, 0); }
	if( stability >= 6.95 ) { 
		if( approval < 8.55 ) { return new Prediction("3", 4, 0); }
		if( approval >= 8.55 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( budget >= 7.35 ) { 
	if( stability < 13.8 ) { 
		if( budget >= 9.4 ) { return new Prediction("2", 5, 0); }
	if( budget < 9.4 ) { 
		if( approval >= 8.1 ) { return new Prediction("1", 1, 0); }
		if( approval < 8.1 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( stability >= 13.8 ) { 
	if( approval < 23.65 ) { 
		if( stability >= 21.85 ) { return new Prediction("3", 7, 0); }
	if( stability < 21.85 ) { 
		if( approval >= 15 ) { return new Prediction("1", 2, 0); }
		if( approval < 15 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( approval >= 23.65 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 9, 0); }
	if( budget >= 29.9 ) { 
		if( approval < 37 ) { return new Prediction("2", 3, 0); }
	if( approval >= 37 ) { 
	if( budget >= 36.75 ) { 
		if( stability >= 36.05 ) { return new Prediction("3", 1, 0); }
		if( stability < 36.05 ) { return new Prediction("1", 1, 0); }
	}
		if( budget < 36.75 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( approval >= 45 ) { 
		if( budget < 47.3 ) { return new Prediction("1", 22, 0); }
	if( budget >= 47.3 ) { 
	if( approval < 70.8 ) { 
		if( budget >= 52.25 ) { return new Prediction("2", 5, 0); }
	if( budget < 52.25 ) { 
		if( stability < 42.75 ) { return new Prediction("2", 2, 0); }
	if( stability >= 42.75 ) { 
		if( stability < 46.75 ) { return new Prediction("1", 5, 0); }
	if( stability >= 46.75 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 1, 0); }
	if( budget < 48.85 ) { 
		if( approval >= 47.5 ) { return new Prediction("1", 2, 0); }
		if( approval < 47.5 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
		if( approval >= 70.8 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	if( stability >= 49.4 ) { 
	if( approval >= 51.95 ) { 
		if( stability < 57.8 ) { return new Prediction("1", 12, 0); }
	if( stability >= 57.8 ) { 
		if( stability < 58.95 ) { return new Prediction("3", 5, 0); }
	if( stability >= 58.95 ) { 
		if( approval >= 71.85 ) { return new Prediction("1", 6, 0); }
	if( approval < 71.85 ) { 
		if( stability >= 68.65 ) { return new Prediction("3", 6, 0); }
		if( stability < 68.65 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( approval < 51.95 ) { 
		if( budget >= 66.15 ) { return new Prediction("2", 1, 0); }
		if( budget < 66.15 ) { return new Prediction("3", 14, 0); }
	}
	}
	}
	if( budget >= 69.7 ) { 
		if( stability < 84.55 ) { return new Prediction("2", 37, 0); }
		if( stability >= 84.55 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 45.8 ) { 
	if( stability >= 32.95 ) { 
	if( approval < 40.05 ) { 
	if( budget < 36.8 ) { 
		if( approval < 29.2 ) { return new Prediction("1", 6, 0); }
	if( approval >= 29.2 ) { 
		if( budget < 34.2 ) { return new Prediction("2", 13, 0); }
	if( budget >= 34.2 ) { 
		if( stability < 39 ) { return new Prediction("3", 1, 0); }
		if( stability >= 39 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( budget >= 36.8 ) { 
	if( budget >= 41.9 ) { 
		if( stability < 41.85 ) { return new Prediction("3", 1, 0); }
		if( stability >= 41.85 ) { return new Prediction("1", 3, 0); }
	}
		if( budget < 41.9 ) { return new Prediction("1", 6, 0); }
	}
	}
		if( approval >= 40.05 ) { return new Prediction("2", 37, 0); }
	}
	if( stability < 32.95 ) { 
	if( stability >= 4.7 ) { 
	if( budget >= 24.15 ) { 
		if( approval >= 28.05 ) { return new Prediction("3", 14, 0); }
	if( approval < 28.05 ) { 
		if( approval < 23 ) { return new Prediction("1", 1, 0); }
	if( approval >= 23 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 1, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( budget < 24.15 ) { 
	if( approval >= 6.15 ) { 
	if( approval >= 30.95 ) { 
		if( stability >= 24.95 ) { return new Prediction("2", 2, 0); }
	if( stability < 24.95 ) { 
		if( budget < 18 ) { return new Prediction("2", 1, 0); }
		if( budget >= 18 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( approval < 30.95 ) { 
	if( budget >= 16.4 ) { 
		if( approval < 21 ) { return new Prediction("3", 1, 0); }
		if( approval >= 21 ) { return new Prediction("2", 6, 0); }
	}
		if( budget < 16.4 ) { return new Prediction("2", 15, 0); }
	}
	}
	if( approval < 6.15 ) { 
	if( approval >= 5.55 ) { 
		if( budget >= 11.15 ) { return new Prediction("1", 1, 0); }
		if( budget < 11.15 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 5.55 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
		if( stability < 4.7 ) { return new Prediction("3", 14, 0); }
	}
	}
	if( budget >= 45.8 ) { 
	if( approval >= 47.5 ) { 
		if( approval >= 79.75 ) { return new Prediction("3", 19, 0); }
	if( approval < 79.75 ) { 
	if( stability >= 60.55 ) { 
		if( approval < 72.1 ) { return new Prediction("1", 3, 0); }
		if( approval >= 72.1 ) { return new Prediction("2", 2, 0); }
	}
	if( stability < 60.55 ) { 
	if( stability >= 51 ) { 
		if( budget >= 69.2 ) { return new Prediction("3", 2, 0); }
	if( budget < 69.2 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 1, 0); }
	if( budget >= 52.75 ) { 
		if( approval < 67.1 ) { return new Prediction("3", 1, 0); }
		if( approval >= 67.1 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
		if( stability < 51 ) { return new Prediction("3", 20, 0); }
	}
	}
	}
	if( approval < 47.5 ) { 
	if( stability < 46.75 ) { 
		if( approval >= 44.3 ) { return new Prediction("3", 7, 0); }
	if( approval < 44.3 ) { 
	if( stability >= 25.5 ) { 
	if( approval >= 39.5 ) { 
		if( stability < 43.15 ) { return new Prediction("3", 1, 0); }
		if( stability >= 43.15 ) { return new Prediction("1", 3, 0); }
	}
		if( approval < 39.5 ) { return new Prediction("1", 9, 0); }
	}
		if( stability < 25.5 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( stability >= 46.75 ) { return new Prediction("1", 24, 0); }
	}
	}
	}
	}
	if( approval < 4.45 ) { 
		if( approval >= 2.9 ) { return new Prediction("2", 20, 0); }
	if( approval < 2.9 ) { 
		if( budget >= 8.1 ) { return new Prediction("2", 1, 0); }
	if( budget < 8.1 ) { 
		if( stability >= 8.2 ) { return new Prediction("3", 1, 0); }
		if( stability < 8.2 ) { return new Prediction("1", 9, 0); }
	}
	}
	}
	}
		if( stability >= 90.7 ) { return new Prediction("3", 10, 0); }
return null;
}
private Prediction runTree47() {
	if( stability < 82.75 ) { 
	if( approval < 83.2 ) { 
	if( budget < 74.8 ) { 
	if( approval >= 73.05 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 1, 0); }
	if( "positive".equals(type) ) { 
	if( stability < 54.6 ) { 
		if( budget < 30.8 ) { return new Prediction("2", 4, 0); }
		if( budget >= 30.8 ) { return new Prediction("3", 5, 0); }
	}
		if( stability >= 54.6 ) { return new Prediction("2", 9, 0); }
	}
	}
	if( approval < 73.05 ) { 
	if( budget < 68.55 ) { 
	if( budget < 2.55 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 5.4 ) { 
		if( budget >= 1.6 ) { return new Prediction("3", 3, 0); }
		if( budget < 1.6 ) { return new Prediction("1", 1, 0); }
	}
		if( approval >= 5.4 ) { return new Prediction("1", 11, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval >= 2.65 ) { return new Prediction("2", 4, 0); }
		if( approval < 2.65 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( budget >= 2.55 ) { 
	if( budget >= 33.55 ) { 
	if( budget >= 35.55 ) { 
	if( stability >= 33.75 ) { 
	if( stability >= 47.85 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 52.45 ) { return new Prediction("3", 10, 0); }
	if( approval >= 52.45 ) { 
		if( stability < 57 ) { return new Prediction("1", 3, 0); }
	if( stability >= 57 ) { 
		if( approval < 69 ) { return new Prediction("3", 6, 0); }
		if( approval >= 69 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 49 ) { 
	if( stability < 53.9 ) { 
		if( budget >= 51.9 ) { return new Prediction("3", 7, 0); }
		if( budget < 51.9 ) { return new Prediction("2", 2, 0); }
	}
	if( stability >= 53.9 ) { 
		if( approval >= 63.3 ) { return new Prediction("2", 1, 0); }
		if( approval < 63.3 ) { return new Prediction("1", 5, 0); }
	}
	}
		if( approval < 49 ) { return new Prediction("1", 9, 0); }
	}
	}
	if( stability < 47.85 ) { 
	if( approval >= 48.5 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 53 ) { 
		if( budget < 57.1 ) { return new Prediction("1", 2, 0); }
		if( budget >= 57.1 ) { return new Prediction("2", 2, 0); }
	}
		if( approval < 53 ) { return new Prediction("1", 16, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability < 38.1 ) { return new Prediction("3", 2, 0); }
	if( stability >= 38.1 ) { 
		if( approval >= 51.5 ) { return new Prediction("3", 1, 0); }
		if( approval < 51.5 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( approval < 48.5 ) { 
	if( approval >= 40.5 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 43.25 ) { return new Prediction("1", 2, 0); }
		if( budget >= 43.25 ) { return new Prediction("2", 11, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 44.95 ) { 
		if( budget < 40.75 ) { return new Prediction("2", 3, 0); }
	if( budget >= 40.75 ) { 
		if( stability >= 42 ) { return new Prediction("2", 1, 0); }
		if( stability < 42 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( budget >= 44.95 ) { 
	if( approval < 45 ) { 
		if( approval >= 42 ) { return new Prediction("1", 2, 0); }
		if( approval < 42 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 45 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	if( approval < 40.5 ) { 
	if( stability >= 41.3 ) { 
	if( approval < 38.5 ) { 
		if( budget < 36.8 ) { return new Prediction("2", 1, 0); }
		if( budget >= 36.8 ) { return new Prediction("3", 9, 0); }
	}
		if( approval >= 38.5 ) { return new Prediction("1", 1, 0); }
	}
	if( stability < 41.3 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 36.75 ) { return new Prediction("2", 3, 0); }
		if( budget < 36.75 ) { return new Prediction("1", 2, 0); }
	}
	if( "positive".equals(type) ) { 
	if( approval < 38.5 ) { 
	if( budget < 38.2 ) { 
		if( approval >= 33 ) { return new Prediction("3", 1, 0); }
		if( approval < 33 ) { return new Prediction("1", 2, 0); }
	}
		if( budget >= 38.2 ) { return new Prediction("1", 7, 0); }
	}
		if( approval >= 38.5 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( stability < 33.75 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 39.8 ) { return new Prediction("2", 8, 0); }
		if( budget < 39.8 ) { return new Prediction("1", 2, 1); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 19, 0); }
	}
	}
		if( budget < 35.55 ) { return new Prediction("3", 5, 0); }
	}
	if( budget < 33.55 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 7.4 ) { 
		if( budget >= 6.4 ) { return new Prediction("2", 11, 0); }
	if( budget < 6.4 ) { 
		if( budget >= 4.75 ) { return new Prediction("3", 11, 0); }
	if( budget < 4.75 ) { 
		if( stability >= 4.7 ) { return new Prediction("3", 3, 0); }
		if( stability < 4.7 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( approval >= 7.4 ) { 
	if( stability >= 9.05 ) { 
	if( stability >= 16.95 ) { 
	if( budget < 28.75 ) { 
	if( stability >= 56.7 ) { 
		if( approval < 57.45 ) { return new Prediction("3", 3, 0); }
	if( approval >= 57.45 ) { 
		if( budget < 16.45 ) { return new Prediction("1", 2, 0); }
		if( budget >= 16.45 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( stability < 56.7 ) { 
	if( approval < 23.65 ) { 
		if( budget >= 19.7 ) { return new Prediction("3", 2, 0); }
		if( budget < 19.7 ) { return new Prediction("1", 2, 0); }
	}
		if( approval >= 23.65 ) { return new Prediction("1", 12, 0); }
	}
	}
	if( budget >= 28.75 ) { 
		if( approval < 32 ) { return new Prediction("2", 1, 0); }
		if( approval >= 32 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( stability < 16.95 ) { 
	if( approval >= 9.55 ) { 
		if( budget >= 11.25 ) { return new Prediction("2", 2, 0); }
		if( budget < 11.25 ) { return new Prediction("3", 2, 0); }
	}
		if( approval < 9.55 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( stability < 9.05 ) { 
		if( budget >= 9.4 ) { return new Prediction("2", 1, 0); }
		if( budget < 9.4 ) { return new Prediction("1", 13, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 4.65 ) { 
		if( approval < 5.35 ) { return new Prediction("1", 5, 0); }
	if( approval >= 5.35 ) { 
	if( stability >= 28.6 ) { 
		if( approval < 26.75 ) { return new Prediction("1", 1, 0); }
		if( approval >= 26.75 ) { return new Prediction("2", 20, 0); }
	}
	if( stability < 28.6 ) { 
		if( approval >= 30.95 ) { return new Prediction("3", 4, 0); }
	if( approval < 30.95 ) { 
	if( stability < 18.55 ) { 
	if( approval >= 9.55 ) { 
	if( approval >= 11.8 ) { 
		if( budget >= 16.4 ) { return new Prediction("3", 1, 0); }
		if( budget < 16.4 ) { return new Prediction("2", 2, 0); }
	}
		if( approval < 11.8 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 9.55 ) { return new Prediction("2", 11, 0); }
	}
	if( stability >= 18.55 ) { 
	if( approval >= 18.05 ) { 
		if( stability >= 25 ) { return new Prediction("3", 1, 0); }
		if( stability < 25 ) { return new Prediction("2", 7, 0); }
	}
		if( approval < 18.05 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	}
	}
	if( stability < 4.65 ) { 
	if( approval < 4.15 ) { 
		if( approval >= 2.65 ) { return new Prediction("2", 1, 0); }
		if( approval < 2.65 ) { return new Prediction("1", 2, 0); }
	}
		if( approval >= 4.15 ) { return new Prediction("3", 12, 0); }
	}
	}
	}
	}
	}
	if( budget >= 68.55 ) { 
	if( approval >= 36.55 ) { 
		if( approval < 64.75 ) { return new Prediction("2", 3, 0); }
		if( approval >= 64.75 ) { return new Prediction("1", 3, 0); }
	}
		if( approval < 36.55 ) { return new Prediction("1", 6, 0); }
	}
	}
	}
	if( budget >= 74.8 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 24, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 42.9 ) { return new Prediction("1", 7, 0); }
		if( approval >= 42.9 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	if( approval >= 83.2 ) { 
	if( budget < 59.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 17, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 3, 0); }
	}
	if( budget >= 59.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 9, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 8, 0); }
	}
	}
	}
	if( stability >= 82.75 ) { 
	if( budget >= 27 ) { 
	if( approval >= 16.8 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 27, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 2, 0); }
	}
		if( approval < 16.8 ) { return new Prediction("1", 2, 0); }
	}
	if( budget < 27 ) { 
		if( approval < 26.8 ) { return new Prediction("3", 2, 0); }
	if( approval >= 26.8 ) { 
		if( budget >= 14.4 ) { return new Prediction("2", 7, 0); }
		if( budget < 14.4 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
return null;
}
private Prediction runTree48() {
	if( approval < 56.15 ) { 
	if( budget >= 78.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 14, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 9, 0); }
	}
	if( budget < 78.55 ) { 
	if( stability < 48.85 ) { 
	if( approval < 2 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 6, 0); }
	}
	if( approval >= 2 ) { 
	if( budget < 1.9 ) { 
	if( approval >= 3.35 ) { 
		if( approval >= 6.75 ) { return new Prediction("3", 1, 0); }
		if( approval < 6.75 ) { return new Prediction("2", 5, 0); }
	}
		if( approval < 3.35 ) { return new Prediction("3", 5, 0); }
	}
	if( budget >= 1.9 ) { 
	if( budget < 3.55 ) { 
		if( approval >= 6.7 ) { return new Prediction("1", 12, 0); }
	if( approval < 6.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 1, 0); }
	if( "positive".equals(type) ) { 
		if( approval >= 2.8 ) { return new Prediction("2", 2, 0); }
		if( approval < 2.8 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	if( budget >= 3.55 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 37.5 ) { 
	if( stability >= 36.8 ) { 
		if( budget < 57.9 ) { return new Prediction("3", 9, 0); }
		if( budget >= 57.9 ) { return new Prediction("2", 1, 0); }
	}
	if( stability < 36.8 ) { 
	if( budget < 9.45 ) { 
	if( stability < 6.95 ) { 
	if( approval < 5.25 ) { 
		if( approval >= 5.05 ) { return new Prediction("3", 1, 0); }
		if( approval < 5.05 ) { return new Prediction("2", 5, 0); }
	}
	if( approval >= 5.25 ) { 
	if( approval < 7.35 ) { 
		if( approval < 6.45 ) { return new Prediction("1", 2, 0); }
		if( approval >= 6.45 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 7.35 ) { return new Prediction("1", 7, 0); }
	}
	}
		if( stability >= 6.95 ) { return new Prediction("3", 7, 0); }
	}
	if( budget >= 9.45 ) { 
	if( approval >= 25.9 ) { 
		if( budget < 26.2 ) { return new Prediction("1", 3, 0); }
	if( budget >= 26.2 ) { 
	if( budget < 38.55 ) { 
		if( approval < 32.5 ) { return new Prediction("2", 1, 0); }
		if( approval >= 32.5 ) { return new Prediction("2", 3, 1); }
	}
		if( budget >= 38.55 ) { return new Prediction("2", 6, 0); }
	}
	}
	if( approval < 25.9 ) { 
		if( stability < 21.7 ) { return new Prediction("2", 9, 0); }
	if( stability >= 21.7 ) { 
		if( approval >= 13.8 ) { return new Prediction("3", 1, 0); }
		if( approval < 13.8 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
	if( approval >= 37.5 ) { 
		if( budget < 43.95 ) { return new Prediction("1", 14, 0); }
	if( budget >= 43.95 ) { 
	if( approval >= 47.5 ) { 
	if( budget < 52.3 ) { 
		if( stability < 46.75 ) { return new Prediction("1", 9, 0); }
	if( stability >= 46.75 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 1, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( budget >= 52.3 ) { return new Prediction("2", 3, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("2", 10, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 45.55 ) { 
	if( stability >= 38.55 ) { 
		if( approval >= 40.5 ) { return new Prediction("2", 12, 0); }
	if( approval < 40.5 ) { 
	if( stability >= 42.95 ) { 
		if( approval >= 38 ) { return new Prediction("1", 1, 0); }
		if( approval < 38 ) { return new Prediction("2", 3, 0); }
	}
	if( stability < 42.95 ) { 
		if( budget < 36.85 ) { return new Prediction("2", 2, 0); }
		if( budget >= 36.85 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	if( stability < 38.55 ) { 
	if( budget < 32 ) { 
	if( approval >= 6.15 ) { 
	if( stability >= 6.7 ) { 
	if( stability >= 28.6 ) { 
		if( approval < 23.05 ) { return new Prediction("1", 2, 0); }
		if( approval >= 23.05 ) { return new Prediction("2", 10, 0); }
	}
	if( stability < 28.6 ) { 
	if( budget >= 16.4 ) { 
	if( budget >= 22.9 ) { 
	if( stability < 24.4 ) { 
		if( approval < 23 ) { return new Prediction("1", 1, 0); }
		if( approval >= 23 ) { return new Prediction("2", 1, 0); }
	}
		if( stability >= 24.4 ) { return new Prediction("3", 2, 0); }
	}
		if( budget < 22.9 ) { return new Prediction("3", 3, 0); }
	}
		if( budget < 16.4 ) { return new Prediction("2", 11, 0); }
	}
	}
	if( stability < 6.7 ) { 
		if( approval >= 6.85 ) { return new Prediction("3", 13, 0); }
		if( approval < 6.85 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( approval < 6.15 ) { 
	if( stability >= 2.8 ) { 
		if( approval < 5.35 ) { return new Prediction("1", 10, 0); }
	if( approval >= 5.35 ) { 
		if( approval >= 5.8 ) { return new Prediction("1", 3, 0); }
		if( approval < 5.8 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( stability < 2.8 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( budget >= 32 ) { 
	if( stability >= 33.75 ) { 
		if( approval >= 36.5 ) { return new Prediction("3", 3, 0); }
	if( approval < 36.5 ) { 
		if( budget >= 38.35 ) { return new Prediction("1", 4, 0); }
	if( budget < 38.35 ) { 
		if( approval >= 33 ) { return new Prediction("3", 1, 0); }
		if( approval < 33 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
		if( stability < 33.75 ) { return new Prediction("3", 13, 0); }
	}
	}
	}
	if( budget >= 45.55 ) { 
		if( approval >= 44.3 ) { return new Prediction("3", 12, 0); }
	if( approval < 44.3 ) { 
		if( budget >= 56.9 ) { return new Prediction("1", 5, 0); }
	if( budget < 56.9 ) { 
	if( budget < 52.05 ) { 
	if( approval >= 40.5 ) { 
		if( approval >= 42 ) { return new Prediction("1", 2, 0); }
		if( approval < 42 ) { return new Prediction("3", 2, 0); }
	}
		if( approval < 40.5 ) { return new Prediction("1", 5, 0); }
	}
		if( budget >= 52.05 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
	if( stability >= 48.85 ) { 
	if( budget >= 71.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 4, 0); }
	}
	if( budget < 71.4 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 51.95 ) { 
		if( stability >= 68.65 ) { return new Prediction("3", 5, 0); }
		if( stability < 68.65 ) { return new Prediction("1", 5, 0); }
	}
	if( approval < 51.95 ) { 
		if( budget < 66.7 ) { return new Prediction("3", 25, 0); }
	if( budget >= 66.7 ) { 
		if( approval < 40.2 ) { return new Prediction("2", 1, 0); }
		if( approval >= 40.2 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( budget < 26.75 ) { return new Prediction("2", 2, 0); }
	if( budget >= 26.75 ) { 
		if( stability >= 51.4 ) { return new Prediction("1", 13, 0); }
		if( stability < 51.4 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	}
	}
	if( approval >= 56.15 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 78.6 ) { 
	if( budget >= 68.75 ) { 
		if( approval < 71.4 ) { return new Prediction("2", 13, 0); }
	if( approval >= 71.4 ) { 
		if( approval < 72.1 ) { return new Prediction("3", 1, 0); }
		if( approval >= 72.1 ) { return new Prediction("2", 5, 0); }
	}
	}
	if( budget < 68.75 ) { 
		if( stability >= 70.1 ) { return new Prediction("3", 7, 0); }
	if( stability < 70.1 ) { 
		if( stability < 57 ) { return new Prediction("1", 2, 0); }
	if( stability >= 57 ) { 
		if( approval < 63.5 ) { return new Prediction("3", 1, 0); }
		if( approval >= 63.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( approval >= 78.6 ) { 
		if( budget < 93.9 ) { return new Prediction("1", 15, 0); }
		if( budget >= 93.9 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 52.75 ) { 
	if( approval < 70 ) { 
	if( approval >= 64.3 ) { 
		if( budget >= 23.35 ) { return new Prediction("3", 3, 0); }
		if( budget < 23.35 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 64.3 ) { return new Prediction("2", 10, 0); }
	}
		if( approval >= 70 ) { return new Prediction("2", 25, 0); }
	}
	if( budget >= 52.75 ) { 
		if( budget >= 69.6 ) { return new Prediction("3", 15, 0); }
	if( budget < 69.6 ) { 
		if( stability >= 57.05 ) { return new Prediction("2", 4, 0); }
		if( stability < 57.05 ) { return new Prediction("3", 12, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree49() {
		if( stability >= 90.8 ) { return new Prediction("3", 13, 0); }
	if( stability < 90.8 ) { 
	if( budget >= 3.75 ) { 
	if( budget >= 97.65 ) { 
		if( approval < 35.7 ) { return new Prediction("1", 1, 0); }
	if( approval >= 35.7 ) { 
		if( approval >= 91.55 ) { return new Prediction("1", 1, 0); }
		if( approval < 91.55 ) { return new Prediction("2", 10, 0); }
	}
	}
	if( budget < 97.65 ) { 
	if( approval < 90.9 ) { 
	if( stability < 24.85 ) { 
	if( budget >= 18.75 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 19.55 ) { 
		if( approval >= 15 ) { return new Prediction("1", 4, 0); }
		if( approval < 15 ) { return new Prediction("3", 1, 0); }
	}
	if( stability < 19.55 ) { 
		if( approval < 68.5 ) { return new Prediction("2", 5, 0); }
		if( approval >= 68.5 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( approval >= 28.05 ) { return new Prediction("3", 23, 0); }
	if( approval < 28.05 ) { 
	if( approval < 26.05 ) { 
		if( stability >= 19.4 ) { return new Prediction("1", 1, 0); }
		if( stability < 19.4 ) { return new Prediction("3", 3, 0); }
	}
		if( approval >= 26.05 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( budget < 18.75 ) { 
	if( stability < 7.25 ) { 
	if( budget < 7.3 ) { 
		if( approval < 3.25 ) { return new Prediction("1", 7, 0); }
	if( approval >= 3.25 ) { 
	if( budget < 6.65 ) { 
	if( approval < 4.9 ) { 
		if( approval >= 4.55 ) { return new Prediction("1", 2, 0); }
	if( approval < 4.55 ) { 
	if( approval < 3.8 ) { 
		if( approval >= 3.4 ) { return new Prediction("2", 1, 0); }
		if( approval < 3.4 ) { return new Prediction("3", 2, 0); }
	}
	if( approval >= 3.8 ) { 
		if( approval >= 4.25 ) { return new Prediction("3", 2, 0); }
		if( approval < 4.25 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( approval >= 4.9 ) { 
		if( budget >= 3.95 ) { return new Prediction("3", 12, 0); }
	if( budget < 3.95 ) { 
		if( stability >= 5 ) { return new Prediction("2", 1, 0); }
		if( stability < 5 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
		if( budget >= 6.65 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( budget >= 7.3 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 2, 0); }
	}
	}
	if( stability >= 7.25 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 9.3 ) { return new Prediction("3", 3, 0); }
		if( budget >= 9.3 ) { return new Prediction("2", 3, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 13, 0); }
	}
	}
	}
	if( stability >= 24.85 ) { 
	if( approval < 26.05 ) { 
	if( stability < 47.65 ) { 
		if( budget >= 61.9 ) { return new Prediction("2", 7, 0); }
	if( budget < 61.9 ) { 
		if( approval < 13.15 ) { return new Prediction("3", 2, 0); }
		if( approval >= 13.15 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( stability >= 47.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 14, 0); }
	}
	}
	if( approval >= 26.05 ) { 
	if( budget >= 33.35 ) { 
	if( budget >= 72.75 ) { 
	if( approval < 42.2 ) { 
		if( approval >= 37.8 ) { return new Prediction("1", 4, 0); }
	if( approval < 37.8 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 2, 0); }
	}
	}
	if( approval >= 42.2 ) { 
		if( stability < 66.1 ) { return new Prediction("2", 11, 0); }
	if( stability >= 66.1 ) { 
		if( stability >= 80.75 ) { return new Prediction("3", 2, 0); }
	if( stability < 80.75 ) { 
		if( approval < 82.15 ) { return new Prediction("2", 2, 0); }
		if( approval >= 82.15 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	if( budget < 72.75 ) { 
		if( approval < 29.95 ) { return new Prediction("3", 7, 0); }
	if( approval >= 29.95 ) { 
	if( stability < 82.6 ) { 
	if( stability < 55.45 ) { 
	if( budget < 63.25 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 48.5 ) { 
		if( budget < 52.85 ) { return new Prediction("1", 19, 0); }
	if( budget >= 52.85 ) { 
		if( budget < 56.35 ) { return new Prediction("2", 2, 0); }
	if( budget >= 56.35 ) { 
		if( approval < 70.05 ) { return new Prediction("2", 2, 0); }
		if( approval >= 70.05 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( approval < 48.5 ) { 
	if( budget >= 39.15 ) { 
	if( stability < 48.75 ) { 
	if( approval < 37.5 ) { 
		if( stability < 39.6 ) { return new Prediction("2", 5, 0); }
		if( stability >= 39.6 ) { return new Prediction("3", 3, 0); }
	}
		if( approval >= 37.5 ) { return new Prediction("2", 15, 0); }
	}
		if( stability >= 48.75 ) { return new Prediction("3", 6, 0); }
	}
	if( budget < 39.15 ) { 
	if( stability >= 39.75 ) { 
		if( approval >= 42 ) { return new Prediction("1", 3, 0); }
		if( approval < 42 ) { return new Prediction("3", 3, 0); }
	}
		if( stability < 39.75 ) { return new Prediction("1", 6, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 47.5 ) { 
		if( budget < 42.8 ) { return new Prediction("2", 7, 0); }
	if( budget >= 42.8 ) { 
		if( stability >= 51 ) { return new Prediction("2", 1, 0); }
		if( stability < 51 ) { return new Prediction("3", 12, 0); }
	}
	}
	if( approval < 47.5 ) { 
	if( budget >= 41.9 ) { 
	if( approval >= 39 ) { 
		if( stability < 44.25 ) { return new Prediction("3", 6, 0); }
	if( stability >= 44.25 ) { 
	if( budget >= 45.95 ) { 
	if( stability < 46.75 ) { 
		if( approval < 45 ) { return new Prediction("1", 1, 0); }
		if( approval >= 45 ) { return new Prediction("3", 2, 0); }
	}
		if( stability >= 46.75 ) { return new Prediction("1", 2, 0); }
	}
		if( budget < 45.95 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( approval < 39 ) { return new Prediction("1", 3, 0); }
	}
	if( budget < 41.9 ) { 
	if( stability >= 39.75 ) { 
		if( stability >= 42.95 ) { return new Prediction("2", 8, 0); }
	if( stability < 42.95 ) { 
		if( budget >= 39.8 ) { return new Prediction("1", 1, 0); }
		if( budget < 39.8 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( stability < 39.75 ) { 
	if( approval < 35.5 ) { 
		if( approval < 32.5 ) { return new Prediction("1", 1, 0); }
	if( approval >= 32.5 ) { 
		if( stability >= 35.85 ) { return new Prediction("1", 3, 0); }
		if( stability < 35.85 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval >= 35.5 ) { 
		if( budget < 40.75 ) { return new Prediction("3", 6, 0); }
		if( budget >= 40.75 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	}
		if( budget >= 63.25 ) { return new Prediction("3", 8, 0); }
	}
	if( stability >= 55.45 ) { 
	if( stability < 61.55 ) { 
		if( stability >= 58.4 ) { return new Prediction("1", 11, 0); }
	if( stability < 58.4 ) { 
		if( stability < 56.4 ) { return new Prediction("1", 6, 0); }
	if( stability >= 56.4 ) { 
		if( approval >= 47.7 ) { return new Prediction("3", 3, 0); }
		if( approval < 47.7 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( stability >= 61.55 ) { 
	if( stability >= 75.1 ) { 
		if( budget < 64.85 ) { return new Prediction("1", 3, 0); }
	if( budget >= 64.85 ) { 
		if( approval < 50.5 ) { return new Prediction("1", 1, 0); }
		if( approval >= 50.5 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( stability < 75.1 ) { 
	if( approval < 59.2 ) { 
	if( stability >= 66.7 ) { 
		if( budget < 67.9 ) { return new Prediction("3", 4, 0); }
		if( budget >= 67.9 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 66.7 ) { return new Prediction("2", 2, 0); }
	}
	if( approval >= 59.2 ) { 
		if( budget >= 42.5 ) { return new Prediction("2", 7, 0); }
		if( budget < 42.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	if( stability >= 82.6 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	if( budget < 33.35 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 64.8 ) { 
		if( budget < 28.75 ) { return new Prediction("1", 5, 0); }
		if( budget >= 28.75 ) { return new Prediction("3", 3, 0); }
	}
		if( stability >= 64.8 ) { return new Prediction("3", 8, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval >= 29.75 ) { return new Prediction("2", 31, 0); }
		if( approval < 29.75 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	if( approval >= 90.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 8, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 7, 0); }
	}
	}
	}
	if( budget < 3.75 ) { 
	if( stability < 5.25 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 4.25 ) { return new Prediction("1", 9, 0); }
	if( approval < 4.25 ) { 
		if( stability < 2.15 ) { return new Prediction("1", 1, 0); }
		if( stability >= 2.15 ) { return new Prediction("3", 4, 0); }
	}
	}
		if( "positive".equals(type) ) { return new Prediction("3", 7, 0); }
	}
	if( stability >= 5.25 ) { 
	if( stability >= 7.95 ) { 
		if( approval < 4.4 ) { return new Prediction("3", 1, 0); }
	if( approval >= 4.4 ) { 
		if( approval >= 8.1 ) { return new Prediction("1", 1, 0); }
		if( approval < 8.1 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( stability < 7.95 ) { 
		if( stability < 7.4 ) { return new Prediction("1", 8, 0); }
	if( stability >= 7.4 ) { 
		if( approval < 2.7 ) { return new Prediction("1", 4, 0); }
		if( approval >= 2.7 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree50() {
		if( stability >= 92.55 ) { return new Prediction("3", 13, 0); }
	if( stability < 92.55 ) { 
	if( approval >= 29.65 ) { 
	if( budget < 40.1 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 37.45 ) { 
		if( budget < 32.55 ) { return new Prediction("1", 8, 0); }
	if( budget >= 32.55 ) { 
	if( approval >= 36.5 ) { 
		if( approval < 37.5 ) { return new Prediction("2", 3, 1); }
		if( approval >= 37.5 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 36.5 ) { return new Prediction("2", 4, 0); }
	}
	}
	if( stability >= 37.45 ) { 
		if( approval < 44.5 ) { return new Prediction("3", 9, 0); }
	if( approval >= 44.5 ) { 
	if( budget < 27.2 ) { 
	if( budget < 19.2 ) { 
		if( approval < 64.4 ) { return new Prediction("3", 1, 0); }
		if( approval >= 64.4 ) { return new Prediction("1", 2, 0); }
	}
		if( budget >= 19.2 ) { return new Prediction("3", 2, 0); }
	}
		if( budget >= 27.2 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( stability >= 38.05 ) { return new Prediction("2", 35, 0); }
	if( stability < 38.05 ) { 
	if( budget < 32 ) { 
		if( budget < 18.95 ) { return new Prediction("2", 6, 0); }
	if( budget >= 18.95 ) { 
		if( stability >= 28.65 ) { return new Prediction("2", 7, 0); }
		if( stability < 28.65 ) { return new Prediction("3", 7, 0); }
	}
	}
	if( budget >= 32 ) { 
	if( budget >= 36.75 ) { 
		if( approval >= 43 ) { return new Prediction("3", 4, 0); }
	if( approval < 43 ) { 
		if( budget >= 38.4 ) { return new Prediction("1", 1, 0); }
		if( budget < 38.4 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( budget < 36.75 ) { 
		if( approval < 33.5 ) { return new Prediction("1", 3, 0); }
		if( approval >= 33.5 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	if( budget >= 40.1 ) { 
	if( budget >= 60.3 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 72.55 ) { 
		if( budget < 77.5 ) { return new Prediction("1", 4, 0); }
	if( budget >= 77.5 ) { 
		if( stability >= 39.85 ) { return new Prediction("2", 4, 0); }
		if( stability < 39.85 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( approval < 72.55 ) { 
	if( stability < 83.3 ) { 
	if( budget < 67.8 ) { 
		if( stability >= 56.25 ) { return new Prediction("3", 2, 0); }
		if( stability < 56.25 ) { return new Prediction("2", 6, 0); }
	}
		if( budget >= 67.8 ) { return new Prediction("2", 18, 0); }
	}
		if( stability >= 83.3 ) { return new Prediction("3", 6, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 68.05 ) { 
		if( budget < 61.95 ) { return new Prediction("2", 1, 0); }
	if( budget >= 61.95 ) { 
	if( approval < 58.4 ) { 
		if( budget >= 75.5 ) { return new Prediction("1", 1, 0); }
		if( budget < 75.5 ) { return new Prediction("3", 2, 0); }
	}
		if( approval >= 58.4 ) { return new Prediction("3", 16, 0); }
	}
	}
		if( stability >= 68.05 ) { return new Prediction("1", 6, 0); }
	}
	}
	if( budget < 60.3 ) { 
	if( stability >= 37.65 ) { 
		if( stability >= 78.2 ) { return new Prediction("3", 6, 0); }
	if( stability < 78.2 ) { 
	if( budget >= 54.2 ) { 
	if( approval >= 49 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 63.5 ) { 
		if( approval < 54 ) { return new Prediction("3", 1, 0); }
	if( approval >= 54 ) { 
		if( stability < 57 ) { return new Prediction("1", 3, 0); }
		if( stability >= 57 ) { return new Prediction("3", 4, 0); }
	}
	}
		if( approval >= 63.5 ) { return new Prediction("1", 3, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 10, 0); }
	}
		if( approval < 49 ) { return new Prediction("1", 4, 0); }
	}
	if( budget < 54.2 ) { 
	if( approval < 51.85 ) { 
	if( stability < 48.75 ) { 
	if( stability < 44.35 ) { 
	if( budget < 49.5 ) { 
	if( approval >= 39 ) { 
		if( stability >= 40.7 ) { return new Prediction("2", 2, 0); }
	if( stability < 40.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 10, 0); }
	}
	}
	if( approval < 39 ) { 
		if( stability < 41.5 ) { return new Prediction("1", 7, 0); }
		if( stability >= 41.5 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( budget >= 49.5 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 2, 0); }
	if( approval < 48.5 ) { 
		if( stability < 42.75 ) { return new Prediction("2", 4, 0); }
		if( stability >= 42.75 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( stability >= 44.35 ) { 
	if( approval >= 38 ) { 
		if( budget >= 52.25 ) { return new Prediction("2", 2, 0); }
	if( budget < 52.25 ) { 
	if( budget >= 48.85 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 7, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 45 ) { return new Prediction("1", 7, 0); }
		if( approval >= 45 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( budget < 48.85 ) { 
		if( approval < 41.5 ) { return new Prediction("1", 4, 0); }
	if( approval >= 41.5 ) { 
		if( budget < 46.95 ) { return new Prediction("2", 3, 0); }
	if( budget >= 46.95 ) { 
		if( approval >= 47.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 47.5 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
		if( approval < 38 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( stability >= 48.75 ) { 
		if( approval >= 47.5 ) { return new Prediction("3", 7, 0); }
	if( approval < 47.5 ) { 
		if( budget < 49.5 ) { return new Prediction("1", 3, 0); }
		if( budget >= 49.5 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( approval >= 51.85 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 13, 0); }
	if( "positive".equals(type) ) { 
	if( approval < 55.5 ) { 
		if( budget >= 51.8 ) { return new Prediction("1", 3, 0); }
		if( budget < 51.8 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 55.5 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	}
	}
	if( stability < 37.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 8, 0); }
	}
	}
	}
	}
	if( approval < 29.65 ) { 
	if( budget < 67.85 ) { 
	if( budget < 7.3 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 5.2 ) { 
		if( stability >= 9.35 ) { return new Prediction("3", 3, 0); }
	if( stability < 9.35 ) { 
		if( budget < 5.4 ) { return new Prediction("1", 24, 0); }
	if( budget >= 5.4 ) { 
		if( approval >= 6.85 ) { return new Prediction("1", 2, 0); }
		if( approval < 6.85 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( approval < 5.2 ) { 
		if( stability >= 3.75 ) { return new Prediction("3", 6, 0); }
	if( stability < 3.75 ) { 
		if( budget < 2.85 ) { return new Prediction("1", 1, 0); }
		if( budget >= 2.85 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( stability >= 6.65 ) { return new Prediction("2", 11, 0); }
	if( stability < 6.65 ) { 
	if( budget < 2.85 ) { 
		if( approval < 2.7 ) { return new Prediction("1", 1, 0); }
		if( approval >= 2.7 ) { return new Prediction("2", 9, 0); }
	}
	if( budget >= 2.85 ) { 
	if( approval < 5.1 ) { 
		if( budget >= 4.15 ) { return new Prediction("1", 10, 0); }
		if( budget < 4.15 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 5.1 ) { return new Prediction("3", 7, 0); }
	}
	}
	}
	}
	if( budget >= 7.3 ) { 
	if( stability >= 22.75 ) { 
	if( approval < 18.15 ) { 
		if( budget < 24.3 ) { return new Prediction("3", 1, 0); }
		if( budget >= 24.3 ) { return new Prediction("1", 3, 0); }
	}
	if( approval >= 18.15 ) { 
	if( stability >= 25 ) { 
	if( approval >= 27.3 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 1, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 2, 0); }
	}
		if( approval < 27.3 ) { return new Prediction("3", 5, 0); }
	}
	if( stability < 25 ) { 
		if( budget < 26.2 ) { return new Prediction("1", 2, 0); }
		if( budget >= 26.2 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( stability < 22.75 ) { 
	if( budget < 8.4 ) { 
		if( approval < 5.45 ) { return new Prediction("2", 1, 0); }
	if( approval >= 5.45 ) { 
		if( budget < 7.7 ) { return new Prediction("2", 1, 0); }
		if( budget >= 7.7 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( budget >= 8.4 ) { 
	if( stability >= 19.55 ) { 
	if( budget >= 16.5 ) { 
	if( approval >= 21.5 ) { 
		if( budget >= 23.4 ) { return new Prediction("1", 1, 0); }
		if( budget < 23.4 ) { return new Prediction("2", 2, 0); }
	}
		if( approval < 21.5 ) { return new Prediction("1", 2, 0); }
	}
		if( budget < 16.5 ) { return new Prediction("2", 1, 0); }
	}
	if( stability < 19.55 ) { 
		if( stability < 1.2 ) { return new Prediction("1", 1, 0); }
		if( stability >= 1.2 ) { return new Prediction("2", 15, 0); }
	}
	}
	}
	}
	}
	if( budget >= 67.85 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 14, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 16, 0); }
	}
	}
	}
return null;
}
private Prediction runTree51() {
		if( budget >= 97.65 ) { return new Prediction("2", 9, 0); }
	if( budget < 97.65 ) { 
	if( stability < 91.65 ) { 
	if( budget < 95.15 ) { 
	if( approval < 54.25 ) { 
	if( budget >= 65.5 ) { 
	if( approval >= 15.95 ) { 
	if( stability >= 28.4 ) { 
	if( stability >= 53.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 10, 0); }
	}
		if( stability < 53.7 ) { return new Prediction("1", 12, 0); }
	}
	if( stability < 28.4 ) { 
		if( budget < 82.25 ) { return new Prediction("3", 1, 0); }
		if( budget >= 82.25 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( approval < 15.95 ) { return new Prediction("2", 5, 0); }
	}
	if( budget < 65.5 ) { 
	if( budget >= 39.5 ) { 
		if( budget >= 61.9 ) { return new Prediction("3", 8, 0); }
	if( budget < 61.9 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 41.7 ) { 
	if( approval >= 48.5 ) { 
		if( stability < 54.2 ) { return new Prediction("1", 14, 0); }
		if( stability >= 54.2 ) { return new Prediction("3", 7, 0); }
	}
	if( approval < 48.5 ) { 
		if( approval < 40.9 ) { return new Prediction("3", 12, 0); }
	if( approval >= 40.9 ) { 
	if( stability < 48.75 ) { 
	if( approval >= 45.5 ) { 
		if( budget >= 45.15 ) { return new Prediction("2", 2, 0); }
		if( budget < 45.15 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 45.5 ) { return new Prediction("2", 1, 0); }
	}
		if( stability >= 48.75 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( stability < 41.7 ) { 
	if( approval >= 48.5 ) { 
		if( approval >= 50.45 ) { return new Prediction("2", 1, 0); }
		if( approval < 50.45 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 48.5 ) { return new Prediction("2", 9, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( stability >= 51.4 ) { return new Prediction("1", 5, 0); }
	if( stability < 51.4 ) { 
	if( approval < 45 ) { 
	if( stability < 40.55 ) { 
	if( budget < 43.95 ) { 
	if( stability >= 36.9 ) { 
		if( budget >= 41.9 ) { return new Prediction("3", 1, 0); }
	if( budget < 41.9 ) { 
		if( approval >= 39.5 ) { return new Prediction("3", 1, 0); }
		if( approval < 39.5 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( stability < 36.9 ) { return new Prediction("3", 4, 0); }
	}
		if( budget >= 43.95 ) { return new Prediction("1", 6, 0); }
	}
	if( stability >= 40.55 ) { 
		if( budget >= 41.9 ) { return new Prediction("1", 8, 0); }
	if( budget < 41.9 ) { 
		if( budget < 40.75 ) { return new Prediction("1", 1, 0); }
		if( budget >= 40.75 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( approval >= 45 ) { 
		if( budget < 45.55 ) { return new Prediction("2", 2, 0); }
		if( budget >= 45.55 ) { return new Prediction("3", 23, 0); }
	}
	}
	}
	}
	}
	if( budget < 39.5 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 6.4 ) { 
	if( approval >= 30.95 ) { 
	if( stability < 48.75 ) { 
	if( stability >= 33 ) { 
		if( approval < 37 ) { return new Prediction("2", 3, 0); }
		if( approval >= 37 ) { return new Prediction("1", 6, 0); }
	}
		if( stability < 33 ) { return new Prediction("1", 12, 0); }
	}
		if( stability >= 48.75 ) { return new Prediction("3", 1, 0); }
	}
	if( approval < 30.95 ) { 
	if( approval < 7.35 ) { 
		if( approval >= 3.65 ) { return new Prediction("3", 13, 0); }
		if( approval < 3.65 ) { return new Prediction("2", 1, 0); }
	}
	if( approval >= 7.35 ) { 
		if( stability >= 26.75 ) { return new Prediction("3", 11, 0); }
	if( stability < 26.75 ) { 
	if( approval < 8.55 ) { 
		if( approval < 8.05 ) { return new Prediction("1", 1, 0); }
		if( approval >= 8.05 ) { return new Prediction("3", 2, 0); }
	}
	if( approval >= 8.55 ) { 
	if( budget >= 11.25 ) { 
		if( approval >= 13.3 ) { return new Prediction("1", 3, 0); }
		if( approval < 13.3 ) { return new Prediction("2", 1, 0); }
	}
		if( budget < 11.25 ) { return new Prediction("1", 6, 0); }
	}
	}
	}
	}
	}
	if( stability < 6.4 ) { 
	if( budget < 4.65 ) { 
		if( approval >= 4.25 ) { return new Prediction("1", 15, 0); }
	if( approval < 4.25 ) { 
		if( budget >= 1.6 ) { return new Prediction("3", 2, 0); }
		if( budget < 1.6 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( budget >= 4.65 ) { 
	if( budget < 6.1 ) { 
		if( approval >= 4.7 ) { return new Prediction("1", 3, 0); }
		if( approval < 4.7 ) { return new Prediction("2", 1, 0); }
	}
	if( budget >= 6.1 ) { 
	if( approval >= 8.1 ) { 
		if( budget < 9.55 ) { return new Prediction("1", 2, 0); }
		if( budget >= 9.55 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 8.1 ) { return new Prediction("2", 7, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 2.8 ) { 
	if( approval < 35.5 ) { 
	if( budget < 25.7 ) { 
		if( stability < 3.35 ) { return new Prediction("3", 9, 0); }
	if( stability >= 3.35 ) { 
	if( approval < 7.35 ) { 
		if( approval >= 6.15 ) { return new Prediction("2", 11, 0); }
	if( approval < 6.15 ) { 
		if( approval >= 4.5 ) { return new Prediction("1", 2, 0); }
		if( approval < 4.5 ) { return new Prediction("2", 3, 0); }
	}
	}
	if( approval >= 7.35 ) { 
	if( stability < 19.2 ) { 
	if( budget < 14.75 ) { 
		if( stability >= 7.3 ) { return new Prediction("2", 5, 0); }
		if( stability < 7.3 ) { return new Prediction("3", 4, 0); }
	}
		if( budget >= 14.75 ) { return new Prediction("3", 5, 0); }
	}
	if( stability >= 19.2 ) { 
		if( approval < 21 ) { return new Prediction("1", 1, 0); }
		if( approval >= 21 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	}
	if( budget >= 25.7 ) { 
		if( approval >= 31.5 ) { return new Prediction("3", 3, 0); }
		if( approval < 31.5 ) { return new Prediction("1", 10, 0); }
	}
	}
	if( approval >= 35.5 ) { 
	if( stability >= 28.65 ) { 
		if( approval >= 36.5 ) { return new Prediction("2", 15, 0); }
	if( approval < 36.5 ) { 
		if( budget < 33.6 ) { return new Prediction("2", 2, 0); }
	if( budget >= 33.6 ) { 
		if( stability < 39 ) { return new Prediction("3", 1, 0); }
		if( stability >= 39 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
		if( stability < 28.65 ) { return new Prediction("3", 3, 0); }
	}
	}
		if( approval < 2.8 ) { return new Prediction("1", 7, 0); }
	}
	}
	}
	}
	if( approval >= 54.25 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 60.85 ) { 
	if( stability < 81.5 ) { 
		if( approval >= 85.95 ) { return new Prediction("1", 3, 0); }
	if( approval < 85.95 ) { 
		if( approval < 70.95 ) { return new Prediction("2", 10, 0); }
	if( approval >= 70.95 ) { 
		if( approval >= 75.4 ) { return new Prediction("2", 2, 0); }
		if( approval < 75.4 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( stability >= 81.5 ) { return new Prediction("3", 2, 0); }
	}
	if( budget < 60.85 ) { 
	if( stability >= 72.9 ) { 
		if( approval < 77.3 ) { return new Prediction("3", 3, 0); }
		if( approval >= 77.3 ) { return new Prediction("1", 2, 0); }
	}
	if( stability < 72.9 ) { 
		if( approval >= 57.05 ) { return new Prediction("1", 26, 0); }
	if( approval < 57.05 ) { 
		if( stability < 57 ) { return new Prediction("1", 5, 0); }
		if( stability >= 57 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 51.8 ) { 
	if( approval < 69.05 ) { 
		if( budget < 61.05 ) { return new Prediction("3", 6, 0); }
	if( budget >= 61.05 ) { 
		if( stability >= 61.6 ) { return new Prediction("1", 3, 0); }
		if( stability < 61.6 ) { return new Prediction("3", 6, 0); }
	}
	}
	if( approval >= 69.05 ) { 
	if( stability < 61.8 ) { 
	if( approval < 77.55 ) { 
		if( approval >= 74 ) { return new Prediction("2", 1, 0); }
		if( approval < 74 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 77.55 ) { return new Prediction("3", 12, 0); }
	}
		if( stability >= 61.8 ) { return new Prediction("2", 6, 0); }
	}
	}
	if( budget < 51.8 ) { 
		if( stability >= 27.55 ) { return new Prediction("2", 29, 0); }
		if( stability < 27.55 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
		if( budget >= 95.15 ) { return new Prediction("3", 6, 0); }
	}
		if( stability >= 91.65 ) { return new Prediction("3", 10, 0); }
	}
return null;
}
private Prediction runTree52() {
	if( stability < 82.75 ) { 
	if( approval < 84.9 ) { 
	if( approval < 68.2 ) { 
	if( approval < 6.9 ) { 
	if( approval >= 5.85 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 7 ) { return new Prediction("3", 4, 0); }
		if( budget >= 7 ) { return new Prediction("2", 4, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 12, 0); }
	}
	if( approval < 5.85 ) { 
	if( budget >= 6.8 ) { 
	if( stability < 2.35 ) { 
		if( budget >= 8.3 ) { return new Prediction("3", 1, 0); }
		if( budget < 8.3 ) { return new Prediction("2", 1, 0); }
	}
		if( stability >= 2.35 ) { return new Prediction("2", 7, 0); }
	}
	if( budget < 6.8 ) { 
	if( approval < 2.95 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 8, 0); }
	}
	if( approval >= 2.95 ) { 
	if( budget >= 4.15 ) { 
	if( budget >= 5.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 2, 0); }
	}
	if( budget < 5.45 ) { 
		if( budget < 4.55 ) { return new Prediction("1", 4, 0); }
	if( budget >= 4.55 ) { 
		if( approval >= 5.65 ) { return new Prediction("1", 1, 0); }
		if( approval < 5.65 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( budget < 4.15 ) { 
		if( approval >= 4.5 ) { return new Prediction("3", 6, 0); }
	if( approval < 4.5 ) { 
		if( stability >= 1.35 ) { return new Prediction("2", 9, 0); }
		if( stability < 1.35 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( approval >= 6.9 ) { 
	if( stability < 9.8 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 9.35 ) { return new Prediction("3", 2, 0); }
		if( stability < 9.35 ) { return new Prediction("1", 22, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget >= 3.95 ) { return new Prediction("3", 8, 0); }
	if( budget < 3.95 ) { 
		if( approval < 9.3 ) { return new Prediction("3", 3, 0); }
		if( approval >= 9.3 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( stability >= 9.8 ) { 
	if( budget < 67.8 ) { 
	if( stability >= 19.25 ) { 
	if( budget >= 56.2 ) { 
	if( stability < 44.25 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 4, 0); }
	}
	if( stability >= 44.25 ) { 
	if( approval >= 29.45 ) { 
		if( stability >= 79.25 ) { return new Prediction("1", 1, 0); }
	if( stability < 79.25 ) { 
	if( stability < 56.85 ) { 
		if( stability < 54 ) { return new Prediction("3", 7, 0); }
		if( stability >= 54 ) { return new Prediction("1", 1, 0); }
	}
		if( stability >= 56.85 ) { return new Prediction("3", 8, 0); }
	}
	}
	if( approval < 29.45 ) { 
		if( approval < 20.75 ) { return new Prediction("3", 1, 0); }
		if( approval >= 20.75 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( budget < 56.2 ) { 
	if( stability >= 45.25 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 48.9 ) { 
	if( budget >= 45 ) { 
		if( stability < 50.7 ) { return new Prediction("2", 7, 0); }
		if( stability >= 50.7 ) { return new Prediction("3", 2, 0); }
	}
		if( budget < 45 ) { return new Prediction("3", 8, 0); }
	}
	if( approval >= 48.9 ) { 
	if( budget < 52.9 ) { 
	if( stability >= 48 ) { 
	if( approval >= 51.5 ) { 
		if( stability < 68.4 ) { return new Prediction("1", 4, 0); }
		if( stability >= 68.4 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 51.5 ) { return new Prediction("3", 5, 0); }
	}
		if( stability < 48 ) { return new Prediction("1", 6, 0); }
	}
		if( budget >= 52.9 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 47.1 ) { 
		if( approval >= 24.7 ) { return new Prediction("2", 20, 0); }
		if( approval < 24.7 ) { return new Prediction("1", 1, 0); }
	}
	if( budget >= 47.1 ) { 
	if( stability >= 51.4 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 5, 0); }
		if( approval >= 56.35 ) { return new Prediction("2", 3, 0); }
	}
		if( stability < 51.4 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	if( stability < 45.25 ) { 
	if( budget < 38.55 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 23.1 ) { return new Prediction("3", 7, 0); }
	if( approval >= 23.1 ) { 
	if( stability < 37.45 ) { 
	if( stability < 35.55 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 14, 0); }
	if( budget >= 29.9 ) { 
		if( approval < 32.5 ) { return new Prediction("2", 1, 0); }
	if( approval >= 32.5 ) { 
		if( approval < 37.5 ) { return new Prediction("1", 3, 1); }
		if( approval >= 37.5 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
		if( stability >= 35.55 ) { return new Prediction("2", 2, 0); }
	}
	if( stability >= 37.45 ) { 
		if( approval >= 41 ) { return new Prediction("1", 5, 0); }
		if( approval < 41 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 32.9 ) { 
	if( approval >= 18.05 ) { 
		if( budget >= 23.4 ) { return new Prediction("3", 7, 0); }
		if( budget < 23.4 ) { return new Prediction("2", 3, 0); }
	}
		if( approval < 18.05 ) { return new Prediction("1", 3, 0); }
	}
	if( stability >= 32.9 ) { 
		if( approval < 35.5 ) { return new Prediction("1", 8, 0); }
		if( approval >= 35.5 ) { return new Prediction("2", 10, 0); }
	}
	}
	}
	if( budget >= 38.55 ) { 
	if( stability < 41.5 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 48 ) { return new Prediction("1", 2, 0); }
		if( approval < 48 ) { return new Prediction("2", 5, 0); }
	}
	if( "positive".equals(type) ) { 
	if( approval >= 39 ) { 
		if( budget < 40.75 ) { return new Prediction("2", 3, 0); }
		if( budget >= 40.75 ) { return new Prediction("3", 9, 0); }
	}
	if( approval < 39 ) { 
		if( stability >= 34.15 ) { return new Prediction("1", 5, 0); }
		if( stability < 34.15 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	if( stability >= 41.5 ) { 
	if( approval >= 32.9 ) { 
	if( approval < 43.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 4, 0); }
	}
	if( approval >= 43.5 ) { 
	if( approval >= 48.5 ) { 
		if( approval >= 52 ) { return new Prediction("3", 1, 0); }
		if( approval < 52 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 48.5 ) { return new Prediction("3", 2, 0); }
	}
	}
		if( approval < 32.9 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	}
	}
	if( stability < 19.25 ) { 
	if( approval < 46.7 ) { 
		if( budget >= 19.7 ) { return new Prediction("2", 4, 0); }
	if( budget < 19.7 ) { 
		if( budget >= 16.5 ) { return new Prediction("3", 1, 0); }
	if( budget < 16.5 ) { 
		if( stability < 13.8 ) { return new Prediction("2", 6, 0); }
		if( stability >= 13.8 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( approval >= 46.7 ) { 
		if( budget >= 49.8 ) { return new Prediction("2", 2, 0); }
		if( budget < 49.8 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	if( budget >= 67.8 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 25, 0); }
	if( "positive".equals(type) ) { 
		if( stability < 30.9 ) { return new Prediction("3", 1, 0); }
		if( stability >= 30.9 ) { return new Prediction("1", 16, 0); }
	}
	}
	}
	}
	}
	if( approval >= 68.2 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 64.05 ) { return new Prediction("1", 3, 0); }
		if( budget >= 64.05 ) { return new Prediction("2", 9, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 35.35 ) { 
	if( stability < 61.8 ) { 
		if( budget >= 69.2 ) { return new Prediction("3", 2, 0); }
	if( budget < 69.2 ) { 
		if( approval < 77.55 ) { return new Prediction("2", 3, 0); }
	if( approval >= 77.55 ) { 
		if( stability < 50.6 ) { return new Prediction("3", 1, 0); }
		if( stability >= 50.6 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
		if( stability >= 61.8 ) { return new Prediction("2", 11, 0); }
	}
		if( stability < 35.35 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	if( approval >= 84.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 20, 0); }
	if( "positive".equals(type) ) { 
		if( stability >= 69.15 ) { return new Prediction("2", 2, 0); }
		if( stability < 69.15 ) { return new Prediction("3", 15, 0); }
	}
	}
	}
	if( stability >= 82.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 17, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 5, 0); }
	}
return null;
}
private Prediction runTree53() {
	if( budget >= 2.75 ) { 
	if( budget >= 6.55 ) { 
	if( stability < 90.7 ) { 
	if( approval < 82.35 ) { 
	if( approval >= 45.5 ) { 
	if( budget < 91.3 ) { 
	if( approval < 67.9 ) { 
	if( stability < 44.25 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 45.8 ) { return new Prediction("1", 3, 0); }
		if( budget >= 45.8 ) { return new Prediction("2", 14, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 31.55 ) { 
	if( approval >= 48.5 ) { 
		if( budget >= 38.4 ) { return new Prediction("3", 4, 0); }
		if( budget < 38.4 ) { return new Prediction("2", 2, 0); }
	}
		if( approval < 48.5 ) { return new Prediction("2", 2, 0); }
	}
		if( stability < 31.55 ) { return new Prediction("3", 7, 0); }
	}
	}
	if( stability >= 44.25 ) { 
	if( budget < 39.6 ) { 
	if( budget < 33.1 ) { 
		if( stability >= 56.7 ) { return new Prediction("3", 3, 0); }
		if( stability < 56.7 ) { return new Prediction("1", 2, 0); }
	}
		if( budget >= 33.1 ) { return new Prediction("2", 5, 0); }
	}
	if( budget >= 39.6 ) { 
	if( budget < 67.1 ) { 
	if( budget < 49.5 ) { 
		if( budget < 47.3 ) { return new Prediction("3", 6, 0); }
	if( budget >= 47.3 ) { 
	if( approval < 54 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 48.75 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 48.5 ) { return new Prediction("2", 2, 0); }
	}
		if( stability >= 48.75 ) { return new Prediction("3", 3, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval >= 47.5 ) { return new Prediction("3", 3, 0); }
	if( approval < 47.5 ) { 
		if( stability >= 49 ) { return new Prediction("1", 2, 0); }
		if( stability < 49 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
		if( approval >= 54 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( budget >= 49.5 ) { 
	if( budget >= 53.75 ) { 
		if( stability < 54 ) { return new Prediction("3", 10, 0); }
	if( stability >= 54 ) { 
		if( stability < 57 ) { return new Prediction("1", 3, 0); }
		if( stability >= 57 ) { return new Prediction("3", 6, 0); }
	}
	}
	if( budget < 53.75 ) { 
	if( approval >= 49 ) { 
		if( stability >= 45.25 ) { return new Prediction("1", 3, 0); }
	if( stability < 45.25 ) { 
		if( approval < 52.5 ) { return new Prediction("1", 1, 0); }
		if( approval >= 52.5 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( approval < 49 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( budget >= 67.1 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 76.8 ) { return new Prediction("2", 4, 0); }
		if( stability >= 76.8 ) { return new Prediction("3", 2, 0); }
	}
	if( "positive".equals(type) ) { 
	if( approval < 61.6 ) { 
		if( approval >= 53.5 ) { return new Prediction("3", 2, 0); }
		if( approval < 53.5 ) { return new Prediction("1", 1, 0); }
	}
		if( approval >= 61.6 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	}
	if( approval >= 67.9 ) { 
	if( budget < 68.8 ) { 
	if( stability >= 28.6 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 11, 0); }
	}
	if( stability < 28.6 ) { 
	if( approval < 78.95 ) { 
		if( approval >= 75.35 ) { return new Prediction("1", 1, 0); }
		if( approval < 75.35 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 78.95 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( budget >= 68.8 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 8, 0); }
	}
	}
	}
		if( budget >= 91.3 ) { return new Prediction("2", 9, 0); }
	}
	if( approval < 45.5 ) { 
	if( budget < 66.7 ) { 
	if( budget >= 56.65 ) { 
		if( stability < 49.1 ) { return new Prediction("1", 2, 0); }
		if( stability >= 49.1 ) { return new Prediction("3", 7, 0); }
	}
	if( budget < 56.65 ) { 
	if( approval < 37.5 ) { 
	if( budget < 13.75 ) { 
	if( budget < 7.3 ) { 
	if( budget < 6.65 ) { 
		if( approval >= 8.65 ) { return new Prediction("2", 2, 0); }
		if( approval < 8.65 ) { return new Prediction("3", 1, 0); }
	}
		if( budget >= 6.65 ) { return new Prediction("1", 6, 0); }
	}
	if( budget >= 7.3 ) { 
	if( budget < 8.95 ) { 
		if( approval < 8.4 ) { return new Prediction("2", 7, 0); }
	if( approval >= 8.4 ) { 
		if( budget < 8.5 ) { return new Prediction("3", 2, 0); }
	if( budget >= 8.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( budget >= 8.95 ) { 
		if( stability < 5.55 ) { return new Prediction("1", 3, 0); }
	if( stability >= 5.55 ) { 
		if( approval < 31.95 ) { return new Prediction("2", 8, 0); }
		if( approval >= 31.95 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( budget >= 13.75 ) { 
	if( budget >= 42.4 ) { 
	if( approval < 31.05 ) { 
		if( budget >= 46.45 ) { return new Prediction("1", 2, 0); }
		if( budget < 46.45 ) { return new Prediction("3", 3, 0); }
	}
		if( approval >= 31.05 ) { return new Prediction("3", 5, 0); }
	}
	if( budget < 42.4 ) { 
		if( budget >= 41.1 ) { return new Prediction("2", 6, 0); }
	if( budget < 41.1 ) { 
	if( approval < 34 ) { 
		if( budget < 17.85 ) { return new Prediction("3", 4, 0); }
	if( budget >= 17.85 ) { 
	if( approval >= 27.3 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 29.9 ) { return new Prediction("1", 5, 0); }
		if( budget >= 29.9 ) { return new Prediction("2", 1, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 32.6 ) { 
		if( budget < 29 ) { return new Prediction("2", 1, 0); }
		if( budget >= 29 ) { return new Prediction("1", 3, 0); }
	}
	if( stability < 32.6 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 2, 0); }
	if( budget >= 25.7 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 1, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	if( approval < 27.3 ) { 
	if( budget >= 19.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 2, 0); }
	}
		if( budget < 19.7 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( approval >= 34 ) { 
	if( budget >= 37.75 ) { 
	if( stability < 39.95 ) { 
	if( stability < 36.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 2, 1); }
		if( "positive".equals(type) ) { return new Prediction("3", 6, 0); }
	}
		if( stability >= 36.4 ) { return new Prediction("1", 2, 0); }
	}
		if( stability >= 39.95 ) { return new Prediction("3", 5, 0); }
	}
	if( budget < 37.75 ) { 
	if( stability < 38.2 ) { 
		if( stability >= 37.15 ) { return new Prediction("3", 3, 0); }
	if( stability < 37.15 ) { 
		if( budget < 32 ) { return new Prediction("2", 4, 0); }
	if( budget >= 32 ) { 
		if( budget >= 36.75 ) { return new Prediction("2", 1, 0); }
		if( budget < 36.75 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
		if( stability >= 38.2 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
	}
	}
	if( approval >= 37.5 ) { 
	if( stability < 42.55 ) { 
	if( budget >= 35.85 ) { 
		if( approval >= 42.7 ) { return new Prediction("3", 2, 0); }
	if( approval < 42.7 ) { 
	if( stability >= 40.45 ) { 
		if( budget < 43.85 ) { return new Prediction("3", 1, 0); }
		if( budget >= 43.85 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 40.45 ) { return new Prediction("2", 10, 0); }
	}
	}
	if( budget < 35.85 ) { 
		if( budget >= 31.2 ) { return new Prediction("1", 5, 0); }
		if( budget < 31.2 ) { return new Prediction("2", 5, 0); }
	}
	}
	if( stability >= 42.55 ) { 
		if( stability < 45.65 ) { return new Prediction("1", 4, 0); }
	if( stability >= 45.65 ) { 
		if( budget < 44.95 ) { return new Prediction("2", 14, 0); }
	if( budget >= 44.95 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 5, 0); }
	}
	}
	}
	}
	}
	}
	if( budget >= 66.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 15, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 16, 0); }
	}
	}
	}
	if( approval >= 82.35 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 85.85 ) { 
		if( approval < 84.3 ) { return new Prediction("1", 3, 0); }
		if( approval >= 84.3 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 85.85 ) { return new Prediction("1", 19, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability >= 69.15 ) { return new Prediction("2", 5, 0); }
	if( stability < 69.15 ) { 
		if( budget >= 56.55 ) { return new Prediction("3", 17, 0); }
	if( budget < 56.55 ) { 
		if( approval < 86.35 ) { return new Prediction("3", 2, 0); }
		if( approval >= 86.35 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	}
		if( stability >= 90.7 ) { return new Prediction("3", 21, 0); }
	}
	if( budget < 6.55 ) { 
	if( approval < 9.05 ) { 
	if( stability < 6.95 ) { 
	if( stability >= 4.15 ) { 
	if( stability < 6.1 ) { 
		if( approval < 5.5 ) { return new Prediction("1", 6, 0); }
	if( approval >= 5.5 ) { 
		if( approval >= 7.45 ) { return new Prediction("1", 2, 0); }
		if( approval < 7.45 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( stability >= 6.1 ) { 
		if( approval >= 6.95 ) { return new Prediction("1", 2, 0); }
	if( approval < 6.95 ) { 
		if( stability < 6.8 ) { return new Prediction("3", 5, 0); }
		if( stability >= 6.8 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( stability < 4.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 9, 0); }
	}
	}
		if( stability >= 6.95 ) { return new Prediction("3", 7, 0); }
	}
	if( approval >= 9.05 ) { 
		if( stability < 5.65 ) { return new Prediction("3", 8, 0); }
		if( stability >= 5.65 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( budget < 2.75 ) { 
	if( approval < 6.9 ) { 
	if( budget >= 1.05 ) { 
		if( approval < 2.05 ) { return new Prediction("1", 1, 0); }
		if( approval >= 2.05 ) { return new Prediction("2", 8, 0); }
	}
		if( budget < 1.05 ) { return new Prediction("1", 2, 0); }
	}
	if( approval >= 6.9 ) { 
		if( stability >= 9.35 ) { return new Prediction("3", 1, 0); }
		if( stability < 9.35 ) { return new Prediction("1", 12, 0); }
	}
	}
return null;
}
private Prediction runTree54() {
	if( stability < 91.65 ) { 
	if( approval < 89.65 ) { 
	if( budget < 83.9 ) { 
	if( budget < 45.8 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 36.5 ) { 
	if( stability >= 39.9 ) { 
	if( approval >= 42.5 ) { 
	if( approval >= 67.75 ) { 
		if( approval < 77.3 ) { return new Prediction("3", 3, 0); }
		if( approval >= 77.3 ) { return new Prediction("1", 2, 0); }
	}
	if( approval < 67.75 ) { 
	if( stability >= 56.7 ) { 
		if( approval < 57.45 ) { return new Prediction("3", 1, 0); }
		if( approval >= 57.45 ) { return new Prediction("1", 1, 0); }
	}
		if( stability < 56.7 ) { return new Prediction("1", 7, 0); }
	}
	}
		if( approval < 42.5 ) { return new Prediction("3", 2, 0); }
	}
		if( stability < 39.9 ) { return new Prediction("1", 12, 0); }
	}
	if( approval < 36.5 ) { 
	if( budget >= 6.85 ) { 
		if( stability >= 37.6 ) { return new Prediction("3", 13, 0); }
	if( stability < 37.6 ) { 
	if( approval >= 7.9 ) { 
		if( stability < 5.55 ) { return new Prediction("1", 3, 0); }
	if( stability >= 5.55 ) { 
	if( budget < 31.25 ) { 
	if( approval < 25.6 ) { 
		if( stability >= 19.1 ) { return new Prediction("3", 3, 0); }
	if( stability < 19.1 ) { 
		if( budget >= 9.35 ) { return new Prediction("2", 3, 0); }
		if( budget < 9.35 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval >= 25.6 ) { 
		if( approval >= 34.5 ) { return new Prediction("3", 1, 0); }
		if( approval < 34.5 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( budget >= 31.25 ) { return new Prediction("2", 11, 0); }
	}
	}
		if( approval < 7.9 ) { return new Prediction("2", 9, 0); }
	}
	}
	if( budget < 6.85 ) { 
	if( stability < 3 ) { 
		if( budget < 3.7 ) { return new Prediction("1", 8, 0); }
		if( budget >= 3.7 ) { return new Prediction("2", 2, 0); }
	}
	if( stability >= 3 ) { 
	if( budget < 6.6 ) { 
	if( approval < 7.3 ) { 
		if( stability >= 4.6 ) { return new Prediction("3", 13, 0); }
	if( stability < 4.6 ) { 
		if( approval < 3.8 ) { return new Prediction("3", 1, 0); }
		if( approval >= 3.8 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( approval >= 7.3 ) { 
		if( budget >= 5.25 ) { return new Prediction("3", 2, 0); }
		if( budget < 5.25 ) { return new Prediction("1", 7, 0); }
	}
	}
		if( budget >= 6.6 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 40.15 ) { 
	if( approval >= 2.9 ) { 
	if( budget < 20.6 ) { 
	if( stability >= 4.65 ) { 
		if( approval >= 6.15 ) { return new Prediction("2", 31, 0); }
	if( approval < 6.15 ) { 
		if( budget < 3.65 ) { return new Prediction("2", 2, 0); }
		if( budget >= 3.65 ) { return new Prediction("1", 6, 0); }
	}
	}
	if( stability < 4.65 ) { 
		if( approval >= 4.25 ) { return new Prediction("3", 11, 0); }
	if( approval < 4.25 ) { 
		if( budget >= 4.85 ) { return new Prediction("1", 1, 0); }
		if( budget < 4.85 ) { return new Prediction("2", 8, 0); }
	}
	}
	}
	if( budget >= 20.6 ) { 
		if( approval < 23.05 ) { return new Prediction("1", 3, 0); }
	if( approval >= 23.05 ) { 
	if( stability >= 28.6 ) { 
	if( budget >= 31.95 ) { 
	if( stability >= 36.9 ) { 
		if( budget < 39.35 ) { return new Prediction("2", 3, 0); }
	if( budget >= 39.35 ) { 
		if( approval < 38.5 ) { return new Prediction("1", 2, 0); }
		if( approval >= 38.5 ) { return new Prediction("3", 3, 0); }
	}
	}
		if( stability < 36.9 ) { return new Prediction("3", 8, 0); }
	}
		if( budget < 31.95 ) { return new Prediction("2", 8, 0); }
	}
		if( stability < 28.6 ) { return new Prediction("3", 15, 0); }
	}
	}
	}
		if( approval < 2.9 ) { return new Prediction("1", 7, 0); }
	}
	if( stability >= 40.15 ) { 
	if( approval >= 22.75 ) { 
		if( stability >= 45.25 ) { return new Prediction("2", 23, 0); }
	if( stability < 45.25 ) { 
		if( budget < 40.65 ) { return new Prediction("2", 3, 0); }
	if( budget >= 40.65 ) { 
		if( approval >= 45.5 ) { return new Prediction("2", 1, 0); }
		if( approval < 45.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( approval < 22.75 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( budget >= 45.8 ) { 
	if( stability < 69.2 ) { 
	if( budget < 79.65 ) { 
	if( budget >= 62.85 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 69.35 ) { return new Prediction("1", 3, 0); }
		if( approval < 69.35 ) { return new Prediction("2", 13, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability < 46.65 ) { return new Prediction("3", 5, 0); }
	if( stability >= 46.65 ) { 
		if( approval >= 59.4 ) { return new Prediction("2", 3, 0); }
		if( approval < 59.4 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	if( budget < 62.85 ) { 
	if( budget < 48.45 ) { 
		if( approval < 45 ) { return new Prediction("1", 8, 0); }
	if( approval >= 45 ) { 
		if( stability >= 48.45 ) { return new Prediction("1", 1, 0); }
		if( stability < 48.45 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( budget >= 48.45 ) { 
	if( stability < 34.4 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 64 ) { return new Prediction("2", 1, 0); }
		if( approval >= 64 ) { return new Prediction("1", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 6, 0); }
	}
	if( stability >= 34.4 ) { 
	if( approval < 73.6 ) { 
	if( budget >= 56.2 ) { 
	if( stability < 56.85 ) { 
	if( approval >= 52 ) { 
		if( stability < 54 ) { return new Prediction("3", 2, 0); }
		if( stability >= 54 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 52 ) { return new Prediction("1", 5, 0); }
	}
	if( stability >= 56.85 ) { 
		if( approval < 63.5 ) { return new Prediction("3", 6, 0); }
		if( approval >= 63.5 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( budget < 56.2 ) { 
	if( stability >= 52.95 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 5, 0); }
	}
	if( stability < 52.95 ) { 
	if( approval >= 48.5 ) { 
	if( approval < 55.5 ) { 
	if( stability >= 47.4 ) { 
		if( budget < 52.85 ) { return new Prediction("1", 3, 0); }
		if( budget >= 52.85 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 47.4 ) { return new Prediction("1", 10, 0); }
	}
		if( approval >= 55.5 ) { return new Prediction("2", 3, 0); }
	}
	if( approval < 48.5 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 46.75 ) { return new Prediction("2", 10, 0); }
		if( stability >= 46.75 ) { return new Prediction("1", 1, 0); }
	}
	if( "positive".equals(type) ) { 
	if( approval < 44 ) { 
		if( stability >= 42.4 ) { return new Prediction("1", 5, 0); }
	if( stability < 42.4 ) { 
		if( approval >= 28.25 ) { return new Prediction("3", 1, 0); }
		if( approval < 28.25 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( approval >= 44 ) { 
		if( approval >= 47.5 ) { return new Prediction("3", 2, 0); }
	if( approval < 47.5 ) { 
		if( stability >= 49 ) { return new Prediction("1", 2, 0); }
		if( stability < 49 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( approval >= 73.6 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
	}
		if( budget >= 79.65 ) { return new Prediction("3", 5, 0); }
	}
	if( stability >= 69.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 8, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	if( budget >= 83.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 25, 0); }
	if( "positive".equals(type) ) { 
		if( stability >= 63.7 ) { return new Prediction("1", 8, 0); }
	if( stability < 63.7 ) { 
		if( approval >= 53.65 ) { return new Prediction("3", 2, 0); }
		if( approval < 53.65 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	if( approval >= 89.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 25, 0); }
	if( "positive".equals(type) ) { 
		if( budget < 73.5 ) { return new Prediction("2", 1, 0); }
		if( budget >= 73.5 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( stability >= 91.65 ) { 
		if( approval < 59.25 ) { return new Prediction("3", 7, 0); }
	if( approval >= 59.25 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 1, 0); }
	}
	}
return null;
}
private Prediction runTree55() {
	if( approval >= 34.7 ) { 
	if( approval >= 83.75 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 84.95 ) { 
		if( budget >= 56.65 ) { return new Prediction("3", 1, 0); }
		if( budget < 56.65 ) { return new Prediction("1", 1, 0); }
	}
		if( approval >= 84.95 ) { return new Prediction("1", 19, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability < 60.4 ) { return new Prediction("3", 13, 0); }
		if( stability >= 60.4 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( approval < 83.75 ) { 
	if( budget >= 86.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 18, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 2, 0); }
	}
	if( budget < 86.7 ) { 
	if( budget < 31.55 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 35.7 ) { return new Prediction("3", 7, 0); }
		if( stability < 35.7 ) { return new Prediction("1", 4, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability < 13.9 ) { return new Prediction("3", 1, 0); }
		if( stability >= 13.9 ) { return new Prediction("2", 24, 0); }
	}
	}
	if( budget >= 31.55 ) { 
	if( stability >= 28.5 ) { 
		if( stability < 30.3 ) { return new Prediction("2", 4, 0); }
	if( stability >= 30.3 ) { 
	if( stability < 61.1 ) { 
	if( stability < 55.95 ) { 
	if( budget >= 52.25 ) { 
	if( stability >= 47.1 ) { 
		if( stability < 55 ) { return new Prediction("3", 14, 0); }
		if( stability >= 55 ) { return new Prediction("2", 1, 0); }
	}
	if( stability < 47.1 ) { 
	if( budget >= 64.45 ) { 
		if( approval < 55.75 ) { return new Prediction("3", 1, 0); }
		if( approval >= 55.75 ) { return new Prediction("2", 2, 0); }
	}
		if( budget < 64.45 ) { return new Prediction("2", 6, 0); }
	}
	}
	if( budget < 52.25 ) { 
	if( approval < 55.5 ) { 
	if( stability >= 50.4 ) { 
	if( approval >= 47.5 ) { 
		if( stability < 52.75 ) { return new Prediction("1", 3, 0); }
		if( stability >= 52.75 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("1", 4, 0); }
	}
	if( stability < 50.4 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 41.3 ) { 
	if( approval >= 42 ) { 
		if( stability < 46.75 ) { return new Prediction("1", 10, 0); }
	if( stability >= 46.75 ) { 
		if( approval >= 48.5 ) { return new Prediction("3", 1, 0); }
		if( approval < 48.5 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( approval < 42 ) { return new Prediction("3", 7, 0); }
	}
	if( stability < 41.3 ) { 
	if( budget < 38.55 ) { 
	if( stability >= 35.95 ) { 
		if( approval >= 42.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 42.5 ) { return new Prediction("3", 2, 0); }
	}
		if( stability < 35.95 ) { return new Prediction("1", 5, 0); }
	}
	if( budget >= 38.55 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 3, 0); }
		if( approval < 48.5 ) { return new Prediction("2", 10, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 37.5 ) { 
	if( budget < 45.45 ) { 
		if( stability >= 42.95 ) { return new Prediction("2", 7, 0); }
	if( stability < 42.95 ) { 
	if( approval < 37.5 ) { 
		if( budget < 35.2 ) { return new Prediction("2", 1, 0); }
		if( budget >= 35.2 ) { return new Prediction("1", 11, 0); }
	}
	if( approval >= 37.5 ) { 
	if( stability >= 38.55 ) { 
		if( budget < 40.65 ) { return new Prediction("2", 3, 0); }
		if( budget >= 40.65 ) { return new Prediction("3", 1, 0); }
	}
		if( stability < 38.55 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	if( budget >= 45.45 ) { 
		if( approval >= 42.5 ) { return new Prediction("3", 10, 0); }
		if( approval < 42.5 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( stability < 37.5 ) { return new Prediction("3", 13, 0); }
	}
	}
	}
		if( approval >= 55.5 ) { return new Prediction("2", 6, 0); }
	}
	}
	if( stability >= 55.95 ) { 
		if( approval < 41.85 ) { return new Prediction("2", 1, 0); }
	if( approval >= 41.85 ) { 
		if( stability >= 60.15 ) { return new Prediction("1", 5, 0); }
	if( stability < 60.15 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 56.4 ) { 
		if( approval < 49.5 ) { return new Prediction("3", 2, 0); }
		if( approval >= 49.5 ) { return new Prediction("1", 3, 0); }
	}
	if( stability >= 56.4 ) { 
		if( approval >= 64.8 ) { return new Prediction("1", 1, 0); }
		if( approval < 64.8 ) { return new Prediction("3", 8, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( approval >= 61.1 ) { return new Prediction("3", 1, 0); }
		if( approval < 61.1 ) { return new Prediction("1", 6, 0); }
	}
	}
	}
	}
	}
	if( stability >= 61.1 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 66.7 ) { 
	if( stability < 72.5 ) { 
		if( budget < 67.05 ) { return new Prediction("3", 3, 0); }
		if( budget >= 67.05 ) { return new Prediction("2", 1, 0); }
	}
		if( stability >= 72.5 ) { return new Prediction("3", 14, 0); }
	}
		if( stability < 66.7 ) { return new Prediction("2", 7, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget < 61.35 ) { return new Prediction("2", 7, 0); }
		if( budget >= 61.35 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	}
	if( stability < 28.5 ) { 
		if( budget < 63.5 ) { return new Prediction("3", 13, 0); }
	if( budget >= 63.5 ) { 
		if( budget >= 72.1 ) { return new Prediction("3", 3, 0); }
		if( budget < 72.1 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( approval < 34.7 ) { 
	if( budget >= 65.5 ) { 
		if( stability < 38.3 ) { return new Prediction("2", 3, 0); }
		if( stability >= 38.3 ) { return new Prediction("1", 17, 0); }
	}
	if( budget < 65.5 ) { 
		if( budget >= 37.25 ) { return new Prediction("3", 9, 0); }
	if( budget < 37.25 ) { 
	if( budget < 7.35 ) { 
	if( approval < 9.85 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 6.25 ) { 
		if( approval >= 6.25 ) { return new Prediction("1", 7, 0); }
		if( approval < 6.25 ) { return new Prediction("2", 1, 0); }
	}
	if( budget < 6.25 ) { 
	if( approval < 7.35 ) { 
		if( stability >= 4.45 ) { return new Prediction("3", 9, 0); }
	if( stability < 4.45 ) { 
		if( approval >= 2.55 ) { return new Prediction("1", 7, 0); }
		if( approval < 2.55 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( approval >= 7.35 ) { return new Prediction("1", 18, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 6.2 ) { 
	if( approval < 5.1 ) { 
		if( budget < 2.5 ) { return new Prediction("2", 2, 0); }
		if( budget >= 2.5 ) { return new Prediction("1", 8, 0); }
	}
		if( approval >= 5.1 ) { return new Prediction("3", 4, 0); }
	}
	if( stability >= 6.2 ) { 
		if( approval >= 5.55 ) { return new Prediction("2", 9, 0); }
		if( approval < 5.55 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
		if( approval >= 9.85 ) { return new Prediction("3", 4, 0); }
	}
	if( budget >= 7.35 ) { 
	if( stability < 18.55 ) { 
	if( budget < 8.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 4, 0); }
	}
	if( budget >= 8.4 ) { 
		if( budget >= 9 ) { return new Prediction("2", 9, 0); }
	if( budget < 9 ) { 
		if( stability >= 12.3 ) { return new Prediction("3", 1, 0); }
		if( stability < 12.3 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	if( stability >= 18.55 ) { 
	if( stability < 87.85 ) { 
		if( budget >= 35.55 ) { return new Prediction("1", 6, 0); }
	if( budget < 35.55 ) { 
	if( budget >= 13.25 ) { 
		if( approval < 18.15 ) { return new Prediction("1", 5, 0); }
	if( approval >= 18.15 ) { 
	if( approval >= 32.95 ) { 
		if( stability >= 22.85 ) { return new Prediction("1", 3, 0); }
		if( stability < 22.85 ) { return new Prediction("3", 2, 0); }
	}
	if( approval < 32.95 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 26.75 ) { return new Prediction("3", 4, 0); }
	if( stability < 26.75 ) { 
		if( budget < 26.2 ) { return new Prediction("1", 1, 0); }
		if( budget >= 26.2 ) { return new Prediction("2", 2, 0); }
	}
	}
		if( "positive".equals(type) ) { return new Prediction("2", 8, 0); }
	}
	}
	}
		if( budget < 13.25 ) { return new Prediction("1", 4, 0); }
	}
	}
		if( stability >= 87.85 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree56() {
	if( stability >= 79.95 ) { 
	if( budget < 89.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 29, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 8, 0); }
	}
		if( budget >= 89.1 ) { return new Prediction("1", 2, 0); }
	}
	if( stability < 79.95 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 69.95 ) { 
	if( approval < 62.2 ) { 
	if( stability < 56.65 ) { 
		if( budget >= 58.85 ) { return new Prediction("2", 5, 0); }
	if( budget < 58.85 ) { 
	if( approval < 7.35 ) { 
	if( stability >= 4.45 ) { 
	if( approval < 2.6 ) { 
		if( budget >= 5.3 ) { return new Prediction("2", 1, 0); }
		if( budget < 5.3 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 2.6 ) { return new Prediction("3", 8, 0); }
	}
	if( stability < 4.45 ) { 
		if( stability < 1.3 ) { return new Prediction("1", 2, 0); }
	if( stability >= 1.3 ) { 
		if( approval < 5.35 ) { return new Prediction("2", 7, 0); }
	if( approval >= 5.35 ) { 
		if( approval >= 6.25 ) { return new Prediction("2", 2, 0); }
		if( approval < 6.25 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( approval >= 7.35 ) { 
	if( budget >= 19.7 ) { 
	if( stability < 49.4 ) { 
	if( approval < 37.5 ) { 
	if( stability >= 33.8 ) { 
	if( budget >= 41.1 ) { 
		if( stability >= 41.65 ) { return new Prediction("3", 1, 0); }
		if( stability < 41.65 ) { return new Prediction("2", 1, 0); }
	}
		if( budget < 41.1 ) { return new Prediction("3", 11, 0); }
	}
	if( stability < 33.8 ) { 
		if( budget >= 32.6 ) { return new Prediction("2", 5, 0); }
	if( budget < 32.6 ) { 
	if( approval < 21 ) { 
		if( stability >= 19.1 ) { return new Prediction("3", 2, 0); }
		if( stability < 19.1 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 21 ) { return new Prediction("1", 6, 0); }
	}
	}
	}
	if( approval >= 37.5 ) { 
		if( budget < 43.95 ) { return new Prediction("1", 20, 0); }
	if( budget >= 43.95 ) { 
	if( approval >= 47.5 ) { 
		if( budget >= 52.4 ) { return new Prediction("2", 1, 0); }
	if( budget < 52.4 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 13, 0); }
	if( approval < 48.5 ) { 
		if( stability >= 44.3 ) { return new Prediction("1", 5, 0); }
		if( stability < 44.3 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
		if( approval < 47.5 ) { return new Prediction("2", 8, 0); }
	}
	}
	}
	if( stability >= 49.4 ) { 
		if( approval >= 51 ) { return new Prediction("1", 4, 0); }
		if( approval < 51 ) { return new Prediction("3", 5, 0); }
	}
	}
	if( budget < 19.7 ) { 
		if( budget < 16.65 ) { return new Prediction("1", 27, 0); }
	if( budget >= 16.65 ) { 
		if( approval >= 15 ) { return new Prediction("1", 6, 0); }
		if( approval < 15 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
	if( stability >= 56.65 ) { 
		if( budget < 66.7 ) { return new Prediction("3", 13, 0); }
		if( budget >= 66.7 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( approval >= 62.2 ) { 
	if( stability >= 72.9 ) { 
		if( approval < 77.3 ) { return new Prediction("3", 2, 0); }
		if( approval >= 77.3 ) { return new Prediction("1", 3, 0); }
	}
		if( stability < 72.9 ) { return new Prediction("1", 26, 0); }
	}
	}
	if( budget >= 69.95 ) { 
		if( approval >= 86.95 ) { return new Prediction("1", 1, 0); }
		if( approval < 86.95 ) { return new Prediction("2", 34, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 44.6 ) { 
	if( budget >= 41.9 ) { 
		if( stability >= 25.75 ) { return new Prediction("1", 40, 0); }
		if( stability < 25.75 ) { return new Prediction("3", 2, 0); }
	}
	if( budget < 41.9 ) { 
	if( approval < 37.5 ) { 
	if( budget >= 37.75 ) { 
		if( stability >= 35.25 ) { return new Prediction("1", 9, 0); }
		if( stability < 35.25 ) { return new Prediction("3", 5, 0); }
	}
	if( budget < 37.75 ) { 
	if( stability >= 3.55 ) { 
	if( budget >= 23.4 ) { 
	if( approval >= 31.5 ) { 
		if( stability >= 35.5 ) { return new Prediction("2", 4, 0); }
	if( stability < 35.5 ) { 
	if( budget < 32 ) { 
		if( approval >= 34.5 ) { return new Prediction("2", 2, 0); }
		if( approval < 34.5 ) { return new Prediction("3", 2, 0); }
	}
		if( budget >= 32 ) { return new Prediction("3", 8, 0); }
	}
	}
	if( approval < 31.5 ) { 
		if( budget >= 28.2 ) { return new Prediction("1", 4, 0); }
		if( budget < 28.2 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( budget < 23.4 ) { 
		if( stability >= 7.95 ) { return new Prediction("2", 7, 0); }
	if( stability < 7.95 ) { 
	if( stability >= 4.7 ) { 
	if( approval >= 4.25 ) { 
		if( approval >= 5.05 ) { return new Prediction("2", 3, 0); }
	if( approval < 5.05 ) { 
		if( approval >= 4.45 ) { return new Prediction("1", 1, 0); }
		if( approval < 4.45 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( approval < 4.25 ) { return new Prediction("1", 4, 0); }
	}
		if( stability < 4.7 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( stability < 3.55 ) { 
		if( budget < 2.2 ) { return new Prediction("2", 1, 0); }
	if( budget >= 2.2 ) { 
		if( approval < 2.75 ) { return new Prediction("1", 1, 0); }
		if( approval >= 2.75 ) { return new Prediction("3", 13, 0); }
	}
	}
	}
	}
	if( approval >= 37.5 ) { 
	if( budget >= 39.95 ) { 
		if( stability >= 42 ) { return new Prediction("2", 1, 0); }
		if( stability < 42 ) { return new Prediction("3", 2, 0); }
	}
		if( budget < 39.95 ) { return new Prediction("2", 13, 0); }
	}
	}
	}
	if( approval >= 44.6 ) { 
	if( budget < 45.8 ) { 
	if( stability < 38.1 ) { 
		if( budget >= 19.25 ) { return new Prediction("3", 9, 0); }
		if( budget < 19.25 ) { return new Prediction("2", 3, 0); }
	}
		if( stability >= 38.1 ) { return new Prediction("2", 18, 0); }
	}
	if( budget >= 45.8 ) { 
	if( budget >= 53.65 ) { 
		if( stability < 64.75 ) { return new Prediction("3", 29, 0); }
		if( stability >= 64.75 ) { return new Prediction("2", 2, 0); }
	}
	if( budget < 53.65 ) { 
		if( approval >= 52.1 ) { return new Prediction("1", 2, 0); }
	if( approval < 52.1 ) { 
		if( stability >= 49.65 ) { return new Prediction("1", 3, 0); }
		if( stability < 49.65 ) { return new Prediction("3", 10, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree57() {
	if( stability < 90.35 ) { 
	if( approval >= 82.9 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 85.3 ) { return new Prediction("1", 15, 0); }
	if( approval < 85.3 ) { 
		if( approval >= 83.55 ) { return new Prediction("2", 1, 0); }
		if( approval < 83.55 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( budget >= 36.2 ) { return new Prediction("3", 4, 0); }
		if( budget < 36.2 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( approval < 82.9 ) { 
	if( approval < 36.15 ) { 
	if( budget >= 56.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 10, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 21, 0); }
	}
	if( budget < 56.9 ) { 
	if( budget < 7.3 ) { 
	if( approval < 9.5 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 5.25 ) { 
	if( approval >= 3.65 ) { 
		if( approval >= 4.55 ) { return new Prediction("3", 1, 0); }
		if( approval < 4.55 ) { return new Prediction("2", 2, 0); }
	}
	if( approval < 3.65 ) { 
		if( stability >= 2.9 ) { return new Prediction("3", 8, 0); }
		if( stability < 2.9 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( approval >= 5.25 ) { 
	if( budget >= 5.25 ) { 
		if( stability >= 9.05 ) { return new Prediction("3", 2, 0); }
	if( stability < 9.05 ) { 
		if( budget < 6 ) { return new Prediction("3", 1, 0); }
		if( budget >= 6 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( budget < 5.25 ) { 
		if( stability >= 9.35 ) { return new Prediction("3", 1, 0); }
	if( stability < 9.35 ) { 
		if( approval >= 6.7 ) { return new Prediction("1", 19, 0); }
	if( approval < 6.7 ) { 
		if( budget >= 3.95 ) { return new Prediction("1", 3, 0); }
		if( budget < 3.95 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 2.9 ) { 
	if( stability < 3.45 ) { 
		if( approval < 3.8 ) { return new Prediction("1", 1, 0); }
		if( approval >= 3.8 ) { return new Prediction("3", 6, 0); }
	}
	if( stability >= 3.45 ) { 
	if( budget >= 4.15 ) { 
		if( approval < 5.35 ) { return new Prediction("1", 7, 0); }
	if( approval >= 5.35 ) { 
		if( approval >= 8.65 ) { return new Prediction("2", 3, 0); }
	if( approval < 8.65 ) { 
		if( approval >= 6.75 ) { return new Prediction("3", 1, 0); }
		if( approval < 6.75 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
		if( budget < 4.15 ) { return new Prediction("2", 10, 0); }
	}
	}
		if( approval < 2.9 ) { return new Prediction("1", 16, 0); }
	}
	}
		if( approval >= 9.5 ) { return new Prediction("3", 6, 0); }
	}
	if( budget >= 7.3 ) { 
		if( approval < 5.5 ) { return new Prediction("2", 8, 0); }
	if( approval >= 5.5 ) { 
	if( stability >= 37.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 6, 0); }
	if( "positive".equals(type) ) { 
	if( budget < 38.2 ) { 
		if( approval < 30.75 ) { return new Prediction("1", 2, 0); }
		if( approval >= 30.75 ) { return new Prediction("2", 1, 0); }
	}
		if( budget >= 38.2 ) { return new Prediction("1", 9, 0); }
	}
	}
	if( stability < 37.65 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 33.9 ) { 
	if( stability < 27.75 ) { 
		if( approval >= 21.5 ) { return new Prediction("1", 8, 0); }
	if( approval < 21.5 ) { 
		if( stability < 1.2 ) { return new Prediction("1", 2, 0); }
		if( stability >= 1.2 ) { return new Prediction("2", 4, 0); }
	}
	}
		if( stability >= 27.75 ) { return new Prediction("3", 4, 0); }
	}
		if( budget >= 33.9 ) { return new Prediction("2", 9, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 32.8 ) { 
	if( approval >= 6.5 ) { 
	if( budget >= 28.45 ) { 
		if( approval >= 27.05 ) { return new Prediction("2", 1, 0); }
		if( approval < 27.05 ) { return new Prediction("1", 1, 0); }
	}
	if( budget < 28.45 ) { 
	if( approval >= 10.5 ) { 
		if( budget < 14.75 ) { return new Prediction("2", 3, 0); }
	if( budget >= 14.75 ) { 
		if( approval < 21 ) { return new Prediction("3", 3, 0); }
	if( approval >= 21 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 4, 0); }
	if( budget >= 25.7 ) { 
	if( approval < 30.5 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 2, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 3, 0); }
	}
		if( approval >= 30.5 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
		if( approval < 10.5 ) { return new Prediction("3", 2, 0); }
	}
	}
		if( approval < 6.5 ) { return new Prediction("1", 2, 0); }
	}
	if( budget >= 32.8 ) { 
		if( budget >= 39.8 ) { return new Prediction("3", 6, 0); }
	if( budget < 39.8 ) { 
		if( budget >= 38.4 ) { return new Prediction("1", 2, 0); }
	if( budget < 38.4 ) { 
		if( approval < 32.5 ) { return new Prediction("1", 1, 0); }
		if( approval >= 32.5 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
	}
	if( approval >= 36.15 ) { 
	if( stability >= 41.3 ) { 
	if( budget < 91.3 ) { 
	if( approval >= 41.35 ) { 
	if( approval < 45.9 ) { 
		if( budget < 44.95 ) { return new Prediction("2", 9, 0); }
	if( budget >= 44.95 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 2, 0); }
	}
	}
	if( approval >= 45.9 ) { 
	if( approval >= 71.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 8, 0); }
	if( "positive".equals(type) ) { 
		if( stability >= 63.7 ) { return new Prediction("2", 8, 0); }
	if( stability < 63.7 ) { 
		if( stability < 59.2 ) { return new Prediction("2", 2, 0); }
		if( stability >= 59.2 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( approval < 71.15 ) { 
	if( stability < 47.7 ) { 
	if( budget < 52.3 ) { 
	if( budget < 45.55 ) { 
		if( approval >= 47.5 ) { return new Prediction("2", 5, 0); }
		if( approval < 47.5 ) { return new Prediction("1", 1, 0); }
	}
	if( budget >= 45.55 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 9, 0); }
	if( approval < 48.5 ) { 
	if( approval >= 47.5 ) { 
		if( budget < 49.85 ) { return new Prediction("1", 2, 0); }
		if( budget >= 49.85 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("2", 2, 0); }
	}
	}
		if( "positive".equals(type) ) { return new Prediction("3", 7, 0); }
	}
	}
	if( budget >= 52.3 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 8, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 1, 0); }
	}
	}
	if( stability >= 47.7 ) { 
	if( approval < 47.3 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 4, 0); }
	}
	if( approval >= 47.3 ) { 
	if( stability >= 60.3 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 69.2 ) { 
		if( budget < 55.55 ) { return new Prediction("3", 1, 0); }
		if( budget >= 55.55 ) { return new Prediction("2", 5, 0); }
	}
		if( stability >= 69.2 ) { return new Prediction("3", 12, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget < 61.35 ) { return new Prediction("2", 6, 0); }
		if( budget >= 61.35 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( stability < 60.3 ) { 
	if( stability >= 50.4 ) { 
	if( approval >= 51.5 ) { 
	if( stability < 57.8 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 68.05 ) { return new Prediction("1", 8, 0); }
		if( approval >= 68.05 ) { return new Prediction("2", 1, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget >= 56.2 ) { return new Prediction("3", 3, 0); }
	if( budget < 56.2 ) { 
		if( budget < 52.45 ) { return new Prediction("2", 1, 0); }
		if( budget >= 52.45 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( stability >= 57.8 ) { return new Prediction("3", 3, 0); }
	}
		if( approval < 51.5 ) { return new Prediction("3", 5, 0); }
	}
	if( stability < 50.4 ) { 
	if( stability < 48.85 ) { 
		if( budget >= 57.85 ) { return new Prediction("3", 3, 0); }
		if( budget < 57.85 ) { return new Prediction("2", 2, 0); }
	}
		if( stability >= 48.85 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( approval < 41.35 ) { 
		if( approval < 37.7 ) { return new Prediction("3", 3, 0); }
	if( approval >= 37.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 6, 0); }
	}
	}
	}
		if( budget >= 91.3 ) { return new Prediction("2", 8, 0); }
	}
	if( stability < 41.3 ) { 
	if( budget < 48.65 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 37.5 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 2, 0); }
		if( budget < 39.15 ) { return new Prediction("2", 3, 1); }
	}
	if( approval >= 37.5 ) { 
		if( stability >= 40.45 ) { return new Prediction("3", 2, 0); }
		if( stability < 40.45 ) { return new Prediction("1", 7, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 28.5 ) { 
	if( budget >= 39.8 ) { 
		if( budget < 40.75 ) { return new Prediction("1", 1, 0); }
	if( budget >= 40.75 ) { 
		if( approval < 38.5 ) { return new Prediction("1", 1, 0); }
		if( approval >= 38.5 ) { return new Prediction("3", 2, 0); }
	}
	}
		if( budget < 39.8 ) { return new Prediction("2", 13, 0); }
	}
	if( stability < 28.5 ) { 
		if( budget < 18.95 ) { return new Prediction("2", 2, 0); }
		if( budget >= 18.95 ) { return new Prediction("3", 7, 0); }
	}
	}
	}
	if( budget >= 48.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 20, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	}
	if( stability >= 90.35 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 13, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 5, 0); }
	}
return null;
}
private Prediction runTree58() {
	if( stability >= 85.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 18, 0); }
	if( "positive".equals(type) ) { 
		if( approval >= 50.9 ) { return new Prediction("2", 1, 0); }
		if( approval < 50.9 ) { return new Prediction("1", 4, 0); }
	}
	}
	if( stability < 85.65 ) { 
	if( budget >= 72.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 36, 0); }
	if( "positive".equals(type) ) { 
		if( approval >= 73.25 ) { return new Prediction("3", 13, 0); }
	if( approval < 73.25 ) { 
		if( approval < 45.2 ) { return new Prediction("1", 9, 0); }
	if( approval >= 45.2 ) { 
		if( approval < 61.6 ) { return new Prediction("3", 1, 0); }
		if( approval >= 61.6 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( budget < 72.45 ) { 
	if( approval >= 71.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 23, 0); }
	if( "positive".equals(type) ) { 
		if( stability >= 33.25 ) { return new Prediction("2", 17, 0); }
	if( stability < 33.25 ) { 
		if( budget < 34.4 ) { return new Prediction("2", 1, 0); }
		if( budget >= 34.4 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	if( approval < 71.15 ) { 
	if( approval >= 44.1 ) { 
	if( stability < 33.85 ) { 
	if( stability >= 17.45 ) { 
		if( approval >= 49.35 ) { return new Prediction("2", 4, 0); }
		if( approval < 49.35 ) { return new Prediction("3", 1, 0); }
	}
		if( stability < 17.45 ) { return new Prediction("3", 6, 0); }
	}
	if( stability >= 33.85 ) { 
	if( budget >= 38.7 ) { 
	if( stability >= 54.85 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 69 ) { 
		if( stability < 56.4 ) { return new Prediction("1", 3, 0); }
		if( stability >= 56.4 ) { return new Prediction("3", 9, 0); }
	}
		if( approval >= 69 ) { return new Prediction("1", 2, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval >= 57.9 ) { return new Prediction("2", 2, 0); }
		if( approval < 57.9 ) { return new Prediction("1", 12, 0); }
	}
	}
	if( stability < 54.85 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 48.5 ) { 
		if( approval >= 52 ) { return new Prediction("1", 5, 0); }
	if( approval < 52 ) { 
	if( approval < 50.5 ) { 
		if( stability >= 48 ) { return new Prediction("3", 2, 0); }
		if( stability < 48 ) { return new Prediction("1", 6, 0); }
	}
		if( approval >= 50.5 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( approval < 48.5 ) { 
	if( stability < 48.75 ) { 
		if( budget >= 45 ) { return new Prediction("2", 3, 0); }
		if( budget < 45 ) { return new Prediction("1", 1, 0); }
	}
		if( stability >= 48.75 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 51.4 ) { 
	if( budget < 52.75 ) { 
		if( approval >= 52 ) { return new Prediction("2", 4, 0); }
		if( approval < 52 ) { return new Prediction("1", 1, 0); }
	}
		if( budget >= 52.75 ) { return new Prediction("3", 2, 0); }
	}
		if( stability < 51.4 ) { return new Prediction("3", 23, 0); }
	}
	}
	}
	if( budget < 38.7 ) { 
	if( stability >= 60.65 ) { 
		if( approval < 69.75 ) { return new Prediction("2", 2, 0); }
		if( approval >= 69.75 ) { return new Prediction("3", 1, 0); }
	}
	if( stability < 60.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 12, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	if( approval < 44.1 ) { 
	if( budget < 45.45 ) { 
	if( budget < 7.3 ) { 
	if( stability < 9.15 ) { 
	if( stability >= 7.35 ) { 
		if( approval >= 8.75 ) { return new Prediction("1", 1, 0); }
		if( approval < 8.75 ) { return new Prediction("2", 5, 0); }
	}
	if( stability < 7.35 ) { 
	if( stability >= 4.15 ) { 
	if( budget >= 5.25 ) { 
		if( stability >= 6.6 ) { return new Prediction("3", 4, 0); }
	if( stability < 6.6 ) { 
	if( approval >= 4.05 ) { 
		if( approval >= 6.85 ) { return new Prediction("1", 2, 0); }
		if( approval < 6.85 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 4.05 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( budget < 5.25 ) { 
		if( approval >= 9.45 ) { return new Prediction("2", 2, 0); }
	if( approval < 9.45 ) { 
		if( budget < 1.45 ) { return new Prediction("2", 1, 0); }
		if( budget >= 1.45 ) { return new Prediction("1", 16, 0); }
	}
	}
	}
	if( stability < 4.15 ) { 
	if( approval < 4.3 ) { 
		if( approval >= 3.35 ) { return new Prediction("2", 7, 0); }
	if( approval < 3.35 ) { 
		if( stability >= 3.5 ) { return new Prediction("2", 1, 0); }
	if( stability < 3.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( approval >= 4.3 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 7, 0); }
	}
	}
	}
	}
		if( stability >= 9.15 ) { return new Prediction("3", 6, 0); }
	}
	if( budget >= 7.3 ) { 
	if( stability < 34.05 ) { 
		if( stability < 13.8 ) { return new Prediction("2", 21, 0); }
	if( stability >= 13.8 ) { 
	if( budget >= 37.75 ) { 
	if( approval >= 25.25 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 4, 0); }
	}
		if( approval < 25.25 ) { return new Prediction("2", 2, 0); }
	}
	if( budget < 37.75 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 21 ) { return new Prediction("3", 3, 0); }
		if( approval >= 21 ) { return new Prediction("1", 13, 0); }
	}
	if( "positive".equals(type) ) { 
	if( approval >= 33 ) { 
	if( approval < 37.5 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 1, 0); }
		if( budget < 31.95 ) { return new Prediction("2", 3, 0); }
	}
		if( approval >= 37.5 ) { return new Prediction("2", 4, 0); }
	}
	if( approval < 33 ) { 
	if( budget < 26.75 ) { 
		if( approval < 16.05 ) { return new Prediction("1", 2, 0); }
		if( approval >= 16.05 ) { return new Prediction("2", 4, 0); }
	}
		if( budget >= 26.75 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
	}
	}
	if( stability >= 34.05 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 39.85 ) { return new Prediction("3", 19, 0); }
	if( stability < 39.85 ) { 
		if( budget < 33.9 ) { return new Prediction("3", 6, 0); }
	if( budget >= 33.9 ) { 
		if( approval < 35.5 ) { return new Prediction("3", 1, 0); }
		if( approval >= 35.5 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( stability >= 42.95 ) { return new Prediction("2", 15, 0); }
	if( stability < 42.95 ) { 
		if( budget < 36.85 ) { return new Prediction("2", 6, 0); }
	if( budget >= 36.85 ) { 
		if( approval >= 39.5 ) { return new Prediction("3", 4, 0); }
		if( approval < 39.5 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( budget >= 45.45 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 21.15 ) { return new Prediction("3", 4, 0); }
		if( approval >= 21.15 ) { return new Prediction("2", 11, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability < 40.4 ) { 
		if( stability < 39.7 ) { return new Prediction("1", 5, 0); }
		if( stability >= 39.7 ) { return new Prediction("3", 2, 0); }
	}
		if( stability >= 40.4 ) { return new Prediction("1", 21, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree59() {
	if( approval >= 35.2 ) { 
	if( approval < 83.45 ) { 
	if( budget < 93.3 ) { 
	if( budget < 56.4 ) { 
	if( budget < 48.95 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 41.25 ) { 
	if( stability >= 37.15 ) { 
		if( approval < 46 ) { return new Prediction("3", 15, 0); }
	if( approval >= 46 ) { 
		if( approval >= 67.75 ) { return new Prediction("3", 3, 0); }
	if( approval < 67.75 ) { 
		if( stability < 63.1 ) { return new Prediction("1", 5, 0); }
		if( stability >= 63.1 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	if( stability < 37.15 ) { 
		if( approval >= 36.5 ) { return new Prediction("1", 5, 0); }
		if( approval < 36.5 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( budget >= 41.25 ) { 
	if( approval >= 47.5 ) { 
	if( approval >= 50 ) { 
		if( budget < 44.35 ) { return new Prediction("1", 1, 0); }
		if( budget >= 44.35 ) { return new Prediction("3", 3, 0); }
	}
		if( approval < 50 ) { return new Prediction("1", 4, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("2", 8, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 39.15 ) { 
	if( budget >= 31.95 ) { 
	if( stability >= 37.5 ) { 
		if( approval >= 40.5 ) { return new Prediction("3", 8, 0); }
		if( approval < 40.5 ) { return new Prediction("1", 2, 0); }
	}
		if( stability < 37.5 ) { return new Prediction("3", 12, 0); }
	}
	if( budget < 31.95 ) { 
		if( stability >= 28.65 ) { return new Prediction("2", 12, 0); }
	if( stability < 28.65 ) { 
		if( budget >= 19.85 ) { return new Prediction("3", 2, 0); }
		if( budget < 19.85 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( stability >= 39.15 ) { 
	if( budget < 45.8 ) { 
	if( approval < 40.85 ) { 
		if( budget < 38.2 ) { return new Prediction("2", 6, 0); }
		if( budget >= 38.2 ) { return new Prediction("1", 2, 0); }
	}
		if( approval >= 40.85 ) { return new Prediction("2", 37, 0); }
	}
	if( budget >= 45.8 ) { 
		if( stability >= 60 ) { return new Prediction("2", 2, 0); }
	if( stability < 60 ) { 
		if( approval < 45 ) { return new Prediction("1", 1, 0); }
		if( approval >= 45 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	if( budget >= 48.95 ) { 
	if( stability < 42.75 ) { 
		if( approval < 65.2 ) { return new Prediction("2", 6, 0); }
		if( approval >= 65.2 ) { return new Prediction("3", 1, 0); }
	}
	if( stability >= 42.75 ) { 
	if( approval < 45 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 5, 0); }
	}
	if( approval >= 45 ) { 
	if( approval >= 48.5 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 52.85 ) { return new Prediction("1", 9, 0); }
		if( budget >= 52.85 ) { return new Prediction("2", 1, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 51.4 ) { 
		if( budget >= 50.85 ) { return new Prediction("1", 1, 0); }
		if( budget < 50.85 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 51.4 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( approval < 48.5 ) { 
		if( budget >= 51.8 ) { return new Prediction("2", 1, 0); }
	if( budget < 51.8 ) { 
	if( stability >= 51.5 ) { 
		if( approval >= 47.5 ) { return new Prediction("3", 1, 0); }
		if( approval < 47.5 ) { return new Prediction("1", 2, 0); }
	}
		if( stability < 51.5 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	}
	}
	if( budget >= 56.4 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 60.8 ) { 
		if( approval < 64.15 ) { return new Prediction("3", 11, 0); }
		if( approval >= 64.15 ) { return new Prediction("1", 1, 0); }
	}
	if( budget >= 60.8 ) { 
		if( stability < 75.6 ) { return new Prediction("2", 17, 0); }
		if( stability >= 75.6 ) { return new Prediction("3", 13, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( approval >= 66.5 ) { return new Prediction("3", 9, 0); }
	if( approval < 66.5 ) { 
	if( stability >= 52.2 ) { 
		if( stability < 88.55 ) { return new Prediction("1", 6, 0); }
		if( stability >= 88.55 ) { return new Prediction("2", 1, 0); }
	}
	if( stability < 52.2 ) { 
		if( approval < 42.05 ) { return new Prediction("1", 1, 0); }
		if( approval >= 42.05 ) { return new Prediction("3", 12, 0); }
	}
	}
	}
	}
	}
		if( budget >= 93.3 ) { return new Prediction("2", 8, 0); }
	}
	if( approval >= 83.45 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 93.9 ) { 
	if( budget >= 70.65 ) { 
		if( budget < 81.1 ) { return new Prediction("3", 1, 0); }
		if( budget >= 81.1 ) { return new Prediction("1", 2, 0); }
	}
		if( budget < 70.65 ) { return new Prediction("1", 15, 0); }
	}
		if( budget >= 93.9 ) { return new Prediction("2", 1, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability < 55.75 ) { return new Prediction("3", 5, 0); }
		if( stability >= 55.75 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	if( approval < 35.2 ) { 
	if( budget >= 65.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 16, 0); }
	}
	if( budget < 65.5 ) { 
	if( approval < 6.9 ) { 
	if( budget >= 5.95 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 8, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 3, 0); }
	}
	if( budget < 5.95 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 4.6 ) { return new Prediction("3", 16, 0); }
	if( stability < 4.6 ) { 
		if( approval < 3.75 ) { return new Prediction("3", 2, 0); }
		if( approval >= 3.75 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( approval < 2.7 ) { return new Prediction("1", 2, 0); }
	if( approval >= 2.7 ) { 
		if( stability >= 2.85 ) { return new Prediction("2", 10, 0); }
		if( stability < 2.85 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	if( approval >= 6.9 ) { 
		if( stability < 2.55 ) { return new Prediction("1", 8, 0); }
	if( stability >= 2.55 ) { 
	if( budget < 3.55 ) { 
		if( approval < 7.35 ) { return new Prediction("3", 1, 0); }
		if( approval >= 7.35 ) { return new Prediction("1", 10, 0); }
	}
	if( budget >= 3.55 ) { 
	if( stability >= 4.6 ) { 
	if( stability >= 31.85 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 14, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 30.75 ) { return new Prediction("1", 14, 0); }
	if( approval >= 30.75 ) { 
		if( budget < 33.85 ) { return new Prediction("2", 3, 0); }
	if( budget >= 33.85 ) { 
		if( stability < 35.9 ) { return new Prediction("3", 3, 0); }
		if( stability >= 35.9 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	if( stability < 31.85 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 25.9 ) { return new Prediction("1", 9, 0); }
	if( approval < 25.9 ) { 
	if( stability >= 8.55 ) { 
	if( budget >= 16 ) { 
		if( stability >= 19.25 ) { return new Prediction("1", 1, 0); }
		if( stability < 19.25 ) { return new Prediction("2", 3, 0); }
	}
	if( budget < 16 ) { 
		if( budget < 10.05 ) { return new Prediction("3", 3, 0); }
	if( budget >= 10.05 ) { 
		if( approval < 14.4 ) { return new Prediction("2", 1, 0); }
		if( approval >= 14.4 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
		if( stability < 8.55 ) { return new Prediction("1", 8, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 16.5 ) { 
		if( stability < 19.2 ) { return new Prediction("3", 3, 0); }
	if( stability >= 19.2 ) { 
		if( approval < 23 ) { return new Prediction("1", 3, 0); }
		if( approval >= 23 ) { return new Prediction("2", 3, 0); }
	}
	}
		if( budget < 16.5 ) { return new Prediction("2", 10, 0); }
	}
	}
	}
	if( stability < 4.6 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 13, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree60() {
	if( "negative".equals(type) ) { 
	if( stability < 80.1 ) { 
	if( budget >= 65.7 ) { 
	if( approval >= 72.55 ) { 
		if( stability >= 70.9 ) { return new Prediction("2", 2, 0); }
		if( stability < 70.9 ) { return new Prediction("1", 8, 0); }
	}
		if( approval < 72.55 ) { return new Prediction("2", 34, 0); }
	}
	if( budget < 65.7 ) { 
	if( stability < 4.85 ) { 
		if( approval < 4.75 ) { return new Prediction("2", 6, 0); }
	if( approval >= 4.75 ) { 
		if( budget < 7.3 ) { return new Prediction("1", 13, 0); }
	if( budget >= 7.3 ) { 
		if( approval < 8.4 ) { return new Prediction("2", 3, 0); }
		if( approval >= 8.4 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( stability >= 4.85 ) { 
	if( approval >= 54.7 ) { 
		if( stability < 57.8 ) { return new Prediction("1", 17, 0); }
	if( stability >= 57.8 ) { 
		if( approval < 68.5 ) { return new Prediction("3", 2, 0); }
		if( approval >= 68.5 ) { return new Prediction("1", 10, 0); }
	}
	}
	if( approval < 54.7 ) { 
	if( stability < 52.75 ) { 
	if( approval < 7.35 ) { 
	if( approval < 2.6 ) { 
		if( approval >= 2.1 ) { return new Prediction("2", 3, 0); }
		if( approval < 2.1 ) { return new Prediction("3", 2, 0); }
	}
		if( approval >= 2.6 ) { return new Prediction("3", 13, 0); }
	}
	if( approval >= 7.35 ) { 
	if( stability >= 9.35 ) { 
	if( approval < 37.5 ) { 
	if( stability < 27.8 ) { 
	if( stability >= 16.95 ) { 
	if( approval >= 15 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 12, 0); }
		if( budget >= 29.9 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 15 ) { return new Prediction("3", 1, 0); }
	}
	if( stability < 16.95 ) { 
		if( approval >= 11.25 ) { return new Prediction("2", 1, 0); }
		if( approval < 11.25 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( stability >= 27.8 ) { 
		if( stability >= 37.6 ) { return new Prediction("3", 13, 0); }
	if( stability < 37.6 ) { 
		if( approval >= 27.65 ) { return new Prediction("2", 3, 0); }
		if( approval < 27.65 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	if( approval >= 37.5 ) { 
		if( budget >= 52.25 ) { return new Prediction("2", 6, 0); }
	if( budget < 52.25 ) { 
	if( approval >= 48.5 ) { 
	if( stability >= 48 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 3, 0); }
		if( approval < 51.5 ) { return new Prediction("3", 2, 0); }
	}
		if( stability < 48 ) { return new Prediction("1", 13, 0); }
	}
	if( approval < 48.5 ) { 
	if( stability < 49.25 ) { 
		if( budget < 41.4 ) { return new Prediction("1", 5, 0); }
	if( budget >= 41.4 ) { 
	if( approval >= 47.5 ) { 
	if( stability >= 44.3 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 2, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 3, 0); }
	}
		if( stability < 44.3 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("2", 4, 0); }
	}
	}
		if( stability >= 49.25 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
		if( stability < 9.35 ) { return new Prediction("1", 14, 0); }
	}
	}
		if( stability >= 52.75 ) { return new Prediction("3", 16, 0); }
	}
	}
	}
	}
	if( stability >= 80.1 ) { 
		if( approval < 71.65 ) { return new Prediction("3", 16, 0); }
	if( approval >= 71.65 ) { 
		if( approval >= 77.6 ) { return new Prediction("3", 1, 0); }
		if( approval < 77.6 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 47.1 ) { 
	if( stability < 45.65 ) { 
	if( approval >= 2.9 ) { 
	if( budget >= 35.85 ) { 
	if( approval >= 45.5 ) { 
	if( approval >= 49 ) { 
		if( stability < 40.75 ) { return new Prediction("3", 7, 0); }
	if( stability >= 40.75 ) { 
		if( approval >= 51.5 ) { return new Prediction("3", 2, 0); }
		if( approval < 51.5 ) { return new Prediction("2", 2, 0); }
	}
	}
		if( approval < 49 ) { return new Prediction("2", 4, 0); }
	}
	if( approval < 45.5 ) { 
		if( stability < 36.4 ) { return new Prediction("3", 7, 0); }
	if( stability >= 36.4 ) { 
		if( approval < 38.5 ) { return new Prediction("1", 4, 0); }
		if( approval >= 38.5 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( budget < 35.85 ) { 
	if( approval >= 34.5 ) { 
	if( budget >= 27 ) { 
		if( budget < 28.6 ) { return new Prediction("3", 1, 0); }
		if( budget >= 28.6 ) { return new Prediction("2", 6, 0); }
	}
		if( budget < 27 ) { return new Prediction("2", 16, 0); }
	}
	if( approval < 34.5 ) { 
		if( approval >= 30.95 ) { return new Prediction("3", 7, 0); }
	if( approval < 30.95 ) { 
	if( stability >= 3.5 ) { 
	if( stability >= 4.7 ) { 
	if( budget < 25.7 ) { 
	if( approval < 5.35 ) { 
		if( budget < 3.2 ) { return new Prediction("2", 2, 0); }
		if( budget >= 3.2 ) { return new Prediction("1", 3, 0); }
	}
	if( approval >= 5.35 ) { 
		if( stability < 18.55 ) { return new Prediction("2", 15, 0); }
	if( stability >= 18.55 ) { 
		if( approval < 16.05 ) { return new Prediction("1", 1, 0); }
		if( approval >= 16.05 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( budget >= 25.7 ) { 
		if( approval < 23.05 ) { return new Prediction("1", 1, 0); }
	if( approval >= 23.05 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 1, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( stability < 4.7 ) { 
		if( approval >= 6 ) { return new Prediction("3", 2, 0); }
		if( approval < 6 ) { return new Prediction("2", 3, 0); }
	}
	}
		if( stability < 3.5 ) { return new Prediction("3", 7, 0); }
	}
	}
	}
	}
		if( approval < 2.9 ) { return new Prediction("1", 8, 0); }
	}
	if( stability >= 45.65 ) { 
	if( budget < 29.45 ) { 
		if( approval < 28.5 ) { return new Prediction("1", 4, 0); }
		if( approval >= 28.5 ) { return new Prediction("2", 11, 0); }
	}
		if( budget >= 29.45 ) { return new Prediction("2", 19, 0); }
	}
	}
	if( budget >= 47.1 ) { 
	if( approval < 57.35 ) { 
	if( stability >= 51.15 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 24, 0); }
	if( approval >= 56.35 ) { 
		if( approval >= 57.05 ) { return new Prediction("1", 3, 0); }
		if( approval < 57.05 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( stability < 51.15 ) { 
		if( approval >= 40.6 ) { return new Prediction("3", 22, 0); }
		if( approval < 40.6 ) { return new Prediction("1", 8, 0); }
	}
	}
	if( approval >= 57.35 ) { 
		if( budget >= 70.1 ) { return new Prediction("3", 14, 0); }
	if( budget < 70.1 ) { 
		if( stability >= 53.2 ) { return new Prediction("2", 10, 0); }
		if( stability < 53.2 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree61() {
	if( budget < 3.55 ) { 
		if( approval >= 6.7 ) { return new Prediction("1", 14, 0); }
	if( approval < 6.7 ) { 
	if( stability < 5.25 ) { 
	if( budget >= 1.6 ) { 
		if( approval >= 3.15 ) { return new Prediction("3", 5, 0); }
		if( approval < 3.15 ) { return new Prediction("2", 1, 0); }
	}
	if( budget < 1.6 ) { 
		if( approval >= 2.65 ) { return new Prediction("1", 3, 0); }
		if( approval < 2.65 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( stability >= 5.25 ) { 
	if( budget >= 2.25 ) { 
		if( stability < 8 ) { return new Prediction("1", 11, 0); }
		if( stability >= 8 ) { return new Prediction("3", 1, 0); }
	}
	if( budget < 2.25 ) { 
		if( approval < 2.7 ) { return new Prediction("1", 1, 0); }
		if( approval >= 2.7 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	}
	if( budget >= 3.55 ) { 
	if( approval < 89.65 ) { 
	if( approval >= 6.15 ) { 
	if( stability >= 25.5 ) { 
	if( stability >= 79.05 ) { 
	if( stability >= 84.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 18, 0); }
	if( "positive".equals(type) ) { 
		if( approval >= 40.6 ) { return new Prediction("2", 5, 0); }
		if( approval < 40.6 ) { return new Prediction("1", 4, 0); }
	}
	}
	if( stability < 84.45 ) { 
		if( approval < 29.15 ) { return new Prediction("3", 1, 0); }
	if( approval >= 29.15 ) { 
		if( stability >= 79.4 ) { return new Prediction("2", 8, 0); }
		if( stability < 79.4 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( stability < 79.05 ) { 
	if( stability < 75.25 ) { 
	if( approval < 50.5 ) { 
	if( approval < 48.15 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 39.1 ) { 
		if( budget >= 68.95 ) { return new Prediction("2", 8, 0); }
	if( budget < 68.95 ) { 
	if( stability < 34.05 ) { 
	if( budget < 38.55 ) { 
		if( approval < 26.3 ) { return new Prediction("3", 4, 0); }
		if( approval >= 26.3 ) { return new Prediction("1", 7, 0); }
	}
		if( budget >= 38.55 ) { return new Prediction("2", 2, 0); }
	}
	if( stability >= 34.05 ) { 
	if( stability < 41.05 ) { 
		if( budget >= 43.9 ) { return new Prediction("2", 1, 0); }
	if( budget < 43.9 ) { 
		if( stability >= 37.15 ) { return new Prediction("3", 4, 0); }
	if( stability < 37.15 ) { 
		if( budget >= 29.65 ) { return new Prediction("2", 1, 0); }
		if( budget < 29.65 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
		if( stability >= 41.05 ) { return new Prediction("3", 12, 0); }
	}
	}
	}
	if( approval >= 39.1 ) { 
	if( approval < 47.8 ) { 
		if( budget < 43.25 ) { return new Prediction("1", 2, 0); }
		if( budget >= 43.25 ) { return new Prediction("2", 17, 0); }
	}
	if( approval >= 47.8 ) { 
		if( budget >= 48.85 ) { return new Prediction("3", 1, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 33.9 ) { 
		if( budget >= 25.6 ) { return new Prediction("1", 20, 0); }
		if( budget < 25.6 ) { return new Prediction("2", 1, 0); }
	}
	if( approval >= 33.9 ) { 
	if( budget < 36.85 ) { 
	if( budget >= 35.5 ) { 
		if( stability >= 36.55 ) { return new Prediction("2", 2, 0); }
		if( stability < 36.55 ) { return new Prediction("3", 1, 0); }
	}
		if( budget < 35.5 ) { return new Prediction("2", 12, 0); }
	}
	if( budget >= 36.85 ) { 
	if( approval >= 47.5 ) { 
		if( stability >= 44.3 ) { return new Prediction("3", 1, 0); }
		if( stability < 44.3 ) { return new Prediction("2", 2, 0); }
	}
	if( approval < 47.5 ) { 
	if( stability >= 35.25 ) { 
	if( stability < 44.25 ) { 
		if( approval >= 39 ) { return new Prediction("3", 7, 0); }
		if( approval < 39 ) { return new Prediction("1", 14, 0); }
	}
		if( stability >= 44.25 ) { return new Prediction("1", 14, 0); }
	}
		if( stability < 35.25 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	}
	}
	if( approval >= 48.15 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 48.9 ) { return new Prediction("3", 1, 0); }
		if( approval >= 48.9 ) { return new Prediction("1", 10, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget >= 75.5 ) { return new Prediction("1", 1, 0); }
		if( budget < 75.5 ) { return new Prediction("3", 8, 0); }
	}
	}
	}
	if( approval >= 50.5 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 60.8 ) { 
	if( stability < 57.8 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 13, 0); }
		if( approval < 51.5 ) { return new Prediction("3", 1, 0); }
	}
	if( stability >= 57.8 ) { 
		if( approval < 79.6 ) { return new Prediction("3", 6, 0); }
		if( approval >= 79.6 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( budget >= 60.8 ) { 
		if( approval < 70.8 ) { return new Prediction("2", 12, 0); }
	if( approval >= 70.8 ) { 
		if( approval >= 75.4 ) { return new Prediction("2", 2, 0); }
		if( approval < 75.4 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( budget < 45.8 ) { return new Prediction("2", 8, 0); }
	if( budget >= 45.8 ) { 
	if( stability >= 51.4 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 2, 0); }
	if( approval >= 56.35 ) { 
		if( approval < 72.35 ) { return new Prediction("2", 4, 0); }
	if( approval >= 72.35 ) { 
		if( budget < 67.3 ) { return new Prediction("2", 2, 0); }
		if( budget >= 67.3 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
		if( stability < 51.4 ) { return new Prediction("3", 22, 0); }
	}
	}
	}
	}
	if( stability >= 75.25 ) { 
	if( budget < 69.7 ) { 
		if( approval < 75.75 ) { return new Prediction("3", 1, 0); }
		if( approval >= 75.75 ) { return new Prediction("1", 2, 0); }
	}
		if( budget >= 69.7 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
	if( stability < 25.5 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 9.55 ) { 
	if( approval >= 7.75 ) { 
		if( stability >= 10.8 ) { return new Prediction("3", 1, 0); }
		if( stability < 10.8 ) { return new Prediction("1", 9, 0); }
	}
	if( approval < 7.75 ) { 
		if( approval >= 6.7 ) { return new Prediction("2", 2, 0); }
		if( approval < 6.7 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( budget >= 9.55 ) { 
	if( budget >= 20.8 ) { 
		if( approval >= 65.75 ) { return new Prediction("1", 3, 0); }
	if( approval < 65.75 ) { 
		if( budget < 32.9 ) { return new Prediction("1", 1, 0); }
		if( budget >= 32.9 ) { return new Prediction("2", 10, 0); }
	}
	}
	if( budget < 20.8 ) { 
		if( stability >= 19.1 ) { return new Prediction("3", 2, 0); }
		if( stability < 19.1 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 20.6 ) { 
	if( stability >= 4.65 ) { 
		if( approval < 11.75 ) { return new Prediction("2", 9, 0); }
	if( approval >= 11.75 ) { 
	if( approval < 16.05 ) { 
		if( budget >= 14.15 ) { return new Prediction("3", 3, 0); }
		if( budget < 14.15 ) { return new Prediction("2", 2, 0); }
	}
		if( approval >= 16.05 ) { return new Prediction("2", 7, 0); }
	}
	}
		if( stability < 4.65 ) { return new Prediction("3", 13, 0); }
	}
	if( budget >= 20.6 ) { 
		if( approval < 23.05 ) { return new Prediction("1", 1, 0); }
		if( approval >= 23.05 ) { return new Prediction("3", 22, 0); }
	}
	}
	}
	}
	if( approval < 6.15 ) { 
		if( approval >= 4.45 ) { return new Prediction("1", 7, 0); }
	if( approval < 4.45 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 3.15 ) { return new Prediction("2", 4, 0); }
	if( approval < 3.15 ) { 
		if( approval < 2.6 ) { return new Prediction("2", 2, 0); }
		if( approval >= 2.6 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( approval < 3.8 ) { return new Prediction("1", 6, 0); }
		if( approval >= 3.8 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	if( approval >= 89.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 19, 0); }
	if( "positive".equals(type) ) { 
		if( stability < 63 ) { return new Prediction("3", 2, 0); }
		if( stability >= 63 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
return null;
}
private Prediction runTree62() {
	if( stability < 90.7 ) { 
	if( stability >= 8.55 ) { 
	if( budget >= 33.35 ) { 
	if( budget < 72 ) { 
	if( approval < 83.45 ) { 
	if( stability < 27.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 14, 0); }
	}
	if( stability >= 27.75 ) { 
		if( stability >= 75.9 ) { return new Prediction("3", 8, 0); }
	if( stability < 75.9 ) { 
	if( approval >= 45.7 ) { 
	if( budget < 70.6 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 48.75 ) { 
		if( budget < 45.8 ) { return new Prediction("1", 4, 0); }
	if( budget >= 45.8 ) { 
	if( approval >= 47.5 ) { 
		if( budget >= 50.95 ) { return new Prediction("2", 4, 0); }
	if( budget < 50.95 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 3, 0); }
	if( approval < 48.5 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 1, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( approval < 47.5 ) { return new Prediction("2", 9, 0); }
	}
	}
	if( stability >= 48.75 ) { 
		if( approval < 52.45 ) { return new Prediction("3", 9, 0); }
	if( approval >= 52.45 ) { 
	if( budget < 69.7 ) { 
		if( stability < 57 ) { return new Prediction("1", 8, 0); }
	if( stability >= 57 ) { 
	if( stability >= 59.1 ) { 
		if( stability >= 68.8 ) { return new Prediction("3", 1, 0); }
		if( stability < 68.8 ) { return new Prediction("1", 3, 0); }
	}
		if( stability < 59.1 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( budget >= 69.7 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 53.55 ) { 
		if( approval >= 51.5 ) { return new Prediction("3", 9, 0); }
	if( approval < 51.5 ) { 
	if( budget < 44.4 ) { 
		if( stability < 38.1 ) { return new Prediction("3", 2, 0); }
		if( stability >= 38.1 ) { return new Prediction("2", 5, 0); }
	}
		if( budget >= 44.4 ) { return new Prediction("3", 8, 0); }
	}
	}
	if( stability >= 53.55 ) { 
		if( approval >= 57.9 ) { return new Prediction("2", 6, 0); }
		if( approval < 57.9 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
		if( budget >= 70.6 ) { return new Prediction("3", 6, 0); }
	}
	if( approval < 45.7 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 38.55 ) { 
		if( stability >= 35.95 ) { return new Prediction("3", 7, 0); }
	if( stability < 35.95 ) { 
		if( budget >= 37.75 ) { return new Prediction("1", 3, 1); }
		if( budget < 37.75 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( budget >= 38.55 ) { 
		if( stability < 41.25 ) { return new Prediction("2", 11, 0); }
	if( stability >= 41.25 ) { 
		if( approval < 39.1 ) { return new Prediction("3", 10, 0); }
		if( approval >= 39.1 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 40.4 ) { 
		if( approval >= 39 ) { return new Prediction("3", 4, 0); }
	if( approval < 39 ) { 
	if( stability < 36.4 ) { 
		if( approval < 32.5 ) { return new Prediction("1", 3, 0); }
		if( approval >= 32.5 ) { return new Prediction("3", 5, 0); }
	}
		if( stability >= 36.4 ) { return new Prediction("1", 8, 0); }
	}
	}
	if( stability >= 40.4 ) { 
	if( stability < 44.25 ) { 
		if( budget < 38.2 ) { return new Prediction("2", 2, 0); }
		if( budget >= 38.2 ) { return new Prediction("1", 6, 0); }
	}
		if( stability >= 44.25 ) { return new Prediction("1", 24, 0); }
	}
	}
	}
	}
	}
	}
	if( approval >= 83.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 16, 0); }
	if( "positive".equals(type) ) { 
		if( budget >= 56.55 ) { return new Prediction("3", 3, 0); }
		if( budget < 56.55 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( budget >= 72 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 91.75 ) { 
		if( stability < 84.55 ) { return new Prediction("2", 33, 0); }
		if( stability >= 84.55 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 91.75 ) { return new Prediction("1", 4, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval >= 53.5 ) { return new Prediction("3", 13, 0); }
	if( approval < 53.5 ) { 
		if( budget < 81.75 ) { return new Prediction("3", 1, 0); }
		if( budget >= 81.75 ) { return new Prediction("1", 9, 0); }
	}
	}
	}
	}
	if( budget < 33.35 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 46.55 ) { 
	if( stability >= 62.75 ) { 
		if( budget < 19.2 ) { return new Prediction("1", 1, 0); }
		if( budget >= 19.2 ) { return new Prediction("3", 1, 0); }
	}
		if( stability < 62.75 ) { return new Prediction("1", 4, 0); }
	}
	if( approval < 46.55 ) { 
		if( stability >= 26.75 ) { return new Prediction("3", 11, 0); }
	if( stability < 26.75 ) { 
	if( budget < 9.3 ) { 
		if( approval < 8.25 ) { return new Prediction("3", 5, 0); }
	if( approval >= 8.25 ) { 
		if( budget >= 5.8 ) { return new Prediction("3", 1, 0); }
		if( budget < 5.8 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( budget >= 9.3 ) { 
		if( approval < 21 ) { return new Prediction("2", 4, 0); }
	if( approval >= 21 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 2, 0); }
		if( budget >= 29.9 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 18 ) { 
	if( stability < 15.05 ) { 
		if( budget < 14.75 ) { return new Prediction("2", 8, 0); }
		if( budget >= 14.75 ) { return new Prediction("3", 1, 0); }
	}
		if( stability >= 15.05 ) { return new Prediction("1", 5, 0); }
	}
	if( approval >= 18 ) { 
	if( stability < 19.2 ) { 
		if( budget < 18 ) { return new Prediction("2", 1, 0); }
		if( budget >= 18 ) { return new Prediction("3", 3, 0); }
	}
		if( stability >= 19.2 ) { return new Prediction("2", 35, 0); }
	}
	}
	}
	}
	if( stability < 8.55 ) { 
	if( approval < 7.4 ) { 
	if( budget < 7.3 ) { 
	if( approval < 3 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 2.65 ) { return new Prediction("1", 2, 0); }
		if( approval < 2.65 ) { return new Prediction("3", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 7, 0); }
	}
	if( approval >= 3 ) { 
	if( budget >= 5.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 2, 0); }
	}
	if( budget < 5.2 ) { 
	if( approval >= 4.05 ) { 
	if( stability >= 4 ) { 
		if( budget >= 4.15 ) { return new Prediction("1", 3, 0); }
	if( budget < 4.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 4, 0); }
	}
	}
	if( stability < 4 ) { 
		if( approval >= 5 ) { return new Prediction("1", 5, 0); }
		if( approval < 5 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( approval < 4.05 ) { 
		if( budget >= 2 ) { return new Prediction("2", 6, 0); }
	if( budget < 2 ) { 
		if( approval >= 3.35 ) { return new Prediction("2", 1, 0); }
		if( approval < 3.35 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	if( budget >= 7.3 ) { 
		if( stability >= 3.5 ) { return new Prediction("2", 6, 0); }
	if( stability < 3.5 ) { 
		if( stability >= 2.25 ) { return new Prediction("3", 2, 0); }
		if( stability < 2.25 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( approval >= 7.4 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 9.55 ) { return new Prediction("1", 30, 0); }
		if( budget >= 9.55 ) { return new Prediction("2", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 7, 0); }
	}
	}
	}
		if( stability >= 90.7 ) { return new Prediction("3", 14, 0); }
return null;
}
private Prediction runTree63() {
	if( stability < 90.35 ) { 
	if( budget < 7.3 ) { 
	if( stability < 7.25 ) { 
		if( budget >= 5.8 ) { return new Prediction("1", 10, 0); }
	if( budget < 5.8 ) { 
		if( budget >= 5.25 ) { return new Prediction("3", 5, 0); }
	if( budget < 5.25 ) { 
		if( approval < 2.95 ) { return new Prediction("1", 5, 0); }
	if( approval >= 2.95 ) { 
	if( approval >= 4.45 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 6.7 ) { return new Prediction("1", 12, 0); }
	if( approval < 6.7 ) { 
		if( approval >= 6.05 ) { return new Prediction("3", 1, 0); }
		if( approval < 6.05 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 4.55 ) { 
		if( stability >= 4 ) { return new Prediction("2", 3, 0); }
		if( stability < 4 ) { return new Prediction("3", 6, 0); }
	}
		if( approval < 4.55 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( approval < 4.45 ) { 
		if( budget >= 4.05 ) { return new Prediction("2", 3, 0); }
	if( budget < 4.05 ) { 
	if( approval >= 3.35 ) { 
		if( budget >= 2.65 ) { return new Prediction("3", 1, 0); }
		if( budget < 2.65 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 3.35 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( stability >= 7.25 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 8.25 ) { return new Prediction("3", 2, 0); }
		if( approval >= 8.25 ) { return new Prediction("1", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 8, 0); }
	}
	}
	if( budget >= 7.3 ) { 
	if( budget >= 16.25 ) { 
	if( approval < 83.45 ) { 
		if( stability < 13.65 ) { return new Prediction("3", 13, 0); }
	if( stability >= 13.65 ) { 
	if( approval >= 40.6 ) { 
	if( budget < 76.3 ) { 
	if( budget < 45.8 ) { 
	if( stability >= 20.05 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 51 ) { return new Prediction("3", 10, 0); }
		if( stability < 51 ) { return new Prediction("1", 1, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability >= 38.6 ) { return new Prediction("2", 24, 0); }
		if( stability < 38.6 ) { return new Prediction("3", 4, 0); }
	}
	}
		if( stability < 20.05 ) { return new Prediction("1", 3, 0); }
	}
	if( budget >= 45.8 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 48.75 ) { 
		if( budget >= 53.65 ) { return new Prediction("2", 7, 0); }
	if( budget < 53.65 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 7, 0); }
	if( approval < 48.5 ) { 
		if( stability < 46.75 ) { return new Prediction("2", 12, 0); }
	if( stability >= 46.75 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 1, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( stability >= 48.75 ) { 
	if( budget >= 68.75 ) { 
		if( budget < 71.9 ) { return new Prediction("2", 4, 0); }
		if( budget >= 71.9 ) { return new Prediction("3", 4, 0); }
	}
	if( budget < 68.75 ) { 
		if( approval < 52.45 ) { return new Prediction("3", 9, 0); }
	if( approval >= 52.45 ) { 
		if( stability < 57 ) { return new Prediction("1", 5, 0); }
	if( stability >= 57 ) { 
		if( approval < 69 ) { return new Prediction("3", 6, 0); }
		if( approval >= 69 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 51.4 ) { 
	if( budget < 67.3 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 6, 0); }
	if( approval >= 56.35 ) { 
	if( stability < 55.15 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 3, 0); }
		if( budget >= 52.75 ) { return new Prediction("3", 1, 0); }
	}
		if( stability >= 55.15 ) { return new Prediction("2", 5, 0); }
	}
	}
	if( budget >= 67.3 ) { 
		if( approval < 73.65 ) { return new Prediction("1", 2, 0); }
		if( approval >= 73.65 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( stability < 51.4 ) { 
	if( approval < 44.5 ) { 
		if( stability < 43.15 ) { return new Prediction("3", 1, 0); }
		if( stability >= 43.15 ) { return new Prediction("1", 4, 0); }
	}
		if( approval >= 44.5 ) { return new Prediction("3", 30, 0); }
	}
	}
	}
	}
	if( budget >= 76.3 ) { 
		if( approval < 79.4 ) { return new Prediction("2", 11, 0); }
		if( approval >= 79.4 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( approval < 40.6 ) { 
	if( budget >= 68.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 13, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 20, 0); }
	}
	if( budget < 68.15 ) { 
	if( budget < 36.8 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 27.8 ) { 
		if( stability < 35.65 ) { return new Prediction("1", 8, 0); }
		if( stability >= 35.65 ) { return new Prediction("3", 3, 0); }
	}
	if( approval < 27.8 ) { 
	if( budget < 20.6 ) { 
		if( stability >= 19.1 ) { return new Prediction("3", 1, 0); }
		if( stability < 19.1 ) { return new Prediction("2", 1, 0); }
	}
		if( budget >= 20.6 ) { return new Prediction("3", 6, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 30.75 ) { 
		if( stability >= 28.65 ) { return new Prediction("1", 7, 0); }
	if( stability < 28.65 ) { 
		if( approval < 21 ) { return new Prediction("1", 1, 0); }
		if( approval >= 21 ) { return new Prediction("2", 3, 0); }
	}
	}
	if( approval >= 30.75 ) { 
	if( stability >= 26.1 ) { 
		if( budget < 34.2 ) { return new Prediction("2", 15, 0); }
	if( budget >= 34.2 ) { 
		if( stability >= 36.55 ) { return new Prediction("2", 5, 0); }
		if( stability < 36.55 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( stability < 26.1 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( budget >= 36.8 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 37.45 ) { 
	if( approval >= 36.5 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 1, 0); }
		if( budget < 39.15 ) { return new Prediction("1", 7, 0); }
	}
		if( approval < 36.5 ) { return new Prediction("2", 6, 0); }
	}
	if( stability >= 37.45 ) { 
		if( approval < 37.5 ) { return new Prediction("3", 12, 0); }
	if( approval >= 37.5 ) { 
		if( budget < 53.5 ) { return new Prediction("2", 1, 0); }
		if( budget >= 53.5 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 30.3 ) { 
		if( stability < 36.4 ) { return new Prediction("3", 8, 0); }
	if( stability >= 36.4 ) { 
	if( approval >= 39 ) { 
		if( stability < 41.85 ) { return new Prediction("3", 1, 0); }
		if( stability >= 41.85 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 39 ) { return new Prediction("1", 15, 0); }
	}
	}
		if( approval < 30.3 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( approval >= 83.45 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 93.9 ) { return new Prediction("1", 18, 0); }
		if( budget >= 93.9 ) { return new Prediction("2", 1, 0); }
	}
	if( "positive".equals(type) ) { 
	if( approval < 98.1 ) { 
	if( approval >= 90.6 ) { 
		if( approval >= 93.3 ) { return new Prediction("3", 2, 0); }
		if( approval < 93.3 ) { return new Prediction("2", 2, 0); }
	}
		if( approval < 90.6 ) { return new Prediction("3", 2, 0); }
	}
		if( approval >= 98.1 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( budget < 16.25 ) { 
	if( stability >= 1.05 ) { 
	if( budget >= 8.85 ) { 
	if( stability < 62.4 ) { 
	if( approval < 56.95 ) { 
	if( stability < 8.4 ) { 
		if( stability < 6.55 ) { return new Prediction("2", 9, 0); }
		if( stability >= 6.55 ) { return new Prediction("1", 1, 0); }
	}
		if( stability >= 8.4 ) { return new Prediction("2", 13, 0); }
	}
	if( approval >= 56.95 ) { 
		if( approval < 65.3 ) { return new Prediction("1", 1, 0); }
		if( approval >= 65.3 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( stability >= 62.4 ) { return new Prediction("3", 1, 0); }
	}
	if( budget < 8.85 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 3, 0); }
	}
	}
		if( stability < 1.05 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
		if( stability >= 90.35 ) { return new Prediction("3", 14, 0); }
return null;
}
private Prediction runTree64() {
	if( budget < 7.3 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 6.8 ) { 
	if( stability < 5.4 ) { 
		if( approval >= 2.55 ) { return new Prediction("1", 7, 0); }
		if( approval < 2.55 ) { return new Prediction("3", 2, 0); }
	}
		if( stability >= 5.4 ) { return new Prediction("3", 7, 0); }
	}
		if( approval >= 6.8 ) { return new Prediction("1", 20, 0); }
	}
	if( "positive".equals(type) ) { 
	if( approval >= 5.55 ) { 
		if( stability >= 4.65 ) { return new Prediction("2", 11, 0); }
		if( stability < 4.65 ) { return new Prediction("3", 5, 0); }
	}
	if( approval < 5.55 ) { 
		if( stability < 1.25 ) { return new Prediction("3", 1, 0); }
	if( stability >= 1.25 ) { 
		if( stability >= 5.2 ) { return new Prediction("1", 8, 0); }
	if( stability < 5.2 ) { 
		if( stability < 3.45 ) { return new Prediction("1", 4, 0); }
		if( stability >= 3.45 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	}
	}
	if( budget >= 7.3 ) { 
	if( stability < 90.7 ) { 
	if( stability < 19.6 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 65.95 ) { 
		if( budget >= 9.05 ) { return new Prediction("2", 15, 0); }
	if( budget < 9.05 ) { 
	if( approval >= 8.1 ) { 
		if( approval < 11.65 ) { return new Prediction("1", 3, 0); }
		if( approval >= 11.65 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 8.1 ) { return new Prediction("2", 7, 0); }
	}
	}
		if( approval >= 65.95 ) { return new Prediction("1", 3, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 18 ) { 
		if( approval >= 11.8 ) { return new Prediction("2", 8, 0); }
		if( approval < 11.8 ) { return new Prediction("3", 4, 0); }
	}
		if( budget >= 18 ) { return new Prediction("3", 23, 0); }
	}
	}
	if( stability >= 19.6 ) { 
	if( budget < 28.1 ) { 
	if( budget >= 12.55 ) { 
	if( approval < 17.05 ) { 
		if( budget >= 19.7 ) { return new Prediction("3", 2, 0); }
		if( budget < 19.7 ) { return new Prediction("1", 3, 0); }
	}
	if( approval >= 17.05 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 23.65 ) { return new Prediction("3", 1, 0); }
		if( approval >= 23.65 ) { return new Prediction("1", 8, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability >= 20.6 ) { return new Prediction("2", 27, 0); }
	if( stability < 20.6 ) { 
		if( budget >= 23.4 ) { return new Prediction("3", 1, 0); }
		if( budget < 23.4 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	}
		if( budget < 12.55 ) { return new Prediction("3", 3, 0); }
	}
	if( budget >= 28.1 ) { 
	if( budget >= 29.65 ) { 
	if( approval < 89.65 ) { 
	if( approval < 50.4 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 67.9 ) { 
	if( stability < 48.75 ) { 
	if( approval >= 36.5 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 10, 0); }
	if( approval < 48.5 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 5, 0); }
	if( budget < 39.15 ) { 
	if( stability >= 39.3 ) { 
		if( approval >= 42.5 ) { return new Prediction("1", 2, 0); }
		if( approval < 42.5 ) { return new Prediction("3", 3, 0); }
	}
	if( stability < 39.3 ) { 
		if( stability >= 33.25 ) { return new Prediction("1", 7, 0); }
		if( stability < 33.25 ) { return new Prediction("1", 5, 2); }
	}
	}
	}
	}
	if( approval < 36.5 ) { 
	if( stability < 40.65 ) { 
		if( budget < 31.25 ) { return new Prediction("3", 1, 0); }
		if( budget >= 31.25 ) { return new Prediction("2", 6, 0); }
	}
		if( stability >= 40.65 ) { return new Prediction("3", 6, 0); }
	}
	}
		if( stability >= 48.75 ) { return new Prediction("3", 15, 0); }
	}
	if( budget >= 67.9 ) { 
		if( budget < 85.25 ) { return new Prediction("2", 10, 0); }
	if( budget >= 85.25 ) { 
		if( approval >= 45.6 ) { return new Prediction("3", 1, 0); }
		if( approval < 45.6 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 48.15 ) { 
	if( approval >= 42 ) { 
		if( budget >= 47.05 ) { return new Prediction("3", 7, 0); }
	if( budget < 47.05 ) { 
		if( approval < 49.5 ) { return new Prediction("2", 10, 0); }
		if( approval >= 49.5 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval < 42 ) { 
		if( budget < 32 ) { return new Prediction("2", 3, 0); }
	if( budget >= 32 ) { 
	if( approval >= 40.5 ) { 
	if( budget >= 44 ) { 
		if( stability >= 43.9 ) { return new Prediction("1", 1, 0); }
		if( stability < 43.9 ) { return new Prediction("3", 2, 0); }
	}
		if( budget < 44 ) { return new Prediction("2", 1, 0); }
	}
	if( approval < 40.5 ) { 
	if( stability >= 33.25 ) { 
	if( stability < 36.4 ) { 
		if( budget >= 45.95 ) { return new Prediction("1", 2, 0); }
	if( budget < 45.95 ) { 
		if( approval >= 33 ) { return new Prediction("3", 2, 0); }
		if( approval < 33 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( stability >= 36.4 ) { 
	if( approval >= 39 ) { 
		if( stability < 41.85 ) { return new Prediction("3", 1, 0); }
		if( stability >= 41.85 ) { return new Prediction("1", 3, 0); }
	}
		if( approval < 39 ) { return new Prediction("1", 13, 0); }
	}
	}
		if( stability < 33.25 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	if( stability >= 48.15 ) { 
		if( budget < 39.6 ) { return new Prediction("2", 2, 0); }
		if( budget >= 39.6 ) { return new Prediction("1", 24, 0); }
	}
	}
	}
	if( approval >= 50.4 ) { 
	if( budget < 81.9 ) { 
	if( stability >= 79.05 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 10, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 2, 0); }
	}
	if( stability < 79.05 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 70.95 ) { 
	if( stability < 56.4 ) { 
		if( budget < 52.9 ) { return new Prediction("1", 4, 0); }
	if( budget >= 52.9 ) { 
		if( stability < 55.95 ) { return new Prediction("2", 7, 0); }
		if( stability >= 55.95 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( stability >= 56.4 ) { 
		if( budget < 63.2 ) { return new Prediction("3", 4, 0); }
		if( budget >= 63.2 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( approval >= 70.95 ) { return new Prediction("1", 6, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 51.4 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 3, 0); }
	if( approval >= 56.35 ) { 
		if( budget >= 68.75 ) { return new Prediction("1", 1, 0); }
		if( budget < 68.75 ) { return new Prediction("2", 21, 0); }
	}
	}
	if( stability < 51.4 ) { 
		if( budget >= 46.9 ) { return new Prediction("3", 13, 0); }
		if( budget < 46.9 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	if( budget >= 81.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 15, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( approval >= 89.65 ) { 
	if( stability >= 62.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 13, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 1, 0); }
	}
	if( stability < 62.65 ) { 
		if( stability >= 36.3 ) { return new Prediction("3", 7, 0); }
	if( stability < 36.3 ) { 
		if( stability < 25.65 ) { return new Prediction("3", 1, 0); }
		if( stability >= 25.65 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	}
		if( budget < 29.65 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
		if( stability >= 90.7 ) { return new Prediction("3", 16, 0); }
	}
return null;
}
private Prediction runTree65() {
	if( stability >= 7.95 ) { 
	if( approval >= 91.05 ) { 
		if( budget < 77.6 ) { return new Prediction("1", 6, 0); }
	if( budget >= 77.6 ) { 
		if( approval >= 98.55 ) { return new Prediction("1", 1, 0); }
		if( approval < 98.55 ) { return new Prediction("3", 7, 0); }
	}
	}
	if( approval < 91.05 ) { 
	if( stability < 91.65 ) { 
	if( stability < 13.45 ) { 
	if( approval < 29.8 ) { 
	if( approval >= 7.2 ) { 
	if( approval >= 10.4 ) { 
	if( approval >= 12.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 12.7 ) { return new Prediction("2", 2, 0); }
	}
	if( approval < 10.4 ) { 
		if( approval < 7.95 ) { return new Prediction("2", 2, 0); }
		if( approval >= 7.95 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( approval < 7.2 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 2.5 ) { 
		if( approval >= 2.1 ) { return new Prediction("2", 1, 0); }
		if( approval < 2.1 ) { return new Prediction("3", 2, 0); }
	}
		if( approval >= 2.5 ) { return new Prediction("3", 4, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 3, 0); }
	}
	}
		if( approval >= 29.8 ) { return new Prediction("3", 13, 0); }
	}
	if( stability >= 13.45 ) { 
	if( budget < 19.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 14, 0); }
	}
	if( budget >= 19.1 ) { 
	if( budget >= 89.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 13, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 6, 0); }
	}
	if( budget < 89.4 ) { 
	if( approval < 30.2 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 27.3 ) { 
		if( budget < 31.35 ) { return new Prediction("1", 8, 0); }
	if( budget >= 31.35 ) { 
		if( approval >= 29.55 ) { return new Prediction("3", 2, 0); }
		if( approval < 29.55 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( approval < 27.3 ) { 
		if( budget >= 68.95 ) { return new Prediction("2", 2, 0); }
	if( budget < 68.95 ) { 
		if( stability < 21.4 ) { return new Prediction("2", 2, 0); }
		if( stability >= 21.4 ) { return new Prediction("3", 8, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( stability >= 32.25 ) { return new Prediction("1", 18, 0); }
	if( stability < 32.25 ) { 
	if( approval < 26.05 ) { 
		if( budget >= 36.1 ) { return new Prediction("3", 2, 0); }
		if( budget < 36.1 ) { return new Prediction("1", 2, 0); }
	}
		if( approval >= 26.05 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( approval >= 30.2 ) { 
	if( stability >= 79.25 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 9, 0); }
	}
	if( stability < 79.25 ) { 
	if( stability >= 50.4 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 68.75 ) { 
		if( approval < 87.5 ) { return new Prediction("2", 10, 0); }
		if( approval >= 87.5 ) { return new Prediction("1", 2, 0); }
	}
	if( budget < 68.75 ) { 
	if( approval >= 51.5 ) { 
		if( budget >= 59.45 ) { return new Prediction("3", 3, 0); }
	if( budget < 59.45 ) { 
	if( stability >= 70.65 ) { 
		if( budget < 30.55 ) { return new Prediction("3", 2, 0); }
		if( budget >= 30.55 ) { return new Prediction("1", 1, 0); }
	}
	if( stability < 70.65 ) { 
		if( budget < 53.7 ) { return new Prediction("1", 9, 0); }
	if( budget >= 53.7 ) { 
	if( approval < 63.5 ) { 
		if( stability < 57 ) { return new Prediction("1", 1, 0); }
		if( stability >= 57 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 63.5 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	}
		if( approval < 51.5 ) { return new Prediction("3", 7, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( budget < 47.45 ) { return new Prediction("2", 13, 0); }
	if( budget >= 47.45 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 21, 0); }
	if( approval >= 56.35 ) { 
	if( budget >= 67.5 ) { 
		if( budget < 77.4 ) { return new Prediction("1", 5, 0); }
		if( budget >= 77.4 ) { return new Prediction("3", 3, 0); }
	}
		if( budget < 67.5 ) { return new Prediction("2", 7, 0); }
	}
	}
	}
	}
	if( stability < 50.4 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 40.4 ) { 
	if( approval >= 47.5 ) { 
	if( stability < 48.9 ) { 
	if( budget < 70.25 ) { 
	if( stability < 46.75 ) { 
	if( approval >= 48.5 ) { 
	if( budget >= 57.35 ) { 
		if( approval < 70.8 ) { return new Prediction("2", 2, 0); }
		if( approval >= 70.8 ) { return new Prediction("1", 1, 0); }
	}
		if( budget < 57.35 ) { return new Prediction("1", 7, 0); }
	}
		if( approval < 48.5 ) { return new Prediction("2", 4, 0); }
	}
		if( stability >= 46.75 ) { return new Prediction("1", 4, 0); }
	}
		if( budget >= 70.25 ) { return new Prediction("2", 5, 0); }
	}
		if( stability >= 48.9 ) { return new Prediction("3", 3, 0); }
	}
	if( approval < 47.5 ) { 
	if( budget < 44.15 ) { 
		if( stability >= 38.25 ) { return new Prediction("3", 5, 0); }
		if( stability < 38.25 ) { return new Prediction("2", 5, 0); }
	}
		if( budget >= 44.15 ) { return new Prediction("2", 13, 0); }
	}
	}
	if( budget < 40.4 ) { 
	if( stability < 35.65 ) { 
	if( approval < 37.5 ) { 
		if( approval < 35 ) { return new Prediction("1", 1, 0); }
		if( approval >= 35 ) { return new Prediction("1", 4, 2); }
	}
		if( approval >= 37.5 ) { return new Prediction("1", 4, 0); }
	}
	if( stability >= 35.65 ) { 
	if( stability >= 37.95 ) { 
		if( approval >= 42 ) { return new Prediction("1", 5, 0); }
		if( approval < 42 ) { return new Prediction("3", 1, 0); }
	}
		if( stability < 37.95 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 53.7 ) { 
	if( budget >= 37.75 ) { 
	if( approval >= 40.5 ) { 
	if( stability >= 38.6 ) { 
		if( budget < 45.55 ) { return new Prediction("2", 11, 0); }
	if( budget >= 45.55 ) { 
		if( approval < 45 ) { return new Prediction("1", 3, 0); }
		if( approval >= 45 ) { return new Prediction("3", 4, 0); }
	}
	}
		if( stability < 38.6 ) { return new Prediction("3", 2, 0); }
	}
	if( approval < 40.5 ) { 
		if( stability < 36.4 ) { return new Prediction("3", 3, 0); }
		if( stability >= 36.4 ) { return new Prediction("1", 10, 0); }
	}
	}
	if( budget < 37.75 ) { 
		if( stability >= 33 ) { return new Prediction("2", 7, 0); }
		if( stability < 33 ) { return new Prediction("3", 8, 0); }
	}
	}
		if( budget >= 53.7 ) { return new Prediction("3", 20, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
	if( stability >= 91.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 15, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	if( stability < 7.95 ) { 
	if( approval < 3 ) { 
		if( budget < 1.25 ) { return new Prediction("3", 1, 0); }
		if( budget >= 1.25 ) { return new Prediction("1", 15, 0); }
	}
	if( approval >= 3 ) { 
	if( approval < 7.4 ) { 
	if( stability < 6.1 ) { 
	if( stability < 3.45 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 3.1 ) { return new Prediction("1", 2, 0); }
		if( budget >= 3.1 ) { return new Prediction("2", 3, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability < 3.1 ) { return new Prediction("3", 5, 0); }
	if( stability >= 3.1 ) { 
		if( approval < 5.1 ) { return new Prediction("1", 1, 0); }
		if( approval >= 5.1 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( stability >= 3.45 ) { 
	if( approval >= 3.65 ) { 
		if( budget >= 5.3 ) { return new Prediction("2", 3, 0); }
	if( budget < 5.3 ) { 
		if( approval < 6.2 ) { return new Prediction("1", 10, 0); }
		if( approval >= 6.2 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( approval < 3.65 ) { 
		if( approval >= 3.15 ) { return new Prediction("3", 1, 0); }
		if( approval < 3.15 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( stability >= 6.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 2, 0); }
	}
	}
	if( approval >= 7.4 ) { 
	if( approval < 9.85 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 9.55 ) { return new Prediction("1", 21, 0); }
		if( budget >= 9.55 ) { return new Prediction("2", 1, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 8.7 ) { return new Prediction("3", 1, 0); }
		if( approval >= 8.7 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( approval >= 9.85 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
return null;
}
private Prediction runTree66() {
	if( stability < 82.75 ) { 
	if( budget < 96.05 ) { 
	if( approval < 90.1 ) { 
	if( budget >= 67.95 ) { 
	if( stability < 68.05 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 85.95 ) { return new Prediction("1", 1, 0); }
		if( approval < 85.95 ) { return new Prediction("2", 21, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 42.9 ) { return new Prediction("1", 9, 0); }
	if( approval >= 42.9 ) { 
	if( approval < 58.4 ) { 
		if( approval >= 47.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 47.5 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 58.4 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	if( stability >= 68.05 ) { 
		if( approval < 40.3 ) { return new Prediction("1", 11, 0); }
	if( approval >= 40.3 ) { 
		if( approval >= 56.6 ) { return new Prediction("1", 3, 0); }
		if( approval < 56.6 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( budget < 67.95 ) { 
	if( budget >= 54.1 ) { 
		if( approval < 34.2 ) { return new Prediction("1", 3, 0); }
	if( approval >= 34.2 ) { 
		if( stability >= 68.15 ) { return new Prediction("3", 10, 0); }
	if( stability < 68.15 ) { 
	if( stability < 58.15 ) { 
	if( approval < 55.7 ) { 
	if( stability >= 23.2 ) { 
		if( approval >= 49.65 ) { return new Prediction("2", 2, 0); }
		if( approval < 49.65 ) { return new Prediction("3", 5, 0); }
	}
		if( stability < 23.2 ) { return new Prediction("2", 6, 0); }
	}
	if( approval >= 55.7 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 57 ) { return new Prediction("1", 1, 0); }
		if( stability >= 57 ) { return new Prediction("3", 5, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 7, 0); }
	}
	}
	if( stability >= 58.15 ) { 
		if( approval < 73.6 ) { return new Prediction("1", 1, 0); }
		if( approval >= 73.6 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	}
	if( budget < 54.1 ) { 
	if( budget < 38.85 ) { 
	if( budget < 3.7 ) { 
	if( approval < 7.35 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 2.1 ) { return new Prediction("3", 9, 0); }
		if( stability < 2.1 ) { return new Prediction("1", 1, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 3.2 ) { return new Prediction("1", 5, 0); }
	if( approval >= 3.2 ) { 
		if( approval >= 4.35 ) { return new Prediction("3", 3, 0); }
		if( approval < 4.35 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	if( approval >= 7.35 ) { 
		if( approval < 9.85 ) { return new Prediction("1", 9, 0); }
		if( approval >= 9.85 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( budget >= 3.7 ) { 
	if( stability < 54.45 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 5.2 ) { 
	if( approval < 30.4 ) { 
	if( budget >= 9.4 ) { 
	if( stability >= 16.95 ) { 
		if( approval < 23.65 ) { return new Prediction("3", 4, 0); }
	if( approval >= 23.65 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 1, 0); }
	if( budget >= 29.9 ) { 
		if( approval < 28.9 ) { return new Prediction("2", 2, 0); }
		if( approval >= 28.9 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
		if( stability < 16.95 ) { return new Prediction("2", 7, 0); }
	}
	if( budget < 9.4 ) { 
	if( approval >= 6.65 ) { 
		if( stability >= 9.05 ) { return new Prediction("3", 2, 0); }
		if( stability < 9.05 ) { return new Prediction("1", 7, 0); }
	}
		if( approval < 6.65 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( approval >= 30.4 ) { 
	if( stability >= 32 ) { 
	if( approval < 37.5 ) { 
		if( approval >= 36.5 ) { return new Prediction("2", 5, 2); }
		if( approval < 36.5 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 37.5 ) { return new Prediction("1", 1, 0); }
	}
		if( stability < 32 ) { return new Prediction("1", 6, 0); }
	}
	}
	if( stability < 5.2 ) { 
	if( approval >= 5.2 ) { 
		if( budget < 7.3 ) { return new Prediction("1", 4, 0); }
		if( budget >= 7.3 ) { return new Prediction("2", 4, 0); }
	}
		if( approval < 5.2 ) { return new Prediction("2", 13, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 4.65 ) { 
	if( budget >= 17.8 ) { 
	if( stability < 33.4 ) { 
		if( stability < 19.2 ) { return new Prediction("3", 7, 0); }
	if( stability >= 19.2 ) { 
		if( approval < 23.05 ) { return new Prediction("1", 8, 0); }
	if( approval >= 23.05 ) { 
	if( approval >= 31 ) { 
		if( budget >= 24.6 ) { return new Prediction("3", 8, 0); }
		if( budget < 24.6 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 31 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
	if( stability >= 33.4 ) { 
		if( stability >= 36.55 ) { return new Prediction("2", 11, 0); }
	if( stability < 36.55 ) { 
		if( approval >= 33 ) { return new Prediction("2", 4, 0); }
		if( approval < 33 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( budget < 17.8 ) { 
		if( approval < 4.15 ) { return new Prediction("1", 2, 0); }
		if( approval >= 4.15 ) { return new Prediction("2", 25, 0); }
	}
	}
	if( stability < 4.65 ) { 
		if( approval < 3.8 ) { return new Prediction("1", 2, 0); }
		if( approval >= 3.8 ) { return new Prediction("3", 10, 0); }
	}
	}
	}
	if( stability >= 54.45 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 57.45 ) { return new Prediction("3", 5, 0); }
	if( approval >= 57.45 ) { 
		if( stability < 72.15 ) { return new Prediction("1", 4, 0); }
		if( stability >= 72.15 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( approval < 28.6 ) { return new Prediction("1", 4, 0); }
		if( approval >= 28.6 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	}
	if( budget >= 38.85 ) { 
	if( budget >= 50.95 ) { 
		if( approval >= 50.1 ) { return new Prediction("1", 7, 0); }
	if( approval < 50.1 ) { 
		if( stability < 52.4 ) { return new Prediction("2", 5, 0); }
		if( stability >= 52.4 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( budget < 50.95 ) { 
	if( budget >= 41.55 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 47.5 ) { 
	if( approval >= 48.5 ) { 
	if( stability >= 48 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 4, 0); }
		if( approval < 51.5 ) { return new Prediction("3", 4, 0); }
	}
		if( stability < 48 ) { return new Prediction("1", 9, 0); }
	}
		if( approval < 48.5 ) { return new Prediction("3", 3, 0); }
	}
	if( approval < 47.5 ) { 
	if( approval < 30.45 ) { 
		if( budget < 42.55 ) { return new Prediction("2", 2, 0); }
		if( budget >= 42.55 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 30.45 ) { return new Prediction("2", 13, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 50.5 ) { 
	if( approval < 38.55 ) { 
		if( budget < 48.45 ) { return new Prediction("1", 6, 0); }
		if( budget >= 48.45 ) { return new Prediction("3", 1, 0); }
	}
	if( approval >= 38.55 ) { 
		if( stability < 45 ) { return new Prediction("3", 12, 0); }
	if( stability >= 45 ) { 
		if( approval < 45 ) { return new Prediction("1", 3, 0); }
	if( approval >= 45 ) { 
		if( stability < 49.75 ) { return new Prediction("3", 5, 0); }
		if( stability >= 49.75 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( approval >= 50.5 ) { 
	if( budget < 49.95 ) { 
		if( budget < 42.45 ) { return new Prediction("3", 1, 0); }
		if( budget >= 42.45 ) { return new Prediction("2", 7, 0); }
	}
		if( budget >= 49.95 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	if( budget < 41.55 ) { 
	if( budget < 40.45 ) { 
	if( stability >= 38.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 2, 0); }
	}
	if( stability < 38.65 ) { 
		if( approval >= 66.95 ) { return new Prediction("1", 3, 0); }
	if( approval < 66.95 ) { 
		if( approval < 32.05 ) { return new Prediction("3", 1, 0); }
	if( approval >= 32.05 ) { 
		if( approval >= 43 ) { return new Prediction("3", 1, 0); }
		if( approval < 43 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( budget >= 40.45 ) { 
	if( stability < 41.5 ) { 
		if( approval >= 40 ) { return new Prediction("3", 3, 0); }
	if( approval < 40 ) { 
	if( budget < 40.75 ) { 
		if( approval >= 36.5 ) { return new Prediction("1", 3, 0); }
		if( approval < 36.5 ) { return new Prediction("3", 1, 0); }
	}
		if( budget >= 40.75 ) { return new Prediction("1", 6, 0); }
	}
	}
	if( stability >= 41.5 ) { 
		if( budget >= 41.1 ) { return new Prediction("1", 1, 0); }
	if( budget < 41.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 8, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
	}
	if( approval >= 90.1 ) { 
	if( budget >= 76.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 2, 0); }
	}
		if( budget < 76.15 ) { return new Prediction("1", 8, 0); }
	}
	}
	if( budget >= 96.05 ) { 
		if( approval < 78.9 ) { return new Prediction("2", 9, 0); }
		if( approval >= 78.9 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( stability >= 82.75 ) { 
	if( approval < 73.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 19, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 39.95 ) { return new Prediction("1", 1, 0); }
		if( approval >= 39.95 ) { return new Prediction("2", 2, 0); }
	}
	}
		if( approval >= 73.1 ) { return new Prediction("2", 6, 0); }
	}
return null;
}
private Prediction runTree67() {
	if( stability < 91.65 ) { 
	if( approval < 90.1 ) { 
	if( stability >= 7.95 ) { 
	if( budget < 38.85 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 37.5 ) { 
	if( stability < 37.45 ) { 
	if( budget >= 10.75 ) { 
	if( stability >= 19.1 ) { 
		if( approval >= 35.2 ) { return new Prediction("2", 4, 0); }
	if( approval < 35.2 ) { 
		if( approval < 23.1 ) { return new Prediction("3", 3, 0); }
		if( approval >= 23.1 ) { return new Prediction("1", 6, 0); }
	}
	}
		if( stability < 19.1 ) { return new Prediction("2", 6, 0); }
	}
	if( budget < 10.75 ) { 
		if( stability >= 9.05 ) { return new Prediction("3", 7, 0); }
		if( stability < 9.05 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( stability >= 37.45 ) { return new Prediction("3", 6, 0); }
	}
	if( approval >= 37.5 ) { 
	if( budget >= 12.55 ) { 
	if( stability < 72.15 ) { 
	if( stability >= 54.05 ) { 
		if( approval >= 54.05 ) { return new Prediction("1", 5, 0); }
		if( approval < 54.05 ) { return new Prediction("3", 2, 0); }
	}
		if( stability < 54.05 ) { return new Prediction("1", 7, 0); }
	}
		if( stability >= 72.15 ) { return new Prediction("3", 3, 0); }
	}
		if( budget < 12.55 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 32.95 ) { 
		if( approval < 30.75 ) { return new Prediction("1", 5, 0); }
		if( approval >= 30.75 ) { return new Prediction("2", 36, 0); }
	}
	if( stability < 32.95 ) { 
	if( budget < 20.6 ) { 
		if( budget < 17.4 ) { return new Prediction("2", 13, 0); }
		if( budget >= 17.4 ) { return new Prediction("1", 2, 0); }
	}
	if( budget >= 20.6 ) { 
	if( approval < 30.2 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 3, 0); }
	if( budget >= 25.7 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 1, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval >= 30.2 ) { 
	if( budget < 23.05 ) { 
		if( approval >= 47.7 ) { return new Prediction("2", 1, 0); }
		if( approval < 47.7 ) { return new Prediction("3", 2, 0); }
	}
		if( budget >= 23.05 ) { return new Prediction("3", 7, 0); }
	}
	}
	}
	}
	}
	if( budget >= 38.85 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 69.7 ) { 
	if( approval >= 48.5 ) { 
	if( stability < 56.4 ) { 
		if( budget >= 58.85 ) { return new Prediction("2", 3, 0); }
	if( budget < 58.85 ) { 
		if( approval >= 51 ) { return new Prediction("1", 11, 0); }
	if( approval < 51 ) { 
		if( budget < 49.5 ) { return new Prediction("1", 6, 0); }
		if( budget >= 49.5 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( stability >= 56.4 ) { 
		if( approval < 70.3 ) { return new Prediction("3", 11, 0); }
		if( approval >= 70.3 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( approval < 48.5 ) { 
	if( approval < 39.1 ) { 
		if( stability < 40.5 ) { return new Prediction("2", 6, 0); }
		if( stability >= 40.5 ) { return new Prediction("3", 13, 0); }
	}
	if( approval >= 39.1 ) { 
	if( stability < 48.75 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 13, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 2, 0); }
	}
	if( stability >= 48.75 ) { 
		if( approval >= 43.2 ) { return new Prediction("3", 5, 0); }
		if( approval < 43.2 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	if( budget >= 69.7 ) { 
		if( stability < 82.45 ) { return new Prediction("2", 32, 0); }
		if( stability >= 82.45 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 42 ) { 
	if( stability < 45.65 ) { 
		if( approval >= 49 ) { return new Prediction("3", 17, 0); }
	if( approval < 49 ) { 
		if( approval >= 47.5 ) { return new Prediction("2", 1, 0); }
		if( approval < 47.5 ) { return new Prediction("3", 5, 0); }
	}
	}
	if( stability >= 45.65 ) { 
	if( budget >= 47.35 ) { 
	if( stability >= 51 ) { 
	if( approval >= 54.6 ) { 
	if( stability < 70.85 ) { 
	if( budget >= 55.95 ) { 
		if( approval < 63.25 ) { return new Prediction("3", 4, 0); }
	if( approval >= 63.25 ) { 
		if( stability < 59.2 ) { return new Prediction("2", 3, 0); }
	if( stability >= 59.2 ) { 
		if( approval < 72.35 ) { return new Prediction("2", 1, 0); }
		if( approval >= 72.35 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
		if( budget < 55.95 ) { return new Prediction("2", 4, 0); }
	}
		if( stability >= 70.85 ) { return new Prediction("1", 3, 0); }
	}
		if( approval < 54.6 ) { return new Prediction("1", 11, 0); }
	}
	if( stability < 51 ) { 
		if( approval >= 45.5 ) { return new Prediction("3", 8, 0); }
		if( approval < 45.5 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( budget < 47.35 ) { return new Prediction("2", 10, 0); }
	}
	}
	if( approval < 42 ) { 
	if( stability < 36.4 ) { 
		if( budget < 71.7 ) { return new Prediction("3", 5, 0); }
		if( budget >= 71.7 ) { return new Prediction("1", 3, 0); }
	}
	if( stability >= 36.4 ) { 
	if( approval >= 40.6 ) { 
		if( stability >= 43.9 ) { return new Prediction("1", 2, 0); }
		if( stability < 43.9 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 40.6 ) { return new Prediction("1", 37, 0); }
	}
	}
	}
	}
	}
	if( stability < 7.95 ) { 
	if( stability < 6.25 ) { 
	if( approval < 3 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 2.65 ) { return new Prediction("1", 1, 0); }
		if( approval < 2.65 ) { return new Prediction("3", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 5, 0); }
	}
	if( approval >= 3 ) { 
	if( approval < 4.3 ) { 
		if( approval >= 3.35 ) { return new Prediction("2", 7, 0); }
	if( approval < 3.35 ) { 
		if( budget >= 2 ) { return new Prediction("2", 2, 0); }
		if( budget < 2 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval >= 4.3 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 7.3 ) { 
	if( approval < 6.2 ) { 
		if( stability < 5.25 ) { return new Prediction("1", 1, 0); }
		if( stability >= 5.25 ) { return new Prediction("3", 4, 0); }
	}
		if( approval >= 6.2 ) { return new Prediction("1", 7, 0); }
	}
	if( budget >= 7.3 ) { 
	if( approval >= 8.1 ) { 
		if( budget >= 9.4 ) { return new Prediction("2", 1, 0); }
		if( budget < 9.4 ) { return new Prediction("1", 2, 0); }
	}
		if( approval < 8.1 ) { return new Prediction("2", 4, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( stability >= 5.95 ) { return new Prediction("2", 2, 0); }
		if( stability < 5.95 ) { return new Prediction("3", 12, 0); }
	}
	}
	}
	}
	if( stability >= 6.25 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 7 ) { return new Prediction("1", 7, 0); }
		if( approval < 7 ) { return new Prediction("3", 4, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 11, 0); }
	}
	}
	}
	if( approval >= 90.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 19, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 7, 0); }
	}
	}
		if( stability >= 91.65 ) { return new Prediction("3", 12, 0); }
return null;
}
private Prediction runTree68() {
	if( stability < 82.75 ) { 
	if( stability < 7.5 ) { 
	if( budget < 8.4 ) { 
	if( approval < 4.3 ) { 
		if( approval >= 3.35 ) { return new Prediction("2", 8, 0); }
	if( approval < 3.35 ) { 
		if( budget < 1.25 ) { return new Prediction("3", 2, 0); }
		if( budget >= 1.25 ) { return new Prediction("1", 15, 0); }
	}
	}
	if( approval >= 4.3 ) { 
		if( budget < 2.4 ) { return new Prediction("1", 15, 0); }
	if( budget >= 2.4 ) { 
		if( stability < 2.5 ) { return new Prediction("3", 5, 0); }
	if( stability >= 2.5 ) { 
		if( approval >= 9.35 ) { return new Prediction("3", 2, 0); }
	if( approval < 9.35 ) { 
	if( budget >= 3 ) { 
	if( budget < 5.35 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 1, 0); }
	}
	if( budget >= 5.35 ) { 
		if( budget >= 6.25 ) { return new Prediction("1", 4, 0); }
		if( budget < 6.25 ) { return new Prediction("3", 2, 0); }
	}
	}
		if( budget < 3 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	if( budget >= 8.4 ) { 
	if( approval >= 7.9 ) { 
		if( stability < 5.55 ) { return new Prediction("1", 2, 0); }
	if( stability >= 5.55 ) { 
		if( approval >= 9.15 ) { return new Prediction("1", 1, 0); }
		if( approval < 9.15 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( approval < 7.9 ) { return new Prediction("2", 7, 0); }
	}
	}
	if( stability >= 7.5 ) { 
	if( approval < 90.1 ) { 
	if( budget >= 97.65 ) { 
		if( approval < 29.3 ) { return new Prediction("1", 1, 0); }
		if( approval >= 29.3 ) { return new Prediction("2", 10, 0); }
	}
	if( budget < 97.65 ) { 
	if( budget < 19.1 ) { 
	if( budget >= 2.75 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 44.15 ) { 
		if( budget < 9.3 ) { return new Prediction("3", 7, 0); }
	if( budget >= 9.3 ) { 
		if( approval < 14.4 ) { return new Prediction("2", 2, 0); }
		if( approval >= 14.4 ) { return new Prediction("3", 3, 0); }
	}
	}
		if( approval >= 44.15 ) { return new Prediction("1", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 14, 0); }
	}
	if( budget < 2.75 ) { 
		if( approval >= 8.1 ) { return new Prediction("1", 2, 0); }
		if( approval < 8.1 ) { return new Prediction("2", 3, 0); }
	}
	}
	if( budget >= 19.1 ) { 
		if( stability < 13.45 ) { return new Prediction("3", 9, 0); }
	if( stability >= 13.45 ) { 
	if( budget >= 19.7 ) { 
	if( budget >= 24.75 ) { 
	if( stability >= 79.05 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 2, 0); }
	}
	if( stability < 79.05 ) { 
	if( approval >= 82.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 2, 0); }
	}
	if( approval < 82.9 ) { 
	if( approval < 56.15 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 50.9 ) { 
		if( budget < 66.7 ) { return new Prediction("3", 12, 0); }
		if( budget >= 66.7 ) { return new Prediction("2", 6, 0); }
	}
	if( stability < 50.9 ) { 
	if( budget < 51.75 ) { 
	if( approval >= 48.5 ) { 
	if( stability >= 48 ) { 
		if( budget < 50.45 ) { return new Prediction("3", 2, 0); }
		if( budget >= 50.45 ) { return new Prediction("1", 2, 0); }
	}
		if( stability < 48 ) { return new Prediction("1", 11, 0); }
	}
	if( approval < 48.5 ) { 
	if( budget >= 39 ) { 
	if( budget < 44.15 ) { 
		if( stability < 40.75 ) { return new Prediction("2", 6, 0); }
	if( stability >= 40.75 ) { 
		if( approval >= 42 ) { return new Prediction("1", 1, 0); }
		if( approval < 42 ) { return new Prediction("3", 2, 0); }
	}
	}
		if( budget >= 44.15 ) { return new Prediction("2", 16, 0); }
	}
	if( budget < 39 ) { 
	if( approval < 37.5 ) { 
		if( stability >= 37.15 ) { return new Prediction("3", 3, 0); }
	if( stability < 37.15 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 4, 0); }
	if( budget >= 29.9 ) { 
		if( approval >= 36.5 ) { return new Prediction("2", 4, 1); }
		if( approval < 36.5 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
		if( approval >= 37.5 ) { return new Prediction("1", 10, 0); }
	}
	}
	}
		if( budget >= 51.75 ) { return new Prediction("2", 10, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 51.15 ) { 
		if( budget < 42.1 ) { return new Prediction("2", 2, 0); }
		if( budget >= 42.1 ) { return new Prediction("1", 21, 0); }
	}
	if( stability < 51.15 ) { 
	if( budget < 40.15 ) { 
		if( approval < 23 ) { return new Prediction("1", 1, 0); }
	if( approval >= 23 ) { 
		if( stability >= 38.05 ) { return new Prediction("2", 8, 0); }
	if( stability < 38.05 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 11, 0); }
	if( budget < 31.95 ) { 
	if( budget < 28.75 ) { 
		if( approval >= 42.4 ) { return new Prediction("3", 1, 0); }
	if( approval < 42.4 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 2, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( budget >= 28.75 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
	}
	if( budget >= 40.15 ) { 
	if( approval >= 42 ) { 
	if( approval < 45 ) { 
	if( stability >= 42 ) { 
		if( budget < 44.95 ) { return new Prediction("2", 2, 0); }
		if( budget >= 44.95 ) { return new Prediction("1", 2, 0); }
	}
		if( stability < 42 ) { return new Prediction("3", 3, 0); }
	}
		if( approval >= 45 ) { return new Prediction("3", 10, 0); }
	}
	if( approval < 42 ) { 
	if( stability >= 36.9 ) { 
	if( stability < 40.4 ) { 
		if( approval >= 39 ) { return new Prediction("3", 1, 0); }
		if( approval < 39 ) { return new Prediction("1", 6, 0); }
	}
		if( stability >= 40.4 ) { return new Prediction("1", 16, 0); }
	}
	if( stability < 36.9 ) { 
		if( approval < 31.8 ) { return new Prediction("1", 1, 0); }
		if( approval >= 31.8 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	}
	}
	if( approval >= 56.15 ) { 
	if( stability < 53.55 ) { 
	if( budget < 87.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 2, 0); }
	if( "positive".equals(type) ) { 
	if( budget < 52.75 ) { 
		if( approval >= 68.7 ) { return new Prediction("3", 1, 0); }
		if( approval < 68.7 ) { return new Prediction("2", 2, 0); }
	}
		if( budget >= 52.75 ) { return new Prediction("3", 11, 0); }
	}
	}
		if( budget >= 87.7 ) { return new Prediction("2", 4, 0); }
	}
	if( stability >= 53.55 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 75.6 ) { 
		if( budget >= 64.2 ) { return new Prediction("2", 4, 0); }
	if( budget < 64.2 ) { 
	if( approval < 62.05 ) { 
		if( stability < 57 ) { return new Prediction("1", 2, 0); }
		if( stability >= 57 ) { return new Prediction("3", 3, 0); }
	}
		if( approval >= 62.05 ) { return new Prediction("1", 7, 0); }
	}
	}
		if( stability >= 75.6 ) { return new Prediction("3", 3, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget >= 66.2 ) { 
		if( approval >= 70.4 ) { return new Prediction("3", 3, 0); }
		if( approval < 70.4 ) { return new Prediction("1", 1, 0); }
	}
		if( budget < 66.2 ) { return new Prediction("2", 16, 0); }
	}
	}
	}
	}
	}
	}
	if( budget < 24.75 ) { 
	if( approval < 31.95 ) { 
	if( approval < 25.4 ) { 
		if( stability >= 19.1 ) { return new Prediction("3", 3, 0); }
		if( stability < 19.1 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 25.4 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 31.95 ) { return new Prediction("3", 4, 0); }
	}
	}
		if( budget < 19.7 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
	}
	if( approval >= 90.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 16, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 98.3 ) { return new Prediction("3", 10, 0); }
		if( approval >= 98.3 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	if( stability >= 82.75 ) { 
	if( budget < 79.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 25, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 7, 0); }
	}
	if( budget >= 79.2 ) { 
		if( approval >= 42.7 ) { return new Prediction("3", 1, 0); }
		if( approval < 42.7 ) { return new Prediction("1", 4, 0); }
	}
	}
return null;
}
private Prediction runTree69() {
	if( approval < 50.4 ) { 
	if( budget >= 78.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 10, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 11, 0); }
	}
	if( budget < 78.55 ) { 
	if( budget < 38.85 ) { 
	if( budget < 38.1 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 7.35 ) { 
		if( budget >= 6.7 ) { return new Prediction("2", 6, 0); }
	if( budget < 6.7 ) { 
		if( stability >= 2.8 ) { return new Prediction("3", 13, 0); }
		if( stability < 2.8 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( approval >= 7.35 ) { 
	if( stability < 13.8 ) { 
		if( budget < 9.55 ) { return new Prediction("1", 20, 0); }
		if( budget >= 9.55 ) { return new Prediction("2", 6, 0); }
	}
	if( stability >= 13.8 ) { 
	if( approval >= 36.5 ) { 
		if( budget >= 37.75 ) { return new Prediction("1", 6, 0); }
	if( budget < 37.75 ) { 
		if( stability < 37.3 ) { return new Prediction("1", 4, 0); }
		if( stability >= 37.3 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval < 36.5 ) { 
	if( approval >= 27.3 ) { 
		if( stability >= 37.15 ) { return new Prediction("3", 8, 0); }
	if( stability < 37.15 ) { 
		if( approval >= 35.2 ) { return new Prediction("2", 1, 0); }
		if( approval < 35.2 ) { return new Prediction("1", 4, 0); }
	}
	}
	if( approval < 27.3 ) { 
		if( stability >= 19.1 ) { return new Prediction("3", 10, 0); }
	if( stability < 19.1 ) { 
		if( budget < 14.45 ) { return new Prediction("3", 1, 0); }
		if( budget >= 14.45 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 4.4 ) { 
	if( approval < 31.2 ) { 
	if( approval < 5.35 ) { 
	if( stability >= 4.7 ) { 
		if( stability >= 7.3 ) { return new Prediction("2", 1, 0); }
		if( stability < 7.3 ) { return new Prediction("1", 10, 0); }
	}
		if( stability < 4.7 ) { return new Prediction("2", 3, 0); }
	}
	if( approval >= 5.35 ) { 
		if( budget >= 28 ) { return new Prediction("1", 4, 0); }
		if( budget < 28 ) { return new Prediction("2", 25, 0); }
	}
	}
	if( approval >= 31.2 ) { 
	if( approval < 35.5 ) { 
		if( stability < 35.9 ) { return new Prediction("3", 7, 0); }
	if( stability >= 35.9 ) { 
		if( approval >= 33.95 ) { return new Prediction("1", 3, 0); }
		if( approval < 33.95 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( approval >= 35.5 ) { 
	if( stability >= 33 ) { 
		if( approval >= 36.5 ) { return new Prediction("2", 11, 0); }
	if( approval < 36.5 ) { 
		if( budget < 33.6 ) { return new Prediction("2", 2, 0); }
	if( budget >= 33.6 ) { 
		if( stability < 39 ) { return new Prediction("3", 1, 0); }
		if( stability >= 39 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
		if( stability < 33 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	if( stability < 4.4 ) { 
	if( approval < 4.15 ) { 
		if( approval >= 3.35 ) { return new Prediction("2", 2, 0); }
		if( approval < 3.35 ) { return new Prediction("1", 2, 0); }
	}
		if( approval >= 4.15 ) { return new Prediction("3", 13, 0); }
	}
	}
	}
		if( budget >= 38.1 ) { return new Prediction("2", 7, 0); }
	}
	if( budget >= 38.85 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 47.8 ) { 
		if( stability < 41.25 ) { return new Prediction("2", 15, 0); }
	if( stability >= 41.25 ) { 
		if( stability >= 70.15 ) { return new Prediction("3", 7, 0); }
	if( stability < 70.15 ) { 
		if( approval < 39.1 ) { return new Prediction("3", 7, 0); }
		if( approval >= 39.1 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	if( approval >= 47.8 ) { 
	if( stability < 48.75 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 15, 0); }
	if( approval < 48.5 ) { 
		if( stability < 43.55 ) { return new Prediction("2", 2, 0); }
	if( stability >= 43.55 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 2, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
		if( stability >= 48.75 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( stability < 34.4 ) { return new Prediction("3", 9, 0); }
	if( stability >= 34.4 ) { 
	if( stability < 46.75 ) { 
	if( approval < 45 ) { 
		if( stability >= 38.55 ) { return new Prediction("1", 14, 0); }
	if( stability < 38.55 ) { 
		if( approval >= 36.5 ) { return new Prediction("3", 3, 0); }
		if( approval < 36.5 ) { return new Prediction("1", 4, 0); }
	}
	}
	if( approval >= 45 ) { 
	if( budget < 45.55 ) { 
		if( budget < 42.1 ) { return new Prediction("3", 1, 0); }
		if( budget >= 42.1 ) { return new Prediction("2", 1, 0); }
	}
		if( budget >= 45.55 ) { return new Prediction("3", 8, 0); }
	}
	}
		if( stability >= 46.75 ) { return new Prediction("1", 15, 0); }
	}
	}
	}
	}
	}
	if( approval >= 50.4 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 51.3 ) { 
		if( budget < 52.9 ) { return new Prediction("1", 7, 0); }
	if( budget >= 52.9 ) { 
		if( approval < 82.5 ) { return new Prediction("2", 14, 0); }
		if( approval >= 82.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( stability >= 51.3 ) { 
	if( budget >= 76.95 ) { 
		if( approval < 87.5 ) { return new Prediction("2", 9, 0); }
		if( approval >= 87.5 ) { return new Prediction("1", 2, 0); }
	}
	if( budget < 76.95 ) { 
	if( approval >= 72.45 ) { 
		if( stability >= 89.2 ) { return new Prediction("3", 1, 0); }
		if( stability < 89.2 ) { return new Prediction("1", 7, 0); }
	}
	if( approval < 72.45 ) { 
	if( stability < 66.8 ) { 
		if( approval < 54 ) { return new Prediction("3", 5, 0); }
	if( approval >= 54 ) { 
	if( approval < 61.55 ) { 
		if( stability < 57 ) { return new Prediction("1", 2, 0); }
		if( stability >= 57 ) { return new Prediction("3", 3, 0); }
	}
		if( approval >= 61.55 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( stability >= 66.8 ) { return new Prediction("3", 16, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 40.9 ) { 
		if( budget < 32.1 ) { return new Prediction("2", 16, 0); }
	if( budget >= 32.1 ) { 
		if( stability < 39.5 ) { return new Prediction("3", 2, 0); }
		if( stability >= 39.5 ) { return new Prediction("2", 7, 0); }
	}
	}
	if( budget >= 40.9 ) { 
	if( stability < 55.15 ) { 
	if( budget < 49.95 ) { 
		if( approval < 62.9 ) { return new Prediction("2", 1, 0); }
		if( approval >= 62.9 ) { return new Prediction("3", 2, 0); }
	}
		if( budget >= 49.95 ) { return new Prediction("3", 39, 0); }
	}
	if( stability >= 55.15 ) { 
	if( approval >= 67.55 ) { 
		if( budget >= 74.65 ) { return new Prediction("3", 4, 0); }
		if( budget < 74.65 ) { return new Prediction("2", 6, 0); }
	}
		if( approval < 67.55 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree70() {
		if( budget >= 97.65 ) { return new Prediction("2", 11, 0); }
	if( budget < 97.65 ) { 
		if( stability >= 92.55 ) { return new Prediction("3", 9, 0); }
	if( stability < 92.55 ) { 
	if( approval < 50.4 ) { 
	if( budget < 67.85 ) { 
	if( budget < 61.8 ) { 
	if( budget >= 6.85 ) { 
	if( approval >= 48.5 ) { 
		if( budget < 30.75 ) { return new Prediction("3", 2, 0); }
		if( budget >= 30.75 ) { return new Prediction("1", 9, 0); }
	}
	if( approval < 48.5 ) { 
	if( approval >= 4.35 ) { 
	if( stability >= 19.55 ) { 
	if( approval < 31.25 ) { 
	if( budget >= 30.95 ) { 
		if( budget >= 47.95 ) { return new Prediction("1", 4, 0); }
	if( budget < 47.95 ) { 
	if( budget >= 33.45 ) { 
		if( stability >= 37.6 ) { return new Prediction("3", 5, 0); }
	if( stability < 37.6 ) { 
		if( approval < 29.3 ) { return new Prediction("3", 2, 0); }
		if( approval >= 29.3 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( budget < 33.45 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( budget < 30.95 ) { 
	if( budget < 22.6 ) { 
		if( stability >= 26.75 ) { return new Prediction("3", 6, 0); }
	if( stability < 26.75 ) { 
		if( approval >= 15 ) { return new Prediction("1", 3, 0); }
		if( approval < 15 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( budget >= 22.6 ) { return new Prediction("1", 12, 0); }
	}
	}
	if( approval >= 31.25 ) { 
	if( budget >= 35.5 ) { 
	if( approval < 37.5 ) { 
	if( stability >= 37.95 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 9, 0); }
	}
	if( stability < 37.95 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 37.6 ) { return new Prediction("3", 1, 0); }
	if( stability < 37.6 ) { 
	if( approval >= 36.5 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 2, 0); }
		if( budget < 39.15 ) { return new Prediction("1", 2, 0); }
	}
		if( approval < 36.5 ) { return new Prediction("2", 3, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( stability < 36.4 ) { return new Prediction("3", 9, 0); }
		if( stability >= 36.4 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( approval >= 37.5 ) { 
	if( budget < 49.5 ) { 
	if( stability >= 38.55 ) { 
	if( budget < 46.95 ) { 
	if( budget >= 41.9 ) { 
		if( budget < 43.95 ) { return new Prediction("1", 1, 0); }
		if( budget >= 43.95 ) { return new Prediction("2", 2, 0); }
	}
		if( budget < 41.9 ) { return new Prediction("2", 12, 0); }
	}
	if( budget >= 46.95 ) { 
	if( stability >= 47.4 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 2, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 5, 0); }
	}
	if( stability < 47.4 ) { 
		if( stability < 43.15 ) { return new Prediction("3", 3, 0); }
	if( stability >= 43.15 ) { 
		if( approval >= 45.5 ) { return new Prediction("3", 1, 0); }
		if( approval < 45.5 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	if( stability < 38.55 ) { 
		if( budget < 39.35 ) { return new Prediction("1", 7, 0); }
		if( budget >= 39.35 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( budget >= 49.5 ) { 
		if( stability < 42.75 ) { return new Prediction("2", 8, 0); }
	if( stability >= 42.75 ) { 
		if( approval >= 47.5 ) { return new Prediction("2", 2, 0); }
		if( approval < 47.5 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	}
	if( budget < 35.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 2, 0); }
	if( "positive".equals(type) ) { 
		if( stability >= 33.25 ) { return new Prediction("2", 15, 0); }
	if( stability < 33.25 ) { 
		if( approval < 40.05 ) { return new Prediction("3", 1, 0); }
		if( approval >= 40.05 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	}
	if( stability < 19.55 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 9.55 ) { 
		if( approval >= 8.1 ) { return new Prediction("1", 4, 0); }
		if( approval < 8.1 ) { return new Prediction("2", 3, 0); }
	}
		if( budget >= 9.55 ) { return new Prediction("2", 9, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget >= 16.4 ) { return new Prediction("3", 5, 0); }
	if( budget < 16.4 ) { 
		if( approval >= 10.5 ) { return new Prediction("2", 4, 0); }
		if( approval < 10.5 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
		if( approval < 4.35 ) { return new Prediction("2", 8, 0); }
	}
	}
	if( budget < 6.85 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 4.65 ) { 
	if( stability < 3 ) { 
		if( approval < 3.2 ) { return new Prediction("1", 1, 0); }
		if( approval >= 3.2 ) { return new Prediction("2", 3, 0); }
	}
		if( stability >= 3 ) { return new Prediction("3", 9, 0); }
	}
	if( approval >= 4.65 ) { 
	if( stability >= 6 ) { 
		if( approval < 7.05 ) { return new Prediction("3", 2, 0); }
	if( approval >= 7.05 ) { 
		if( stability >= 9.05 ) { return new Prediction("3", 1, 0); }
		if( stability < 9.05 ) { return new Prediction("1", 9, 0); }
	}
	}
		if( stability < 6 ) { return new Prediction("1", 13, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 4.65 ) { 
	if( approval < 5.35 ) { 
		if( stability < 7.4 ) { return new Prediction("1", 8, 0); }
		if( stability >= 7.4 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 5.35 ) { return new Prediction("2", 12, 0); }
	}
	if( stability < 4.65 ) { 
		if( approval >= 4.25 ) { return new Prediction("3", 15, 0); }
	if( approval < 4.25 ) { 
		if( approval >= 2.45 ) { return new Prediction("2", 2, 0); }
		if( approval < 2.45 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
		if( budget >= 61.8 ) { return new Prediction("3", 3, 0); }
	}
	if( budget >= 67.85 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 11, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 13, 0); }
	}
	}
	if( approval >= 50.4 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 85.85 ) { 
		if( budget >= 73.95 ) { return new Prediction("2", 13, 0); }
	if( budget < 73.95 ) { 
	if( stability < 64.8 ) { 
		if( budget >= 58 ) { return new Prediction("2", 3, 0); }
	if( budget < 58 ) { 
		if( budget < 44.35 ) { return new Prediction("1", 7, 0); }
	if( budget >= 44.35 ) { 
	if( stability < 54.2 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 2, 0); }
	if( approval < 51.5 ) { 
		if( stability < 48.05 ) { return new Prediction("1", 2, 0); }
		if( stability >= 48.05 ) { return new Prediction("3", 2, 0); }
	}
	}
		if( stability >= 54.2 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
		if( stability >= 64.8 ) { return new Prediction("3", 16, 0); }
	}
	}
		if( approval >= 85.85 ) { return new Prediction("1", 15, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability < 61.8 ) { 
	if( budget < 32.1 ) { 
	if( approval < 70.85 ) { 
		if( approval >= 64.3 ) { return new Prediction("3", 1, 0); }
		if( approval < 64.3 ) { return new Prediction("2", 4, 0); }
	}
		if( approval >= 70.85 ) { return new Prediction("2", 8, 0); }
	}
	if( budget >= 32.1 ) { 
	if( stability >= 51.4 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 1, 0); }
	if( approval >= 56.35 ) { 
		if( approval >= 79.05 ) { return new Prediction("3", 5, 0); }
	if( approval < 79.05 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 2, 0); }
	if( budget >= 52.75 ) { 
		if( approval >= 76.2 ) { return new Prediction("2", 1, 0); }
		if( approval < 76.2 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	}
		if( stability < 51.4 ) { return new Prediction("3", 34, 0); }
	}
	}
	if( stability >= 61.8 ) { 
		if( budget < 71.65 ) { return new Prediction("2", 26, 0); }
	if( budget >= 71.65 ) { 
		if( approval < 76 ) { return new Prediction("1", 2, 0); }
		if( approval >= 76 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree71() {
	if( stability < 91.65 ) { 
	if( approval >= 40.6 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 77.1 ) { 
	if( stability < 49.9 ) { 
	if( approval >= 48.5 ) { 
		if( budget < 52.85 ) { return new Prediction("1", 7, 0); }
		if( budget >= 52.85 ) { return new Prediction("2", 10, 0); }
	}
	if( approval < 48.5 ) { 
		if( budget < 43.25 ) { return new Prediction("1", 1, 0); }
		if( budget >= 43.25 ) { return new Prediction("2", 18, 0); }
	}
	}
	if( stability >= 49.9 ) { 
	if( stability < 83.7 ) { 
		if( budget >= 68.75 ) { return new Prediction("2", 14, 0); }
	if( budget < 68.75 ) { 
		if( approval < 51.85 ) { return new Prediction("3", 8, 0); }
	if( approval >= 51.85 ) { 
	if( budget >= 32.85 ) { 
		if( stability < 57 ) { return new Prediction("1", 4, 0); }
	if( stability >= 57 ) { 
	if( budget >= 57.5 ) { 
		if( budget >= 63.05 ) { return new Prediction("3", 3, 0); }
		if( budget < 63.05 ) { return new Prediction("1", 1, 0); }
	}
		if( budget < 57.5 ) { return new Prediction("3", 6, 0); }
	}
	}
		if( budget < 32.85 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
		if( stability >= 83.7 ) { return new Prediction("3", 9, 0); }
	}
	}
	if( approval >= 77.1 ) { 
	if( budget >= 81.25 ) { 
		if( approval < 87.5 ) { return new Prediction("2", 2, 0); }
		if( approval >= 87.5 ) { return new Prediction("1", 7, 0); }
	}
		if( budget < 81.25 ) { return new Prediction("1", 16, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 51.1 ) { 
	if( approval < 56.35 ) { 
		if( budget >= 42.85 ) { return new Prediction("1", 13, 0); }
		if( budget < 42.85 ) { return new Prediction("2", 5, 0); }
	}
	if( approval >= 56.35 ) { 
	if( budget < 71.65 ) { 
		if( approval >= 59.65 ) { return new Prediction("2", 26, 0); }
	if( approval < 59.65 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 4, 0); }
		if( budget >= 52.75 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( budget >= 71.65 ) { 
		if( approval >= 70.4 ) { return new Prediction("3", 4, 0); }
		if( approval < 70.4 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( stability < 51.1 ) { 
	if( budget < 45.55 ) { 
	if( budget >= 22.15 ) { 
		if( stability >= 38.6 ) { return new Prediction("2", 5, 0); }
		if( stability < 38.6 ) { return new Prediction("3", 14, 0); }
	}
		if( budget < 22.15 ) { return new Prediction("2", 6, 0); }
	}
	if( budget >= 45.55 ) { 
	if( approval < 44.5 ) { 
		if( approval >= 42 ) { return new Prediction("1", 1, 0); }
		if( approval < 42 ) { return new Prediction("3", 2, 0); }
	}
		if( approval >= 44.5 ) { return new Prediction("3", 39, 0); }
	}
	}
	}
	}
	if( approval < 40.6 ) { 
	if( approval >= 36.5 ) { 
		if( budget < 34.5 ) { return new Prediction("2", 4, 0); }
	if( budget >= 34.5 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 39.2 ) { 
		if( budget < 63.7 ) { return new Prediction("3", 2, 0); }
		if( budget >= 63.7 ) { return new Prediction("2", 3, 0); }
	}
	if( budget < 39.2 ) { 
		if( budget >= 37.75 ) { return new Prediction("2", 3, 1); }
		if( budget < 37.75 ) { return new Prediction("1", 3, 0); }
	}
	}
		if( "positive".equals(type) ) { return new Prediction("1", 10, 0); }
	}
	}
	if( approval < 36.5 ) { 
	if( budget < 64.1 ) { 
	if( stability < 42.6 ) { 
	if( budget < 7.35 ) { 
	if( approval < 7.4 ) { 
		if( budget >= 5.95 ) { return new Prediction("1", 7, 0); }
	if( budget < 5.95 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 5.2 ) { 
	if( approval >= 6.05 ) { 
		if( stability < 3.8 ) { return new Prediction("1", 1, 0); }
		if( stability >= 3.8 ) { return new Prediction("3", 3, 0); }
	}
		if( approval < 6.05 ) { return new Prediction("1", 2, 0); }
	}
	if( approval < 5.2 ) { 
	if( stability < 3 ) { 
		if( approval < 3.2 ) { return new Prediction("1", 1, 0); }
		if( approval >= 3.2 ) { return new Prediction("2", 3, 0); }
	}
		if( stability >= 3 ) { return new Prediction("3", 13, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 3.4 ) { 
	if( approval < 5.15 ) { 
		if( budget < 2.5 ) { return new Prediction("2", 3, 0); }
		if( budget >= 2.5 ) { return new Prediction("1", 6, 0); }
	}
		if( approval >= 5.15 ) { return new Prediction("2", 8, 0); }
	}
		if( stability < 3.4 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( approval >= 7.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 21, 0); }
	if( "positive".equals(type) ) { 
		if( budget < 6.2 ) { return new Prediction("3", 8, 0); }
	if( budget >= 6.2 ) { 
		if( approval >= 8.65 ) { return new Prediction("2", 1, 0); }
		if( approval < 8.65 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	if( budget >= 7.35 ) { 
	if( stability >= 37.95 ) { 
		if( budget < 30.9 ) { return new Prediction("3", 1, 0); }
		if( budget >= 30.9 ) { return new Prediction("1", 7, 0); }
	}
	if( stability < 37.95 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 38.55 ) { 
	if( approval >= 8.1 ) { 
		if( approval < 10.1 ) { return new Prediction("1", 4, 0); }
	if( approval >= 10.1 ) { 
	if( approval < 29 ) { 
	if( stability >= 19.1 ) { 
		if( approval < 23.65 ) { return new Prediction("3", 4, 0); }
		if( approval >= 23.65 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 19.1 ) { return new Prediction("2", 3, 0); }
	}
	if( approval >= 29 ) { 
		if( budget < 32.55 ) { return new Prediction("1", 6, 0); }
	if( budget >= 32.55 ) { 
		if( approval < 35.5 ) { return new Prediction("3", 1, 0); }
		if( approval >= 35.5 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
		if( approval < 8.1 ) { return new Prediction("2", 8, 0); }
	}
		if( budget >= 38.55 ) { return new Prediction("2", 9, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 33.6 ) { 
	if( approval < 16.05 ) { 
		if( stability < 15.05 ) { return new Prediction("3", 5, 0); }
		if( stability >= 15.05 ) { return new Prediction("1", 2, 0); }
	}
	if( approval >= 16.05 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 6, 0); }
	if( budget >= 25.7 ) { 
	if( budget >= 28.45 ) { 
		if( budget >= 29.65 ) { return new Prediction("2", 4, 0); }
		if( budget < 29.65 ) { return new Prediction("1", 1, 0); }
	}
		if( budget < 28.45 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	if( budget >= 33.6 ) { 
		if( budget >= 36.75 ) { return new Prediction("3", 5, 0); }
	if( budget < 36.75 ) { 
		if( approval >= 33 ) { return new Prediction("3", 2, 0); }
		if( approval < 33 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	}
	}
	}
	if( stability >= 42.6 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 13, 0); }
	if( "positive".equals(type) ) { 
		if( approval >= 25.95 ) { return new Prediction("2", 5, 0); }
		if( approval < 25.95 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	if( budget >= 64.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 8, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 16, 0); }
	}
	}
	}
	}
		if( stability >= 91.65 ) { return new Prediction("3", 9, 0); }
return null;
}
private Prediction runTree72() {
	if( stability < 7.45 ) { 
	if( approval >= 2.9 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 6.9 ) { 
	if( stability >= 4.15 ) { 
		if( stability < 5.25 ) { return new Prediction("1", 2, 0); }
		if( stability >= 5.25 ) { return new Prediction("3", 6, 0); }
	}
		if( stability < 4.15 ) { return new Prediction("2", 7, 0); }
	}
	if( approval >= 6.9 ) { 
		if( budget < 9.55 ) { return new Prediction("1", 25, 0); }
		if( budget >= 9.55 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 4 ) { 
		if( stability >= 3.5 ) { return new Prediction("2", 9, 0); }
	if( stability < 3.5 ) { 
		if( approval >= 3.95 ) { return new Prediction("3", 3, 0); }
		if( approval < 3.95 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( budget >= 4 ) { 
	if( stability >= 4.6 ) { 
		if( approval < 5.35 ) { return new Prediction("1", 5, 0); }
	if( approval >= 5.35 ) { 
		if( approval < 7.6 ) { return new Prediction("2", 1, 0); }
		if( approval >= 7.6 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( stability < 4.6 ) { return new Prediction("3", 7, 0); }
	}
	}
	}
		if( approval < 2.9 ) { return new Prediction("1", 13, 0); }
	}
	if( stability >= 7.45 ) { 
	if( approval < 12.85 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 52.35 ) { return new Prediction("2", 4, 0); }
		if( budget < 52.35 ) { return new Prediction("3", 7, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 11, 0); }
	}
	if( approval >= 12.85 ) { 
	if( approval >= 21.5 ) { 
	if( stability >= 77.25 ) { 
	if( budget >= 32.2 ) { 
	if( stability < 87.7 ) { 
	if( approval < 70.3 ) { 
		if( stability < 87.15 ) { return new Prediction("3", 8, 0); }
		if( stability >= 87.15 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 70.3 ) { return new Prediction("2", 3, 0); }
	}
		if( stability >= 87.7 ) { return new Prediction("3", 10, 0); }
	}
	if( budget < 32.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 9, 0); }
	}
	}
	if( stability < 77.25 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 49.5 ) { 
	if( stability < 35.65 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 3, 0); }
	if( budget < 39.15 ) { 
	if( approval < 37.5 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 4, 0); }
	if( budget >= 29.9 ) { 
		if( approval < 32.5 ) { return new Prediction("2", 1, 0); }
		if( approval >= 32.5 ) { return new Prediction("1", 6, 2); }
	}
	}
		if( approval >= 37.5 ) { return new Prediction("1", 11, 0); }
	}
	}
	if( stability >= 35.65 ) { 
	if( approval < 45 ) { 
		if( budget < 44.15 ) { return new Prediction("3", 16, 0); }
		if( budget >= 44.15 ) { return new Prediction("2", 2, 0); }
	}
	if( approval >= 45 ) { 
	if( budget >= 24.75 ) { 
	if( stability < 49.55 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 7, 0); }
	if( approval < 48.5 ) { 
		if( budget < 43.25 ) { return new Prediction("1", 3, 0); }
	if( budget >= 43.25 ) { 
	if( approval >= 47.5 ) { 
		if( stability >= 44.3 ) { return new Prediction("1", 4, 0); }
		if( stability < 44.3 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( stability >= 49.55 ) { 
		if( approval >= 59.4 ) { return new Prediction("1", 6, 0); }
		if( approval < 59.4 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( budget < 24.75 ) { 
		if( stability < 54.7 ) { return new Prediction("1", 1, 0); }
		if( stability >= 54.7 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	if( budget >= 49.5 ) { 
		if( approval >= 84.35 ) { return new Prediction("1", 10, 0); }
	if( approval < 84.35 ) { 
	if( budget < 69.95 ) { 
	if( approval < 56 ) { 
	if( stability < 49.4 ) { 
		if( stability < 42.3 ) { return new Prediction("2", 17, 0); }
	if( stability >= 42.3 ) { 
	if( budget >= 50.95 ) { 
	if( approval >= 53 ) { 
		if( stability < 45.1 ) { return new Prediction("2", 1, 0); }
		if( stability >= 45.1 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 53 ) { return new Prediction("2", 8, 0); }
	}
		if( budget < 50.95 ) { return new Prediction("1", 4, 0); }
	}
	}
	if( stability >= 49.4 ) { 
		if( approval >= 43.2 ) { return new Prediction("3", 3, 0); }
	if( approval < 43.2 ) { 
		if( approval < 37.65 ) { return new Prediction("3", 1, 0); }
		if( approval >= 37.65 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( approval >= 56 ) { 
	if( approval < 69 ) { 
		if( stability < 57 ) { return new Prediction("1", 2, 0); }
		if( stability >= 57 ) { return new Prediction("3", 5, 0); }
	}
		if( approval >= 69 ) { return new Prediction("1", 3, 0); }
	}
	}
		if( budget >= 69.95 ) { return new Prediction("2", 22, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 36.55 ) { 
	if( approval >= 47.5 ) { 
	if( stability >= 60.55 ) { 
	if( budget < 72.65 ) { 
		if( stability < 61.9 ) { return new Prediction("1", 2, 0); }
		if( stability >= 61.9 ) { return new Prediction("2", 6, 0); }
	}
		if( budget >= 72.65 ) { return new Prediction("3", 2, 0); }
	}
	if( stability < 60.55 ) { 
	if( budget < 45.55 ) { 
		if( stability < 38.1 ) { return new Prediction("3", 3, 0); }
		if( stability >= 38.1 ) { return new Prediction("2", 5, 0); }
	}
	if( budget >= 45.55 ) { 
	if( stability >= 51.4 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 1, 0); }
		if( budget >= 52.75 ) { return new Prediction("3", 8, 0); }
	}
		if( stability < 51.4 ) { return new Prediction("3", 41, 0); }
	}
	}
	}
	if( approval < 47.5 ) { 
		if( stability < 36.4 ) { return new Prediction("3", 16, 0); }
	if( stability >= 36.4 ) { 
	if( budget >= 39.8 ) { 
	if( stability < 44.25 ) { 
		if( approval < 39.25 ) { return new Prediction("1", 6, 0); }
		if( approval >= 39.25 ) { return new Prediction("3", 9, 0); }
	}
	if( stability >= 44.25 ) { 
	if( approval >= 45.7 ) { 
		if( stability >= 49 ) { return new Prediction("1", 4, 0); }
		if( stability < 49 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 45.7 ) { return new Prediction("1", 15, 0); }
	}
	}
	if( budget < 39.8 ) { 
		if( approval < 38.5 ) { return new Prediction("1", 2, 0); }
		if( approval >= 38.5 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	}
	if( budget < 36.55 ) { 
	if( stability >= 33 ) { 
		if( approval < 28.5 ) { return new Prediction("1", 1, 0); }
		if( approval >= 28.5 ) { return new Prediction("2", 24, 0); }
	}
	if( stability < 33 ) { 
		if( budget < 20.6 ) { return new Prediction("2", 4, 0); }
	if( budget >= 20.6 ) { 
	if( budget >= 29.35 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 1, 0); }
		if( budget < 31.95 ) { return new Prediction("2", 2, 0); }
	}
		if( budget < 29.35 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	}
	}
	if( approval < 21.5 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 16.55 ) { return new Prediction("1", 1, 0); }
		if( approval >= 16.55 ) { return new Prediction("3", 3, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 14, 0); }
	}
	}
	}
return null;
}
private Prediction runTree73() {
	if( stability < 82.75 ) { 
	if( stability >= 76.75 ) { 
	if( stability < 82.35 ) { 
	if( budget >= 37.3 ) { 
		if( budget < 40.65 ) { return new Prediction("3", 1, 0); }
		if( budget >= 40.65 ) { return new Prediction("1", 3, 0); }
	}
		if( budget < 37.3 ) { return new Prediction("1", 9, 0); }
	}
		if( stability >= 82.35 ) { return new Prediction("2", 1, 0); }
	}
	if( stability < 76.75 ) { 
	if( approval < 45.3 ) { 
	if( approval < 39.1 ) { 
	if( budget >= 65.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 13, 0); }
	}
	if( budget < 65.5 ) { 
		if( budget >= 54.75 ) { return new Prediction("3", 5, 0); }
	if( budget < 54.75 ) { 
		if( approval < 1.9 ) { return new Prediction("1", 5, 0); }
	if( approval >= 1.9 ) { 
	if( budget >= 1.6 ) { 
	if( budget < 44.15 ) { 
	if( budget < 7.35 ) { 
	if( stability < 8.6 ) { 
	if( stability < 3.3 ) { 
	if( approval >= 5.85 ) { 
		if( approval < 9.85 ) { return new Prediction("1", 3, 0); }
		if( approval >= 9.85 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 5.85 ) { return new Prediction("3", 6, 0); }
	}
	if( stability >= 3.3 ) { 
		if( approval >= 9.7 ) { return new Prediction("3", 3, 0); }
	if( approval < 9.7 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 7 ) { return new Prediction("1", 14, 0); }
	if( approval < 7 ) { 
		if( stability >= 4.45 ) { return new Prediction("3", 5, 0); }
	if( stability < 4.45 ) { 
		if( budget >= 6.05 ) { return new Prediction("2", 2, 0); }
		if( budget < 6.05 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 5.35 ) { 
		if( budget >= 2.9 ) { return new Prediction("1", 12, 0); }
	if( budget < 2.9 ) { 
		if( approval < 2.7 ) { return new Prediction("1", 1, 0); }
		if( approval >= 2.7 ) { return new Prediction("2", 4, 0); }
	}
	}
		if( approval >= 5.35 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
	if( stability >= 8.6 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 1, 0); }
	}
	}
	if( budget >= 7.35 ) { 
	if( budget < 23.1 ) { 
	if( stability >= 21.85 ) { 
		if( budget < 21.9 ) { return new Prediction("3", 11, 0); }
		if( budget >= 21.9 ) { return new Prediction("2", 2, 0); }
	}
	if( stability < 21.85 ) { 
	if( approval < 30.7 ) { 
	if( budget >= 9 ) { 
	if( stability >= 16.95 ) { 
		if( approval >= 22.5 ) { return new Prediction("2", 3, 0); }
		if( approval < 22.5 ) { return new Prediction("1", 2, 0); }
	}
		if( stability < 16.95 ) { return new Prediction("2", 6, 0); }
	}
	if( budget < 9 ) { 
	if( approval < 8.25 ) { 
		if( approval < 4.75 ) { return new Prediction("3", 1, 0); }
		if( approval >= 4.75 ) { return new Prediction("2", 5, 0); }
	}
	if( approval >= 8.25 ) { 
	if( approval >= 9.45 ) { 
		if( stability >= 12.3 ) { return new Prediction("3", 2, 0); }
	if( stability < 12.3 ) { 
		if( approval >= 11.8 ) { return new Prediction("2", 1, 0); }
		if( approval < 11.8 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( approval < 9.45 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( approval >= 30.7 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( budget >= 23.1 ) { 
	if( stability >= 39.85 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 8, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 6, 0); }
	}
	if( stability < 39.85 ) { 
	if( stability >= 33.75 ) { 
	if( budget < 34.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 4, 0); }
	}
	if( budget >= 34.2 ) { 
		if( budget >= 38.35 ) { return new Prediction("1", 7, 0); }
	if( budget < 38.35 ) { 
		if( budget >= 35.85 ) { return new Prediction("2", 4, 0); }
		if( budget < 35.85 ) { return new Prediction("1", 6, 0); }
	}
	}
	}
	if( stability < 33.75 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 38.55 ) { 
		if( approval < 28.5 ) { return new Prediction("2", 1, 0); }
		if( approval >= 28.5 ) { return new Prediction("1", 9, 0); }
	}
		if( budget >= 38.55 ) { return new Prediction("2", 7, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 32 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 5, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 1, 0); }
	}
		if( budget >= 32 ) { return new Prediction("3", 7, 0); }
	}
	}
	}
	}
	}
	}
	if( budget >= 44.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 5, 0); }
	}
	}
	if( budget < 1.6 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 5.85 ) { return new Prediction("1", 1, 0); }
		if( approval < 5.85 ) { return new Prediction("3", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 9, 0); }
	}
	}
	}
	}
	}
	if( approval >= 39.1 ) { 
	if( budget >= 39.95 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 8, 0); }
	if( "positive".equals(type) ) { 
	if( stability >= 42.4 ) { 
		if( budget >= 41.9 ) { return new Prediction("1", 3, 0); }
		if( budget < 41.9 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 42.4 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( budget < 39.95 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 14, 0); }
	}
	}
	}
	if( approval >= 45.3 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 48.9 ) { 
		if( budget < 45.8 ) { return new Prediction("1", 17, 0); }
	if( budget >= 45.8 ) { 
	if( approval >= 47.5 ) { 
	if( budget >= 59.55 ) { 
		if( approval < 80 ) { return new Prediction("2", 7, 0); }
		if( approval >= 80 ) { return new Prediction("1", 2, 0); }
	}
	if( budget < 59.55 ) { 
		if( budget >= 48.85 ) { return new Prediction("1", 12, 0); }
	if( budget < 48.85 ) { 
		if( stability >= 44.3 ) { return new Prediction("1", 2, 0); }
		if( stability < 44.3 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
		if( approval < 47.5 ) { return new Prediction("2", 5, 0); }
	}
	}
	if( stability >= 48.9 ) { 
	if( budget < 69.7 ) { 
	if( stability >= 68.25 ) { 
		if( approval < 79 ) { return new Prediction("3", 8, 0); }
		if( approval >= 79 ) { return new Prediction("1", 1, 0); }
	}
	if( stability < 68.25 ) { 
		if( approval >= 64.8 ) { return new Prediction("1", 10, 0); }
	if( approval < 64.8 ) { 
		if( approval < 52.5 ) { return new Prediction("3", 8, 0); }
	if( approval >= 52.5 ) { 
		if( stability < 57 ) { return new Prediction("1", 5, 0); }
		if( stability >= 57 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	}
	if( budget >= 69.7 ) { 
	if( budget < 91.9 ) { 
	if( budget >= 74.25 ) { 
		if( approval < 71.4 ) { return new Prediction("2", 1, 0); }
		if( approval >= 71.4 ) { return new Prediction("1", 2, 0); }
	}
		if( budget < 74.25 ) { return new Prediction("2", 2, 0); }
	}
		if( budget >= 91.9 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 50.85 ) { 
		if( budget >= 42.15 ) { return new Prediction("3", 38, 0); }
	if( budget < 42.15 ) { 
		if( stability >= 29.65 ) { return new Prediction("2", 8, 0); }
		if( stability < 29.65 ) { return new Prediction("3", 8, 0); }
	}
	}
	if( stability >= 50.85 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 6, 0); }
	if( approval >= 56.35 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 11, 0); }
	if( budget >= 52.75 ) { 
		if( stability < 61.8 ) { return new Prediction("3", 4, 0); }
	if( stability >= 61.8 ) { 
		if( approval >= 77.95 ) { return new Prediction("3", 1, 0); }
		if( approval < 77.95 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
	if( stability >= 82.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 21, 0); }
	if( "positive".equals(type) ) { 
		if( approval >= 40.6 ) { return new Prediction("2", 8, 0); }
		if( approval < 40.6 ) { return new Prediction("1", 2, 0); }
	}
	}
return null;
}
private Prediction runTree74() {
	if( budget < 78.7 ) { 
	if( stability < 82.6 ) { 
	if( stability >= 76.45 ) { 
		if( approval < 15.75 ) { return new Prediction("3", 1, 0); }
		if( approval >= 15.75 ) { return new Prediction("1", 9, 0); }
	}
	if( stability < 76.45 ) { 
	if( approval >= 9.45 ) { 
	if( stability >= 23.55 ) { 
	if( stability >= 68.1 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 69.2 ) { 
		if( stability >= 68.65 ) { return new Prediction("2", 1, 0); }
		if( stability < 68.65 ) { return new Prediction("3", 2, 0); }
	}
		if( stability >= 69.2 ) { return new Prediction("3", 10, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 9, 0); }
	}
	if( stability < 68.1 ) { 
	if( stability < 58.65 ) { 
	if( stability < 57.65 ) { 
	if( stability < 55.95 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 44.15 ) { 
		if( approval >= 43 ) { return new Prediction("1", 11, 0); }
	if( approval < 43 ) { 
	if( budget < 28.75 ) { 
		if( approval >= 24.65 ) { return new Prediction("1", 5, 0); }
		if( approval < 24.65 ) { return new Prediction("3", 2, 0); }
	}
	if( budget >= 28.75 ) { 
	if( budget >= 37.75 ) { 
		if( stability >= 37.5 ) { return new Prediction("3", 4, 0); }
	if( stability < 37.5 ) { 
		if( approval >= 36.5 ) { return new Prediction("1", 2, 1); }
		if( approval < 36.5 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( budget < 37.75 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	if( budget >= 44.15 ) { 
	if( stability < 44.35 ) { 
		if( approval < 77.25 ) { return new Prediction("2", 17, 0); }
		if( approval >= 77.25 ) { return new Prediction("1", 1, 0); }
	}
	if( stability >= 44.35 ) { 
	if( approval >= 47.5 ) { 
	if( stability >= 48.3 ) { 
	if( budget < 52.85 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 51.5 ) { return new Prediction("3", 1, 0); }
	}
		if( budget >= 52.85 ) { return new Prediction("2", 3, 0); }
	}
	if( stability < 48.3 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 5, 0); }
	if( approval < 48.5 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 1, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
		if( approval < 47.5 ) { return new Prediction("2", 9, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 40.15 ) { 
	if( approval < 37.5 ) { 
	if( stability < 32.9 ) { 
		if( approval >= 31.5 ) { return new Prediction("3", 4, 0); }
	if( approval < 31.5 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 3, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( stability >= 32.9 ) { 
	if( budget < 34.2 ) { 
		if( approval >= 27.05 ) { return new Prediction("2", 4, 0); }
		if( approval < 27.05 ) { return new Prediction("1", 1, 0); }
	}
	if( budget >= 34.2 ) { 
	if( approval >= 33 ) { 
	if( stability >= 35.5 ) { 
		if( stability < 40.5 ) { return new Prediction("1", 1, 0); }
		if( stability >= 40.5 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 35.5 ) { return new Prediction("3", 2, 0); }
	}
		if( approval < 33 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
		if( approval >= 37.5 ) { return new Prediction("2", 15, 0); }
	}
	if( budget >= 40.15 ) { 
	if( approval < 44.5 ) { 
	if( approval >= 40.6 ) { 
		if( stability < 43.15 ) { return new Prediction("3", 2, 0); }
		if( stability >= 43.15 ) { return new Prediction("1", 2, 0); }
	}
	if( approval < 40.6 ) { 
		if( stability >= 35.75 ) { return new Prediction("1", 15, 0); }
	if( stability < 35.75 ) { 
		if( approval >= 31.65 ) { return new Prediction("3", 2, 0); }
		if( approval < 31.65 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	if( approval >= 44.5 ) { 
		if( budget < 45.55 ) { return new Prediction("2", 2, 0); }
	if( budget >= 45.55 ) { 
		if( budget >= 56.2 ) { return new Prediction("3", 23, 0); }
	if( budget < 56.2 ) { 
	if( stability >= 51.4 ) { 
	if( budget < 52.45 ) { 
		if( approval >= 52 ) { return new Prediction("2", 1, 0); }
		if( approval < 52 ) { return new Prediction("1", 1, 0); }
	}
		if( budget >= 52.45 ) { return new Prediction("1", 1, 0); }
	}
		if( stability < 51.4 ) { return new Prediction("3", 19, 0); }
	}
	}
	}
	}
	}
	}
	if( stability >= 55.95 ) { 
		if( budget >= 48.85 ) { return new Prediction("1", 7, 0); }
	if( budget < 48.85 ) { 
		if( approval < 58.55 ) { return new Prediction("3", 1, 0); }
		if( approval >= 58.55 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( stability >= 57.65 ) { return new Prediction("3", 9, 0); }
	}
	if( stability >= 58.65 ) { 
		if( budget >= 59.55 ) { return new Prediction("2", 6, 0); }
	if( budget < 59.55 ) { 
	if( budget >= 47 ) { 
		if( budget < 54.25 ) { return new Prediction("1", 9, 0); }
	if( budget >= 54.25 ) { 
		if( approval < 79.65 ) { return new Prediction("1", 1, 0); }
		if( approval >= 79.65 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( budget < 47 ) { 
		if( approval < 87.55 ) { return new Prediction("2", 3, 0); }
		if( approval >= 87.55 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	if( stability < 23.55 ) { 
	if( approval >= 60 ) { 
		if( approval < 82 ) { return new Prediction("3", 8, 0); }
		if( approval >= 82 ) { return new Prediction("1", 1, 0); }
	}
	if( approval < 60 ) { 
	if( stability >= 6.35 ) { 
	if( budget < 20.9 ) { 
	if( stability >= 16.95 ) { 
		if( approval < 17.05 ) { return new Prediction("1", 1, 0); }
		if( approval >= 17.05 ) { return new Prediction("2", 4, 0); }
	}
	if( stability < 16.95 ) { 
		if( approval < 11.75 ) { return new Prediction("2", 1, 0); }
	if( approval >= 11.75 ) { 
		if( budget >= 19.7 ) { return new Prediction("2", 2, 0); }
	if( budget < 19.7 ) { 
		if( budget >= 18.75 ) { return new Prediction("3", 2, 0); }
	if( budget < 18.75 ) { 
		if( stability >= 12.3 ) { return new Prediction("3", 1, 0); }
		if( stability < 12.3 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
	}
	if( budget >= 20.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 14, 0); }
	}
	}
	if( stability < 6.35 ) { 
		if( stability < 1.65 ) { return new Prediction("1", 1, 0); }
		if( stability >= 1.65 ) { return new Prediction("3", 7, 0); }
	}
	}
	}
	}
	if( approval < 9.45 ) { 
	if( approval < 7.4 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 3.5 ) { 
		if( stability >= 7.15 ) { return new Prediction("3", 1, 0); }
		if( stability < 7.15 ) { return new Prediction("2", 6, 0); }
	}
		if( budget < 3.5 ) { return new Prediction("3", 9, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 3.55 ) { 
	if( stability >= 4.7 ) { 
		if( approval < 5.35 ) { return new Prediction("1", 12, 0); }
	if( approval >= 5.35 ) { 
		if( budget >= 12.55 ) { return new Prediction("1", 1, 0); }
		if( budget < 12.55 ) { return new Prediction("2", 8, 0); }
	}
	}
		if( stability < 4.7 ) { return new Prediction("2", 3, 0); }
	}
	if( stability < 3.55 ) { 
	if( budget < 7.4 ) { 
		if( approval < 3.8 ) { return new Prediction("1", 5, 0); }
		if( approval >= 3.8 ) { return new Prediction("3", 3, 0); }
	}
		if( budget >= 7.4 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	if( approval >= 7.4 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 9.4 ) { return new Prediction("2", 1, 0); }
	if( budget < 9.4 ) { 
		if( stability >= 9.35 ) { return new Prediction("3", 1, 0); }
		if( stability < 9.35 ) { return new Prediction("1", 24, 0); }
	}
	}
		if( "positive".equals(type) ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	if( stability >= 82.6 ) { 
	if( approval < 69.8 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 19, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 1, 0); }
	}
	if( approval >= 69.8 ) { 
		if( budget < 70.95 ) { return new Prediction("2", 6, 0); }
		if( budget >= 70.95 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( budget >= 78.7 ) { 
	if( approval < 75.05 ) { 
	if( approval < 49.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 17, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 9, 0); }
	}
	if( approval >= 49.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 16, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval >= 75.05 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 89.95 ) { return new Prediction("2", 2, 0); }
		if( approval >= 89.95 ) { return new Prediction("1", 4, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 10, 0); }
	}
	}
return null;
}
private Prediction runTree75() {
	if( stability < 80.1 ) { 
	if( budget < 7.35 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 9.15 ) { 
		if( approval < 4.3 ) { return new Prediction("3", 11, 0); }
	if( approval >= 4.3 ) { 
		if( approval >= 5.55 ) { return new Prediction("1", 21, 0); }
	if( approval < 5.55 ) { 
		if( budget < 5.4 ) { return new Prediction("1", 3, 0); }
		if( budget >= 5.4 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
		if( stability >= 9.15 ) { return new Prediction("3", 6, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 4.65 ) { 
	if( approval < 5.35 ) { 
		if( budget >= 2.25 ) { return new Prediction("1", 13, 0); }
		if( budget < 2.25 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 5.35 ) { return new Prediction("2", 8, 0); }
	}
	if( stability < 4.65 ) { 
		if( approval >= 4.35 ) { return new Prediction("3", 12, 0); }
	if( approval < 4.35 ) { 
		if( approval >= 2.45 ) { return new Prediction("2", 4, 0); }
		if( approval < 2.45 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( budget >= 7.35 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 69.1 ) { 
		if( approval < 89.95 ) { return new Prediction("2", 33, 0); }
		if( approval >= 89.95 ) { return new Prediction("1", 5, 0); }
	}
	if( budget < 69.1 ) { 
	if( stability < 49.4 ) { 
	if( budget >= 46 ) { 
	if( approval >= 48.5 ) { 
		if( budget < 54.15 ) { return new Prediction("1", 12, 0); }
	if( budget >= 54.15 ) { 
		if( approval < 70.05 ) { return new Prediction("2", 5, 0); }
		if( approval >= 70.05 ) { return new Prediction("1", 3, 0); }
	}
	}
		if( approval < 48.5 ) { return new Prediction("2", 20, 0); }
	}
	if( budget < 46 ) { 
	if( approval < 37.5 ) { 
		if( stability >= 37.6 ) { return new Prediction("3", 7, 0); }
	if( stability < 37.6 ) { 
	if( approval >= 8.1 ) { 
	if( budget < 32.55 ) { 
		if( budget >= 22.8 ) { return new Prediction("1", 4, 0); }
	if( budget < 22.8 ) { 
	if( approval >= 11.8 ) { 
	if( approval < 26.85 ) { 
		if( approval >= 16.1 ) { return new Prediction("3", 2, 0); }
	if( approval < 16.1 ) { 
		if( budget < 14.45 ) { return new Prediction("3", 3, 0); }
		if( budget >= 14.45 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( approval >= 26.85 ) { return new Prediction("1", 1, 0); }
	}
	if( approval < 11.8 ) { 
		if( approval >= 9.15 ) { return new Prediction("1", 3, 0); }
	if( approval < 9.15 ) { 
		if( budget >= 9.4 ) { return new Prediction("2", 2, 0); }
		if( budget < 9.4 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( budget >= 32.55 ) { 
	if( budget < 38.55 ) { 
		if( approval >= 36.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 36.5 ) { return new Prediction("2", 2, 0); }
	}
		if( budget >= 38.55 ) { return new Prediction("2", 6, 0); }
	}
	}
		if( approval < 8.1 ) { return new Prediction("2", 8, 0); }
	}
	}
		if( approval >= 37.5 ) { return new Prediction("1", 15, 0); }
	}
	}
	if( stability >= 49.4 ) { 
		if( approval < 51.85 ) { return new Prediction("3", 16, 0); }
	if( approval >= 51.85 ) { 
		if( approval >= 71.85 ) { return new Prediction("1", 9, 0); }
	if( approval < 71.85 ) { 
		if( stability >= 57.05 ) { return new Prediction("3", 10, 0); }
		if( stability < 57.05 ) { return new Prediction("1", 8, 0); }
	}
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 40.15 ) { 
	if( stability >= 33 ) { 
	if( approval >= 30.85 ) { 
		if( budget < 38.85 ) { return new Prediction("2", 32, 0); }
	if( budget >= 38.85 ) { 
		if( approval < 57.95 ) { return new Prediction("1", 1, 0); }
		if( approval >= 57.95 ) { return new Prediction("2", 3, 0); }
	}
	}
		if( approval < 30.85 ) { return new Prediction("1", 3, 0); }
	}
	if( stability < 33 ) { 
	if( budget < 20.6 ) { 
	if( stability < 18.55 ) { 
		if( budget < 8.5 ) { return new Prediction("3", 1, 0); }
	if( budget >= 8.5 ) { 
		if( budget >= 16.4 ) { return new Prediction("3", 1, 0); }
		if( budget < 16.4 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( stability >= 18.55 ) { 
		if( approval >= 21.5 ) { return new Prediction("2", 2, 0); }
		if( approval < 21.5 ) { return new Prediction("1", 6, 0); }
	}
	}
	if( budget >= 20.6 ) { 
		if( approval < 30.2 ) { return new Prediction("2", 1, 0); }
		if( approval >= 30.2 ) { return new Prediction("3", 8, 0); }
	}
	}
	}
	if( budget >= 40.15 ) { 
	if( stability >= 50.9 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 20, 0); }
	if( approval >= 56.35 ) { 
		if( stability >= 67.9 ) { return new Prediction("2", 7, 0); }
	if( stability < 67.9 ) { 
	if( budget < 71 ) { 
	if( approval < 63.25 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 1, 0); }
		if( budget >= 52.75 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 63.25 ) { return new Prediction("2", 4, 0); }
	}
		if( budget >= 71 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	if( stability < 50.9 ) { 
	if( budget < 41.45 ) { 
	if( stability >= 35.75 ) { 
		if( approval >= 42.5 ) { return new Prediction("2", 1, 0); }
		if( approval < 42.5 ) { return new Prediction("1", 6, 0); }
	}
		if( stability < 35.75 ) { return new Prediction("3", 2, 0); }
	}
	if( budget >= 41.45 ) { 
	if( approval < 44.5 ) { 
	if( budget < 43.95 ) { 
		if( stability < 41.85 ) { return new Prediction("3", 10, 0); }
		if( stability >= 41.85 ) { return new Prediction("1", 1, 0); }
	}
		if( budget >= 43.95 ) { return new Prediction("1", 10, 0); }
	}
	if( approval >= 44.5 ) { 
	if( budget < 45.55 ) { 
		if( budget < 43.6 ) { return new Prediction("3", 1, 0); }
		if( budget >= 43.6 ) { return new Prediction("2", 2, 0); }
	}
		if( budget >= 45.55 ) { return new Prediction("3", 43, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( stability >= 80.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 28, 0); }
	if( "positive".equals(type) ) { 
	if( approval < 60.25 ) { 
		if( approval < 31.7 ) { return new Prediction("1", 1, 0); }
	if( approval >= 31.7 ) { 
		if( approval < 53.95 ) { return new Prediction("2", 1, 0); }
		if( approval >= 53.95 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( approval >= 60.25 ) { return new Prediction("2", 6, 0); }
	}
	}
return null;
}
private Prediction runTree76() {
	if( budget < 93.2 ) { 
	if( stability < 7.45 ) { 
	if( stability >= 4.65 ) { 
		if( budget < 1.8 ) { return new Prediction("2", 4, 0); }
	if( budget >= 1.8 ) { 
	if( budget < 9.3 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 6.3 ) { return new Prediction("3", 2, 0); }
		if( approval >= 6.3 ) { return new Prediction("1", 25, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 5.15 ) { return new Prediction("1", 11, 0); }
		if( approval >= 5.15 ) { return new Prediction("2", 3, 0); }
	}
	}
		if( budget >= 9.3 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( stability < 4.65 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 3.7 ) { 
		if( approval >= 2.65 ) { return new Prediction("1", 13, 0); }
		if( approval < 2.65 ) { return new Prediction("3", 3, 0); }
	}
	if( budget >= 3.7 ) { 
		if( approval < 4.95 ) { return new Prediction("2", 5, 0); }
	if( approval >= 4.95 ) { 
	if( approval >= 6.25 ) { 
		if( approval < 8.4 ) { return new Prediction("2", 2, 0); }
		if( approval >= 8.4 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 6.25 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( approval >= 4.35 ) { return new Prediction("3", 15, 0); }
	if( approval < 4.35 ) { 
		if( approval < 2.25 ) { return new Prediction("1", 4, 0); }
		if( approval >= 2.25 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
	if( stability >= 7.45 ) { 
	if( stability < 90.35 ) { 
	if( budget >= 19.7 ) { 
	if( approval < 21.9 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 11.1 ) { 
		if( stability >= 61.6 ) { return new Prediction("3", 1, 0); }
	if( stability < 61.6 ) { 
		if( budget >= 48.25 ) { return new Prediction("2", 4, 0); }
	if( budget < 48.25 ) { 
		if( stability >= 19.1 ) { return new Prediction("3", 1, 0); }
		if( stability < 19.1 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
		if( approval < 11.1 ) { return new Prediction("3", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 12, 0); }
	}
	if( approval >= 21.9 ) { 
	if( budget >= 40.05 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 69.2 ) { 
	if( approval < 47.8 ) { 
	if( budget >= 41.55 ) { 
		if( stability < 42.85 ) { return new Prediction("2", 14, 0); }
	if( stability >= 42.85 ) { 
	if( budget < 65.3 ) { 
	if( budget < 49.5 ) { 
		if( approval >= 36.7 ) { return new Prediction("2", 4, 0); }
		if( approval < 36.7 ) { return new Prediction("3", 2, 0); }
	}
		if( budget >= 49.5 ) { return new Prediction("3", 3, 0); }
	}
		if( budget >= 65.3 ) { return new Prediction("2", 9, 0); }
	}
	}
		if( budget < 41.55 ) { return new Prediction("3", 7, 0); }
	}
	if( approval >= 47.8 ) { 
	if( budget >= 60.85 ) { 
		if( approval >= 90.5 ) { return new Prediction("1", 3, 0); }
	if( approval < 90.5 ) { 
	if( budget < 69.7 ) { 
		if( budget < 66.6 ) { return new Prediction("2", 2, 0); }
		if( budget >= 66.6 ) { return new Prediction("1", 1, 0); }
	}
		if( budget >= 69.7 ) { return new Prediction("2", 10, 0); }
	}
	}
	if( budget < 60.85 ) { 
	if( stability < 48.9 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 12, 0); }
	if( approval < 48.5 ) { 
	if( budget >= 45 ) { 
		if( stability < 46.75 ) { return new Prediction("2", 2, 0); }
		if( stability >= 46.75 ) { return new Prediction("1", 1, 0); }
	}
		if( budget < 45 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( stability >= 48.9 ) { 
		if( budget < 47.3 ) { return new Prediction("1", 4, 0); }
	if( budget >= 47.3 ) { 
		if( budget < 49.95 ) { return new Prediction("3", 3, 0); }
	if( budget >= 49.95 ) { 
		if( stability < 57 ) { return new Prediction("1", 5, 0); }
	if( stability >= 57 ) { 
		if( approval < 63.5 ) { return new Prediction("3", 4, 0); }
		if( approval >= 63.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( stability >= 69.2 ) { 
		if( approval < 75.75 ) { return new Prediction("3", 11, 0); }
		if( approval >= 75.75 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 47.5 ) { 
	if( budget >= 45.25 ) { 
	if( approval < 89.2 ) { 
	if( budget < 72.95 ) { 
		if( stability >= 58.1 ) { return new Prediction("2", 1, 0); }
		if( stability < 58.1 ) { return new Prediction("3", 25, 0); }
	}
	if( budget >= 72.95 ) { 
		if( approval < 68.2 ) { return new Prediction("1", 2, 0); }
		if( approval >= 68.2 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( approval >= 89.2 ) { 
		if( approval >= 94.2 ) { return new Prediction("3", 1, 0); }
		if( approval < 94.2 ) { return new Prediction("2", 3, 0); }
	}
	}
	if( budget < 45.25 ) { 
		if( stability >= 26.3 ) { return new Prediction("2", 6, 0); }
		if( stability < 26.3 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( approval < 47.5 ) { 
	if( budget < 67.85 ) { 
	if( stability >= 32.95 ) { 
	if( approval >= 40.5 ) { 
	if( budget < 44.95 ) { 
		if( stability >= 42 ) { return new Prediction("2", 1, 0); }
		if( stability < 42 ) { return new Prediction("3", 2, 0); }
	}
	if( budget >= 44.95 ) { 
		if( stability >= 49 ) { return new Prediction("1", 6, 0); }
	if( stability < 49 ) { 
	if( approval < 45 ) { 
		if( approval >= 42 ) { return new Prediction("1", 1, 0); }
		if( approval < 42 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 45 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
		if( approval < 40.5 ) { return new Prediction("1", 10, 0); }
	}
		if( stability < 32.95 ) { return new Prediction("3", 5, 0); }
	}
		if( budget >= 67.85 ) { return new Prediction("1", 8, 0); }
	}
	}
	}
	if( budget < 40.05 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 37.15 ) { 
		if( approval < 44.5 ) { return new Prediction("3", 9, 0); }
	if( approval >= 44.5 ) { 
	if( stability < 72.15 ) { 
		if( budget >= 24.75 ) { return new Prediction("1", 8, 0); }
		if( budget < 24.75 ) { return new Prediction("3", 1, 0); }
	}
		if( stability >= 72.15 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( stability < 37.15 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 6, 0); }
	if( budget >= 29.9 ) { 
	if( approval < 37.5 ) { 
		if( approval >= 36.5 ) { return new Prediction("2", 3, 1); }
		if( approval < 36.5 ) { return new Prediction("2", 6, 0); }
	}
		if( approval >= 37.5 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 33.05 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 8, 0); }
	if( budget < 31.95 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 5, 0); }
	if( stability < 28.6 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 2, 0); }
		if( budget >= 25.7 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	if( stability >= 33.05 ) { 
	if( approval < 35.5 ) { 
		if( stability >= 75.65 ) { return new Prediction("2", 1, 0); }
		if( stability < 75.65 ) { return new Prediction("1", 4, 0); }
	}
	if( approval >= 35.5 ) { 
		if( budget < 38.85 ) { return new Prediction("2", 29, 0); }
	if( budget >= 38.85 ) { 
		if( stability >= 38.65 ) { return new Prediction("2", 4, 0); }
		if( stability < 38.65 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( budget < 19.7 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 17.2 ) { return new Prediction("2", 2, 0); }
	if( budget < 17.2 ) { 
		if( stability < 9.15 ) { return new Prediction("1", 2, 0); }
	if( stability >= 9.15 ) { 
		if( approval < 64.4 ) { return new Prediction("3", 6, 0); }
		if( approval >= 64.4 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( "positive".equals(type) ) { return new Prediction("2", 28, 0); }
	}
	}
		if( stability >= 90.35 ) { return new Prediction("3", 10, 0); }
	}
	}
	if( budget >= 93.2 ) { 
		if( approval < 29.3 ) { return new Prediction("1", 1, 0); }
	if( approval >= 29.3 ) { 
		if( stability < 17.1 ) { return new Prediction("3", 1, 0); }
		if( stability >= 17.1 ) { return new Prediction("2", 20, 0); }
	}
	}
return null;
}
private Prediction runTree77() {
	if( approval < 50.5 ) { 
	if( budget < 65.8 ) { 
	if( approval < 48.9 ) { 
	if( approval >= 47.5 ) { 
		if( approval >= 48.4 ) { return new Prediction("3", 1, 0); }
	if( approval < 48.4 ) { 
		if( stability < 46.75 ) { return new Prediction("2", 11, 0); }
	if( stability >= 46.75 ) { 
		if( budget < 43.85 ) { return new Prediction("2", 1, 0); }
	if( budget >= 43.85 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	if( approval < 47.5 ) { 
	if( stability < 48.15 ) { 
	if( approval < 43.05 ) { 
	if( approval < 37.5 ) { 
	if( stability < 42.6 ) { 
	if( stability >= 33.75 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 27.65 ) { 
		if( budget < 39.55 ) { return new Prediction("3", 2, 0); }
		if( budget >= 39.55 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 27.65 ) { return new Prediction("3", 3, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget < 34.2 ) { return new Prediction("2", 2, 0); }
	if( budget >= 34.2 ) { 
	if( budget < 40.75 ) { 
	if( approval >= 33 ) { 
		if( stability < 36.4 ) { return new Prediction("3", 3, 0); }
		if( stability >= 36.4 ) { return new Prediction("1", 4, 0); }
	}
		if( approval < 33 ) { return new Prediction("1", 4, 0); }
	}
		if( budget >= 40.75 ) { return new Prediction("1", 9, 0); }
	}
	}
	}
	if( stability < 33.75 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 6.85 ) { 
	if( approval >= 7.9 ) { 
	if( budget >= 28.2 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 6, 0); }
	if( budget < 39.15 ) { 
		if( budget >= 35.1 ) { return new Prediction("2", 3, 1); }
		if( budget < 35.1 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( budget < 28.2 ) { 
	if( stability < 13.8 ) { 
		if( budget < 9.55 ) { return new Prediction("1", 7, 0); }
		if( budget >= 9.55 ) { return new Prediction("2", 4, 0); }
	}
	if( stability >= 13.8 ) { 
	if( approval < 24.1 ) { 
		if( stability >= 21.85 ) { return new Prediction("3", 3, 0); }
	if( stability < 21.85 ) { 
		if( approval >= 15 ) { return new Prediction("1", 1, 0); }
		if( approval < 15 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( approval >= 24.1 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
		if( approval < 7.9 ) { return new Prediction("2", 5, 0); }
	}
	if( budget < 6.85 ) { 
	if( budget >= 3 ) { 
		if( stability >= 9.05 ) { return new Prediction("3", 1, 0); }
		if( stability < 9.05 ) { return new Prediction("1", 16, 0); }
	}
	if( budget < 3 ) { 
		if( approval >= 7.9 ) { return new Prediction("1", 4, 0); }
	if( approval < 7.9 ) { 
	if( approval < 4.65 ) { 
		if( approval >= 2.55 ) { return new Prediction("1", 1, 0); }
		if( approval < 2.55 ) { return new Prediction("3", 3, 0); }
	}
		if( approval >= 4.65 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 31.35 ) { 
	if( stability >= 3.55 ) { 
	if( budget < 5.5 ) { 
	if( approval >= 2.8 ) { 
		if( budget < 4.3 ) { return new Prediction("2", 12, 0); }
	if( budget >= 4.3 ) { 
		if( approval >= 5.05 ) { return new Prediction("2", 7, 0); }
		if( approval < 5.05 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( approval < 2.8 ) { return new Prediction("1", 2, 0); }
	}
	if( budget >= 5.5 ) { 
	if( approval < 23.05 ) { 
	if( approval >= 7.1 ) { 
		if( stability < 15.05 ) { return new Prediction("3", 6, 0); }
		if( stability >= 15.05 ) { return new Prediction("1", 3, 0); }
	}
	if( approval < 7.1 ) { 
		if( approval < 5.7 ) { return new Prediction("1", 3, 0); }
		if( approval >= 5.7 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( approval >= 23.05 ) { 
		if( stability < 19.2 ) { return new Prediction("3", 1, 0); }
	if( stability >= 19.2 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 4, 0); }
	if( budget >= 25.7 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 3, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	if( stability < 3.55 ) { 
		if( approval < 2.95 ) { return new Prediction("1", 1, 0); }
		if( approval >= 2.95 ) { return new Prediction("3", 9, 0); }
	}
	}
		if( budget >= 31.35 ) { return new Prediction("3", 11, 0); }
	}
	}
	}
	if( stability >= 42.6 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 4, 0); }
	}
	}
	if( approval >= 37.5 ) { 
	if( budget >= 31.2 ) { 
	if( stability >= 38.55 ) { 
		if( budget < 42.45 ) { return new Prediction("2", 4, 0); }
	if( budget >= 42.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 6, 0); }
	}
	}
	if( stability < 38.55 ) { 
	if( approval >= 39.5 ) { 
		if( budget < 45.45 ) { return new Prediction("3", 2, 0); }
		if( budget >= 45.45 ) { return new Prediction("2", 2, 0); }
	}
		if( approval < 39.5 ) { return new Prediction("1", 4, 0); }
	}
	}
		if( budget < 31.2 ) { return new Prediction("2", 5, 0); }
	}
	}
	if( approval >= 43.05 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 43.25 ) { return new Prediction("1", 1, 0); }
		if( budget >= 43.25 ) { return new Prediction("2", 7, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 44.55 ) { return new Prediction("2", 2, 0); }
		if( approval >= 44.55 ) { return new Prediction("3", 11, 0); }
	}
	}
	}
	if( stability >= 48.15 ) { 
	if( budget >= 46.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 19, 0); }
	}
	if( budget < 46.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 9, 0); }
	if( "positive".equals(type) ) { 
		if( stability >= 81.25 ) { return new Prediction("1", 4, 0); }
	if( stability < 81.25 ) { 
	if( budget < 29.45 ) { 
		if( budget >= 27.1 ) { return new Prediction("1", 1, 0); }
		if( budget < 27.1 ) { return new Prediction("2", 2, 0); }
	}
		if( budget >= 29.45 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
	}
	}
	if( approval >= 48.9 ) { 
		if( stability < 36.6 ) { return new Prediction("3", 1, 0); }
	if( stability >= 36.6 ) { 
		if( stability >= 48 ) { return new Prediction("3", 1, 0); }
		if( stability < 48 ) { return new Prediction("1", 13, 0); }
	}
	}
	}
	if( budget >= 65.8 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 78.25 ) { return new Prediction("3", 2, 0); }
		if( stability < 78.25 ) { return new Prediction("2", 21, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 11, 0); }
	}
	}
	if( approval >= 50.5 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 84.95 ) { 
	if( stability >= 68.25 ) { 
		if( budget < 81.55 ) { return new Prediction("3", 17, 0); }
		if( budget >= 81.55 ) { return new Prediction("2", 2, 0); }
	}
	if( stability < 68.25 ) { 
		if( budget >= 64.2 ) { return new Prediction("2", 9, 0); }
	if( budget < 64.2 ) { 
	if( approval >= 51.5 ) { 
		if( approval >= 57.05 ) { return new Prediction("1", 9, 0); }
	if( approval < 57.05 ) { 
		if( approval < 55.5 ) { return new Prediction("1", 3, 0); }
	if( approval >= 55.5 ) { 
		if( stability < 57 ) { return new Prediction("1", 2, 0); }
		if( stability >= 57 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( approval < 51.5 ) { 
		if( stability < 50.2 ) { return new Prediction("2", 2, 0); }
		if( stability >= 50.2 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
		if( approval >= 84.95 ) { return new Prediction("1", 16, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 60.55 ) { 
		if( stability < 61.55 ) { return new Prediction("1", 3, 0); }
		if( stability >= 61.55 ) { return new Prediction("2", 11, 0); }
	}
	if( stability < 60.55 ) { 
		if( budget < 20.15 ) { return new Prediction("2", 8, 0); }
	if( budget >= 20.15 ) { 
		if( stability < 44.4 ) { return new Prediction("3", 28, 0); }
	if( stability >= 44.4 ) { 
	if( approval >= 75.65 ) { 
		if( budget < 42.8 ) { return new Prediction("2", 2, 0); }
		if( budget >= 42.8 ) { return new Prediction("3", 4, 0); }
	}
	if( approval < 75.65 ) { 
	if( budget < 49.95 ) { 
	if( approval >= 51.5 ) { 
		if( approval >= 54.5 ) { return new Prediction("2", 1, 0); }
		if( approval < 54.5 ) { return new Prediction("3", 2, 0); }
	}
		if( approval < 51.5 ) { return new Prediction("2", 1, 0); }
	}
		if( budget >= 49.95 ) { return new Prediction("3", 15, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree78() {
	if( stability >= 85.65 ) { 
	if( budget < 89.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 26, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 3, 0); }
	}
		if( budget >= 89.1 ) { return new Prediction("1", 2, 0); }
	}
	if( stability < 85.65 ) { 
	if( approval < 2.95 ) { 
		if( stability >= 5.1 ) { return new Prediction("1", 10, 0); }
		if( stability < 5.1 ) { return new Prediction("3", 2, 0); }
	}
	if( approval >= 2.95 ) { 
	if( stability >= 77.25 ) { 
	if( stability < 82.35 ) { 
		if( budget >= 50.95 ) { return new Prediction("1", 6, 0); }
	if( budget < 50.95 ) { 
		if( budget >= 21.65 ) { return new Prediction("2", 7, 0); }
		if( budget < 21.65 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( stability >= 82.35 ) { 
		if( approval < 51.3 ) { return new Prediction("3", 1, 0); }
		if( approval >= 51.3 ) { return new Prediction("2", 7, 0); }
	}
	}
	if( stability < 77.25 ) { 
	if( approval < 7.4 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 4.6 ) { return new Prediction("3", 6, 0); }
	if( stability < 4.6 ) { 
		if( budget >= 6.4 ) { return new Prediction("2", 5, 0); }
	if( budget < 6.4 ) { 
		if( approval >= 4.7 ) { return new Prediction("1", 4, 0); }
		if( approval < 4.7 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 3.55 ) { 
	if( approval < 5.15 ) { 
		if( approval >= 4.55 ) { return new Prediction("1", 1, 0); }
		if( approval < 4.55 ) { return new Prediction("2", 6, 0); }
	}
		if( approval >= 5.15 ) { return new Prediction("2", 13, 0); }
	}
		if( stability < 3.55 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( approval >= 7.4 ) { 
	if( approval >= 8.45 ) { 
	if( stability >= 25.45 ) { 
	if( approval < 25.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 15, 0); }
	}
	if( approval >= 25.7 ) { 
	if( budget < 83.75 ) { 
	if( budget < 56.4 ) { 
	if( approval >= 52.1 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 21.1 ) { return new Prediction("3", 2, 0); }
		if( budget >= 21.1 ) { return new Prediction("1", 17, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 56.1 ) { return new Prediction("1", 8, 0); }
		if( approval >= 56.1 ) { return new Prediction("2", 13, 0); }
	}
	}
	if( approval < 52.1 ) { 
	if( stability < 48.75 ) { 
	if( approval >= 36.5 ) { 
	if( budget < 34.2 ) { 
		if( stability >= 33.25 ) { return new Prediction("2", 9, 0); }
		if( stability < 33.25 ) { return new Prediction("3", 1, 0); }
	}
	if( budget >= 34.2 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 43.95 ) { 
		if( approval < 37.5 ) { return new Prediction("3", 1, 0); }
	if( approval >= 37.5 ) { 
		if( approval >= 42.5 ) { return new Prediction("1", 5, 0); }
	if( approval < 42.5 ) { 
	if( budget >= 36.75 ) { 
		if( stability >= 36.05 ) { return new Prediction("3", 1, 0); }
		if( stability < 36.05 ) { return new Prediction("1", 1, 0); }
	}
		if( budget < 36.75 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( budget >= 43.95 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 9, 0); }
	if( approval < 48.5 ) { 
	if( approval >= 47.5 ) { 
		if( stability < 46.75 ) { return new Prediction("2", 2, 0); }
	if( stability >= 46.75 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 1, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( approval < 47.5 ) { return new Prediction("2", 13, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 40.5 ) { 
	if( budget < 40.75 ) { 
		if( approval < 49.5 ) { return new Prediction("2", 10, 0); }
		if( approval >= 49.5 ) { return new Prediction("3", 1, 0); }
	}
	if( budget >= 40.75 ) { 
		if( stability < 45.65 ) { return new Prediction("3", 10, 0); }
	if( stability >= 45.65 ) { 
	if( approval < 45 ) { 
		if( budget < 44.95 ) { return new Prediction("2", 1, 0); }
		if( budget >= 44.95 ) { return new Prediction("1", 1, 0); }
	}
		if( approval >= 45 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( approval < 40.5 ) { 
		if( budget >= 38.25 ) { return new Prediction("1", 11, 0); }
		if( budget < 38.25 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	if( approval < 36.5 ) { 
	if( stability >= 37.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 9, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 4, 0); }
	}
	if( stability < 37.15 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 32.55 ) { return new Prediction("1", 3, 0); }
		if( budget >= 32.55 ) { return new Prediction("2", 4, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability >= 33.75 ) { return new Prediction("1", 3, 0); }
	if( stability < 33.75 ) { 
	if( budget < 33.95 ) { 
		if( approval < 32 ) { return new Prediction("3", 1, 0); }
		if( approval >= 32 ) { return new Prediction("2", 1, 0); }
	}
		if( budget >= 33.95 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	}
	if( stability >= 48.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 18, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 43.05 ) { return new Prediction("2", 2, 0); }
	if( approval >= 43.05 ) { 
		if( approval >= 49 ) { return new Prediction("3", 1, 0); }
		if( approval < 49 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	}
	if( budget >= 56.4 ) { 
	if( approval >= 34.45 ) { 
	if( budget < 57.95 ) { 
		if( approval >= 81.5 ) { return new Prediction("1", 2, 0); }
	if( approval < 81.5 ) { 
		if( stability < 54 ) { return new Prediction("3", 5, 0); }
	if( stability >= 54 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 56.85 ) { return new Prediction("1", 1, 0); }
		if( stability >= 56.85 ) { return new Prediction("3", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( budget >= 57.95 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 37.65 ) { return new Prediction("3", 5, 0); }
	if( approval >= 37.65 ) { 
	if( approval < 70.95 ) { 
		if( approval < 61.5 ) { return new Prediction("2", 5, 0); }
	if( approval >= 61.5 ) { 
		if( approval < 68.5 ) { return new Prediction("3", 1, 0); }
		if( approval >= 68.5 ) { return new Prediction("2", 2, 0); }
	}
	}
		if( approval >= 70.95 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 56.2 ) { 
	if( approval < 82.5 ) { 
	if( stability < 61.1 ) { 
		if( approval >= 76.2 ) { return new Prediction("2", 1, 0); }
		if( approval < 76.2 ) { return new Prediction("3", 1, 0); }
	}
		if( stability >= 61.1 ) { return new Prediction("2", 3, 0); }
	}
		if( approval >= 82.5 ) { return new Prediction("3", 3, 0); }
	}
		if( stability < 56.2 ) { return new Prediction("3", 13, 0); }
	}
	}
	}
	if( approval < 34.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 5, 0); }
	}
	}
	}
	if( budget >= 83.75 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 79.5 ) { return new Prediction("2", 5, 0); }
		if( approval >= 79.5 ) { return new Prediction("1", 7, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval >= 71.1 ) { return new Prediction("3", 2, 0); }
		if( approval < 71.1 ) { return new Prediction("1", 10, 0); }
	}
	}
	}
	}
	if( stability < 25.45 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 10.15 ) { return new Prediction("1", 5, 0); }
	if( approval >= 10.15 ) { 
	if( budget < 29.9 ) { 
		if( approval >= 15 ) { return new Prediction("1", 3, 0); }
		if( approval < 15 ) { return new Prediction("3", 3, 0); }
	}
	if( budget >= 29.9 ) { 
	if( stability < 15.7 ) { 
		if( budget >= 75.2 ) { return new Prediction("2", 4, 0); }
		if( budget < 75.2 ) { return new Prediction("1", 4, 0); }
	}
		if( stability >= 15.7 ) { return new Prediction("2", 10, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 21.85 ) { 
		if( approval >= 21.05 ) { return new Prediction("3", 26, 0); }
		if( approval < 21.05 ) { return new Prediction("1", 1, 0); }
	}
	if( budget < 21.85 ) { 
	if( stability >= 5 ) { 
		if( budget < 17.4 ) { return new Prediction("2", 11, 0); }
	if( budget >= 17.4 ) { 
		if( approval >= 21.5 ) { return new Prediction("2", 2, 0); }
	if( approval < 21.5 ) { 
		if( stability < 15.05 ) { return new Prediction("3", 1, 0); }
		if( stability >= 15.05 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( stability < 5 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	}
		if( approval < 8.45 ) { return new Prediction("1", 11, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree79() {
	if( approval < 53.2 ) { 
	if( stability < 92.1 ) { 
	if( budget >= 65.5 ) { 
	if( approval >= 38.9 ) { 
		if( stability < 14.75 ) { return new Prediction("3", 2, 0); }
	if( stability >= 14.75 ) { 
		if( stability >= 77.65 ) { return new Prediction("3", 1, 0); }
		if( stability < 77.65 ) { return new Prediction("2", 7, 0); }
	}
	}
	if( approval < 38.9 ) { 
	if( budget >= 72.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 9, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 8, 0); }
	}
		if( budget < 72.45 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( budget < 65.5 ) { 
	if( stability >= 1.7 ) { 
	if( stability < 48.85 ) { 
	if( approval < 37.5 ) { 
	if( budget >= 36.75 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 37.6 ) { return new Prediction("3", 13, 0); }
		if( stability < 37.6 ) { return new Prediction("2", 11, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 40.15 ) { 
		if( stability < 35.9 ) { return new Prediction("3", 8, 0); }
		if( stability >= 35.9 ) { return new Prediction("1", 1, 0); }
	}
	if( budget >= 40.15 ) { 
		if( stability >= 36.9 ) { return new Prediction("1", 5, 0); }
	if( stability < 36.9 ) { 
		if( approval >= 19.8 ) { return new Prediction("3", 6, 0); }
		if( approval < 19.8 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	if( budget < 36.75 ) { 
	if( stability < 19.2 ) { 
	if( budget < 8.95 ) { 
	if( approval >= 7.45 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 5 ) { return new Prediction("1", 11, 0); }
	if( budget >= 5 ) { 
		if( budget < 6.6 ) { return new Prediction("3", 2, 0); }
		if( budget >= 6.6 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( stability >= 7.3 ) { return new Prediction("2", 2, 0); }
		if( stability < 7.3 ) { return new Prediction("3", 9, 0); }
	}
	}
	if( approval < 7.45 ) { 
	if( stability < 7.7 ) { 
	if( stability >= 3.15 ) { 
	if( approval >= 6.05 ) { 
	if( budget < 7.7 ) { 
		if( stability >= 6.45 ) { return new Prediction("3", 1, 0); }
		if( stability < 6.45 ) { return new Prediction("2", 4, 0); }
	}
		if( budget >= 7.7 ) { return new Prediction("3", 2, 0); }
	}
	if( approval < 6.05 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 4.6 ) { return new Prediction("3", 5, 0); }
	if( stability < 4.6 ) { 
		if( approval < 4.8 ) { return new Prediction("2", 1, 0); }
		if( approval >= 4.8 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 2.9 ) { 
		if( budget >= 3.35 ) { return new Prediction("1", 7, 0); }
		if( budget < 3.35 ) { return new Prediction("2", 5, 0); }
	}
		if( approval < 2.9 ) { return new Prediction("1", 6, 0); }
	}
	}
	}
	if( stability < 3.15 ) { 
		if( budget < 3.85 ) { return new Prediction("3", 6, 0); }
		if( budget >= 3.85 ) { return new Prediction("2", 5, 0); }
	}
	}
	if( stability >= 7.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 8, 0); }
	}
	}
	}
	if( budget >= 8.95 ) { 
		if( budget < 20.9 ) { return new Prediction("2", 8, 0); }
		if( budget >= 20.9 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( stability >= 19.2 ) { 
	if( approval >= 35.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 1, 0); }
	if( "positive".equals(type) ) { 
		if( stability >= 33 ) { return new Prediction("2", 3, 0); }
	if( stability < 33 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 1, 0); }
		if( budget < 31.95 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( approval < 35.2 ) { 
	if( stability >= 25 ) { 
		if( budget >= 28.45 ) { return new Prediction("1", 5, 0); }
	if( budget < 28.45 ) { 
	if( approval < 31.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 4, 0); }
	if( "positive".equals(type) ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 2, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( approval >= 31.2 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( stability < 25 ) { return new Prediction("1", 12, 0); }
	}
	}
	}
	}
	if( approval >= 37.5 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 47.45 ) { 
	if( stability >= 40.45 ) { 
		if( approval >= 42.5 ) { return new Prediction("1", 2, 0); }
		if( approval < 42.5 ) { return new Prediction("3", 1, 0); }
	}
		if( stability < 40.45 ) { return new Prediction("1", 10, 0); }
	}
	if( budget >= 47.45 ) { 
		if( stability < 42.75 ) { return new Prediction("2", 7, 0); }
	if( stability >= 42.75 ) { 
	if( approval >= 48.5 ) { 
		if( budget < 52.85 ) { return new Prediction("1", 12, 0); }
		if( budget >= 52.85 ) { return new Prediction("2", 3, 0); }
	}
		if( approval < 48.5 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 43.05 ) { 
		if( budget < 41.45 ) { return new Prediction("2", 6, 0); }
	if( budget >= 41.45 ) { 
		if( stability >= 42.4 ) { return new Prediction("1", 11, 0); }
	if( stability < 42.4 ) { 
		if( approval < 38.55 ) { return new Prediction("1", 1, 0); }
		if( approval >= 38.55 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	if( approval >= 43.05 ) { 
	if( budget < 45.55 ) { 
		if( approval >= 49.3 ) { return new Prediction("3", 2, 0); }
	if( approval < 49.3 ) { 
		if( approval >= 47.4 ) { return new Prediction("2", 5, 0); }
	if( approval < 47.4 ) { 
		if( budget < 21.4 ) { return new Prediction("2", 3, 0); }
		if( budget >= 21.4 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
		if( budget >= 45.55 ) { return new Prediction("3", 8, 0); }
	}
	}
	}
	}
	if( stability >= 48.85 ) { 
	if( budget >= 45.25 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 5, 0); }
	if( approval < 51.5 ) { 
	if( stability >= 51.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 9, 0); }
	}
		if( stability < 51.5 ) { return new Prediction("3", 8, 0); }
	}
	}
	if( budget < 45.25 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 11, 0); }
	if( "positive".equals(type) ) { 
	if( stability >= 81.25 ) { 
		if( approval >= 30.35 ) { return new Prediction("2", 1, 0); }
		if( approval < 30.35 ) { return new Prediction("1", 1, 0); }
	}
		if( stability < 81.25 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
	if( stability < 1.7 ) { 
		if( budget < 6.9 ) { return new Prediction("1", 5, 0); }
	if( budget >= 6.9 ) { 
		if( approval >= 8.2 ) { return new Prediction("1", 2, 0); }
		if( approval < 8.2 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
		if( stability >= 92.1 ) { return new Prediction("3", 5, 0); }
	}
	if( approval >= 53.2 ) { 
	if( approval < 90.2 ) { 
	if( stability < 83.7 ) { 
		if( stability < 13.95 ) { return new Prediction("3", 9, 0); }
	if( stability >= 13.95 ) { 
	if( budget >= 75 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 17, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 2, 0); }
	}
	if( budget < 75 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 71.85 ) { return new Prediction("1", 10, 0); }
	if( approval < 71.85 ) { 
	if( stability < 57 ) { 
	if( stability < 47.45 ) { 
		if( budget < 42.8 ) { return new Prediction("1", 1, 0); }
		if( budget >= 42.8 ) { return new Prediction("2", 2, 0); }
	}
		if( stability >= 47.45 ) { return new Prediction("1", 3, 0); }
	}
	if( stability >= 57 ) { 
		if( approval < 56.8 ) { return new Prediction("2", 1, 0); }
		if( approval >= 56.8 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 49.95 ) { 
		if( stability >= 29.2 ) { return new Prediction("2", 15, 0); }
	if( stability < 29.2 ) { 
		if( budget >= 25.6 ) { return new Prediction("3", 2, 0); }
		if( budget < 25.6 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( budget >= 49.95 ) { 
	if( approval >= 57.05 ) { 
	if( approval >= 67.55 ) { 
		if( stability < 55.95 ) { return new Prediction("3", 2, 0); }
		if( stability >= 55.95 ) { return new Prediction("2", 2, 0); }
	}
		if( approval < 67.55 ) { return new Prediction("1", 3, 0); }
	}
	if( approval < 57.05 ) { 
		if( budget >= 56.2 ) { return new Prediction("3", 9, 0); }
	if( budget < 56.2 ) { 
		if( approval >= 54.85 ) { return new Prediction("1", 1, 0); }
		if( approval < 54.85 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( stability >= 83.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 18, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 2, 0); }
	}
	}
	if( approval >= 90.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 8, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 9, 0); }
	}
	}
return null;
}
private Prediction runTree80() {
	if( stability < 91.65 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 68.8 ) { 
	if( budget < 79.8 ) { 
		if( approval < 77.3 ) { return new Prediction("3", 17, 0); }
		if( approval >= 77.3 ) { return new Prediction("1", 3, 0); }
	}
		if( budget >= 79.8 ) { return new Prediction("2", 6, 0); }
	}
	if( stability < 68.8 ) { 
	if( budget >= 60.85 ) { 
		if( approval < 79 ) { return new Prediction("2", 38, 0); }
		if( approval >= 79 ) { return new Prediction("1", 2, 0); }
	}
	if( budget < 60.85 ) { 
	if( approval < 48.9 ) { 
	if( budget < 7.35 ) { 
	if( approval < 7.3 ) { 
		if( stability >= 4.45 ) { return new Prediction("3", 7, 0); }
	if( stability < 4.45 ) { 
		if( budget < 3.1 ) { return new Prediction("1", 4, 0); }
		if( budget >= 3.1 ) { return new Prediction("2", 2, 0); }
	}
	}
		if( approval >= 7.3 ) { return new Prediction("1", 16, 0); }
	}
	if( budget >= 7.35 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 12, 0); }
	if( budget < 48.85 ) { 
	if( stability >= 37.15 ) { 
	if( approval >= 42.5 ) { 
		if( budget < 31.05 ) { return new Prediction("3", 1, 0); }
	if( budget >= 31.05 ) { 
		if( stability < 46.75 ) { return new Prediction("1", 5, 0); }
	if( stability >= 46.75 ) { 
		if( approval >= 47.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 47.5 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
		if( approval < 42.5 ) { return new Prediction("3", 10, 0); }
	}
	if( stability < 37.15 ) { 
	if( approval < 28.5 ) { 
		if( stability >= 26.75 ) { return new Prediction("3", 3, 0); }
	if( stability < 26.75 ) { 
	if( budget < 8.95 ) { 
		if( budget < 8.8 ) { return new Prediction("2", 5, 0); }
		if( budget >= 8.8 ) { return new Prediction("3", 1, 0); }
	}
	if( budget >= 8.95 ) { 
	if( budget >= 9.05 ) { 
	if( stability >= 19.55 ) { 
		if( approval < 22 ) { return new Prediction("1", 1, 0); }
		if( approval >= 22 ) { return new Prediction("2", 2, 0); }
	}
		if( stability < 19.55 ) { return new Prediction("2", 13, 0); }
	}
	if( budget < 9.05 ) { 
		if( approval < 5.4 ) { return new Prediction("2", 1, 0); }
		if( approval >= 5.4 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	if( approval >= 28.5 ) { 
	if( budget >= 36.75 ) { 
	if( approval < 37.5 ) { 
	if( approval >= 36.5 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 1, 0); }
		if( budget < 39.15 ) { return new Prediction("2", 5, 2); }
	}
		if( approval < 36.5 ) { return new Prediction("2", 3, 0); }
	}
		if( approval >= 37.5 ) { return new Prediction("1", 2, 0); }
	}
		if( budget < 36.75 ) { return new Prediction("1", 7, 0); }
	}
	}
	}
	}
	}
	if( approval >= 48.9 ) { 
		if( approval >= 53 ) { return new Prediction("1", 19, 0); }
	if( approval < 53 ) { 
	if( stability >= 47.4 ) { 
		if( budget < 51.75 ) { return new Prediction("3", 2, 0); }
		if( budget >= 51.75 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 47.4 ) { return new Prediction("1", 10, 0); }
	}
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 41.35 ) { 
	if( budget < 49.5 ) { 
	if( stability < 49.45 ) { 
	if( budget >= 22.15 ) { 
	if( stability >= 39.05 ) { 
	if( stability >= 45.25 ) { 
		if( budget < 43.85 ) { return new Prediction("2", 2, 0); }
		if( budget >= 43.85 ) { return new Prediction("3", 4, 0); }
	}
		if( stability < 45.25 ) { return new Prediction("2", 6, 0); }
	}
		if( stability < 39.05 ) { return new Prediction("3", 10, 0); }
	}
		if( budget < 22.15 ) { return new Prediction("2", 10, 0); }
	}
	if( stability >= 49.45 ) { 
		if( budget < 47.45 ) { return new Prediction("2", 21, 0); }
	if( budget >= 47.45 ) { 
		if( approval >= 52 ) { return new Prediction("2", 4, 0); }
		if( approval < 52 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( budget >= 49.5 ) { 
	if( approval >= 66.5 ) { 
		if( budget >= 70.1 ) { return new Prediction("3", 17, 0); }
	if( budget < 70.1 ) { 
		if( budget >= 60.4 ) { return new Prediction("2", 2, 0); }
		if( budget < 60.4 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( approval < 66.5 ) { 
		if( approval < 48.85 ) { return new Prediction("3", 12, 0); }
	if( approval >= 48.85 ) { 
		if( stability >= 52.2 ) { return new Prediction("1", 5, 0); }
		if( stability < 52.2 ) { return new Prediction("3", 7, 0); }
	}
	}
	}
	}
	if( approval < 41.35 ) { 
	if( stability < 34.4 ) { 
	if( budget < 32 ) { 
		if( approval < 3.1 ) { return new Prediction("1", 7, 0); }
	if( approval >= 3.1 ) { 
	if( stability >= 4.4 ) { 
	if( budget >= 4.15 ) { 
	if( approval >= 6.15 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 11, 0); }
	if( stability < 28.6 ) { 
	if( budget >= 16.5 ) { 
	if( approval < 23 ) { 
		if( stability < 15.05 ) { return new Prediction("3", 3, 0); }
		if( stability >= 15.05 ) { return new Prediction("1", 2, 0); }
	}
		if( approval >= 23 ) { return new Prediction("3", 4, 0); }
	}
	if( budget < 16.5 ) { 
		if( stability >= 6.7 ) { return new Prediction("2", 8, 0); }
		if( stability < 6.7 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
		if( approval < 6.15 ) { return new Prediction("1", 4, 0); }
	}
		if( budget < 4.15 ) { return new Prediction("2", 12, 0); }
	}
	if( stability < 4.4 ) { 
		if( approval >= 3.95 ) { return new Prediction("3", 20, 0); }
		if( approval < 3.95 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( budget >= 32 ) { 
	if( approval < 32.5 ) { 
		if( stability >= 27.5 ) { return new Prediction("1", 7, 0); }
		if( stability < 27.5 ) { return new Prediction("3", 4, 0); }
	}
		if( approval >= 32.5 ) { return new Prediction("3", 15, 0); }
	}
	}
	if( stability >= 34.4 ) { 
	if( budget < 38.2 ) { 
		if( approval < 28.5 ) { return new Prediction("1", 3, 0); }
		if( approval >= 28.5 ) { return new Prediction("2", 7, 0); }
	}
		if( budget >= 38.2 ) { return new Prediction("1", 39, 0); }
	}
	}
	}
	}
	if( stability >= 91.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 10, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 1, 0); }
	}
return null;
}
private Prediction runTree81() {
	if( stability < 91.65 ) { 
	if( budget < 7.35 ) { 
	if( stability < 8.6 ) { 
	if( approval >= 6.5 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 6.95 ) { return new Prediction("1", 18, 0); }
	if( stability >= 6.95 ) { 
		if( approval < 7.6 ) { return new Prediction("3", 1, 0); }
		if( approval >= 7.6 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( "positive".equals(type) ) { return new Prediction("3", 8, 0); }
	}
	if( approval < 6.5 ) { 
	if( budget < 4.3 ) { 
	if( stability >= 3.4 ) { 
	if( approval >= 2.8 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 10, 0); }
	}
	if( approval < 2.8 ) { 
		if( budget < 1.25 ) { return new Prediction("3", 1, 0); }
		if( budget >= 1.25 ) { return new Prediction("1", 4, 0); }
	}
	}
	if( stability < 3.4 ) { 
	if( budget >= 1.65 ) { 
		if( budget >= 4.05 ) { return new Prediction("2", 1, 0); }
		if( budget < 4.05 ) { return new Prediction("3", 7, 0); }
	}
		if( budget < 1.65 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( budget >= 4.3 ) { 
		if( budget < 5.35 ) { return new Prediction("1", 11, 0); }
	if( budget >= 5.35 ) { 
		if( approval < 3.7 ) { return new Prediction("1", 3, 0); }
	if( approval >= 3.7 ) { 
		if( approval < 4.65 ) { return new Prediction("2", 2, 0); }
		if( approval >= 4.65 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	if( stability >= 8.6 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 3, 0); }
	}
	}
	if( budget >= 7.35 ) { 
	if( budget >= 16.25 ) { 
	if( approval < 45.3 ) { 
	if( budget >= 54.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 18, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 18, 0); }
	}
	if( budget < 54.55 ) { 
	if( stability >= 19.55 ) { 
	if( approval < 26.75 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 20.5 ) { return new Prediction("1", 1, 0); }
		if( budget >= 20.5 ) { return new Prediction("3", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 7, 0); }
	}
	if( approval >= 26.75 ) { 
	if( budget < 40.55 ) { 
	if( stability >= 37.15 ) { 
		if( approval < 31.3 ) { return new Prediction("3", 5, 0); }
	if( approval >= 31.3 ) { 
	if( stability < 42.3 ) { 
		if( approval >= 39.5 ) { return new Prediction("2", 1, 0); }
		if( approval < 39.5 ) { return new Prediction("3", 2, 0); }
	}
		if( stability >= 42.3 ) { return new Prediction("2", 13, 0); }
	}
	}
	if( stability < 37.15 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 38.55 ) { 
	if( approval < 28.5 ) { 
		if( budget < 26.2 ) { return new Prediction("1", 1, 0); }
		if( budget >= 26.2 ) { return new Prediction("2", 2, 0); }
	}
		if( approval >= 28.5 ) { return new Prediction("1", 10, 0); }
	}
		if( budget >= 38.55 ) { return new Prediction("2", 3, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 33.75 ) { 
	if( approval < 37 ) { 
	if( approval >= 33 ) { 
		if( budget < 34.4 ) { return new Prediction("2", 1, 0); }
		if( budget >= 34.4 ) { return new Prediction("1", 2, 0); }
	}
		if( approval < 33 ) { return new Prediction("1", 2, 0); }
	}
		if( approval >= 37 ) { return new Prediction("2", 1, 0); }
	}
	if( stability < 33.75 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 4, 0); }
	if( budget >= 25.7 ) { 
		if( stability < 33.05 ) { return new Prediction("3", 4, 0); }
		if( stability >= 33.05 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
	if( budget >= 40.55 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 41.25 ) { return new Prediction("2", 4, 0); }
	if( stability >= 41.25 ) { 
		if( approval >= 40 ) { return new Prediction("2", 1, 0); }
		if( approval < 40 ) { return new Prediction("3", 8, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 41.1 ) { 
		if( budget < 40.75 ) { return new Prediction("3", 3, 0); }
	if( budget >= 40.75 ) { 
	if( budget < 47.45 ) { 
	if( budget < 43.4 ) { 
		if( approval >= 39.5 ) { return new Prediction("3", 1, 0); }
		if( approval < 39.5 ) { return new Prediction("1", 2, 0); }
	}
		if( budget >= 43.4 ) { return new Prediction("1", 1, 0); }
	}
		if( budget >= 47.45 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( stability >= 41.1 ) { 
	if( budget < 43.4 ) { 
		if( approval >= 39.5 ) { return new Prediction("2", 1, 0); }
		if( approval < 39.5 ) { return new Prediction("1", 1, 0); }
	}
		if( budget >= 43.4 ) { return new Prediction("1", 7, 0); }
	}
	}
	}
	}
	}
	if( stability < 19.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 9, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 7, 0); }
	}
	}
	}
	if( approval >= 45.3 ) { 
	if( budget < 54.05 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 74.3 ) { return new Prediction("1", 16, 0); }
	if( approval < 74.3 ) { 
		if( stability >= 56.7 ) { return new Prediction("3", 12, 0); }
	if( stability < 56.7 ) { 
	if( approval >= 48.5 ) { 
		if( budget < 49.5 ) { return new Prediction("1", 16, 0); }
	if( budget >= 49.5 ) { 
		if( approval < 50.5 ) { return new Prediction("3", 1, 0); }
		if( approval >= 50.5 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( approval < 48.5 ) { 
	if( stability < 48.75 ) { 
		if( budget < 43.25 ) { return new Prediction("1", 3, 0); }
		if( budget >= 43.25 ) { return new Prediction("2", 3, 0); }
	}
		if( stability >= 48.75 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( stability >= 51.1 ) { return new Prediction("2", 21, 0); }
	if( stability < 51.1 ) { 
	if( approval >= 47.5 ) { 
	if( budget < 45.55 ) { 
		if( stability >= 27.55 ) { return new Prediction("2", 7, 0); }
		if( stability < 27.55 ) { return new Prediction("3", 2, 0); }
	}
		if( budget >= 45.55 ) { return new Prediction("3", 7, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	if( budget >= 54.05 ) { 
	if( stability < 52.45 ) { 
	if( approval < 96.05 ) { 
	if( stability < 44.25 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 13, 0); }
	}
		if( stability >= 44.25 ) { return new Prediction("3", 21, 0); }
	}
	if( approval >= 96.05 ) { 
		if( approval < 96.75 ) { return new Prediction("1", 2, 0); }
		if( approval >= 96.75 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( stability >= 52.45 ) { 
	if( stability < 57 ) { 
		if( approval >= 63 ) { return new Prediction("2", 3, 0); }
		if( approval < 63 ) { return new Prediction("1", 7, 0); }
	}
	if( stability >= 57 ) { 
		if( budget >= 91.85 ) { return new Prediction("2", 4, 0); }
	if( budget < 91.85 ) { 
	if( budget < 78.7 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 69 ) { 
		if( budget < 70.5 ) { return new Prediction("3", 8, 0); }
	if( budget >= 70.5 ) { 
		if( approval < 54 ) { return new Prediction("2", 2, 0); }
		if( approval >= 54 ) { return new Prediction("3", 2, 0); }
	}
	}
		if( approval >= 69 ) { return new Prediction("1", 4, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval >= 67.55 ) { return new Prediction("2", 6, 0); }
		if( approval < 67.55 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( budget >= 78.7 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 49.75 ) { return new Prediction("3", 1, 0); }
		if( approval >= 49.75 ) { return new Prediction("2", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 7, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( budget < 16.25 ) { 
	if( approval >= 8.1 ) { 
	if( budget < 9.55 ) { 
		if( budget < 8.95 ) { return new Prediction("3", 2, 0); }
		if( budget >= 8.95 ) { return new Prediction("1", 2, 0); }
	}
	if( budget >= 9.55 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 26.3 ) { 
		if( approval < 14.4 ) { return new Prediction("2", 1, 0); }
		if( approval >= 14.4 ) { return new Prediction("3", 2, 0); }
	}
		if( approval >= 26.3 ) { return new Prediction("1", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 11, 0); }
	}
	}
	if( approval < 8.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 17, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	if( stability >= 91.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 15, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 1, 0); }
	}
return null;
}
private Prediction runTree82() {
	if( stability < 91.65 ) { 
	if( stability >= 7.35 ) { 
	if( budget >= 35.25 ) { 
	if( approval < 14.55 ) { 
		if( stability >= 57.75 ) { return new Prediction("1", 2, 0); }
		if( stability < 57.75 ) { return new Prediction("2", 10, 0); }
	}
	if( approval >= 14.55 ) { 
	if( stability >= 25.7 ) { 
	if( budget < 85.4 ) { 
	if( approval < 30.2 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 68.95 ) { return new Prediction("2", 1, 0); }
		if( budget < 68.95 ) { return new Prediction("3", 8, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 15, 0); }
	}
	if( approval >= 30.2 ) { 
	if( budget >= 63.3 ) { 
	if( approval < 43.6 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 4, 0); }
	}
	if( approval >= 43.6 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 70.35 ) { 
		if( approval < 68.05 ) { return new Prediction("2", 2, 0); }
		if( approval >= 68.05 ) { return new Prediction("1", 1, 0); }
	}
		if( stability >= 70.35 ) { return new Prediction("3", 8, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability >= 76.7 ) { return new Prediction("2", 1, 0); }
		if( stability < 76.7 ) { return new Prediction("3", 16, 0); }
	}
	}
	}
	if( budget < 63.3 ) { 
	if( approval < 78.15 ) { 
	if( budget < 61.05 ) { 
	if( budget < 50.45 ) { 
		if( stability < 31.25 ) { return new Prediction("2", 4, 0); }
	if( stability >= 31.25 ) { 
	if( stability >= 51.8 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 4, 0); }
	}
	if( stability < 51.8 ) { 
	if( approval >= 48.5 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 49.5 ) { return new Prediction("1", 9, 0); }
	if( budget >= 49.5 ) { 
		if( stability < 47 ) { return new Prediction("1", 4, 0); }
		if( stability >= 47 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( approval < 50.5 ) { return new Prediction("3", 2, 0); }
	if( approval >= 50.5 ) { 
		if( approval >= 51.5 ) { return new Prediction("3", 1, 0); }
		if( approval < 51.5 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( approval < 48.5 ) { 
	if( budget < 49.5 ) { 
	if( budget >= 48.85 ) { 
	if( stability >= 47.4 ) { 
		if( approval < 44.5 ) { return new Prediction("1", 1, 0); }
		if( approval >= 44.5 ) { return new Prediction("3", 1, 0); }
	}
	if( stability < 47.4 ) { 
		if( approval < 45 ) { return new Prediction("1", 2, 0); }
		if( approval >= 45 ) { return new Prediction("3", 5, 0); }
	}
	}
	if( budget < 48.85 ) { 
	if( approval >= 40.5 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 45 ) { 
	if( stability >= 44.3 ) { 
		if( approval >= 47.5 ) { return new Prediction("1", 2, 0); }
		if( approval < 47.5 ) { return new Prediction("2", 1, 0); }
	}
		if( stability < 44.3 ) { return new Prediction("2", 2, 0); }
	}
		if( budget < 45 ) { return new Prediction("1", 3, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget >= 39.95 ) { 
		if( stability >= 42 ) { return new Prediction("2", 2, 0); }
		if( stability < 42 ) { return new Prediction("3", 1, 0); }
	}
		if( budget < 39.95 ) { return new Prediction("2", 4, 0); }
	}
	}
	if( approval < 40.5 ) { 
	if( budget < 44.15 ) { 
	if( approval < 35.5 ) { 
	if( stability >= 38.55 ) { 
		if( approval < 32.7 ) { return new Prediction("3", 1, 0); }
		if( approval >= 32.7 ) { return new Prediction("1", 2, 0); }
	}
		if( stability < 38.55 ) { return new Prediction("3", 4, 0); }
	}
	if( approval >= 35.5 ) { 
	if( stability >= 41.3 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 8, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 2, 0); }
	}
	if( stability < 41.3 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 36.75 ) { 
		if( stability >= 38.95 ) { return new Prediction("3", 1, 0); }
		if( stability < 38.95 ) { return new Prediction("2", 4, 0); }
	}
		if( budget < 36.75 ) { return new Prediction("1", 2, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 35.5 ) { 
		if( budget >= 41.9 ) { return new Prediction("3", 1, 0); }
		if( budget < 41.9 ) { return new Prediction("1", 3, 0); }
	}
		if( stability < 35.5 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	if( budget >= 44.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	}
	if( budget >= 49.5 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 42.5 ) { 
		if( stability >= 46.25 ) { return new Prediction("3", 1, 0); }
		if( stability < 46.25 ) { return new Prediction("2", 5, 0); }
	}
		if( approval < 42.5 ) { return new Prediction("2", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	if( budget >= 50.45 ) { 
	if( stability < 58.15 ) { 
	if( approval >= 52.2 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 57 ) { return new Prediction("1", 6, 0); }
		if( stability >= 57 ) { return new Prediction("3", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 9, 0); }
	}
	if( approval < 52.2 ) { 
	if( approval >= 49 ) { 
		if( budget < 52.85 ) { return new Prediction("1", 1, 0); }
		if( budget >= 52.85 ) { return new Prediction("2", 2, 0); }
	}
	if( approval < 49 ) { 
		if( approval >= 39.4 ) { return new Prediction("1", 7, 0); }
		if( approval < 39.4 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( stability >= 58.15 ) { 
		if( approval < 73.6 ) { return new Prediction("1", 3, 0); }
		if( approval >= 73.6 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( budget >= 61.05 ) { 
		if( approval < 56.05 ) { return new Prediction("2", 3, 0); }
		if( approval >= 56.05 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( approval >= 78.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 8, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 8, 0); }
	}
	}
	}
	}
	if( budget >= 85.4 ) { 
		if( approval < 25.6 ) { return new Prediction("1", 4, 0); }
	if( approval >= 25.6 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 28 ) { 
		if( approval < 87.5 ) { return new Prediction("2", 10, 0); }
		if( approval >= 87.5 ) { return new Prediction("1", 2, 0); }
	}
		if( stability < 28 ) { return new Prediction("1", 1, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget >= 88.1 ) { 
		if( approval >= 59.7 ) { return new Prediction("3", 1, 0); }
		if( approval < 59.7 ) { return new Prediction("1", 2, 0); }
	}
		if( budget < 88.1 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	if( stability < 25.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 12, 0); }
	}
	}
	}
	if( budget < 35.25 ) { 
	if( approval >= 53.35 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 72.15 ) { return new Prediction("1", 10, 0); }
	if( stability >= 72.15 ) { 
		if( approval < 80.65 ) { return new Prediction("3", 1, 0); }
		if( approval >= 80.65 ) { return new Prediction("1", 3, 0); }
	}
	}
		if( "positive".equals(type) ) { return new Prediction("2", 12, 0); }
	}
	if( approval < 53.35 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 8.55 ) { return new Prediction("3", 8, 0); }
	if( approval >= 8.55 ) { 
	if( stability < 27.8 ) { 
	if( approval < 28.5 ) { 
		if( budget >= 11.25 ) { return new Prediction("2", 4, 0); }
	if( budget < 11.25 ) { 
		if( approval >= 11.3 ) { return new Prediction("3", 2, 0); }
		if( approval < 11.3 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( approval >= 28.5 ) { return new Prediction("1", 6, 0); }
	}
		if( stability >= 27.8 ) { return new Prediction("3", 8, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 26.75 ) { 
	if( stability < 15.05 ) { 
		if( budget < 14.75 ) { return new Prediction("2", 14, 0); }
		if( budget >= 14.75 ) { return new Prediction("3", 2, 0); }
	}
	if( stability >= 15.05 ) { 
		if( budget >= 16.5 ) { return new Prediction("1", 7, 0); }
		if( budget < 16.5 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( approval >= 26.75 ) { 
		if( stability >= 33.25 ) { return new Prediction("2", 26, 0); }
	if( stability < 33.25 ) { 
	if( approval < 44.95 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 2, 0); }
	if( budget < 31.95 ) { 
	if( approval < 28.5 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 1, 0); }
	if( budget >= 25.7 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 1, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( approval >= 28.5 ) { return new Prediction("2", 5, 0); }
	}
	}
		if( approval >= 44.95 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( stability < 7.35 ) { 
	if( budget < 8.4 ) { 
	if( stability < 4.05 ) { 
	if( approval >= 4.35 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 6, 0); }
	}
	if( approval < 4.35 ) { 
		if( stability < 1.45 ) { return new Prediction("1", 1, 0); }
		if( stability >= 1.45 ) { return new Prediction("2", 6, 0); }
	}
	}
	if( stability >= 4.05 ) { 
	if( approval >= 9.25 ) { 
		if( budget >= 4.7 ) { return new Prediction("3", 2, 0); }
		if( budget < 4.7 ) { return new Prediction("2", 1, 0); }
	}
	if( approval < 9.25 ) { 
	if( budget < 1.75 ) { 
		if( stability >= 4.65 ) { return new Prediction("3", 3, 0); }
		if( stability < 4.65 ) { return new Prediction("1", 2, 0); }
	}
	if( budget >= 1.75 ) { 
	if( stability >= 6.35 ) { 
		if( approval >= 7.1 ) { return new Prediction("1", 6, 0); }
	if( approval < 7.1 ) { 
		if( approval < 4.9 ) { return new Prediction("1", 4, 0); }
	if( approval >= 4.9 ) { 
		if( budget >= 6.25 ) { return new Prediction("1", 1, 0); }
		if( budget < 6.25 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
		if( stability < 6.35 ) { return new Prediction("1", 14, 0); }
	}
	}
	}
	}
	if( budget >= 8.4 ) { 
	if( approval >= 7.9 ) { 
		if( budget >= 9.4 ) { return new Prediction("2", 1, 0); }
		if( budget < 9.4 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 7.9 ) { return new Prediction("2", 8, 0); }
	}
	}
	}
		if( stability >= 91.65 ) { return new Prediction("3", 9, 0); }
return null;
}
private Prediction runTree83() {
	if( stability >= 79.05 ) { 
	if( approval < 44.6 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 6, 0); }
	if( "positive".equals(type) ) { 
		if( stability < 80.95 ) { return new Prediction("2", 1, 0); }
		if( stability >= 80.95 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( approval >= 44.6 ) { 
	if( stability >= 85.65 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 12, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 3, 0); }
	}
	if( stability < 85.65 ) { 
		if( approval >= 69.1 ) { return new Prediction("2", 6, 0); }
		if( approval < 69.1 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( stability < 79.05 ) { 
	if( stability < 7.45 ) { 
	if( approval < 4.2 ) { 
	if( stability < 4.2 ) { 
	if( approval >= 1.6 ) { 
	if( approval < 3 ) { 
		if( approval >= 2.35 ) { return new Prediction("1", 1, 0); }
		if( approval < 2.35 ) { return new Prediction("2", 2, 0); }
	}
		if( approval >= 3 ) { return new Prediction("2", 10, 0); }
	}
		if( approval < 1.6 ) { return new Prediction("1", 3, 0); }
	}
	if( stability >= 4.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 8, 0); }
	}
	}
	if( approval >= 4.2 ) { 
	if( stability >= 4.6 ) { 
		if( approval >= 9.55 ) { return new Prediction("3", 2, 0); }
	if( approval < 9.55 ) { 
		if( budget >= 9.4 ) { return new Prediction("2", 2, 0); }
	if( budget < 9.4 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 7.05 ) { return new Prediction("3", 2, 0); }
		if( approval >= 7.05 ) { return new Prediction("1", 16, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget >= 4.75 ) { return new Prediction("1", 3, 0); }
		if( budget < 4.75 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	}
	if( stability < 4.6 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 15, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 12, 0); }
	}
	}
	}
	if( stability >= 7.45 ) { 
	if( budget >= 35.5 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 46 ) { 
	if( stability >= 36.8 ) { 
	if( budget < 66.7 ) { 
	if( stability < 41.25 ) { 
		if( approval >= 36.5 ) { return new Prediction("2", 2, 0); }
		if( approval < 36.5 ) { return new Prediction("3", 2, 0); }
	}
		if( stability >= 41.25 ) { return new Prediction("3", 13, 0); }
	}
		if( budget >= 66.7 ) { return new Prediction("2", 8, 0); }
	}
	if( stability < 36.8 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 19, 0); }
		if( budget < 39.15 ) { return new Prediction("1", 2, 1); }
	}
	}
	if( approval >= 46 ) { 
	if( stability >= 50.9 ) { 
	if( budget < 69.7 ) { 
	if( approval >= 51.95 ) { 
	if( approval < 69 ) { 
		if( budget >= 51.2 ) { return new Prediction("3", 3, 0); }
		if( budget < 51.2 ) { return new Prediction("1", 3, 0); }
	}
		if( approval >= 69 ) { return new Prediction("1", 8, 0); }
	}
		if( approval < 51.95 ) { return new Prediction("3", 10, 0); }
	}
	if( budget >= 69.7 ) { 
		if( approval < 87.5 ) { return new Prediction("2", 10, 0); }
		if( approval >= 87.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( stability < 50.9 ) { 
		if( budget < 47.3 ) { return new Prediction("1", 11, 0); }
	if( budget >= 47.3 ) { 
	if( approval >= 48.5 ) { 
		if( budget < 56.7 ) { return new Prediction("1", 16, 0); }
	if( budget >= 56.7 ) { 
		if( approval < 80 ) { return new Prediction("2", 6, 0); }
		if( approval >= 80 ) { return new Prediction("1", 3, 0); }
	}
	}
		if( approval < 48.5 ) { return new Prediction("2", 7, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( stability < 31.95 ) { return new Prediction("3", 21, 0); }
	if( stability >= 31.95 ) { 
	if( approval >= 40.5 ) { 
	if( budget < 47.45 ) { 
		if( approval >= 45.5 ) { return new Prediction("2", 13, 0); }
	if( approval < 45.5 ) { 
		if( stability >= 42 ) { return new Prediction("2", 4, 0); }
		if( stability < 42 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( budget >= 47.45 ) { 
	if( stability >= 51.15 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 16, 0); }
	if( approval >= 56.35 ) { 
	if( budget < 77.9 ) { 
	if( stability < 70.85 ) { 
	if( approval < 63.25 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 1, 0); }
		if( budget >= 52.75 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 63.25 ) { return new Prediction("2", 2, 0); }
	}
		if( stability >= 70.85 ) { return new Prediction("1", 1, 0); }
	}
		if( budget >= 77.9 ) { return new Prediction("3", 5, 0); }
	}
	}
	if( stability < 51.15 ) { 
	if( approval < 45 ) { 
		if( stability < 43.15 ) { return new Prediction("3", 1, 0); }
		if( stability >= 43.15 ) { return new Prediction("1", 3, 0); }
	}
		if( approval >= 45 ) { return new Prediction("3", 14, 0); }
	}
	}
	}
	if( approval < 40.5 ) { 
	if( budget < 40.75 ) { 
		if( stability >= 37.5 ) { return new Prediction("1", 2, 0); }
		if( stability < 37.5 ) { return new Prediction("3", 5, 0); }
	}
		if( budget >= 40.75 ) { return new Prediction("1", 37, 0); }
	}
	}
	}
	}
	if( budget < 35.5 ) { 
	if( approval >= 65.85 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 72.15 ) { return new Prediction("1", 10, 0); }
		if( stability >= 72.15 ) { return new Prediction("3", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 7, 0); }
	}
	if( approval < 65.85 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 25 ) { 
		if( stability < 27.8 ) { return new Prediction("1", 4, 0); }
	if( stability >= 27.8 ) { 
		if( approval >= 52.95 ) { return new Prediction("1", 1, 0); }
		if( approval < 52.95 ) { return new Prediction("3", 7, 0); }
	}
	}
	if( stability < 25 ) { 
	if( budget < 9.3 ) { 
	if( approval >= 8.95 ) { 
		if( approval < 11.7 ) { return new Prediction("1", 2, 0); }
		if( approval >= 11.7 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 8.95 ) { return new Prediction("3", 5, 0); }
	}
	if( budget >= 9.3 ) { 
	if( stability >= 16.95 ) { 
	if( approval >= 15 ) { 
		if( budget >= 25.9 ) { return new Prediction("2", 1, 0); }
		if( budget < 25.9 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 15 ) { return new Prediction("3", 2, 0); }
	}
		if( stability < 16.95 ) { return new Prediction("2", 9, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 17.8 ) { 
	if( approval < 45.8 ) { 
	if( approval < 23.05 ) { 
		if( stability < 15.05 ) { return new Prediction("3", 2, 0); }
		if( stability >= 15.05 ) { return new Prediction("1", 2, 0); }
	}
	if( approval >= 23.05 ) { 
		if( approval >= 34.5 ) { return new Prediction("2", 8, 0); }
	if( approval < 34.5 ) { 
		if( approval >= 32.25 ) { return new Prediction("3", 1, 0); }
		if( approval < 32.25 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
		if( approval >= 45.8 ) { return new Prediction("3", 5, 0); }
	}
	if( budget < 17.8 ) { 
		if( approval < 2.7 ) { return new Prediction("1", 3, 0); }
		if( approval >= 2.7 ) { return new Prediction("2", 21, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree84() {
	if( stability < 80.1 ) { 
	if( approval < 84.9 ) { 
	if( approval >= 35.2 ) { 
	if( stability < 61.8 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 58.85 ) { 
		if( stability >= 57.6 ) { return new Prediction("1", 1, 0); }
		if( stability < 57.6 ) { return new Prediction("2", 16, 0); }
	}
	if( budget < 58.85 ) { 
	if( approval < 48.9 ) { 
	if( stability >= 41.7 ) { 
	if( budget >= 44.8 ) { 
	if( budget >= 48.85 ) { 
	if( approval >= 47.5 ) { 
		if( budget >= 51.3 ) { return new Prediction("2", 1, 0); }
	if( budget < 51.3 ) { 
		if( stability < 48.75 ) { return new Prediction("2", 2, 0); }
		if( stability >= 48.75 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( approval < 47.5 ) { return new Prediction("3", 1, 0); }
	}
	if( budget < 48.85 ) { 
		if( approval >= 47.5 ) { return new Prediction("1", 2, 0); }
		if( approval < 47.5 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( budget < 44.8 ) { return new Prediction("3", 7, 0); }
	}
	if( stability < 41.7 ) { 
	if( approval < 37.5 ) { 
		if( budget < 33.9 ) { return new Prediction("3", 1, 0); }
		if( budget >= 33.9 ) { return new Prediction("2", 6, 0); }
	}
	if( approval >= 37.5 ) { 
		if( budget < 43.25 ) { return new Prediction("1", 6, 0); }
		if( budget >= 43.25 ) { return new Prediction("2", 8, 0); }
	}
	}
	}
	if( approval >= 48.9 ) { 
	if( budget < 52.9 ) { 
		if( stability < 56.45 ) { return new Prediction("1", 26, 0); }
	if( stability >= 56.45 ) { 
		if( approval < 61.8 ) { return new Prediction("3", 2, 0); }
		if( approval >= 61.8 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( budget >= 52.9 ) { 
	if( stability < 57 ) { 
		if( budget < 55.65 ) { return new Prediction("2", 1, 0); }
		if( budget >= 55.65 ) { return new Prediction("1", 1, 0); }
	}
		if( stability >= 57 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 41.9 ) { 
	if( stability >= 51.4 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 9, 0); }
	if( approval >= 56.35 ) { 
		if( approval >= 79.05 ) { return new Prediction("3", 2, 0); }
		if( approval < 79.05 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( stability < 51.4 ) { 
		if( approval >= 40.5 ) { return new Prediction("3", 35, 0); }
	if( approval < 40.5 ) { 
	if( budget < 44.4 ) { 
		if( stability < 41.85 ) { return new Prediction("3", 2, 0); }
		if( stability >= 41.85 ) { return new Prediction("1", 4, 0); }
	}
		if( budget >= 44.4 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( budget < 41.9 ) { 
		if( stability >= 38.55 ) { return new Prediction("2", 24, 0); }
	if( stability < 38.55 ) { 
	if( budget >= 33.55 ) { 
		if( stability < 36.4 ) { return new Prediction("3", 10, 0); }
	if( stability >= 36.4 ) { 
		if( approval >= 43 ) { return new Prediction("3", 1, 0); }
		if( approval < 43 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( budget < 33.55 ) { 
		if( stability < 14.15 ) { return new Prediction("3", 5, 0); }
	if( stability >= 14.15 ) { 
		if( stability >= 28 ) { return new Prediction("2", 14, 0); }
	if( stability < 28 ) { 
		if( budget < 21.4 ) { return new Prediction("2", 2, 0); }
		if( budget >= 21.4 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( stability >= 61.8 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 69 ) { return new Prediction("3", 9, 0); }
		if( budget >= 69 ) { return new Prediction("2", 9, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 13, 0); }
	}
	}
	if( approval < 35.2 ) { 
	if( budget < 45.8 ) { 
	if( stability >= 7.35 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 32.55 ) { 
	if( approval >= 8.95 ) { 
	if( stability < 27.8 ) { 
		if( budget >= 28.2 ) { return new Prediction("2", 2, 0); }
	if( budget < 28.2 ) { 
		if( approval >= 15 ) { return new Prediction("1", 6, 0); }
	if( approval < 15 ) { 
		if( budget < 10.4 ) { return new Prediction("1", 1, 0); }
		if( budget >= 10.4 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( stability >= 27.8 ) { 
		if( budget < 28.4 ) { return new Prediction("3", 1, 0); }
		if( budget >= 28.4 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( approval < 8.95 ) { return new Prediction("3", 4, 0); }
	}
		if( stability >= 32.55 ) { return new Prediction("3", 5, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval >= 29.75 ) { return new Prediction("1", 4, 0); }
	if( approval < 29.75 ) { 
	if( budget >= 16.5 ) { 
		if( stability >= 21.85 ) { return new Prediction("2", 5, 0); }
	if( stability < 21.85 ) { 
		if( approval >= 23.5 ) { return new Prediction("2", 1, 0); }
		if( approval < 23.5 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( budget < 16.5 ) { return new Prediction("2", 17, 0); }
	}
	}
	}
	if( stability < 7.35 ) { 
	if( approval < 7.35 ) { 
	if( stability < 4.05 ) { 
	if( approval >= 4.25 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 5, 0); }
	}
		if( approval < 4.25 ) { return new Prediction("2", 8, 0); }
	}
	if( stability >= 4.05 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 4.45 ) { return new Prediction("3", 7, 0); }
	if( stability < 4.45 ) { 
		if( approval < 6.3 ) { return new Prediction("1", 3, 0); }
		if( approval >= 6.3 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( approval >= 5.55 ) { return new Prediction("2", 3, 0); }
	if( approval < 5.55 ) { 
		if( budget < 1.9 ) { return new Prediction("2", 1, 0); }
		if( budget >= 1.9 ) { return new Prediction("1", 11, 0); }
	}
	}
	}
	}
	if( approval >= 7.35 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 19, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	if( budget >= 45.8 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 10, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 24, 0); }
	}
	}
	}
	if( approval >= 84.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 16, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 18, 0); }
	}
	}
	if( stability >= 80.1 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 82.75 ) { 
		if( approval >= 44.25 ) { return new Prediction("2", 2, 0); }
		if( approval < 44.25 ) { return new Prediction("3", 1, 0); }
	}
		if( stability >= 82.75 ) { return new Prediction("3", 32, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval >= 29.65 ) { return new Prediction("2", 11, 0); }
		if( approval < 29.65 ) { return new Prediction("1", 2, 0); }
	}
	}
return null;
}
private Prediction runTree85() {
	if( approval >= 30.8 ) { 
	if( stability < 66.9 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 37.75 ) { 
	if( approval >= 48.5 ) { 
		if( stability < 22.65 ) { return new Prediction("2", 4, 0); }
	if( stability >= 22.65 ) { 
	if( approval < 63.5 ) { 
	if( stability < 56.4 ) { 
	if( stability >= 47.4 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 5, 0); }
	if( approval < 51.5 ) { 
		if( budget >= 50.35 ) { return new Prediction("2", 3, 0); }
		if( budget < 50.35 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( stability < 47.4 ) { return new Prediction("1", 13, 0); }
	}
	if( stability >= 56.4 ) { 
		if( stability >= 61.45 ) { return new Prediction("2", 1, 0); }
		if( stability < 61.45 ) { return new Prediction("3", 4, 0); }
	}
	}
		if( approval >= 63.5 ) { return new Prediction("1", 17, 0); }
	}
	}
	if( approval < 48.5 ) { 
	if( stability >= 37.6 ) { 
	if( approval >= 37.05 ) { 
	if( budget >= 45 ) { 
	if( budget >= 48.85 ) { 
		if( stability < 49.25 ) { return new Prediction("2", 7, 0); }
	if( stability >= 49.25 ) { 
		if( budget >= 62.5 ) { return new Prediction("2", 4, 0); }
		if( budget < 62.5 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( budget < 48.85 ) { 
	if( approval >= 47.5 ) { 
		if( stability >= 44.3 ) { return new Prediction("1", 1, 0); }
		if( stability < 44.3 ) { return new Prediction("2", 3, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( budget < 45 ) { return new Prediction("1", 3, 0); }
	}
		if( approval < 37.05 ) { return new Prediction("3", 9, 0); }
	}
		if( stability < 37.6 ) { return new Prediction("2", 12, 0); }
	}
	}
	if( budget < 37.75 ) { 
		if( stability < 54.7 ) { return new Prediction("1", 15, 0); }
	if( stability >= 54.7 ) { 
		if( approval < 57.45 ) { return new Prediction("3", 2, 0); }
		if( approval >= 57.45 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 40.15 ) { 
	if( stability >= 33 ) { 
		if( budget < 33.6 ) { return new Prediction("2", 17, 0); }
	if( budget >= 33.6 ) { 
	if( stability >= 38.05 ) { 
		if( approval < 35.5 ) { return new Prediction("1", 1, 0); }
		if( approval >= 35.5 ) { return new Prediction("2", 10, 0); }
	}
		if( stability < 38.05 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( stability < 33 ) { 
		if( budget < 18 ) { return new Prediction("2", 2, 0); }
	if( budget >= 18 ) { 
	if( stability >= 28.65 ) { 
		if( approval < 36 ) { return new Prediction("3", 2, 0); }
	if( approval >= 36 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 1, 0); }
		if( budget < 31.95 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( stability < 28.65 ) { return new Prediction("3", 10, 0); }
	}
	}
	}
	if( budget >= 40.15 ) { 
	if( approval < 56.35 ) { 
	if( budget < 45.55 ) { 
	if( stability < 40.15 ) { 
	if( stability >= 36.9 ) { 
		if( approval < 38.5 ) { return new Prediction("1", 4, 0); }
		if( approval >= 38.5 ) { return new Prediction("3", 3, 0); }
	}
		if( stability < 36.9 ) { return new Prediction("3", 3, 0); }
	}
	if( stability >= 40.15 ) { 
		if( approval < 41.5 ) { return new Prediction("1", 3, 0); }
		if( approval >= 41.5 ) { return new Prediction("2", 4, 0); }
	}
	}
	if( budget >= 45.55 ) { 
		if( stability >= 50.45 ) { return new Prediction("1", 10, 0); }
	if( stability < 50.45 ) { 
		if( approval >= 44.3 ) { return new Prediction("3", 14, 0); }
	if( approval < 44.3 ) { 
		if( stability < 31.7 ) { return new Prediction("3", 2, 0); }
		if( stability >= 31.7 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	}
	if( approval >= 56.35 ) { 
		if( budget >= 55.95 ) { return new Prediction("3", 26, 0); }
	if( budget < 55.95 ) { 
		if( stability < 32.65 ) { return new Prediction("3", 3, 0); }
		if( stability >= 32.65 ) { return new Prediction("2", 5, 0); }
	}
	}
	}
	}
	}
	if( stability >= 66.9 ) { 
		if( budget >= 90.9 ) { return new Prediction("2", 5, 0); }
	if( budget < 90.9 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 87.4 ) { 
		if( stability >= 67.9 ) { return new Prediction("3", 41, 0); }
		if( stability < 67.9 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 87.4 ) { return new Prediction("1", 1, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 68.3 ) { 
		if( approval >= 68.4 ) { return new Prediction("2", 9, 0); }
	if( approval < 68.4 ) { 
		if( budget >= 61.1 ) { return new Prediction("1", 3, 0); }
		if( budget < 61.1 ) { return new Prediction("2", 8, 0); }
	}
	}
		if( stability < 68.3 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	if( approval < 30.8 ) { 
	if( budget >= 61.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 8, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 17, 0); }
	}
	if( budget < 61.55 ) { 
	if( approval >= 4.45 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 21.85 ) { 
		if( approval < 23.65 ) { return new Prediction("3", 10, 0); }
	if( approval >= 23.65 ) { 
		if( approval < 30.2 ) { return new Prediction("1", 3, 0); }
	if( approval >= 30.2 ) { 
		if( budget >= 43.1 ) { return new Prediction("3", 1, 0); }
		if( budget < 43.1 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( stability < 21.85 ) { 
	if( budget < 9.55 ) { 
		if( stability >= 9.05 ) { return new Prediction("3", 2, 0); }
	if( stability < 9.05 ) { 
	if( stability >= 6 ) { 
		if( approval >= 6.5 ) { return new Prediction("1", 7, 0); }
		if( approval < 6.5 ) { return new Prediction("3", 1, 0); }
	}
		if( stability < 6 ) { return new Prediction("1", 16, 0); }
	}
	}
	if( budget >= 9.55 ) { 
	if( approval >= 15 ) { 
		if( budget >= 39.95 ) { return new Prediction("2", 1, 0); }
		if( budget < 39.95 ) { return new Prediction("1", 6, 0); }
	}
		if( approval < 15 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 4.6 ) { 
		if( stability >= 32.25 ) { return new Prediction("1", 8, 0); }
	if( stability < 32.25 ) { 
	if( stability < 7.25 ) { 
		if( approval < 7.35 ) { return new Prediction("1", 5, 0); }
		if( approval >= 7.35 ) { return new Prediction("3", 1, 0); }
	}
	if( stability >= 7.25 ) { 
		if( stability < 18.25 ) { return new Prediction("2", 16, 0); }
	if( stability >= 18.25 ) { 
	if( approval >= 18.05 ) { 
		if( budget >= 33.55 ) { return new Prediction("3", 3, 0); }
	if( budget < 33.55 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 6, 0); }
	if( budget >= 25.7 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 3, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
		if( approval < 18.05 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
		if( stability < 4.6 ) { return new Prediction("3", 11, 0); }
	}
	}
	if( approval < 4.45 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 6.4 ) { return new Prediction("2", 8, 0); }
	if( budget < 6.4 ) { 
		if( approval >= 3.4 ) { return new Prediction("2", 3, 0); }
		if( approval < 3.4 ) { return new Prediction("3", 5, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( approval < 3.3 ) { return new Prediction("1", 4, 0); }
	if( approval >= 3.3 ) { 
		if( budget < 3.55 ) { return new Prediction("2", 3, 0); }
		if( budget >= 3.55 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree86() {
	if( approval < 90.9 ) { 
	if( approval < 57.5 ) { 
	if( budget >= 78.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 10, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 11, 0); }
	}
	if( budget < 78.55 ) { 
	if( approval >= 48.5 ) { 
	if( approval >= 54.5 ) { 
	if( budget >= 56.2 ) { 
		if( stability < 48.1 ) { return new Prediction("2", 5, 0); }
	if( stability >= 48.1 ) { 
		if( approval >= 57.05 ) { return new Prediction("1", 1, 0); }
	if( approval < 57.05 ) { 
	if( approval < 56.8 ) { 
		if( approval >= 55.85 ) { return new Prediction("2", 1, 0); }
		if( approval < 55.85 ) { return new Prediction("3", 2, 0); }
	}
		if( approval >= 56.8 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	if( budget < 56.2 ) { 
	if( stability < 52.05 ) { 
		if( approval < 56 ) { return new Prediction("1", 1, 0); }
		if( approval >= 56 ) { return new Prediction("2", 2, 0); }
	}
		if( stability >= 52.05 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( approval < 54.5 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 51.2 ) { return new Prediction("1", 16, 0); }
	if( stability >= 51.2 ) { 
		if( approval < 51.85 ) { return new Prediction("3", 10, 0); }
		if( approval >= 51.85 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( "positive".equals(type) ) { return new Prediction("3", 12, 0); }
	}
	}
	if( approval < 48.5 ) { 
	if( approval < 47.3 ) { 
	if( budget >= 2.75 ) { 
	if( budget < 6.65 ) { 
	if( approval >= 2.65 ) { 
	if( approval < 8.35 ) { 
	if( stability < 7.25 ) { 
	if( approval >= 7.1 ) { 
		if( budget < 5.6 ) { return new Prediction("1", 2, 0); }
		if( budget >= 5.6 ) { return new Prediction("3", 1, 0); }
	}
	if( approval < 7.1 ) { 
		if( budget >= 5.55 ) { return new Prediction("1", 1, 0); }
	if( budget < 5.55 ) { 
		if( budget < 3.8 ) { return new Prediction("3", 4, 0); }
	if( budget >= 3.8 ) { 
		if( stability >= 6.45 ) { return new Prediction("3", 4, 0); }
	if( stability < 6.45 ) { 
		if( stability < 1.95 ) { return new Prediction("3", 1, 0); }
	if( stability >= 1.95 ) { 
	if( approval < 5.5 ) { 
		if( approval >= 4.45 ) { return new Prediction("1", 1, 0); }
		if( approval < 4.45 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 5.5 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( stability >= 7.25 ) { 
		if( stability < 9 ) { return new Prediction("2", 4, 0); }
		if( stability >= 9 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( approval >= 8.35 ) { return new Prediction("3", 8, 0); }
	}
		if( approval < 2.65 ) { return new Prediction("1", 4, 0); }
	}
	if( budget >= 6.65 ) { 
	if( budget < 7.45 ) { 
	if( approval < 4.65 ) { 
		if( approval < 3.7 ) { return new Prediction("1", 3, 0); }
		if( approval >= 3.7 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 4.65 ) { return new Prediction("1", 7, 0); }
	}
	if( budget >= 7.45 ) { 
	if( stability >= 19.55 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 39.6 ) { 
	if( approval < 32.65 ) { 
		if( stability >= 21.85 ) { return new Prediction("3", 11, 0); }
		if( stability < 21.85 ) { return new Prediction("1", 1, 0); }
	}
	if( approval >= 32.65 ) { 
		if( stability >= 39.3 ) { return new Prediction("3", 1, 0); }
	if( stability < 39.3 ) { 
	if( approval < 37.5 ) { 
	if( approval >= 35.2 ) { 
		if( approval >= 36.5 ) { return new Prediction("1", 2, 1); }
		if( approval < 36.5 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 35.2 ) { return new Prediction("1", 2, 0); }
	}
		if( approval >= 37.5 ) { return new Prediction("1", 7, 0); }
	}
	}
	}
	if( budget >= 39.6 ) { 
	if( stability >= 41.7 ) { 
	if( budget >= 66 ) { 
		if( approval < 40.55 ) { return new Prediction("2", 4, 0); }
		if( approval >= 40.55 ) { return new Prediction("3", 1, 0); }
	}
	if( budget < 66 ) { 
		if( approval < 40.9 ) { return new Prediction("3", 10, 0); }
	if( approval >= 40.9 ) { 
		if( approval < 45 ) { return new Prediction("2", 1, 0); }
		if( approval >= 45 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
		if( stability < 41.7 ) { return new Prediction("2", 13, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 39.65 ) { 
	if( budget < 50.45 ) { 
	if( budget < 49.5 ) { 
	if( stability >= 36.9 ) { 
		if( approval < 38.5 ) { return new Prediction("1", 8, 0); }
	if( approval >= 38.5 ) { 
	if( stability < 46.75 ) { 
	if( approval < 45 ) { 
		if( stability < 42.6 ) { return new Prediction("3", 2, 0); }
	if( stability >= 42.6 ) { 
		if( budget < 44.95 ) { return new Prediction("2", 1, 0); }
		if( budget >= 44.95 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( approval >= 45 ) { return new Prediction("3", 2, 0); }
	}
		if( stability >= 46.75 ) { return new Prediction("1", 4, 0); }
	}
	}
		if( stability < 36.9 ) { return new Prediction("3", 3, 0); }
	}
		if( budget >= 49.5 ) { return new Prediction("3", 4, 0); }
	}
		if( budget >= 50.45 ) { return new Prediction("1", 15, 0); }
	}
	if( budget < 39.65 ) { 
	if( approval < 26.75 ) { 
		if( budget >= 16.5 ) { return new Prediction("1", 9, 0); }
		if( budget < 16.5 ) { return new Prediction("2", 2, 0); }
	}
	if( approval >= 26.75 ) { 
		if( stability >= 41.6 ) { return new Prediction("2", 15, 0); }
	if( stability < 41.6 ) { 
	if( budget < 32.8 ) { 
		if( approval >= 42.4 ) { return new Prediction("3", 1, 0); }
	if( approval < 42.4 ) { 
		if( stability >= 21.85 ) { return new Prediction("2", 7, 0); }
	if( stability < 21.85 ) { 
		if( budget >= 23.4 ) { return new Prediction("3", 1, 0); }
		if( budget < 23.4 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( budget >= 32.8 ) { 
		if( approval < 32.5 ) { return new Prediction("1", 2, 0); }
	if( approval >= 32.5 ) { 
		if( stability < 36.6 ) { return new Prediction("3", 3, 0); }
		if( stability >= 36.6 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( stability < 19.55 ) { 
	if( budget < 45.2 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 9.05 ) { return new Prediction("2", 12, 0); }
	if( budget < 9.05 ) { 
		if( approval >= 7 ) { return new Prediction("1", 1, 0); }
		if( approval < 7 ) { return new Prediction("2", 4, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( budget < 9.45 ) { return new Prediction("3", 3, 0); }
	if( budget >= 9.45 ) { 
		if( budget >= 16.4 ) { return new Prediction("3", 1, 0); }
		if( budget < 16.4 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	if( budget >= 45.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	}
	}
	if( budget < 2.75 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 1.6 ) { return new Prediction("1", 14, 0); }
	if( budget < 1.6 ) { 
		if( stability >= 2.9 ) { return new Prediction("3", 3, 0); }
		if( stability < 2.9 ) { return new Prediction("1", 4, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( budget < 2.5 ) { return new Prediction("2", 9, 0); }
	if( budget >= 2.5 ) { 
		if( stability >= 4.65 ) { return new Prediction("1", 2, 0); }
		if( stability < 4.65 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	if( approval >= 47.3 ) { 
	if( stability < 46.75 ) { 
		if( budget >= 45 ) { return new Prediction("2", 6, 0); }
	if( budget < 45 ) { 
		if( stability < 43.55 ) { return new Prediction("2", 2, 0); }
		if( stability >= 43.55 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( stability >= 46.75 ) { 
	if( budget >= 48.85 ) { 
		if( approval < 47.8 ) { return new Prediction("2", 2, 0); }
	if( approval >= 47.8 ) { 
	if( stability < 48.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 1, 0); }
	}
		if( stability >= 48.75 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( budget < 48.85 ) { 
		if( budget < 43.7 ) { return new Prediction("2", 2, 0); }
		if( budget >= 43.7 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( approval >= 57.5 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 76 ) { 
	if( stability < 72.15 ) { 
	if( budget >= 59.45 ) { 
		if( approval >= 72.75 ) { return new Prediction("1", 1, 0); }
		if( approval < 72.75 ) { return new Prediction("3", 1, 0); }
	}
		if( budget < 59.45 ) { return new Prediction("1", 14, 0); }
	}
	if( stability >= 72.15 ) { 
	if( budget < 35 ) { 
		if( approval < 80.65 ) { return new Prediction("3", 5, 0); }
		if( approval >= 80.65 ) { return new Prediction("1", 1, 0); }
	}
		if( budget >= 35 ) { return new Prediction("3", 13, 0); }
	}
	}
		if( budget >= 76 ) { return new Prediction("2", 19, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget >= 69.6 ) { return new Prediction("3", 17, 0); }
	if( budget < 69.6 ) { 
		if( budget < 40.9 ) { return new Prediction("2", 18, 0); }
	if( budget >= 40.9 ) { 
		if( stability >= 54.05 ) { return new Prediction("2", 8, 0); }
		if( stability < 54.05 ) { return new Prediction("3", 7, 0); }
	}
	}
	}
	}
	}
	if( approval >= 90.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 16, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 3, 0); }
	}
return null;
}
private Prediction runTree87() {
	if( approval < 29.1 ) { 
	if( budget >= 65.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 9, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 19, 0); }
	}
	if( budget < 65.5 ) { 
	if( approval < 7.4 ) { 
	if( approval >= 5.85 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 7.15 ) { return new Prediction("3", 6, 0); }
		if( approval >= 7.15 ) { return new Prediction("2", 1, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget < 6.75 ) { return new Prediction("2", 11, 0); }
		if( budget >= 6.75 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( approval < 5.85 ) { 
	if( budget < 9.2 ) { 
	if( approval >= 3.35 ) { 
	if( approval >= 4.45 ) { 
	if( approval < 5.5 ) { 
		if( stability < 1.45 ) { return new Prediction("1", 1, 0); }
	if( stability >= 1.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 3, 0); }
	if( "positive".equals(type) ) { 
		if( budget >= 7.9 ) { return new Prediction("3", 1, 0); }
		if( budget < 7.9 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( approval >= 5.5 ) { 
	if( approval >= 5.65 ) { 
		if( budget >= 4.05 ) { return new Prediction("1", 2, 0); }
		if( budget < 4.05 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 5.65 ) { return new Prediction("2", 3, 0); }
	}
	}
	if( approval < 4.45 ) { 
		if( budget < 3.55 ) { return new Prediction("2", 8, 0); }
	if( budget >= 3.55 ) { 
		if( budget < 4.55 ) { return new Prediction("1", 1, 0); }
		if( budget >= 4.55 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( approval < 3.35 ) { 
		if( stability >= 8.2 ) { return new Prediction("3", 3, 0); }
	if( stability < 8.2 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 2.55 ) { return new Prediction("1", 1, 0); }
		if( approval < 2.55 ) { return new Prediction("3", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("1", 7, 0); }
	}
	}
	}
		if( budget >= 9.2 ) { return new Prediction("2", 6, 0); }
	}
	}
	if( approval >= 7.4 ) { 
	if( budget >= 3.75 ) { 
	if( stability >= 4.6 ) { 
	if( budget < 52.65 ) { 
		if( stability < 5.55 ) { return new Prediction("1", 8, 0); }
	if( stability >= 5.55 ) { 
	if( stability >= 33 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 6, 0); }
	}
	if( stability < 33 ) { 
	if( stability >= 21.85 ) { 
		if( budget >= 23.7 ) { return new Prediction("2", 2, 0); }
		if( budget < 23.7 ) { return new Prediction("3", 3, 0); }
	}
	if( stability < 21.85 ) { 
	if( budget < 8.5 ) { 
		if( approval < 8.35 ) { return new Prediction("2", 1, 0); }
	if( approval >= 8.35 ) { 
		if( budget < 7.6 ) { return new Prediction("1", 4, 0); }
		if( budget >= 7.6 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( budget >= 8.5 ) { 
	if( stability >= 19.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 4, 0); }
	if( "positive".equals(type) ) { 
		if( approval >= 23.5 ) { return new Prediction("2", 2, 0); }
		if( approval < 23.5 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( stability < 19.55 ) { return new Prediction("2", 9, 0); }
	}
	}
	}
	}
	}
		if( budget >= 52.65 ) { return new Prediction("3", 5, 0); }
	}
		if( stability < 4.6 ) { return new Prediction("3", 10, 0); }
	}
		if( budget < 3.75 ) { return new Prediction("1", 15, 0); }
	}
	}
	}
	if( approval >= 29.1 ) { 
	if( budget < 57.1 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 48.9 ) { 
	if( budget < 39.6 ) { 
		if( stability < 35.65 ) { return new Prediction("1", 9, 0); }
	if( stability >= 35.65 ) { 
	if( approval >= 42 ) { 
		if( approval < 47.9 ) { return new Prediction("1", 4, 0); }
		if( approval >= 47.9 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 42 ) { return new Prediction("3", 14, 0); }
	}
	}
	if( budget >= 39.6 ) { 
	if( stability < 48.75 ) { 
	if( approval < 37.5 ) { 
		if( stability < 37.2 ) { return new Prediction("2", 5, 0); }
		if( stability >= 37.2 ) { return new Prediction("3", 3, 0); }
	}
	if( approval >= 37.5 ) { 
		if( budget < 43.15 ) { return new Prediction("1", 1, 0); }
	if( budget >= 43.15 ) { 
	if( approval >= 47.5 ) { 
	if( budget < 49.85 ) { 
		if( stability >= 44.3 ) { return new Prediction("1", 1, 0); }
		if( stability < 44.3 ) { return new Prediction("2", 1, 0); }
	}
		if( budget >= 49.85 ) { return new Prediction("2", 2, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("2", 15, 0); }
	}
	}
	}
		if( stability >= 48.75 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( approval >= 48.9 ) { 
	if( budget < 53.95 ) { 
	if( stability >= 48 ) { 
	if( approval >= 52.35 ) { 
	if( budget >= 12.55 ) { 
	if( stability >= 78.2 ) { 
		if( approval < 78.6 ) { return new Prediction("3", 1, 0); }
		if( approval >= 78.6 ) { return new Prediction("1", 1, 0); }
	}
		if( stability < 78.2 ) { return new Prediction("1", 11, 0); }
	}
		if( budget < 12.55 ) { return new Prediction("3", 2, 0); }
	}
		if( approval < 52.35 ) { return new Prediction("3", 4, 0); }
	}
		if( stability < 48 ) { return new Prediction("1", 21, 0); }
	}
	if( budget >= 53.95 ) { 
		if( budget < 55.65 ) { return new Prediction("2", 3, 0); }
	if( budget >= 55.65 ) { 
		if( stability < 57 ) { return new Prediction("1", 4, 0); }
		if( stability >= 57 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 40.15 ) { 
	if( stability < 32.9 ) { 
		if( budget < 18.95 ) { return new Prediction("2", 4, 0); }
		if( budget >= 18.95 ) { return new Prediction("3", 11, 0); }
	}
	if( stability >= 32.9 ) { 
	if( approval >= 30.85 ) { 
		if( budget < 38.85 ) { return new Prediction("2", 31, 0); }
	if( budget >= 38.85 ) { 
		if( stability >= 38.65 ) { return new Prediction("2", 3, 0); }
		if( stability < 38.65 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( approval < 30.85 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( budget >= 40.15 ) { 
	if( stability >= 51.4 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 7, 0); }
	if( approval >= 56.35 ) { 
		if( approval >= 67.7 ) { return new Prediction("2", 5, 0); }
	if( approval < 67.7 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 6, 0); }
		if( budget >= 52.75 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( stability < 51.4 ) { 
	if( approval < 45 ) { 
	if( stability >= 40.7 ) { 
	if( approval >= 42 ) { 
		if( budget < 44.95 ) { return new Prediction("2", 1, 0); }
		if( budget >= 44.95 ) { return new Prediction("1", 2, 0); }
	}
		if( approval < 42 ) { return new Prediction("1", 9, 0); }
	}
	if( stability < 40.7 ) { 
	if( stability >= 36.9 ) { 
		if( approval >= 39 ) { return new Prediction("3", 3, 0); }
		if( approval < 39 ) { return new Prediction("1", 5, 0); }
	}
		if( stability < 36.9 ) { return new Prediction("3", 5, 0); }
	}
	}
	if( approval >= 45 ) { 
		if( approval >= 48.5 ) { return new Prediction("3", 11, 0); }
	if( approval < 48.5 ) { 
		if( budget < 47.1 ) { return new Prediction("2", 1, 0); }
		if( budget >= 47.1 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	}
	}
	}
	if( budget >= 57.1 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 68.8 ) { 
		if( budget < 86.3 ) { return new Prediction("3", 15, 0); }
		if( budget >= 86.3 ) { return new Prediction("2", 6, 0); }
	}
	if( stability < 68.8 ) { 
		if( approval >= 85.95 ) { return new Prediction("1", 6, 0); }
		if( approval < 85.95 ) { return new Prediction("2", 21, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 56.2 ) { 
	if( approval >= 67.55 ) { 
		if( stability < 59.2 ) { return new Prediction("2", 3, 0); }
	if( stability >= 59.2 ) { 
		if( budget >= 74.65 ) { return new Prediction("3", 2, 0); }
		if( budget < 74.65 ) { return new Prediction("2", 3, 0); }
	}
	}
	if( approval < 67.55 ) { 
		if( budget >= 61.1 ) { return new Prediction("1", 3, 0); }
		if( budget < 61.1 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( stability < 56.2 ) { 
		if( approval < 42.9 ) { return new Prediction("1", 1, 0); }
		if( approval >= 42.9 ) { return new Prediction("3", 23, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree88() {
	if( budget >= 85.8 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 86.95 ) { return new Prediction("1", 4, 0); }
		if( approval < 86.95 ) { return new Prediction("2", 23, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval >= 60.45 ) { return new Prediction("3", 1, 0); }
		if( approval < 60.45 ) { return new Prediction("1", 16, 0); }
	}
	}
	if( budget < 85.8 ) { 
	if( stability >= 69.25 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 84.2 ) { return new Prediction("3", 36, 0); }
		if( approval >= 84.2 ) { return new Prediction("1", 6, 0); }
	}
	if( "positive".equals(type) ) { 
	if( approval < 41.6 ) { 
		if( stability >= 81.25 ) { return new Prediction("1", 3, 0); }
		if( stability < 81.25 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 41.6 ) { return new Prediction("2", 11, 0); }
	}
	}
	if( stability < 69.25 ) { 
	if( budget < 45.8 ) { 
	if( stability >= 4.65 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 7.3 ) { 
	if( approval < 4.4 ) { 
		if( approval >= 2.1 ) { return new Prediction("2", 3, 0); }
		if( approval < 2.1 ) { return new Prediction("3", 1, 0); }
	}
		if( approval >= 4.4 ) { return new Prediction("3", 3, 0); }
	}
	if( approval >= 7.3 ) { 
	if( stability >= 39.3 ) { 
	if( approval < 57.95 ) { 
		if( budget < 40.95 ) { return new Prediction("3", 7, 0); }
	if( budget >= 40.95 ) { 
		if( approval >= 42 ) { return new Prediction("1", 1, 0); }
		if( approval < 42 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( approval >= 57.95 ) { return new Prediction("1", 2, 0); }
	}
	if( stability < 39.3 ) { 
	if( approval >= 15 ) { 
	if( budget >= 39.15 ) { 
		if( approval >= 59.95 ) { return new Prediction("1", 2, 0); }
		if( approval < 59.95 ) { return new Prediction("2", 5, 0); }
	}
	if( budget < 39.15 ) { 
		if( stability < 35.55 ) { return new Prediction("1", 18, 0); }
	if( stability >= 35.55 ) { 
		if( approval < 41.5 ) { return new Prediction("2", 1, 0); }
		if( approval >= 41.5 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( approval < 15 ) { 
	if( budget >= 9.4 ) { 
		if( stability >= 19.1 ) { return new Prediction("3", 3, 0); }
		if( stability < 19.1 ) { return new Prediction("2", 3, 0); }
	}
	if( budget < 9.4 ) { 
		if( stability >= 8.3 ) { return new Prediction("3", 4, 0); }
		if( stability < 8.3 ) { return new Prediction("1", 18, 0); }
	}
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 5.55 ) { 
	if( stability >= 38.55 ) { 
		if( approval >= 40.5 ) { return new Prediction("2", 21, 0); }
	if( approval < 40.5 ) { 
		if( budget < 36.85 ) { return new Prediction("2", 6, 0); }
		if( budget >= 36.85 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( stability < 38.55 ) { 
	if( budget < 17.4 ) { 
		if( stability >= 6.35 ) { return new Prediction("2", 23, 0); }
	if( stability < 6.35 ) { 
		if( budget < 6 ) { return new Prediction("2", 2, 0); }
		if( budget >= 6 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( budget >= 17.4 ) { 
		if( approval < 23.05 ) { return new Prediction("1", 6, 0); }
	if( approval >= 23.05 ) { 
	if( stability < 33.05 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 7, 0); }
	if( budget < 31.95 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 6, 0); }
	if( stability < 28.6 ) { 
	if( approval < 30.2 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 1, 0); }
		if( budget >= 25.7 ) { return new Prediction("3", 2, 0); }
	}
		if( approval >= 30.2 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	if( stability >= 33.05 ) { 
		if( budget < 33.6 ) { return new Prediction("2", 7, 0); }
	if( budget >= 33.6 ) { 
		if( budget >= 39.95 ) { return new Prediction("3", 1, 0); }
	if( budget < 39.95 ) { 
	if( approval >= 33 ) { 
		if( stability >= 35.5 ) { return new Prediction("1", 2, 0); }
		if( stability < 35.5 ) { return new Prediction("3", 2, 0); }
	}
		if( approval < 33 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( approval < 5.55 ) { 
		if( stability < 7.4 ) { return new Prediction("1", 9, 0); }
	if( stability >= 7.4 ) { 
		if( budget < 1.75 ) { return new Prediction("1", 1, 0); }
		if( budget >= 1.75 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	if( stability < 4.65 ) { 
	if( stability >= 1.6 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 3 ) { 
		if( approval < 4.95 ) { return new Prediction("2", 7, 0); }
	if( approval >= 4.95 ) { 
		if( approval < 6.45 ) { return new Prediction("1", 2, 0); }
		if( approval >= 6.45 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( budget < 3 ) { return new Prediction("3", 4, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 4.4 ) { return new Prediction("2", 7, 0); }
		if( approval >= 4.4 ) { return new Prediction("3", 16, 0); }
	}
	}
	if( stability < 1.6 ) { 
		if( budget >= 4.95 ) { return new Prediction("1", 3, 0); }
		if( budget < 4.95 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( budget >= 45.8 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 47.5 ) { 
	if( budget < 59.85 ) { 
	if( stability < 52.75 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 17, 0); }
	if( approval < 48.5 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 2, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( stability >= 52.75 ) { 
	if( approval < 63.5 ) { 
		if( approval < 54 ) { return new Prediction("3", 5, 0); }
	if( approval >= 54 ) { 
		if( stability < 57 ) { return new Prediction("1", 1, 0); }
		if( stability >= 57 ) { return new Prediction("3", 3, 0); }
	}
	}
		if( approval >= 63.5 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( budget >= 59.85 ) { 
		if( approval < 70.95 ) { return new Prediction("2", 9, 0); }
		if( approval >= 70.95 ) { return new Prediction("1", 7, 0); }
	}
	}
	if( approval < 47.5 ) { 
		if( stability < 56.35 ) { return new Prediction("2", 12, 0); }
	if( stability >= 56.35 ) { 
		if( approval >= 39.45 ) { return new Prediction("2", 1, 0); }
		if( approval < 39.45 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 36.55 ) { 
	if( approval < 45 ) { 
	if( stability < 40.4 ) { 
		if( budget < 47.45 ) { return new Prediction("1", 5, 0); }
		if( budget >= 47.45 ) { return new Prediction("3", 1, 0); }
	}
		if( stability >= 40.4 ) { return new Prediction("1", 24, 0); }
	}
	if( approval >= 45 ) { 
	if( approval < 56.35 ) { 
		if( stability >= 50.1 ) { return new Prediction("1", 7, 0); }
		if( stability < 50.1 ) { return new Prediction("3", 15, 0); }
	}
	if( approval >= 56.35 ) { 
	if( budget < 67.2 ) { 
		if( stability < 48.15 ) { return new Prediction("3", 2, 0); }
		if( stability >= 48.15 ) { return new Prediction("2", 5, 0); }
	}
		if( budget >= 67.2 ) { return new Prediction("3", 7, 0); }
	}
	}
	}
		if( stability < 36.55 ) { return new Prediction("3", 14, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree89() {
	if( stability < 9.15 ) { 
	if( budget < 7.35 ) { 
		if( approval < 3 ) { return new Prediction("1", 16, 0); }
	if( approval >= 3 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 4.75 ) { return new Prediction("2", 3, 0); }
	if( approval >= 4.75 ) { 
		if( approval >= 7.1 ) { return new Prediction("1", 23, 0); }
	if( approval < 7.1 ) { 
		if( budget >= 5.25 ) { return new Prediction("3", 3, 0); }
		if( budget < 5.25 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 4.4 ) { 
	if( budget >= 4.15 ) { 
	if( budget >= 4.95 ) { 
		if( approval < 5.35 ) { return new Prediction("1", 1, 0); }
		if( approval >= 5.35 ) { return new Prediction("2", 7, 0); }
	}
		if( budget < 4.95 ) { return new Prediction("1", 4, 0); }
	}
		if( budget < 4.15 ) { return new Prediction("2", 6, 0); }
	}
	if( stability < 4.4 ) { 
		if( approval >= 4.05 ) { return new Prediction("3", 6, 0); }
	if( approval < 4.05 ) { 
		if( budget < 4.65 ) { return new Prediction("2", 3, 0); }
		if( budget >= 4.65 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	}
	if( budget >= 7.35 ) { 
	if( approval >= 9.15 ) { 
		if( approval >= 9.45 ) { return new Prediction("3", 1, 0); }
		if( approval < 9.45 ) { return new Prediction("1", 2, 0); }
	}
	if( approval < 9.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 12, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( stability >= 9.15 ) { 
	if( stability < 19.6 ) { 
	if( budget >= 18.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 2, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 15, 0); }
	}
	if( budget < 18.75 ) { 
		if( approval >= 8.95 ) { return new Prediction("2", 9, 0); }
	if( approval < 8.95 ) { 
		if( budget >= 8.1 ) { return new Prediction("2", 1, 0); }
		if( budget < 8.1 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	if( stability >= 19.6 ) { 
	if( budget >= 89.15 ) { 
		if( approval >= 86.95 ) { return new Prediction("1", 3, 0); }
	if( approval < 86.95 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 14, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 5, 0); }
	}
	}
	if( budget < 89.15 ) { 
	if( budget >= 40.05 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 68.2 ) { 
		if( budget < 70.5 ) { return new Prediction("3", 15, 0); }
	if( budget >= 70.5 ) { 
		if( stability < 79.9 ) { return new Prediction("2", 2, 0); }
		if( stability >= 79.9 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( stability < 68.2 ) { 
	if( approval >= 69.35 ) { 
	if( stability < 56.4 ) { 
		if( stability < 45.35 ) { return new Prediction("1", 4, 0); }
		if( stability >= 45.35 ) { return new Prediction("2", 1, 0); }
	}
		if( stability >= 56.4 ) { return new Prediction("1", 13, 0); }
	}
	if( approval < 69.35 ) { 
		if( budget >= 58.85 ) { return new Prediction("2", 20, 0); }
	if( budget < 58.85 ) { 
	if( stability < 49.4 ) { 
	if( approval >= 47.5 ) { 
	if( budget < 52.3 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 10, 0); }
	if( approval < 48.5 ) { 
	if( budget >= 45 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 5, 0); }
	if( budget < 48.85 ) { 
		if( stability >= 44.3 ) { return new Prediction("1", 1, 0); }
		if( stability < 44.3 ) { return new Prediction("2", 2, 0); }
	}
	}
		if( budget < 45 ) { return new Prediction("1", 4, 0); }
	}
	}
		if( budget >= 52.3 ) { return new Prediction("2", 5, 0); }
	}
	if( approval < 47.5 ) { 
		if( stability < 42.75 ) { return new Prediction("2", 9, 0); }
	if( stability >= 42.75 ) { 
		if( budget < 46.15 ) { return new Prediction("3", 4, 0); }
		if( budget >= 46.15 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( stability >= 49.4 ) { 
	if( approval >= 51.5 ) { 
		if( stability < 57 ) { return new Prediction("1", 5, 0); }
		if( stability >= 57 ) { return new Prediction("3", 2, 0); }
	}
		if( approval < 51.5 ) { return new Prediction("3", 10, 0); }
	}
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 44.5 ) { 
	if( stability < 40.4 ) { 
	if( approval >= 36.5 ) { 
		if( approval >= 38.05 ) { return new Prediction("3", 3, 0); }
	if( approval < 38.05 ) { 
		if( budget < 42.8 ) { return new Prediction("3", 1, 0); }
		if( budget >= 42.8 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( approval < 36.5 ) { return new Prediction("1", 3, 0); }
	}
		if( stability >= 40.4 ) { return new Prediction("1", 20, 0); }
	}
	if( approval >= 44.5 ) { 
	if( budget >= 60.75 ) { 
		if( approval >= 66.5 ) { return new Prediction("3", 19, 0); }
	if( approval < 66.5 ) { 
		if( stability < 50.3 ) { return new Prediction("3", 7, 0); }
		if( stability >= 50.3 ) { return new Prediction("1", 4, 0); }
	}
	}
	if( budget < 60.75 ) { 
	if( approval < 60.2 ) { 
	if( stability >= 51.4 ) { 
		if( approval >= 54.6 ) { return new Prediction("3", 3, 0); }
		if( approval < 54.6 ) { return new Prediction("1", 5, 0); }
	}
	if( stability < 51.4 ) { 
		if( budget < 43.25 ) { return new Prediction("2", 1, 0); }
		if( budget >= 43.25 ) { return new Prediction("3", 17, 0); }
	}
	}
	if( approval >= 60.2 ) { 
		if( approval < 77.55 ) { return new Prediction("2", 6, 0); }
	if( approval >= 77.55 ) { 
		if( budget < 56.35 ) { return new Prediction("2", 5, 0); }
		if( budget >= 56.35 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( budget < 40.05 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 37 ) { 
		if( stability >= 37.5 ) { return new Prediction("3", 6, 0); }
	if( stability < 37.5 ) { 
	if( budget < 29.9 ) { 
		if( approval < 21 ) { return new Prediction("3", 1, 0); }
		if( approval >= 21 ) { return new Prediction("1", 5, 0); }
	}
		if( budget >= 29.9 ) { return new Prediction("2", 5, 0); }
	}
	}
	if( approval >= 37 ) { 
	if( stability < 72.15 ) { 
	if( stability >= 40.45 ) { 
		if( stability < 41.05 ) { return new Prediction("3", 1, 0); }
		if( stability >= 41.05 ) { return new Prediction("1", 4, 0); }
	}
		if( stability < 40.45 ) { return new Prediction("1", 12, 0); }
	}
		if( stability >= 72.15 ) { return new Prediction("3", 6, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 26.75 ) { 
		if( budget < 20.5 ) { return new Prediction("2", 1, 0); }
		if( budget >= 20.5 ) { return new Prediction("1", 6, 0); }
	}
	if( approval >= 26.75 ) { 
	if( stability < 33.05 ) { 
		if( budget >= 24.6 ) { return new Prediction("3", 11, 0); }
		if( budget < 24.6 ) { return new Prediction("2", 6, 0); }
	}
	if( stability >= 33.05 ) { 
		if( budget < 38.85 ) { return new Prediction("2", 39, 0); }
	if( budget >= 38.85 ) { 
		if( approval < 38.5 ) { return new Prediction("1", 1, 0); }
	if( approval >= 38.5 ) { 
		if( stability >= 38.65 ) { return new Prediction("2", 4, 0); }
		if( stability < 38.65 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree90() {
	if( approval >= 41.35 ) { 
		if( stability < 14.25 ) { return new Prediction("3", 10, 0); }
	if( stability >= 14.25 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 49.4 ) { 
		if( budget < 47.3 ) { return new Prediction("1", 16, 0); }
	if( budget >= 47.3 ) { 
	if( approval >= 47.5 ) { 
	if( budget < 52.3 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 7, 0); }
	if( approval < 48.5 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 3, 0); }
	if( budget < 48.85 ) { 
		if( stability >= 44.3 ) { return new Prediction("1", 2, 0); }
		if( stability < 44.3 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( budget >= 52.3 ) { 
	if( budget >= 64.3 ) { 
		if( approval < 80 ) { return new Prediction("2", 4, 0); }
		if( approval >= 80 ) { return new Prediction("1", 3, 0); }
	}
		if( budget < 64.3 ) { return new Prediction("2", 7, 0); }
	}
	}
		if( approval < 47.5 ) { return new Prediction("2", 8, 0); }
	}
	}
	if( stability >= 49.4 ) { 
	if( stability < 81.35 ) { 
	if( budget < 69.7 ) { 
		if( approval < 51.85 ) { return new Prediction("3", 12, 0); }
	if( approval >= 51.85 ) { 
	if( approval < 72 ) { 
		if( stability < 57.8 ) { return new Prediction("1", 7, 0); }
	if( stability >= 57.8 ) { 
		if( approval < 69 ) { return new Prediction("3", 3, 0); }
	if( approval >= 69 ) { 
		if( approval >= 70.55 ) { return new Prediction("3", 1, 0); }
		if( approval < 70.55 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( approval >= 72 ) { return new Prediction("1", 11, 0); }
	}
	}
		if( budget >= 69.7 ) { return new Prediction("2", 14, 0); }
	}
		if( stability >= 81.35 ) { return new Prediction("3", 12, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 61.8 ) { 
	if( stability < 51.7 ) { 
	if( budget < 45.55 ) { 
		if( stability >= 39.55 ) { return new Prediction("2", 13, 0); }
	if( stability < 39.55 ) { 
		if( budget >= 24.6 ) { return new Prediction("3", 9, 0); }
		if( budget < 24.6 ) { return new Prediction("2", 6, 0); }
	}
	}
		if( budget >= 45.55 ) { return new Prediction("3", 27, 0); }
	}
	if( stability >= 51.7 ) { 
		if( budget >= 69.2 ) { return new Prediction("3", 5, 0); }
	if( budget < 69.2 ) { 
	if( approval >= 54.6 ) { 
	if( approval < 67.1 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 1, 0); }
		if( budget >= 52.75 ) { return new Prediction("3", 2, 0); }
	}
		if( approval >= 67.1 ) { return new Prediction("2", 2, 0); }
	}
	if( approval < 54.6 ) { 
		if( approval < 44.35 ) { return new Prediction("2", 1, 0); }
		if( approval >= 44.35 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	}
	if( stability >= 61.8 ) { 
		if( budget < 61.35 ) { return new Prediction("2", 21, 0); }
	if( budget >= 61.35 ) { 
		if( approval < 78.2 ) { return new Prediction("1", 2, 0); }
		if( approval >= 78.2 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	}
	if( approval < 41.35 ) { 
	if( budget >= 65.5 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 17, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 19, 0); }
	}
	if( budget < 65.5 ) { 
	if( budget >= 2.45 ) { 
	if( budget >= 3.75 ) { 
	if( budget < 32 ) { 
		if( approval >= 35.2 ) { return new Prediction("2", 9, 0); }
	if( approval < 35.2 ) { 
	if( budget < 4.3 ) { 
		if( stability >= 4 ) { return new Prediction("2", 4, 0); }
	if( stability < 4 ) { 
		if( approval >= 3.95 ) { return new Prediction("3", 6, 0); }
		if( approval < 3.95 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( budget >= 4.3 ) { 
	if( stability >= 3.15 ) { 
	if( stability < 7.45 ) { 
		if( approval < 3.25 ) { return new Prediction("1", 7, 0); }
	if( approval >= 3.25 ) { 
	if( stability < 6.1 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 6.85 ) { return new Prediction("2", 4, 0); }
		if( budget < 6.85 ) { return new Prediction("1", 4, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability >= 5.95 ) { 
		if( approval >= 4.85 ) { return new Prediction("2", 1, 0); }
		if( approval < 4.85 ) { return new Prediction("1", 1, 0); }
	}
		if( stability < 5.95 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( stability >= 6.1 ) { 
	if( approval < 7.85 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 3, 0); }
	}
		if( approval >= 7.85 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	if( stability >= 7.45 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 15 ) { 
		if( stability < 27.8 ) { return new Prediction("1", 10, 0); }
		if( stability >= 27.8 ) { return new Prediction("3", 3, 0); }
	}
	if( approval < 15 ) { 
	if( approval >= 12.4 ) { 
		if( stability >= 19.1 ) { return new Prediction("3", 1, 0); }
		if( stability < 19.1 ) { return new Prediction("2", 4, 0); }
	}
	if( approval < 12.4 ) { 
		if( stability >= 8.85 ) { return new Prediction("3", 4, 0); }
		if( stability < 8.85 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 26.75 ) { 
		if( budget >= 16.5 ) { return new Prediction("1", 5, 0); }
		if( budget < 16.5 ) { return new Prediction("2", 7, 0); }
	}
	if( approval >= 26.75 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 6, 0); }
	if( stability < 28.6 ) { 
		if( budget < 20.6 ) { return new Prediction("2", 3, 0); }
		if( budget >= 20.6 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	}
	if( stability < 3.15 ) { 
		if( approval < 7.3 ) { return new Prediction("2", 5, 0); }
		if( approval >= 7.3 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( budget >= 32 ) { 
	if( approval < 37.5 ) { 
		if( stability < 21.25 ) { return new Prediction("2", 2, 0); }
	if( stability >= 21.25 ) { 
	if( stability < 67 ) { 
		if( budget >= 45.6 ) { return new Prediction("1", 4, 0); }
	if( budget < 45.6 ) { 
	if( budget >= 41.1 ) { 
		if( approval < 33.25 ) { return new Prediction("2", 1, 0); }
	if( approval >= 33.25 ) { 
		if( stability >= 41.65 ) { return new Prediction("3", 1, 0); }
		if( stability < 41.65 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( budget < 41.1 ) { 
		if( stability >= 42.95 ) { return new Prediction("2", 1, 0); }
	if( stability < 42.95 ) { 
		if( stability < 27.8 ) { return new Prediction("3", 4, 0); }
	if( stability >= 27.8 ) { 
		if( approval < 32.5 ) { return new Prediction("1", 3, 0); }
	if( approval >= 32.5 ) { 
	if( budget < 40.75 ) { 
	if( approval >= 36.5 ) { 
		if( stability >= 41.3 ) { return new Prediction("3", 2, 0); }
	if( stability < 41.3 ) { 
	if( stability < 38.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 3, 0); }
	}
		if( stability >= 38.45 ) { return new Prediction("1", 1, 0); }
	}
	}
		if( approval < 36.5 ) { return new Prediction("3", 6, 0); }
	}
		if( budget >= 40.75 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	}
	}
		if( stability >= 67 ) { return new Prediction("3", 7, 0); }
	}
	}
	if( approval >= 37.5 ) { 
	if( stability >= 40.45 ) { 
		if( budget < 40.3 ) { return new Prediction("3", 3, 0); }
	if( budget >= 40.3 ) { 
		if( budget < 53.95 ) { return new Prediction("1", 7, 0); }
		if( budget >= 53.95 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( stability < 40.45 ) { 
	if( approval < 38.55 ) { 
	if( budget < 36.8 ) { 
		if( budget >= 35.85 ) { return new Prediction("2", 1, 0); }
		if( budget < 35.85 ) { return new Prediction("1", 2, 0); }
	}
		if( budget >= 36.8 ) { return new Prediction("1", 6, 0); }
	}
	if( approval >= 38.55 ) { 
		if( stability >= 28.25 ) { return new Prediction("2", 2, 0); }
		if( stability < 28.25 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	if( budget < 3.75 ) { 
	if( stability >= 6.85 ) { 
		if( approval < 2.25 ) { return new Prediction("3", 2, 0); }
		if( approval >= 2.25 ) { return new Prediction("1", 5, 0); }
	}
	if( stability < 6.85 ) { 
		if( approval < 3.45 ) { return new Prediction("1", 1, 0); }
	if( approval >= 3.45 ) { 
	if( approval >= 7.1 ) { 
		if( budget >= 3.4 ) { return new Prediction("3", 2, 0); }
		if( budget < 3.4 ) { return new Prediction("1", 1, 0); }
	}
		if( approval < 7.1 ) { return new Prediction("3", 6, 0); }
	}
	}
	}
	}
	if( budget < 2.45 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 1.75 ) { 
		if( stability >= 4.65 ) { return new Prediction("3", 1, 0); }
		if( stability < 4.65 ) { return new Prediction("1", 6, 0); }
	}
		if( budget >= 1.75 ) { return new Prediction("1", 12, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 10, 0); }
	}
	}
	}
return null;
}
private Prediction runTree91() {
	if( stability < 91.65 ) { 
	if( stability < 61.1 ) { 
	if( budget < 71.9 ) { 
	if( stability >= 50.4 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 51.5 ) { 
		if( stability < 57.8 ) { return new Prediction("1", 12, 0); }
	if( stability >= 57.8 ) { 
		if( approval >= 64.8 ) { return new Prediction("1", 3, 0); }
		if( approval < 64.8 ) { return new Prediction("3", 2, 0); }
	}
	}
		if( approval < 51.5 ) { return new Prediction("3", 5, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 56.35 ) { return new Prediction("1", 11, 0); }
		if( approval >= 56.35 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( stability < 50.4 ) { 
	if( budget < 55.65 ) { 
	if( approval < 76.8 ) { 
	if( budget < 7.35 ) { 
	if( budget < 6.65 ) { 
	if( stability >= 7.35 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 8.95 ) { return new Prediction("1", 3, 0); }
		if( approval < 8.95 ) { return new Prediction("3", 8, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("2", 9, 0); }
	}
	if( stability < 7.35 ) { 
	if( stability >= 1.7 ) { 
	if( stability >= 5.15 ) { 
	if( stability >= 6.45 ) { 
		if( approval >= 7.1 ) { return new Prediction("1", 4, 0); }
	if( approval < 7.1 ) { 
		if( approval >= 4.55 ) { return new Prediction("3", 4, 0); }
		if( approval < 4.55 ) { return new Prediction("1", 3, 0); }
	}
	}
	if( stability < 6.45 ) { 
		if( budget < 1.9 ) { return new Prediction("2", 1, 0); }
		if( budget >= 1.9 ) { return new Prediction("1", 9, 0); }
	}
	}
	if( stability < 5.15 ) { 
	if( approval < 4.3 ) { 
	if( budget >= 2 ) { 
		if( approval < 2.05 ) { return new Prediction("1", 2, 0); }
		if( approval >= 2.05 ) { return new Prediction("2", 4, 0); }
	}
		if( budget < 2 ) { return new Prediction("3", 5, 0); }
	}
	if( approval >= 4.3 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 5, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 9, 0); }
	}
	}
	}
		if( stability < 1.7 ) { return new Prediction("1", 7, 0); }
	}
	}
		if( budget >= 6.65 ) { return new Prediction("1", 11, 0); }
	}
	if( budget >= 7.35 ) { 
	if( stability >= 19.55 ) { 
	if( stability < 45.65 ) { 
	if( approval >= 18.05 ) { 
	if( budget >= 19.7 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 37.5 ) { 
		if( stability >= 33.8 ) { return new Prediction("3", 10, 0); }
	if( stability < 33.8 ) { 
		if( budget >= 32.6 ) { return new Prediction("2", 3, 0); }
		if( budget < 32.6 ) { return new Prediction("1", 9, 0); }
	}
	}
	if( approval >= 37.5 ) { 
	if( budget >= 46.45 ) { 
		if( approval >= 48.5 ) { return new Prediction("1", 3, 0); }
		if( approval < 48.5 ) { return new Prediction("2", 3, 0); }
	}
		if( budget < 46.45 ) { return new Prediction("1", 10, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 37.5 ) { 
	if( budget >= 39.8 ) { 
	if( approval >= 40.5 ) { 
		if( budget < 40.75 ) { return new Prediction("2", 1, 0); }
		if( budget >= 40.75 ) { return new Prediction("3", 5, 0); }
	}
		if( approval < 40.5 ) { return new Prediction("1", 12, 0); }
	}
		if( budget < 39.8 ) { return new Prediction("2", 8, 0); }
	}
	if( stability < 37.5 ) { 
	if( budget >= 31.95 ) { 
		if( approval >= 36.5 ) { return new Prediction("3", 14, 0); }
	if( approval < 36.5 ) { 
	if( approval >= 29.05 ) { 
		if( approval < 32.5 ) { return new Prediction("1", 1, 0); }
	if( approval >= 32.5 ) { 
		if( budget >= 38.4 ) { return new Prediction("1", 1, 0); }
		if( budget < 38.4 ) { return new Prediction("3", 4, 0); }
	}
	}
		if( approval < 29.05 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( budget < 31.95 ) { 
		if( approval >= 42.4 ) { return new Prediction("3", 2, 0); }
	if( approval < 42.4 ) { 
		if( stability >= 25.45 ) { return new Prediction("2", 5, 0); }
		if( stability < 25.45 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
	if( budget < 19.7 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 7, 0); }
	}
	}
		if( approval < 18.05 ) { return new Prediction("1", 5, 0); }
	}
	if( stability >= 45.65 ) { 
	if( stability < 48.85 ) { 
	if( stability >= 46.4 ) { 
		if( approval < 44 ) { return new Prediction("1", 1, 0); }
	if( approval >= 44 ) { 
	if( budget >= 48.85 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 3, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 1, 0); }
	}
		if( budget < 48.85 ) { return new Prediction("2", 4, 0); }
	}
	}
	if( stability < 46.4 ) { 
		if( approval >= 49 ) { return new Prediction("1", 4, 0); }
	if( approval < 49 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 6, 0); }
	if( "positive".equals(type) ) { 
		if( budget < 44.95 ) { return new Prediction("2", 4, 0); }
		if( budget >= 44.95 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	}
		if( stability >= 48.85 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( stability < 19.55 ) { 
	if( stability >= 1.05 ) { 
	if( approval >= 30.95 ) { 
		if( budget < 18 ) { return new Prediction("2", 1, 0); }
		if( budget >= 18 ) { return new Prediction("3", 4, 0); }
	}
	if( approval < 30.95 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 17, 0); }
	if( "positive".equals(type) ) { 
	if( budget >= 8.85 ) { 
		if( budget >= 16.4 ) { return new Prediction("3", 1, 0); }
		if( budget < 16.4 ) { return new Prediction("2", 6, 0); }
	}
		if( budget < 8.85 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
		if( stability < 1.05 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( approval >= 76.8 ) { return new Prediction("1", 8, 0); }
	}
	if( budget >= 55.65 ) { 
		if( approval >= 40.4 ) { return new Prediction("3", 14, 0); }
		if( approval < 40.4 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( budget >= 71.9 ) { 
	if( approval >= 69.9 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 87.5 ) { return new Prediction("2", 8, 0); }
		if( approval >= 87.5 ) { return new Prediction("1", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 9, 0); }
	}
	if( approval < 69.9 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 23, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 11, 0); }
	}
	}
	}
	if( stability >= 61.1 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 67.8 ) { 
	if( approval >= 69.2 ) { 
		if( budget < 27.2 ) { return new Prediction("3", 1, 0); }
		if( budget >= 27.2 ) { return new Prediction("1", 4, 0); }
	}
		if( approval < 69.2 ) { return new Prediction("3", 16, 0); }
	}
	if( budget >= 67.8 ) { 
		if( approval >= 91.2 ) { return new Prediction("1", 3, 0); }
	if( approval < 91.2 ) { 
		if( stability < 80.95 ) { return new Prediction("2", 13, 0); }
		if( stability >= 80.95 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( approval < 28.5 ) { return new Prediction("1", 6, 0); }
	if( approval >= 28.5 ) { 
		if( stability < 61.8 ) { return new Prediction("3", 2, 0); }
	if( stability >= 61.8 ) { 
		if( budget < 71.65 ) { return new Prediction("2", 41, 0); }
		if( budget >= 71.65 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	}
	}
		if( stability >= 91.65 ) { return new Prediction("3", 15, 0); }
return null;
}
private Prediction runTree92() {
	if( budget < 2.55 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 10, 0); }
	if( "positive".equals(type) ) { 
		if( stability < 6.55 ) { return new Prediction("2", 5, 0); }
	if( stability >= 6.55 ) { 
		if( approval < 3.1 ) { return new Prediction("1", 2, 0); }
		if( approval >= 3.1 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	if( budget >= 2.55 ) { 
	if( approval < 50.4 ) { 
	if( budget < 85.45 ) { 
	if( approval < 2.75 ) { 
		if( budget >= 7.8 ) { return new Prediction("2", 5, 0); }
		if( budget < 7.8 ) { return new Prediction("1", 11, 0); }
	}
	if( approval >= 2.75 ) { 
	if( stability < 3.45 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 5.85 ) { return new Prediction("1", 1, 0); }
		if( approval < 5.85 ) { return new Prediction("2", 2, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 15, 0); }
	}
	if( stability >= 3.45 ) { 
	if( approval < 48.9 ) { 
	if( approval >= 29.65 ) { 
	if( budget < 34.2 ) { 
	if( stability >= 33 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 9, 0); }
	}
	if( stability < 33 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 9, 0); }
	}
	}
	if( budget >= 34.2 ) { 
	if( approval >= 37.05 ) { 
	if( budget >= 48.85 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 48 ) { 
	if( budget >= 62.5 ) { 
		if( stability >= 77.65 ) { return new Prediction("3", 5, 0); }
		if( stability < 77.65 ) { return new Prediction("2", 4, 0); }
	}
		if( budget < 62.5 ) { return new Prediction("3", 7, 0); }
	}
		if( stability < 48 ) { return new Prediction("2", 8, 0); }
	}
	if( "positive".equals(type) ) { 
	if( stability < 48.9 ) { 
		if( stability < 44.25 ) { return new Prediction("3", 7, 0); }
	if( stability >= 44.25 ) { 
		if( approval < 45 ) { return new Prediction("1", 4, 0); }
		if( approval >= 45 ) { return new Prediction("3", 4, 0); }
	}
	}
		if( stability >= 48.9 ) { return new Prediction("1", 8, 0); }
	}
	}
	if( budget < 48.85 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 45 ) { return new Prediction("2", 2, 0); }
		if( budget < 45 ) { return new Prediction("1", 12, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 45.55 ) { 
		if( stability >= 39.75 ) { return new Prediction("2", 4, 0); }
	if( stability < 39.75 ) { 
		if( approval >= 39 ) { return new Prediction("3", 2, 0); }
		if( approval < 39 ) { return new Prediction("2", 2, 0); }
	}
	}
		if( budget >= 45.55 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	if( approval < 37.05 ) { 
	if( stability >= 41.3 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 16, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 3, 0); }
	}
	if( stability < 41.3 ) { 
	if( stability < 36.4 ) { 
	if( "negative".equals(type) ) { 
		if( budget < 38.55 ) { return new Prediction("1", 3, 0); }
		if( budget >= 38.55 ) { return new Prediction("2", 1, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 32.5 ) { return new Prediction("1", 1, 0); }
		if( approval >= 32.5 ) { return new Prediction("3", 10, 0); }
	}
	}
	if( stability >= 36.4 ) { 
		if( stability >= 37.65 ) { return new Prediction("1", 10, 0); }
	if( stability < 37.65 ) { 
		if( budget < 40.15 ) { return new Prediction("1", 1, 0); }
		if( budget >= 40.15 ) { return new Prediction("2", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( approval < 29.65 ) { 
	if( stability < 47.65 ) { 
	if( approval >= 11.25 ) { 
	if( approval >= 24.75 ) { 
	if( budget >= 22 ) { 
		if( approval >= 27.65 ) { return new Prediction("2", 6, 0); }
	if( approval < 27.65 ) { 
		if( approval >= 26.35 ) { return new Prediction("1", 1, 0); }
		if( approval < 26.35 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( budget < 22 ) { 
		if( approval < 28.75 ) { return new Prediction("1", 2, 0); }
		if( approval >= 28.75 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( approval < 24.75 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 37.05 ) { return new Prediction("2", 5, 0); }
	if( budget < 37.05 ) { 
		if( stability >= 19.1 ) { return new Prediction("3", 2, 0); }
		if( stability < 19.1 ) { return new Prediction("2", 3, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 21.1 ) { 
		if( budget >= 16.5 ) { return new Prediction("1", 2, 0); }
		if( budget < 16.5 ) { return new Prediction("2", 3, 0); }
	}
		if( approval >= 21.1 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( approval < 11.25 ) { 
	if( stability < 9.1 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 7.05 ) { 
		if( stability >= 5.1 ) { return new Prediction("3", 5, 0); }
	if( stability < 5.1 ) { 
		if( budget >= 6.05 ) { return new Prediction("2", 2, 0); }
		if( budget < 6.05 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( approval >= 7.05 ) { 
		if( budget >= 9.4 ) { return new Prediction("2", 2, 0); }
		if( budget < 9.4 ) { return new Prediction("1", 10, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( budget < 5.5 ) { return new Prediction("2", 9, 0); }
	if( budget >= 5.5 ) { 
		if( approval >= 7.1 ) { return new Prediction("3", 6, 0); }
	if( approval < 7.1 ) { 
		if( budget < 5.65 ) { return new Prediction("1", 2, 0); }
		if( budget >= 5.65 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
		if( stability >= 9.1 ) { return new Prediction("3", 7, 0); }
	}
	}
		if( stability >= 47.65 ) { return new Prediction("1", 10, 0); }
	}
	}
	if( approval >= 48.9 ) { 
		if( stability < 38.1 ) { return new Prediction("3", 2, 0); }
	if( stability >= 38.1 ) { 
		if( budget >= 38.4 ) { return new Prediction("1", 13, 0); }
		if( budget < 38.4 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
	if( budget >= 85.45 ) { 
		if( "negative".equals(type) ) { return new Prediction("2", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 20, 0); }
	}
	}
	if( approval >= 50.4 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 82.75 ) { 
	if( budget < 60.8 ) { 
	if( stability < 56.45 ) { 
		if( approval >= 51.5 ) { return new Prediction("1", 12, 0); }
	if( approval < 51.5 ) { 
		if( budget < 52.85 ) { return new Prediction("1", 2, 0); }
		if( budget >= 52.85 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( stability >= 56.45 ) { 
		if( approval >= 71.85 ) { return new Prediction("1", 9, 0); }
	if( approval < 71.85 ) { 
	if( budget >= 57.5 ) { 
		if( approval < 64.15 ) { return new Prediction("3", 1, 0); }
		if( approval >= 64.15 ) { return new Prediction("1", 1, 0); }
	}
		if( budget < 57.5 ) { return new Prediction("3", 7, 0); }
	}
	}
	}
	if( budget >= 60.8 ) { 
		if( approval >= 86.95 ) { return new Prediction("1", 2, 0); }
	if( approval < 86.95 ) { 
		if( budget >= 70.85 ) { return new Prediction("2", 9, 0); }
	if( budget < 70.85 ) { 
	if( budget >= 63.75 ) { 
		if( approval >= 70.45 ) { return new Prediction("1", 1, 0); }
		if( approval < 70.45 ) { return new Prediction("3", 2, 0); }
	}
		if( budget < 63.75 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
	}
		if( stability >= 82.75 ) { return new Prediction("3", 13, 0); }
	}
	if( "positive".equals(type) ) { 
	if( budget < 49.95 ) { 
		if( budget < 24.1 ) { return new Prediction("2", 11, 0); }
	if( budget >= 24.1 ) { 
		if( stability >= 48.35 ) { return new Prediction("2", 16, 0); }
	if( stability < 48.35 ) { 
	if( budget >= 39.95 ) { 
		if( approval >= 51.5 ) { return new Prediction("3", 1, 0); }
		if( approval < 51.5 ) { return new Prediction("2", 2, 0); }
	}
		if( budget < 39.95 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( budget >= 49.95 ) { 
	if( stability >= 56.2 ) { 
		if( budget < 76.1 ) { return new Prediction("2", 7, 0); }
		if( budget >= 76.1 ) { return new Prediction("3", 1, 0); }
	}
		if( stability < 56.2 ) { return new Prediction("3", 37, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree93() {
	if( stability >= 86.9 ) { 
		if( budget >= 11.4 ) { return new Prediction("3", 14, 0); }
		if( budget < 11.4 ) { return new Prediction("2", 1, 0); }
	}
	if( stability < 86.9 ) { 
	if( approval >= 35.2 ) { 
	if( approval >= 83.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 22, 0); }
	if( "positive".equals(type) ) { 
		if( budget >= 69.6 ) { return new Prediction("3", 6, 0); }
		if( budget < 69.6 ) { return new Prediction("2", 5, 0); }
	}
	}
	if( approval < 83.75 ) { 
		if( stability < 13.65 ) { return new Prediction("3", 9, 0); }
	if( stability >= 13.65 ) { 
	if( budget < 91.3 ) { 
	if( budget >= 37.75 ) { 
	if( budget < 38.85 ) { 
	if( budget < 38.1 ) { 
		if( approval >= 42 ) { return new Prediction("1", 3, 0); }
		if( approval < 42 ) { return new Prediction("1", 2, 1); }
	}
		if( budget >= 38.1 ) { return new Prediction("2", 5, 0); }
	}
	if( budget >= 38.85 ) { 
	if( stability >= 68.1 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 69.55 ) { 
		if( approval < 47.3 ) { return new Prediction("3", 2, 0); }
		if( approval >= 47.3 ) { return new Prediction("2", 4, 0); }
	}
		if( budget < 69.55 ) { return new Prediction("3", 9, 0); }
	}
	if( "positive".equals(type) ) { 
		if( budget < 54 ) { return new Prediction("2", 4, 0); }
		if( budget >= 54 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( stability < 68.1 ) { 
	if( stability < 61.8 ) { 
	if( approval >= 74.05 ) { 
	if( budget < 64.75 ) { 
		if( stability < 52.45 ) { return new Prediction("3", 2, 0); }
		if( stability >= 52.45 ) { return new Prediction("2", 2, 0); }
	}
		if( budget >= 64.75 ) { return new Prediction("3", 6, 0); }
	}
	if( approval < 74.05 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 49.4 ) { 
	if( approval >= 48.5 ) { 
		if( budget < 52.9 ) { return new Prediction("1", 10, 0); }
		if( budget >= 52.9 ) { return new Prediction("2", 5, 0); }
	}
	if( approval < 48.5 ) { 
	if( budget < 43.15 ) { 
	if( approval >= 36.5 ) { 
		if( approval >= 42.5 ) { return new Prediction("1", 1, 0); }
		if( approval < 42.5 ) { return new Prediction("3", 1, 0); }
	}
		if( approval < 36.5 ) { return new Prediction("2", 1, 0); }
	}
		if( budget >= 43.15 ) { return new Prediction("2", 13, 0); }
	}
	}
	if( stability >= 49.4 ) { 
	if( budget >= 62.5 ) { 
		if( budget >= 71.35 ) { return new Prediction("2", 5, 0); }
	if( budget < 71.35 ) { 
		if( approval < 56.15 ) { return new Prediction("2", 1, 0); }
		if( approval >= 56.15 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( budget < 62.5 ) { 
	if( approval >= 52 ) { 
		if( stability < 57 ) { return new Prediction("1", 4, 0); }
	if( stability >= 57 ) { 
		if( approval >= 64.8 ) { return new Prediction("1", 1, 0); }
		if( approval < 64.8 ) { return new Prediction("3", 3, 0); }
	}
	}
		if( approval < 52 ) { return new Prediction("3", 12, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( stability >= 52.2 ) { return new Prediction("1", 6, 0); }
	if( stability < 52.2 ) { 
	if( approval < 44.5 ) { 
	if( stability >= 38.55 ) { 
		if( budget >= 41.9 ) { return new Prediction("1", 7, 0); }
	if( budget < 41.9 ) { 
		if( approval >= 39 ) { return new Prediction("2", 3, 0); }
		if( approval < 39 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( stability < 38.55 ) { 
		if( approval >= 36.5 ) { return new Prediction("3", 4, 0); }
		if( approval < 36.5 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( approval >= 44.5 ) { 
	if( stability >= 50.1 ) { 
	if( budget < 52.75 ) { 
		if( approval >= 52 ) { return new Prediction("2", 2, 0); }
		if( approval < 52 ) { return new Prediction("1", 2, 0); }
	}
		if( budget >= 52.75 ) { return new Prediction("3", 1, 0); }
	}
	if( stability < 50.1 ) { 
	if( budget < 45.55 ) { 
		if( approval >= 49 ) { return new Prediction("3", 2, 0); }
		if( approval < 49 ) { return new Prediction("2", 5, 0); }
	}
		if( budget >= 45.55 ) { return new Prediction("3", 19, 0); }
	}
	}
	}
	}
	}
	}
	if( stability >= 61.8 ) { 
	if( approval < 78.85 ) { 
		if( budget >= 59.55 ) { return new Prediction("2", 6, 0); }
	if( budget < 59.55 ) { 
		if( approval < 74.2 ) { return new Prediction("1", 1, 0); }
		if( approval >= 74.2 ) { return new Prediction("2", 2, 0); }
	}
	}
		if( approval >= 78.85 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	}
	if( budget < 37.75 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 54.05 ) { return new Prediction("3", 10, 0); }
	if( stability < 54.05 ) { 
		if( approval >= 47.7 ) { return new Prediction("1", 1, 0); }
		if( approval < 47.7 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability < 34.6 ) { 
		if( budget < 32 ) { return new Prediction("2", 8, 0); }
		if( budget >= 32 ) { return new Prediction("3", 6, 0); }
	}
		if( stability >= 34.6 ) { return new Prediction("2", 17, 0); }
	}
	}
	}
		if( budget >= 91.3 ) { return new Prediction("2", 13, 0); }
	}
	}
	}
	if( approval < 35.2 ) { 
	if( stability >= 70.95 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 10, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 11, 0); }
	}
	if( stability < 70.95 ) { 
	if( approval >= 28.05 ) { 
	if( stability >= 23.55 ) { 
	if( stability >= 69.25 ) { 
		if( approval < 30.7 ) { return new Prediction("3", 1, 0); }
		if( approval >= 30.7 ) { return new Prediction("2", 2, 0); }
	}
	if( stability < 69.25 ) { 
		if( budget < 36.8 ) { return new Prediction("1", 9, 0); }
	if( budget >= 36.8 ) { 
		if( budget >= 47.5 ) { return new Prediction("1", 7, 0); }
	if( budget < 47.5 ) { 
		if( approval < 32.7 ) { return new Prediction("3", 1, 0); }
	if( approval >= 32.7 ) { 
		if( stability >= 35.85 ) { return new Prediction("1", 2, 0); }
		if( stability < 35.85 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	}
		if( stability < 23.55 ) { return new Prediction("3", 6, 0); }
	}
	if( approval < 28.05 ) { 
	if( budget >= 8.85 ) { 
	if( stability >= 19.55 ) { 
	if( approval < 24.85 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 12.85 ) { return new Prediction("2", 2, 0); }
	if( approval >= 12.85 ) { 
		if( stability >= 21.85 ) { return new Prediction("3", 4, 0); }
		if( stability < 21.85 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( budget < 21.55 ) { return new Prediction("2", 2, 0); }
		if( budget >= 21.55 ) { return new Prediction("1", 8, 0); }
	}
	}
	if( approval >= 24.85 ) { 
		if( stability >= 27.6 ) { return new Prediction("2", 7, 0); }
	if( stability < 27.6 ) { 
		if( budget >= 22 ) { return new Prediction("2", 5, 0); }
		if( budget < 22 ) { return new Prediction("1", 3, 0); }
	}
	}
	}
	if( stability < 19.55 ) { 
	if( approval >= 12.7 ) { 
	if( approval < 23.95 ) { 
	if( approval < 18.2 ) { 
	if( budget < 9.5 ) { 
		if( stability >= 12.3 ) { return new Prediction("3", 1, 0); }
		if( stability < 12.3 ) { return new Prediction("2", 1, 0); }
	}
	if( budget >= 9.5 ) { 
	if( budget >= 18.75 ) { 
		if( stability >= 12.3 ) { return new Prediction("2", 1, 0); }
		if( stability < 12.3 ) { return new Prediction("3", 1, 0); }
	}
		if( budget < 18.75 ) { return new Prediction("2", 5, 0); }
	}
	}
		if( approval >= 18.2 ) { return new Prediction("2", 3, 0); }
	}
		if( approval >= 23.95 ) { return new Prediction("3", 1, 0); }
	}
	if( approval < 12.7 ) { 
		if( stability < 1.9 ) { return new Prediction("1", 1, 0); }
	if( stability >= 1.9 ) { 
	if( budget < 8.95 ) { 
		if( stability >= 5.1 ) { return new Prediction("1", 1, 0); }
		if( stability < 5.1 ) { return new Prediction("2", 2, 0); }
	}
		if( budget >= 8.95 ) { return new Prediction("2", 10, 0); }
	}
	}
	}
	}
	if( budget < 8.85 ) { 
	if( approval < 2.75 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 1, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 14, 0); }
	}
	if( approval >= 2.75 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 5.25 ) { 
		if( budget >= 6.35 ) { return new Prediction("2", 3, 0); }
		if( budget < 6.35 ) { return new Prediction("3", 7, 0); }
	}
	if( budget < 5.25 ) { 
	if( approval < 4.4 ) { 
		if( budget >= 2.95 ) { return new Prediction("2", 1, 0); }
		if( budget < 2.95 ) { return new Prediction("3", 1, 0); }
	}
	if( approval >= 4.4 ) { 
	if( stability >= 6.35 ) { 
	if( budget >= 1.65 ) { 
	if( budget >= 2.75 ) { 
		if( approval >= 7 ) { return new Prediction("1", 1, 0); }
		if( approval < 7 ) { return new Prediction("3", 1, 0); }
	}
		if( budget < 2.75 ) { return new Prediction("1", 3, 0); }
	}
		if( budget < 1.65 ) { return new Prediction("3", 1, 0); }
	}
		if( stability < 6.35 ) { return new Prediction("1", 19, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 3.55 ) { 
	if( approval < 5.35 ) { 
		if( budget < 3.55 ) { return new Prediction("2", 6, 0); }
		if( budget >= 3.55 ) { return new Prediction("1", 4, 0); }
	}
	if( approval >= 5.35 ) { 
		if( budget < 5.6 ) { return new Prediction("2", 7, 0); }
	if( budget >= 5.6 ) { 
		if( approval >= 8.65 ) { return new Prediction("2", 2, 0); }
		if( approval < 8.65 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( stability < 3.55 ) { 
		if( stability < 2.95 ) { return new Prediction("3", 4, 0); }
	if( stability >= 2.95 ) { 
		if( budget < 7.4 ) { return new Prediction("1", 2, 0); }
		if( budget >= 7.4 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree94() {
	if( stability < 80.1 ) { 
	if( stability >= 1.05 ) { 
		if( stability < 1.8 ) { return new Prediction("2", 6, 0); }
	if( stability >= 1.8 ) { 
	if( budget >= 95.8 ) { 
		if( approval < 29.3 ) { return new Prediction("1", 1, 0); }
		if( approval >= 29.3 ) { return new Prediction("2", 7, 0); }
	}
	if( budget < 95.8 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 71.85 ) { 
	if( budget >= 81.25 ) { 
		if( approval >= 90.5 ) { return new Prediction("1", 2, 0); }
		if( approval < 90.5 ) { return new Prediction("2", 2, 0); }
	}
		if( budget < 81.25 ) { return new Prediction("1", 16, 0); }
	}
	if( approval < 71.85 ) { 
	if( budget < 67.8 ) { 
	if( stability < 48.75 ) { 
	if( budget < 44.15 ) { 
	if( stability < 3.8 ) { 
		if( approval < 5.35 ) { return new Prediction("2", 11, 0); }
		if( approval >= 5.35 ) { return new Prediction("1", 3, 0); }
	}
	if( stability >= 3.8 ) { 
		if( approval < 7.35 ) { return new Prediction("3", 13, 0); }
	if( approval >= 7.35 ) { 
		if( stability >= 41.7 ) { return new Prediction("3", 7, 0); }
	if( stability < 41.7 ) { 
		if( approval >= 42.5 ) { return new Prediction("1", 12, 0); }
	if( approval < 42.5 ) { 
	if( stability < 34.05 ) { 
	if( budget >= 5.25 ) { 
	if( approval < 23.1 ) { 
	if( approval < 17.1 ) { 
		if( approval >= 15 ) { return new Prediction("1", 3, 0); }
	if( approval < 15 ) { 
	if( budget >= 9.35 ) { 
	if( budget >= 19.05 ) { 
		if( stability >= 19.1 ) { return new Prediction("3", 2, 0); }
		if( stability < 19.1 ) { return new Prediction("2", 2, 0); }
	}
		if( budget < 19.05 ) { return new Prediction("2", 2, 0); }
	}
	if( budget < 9.35 ) { 
		if( stability >= 8.55 ) { return new Prediction("3", 3, 0); }
		if( stability < 8.55 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
		if( approval >= 17.1 ) { return new Prediction("3", 3, 0); }
	}
	if( approval >= 23.1 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 5, 0); }
	if( budget >= 29.9 ) { 
	if( budget >= 34.1 ) { 
		if( approval < 37.5 ) { return new Prediction("1", 3, 1); }
		if( approval >= 37.5 ) { return new Prediction("1", 5, 0); }
	}
		if( budget < 34.1 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
		if( budget < 5.25 ) { return new Prediction("1", 11, 0); }
	}
	if( stability >= 34.05 ) { 
		if( stability >= 37.6 ) { return new Prediction("3", 4, 0); }
	if( stability < 37.6 ) { 
		if( approval >= 27.65 ) { return new Prediction("2", 2, 0); }
		if( approval < 27.65 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( budget >= 44.15 ) { 
	if( approval >= 48.5 ) { 
		if( approval >= 50.95 ) { return new Prediction("2", 2, 0); }
		if( approval < 50.95 ) { return new Prediction("1", 10, 0); }
	}
	if( approval < 48.5 ) { 
		if( stability < 46.75 ) { return new Prediction("2", 18, 0); }
	if( stability >= 46.75 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 2, 0); }
	if( budget < 48.85 ) { 
		if( approval >= 47.5 ) { return new Prediction("1", 2, 0); }
		if( approval < 47.5 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
	if( stability >= 48.75 ) { 
		if( approval < 51.85 ) { return new Prediction("3", 12, 0); }
	if( approval >= 51.85 ) { 
	if( budget < 53.7 ) { 
		if( approval >= 69.1 ) { return new Prediction("3", 2, 0); }
		if( approval < 69.1 ) { return new Prediction("1", 8, 0); }
	}
	if( budget >= 53.7 ) { 
		if( approval < 69 ) { return new Prediction("3", 6, 0); }
		if( approval >= 69 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
		if( budget >= 67.8 ) { return new Prediction("2", 26, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 45.8 ) { 
	if( approval >= 40.5 ) { 
		if( budget < 18.95 ) { return new Prediction("2", 8, 0); }
	if( budget >= 18.95 ) { 
		if( stability < 38.1 ) { return new Prediction("3", 7, 0); }
		if( stability >= 38.1 ) { return new Prediction("2", 25, 0); }
	}
	}
	if( approval < 40.5 ) { 
	if( stability >= 4.25 ) { 
	if( budget < 36.8 ) { 
	if( stability >= 5.95 ) { 
	if( budget >= 16.5 ) { 
	if( approval < 26.75 ) { 
		if( approval >= 16 ) { return new Prediction("1", 4, 0); }
	if( approval < 16 ) { 
		if( stability < 15.05 ) { return new Prediction("3", 2, 0); }
		if( stability >= 15.05 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( approval >= 26.75 ) { 
	if( stability >= 21.85 ) { 
	if( budget < 34.2 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 12, 0); }
	if( stability < 28.6 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 3, 0); }
		if( budget >= 25.7 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( budget >= 34.2 ) { 
		if( stability >= 36.55 ) { return new Prediction("2", 3, 0); }
	if( stability < 36.55 ) { 
		if( approval >= 33 ) { return new Prediction("3", 1, 0); }
		if( approval < 33 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
		if( stability < 21.85 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( budget < 16.5 ) { 
	if( budget < 2.7 ) { 
		if( budget >= 2 ) { return new Prediction("1", 1, 0); }
		if( budget < 2 ) { return new Prediction("2", 2, 0); }
	}
		if( budget >= 2.7 ) { return new Prediction("2", 9, 0); }
	}
	}
	if( stability < 5.95 ) { 
	if( stability < 5.05 ) { 
		if( approval >= 7 ) { return new Prediction("3", 1, 0); }
		if( approval < 7 ) { return new Prediction("2", 2, 0); }
	}
		if( stability >= 5.05 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( budget >= 36.8 ) { 
		if( stability < 36.4 ) { return new Prediction("3", 5, 0); }
		if( stability >= 36.4 ) { return new Prediction("1", 7, 0); }
	}
	}
	if( stability < 4.25 ) { 
		if( approval >= 3.85 ) { return new Prediction("3", 12, 0); }
		if( approval < 3.85 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( budget >= 45.8 ) { 
	if( approval >= 47.5 ) { 
	if( approval < 58.55 ) { 
		if( stability < 53.9 ) { return new Prediction("3", 16, 0); }
		if( stability >= 53.9 ) { return new Prediction("1", 2, 0); }
	}
	if( approval >= 58.55 ) { 
		if( stability < 61.8 ) { return new Prediction("3", 20, 0); }
	if( stability >= 61.8 ) { 
		if( approval >= 77.95 ) { return new Prediction("3", 1, 0); }
		if( approval < 77.95 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	if( approval < 47.5 ) { 
	if( stability < 46.75 ) { 
	if( approval < 44.5 ) { 
		if( stability >= 25 ) { return new Prediction("1", 9, 0); }
		if( stability < 25 ) { return new Prediction("3", 2, 0); }
	}
		if( approval >= 44.5 ) { return new Prediction("3", 7, 0); }
	}
		if( stability >= 46.75 ) { return new Prediction("1", 23, 0); }
	}
	}
	}
	}
	}
	}
		if( stability < 1.05 ) { return new Prediction("1", 5, 0); }
	}
	if( stability >= 80.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 30, 0); }
	if( "positive".equals(type) ) { 
		if( budget < 26.75 ) { return new Prediction("2", 6, 0); }
	if( budget >= 26.75 ) { 
		if( approval < 60.25 ) { return new Prediction("1", 4, 0); }
		if( approval >= 60.25 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
return null;
}
private Prediction runTree95() {
	if( budget < 37.2 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 5.2 ) { 
	if( stability >= 6 ) { 
		if( stability >= 79.95 ) { return new Prediction("3", 6, 0); }
	if( stability < 79.95 ) { 
	if( budget >= 24.4 ) { 
		if( approval < 28.5 ) { return new Prediction("2", 1, 0); }
		if( approval >= 28.5 ) { return new Prediction("1", 9, 0); }
	}
	if( budget < 24.4 ) { 
		if( approval < 7.05 ) { return new Prediction("3", 4, 0); }
	if( approval >= 7.05 ) { 
	if( stability >= 9.05 ) { 
	if( stability < 15.05 ) { 
		if( approval >= 11.25 ) { return new Prediction("2", 3, 0); }
		if( approval < 11.25 ) { return new Prediction("3", 2, 0); }
	}
	if( stability >= 15.05 ) { 
	if( stability < 30.1 ) { 
		if( approval >= 15 ) { return new Prediction("1", 5, 0); }
		if( approval < 15 ) { return new Prediction("3", 1, 0); }
	}
	if( stability >= 30.1 ) { 
		if( budget >= 17.75 ) { return new Prediction("3", 5, 0); }
		if( budget < 17.75 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
		if( stability < 9.05 ) { return new Prediction("1", 8, 0); }
	}
	}
	}
	}
		if( stability < 6 ) { return new Prediction("1", 18, 0); }
	}
	if( approval < 5.2 ) { 
		if( approval >= 3.4 ) { return new Prediction("2", 10, 0); }
	if( approval < 3.4 ) { 
		if( budget >= 7.75 ) { return new Prediction("2", 1, 0); }
	if( budget < 7.75 ) { 
		if( stability >= 2.9 ) { return new Prediction("3", 6, 0); }
		if( stability < 2.9 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 34.5 ) { 
	if( stability < 32.9 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 4, 0); }
	if( budget < 31.95 ) { 
	if( approval < 54.9 ) { 
		if( approval >= 41.9 ) { return new Prediction("3", 1, 0); }
		if( approval < 41.9 ) { return new Prediction("2", 2, 0); }
	}
		if( approval >= 54.9 ) { return new Prediction("2", 3, 0); }
	}
	}
		if( stability >= 32.9 ) { return new Prediction("2", 35, 0); }
	}
	if( approval < 34.5 ) { 
	if( approval < 3.55 ) { 
		if( budget >= 4.2 ) { return new Prediction("1", 8, 0); }
	if( budget < 4.2 ) { 
		if( approval < 2.05 ) { return new Prediction("1", 2, 0); }
		if( approval >= 2.05 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( approval >= 3.55 ) { 
	if( budget >= 27.85 ) { 
	if( budget >= 29.7 ) { 
		if( approval >= 30.85 ) { return new Prediction("2", 2, 0); }
		if( approval < 30.85 ) { return new Prediction("1", 1, 0); }
	}
		if( budget < 29.7 ) { return new Prediction("1", 5, 0); }
	}
	if( budget < 27.85 ) { 
	if( stability >= 3.55 ) { 
	if( approval < 31.95 ) { 
	if( approval < 7.6 ) { 
	if( stability < 14.3 ) { 
	if( stability < 7.25 ) { 
		if( budget >= 5.45 ) { return new Prediction("1", 1, 0); }
		if( budget < 5.45 ) { return new Prediction("2", 2, 0); }
	}
		if( stability >= 7.25 ) { return new Prediction("2", 8, 0); }
	}
		if( stability >= 14.3 ) { return new Prediction("1", 2, 0); }
	}
	if( approval >= 7.6 ) { 
	if( approval >= 8.65 ) { 
	if( budget >= 16.5 ) { 
	if( approval < 21 ) { 
		if( stability < 15.05 ) { return new Prediction("3", 3, 0); }
		if( stability >= 15.05 ) { return new Prediction("1", 1, 0); }
	}
	if( approval >= 21 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 5, 0); }
	if( budget >= 25.7 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 2, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( budget < 16.5 ) { 
		if( stability >= 6.35 ) { return new Prediction("2", 9, 0); }
		if( stability < 6.35 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( approval < 8.65 ) { return new Prediction("3", 2, 0); }
	}
	}
		if( approval >= 31.95 ) { return new Prediction("3", 7, 0); }
	}
		if( stability < 3.55 ) { return new Prediction("3", 8, 0); }
	}
	}
	}
	}
	}
	if( budget >= 37.2 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 83.1 ) { return new Prediction("3", 14, 0); }
	if( stability < 83.1 ) { 
	if( budget >= 67.4 ) { 
	if( stability >= 67.65 ) { 
		if( approval >= 91.2 ) { return new Prediction("1", 1, 0); }
		if( approval < 91.2 ) { return new Prediction("2", 7, 0); }
	}
		if( stability < 67.65 ) { return new Prediction("2", 20, 0); }
	}
	if( budget < 67.4 ) { 
	if( approval >= 48.5 ) { 
	if( stability < 51.2 ) { 
		if( budget < 53.5 ) { return new Prediction("1", 15, 0); }
	if( budget >= 53.5 ) { 
		if( budget >= 64.3 ) { return new Prediction("1", 3, 0); }
	if( budget < 64.3 ) { 
		if( stability < 46 ) { return new Prediction("2", 4, 0); }
	if( stability >= 46 ) { 
		if( approval < 68.05 ) { return new Prediction("2", 1, 0); }
		if( approval >= 68.05 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	}
	if( stability >= 51.2 ) { 
		if( approval < 54.45 ) { return new Prediction("3", 4, 0); }
	if( approval >= 54.45 ) { 
	if( budget < 58.45 ) { 
		if( stability < 57 ) { return new Prediction("1", 4, 0); }
	if( stability >= 57 ) { 
		if( approval >= 64.8 ) { return new Prediction("1", 3, 0); }
		if( approval < 64.8 ) { return new Prediction("3", 2, 0); }
	}
	}
		if( budget >= 58.45 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( approval < 48.5 ) { 
	if( budget < 44.15 ) { 
	if( stability >= 38.95 ) { 
		if( approval >= 42.5 ) { return new Prediction("1", 4, 0); }
		if( approval < 42.5 ) { return new Prediction("3", 14, 0); }
	}
	if( stability < 38.95 ) { 
		if( approval >= 36.5 ) { return new Prediction("1", 4, 0); }
		if( approval < 36.5 ) { return new Prediction("2", 4, 0); }
	}
	}
	if( budget >= 44.15 ) { 
		if( stability < 48.75 ) { return new Prediction("2", 17, 0); }
		if( stability >= 48.75 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 47.5 ) { 
	if( stability >= 52.2 ) { 
		if( approval < 58.6 ) { return new Prediction("1", 9, 0); }
	if( approval >= 58.6 ) { 
		if( budget < 66.05 ) { return new Prediction("2", 9, 0); }
		if( budget >= 66.05 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( stability < 52.2 ) { 
	if( budget < 49.95 ) { 
		if( stability < 39.15 ) { return new Prediction("3", 7, 0); }
	if( stability >= 39.15 ) { 
	if( budget >= 45.95 ) { 
		if( approval < 52.5 ) { return new Prediction("3", 5, 0); }
		if( approval >= 52.5 ) { return new Prediction("2", 2, 0); }
	}
		if( budget < 45.95 ) { return new Prediction("2", 4, 0); }
	}
	}
		if( budget >= 49.95 ) { return new Prediction("3", 30, 0); }
	}
	}
	if( approval < 47.5 ) { 
	if( budget < 54.65 ) { 
	if( budget >= 38.35 ) { 
	if( stability >= 34.15 ) { 
	if( approval >= 40.5 ) { 
	if( stability < 45 ) { 
		if( budget >= 39.95 ) { return new Prediction("3", 7, 0); }
		if( budget < 39.95 ) { return new Prediction("2", 1, 0); }
	}
	if( stability >= 45 ) { 
		if( approval < 45 ) { return new Prediction("1", 4, 0); }
	if( approval >= 45 ) { 
		if( stability >= 49 ) { return new Prediction("1", 2, 0); }
		if( stability < 49 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( approval < 40.5 ) { 
		if( approval < 38.5 ) { return new Prediction("1", 10, 0); }
	if( approval >= 38.5 ) { 
		if( stability < 41.85 ) { return new Prediction("3", 1, 0); }
		if( stability >= 41.85 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
		if( stability < 34.15 ) { return new Prediction("3", 8, 0); }
	}
		if( budget < 38.35 ) { return new Prediction("3", 3, 0); }
	}
		if( budget >= 54.65 ) { return new Prediction("1", 32, 0); }
	}
	}
	}
return null;
}
private Prediction runTree96() {
	if( budget < 7.3 ) { 
	if( stability < 8.6 ) { 
	if( "negative".equals(type) ) { 
		if( stability < 3 ) { return new Prediction("1", 14, 0); }
	if( stability >= 3 ) { 
	if( approval >= 4.35 ) { 
		if( approval >= 7.1 ) { return new Prediction("1", 16, 0); }
	if( approval < 7.1 ) { 
		if( budget >= 5.25 ) { return new Prediction("3", 1, 0); }
		if( budget < 5.25 ) { return new Prediction("1", 2, 0); }
	}
	}
		if( approval < 4.35 ) { return new Prediction("3", 6, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 4.55 ) { 
	if( approval < 5.5 ) { 
		if( budget < 4.65 ) { return new Prediction("3", 6, 0); }
		if( budget >= 4.65 ) { return new Prediction("1", 1, 0); }
	}
	if( approval >= 5.5 ) { 
		if( stability >= 4.65 ) { return new Prediction("2", 5, 0); }
		if( stability < 4.65 ) { return new Prediction("3", 8, 0); }
	}
	}
	if( approval < 4.55 ) { 
		if( budget < 1.45 ) { return new Prediction("2", 1, 0); }
	if( budget >= 1.45 ) { 
	if( stability < 4.3 ) { 
		if( approval < 3.55 ) { return new Prediction("1", 4, 0); }
		if( approval >= 3.55 ) { return new Prediction("2", 1, 0); }
	}
		if( stability >= 4.3 ) { return new Prediction("1", 18, 0); }
	}
	}
	}
	}
	if( stability >= 8.6 ) { 
		if( budget < 4 ) { return new Prediction("3", 4, 0); }
		if( budget >= 4 ) { return new Prediction("2", 5, 0); }
	}
	}
	if( budget >= 7.3 ) { 
	if( stability < 80.1 ) { 
	if( "negative".equals(type) ) { 
	if( budget < 63.15 ) { 
	if( stability < 13.8 ) { 
		if( stability >= 1.05 ) { return new Prediction("2", 21, 0); }
		if( stability < 1.05 ) { return new Prediction("1", 3, 0); }
	}
	if( stability >= 13.8 ) { 
	if( approval >= 48.5 ) { 
		if( budget >= 58.85 ) { return new Prediction("2", 1, 0); }
	if( budget < 58.85 ) { 
	if( stability < 67.6 ) { 
		if( budget < 53.7 ) { return new Prediction("1", 26, 0); }
	if( budget >= 53.7 ) { 
		if( stability < 57 ) { return new Prediction("1", 1, 0); }
		if( stability >= 57 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( stability >= 67.6 ) { 
		if( approval < 79.6 ) { return new Prediction("3", 6, 0); }
		if( approval >= 79.6 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( approval < 48.5 ) { 
	if( budget < 41.35 ) { 
	if( stability < 34.05 ) { 
		if( approval < 21 ) { return new Prediction("3", 2, 0); }
	if( approval >= 21 ) { 
		if( approval >= 36.5 ) { return new Prediction("1", 7, 0); }
	if( approval < 36.5 ) { 
	if( approval < 33.5 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 5, 0); }
		if( budget >= 29.9 ) { return new Prediction("2", 1, 0); }
	}
		if( approval >= 33.5 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( stability >= 34.05 ) { 
		if( approval >= 42.5 ) { return new Prediction("1", 1, 0); }
	if( approval < 42.5 ) { 
		if( stability >= 37.15 ) { return new Prediction("3", 15, 0); }
	if( stability < 37.15 ) { 
		if( approval >= 27.65 ) { return new Prediction("2", 1, 0); }
		if( approval < 27.65 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	if( budget >= 41.35 ) { 
	if( stability < 48.75 ) { 
		if( stability < 46.75 ) { return new Prediction("2", 11, 0); }
	if( stability >= 46.75 ) { 
	if( approval >= 47.5 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 1, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 2, 0); }
	}
		if( approval < 47.5 ) { return new Prediction("2", 2, 0); }
	}
	}
		if( stability >= 48.75 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	if( budget >= 63.15 ) { 
	if( stability < 75.6 ) { 
		if( approval >= 90.5 ) { return new Prediction("1", 4, 0); }
		if( approval < 90.5 ) { return new Prediction("2", 41, 0); }
	}
	if( stability >= 75.6 ) { 
		if( approval < 70.1 ) { return new Prediction("3", 1, 0); }
		if( approval >= 70.1 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget < 40.2 ) { 
	if( approval < 37.5 ) { 
	if( budget < 36.8 ) { 
		if( stability < 8.15 ) { return new Prediction("3", 4, 0); }
	if( stability >= 8.15 ) { 
	if( approval >= 30.85 ) { 
		if( stability >= 36.55 ) { return new Prediction("2", 4, 0); }
	if( stability < 36.55 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 3, 0); }
		if( budget < 31.95 ) { return new Prediction("2", 1, 0); }
	}
	}
	if( approval < 30.85 ) { 
	if( stability < 18.55 ) { 
		if( budget >= 16.4 ) { return new Prediction("3", 1, 0); }
		if( budget < 16.4 ) { return new Prediction("2", 3, 0); }
	}
	if( stability >= 18.55 ) { 
	if( approval >= 18.05 ) { 
		if( budget >= 28.2 ) { return new Prediction("1", 2, 0); }
		if( budget < 28.2 ) { return new Prediction("2", 5, 0); }
	}
		if( approval < 18.05 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
	}
	if( budget >= 36.8 ) { 
		if( approval < 35.5 ) { return new Prediction("3", 8, 0); }
		if( approval >= 35.5 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( approval >= 37.5 ) { 
		if( stability >= 38.05 ) { return new Prediction("2", 21, 0); }
	if( stability < 38.05 ) { 
		if( approval < 44.95 ) { return new Prediction("2", 3, 0); }
	if( approval >= 44.95 ) { 
		if( budget >= 19.25 ) { return new Prediction("3", 4, 0); }
		if( budget < 19.25 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	if( budget >= 40.2 ) { 
	if( approval < 41.6 ) { 
		if( stability >= 35.75 ) { return new Prediction("1", 31, 0); }
	if( stability < 35.75 ) { 
		if( budget >= 62.6 ) { return new Prediction("1", 3, 0); }
		if( budget < 62.6 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( approval >= 41.6 ) { 
		if( stability < 45.65 ) { return new Prediction("3", 32, 0); }
	if( stability >= 45.65 ) { 
		if( budget < 47.45 ) { return new Prediction("2", 7, 0); }
	if( budget >= 47.45 ) { 
	if( stability >= 51.4 ) { 
	if( approval >= 54.6 ) { 
		if( stability >= 73.35 ) { return new Prediction("1", 1, 0); }
	if( stability < 73.35 ) { 
	if( budget < 64.75 ) { 
	if( stability < 55.15 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 1, 0); }
		if( budget >= 52.75 ) { return new Prediction("3", 1, 0); }
	}
		if( stability >= 55.15 ) { return new Prediction("2", 4, 0); }
	}
		if( budget >= 64.75 ) { return new Prediction("3", 5, 0); }
	}
	}
		if( approval < 54.6 ) { return new Prediction("1", 7, 0); }
	}
	if( stability < 51.4 ) { 
	if( stability < 46.75 ) { 
		if( approval < 45 ) { return new Prediction("1", 2, 0); }
		if( approval >= 45 ) { return new Prediction("3", 2, 0); }
	}
		if( stability >= 46.75 ) { return new Prediction("3", 14, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( stability >= 80.1 ) { 
	if( budget >= 26.4 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 23, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 1, 0); }
	}
	if( budget < 26.4 ) { 
		if( stability >= 92.55 ) { return new Prediction("3", 3, 0); }
		if( stability < 92.55 ) { return new Prediction("2", 7, 0); }
	}
	}
	}
return null;
}
private Prediction runTree97() {
	if( stability < 91.15 ) { 
	if( budget < 81.75 ) { 
	if( budget >= 39.5 ) { 
	if( stability >= 29.3 ) { 
		if( stability >= 79.7 ) { return new Prediction("3", 6, 0); }
	if( stability < 79.7 ) { 
	if( budget >= 42.85 ) { 
	if( "negative".equals(type) ) { 
	if( approval < 47.8 ) { 
		if( stability < 42.85 ) { return new Prediction("2", 13, 0); }
	if( stability >= 42.85 ) { 
		if( budget >= 62.5 ) { return new Prediction("2", 5, 0); }
	if( budget < 62.5 ) { 
	if( budget < 49.5 ) { 
		if( approval >= 36.7 ) { return new Prediction("2", 3, 0); }
		if( approval < 36.7 ) { return new Prediction("3", 1, 0); }
	}
		if( budget >= 49.5 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	if( approval >= 47.8 ) { 
	if( stability < 48.75 ) { 
		if( budget >= 56.1 ) { return new Prediction("2", 5, 0); }
	if( budget < 56.1 ) { 
		if( stability < 46.75 ) { return new Prediction("1", 7, 0); }
	if( stability >= 46.75 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 1, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 1, 0); }
	}
	}
	}
	if( stability >= 48.75 ) { 
	if( budget < 64.95 ) { 
	if( budget < 49.5 ) { 
		if( approval >= 73.85 ) { return new Prediction("1", 1, 0); }
		if( approval < 73.85 ) { return new Prediction("3", 6, 0); }
	}
	if( budget >= 49.5 ) { 
		if( budget < 53.7 ) { return new Prediction("1", 3, 0); }
	if( budget >= 53.7 ) { 
		if( stability < 57 ) { return new Prediction("1", 5, 0); }
		if( stability >= 57 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	if( budget >= 64.95 ) { 
		if( approval < 70.95 ) { return new Prediction("2", 1, 0); }
		if( approval >= 70.95 ) { return new Prediction("1", 7, 0); }
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 45.7 ) { 
	if( stability >= 51.4 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 2, 0); }
	if( approval >= 56.35 ) { 
	if( budget >= 68.75 ) { 
		if( budget < 77.9 ) { return new Prediction("1", 1, 0); }
		if( budget >= 77.9 ) { return new Prediction("3", 2, 0); }
	}
	if( budget < 68.75 ) { 
		if( stability >= 57.05 ) { return new Prediction("2", 5, 0); }
	if( stability < 57.05 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 1, 0); }
		if( budget >= 52.75 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	}
	if( stability < 51.4 ) { 
		if( budget >= 47.05 ) { return new Prediction("3", 23, 0); }
		if( budget < 47.05 ) { return new Prediction("2", 3, 0); }
	}
	}
	if( approval < 45.7 ) { 
		if( stability >= 42.4 ) { return new Prediction("1", 14, 0); }
	if( stability < 42.4 ) { 
		if( stability < 39.15 ) { return new Prediction("1", 4, 0); }
		if( stability >= 39.15 ) { return new Prediction("3", 3, 0); }
	}
	}
	}
	}
	if( budget < 42.85 ) { 
	if( budget >= 40.5 ) { 
	if( approval >= 36.5 ) { 
	if( approval >= 45.5 ) { 
	if( budget < 41.25 ) { 
		if( approval < 67.6 ) { return new Prediction("3", 2, 0); }
		if( approval >= 67.6 ) { return new Prediction("1", 1, 0); }
	}
		if( budget >= 41.25 ) { return new Prediction("1", 2, 0); }
	}
	if( approval < 45.5 ) { 
		if( stability < 43.95 ) { return new Prediction("3", 5, 0); }
		if( stability >= 43.95 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( approval < 36.5 ) { return new Prediction("1", 8, 0); }
	}
		if( budget < 40.5 ) { return new Prediction("1", 8, 0); }
	}
	}
	}
	if( stability < 29.3 ) { 
	if( "negative".equals(type) ) { 
		if( approval >= 70.7 ) { return new Prediction("1", 1, 0); }
		if( approval < 70.7 ) { return new Prediction("2", 8, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 18, 0); }
	}
	}
	if( budget < 39.5 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 37.15 ) { 
	if( budget >= 27.65 ) { 
	if( budget >= 37.75 ) { 
		if( approval >= 42 ) { return new Prediction("1", 3, 0); }
		if( approval < 42 ) { return new Prediction("3", 2, 0); }
	}
		if( budget < 37.75 ) { return new Prediction("3", 10, 0); }
	}
	if( budget < 27.65 ) { 
	if( approval < 79.6 ) { 
		if( approval < 44.15 ) { return new Prediction("3", 3, 0); }
	if( approval >= 44.15 ) { 
		if( stability < 64.75 ) { return new Prediction("1", 2, 0); }
		if( stability >= 64.75 ) { return new Prediction("3", 2, 0); }
	}
	}
		if( approval >= 79.6 ) { return new Prediction("1", 7, 0); }
	}
	}
	if( stability < 37.15 ) { 
	if( budget < 4.1 ) { 
		if( approval >= 6.7 ) { return new Prediction("1", 8, 0); }
	if( approval < 6.7 ) { 
		if( budget >= 1.6 ) { return new Prediction("3", 7, 0); }
	if( budget < 1.6 ) { 
		if( approval >= 2.65 ) { return new Prediction("1", 3, 0); }
		if( approval < 2.65 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	if( budget >= 4.1 ) { 
	if( approval >= 5.55 ) { 
	if( approval < 23.1 ) { 
		if( stability >= 21.85 ) { return new Prediction("3", 6, 0); }
	if( stability < 21.85 ) { 
	if( budget >= 7.9 ) { 
		if( approval >= 15 ) { return new Prediction("1", 2, 0); }
	if( approval < 15 ) { 
	if( budget < 9.55 ) { 
		if( budget < 8.8 ) { return new Prediction("2", 1, 0); }
	if( budget >= 8.8 ) { 
		if( approval >= 11.8 ) { return new Prediction("3", 1, 0); }
		if( approval < 11.8 ) { return new Prediction("1", 4, 0); }
	}
	}
		if( budget >= 9.55 ) { return new Prediction("2", 3, 0); }
	}
	}
		if( budget < 7.9 ) { return new Prediction("1", 10, 0); }
	}
	}
	if( approval >= 23.1 ) { 
		if( approval < 28.5 ) { return new Prediction("2", 5, 0); }
	if( approval >= 28.5 ) { 
		if( budget >= 39.15 ) { return new Prediction("2", 2, 0); }
	if( budget < 39.15 ) { 
		if( stability >= 35.5 ) { return new Prediction("2", 1, 0); }
		if( stability < 35.5 ) { return new Prediction("1", 14, 0); }
	}
	}
	}
	}
	if( approval < 5.55 ) { 
		if( stability < 5.6 ) { return new Prediction("2", 12, 0); }
	if( stability >= 5.6 ) { 
		if( budget >= 7.75 ) { return new Prediction("2", 1, 0); }
		if( budget < 7.75 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval < 35.5 ) { 
	if( stability >= 4.65 ) { 
		if( approval < 5.7 ) { return new Prediction("1", 11, 0); }
	if( approval >= 5.7 ) { 
	if( budget >= 27.85 ) { 
		if( approval < 32.5 ) { return new Prediction("1", 13, 0); }
	if( approval >= 32.5 ) { 
		if( stability >= 35.85 ) { return new Prediction("1", 1, 0); }
		if( stability < 35.85 ) { return new Prediction("3", 1, 0); }
	}
	}
	if( budget < 27.85 ) { 
	if( budget < 25.7 ) { 
	if( budget >= 16.5 ) { 
		if( approval < 21 ) { return new Prediction("1", 2, 0); }
		if( approval >= 21 ) { return new Prediction("2", 6, 0); }
	}
	if( budget < 16.5 ) { 
		if( stability >= 6.35 ) { return new Prediction("2", 14, 0); }
	if( stability < 6.35 ) { 
		if( budget < 6 ) { return new Prediction("2", 2, 0); }
		if( budget >= 6 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( budget >= 25.7 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 1, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 2, 0); }
	}
	}
	}
	}
	if( stability < 4.65 ) { 
	if( approval < 4.15 ) { 
		if( budget < 4.35 ) { return new Prediction("2", 3, 0); }
		if( budget >= 4.35 ) { return new Prediction("1", 3, 0); }
	}
		if( approval >= 4.15 ) { return new Prediction("3", 13, 0); }
	}
	}
	if( approval >= 35.5 ) { 
	if( stability < 32.9 ) { 
		if( budget >= 31.95 ) { return new Prediction("3", 4, 0); }
		if( budget < 31.95 ) { return new Prediction("2", 5, 0); }
	}
	if( stability >= 32.9 ) { 
		if( budget < 38.85 ) { return new Prediction("2", 32, 0); }
	if( budget >= 38.85 ) { 
		if( approval >= 45.5 ) { return new Prediction("3", 1, 0); }
		if( approval < 45.5 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( budget >= 81.75 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 98.9 ) { 
		if( approval < 72.25 ) { return new Prediction("2", 2, 0); }
		if( approval >= 72.25 ) { return new Prediction("1", 3, 0); }
	}
	if( budget < 98.9 ) { 
		if( budget >= 89.4 ) { return new Prediction("2", 12, 0); }
	if( budget < 89.4 ) { 
		if( approval < 87.5 ) { return new Prediction("2", 8, 0); }
		if( approval >= 87.5 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 22.35 ) { 
		if( approval < 60.1 ) { return new Prediction("1", 10, 0); }
		if( approval >= 60.1 ) { return new Prediction("3", 1, 0); }
	}
		if( stability < 22.35 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
	if( stability >= 91.15 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 11, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 1, 0); }
	}
return null;
}
private Prediction runTree98() {
	if( approval < 31.2 ) { 
	if( stability >= 2.45 ) { 
	if( stability >= 25.45 ) { 
	if( "negative".equals(type) ) { 
		if( stability >= 68.3 ) { return new Prediction("3", 10, 0); }
	if( stability < 68.3 ) { 
		if( budget >= 59.9 ) { return new Prediction("2", 4, 0); }
	if( budget < 59.9 ) { 
		if( stability < 27.75 ) { return new Prediction("1", 1, 0); }
		if( stability >= 27.75 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
		if( budget >= 27.85 ) { return new Prediction("1", 27, 0); }
		if( budget < 27.85 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( stability < 25.45 ) { 
	if( stability < 7.45 ) { 
	if( approval >= 7.1 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 19, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 7, 0); }
	}
	if( approval < 7.1 ) { 
	if( stability < 4.85 ) { 
	if( budget >= 4.95 ) { 
		if( approval < 4.8 ) { return new Prediction("2", 4, 0); }
		if( approval >= 4.8 ) { return new Prediction("1", 2, 0); }
	}
		if( budget < 4.95 ) { return new Prediction("2", 9, 0); }
	}
	if( stability >= 4.85 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 6, 0); }
	if( "positive".equals(type) ) { 
		if( approval < 5.35 ) { return new Prediction("1", 11, 0); }
		if( approval >= 5.35 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	}
	if( stability >= 7.45 ) { 
	if( stability >= 19.55 ) { 
	if( stability >= 20.6 ) { 
		if( approval >= 28.05 ) { return new Prediction("3", 1, 0); }
	if( approval < 28.05 ) { 
		if( budget >= 22 ) { return new Prediction("2", 4, 0); }
	if( budget < 22 ) { 
		if( approval < 16.05 ) { return new Prediction("3", 1, 0); }
		if( approval >= 16.05 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
		if( stability < 20.6 ) { return new Prediction("1", 5, 0); }
	}
	if( stability < 19.55 ) { 
	if( approval < 4.4 ) { 
		if( approval < 1.9 ) { return new Prediction("1", 1, 0); }
		if( approval >= 1.9 ) { return new Prediction("3", 2, 0); }
	}
	if( approval >= 4.4 ) { 
		if( stability < 9.3 ) { return new Prediction("2", 7, 0); }
	if( stability >= 9.3 ) { 
		if( stability >= 10.85 ) { return new Prediction("2", 5, 0); }
	if( stability < 10.85 ) { 
	if( budget < 14.75 ) { 
		if( budget >= 6.55 ) { return new Prediction("2", 3, 0); }
		if( budget < 6.55 ) { return new Prediction("3", 3, 0); }
	}
		if( budget >= 14.75 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( stability < 2.45 ) { 
		if( stability >= 1.7 ) { return new Prediction("3", 9, 0); }
	if( stability < 1.7 ) { 
	if( budget >= 2.95 ) { 
		if( approval >= 2.9 ) { return new Prediction("3", 1, 0); }
		if( approval < 2.9 ) { return new Prediction("1", 1, 0); }
	}
		if( budget < 2.95 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	if( approval >= 31.2 ) { 
	if( stability >= 28.05 ) { 
	if( budget < 40.55 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 37.15 ) { 
	if( approval < 79.6 ) { 
	if( stability < 48.75 ) { 
		if( approval >= 42.5 ) { return new Prediction("1", 4, 0); }
		if( approval < 42.5 ) { return new Prediction("3", 2, 0); }
	}
		if( stability >= 48.75 ) { return new Prediction("3", 15, 0); }
	}
		if( approval >= 79.6 ) { return new Prediction("1", 3, 0); }
	}
	if( stability < 37.15 ) { 
	if( budget >= 36.75 ) { 
	if( budget < 38.55 ) { 
		if( approval >= 36.5 ) { return new Prediction("1", 2, 1); }
		if( approval < 36.5 ) { return new Prediction("2", 1, 0); }
	}
		if( budget >= 38.55 ) { return new Prediction("2", 3, 0); }
	}
		if( budget < 36.75 ) { return new Prediction("1", 5, 0); }
	}
	}
	if( "positive".equals(type) ) { 
		if( budget < 32 ) { return new Prediction("2", 31, 0); }
	if( budget >= 32 ) { 
		if( stability >= 38.05 ) { return new Prediction("2", 19, 0); }
		if( stability < 38.05 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	if( budget >= 40.55 ) { 
	if( budget >= 62.35 ) { 
	if( budget < 82.4 ) { 
	if( approval < 98.2 ) { 
	if( stability < 86.85 ) { 
		if( stability < 43.95 ) { return new Prediction("3", 9, 0); }
	if( stability >= 43.95 ) { 
	if( approval >= 57.1 ) { 
	if( budget >= 65.35 ) { 
		if( stability < 85.25 ) { return new Prediction("3", 7, 0); }
		if( stability >= 85.25 ) { return new Prediction("2", 1, 0); }
	}
		if( budget < 65.35 ) { return new Prediction("2", 2, 0); }
	}
	if( approval < 57.1 ) { 
	if( stability >= 67.75 ) { 
		if( budget < 67.9 ) { return new Prediction("3", 2, 0); }
		if( budget >= 67.9 ) { return new Prediction("2", 2, 0); }
	}
		if( stability < 67.75 ) { return new Prediction("2", 6, 0); }
	}
	}
	}
		if( stability >= 86.85 ) { return new Prediction("3", 11, 0); }
	}
		if( approval >= 98.2 ) { return new Prediction("1", 1, 0); }
	}
	if( budget >= 82.4 ) { 
	if( budget >= 92.65 ) { 
		if( approval >= 83.85 ) { return new Prediction("3", 1, 0); }
		if( approval < 83.85 ) { return new Prediction("2", 10, 0); }
	}
	if( budget < 92.65 ) { 
	if( approval >= 50.95 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 87.5 ) { return new Prediction("2", 4, 0); }
		if( approval >= 87.5 ) { return new Prediction("1", 1, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 3, 0); }
	}
	if( approval < 50.95 ) { 
	if( stability >= 69.5 ) { 
		if( approval >= 42.7 ) { return new Prediction("3", 1, 0); }
		if( approval < 42.7 ) { return new Prediction("1", 1, 0); }
	}
		if( stability < 69.5 ) { return new Prediction("1", 4, 0); }
	}
	}
	}
	}
	if( budget < 62.35 ) { 
	if( approval < 37.5 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 41.1 ) { 
		if( approval >= 33.7 ) { return new Prediction("2", 2, 0); }
		if( approval < 33.7 ) { return new Prediction("3", 2, 0); }
	}
		if( budget < 41.1 ) { return new Prediction("3", 5, 0); }
	}
	if( "positive".equals(type) ) { 
		if( stability >= 36.9 ) { return new Prediction("1", 3, 0); }
		if( stability < 36.9 ) { return new Prediction("3", 3, 0); }
	}
	}
	if( approval >= 37.5 ) { 
	if( approval < 43.7 ) { 
	if( "negative".equals(type) ) { 
		if( budget >= 56.65 ) { return new Prediction("3", 2, 0); }
		if( budget < 56.65 ) { return new Prediction("2", 14, 0); }
	}
	if( "positive".equals(type) ) { 
		if( approval < 41.5 ) { return new Prediction("1", 6, 0); }
	if( approval >= 41.5 ) { 
		if( budget < 44.95 ) { return new Prediction("2", 2, 0); }
		if( budget >= 44.95 ) { return new Prediction("1", 2, 0); }
	}
	}
	}
	if( approval >= 43.7 ) { 
	if( "negative".equals(type) ) { 
	if( stability >= 50.9 ) { 
		if( approval < 51.85 ) { return new Prediction("3", 5, 0); }
	if( approval >= 51.85 ) { 
		if( stability < 57 ) { return new Prediction("1", 7, 0); }
	if( stability >= 57 ) { 
		if( approval < 63.5 ) { return new Prediction("3", 2, 0); }
		if( approval >= 63.5 ) { return new Prediction("1", 5, 0); }
	}
	}
	}
	if( stability < 50.9 ) { 
	if( approval >= 48.5 ) { 
		if( budget < 56.7 ) { return new Prediction("1", 15, 0); }
		if( budget >= 56.7 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 48.5 ) { return new Prediction("2", 7, 0); }
	}
	}
	if( "positive".equals(type) ) { 
	if( stability >= 51.4 ) { 
	if( stability < 57.9 ) { 
		if( approval < 56.35 ) { return new Prediction("1", 11, 0); }
	if( approval >= 56.35 ) { 
		if( budget < 52.75 ) { return new Prediction("2", 2, 0); }
		if( budget >= 52.75 ) { return new Prediction("3", 2, 0); }
	}
	}
	if( stability >= 57.9 ) { 
		if( budget < 61.35 ) { return new Prediction("2", 6, 0); }
		if( budget >= 61.35 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( stability < 51.4 ) { 
		if( budget < 44.4 ) { return new Prediction("2", 1, 0); }
		if( budget >= 44.4 ) { return new Prediction("3", 13, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( stability < 28.05 ) { 
	if( "negative".equals(type) ) { 
		if( approval < 38.4 ) { return new Prediction("1", 1, 0); }
	if( approval >= 38.4 ) { 
		if( approval >= 74.8 ) { return new Prediction("1", 1, 0); }
		if( approval < 74.8 ) { return new Prediction("2", 5, 0); }
	}
	}
		if( "positive".equals(type) ) { return new Prediction("3", 24, 0); }
	}
	}
return null;
}
private Prediction runTree99() {
		if( stability >= 95 ) { return new Prediction("3", 12, 0); }
	if( stability < 95 ) { 
	if( approval >= 91.05 ) { 
	if( budget < 77.6 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 13, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 1, 0); }
	}
	if( budget >= 77.6 ) { 
		if( stability >= 32.85 ) { return new Prediction("3", 5, 0); }
		if( stability < 32.85 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( approval < 91.05 ) { 
	if( stability < 7.45 ) { 
	if( budget < 7.35 ) { 
	if( stability >= 4.65 ) { 
		if( approval >= 9.45 ) { return new Prediction("2", 3, 0); }
	if( approval < 9.45 ) { 
	if( approval < 6.45 ) { 
		if( approval < 2.95 ) { return new Prediction("1", 11, 0); }
	if( approval >= 2.95 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 4, 0); }
		if( "positive".equals(type) ) { return new Prediction("1", 3, 0); }
	}
	}
		if( approval >= 6.45 ) { return new Prediction("1", 14, 0); }
	}
	}
	if( stability < 4.65 ) { 
	if( stability >= 1.7 ) { 
	if( approval < 4.3 ) { 
		if( budget < 2.05 ) { return new Prediction("3", 6, 0); }
	if( budget >= 2.05 ) { 
		if( budget < 5.4 ) { return new Prediction("2", 3, 0); }
		if( budget >= 5.4 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( approval >= 4.3 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 7, 0); }
		if( "positive".equals(type) ) { return new Prediction("3", 11, 0); }
	}
	}
		if( stability < 1.7 ) { return new Prediction("1", 4, 0); }
	}
	}
	if( budget >= 7.35 ) { 
	if( "negative".equals(type) ) { 
	if( stability < 6.55 ) { 
	if( approval >= 8.1 ) { 
		if( budget < 9.55 ) { return new Prediction("1", 2, 0); }
		if( budget >= 9.55 ) { return new Prediction("2", 1, 0); }
	}
		if( approval < 8.1 ) { return new Prediction("2", 10, 0); }
	}
		if( stability >= 6.55 ) { return new Prediction("1", 3, 0); }
	}
		if( "positive".equals(type) ) { return new Prediction("3", 5, 0); }
	}
	}
	if( stability >= 7.45 ) { 
	if( budget >= 36.55 ) { 
	if( "negative".equals(type) ) { 
	if( budget >= 71.35 ) { 
		if( stability < 84.55 ) { return new Prediction("2", 27, 0); }
		if( stability >= 84.55 ) { return new Prediction("3", 3, 0); }
	}
	if( budget < 71.35 ) { 
	if( approval >= 36.5 ) { 
	if( stability < 49.4 ) { 
	if( budget < 43.95 ) { 
		if( stability >= 40.45 ) { return new Prediction("3", 4, 0); }
		if( stability < 40.45 ) { return new Prediction("1", 9, 0); }
	}
	if( budget >= 43.95 ) { 
	if( approval >= 48.5 ) { 
		if( budget < 54.15 ) { return new Prediction("1", 9, 0); }
	if( budget >= 54.15 ) { 
		if( approval < 70.05 ) { return new Prediction("2", 3, 0); }
		if( approval >= 70.05 ) { return new Prediction("1", 2, 0); }
	}
	}
	if( approval < 48.5 ) { 
	if( approval >= 45.5 ) { 
	if( stability >= 44.3 ) { 
		if( budget >= 48.85 ) { return new Prediction("2", 1, 0); }
		if( budget < 48.85 ) { return new Prediction("1", 1, 0); }
	}
		if( stability < 44.3 ) { return new Prediction("2", 2, 0); }
	}
		if( approval < 45.5 ) { return new Prediction("2", 4, 0); }
	}
	}
	}
	if( stability >= 49.4 ) { 
		if( approval >= 67.5 ) { return new Prediction("1", 8, 0); }
	if( approval < 67.5 ) { 
	if( approval >= 51.5 ) { 
		if( stability < 57 ) { return new Prediction("1", 2, 0); }
		if( stability >= 57 ) { return new Prediction("3", 6, 0); }
	}
		if( approval < 51.5 ) { return new Prediction("3", 4, 0); }
	}
	}
	}
	if( approval < 36.5 ) { 
		if( stability >= 37.6 ) { return new Prediction("3", 16, 0); }
		if( stability < 37.6 ) { return new Prediction("2", 8, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( approval >= 40.6 ) { 
	if( stability < 44.25 ) { 
		if( budget >= 38.7 ) { return new Prediction("3", 31, 0); }
	if( budget < 38.7 ) { 
		if( approval >= 64.7 ) { return new Prediction("3", 1, 0); }
		if( approval < 64.7 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( stability >= 44.25 ) { 
		if( budget < 45.8 ) { return new Prediction("2", 12, 0); }
	if( budget >= 45.8 ) { 
	if( approval < 56.35 ) { 
		if( stability >= 50.45 ) { return new Prediction("1", 9, 0); }
	if( stability < 50.45 ) { 
		if( approval < 45 ) { return new Prediction("1", 2, 0); }
		if( approval >= 45 ) { return new Prediction("3", 4, 0); }
	}
	}
	if( approval >= 56.35 ) { 
	if( stability >= 71.25 ) { 
	if( budget >= 61.1 ) { 
		if( approval < 78.2 ) { return new Prediction("1", 2, 0); }
		if( approval >= 78.2 ) { return new Prediction("2", 1, 0); }
	}
		if( budget < 61.1 ) { return new Prediction("2", 2, 0); }
	}
	if( stability < 71.25 ) { 
	if( budget >= 55.95 ) { 
		if( stability < 55.15 ) { return new Prediction("3", 7, 0); }
	if( stability >= 55.15 ) { 
		if( approval >= 79.05 ) { return new Prediction("3", 5, 0); }
		if( approval < 79.05 ) { return new Prediction("2", 1, 0); }
	}
	}
		if( budget < 55.95 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	}
	}
	if( approval < 40.6 ) { 
		if( budget >= 59.2 ) { return new Prediction("1", 20, 0); }
	if( budget < 59.2 ) { 
	if( stability >= 34.15 ) { 
	if( budget < 43.95 ) { 
		if( stability < 36.4 ) { return new Prediction("3", 2, 0); }
	if( stability >= 36.4 ) { 
		if( approval < 38.5 ) { return new Prediction("1", 9, 0); }
		if( approval >= 38.5 ) { return new Prediction("3", 1, 0); }
	}
	}
		if( budget >= 43.95 ) { return new Prediction("1", 12, 0); }
	}
		if( stability < 34.15 ) { return new Prediction("3", 7, 0); }
	}
	}
	}
	}
	if( budget < 36.55 ) { 
	if( approval < 62.85 ) { 
	if( approval >= 35.2 ) { 
		if( "negative".equals(type) ) { return new Prediction("3", 7, 0); }
	if( "positive".equals(type) ) { 
	if( stability >= 33 ) { 
		if( approval >= 36.5 ) { return new Prediction("2", 18, 0); }
	if( approval < 36.5 ) { 
	if( stability < 39 ) { 
		if( budget < 33.6 ) { return new Prediction("2", 1, 0); }
		if( budget >= 33.6 ) { return new Prediction("3", 1, 0); }
	}
		if( stability >= 39 ) { return new Prediction("2", 2, 0); }
	}
	}
	if( stability < 33 ) { 
		if( budget < 21.4 ) { return new Prediction("2", 1, 0); }
		if( budget >= 21.4 ) { return new Prediction("3", 5, 0); }
	}
	}
	}
	if( approval < 35.2 ) { 
	if( stability < 9.1 ) { 
		if( approval < 2.7 ) { return new Prediction("1", 1, 0); }
		if( approval >= 2.7 ) { return new Prediction("2", 12, 0); }
	}
	if( stability >= 9.1 ) { 
	if( approval >= 29.75 ) { 
		if( approval < 32 ) { return new Prediction("1", 8, 0); }
	if( approval >= 32 ) { 
		if( budget >= 20 ) { return new Prediction("3", 1, 0); }
		if( budget < 20 ) { return new Prediction("1", 1, 0); }
	}
	}
	if( approval < 29.75 ) { 
	if( "negative".equals(type) ) { 
	if( approval >= 27.3 ) { 
		if( budget < 29.9 ) { return new Prediction("1", 2, 0); }
		if( budget >= 29.9 ) { return new Prediction("2", 1, 0); }
	}
	if( approval < 27.3 ) { 
		if( approval >= 10.7 ) { return new Prediction("3", 8, 0); }
	if( approval < 10.7 ) { 
		if( budget < 10.05 ) { return new Prediction("3", 4, 0); }
		if( budget >= 10.05 ) { return new Prediction("2", 1, 0); }
	}
	}
	}
	if( "positive".equals(type) ) { 
	if( budget >= 16.5 ) { 
	if( approval < 21 ) { 
		if( stability < 15.05 ) { return new Prediction("3", 1, 0); }
		if( stability >= 15.05 ) { return new Prediction("1", 3, 0); }
	}
	if( approval >= 21 ) { 
		if( budget < 25.7 ) { return new Prediction("2", 2, 0); }
	if( budget >= 25.7 ) { 
		if( stability >= 28.6 ) { return new Prediction("2", 1, 0); }
		if( stability < 28.6 ) { return new Prediction("3", 1, 0); }
	}
	}
	}
		if( budget < 16.5 ) { return new Prediction("2", 3, 0); }
	}
	}
	}
	}
	}
	if( approval >= 62.85 ) { 
		if( "negative".equals(type) ) { return new Prediction("1", 6, 0); }
		if( "positive".equals(type) ) { return new Prediction("2", 14, 0); }
	}
	}
	}
	}
	}
return null;
}
}

