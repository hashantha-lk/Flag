package com.example.flag;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        final CountryName country = new CountryName();
        ImageButton flag1 = (ImageButton) findViewById(R.id.imageButton_flag1);
        ImageButton flag2 = (ImageButton) findViewById(R.id.imageButton_flag2);
        ImageButton flag3 = (ImageButton) findViewById(R.id.imageButton_flag3);
        TextView flag_name = (TextView) findViewById(R.id.textView_flag_name);
        final TextView status = (TextView) findViewById(R.id.textView_status1);
        final TextView correct_country = (TextView) findViewById(R.id.textView_correct_country1);
        final Button next = (Button) findViewById(R.id.button_next);

        //Random method used to randomize the flag button image.
        Random randomFlag = new Random();

        final int num1 = randomFlag.nextInt(256);
        final int num2 = randomFlag.nextInt(256);
        final int num3 = randomFlag.nextInt(256);

        //Validatint not to repeat the same flag twice or thrice.
        if (num1 != num2 && num1 == num3 && num2 == num3 && num3 == num1) {

        } else {
            flag1.setImageResource(flag.flag_array[num1]);
            flag2.setImageResource(flag.flag_array[num2]);
            flag3.setImageResource(flag.flag_array[num3]);
        }

        //Randomizing the country names in the image buttons to display in top text view flag_name.
        int[] countryIndex = {num1, num2, num3};
        Random randomCountry = new Random();
        int flagIndex = randomCountry.nextInt(3);
        flag_name.setText(country.country_array[3]);

        //Selection part.
        if (num1 == flagIndex) {
            flag1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    status.setText("Correct !");
                    status.setTextColor(Color.GREEN);

                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), GuessTheFlag.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
            });
        } else {
            flag1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    status.setText("Wrong !");
                    status.setTextColor(Color.RED);
                    correct_country.setText(country.country_array[num1]);

                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), GuessTheFlag.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
            });

        }
        if (num2 == flagIndex) {
            flag2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    status.setText("Correct !");
                    status.setTextColor(Color.GREEN);

                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), GuessTheFlag.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
            });
        } else {
            flag2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    status.setText("Wrong !");
                    status.setTextColor(Color.RED);
                    correct_country.setText(country.country_array[num2]);

                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), GuessTheFlag.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
            });

        }
        if (num3 == flagIndex) {
            flag3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    status.setText("Correct !");
                    status.setTextColor(Color.GREEN);

                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), GuessTheFlag.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
            });
        } else {
            flag3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    status.setText("Wrong !");
                    status.setTextColor(Color.RED);
                    correct_country.setText(country.country_array[num3]);

                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), GuessTheFlag.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
            });

        }
    }
}
