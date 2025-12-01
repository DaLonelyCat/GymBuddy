package com.example.gymapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView; // Imported TextView
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList; // Import ArrayList
/*
The plan is to set each Equipment and Muscle with their own Tag,
We give a few preloaded exercises and give them their tags,
when the user chooses an equipment & muscle,
The app showcase all the exercises containing the selected tags.
*/
public class exercisesPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_exercises_page);

        View mainView = findViewById(R.id.main);
        if (mainView != null) {
            ViewCompat.setOnApplyWindowInsetsListener(mainView, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        ArrayList<String> equipmentList = getIntent().getStringArrayListExtra("SELECTED_EQUIPMENT");

        if (equipmentList != null && !equipmentList.isEmpty()) {
            String message = "You selected: " + equipmentList.toString();
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this, "No equipment selected!", Toast.LENGTH_SHORT).show();
        }

        Button btnBack = findViewById(R.id.btnBack);
        if (btnBack != null) {
            btnBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }

        Button btnNext = findViewById(R.id.btnNext);
        if (btnNext != null) {
            btnNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(exercisesPage.this, "Starting Workout...", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}