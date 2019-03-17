package com.example.flag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;

import java.util.Random;

public class GuessTheCountry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_the_country);

        ImageView image_country = (ImageView) findViewById(R.id.image_country);
        Spinner spinner_country=(Spinner)findViewById(R.id.spinner_country);

        int[] flag_array = {
                //A
                R.drawable.afghanistan,
                R.drawable.albania,
                R.drawable.algeria,
                R.drawable.american_samoa,
                R.drawable.andorra,
                R.drawable.angola,
                R.drawable.anguilla,
                R.drawable.antigua_and_barbuda,
                R.drawable.argentina,
                R.drawable.armenia,
                R.drawable.aruba,
                R.drawable.australia,
                R.drawable.austria,
                R.drawable.azerbaijan,
                //B
                R.drawable.bahamas,
                R.drawable.bahrain,
                R.drawable.bangladesh,
                R.drawable.barbados,
                R.drawable.belarus,
                R.drawable.belgium,
                R.drawable.belize,
                R.drawable.benin,
                R.drawable.bermuda,
                R.drawable.bhutan,
                R.drawable.bolivia,
                R.drawable.bosnia,
                R.drawable.botswana,
                R.drawable.brazil,
                R.drawable.british_virgin_islands,
                R.drawable.brunei,
                R.drawable.bulgaria,
                R.drawable.burkina_faso,
                R.drawable.burundi,
                //C
                R.drawable.cambodia,
                R.drawable.cameroon,
                R.drawable.canada,
                R.drawable.cape_verde,
                R.drawable.cayman_islands,
                R.drawable.central_african_republic,
                R.drawable.chad,
                R.drawable.chile,
                R.drawable.china,
                R.drawable.christmas_island,
                R.drawable.colombia,
                R.drawable.comoros,
                R.drawable.cook_islands,
                R.drawable.costa_rica,
                R.drawable.cote_divoire,
                R.drawable.croatia,
                R.drawable.cuba,
                R.drawable.cyprus,
                R.drawable.czech_republic,
                //D

        };

        Random randomFlagGenerator = new Random();
        int number = randomFlagGenerator.nextInt(54);

        image_country.setImageResource(flag_array[number]);


    }

}
