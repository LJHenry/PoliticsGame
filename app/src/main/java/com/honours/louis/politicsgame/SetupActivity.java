package com.honours.louis.politicsgame;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SetupActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    //Name text box
    TextView nameBox;
    //Spinners to select govt type
    private Spinner spinnerHoriz, spinnerVert;
    //Start button
    Button start;
    //Preference variables
    private int[] bonuses;
    private String countryName;
    private int type;
    private String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        //Instantiate
        nameBox = findViewById(R.id.nameBox);
        spinnerHoriz = findViewById(R.id.spinnerHorizontal);
        spinnerVert = findViewById(R.id.spinnerVertical);
        start = findViewById(R.id.buttonStart);
        bonuses = new int[3];

        type = 1;

        //Spinner 1 Adapter
        ArrayAdapter<CharSequence> horizAdapter = ArrayAdapter.createFromResource(this, R.array.govtHoriz, android.R.layout.simple_spinner_item);
        horizAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerHoriz.setAdapter(horizAdapter);
        //Spinner 2 Adapter
        ArrayAdapter<CharSequence> vertAdapter = ArrayAdapter.createFromResource(this, R.array.govtVert, android.R.layout.simple_spinner_item);
        vertAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerVert.setAdapter(vertAdapter);

        //Setup Event Listeners
        spinnerHoriz.setOnItemSelectedListener(this);
        spinnerVert.setOnItemSelectedListener(this);
        start.setOnClickListener(this);

        spinnerHoriz.setSelection(1);
        spinnerVert.setSelection(1);
        //Provide description based on spinner selected item
        describe(spinnerHoriz, spinnerVert);

        engagementPrompt();
    }

    private void engagementPrompt(){
        //Engagement Prompt Alert Dialog Popup
        View eView = getLayoutInflater().inflate(R.layout.dialog_engagement, null);
        //Create Dialog
        final AlertDialog alertDialog;
        AlertDialog.Builder builder = new AlertDialog.Builder(SetupActivity.this);
        builder.setView(eView);
        alertDialog = builder.create();

        //Spinner
        final Spinner answerSpinner = eView.findViewById(R.id.spinnerNumber);
        ArrayAdapter<CharSequence> answerAdapter = ArrayAdapter.createFromResource(this, R.array.engagement, android.R.layout.simple_spinner_item);
        answerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        answerSpinner.setAdapter(answerAdapter);

        Button submit = eView.findViewById(R.id.buttonEngageSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = answerSpinner.getSelectedItem().toString();
                alertDialog.dismiss();
            }
        });

        //Prevent Dismissal
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.setCancelable(false);
        //Show
        alertDialog.show();
    }

    //If item selected is changed
    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int pos, long id){
        //Provide description based on spinner selected item
        describe(spinnerHoriz, spinnerVert);
    }

    @Override
    public void onClick(View v){
        //Proceed to game activity with these settings
        switch(v.getId()){
            case R.id.buttonStart:
                //Prompt user confirmation with dialog box
                DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int c) {
                        switch (c) {
                            case DialogInterface.BUTTON_POSITIVE:
                                //Pass setup preferences to game
                                Intent i = new Intent(SetupActivity.this, GameActivity.class);
                                i.putExtra("Name", countryName);
                                i.putExtra("Bonuses" ,bonuses);
                                i.putExtra("Type", type);
                                i.putExtra("Engagement", answer);
                                startActivity(i);
                                break;
                            case DialogInterface.BUTTON_NEGATIVE:
                                //Do nothing
                                break;
                        }
                    }
                };

                //Check namebox isnt empty, invalid, profane
                if(nameBox.getText().toString().isEmpty() | nameBox.getText().toString().startsWith(" ")){
                    Toast toast = Toast.makeText(getApplicationContext(), "Please enter a valid country name.", Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                } else {
                    countryName = nameBox.getText().toString();
                    //Show dialog
                    AlertDialog.Builder b = new AlertDialog.Builder(this);
                    b.setMessage("Start game with this government type?").setPositiveButton("Yes", dialogClickListener).setNegativeButton("No", dialogClickListener).show();
                }
               break;
        }
    }

    private void describe(Spinner h, Spinner v){

        String horiz = h.getSelectedItem().toString();
        String vert = v.getSelectedItem().toString();

        //Text Views
        TextView t = findViewById(R.id.textGovtDesc);
        TextView b1 = findViewById(R.id.textBonusApp);
        TextView b2 = findViewById(R.id.textBonusBudg);
        TextView b3 = findViewById(R.id.textBonusStab);

        //Compare strings and set description + bonuses
        if(horiz.equals("Centrist") && vert.equals("Moderate")){
            t.setText("Moderate government with economic and social policies that only slightly sway towards a particular end of the spectrum. Aims to provide a correct amount of state involvement towards its people. Examples include Tony Blair's New Labour employing principles of the Third Way philosophy. ");
            bonuses[0] = 0; bonuses[1] = 0; bonuses[2] = 0; type = 1;
            b1.setText(String.valueOf(bonuses[0])); b2.setText(String.valueOf(bonuses[1])); b3.setText(String.valueOf(bonuses[2]));
        } else if (horiz.equals("Centrist") && vert.equals("Authoritarian")) {
            t.setText("A government that does not fall particularly to the left or right economically but employs authoritarian social policy. It is rare that such a government will exist however Singapore's governance is an example of this. While the country has an excellent economy, civil liberties are reduced.");
            bonuses[0] = -1; bonuses[1] = 0; bonuses[2] = 1; type = 2;
            b1.setText(String.valueOf(bonuses[0])); b2.setText(String.valueOf(bonuses[1])); b3.setText(String.valueOf(bonuses[2]));
        } else if (horiz.equals("Centrist") && vert.equals("Libertarian")) {
            t.setText("A common socially liberal centrist government. In the UK the Liberal Democrats ideology occupies this area of the spectrum, with their cohorts of 'social liberals' and 'Orange Bookers' the party tends not to sway too far left or right.");
            bonuses[0] = 1; bonuses[1] = -1; bonuses[2] = 0; type = 3;
            b1.setText(String.valueOf(bonuses[0])); b2.setText(String.valueOf(bonuses[1])); b3.setText(String.valueOf(bonuses[2]));
        } else if (horiz.equals("Collectivist") && vert.equals("Moderate")) {
            t.setText("Traditional centre-left government, social democrats and democratic socialists. Generally employs the belief that a country should be run with social intervention or ownership to ensure its citizens have equal opportunity. Britain's Labour Party is the ideological epitome of this.");
            bonuses[0] = 0; bonuses[1] = -1; bonuses[2] = 1; type = 4;
            b1.setText(String.valueOf(bonuses[0])); b2.setText(String.valueOf(bonuses[1])); b3.setText(String.valueOf(bonuses[2]));
        } else if (horiz.equals("Collectivist") && vert.equals("Authoritarian")){
            t.setText("State communism. Means of production owned by the state with a central planned economy. Imposes rules such that a class based society should not exist. Generally the governments rules are imposed harshly, only 1 political party may exist and religion is banned. The Soviet Union was the primary adherent of this methodology.");
            bonuses[0] = -2; bonuses[1] = 0; bonuses[2] = 2; type = 5;
            b1.setText(String.valueOf(bonuses[0])); b2.setText(String.valueOf(bonuses[1])); b3.setText(String.valueOf(bonuses[2]));
        } else if (horiz.equals("Collectivist") && vert.equals("Libertarian")){
            t.setText("Liberal Socialism. Supportive of the people and opposed to the state. Ideologically the power of the country is held by the people who will reject authority and voluntarily organise social structure. This should result in common ownership of the means of production as opposed to individual private ownership. There are no such examples of a country using this idea, ");
            bonuses[0] = 2; bonuses[1] = -2; bonuses[2] = 0; type = 6;
            b1.setText(String.valueOf(bonuses[0])); b2.setText(String.valueOf(bonuses[1])); b3.setText(String.valueOf(bonuses[2]));
        } else if (horiz.equals("Individualist") && vert.equals("Moderate")){
            t.setText("Traditional centre-right government. Supportive of capitalism as the system that drives the country, with a focus on the rights of the individual. Ideologies in this area are usually balanced between social conservatism and progress. The Conservative party in the UK falls within this category.");
            bonuses[0] = -1; bonuses[1] = 1; bonuses[2] = 0; type = 7;
            b1.setText(String.valueOf(bonuses[0])); b2.setText(String.valueOf(bonuses[1])); b3.setText(String.valueOf(bonuses[2]));
        } else if (horiz.equals("Individualist") && vert.equals("Authoritarian")){
            t.setText("An authoritative government following right wing ideology, generally imposes a hierarchy on society based on the inequalities between individuals. Strong adherence to authority gives rise to traditionalism and therefore social behaviours are dictated by institutions tied to the state (e.g. Religious). Generally, nationalistic, xenophobic and elitist policies are enacted. Examples are Nazism and Facism.");
            bonuses[0] = -2; bonuses[1] = 1; bonuses[2] = 1; type = 8;
            b1.setText(String.valueOf(bonuses[0])); b2.setText(String.valueOf(bonuses[1])); b3.setText(String.valueOf(bonuses[2]));
        } else if (horiz.equals("Individualist") && vert.equals("Libertarian")) {
            t.setText("Classic liberalism. Holding the belief that the rights of the individual are tantamount to freedom. Maintains the Non-Aggression Principle which dictates that any force exerted on an individual (i.e. the state) to do something is coercion which directly violates freedom. For this reason, economically individualist ideas are preferred as collectivism is seen as a violation of the NAP. As of yet there are no examples of a government that has truly utilised this, likely owing to the nature of its ideals.");
            bonuses[0] = 1; bonuses[1] = 1; bonuses[2] = -2; type = 9;
            b1.setText(String.valueOf(bonuses[0])); b2.setText(String.valueOf(bonuses[1])); b3.setText(String.valueOf(bonuses[2]));
        } else {
            //Error - Shouldn't be possible to reach this
            Toast toast = Toast.makeText(getApplicationContext(), "Please select a government type.", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    //Unused - MUST be overridden
    @Override
    public void onNothingSelected(AdapterView<?> parent){}

}
