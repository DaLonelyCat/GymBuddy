package com.example.gymapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class exercisesPage extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerviewAdapter adapter;
    private ArrayList<Exercise> exerciseList;

    @Override //TEMPORARY DATA TO TEST
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises_page);

        recyclerView = findViewById(R.id.exercisesList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        exerciseList = new ArrayList<>();

        exerciseList.add(new Exercise(
                1,
                "Barbell Decline Shrug",
                "Description here",
                R.drawable.shoulder,
                "Step 1...",
                new ArrayList<>(),
                new ArrayList<>(),
                3,
                12
        ));

        exerciseList.add(new Exercise(
                2,
                "Front Plate Raise",
                "Description here",
                R.drawable.chest,
                "Step 1...",
                new ArrayList<>(),
                new ArrayList<>(),
                3,
                10
        ));

        exerciseList.add(new Exercise(
                3,
                "Dumbbell Press",
                "Description here",
                R.drawable.arm,
                "Step 1...",
                new ArrayList<>(),
                new ArrayList<>(),
                4,
                8
        ));

        exerciseList.add(new Exercise(
                4,
                "Bench Press",
                "Description here",
                R.drawable.bench,
                "Step 1...",
                new ArrayList<>(),
                new ArrayList<>(),
                5,
                5
        ));

        adapter = new RecyclerviewAdapter(exerciseList);
        recyclerView.setAdapter(adapter);

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());

        Button btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(v -> {
            StringBuilder summary = new StringBuilder("Workout Plan:\n");
            for (Exercise ex : exerciseList) {
                summary.append(ex.getName())
                        .append(": ").append(ex.getSets()).append(" x ").append(ex.getReps())
                        .append("\n");
            }
            Toast.makeText(exercisesPage.this, summary.toString(), Toast.LENGTH_LONG).show();
        });
    }
}