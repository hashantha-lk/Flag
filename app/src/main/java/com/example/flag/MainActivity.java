package com.example.flag;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button guesstheCountry = (Button) findViewById(R.id.button_guesstheCountry);
        Button guessHints = (Button) findViewById(R.id.button_guessHints);
        Button guessTheFlag = (Button) findViewById(R.id.button_guessTheFlag);
        Button advancedLevel = (Button) findViewById(R.id.button_advancedLevel);


        guesstheCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GuessTheCountry.class);
                startActivity(intent);
            }
        });
    }
}
