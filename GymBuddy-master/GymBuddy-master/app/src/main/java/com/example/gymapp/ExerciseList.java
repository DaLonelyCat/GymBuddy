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

        // 5. Dumbbell Shrug (Alat: Dumbbell | Otot: Shoulder)
        list.add(new Exercise(
                4,
                "Dumbbell Shrug",
                "Melatih otot shoulder",
                R.drawable.default_image,
                "    Stand upright with your feet shoulder-width apart, holding a dumbbell in each hand with your arms at your sides.\n" +
                        "    Keep your back straight and shoulders back.\n" +
                        "    Shrug your shoulders up towards your ears, contracting your traps.\n" +
                        "    Hold the top position for a second.\n" +
                        "    Slowly lower your shoulders back to the starting position.\n" +
                        "    Repeat for the recommended number of repetitions.",
                Arrays.asList("Dumbbell"),
                Arrays.asList("Shoulder")
        ));

        // 6. Dumbbell Bent Over Rows (Alat: Dumbbell | Otot: Back + Biceps)
        list.add(new Exercise(
                3,
                "Dumbbell Bent Over Rows",
                "Primarily targets back muscle, great for improving upper body strength",
                R.drawable.default_image,
                "    Stand with your feet shoulder-width apart, holding a dumbbell in one hand.\n" +
                        "    Bend forward at the hips, keeping your back straight and your core engaged.\n" +
                        "    Allow the dumbbell to hang at arm's length towards the floor.\n" +
                        "    Keeping your elbow close to your side, pull the dumbbell towards your torso by squeezing your shoulder blades together.\n" +
                        "    Pause for a moment at the top of the movement, then slowly lower the dumbbell back to the starting position.\n" +
                        "    Repeat for the recommended number of repetitions, then switch sides.",
                Arrays.asList("Dumbbell"),
                Arrays.asList("Back, Biceps")
        ));

        // 7. Barbell Bench Press (Alat: Barbell, Bench | Otot: Chest, Arm)
        list.add(new Exercise(
                3,
                "Barbell Bench Press",
                "Best exercise to develop Chest and Arm",
                R.drawable.default_image,
                "    Lie flat on a bench with your feet planted firmly on the ground.\n" +
                        "    Grasp the barbell with an overhand grip, slightly wider than shoulder-width apart.\n" +
                        "    Unrack the barbell and lower it to your chest, keeping your elbows at a 90-degree angle.\n" +
                        "    Press the barbell back up to the starting position, fully extending your arms.\n" +
                        "    Lower the barbell again and repeat for the recommended number of repetitions."
                Arrays.asList("Dumbbell, Bench"),
                Arrays.asList("Chest, Arm")
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
