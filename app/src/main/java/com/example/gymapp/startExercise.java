package com.example.gymapp; // <--- CHANGE THIS to your actual package name

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import androidx.appcompat.app.AppCompatActivity;

public class startExercise extends AppCompatActivity {

    private Chronometer chronometer;
    private Button btnStart;

    // Variables to keep track of the timer state
    private boolean isRunning = false;
    private long pauseOffset = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_exercise); // Make sure this matches your XML file name

        // 1. Link the Java variables to your XML components
        chronometer = findViewById(R.id.timer);
        btnStart = findViewById(R.id.btnStart);

        // 2. Set the click listener for the Start button
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isRunning) {
                    startTimer();
                } else {
                    pauseTimer();
                }
            }
        });
    }

    private void startTimer() {
        // Set the base time to the current time minus any time already elapsed (offset)
        chronometer.setBase(SystemClock.elapsedRealtime() - pauseOffset);
        chronometer.start();

        // Change visual state
        isRunning = true;
        btnStart.setText("Pause");
        btnStart.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light)); // Optional: Change color
    }

    private void pauseTimer() {
        chronometer.stop();

        // Calculate the time elapsed so we can resume from here later
        pauseOffset = SystemClock.elapsedRealtime() - chronometer.getBase();

        // Change visual state
        isRunning = false;
        btnStart.setText("Start");
        // Reset color to your original green (using hex code from your XML)
        btnStart.setBackgroundColor(0xFF628141);
    }
}