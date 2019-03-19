package com.example.flag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.Random;

public class GuessTheCountry extends AppCompatActivity implements AdapterView.OnItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_the_country);

        FlagImage flag = new FlagImage();
        CountryName country = new CountryName();
        ImageView image_country = (ImageView) findViewById(R.id.image_country);
        Spinner spinner_country = (Spinner) findViewById(R.id.spinner_country);


        Random randomFlagGenerator = new Random();
        int number = randomFlagGenerator.nextInt(256);
        image_country.setImageResource(flag.flag_array[number]);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(GuessTheCountry.this, android.R.layout.simple_spinner_dropdown_item,country.country_array);
    spinner_country.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
