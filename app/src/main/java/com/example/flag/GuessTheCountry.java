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

    FlagImage flag = new FlagImage();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_the_country);

        ImageView image_country = (ImageView) findViewById(R.id.image_country);
        Spinner spinner_country = (Spinner) findViewById(R.id.spinner_country);


        Random randomFlagGenerator = new Random();
        int number = randomFlagGenerator.nextInt(54);
        image_country.setImageResource(flag.flag_array[number]);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.country_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_country.setAdapter(adapter);
        spinner_country.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
