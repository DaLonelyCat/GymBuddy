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
    private boolean isRunning = false;
    private long pauseOffset = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_exercise);

        chronometer = findViewById(R.id.timer);
        btnStart = findViewById(R.id.btnStart);
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
        chronometer.setBase(SystemClock.elapsedRealtime() - pauseOffset);
        chronometer.start();

        isRunning = true;
        btnStart.setText("Pause");
        btnStart.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light)); // Optional: Change color
    }

    private void pauseTimer() {
        chronometer.stop();
        pauseOffset = SystemClock.elapsedRealtime() - chronometer.getBase();
        isRunning = false;
        btnStart.setText("Start");
        btnStart.setBackgroundColor(0xFF628141);
    }
}