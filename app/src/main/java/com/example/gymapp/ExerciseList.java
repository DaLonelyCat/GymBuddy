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

        // 3. Barbell Squat (Alat: Barbell | Otot: Leg, Core)
        list.add(new Exercise(
                2,
                "Barbell Squat",
                "Latihan kaki utama",
                R.drawable.default_image,
                "    Start by standing with your feet slightly wider than shoulder-width apart and position the barbell across your upper back, resting it on your traps.\n" +
                        "    Keep your chest up, engage your core, and maintain a neutral spine throughout the movement.\n" +
                        "    Initiate the squat by bending at your hips and knees, lowering your body until your thighs are parallel to the ground or below.\n" +
                        "    Ensure that your knees are tracking over your toes and avoid letting them collapse inward.\n" +
                        "    Drive through your heels to stand back up, extending your hips and knees.\n" +
                        "    Repeat for the desired number of repetitions, maintaining proper form and control throughout the exercise.",
                Arrays.asList("Barbell"),
                Arrays.asList("Leg", "Core")
        ));

        // 4. Seated Bicep Curl (Alat: Dumbbell, Bench | Otot: Arm)
        list.add(new Exercise(
                3,
                "Dumbbell Curl",
                "Melatih otot bicep",
                R.drawable.default_image,
                "    Sit on a bench with your feet flat on the floor and a barbell resting on your upper thighs.\n" +
                        "    Place the balls of your feet on an elevated surface such as a block or weight plate.\n" +
                        "    Raise your heels as high as you can by extending your ankles.\n" +
                        "    Slowly lower your heels back down until you feel a stretch in your calves.\n" +
                        "    Repeat the movement for the recommended number of repetitions.",
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
                5,
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
                6,
                "Barbell Bench Press",
                "Best exercise to develop Chest and Arm",
                R.drawable.default_image,
                "    Lie flat on a bench with your feet planted firmly on the ground.\n" +
                        "    Grasp the barbell with an overhand grip, slightly wider than shoulder-width apart.\n" +
                        "    Unrack the barbell and lower it to your chest, keeping your elbows at a 90-degree angle.\n" +
                        "    Press the barbell back up to the starting position, fully extending your arms.\n" +
                        "    Lower the barbell again and repeat for the recommended number of repetitions.",
                Arrays.asList("Dumbbell, Bench"),
                Arrays.asList("Chest, Arm")
        ));

        // 8. Inclined Dumbbell Chest Press (Alat: Dumbbell, Bench | Otot: Arm, Chest, Shoulder)
        list.add(new Exercise(
                7,
                "Inclined Dumbbell Chest Press",
                "Effective for Upper Chest and Triceps",
                R.drawable.default_image,
                "    Set an incline bench to a moderate angle (around 30-45 degrees).\n" +
                        "    Hold a pair of dumbbells and sit on the incline bench with your feet flat on the floor.\n" +
                        "    Lie back on the bench and position the dumbbells at chest level, palms facing each other.\n" +
                        "    Press the dumbbells upward, extending your arms fully without locking your elbows.\n" +
                        "    Pause for a moment, then slowly lower the dumbbells back to the starting position, keeping your elbows slightly bent.\n" +
                        "    Repeat for the recommended number of repetitions.",
                Arrays.asList("Dumbbell, Bench"),
                Arrays.asList("Arm, Chest, Shoulder")
        ));

        // 9. Weighted Crunches (Alat: Dumbbell | Otot: Core, Shoulder)
        list.add(new Exercise(
                8,
                "Weighted Crunches",
                "Increased intensity of the Classic Crunch",
                R.drawable.default_image,
                "    Lie flat on your back with your knees bent and your feet flat on the ground.\n" +
                        "    Hold a weight plate or dumbbell against your chest, or place it behind your head.\n" +
                        "    Engage your abdominal muscles and lift your upper body off the ground, curling towards your knees.\n" +
                        "    Exhale as you crunch and squeeze your abs at the top of the movement.\n" +
                        "    Slowly lower your upper body back down to the starting position.\n" +
                        "    Repeat for the recommended number of repetitions, focusing on maintaining proper form and engaging your core throughout the exercise.",
                Arrays.asList("Dumbbell"),
                Arrays.asList("Core, Shoulder")
        ));

        // 10. Barbell Seated Calf Raises (Alat: Barbell, Bench| Otot: Leg)
        list.add(new Exercise(
                9,
                "Barbell Seated Calf Raises",
                "Targets Calf Muscles",
                R.drawable.default_image,
                "    Sit on a bench with your feet flat on the floor and a barbell resting on your upper thighs.\n" +
                        "    Place the balls of your feet on an elevated surface such as a block or weight plate.\n" +
                        "    Raise your heels as high as you can by extending your ankles.\n" +
                        "    Slowly lower your heels back down until you feel a stretch in your calves.\n" +
                        "    Repeat the movement for the recommended number of repetitions.",
                Arrays.asList("Dumbbell, Bench"),
                Arrays.asList("Leg")
        ));

        return list;
    }
}
