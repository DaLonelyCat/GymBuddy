package com.example.gymapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.example.gymapp.Exercise;

// semua yang "DefaultImage" nanti ganti dengan gambar yang benar

public class ExerciseList {
    public static List<Exercise> getAllExercises() {
        List<Exercise> list = new ArrayList<>();

        // 1. Push Up (Alat: Bodyweight | Otot: Chest, Arm, Core)
        list.add(new Exercise(
                0,
                "Push Up",
                "Latihan dasar untuk dada",
                R.drawable.default_image, // Ganti nanti gambarnya
                "Turunkan badan...",
                Arrays.asList("Bodyweight"), // Equipment Tags
                Arrays.asList("Chest", "Arm", "Core")  // Muscle Tags
        ));

        // 2. Dumbbell Bench Press (Alat: Dumbbell, Bench | Otot: Chest, Arm)
        list.add(new Exercise(
                1,
                "Dumbbell Bench Press",
                "Latihan dada dengan dumbbell",
                R.drawable.default_image,
                "Berbaring di bench...",
                Arrays.asList("Dumbbell", "Bench"),
                Arrays.asList("Chest", "Arm")
        ));

        // 3. Squat (Alat: Barbell/Bodyweight | Otot: Leg, Core)
        list.add(new Exercise(
                2,
                "Barbell Squat",
                "Latihan kaki utama",
                R.drawable.default_image,
                "Letakkan barbel di pundak...",
                Arrays.asList("Barbell"),
                Arrays.asList("Leg", "Core")
        ));

        // 4. Bicep Curl (Alat: Dumbbell | Otot: Arm)
        list.add(new Exercise(
                3,
                "Dumbbell Curl",
                "Melatih otot bicep",
                R.drawable.default_image,
                "Angkat beban...",
                Arrays.asList("Dumbbell"),
                Arrays.asList("Arm")
        ));

        return list;
    }
}
