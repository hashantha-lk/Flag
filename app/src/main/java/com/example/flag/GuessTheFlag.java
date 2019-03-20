package com.example.flag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class GuessTheFlag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_the_flag);

        //Objects in use.
        FlagImage flag = new FlagImage();
        CountryName country = new CountryName();
        ImageButton flag1 = (ImageButton) findViewById(R.id.imageButton_flag1);
        ImageButton flag2 = (ImageButton) findViewById(R.id.imageButton_flag2);
        ImageButton flag3 = (ImageButton) findViewById(R.id.imageButton_flag3);
        TextView flag_name = (TextView) findViewById(R.id.textView_flag_name);
        TextView status = (TextView) findViewById(R.id.textView_status1);
        TextView correct_country = (TextView) findViewById(R.id.textView_correct_country1);
        Button btn = (Button) findViewById(R.id.button_submit1);

        //Random method used to randomize the flag button image.
        Random randomflag = new Random();

        int num1 = randomflag.nextInt(256);
        int num2 = randomflag.nextInt(256);
        int num3 = randomflag.nextInt(256);

        if (num1 != num2 && num1 == num3 && num2 == num3 && num3 == num1) {

        } else {
            flag1.setImageResource(flag.flag_array[num1]);
            flag2.setImageResource(flag.flag_array[num2]);
            flag3.setImageResource(flag.flag_array[num3]);
        }
    }
}
