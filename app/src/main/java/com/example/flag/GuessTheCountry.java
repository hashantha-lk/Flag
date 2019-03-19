package com.example.flag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Random;

public class GuessTheCountry extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_the_country);

        //Creating usable objects.
        FlagImage flag = new FlagImage();
        final CountryName country = new CountryName();
        ImageView image_country = (ImageView) findViewById(R.id.image_country);
        final Spinner spinner_country = (Spinner) findViewById(R.id.spinner_country);

        //Random object used to randomize the image displayed each and every time.
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

                int x = spinner_country.getSelectedItemPosition();
                int y = number;

                if (x == y) {

                    Toast.makeText(GuessTheCountry.this, spinner_country.getSelectedItem().toString() + " is correct !", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(GuessTheCountry.this, spinner_country.getSelectedItem().toString() + " is wrong !", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
