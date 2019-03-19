package com.example.flag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
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
        final Button submit = (Button) findViewById(R.id.button_submit);

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


                //On click method.
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String country_name = spinner_country.getSelectedItem().toString();
                        int country_index = spinner_country.getSelectedItemPosition();
                        int flag_index = number;

                        if (country_index == flag_index) {
                            Toast.makeText(GuessTheCountry.this, "Correct !", Toast.LENGTH_SHORT).show();

                        } else {
                            Toast.makeText(GuessTheCountry.this, "Wrong !\n\n"+country.country_array[number], Toast.LENGTH_LONG).show();
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
