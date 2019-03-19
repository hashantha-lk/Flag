package com.example.flag;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class GuessTheCountry extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_the_country);

        //Creating usable objects.
        FlagImage flag = new FlagImage();
        ImageView image_country = (ImageView) findViewById(R.id.image_country);
        final TextView textView_status = (TextView) findViewById(R.id.textView_status);
        final TextView textView_correct_country = (TextView) findViewById(R.id.textView_correct_country);
        final CountryName country = new CountryName();
        final Spinner spinner_country = (Spinner) findViewById(R.id.spinner_country);
        final Button submit = (Button) findViewById(R.id.button_submit);


        //Random method used to randomize the flag image.
        Random randomFlagGenerator = new Random();
        final int number = randomFlagGenerator.nextInt(256);
        image_country.setImageResource(flag.flag_array[number]);


        //ArrayAdapter used to add items to the spinner.
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(GuessTheCountry.this, android.R.layout.simple_spinner_dropdown_item, country.country_array);
        spinner_country.setAdapter(adapter);


        //On item selected listener to get user's selection.
        spinner_country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                //On click method.
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int country_index = spinner_country.getSelectedItemPosition();
                        int flag_index = number;
                        for (int i = 0; i <= 1000; i++) {
                            submit.setText("Submit");
                            if (country_index == flag_index) {
                                textView_status.setText("Correct !");
                                textView_status.setTextColor(Color.GREEN);
                                submit.setText("Next");

                                submit.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(getApplicationContext(), GuessTheCountry.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                });
                            } else {
                                textView_status.setText("Wrong !");
                                textView_status.setTextColor(Color.RED);
                                textView_correct_country.setText(country.country_array[number]);
                                textView_correct_country.setTextColor(Color.BLUE);
                                submit.setText("Next");

                                submit.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(getApplicationContext(), GuessTheCountry.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                });
                            }
                        }
                    }
                });
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
