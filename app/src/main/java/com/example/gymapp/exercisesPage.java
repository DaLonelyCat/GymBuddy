package com.example.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class exercisesPage extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerviewAdapter adapter;
    private ArrayList<Exercise> exerciseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercises_page);

        ArrayList<String> equipmentList = getIntent().getStringArrayListExtra("DATA_EQUIPMENT");
        ArrayList<String> muscleList = getIntent().getStringArrayListExtra("DATA_MUSCLE");

        recyclerView = findViewById(R.id.exercisesList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        if (equipmentList == null) equipmentList = new ArrayList<>();
        if (muscleList == null) muscleList = new ArrayList<>();





        // TODO: LOGIC TO POPULATE EXERCISELIST GOES HERE
        ArrayList<Exercise> allData = ExerciseList.getAllExercises();
        ArrayList<Exercise> exerciseList = ExerciseFilter.filterExercises(allData, equipmentList, muscleList);

        System.out.println("DEBUG ALAT USER: " + equipmentList.toString());
        System.out.println("DEBUG OTOT USER: " + muscleList.toString());
        System.out.println("DEBUG TOTAL DATA MASTER: " + allData.size());

        adapter = new RecyclerviewAdapter(exerciseList);
        recyclerView.setAdapter(adapter);

        Button btnBack = findViewById(R.id.btnBack2);
        btnBack.setOnClickListener(v -> finish());

        Button btnNext = findViewById(R.id.btnNext2);
        btnNext.setOnClickListener(v -> {
            if (exerciseList.isEmpty()) {
                Toast.makeText(exercisesPage.this, "No exercises selected!", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent intent = new Intent(exercisesPage.this, startExercise.class);

            Exercise firstExercise = exerciseList.get(0);
            intent.putExtra("EXERCISE_NAME", firstExercise.getName());
            intent.putExtra("EXERCISE_IMAGE", firstExercise.getImageResId());
            intent.putExtra("EXERCISE_DESC", firstExercise.getDescription());

            startActivity(intent);
        });
    }
}