package com.example.coldstart;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    public static final String starts = "numOfStarts";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        SharedPreferences sp =  getSharedPreferences("name", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        int numOfStarts = sp.getInt(starts,0);
        numOfStarts++;
        editor.putInt(starts,numOfStarts);
        editor.apply();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(starts,numOfStarts);
        startActivity(intent);
        finish();
    }
}