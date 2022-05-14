package com.example.coldstart;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int numOfStarts = getIntent().getExtras().getInt(SplashScreen.starts);
        if(numOfStarts == 3){
            Toast.makeText(this,"It were 3 cold starts!", Toast.LENGTH_SHORT).show();
        }
    }
}