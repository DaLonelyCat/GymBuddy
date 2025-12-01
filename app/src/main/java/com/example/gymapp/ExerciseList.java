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

        // 11. Push Up (Alat: Bodyweight | Otot: Chest, Arm, Core)
        list.add(new Exercise(
                0,
                "Push Up",
                "Latihan dasar untuk kekuatan dada, trisep, dan inti",
                R.drawable.default_image, // Ganti nanti gambarnya
                "Mulai dalam posisi plank. Turunkan dada hingga hampir menyentuh lantai. Dorong kembali ke posisi awal.",
                Arrays.asList("Bodyweight"), // Equipment Tags
                Arrays.asList("Chest", "Arm", "Core")  // Muscle Tags
        ));

        // 12. Dumbbell Bench Press (Alat: Dumbbell, Bench | Otot: Chest, Arm)
                list.add(new Exercise(
                        1,
                        "Dumbbell Bench Press",
                        "Latihan utama untuk dada, dengan fokus pada stabilitas dan rentang gerak",
                        R.drawable.default_image,
                        "Berbaring di bench datar, pegang dumbbell di masing-masing tangan. Dorong dumbbell ke atas, lalu turunkan perlahan.",
                        Arrays.asList("Dumbbell", "Bench"),
                        Arrays.asList("Chest", "Arm")
                ));

        // 13. Barbell Squat (Alat: Barbell | Otot: Leg, Core)
                list.add(new Exercise(
                        2,
                        "Barbell Squat",
                        "Raja latihan kaki, melatih paha, bokong, dan inti",
                        R.drawable.default_image,
                        "Letakkan barbell di punggung atas. Tekuk lutut dan pinggul untuk menurunkan badan, jaga punggung tetap lurus. Dorong kembali ke atas.",
                        Arrays.asList("Barbell"),
                        Arrays.asList("Leg", "Core")
                ));

        // 14. Deadlift (Alat: Barbell | Otot: Back, Leg, Core, Arm)
                list.add(new Exercise(
                        3,
                        "Deadlift",
                        "Latihan seluruh tubuh, terutama punggung bawah, bokong, paha belakang, dan kekuatan cengkeraman",
                        R.drawable.default_image,
                        "Berdiri di depan barbell. Tekuk pinggul dan lutut, pegang barbell. Angkat beban dengan meluruskan pinggul dan lutut. Turunkan kembali dengan kontrol.",
                        Arrays.asList("Barbell"),
                        Arrays.asList("Back", "Leg", "Core", "Arm")
                ));

        // 15. Overhead Press / Shoulder Press (Alat: Barbell | Otot: Shoulders, Arm, Core)
                list.add(new Exercise(
                        4,
                        "Overhead Press / Shoulder Press",
                        "Latihan fundamental untuk bahu (deltoid) dan trisep",
                        R.drawable.default_image,
                        "Pegang barbell setinggi bahu. Dorong beban lurus ke atas kepala hingga lengan lurus. Turunkan kembali ke posisi awal.",
                        Arrays.asList("Barbell"),
                        Arrays.asList("Shoulder", "Arm", "Core")
                ));

        // 16. Pull Up (Alat: Bodyweight | Otot: Back, Arm, Core)
                list.add(new Exercise(
                        5,
                        "Pull Up",
                        "Latihan compound untuk punggung atas (latissimus dorsi) dan bisep",
                        R.drawable.default_image,
                        "Gantung pada palang dengan genggaman overhand. Tarik tubuh ke atas hingga dagu melewati palang. Turunkan perlahan.",
                        Arrays.asList("Bodyweight"),
                        Arrays.asList("Back", "Arm", "Core")
                ));

        // 17. Leg Press (Alat: Basic Machine | Otot: Leg)
                list.add(new Exercise(
                        6,
                        "Leg Press",
                        "Latihan kaki terisolasi yang efektif untuk paha depan dan bokong",
                        R.drawable.default_image,
                        "Duduk di mesin leg press, tempatkan kaki di platform. Dorong platform hingga kaki hampir lurus. Tekuk lutut untuk menurunkan beban.",
                        Arrays.asList("Basic Machine"),
                        Arrays.asList("Leg")
                ));

        // 18. Seated Cable Row (Alat: Basic Machine | Otot: Back, Arm)
                list.add(new Exercise(
                        7,
                        "Seated Cable Row",
                        "Latihan mendayung yang menargetkan punggung tengah dan atas",
                        R.drawable.default_image,
                        "Duduk di mesin cable row, pegang pegangan. Tarik pegangan ke arah perut, tarik siku ke belakang. Lepaskan perlahan.",
                        Arrays.asList("Basic Machine"),
                        Arrays.asList("Back", "Arm")
                ));

        // 19. Dumbbell Lateral Raise (Alat: Dumbbell | Otot: Shoulders)
                list.add(new Exercise(
                        8,
                        "Dumbbell Lateral Raise",
                        "Latihan isolasi untuk bahu samping (deltoid lateral)",
                        R.drawable.default_image,
                        "Berdiri tegak, pegang dumbbell di samping. Angkat dumbbell ke samping hingga setinggi bahu. Turunkan perlahan.",
                        Arrays.asList("Dumbbell"),
                        Arrays.asList("Shoulder")
                ));

        // 20. Barbell Bicep Curl (Alat: Barbell | Otot: Arm)
                list.add(new Exercise(
                        9,
                        "Barbell Bicep Curl",
                        "Latihan utama untuk membangun massa bisep",
                        R.drawable.default_image,
                        "Berdiri tegak, pegang barbell dengan genggaman underhand. Tekuk siku untuk mengangkat barbell ke dada. Turunkan perlahan.",
                        Arrays.asList("Barbell"),
                        Arrays.asList("Arm")
                ));

        // 21. Triceps Pushdown (Alat: Basic Machine | Otot: Arm)
                list.add(new Exercise(
                        10,
                        "Triceps Pushdown",
                        "Latihan isolasi efektif untuk trisep",
                        R.drawable.default_image,
                        "Berdiri di depan mesin kabel (cable machine), pegang pegangan. Dorong pegangan ke bawah hingga lengan lurus. Lepaskan kembali dengan kontrol.",
                        Arrays.asList("Basic Machine"),
                        Arrays.asList("Arm")
                ));

        // 22. Dumbbell Lunges (Alat: Dumbbell | Otot: Leg, Core)
                list.add(new Exercise(
                        11,
                        "Dumbbell Lunges",
                        "Latihan unilateral untuk kaki, melatih keseimbangan dan bokong",
                        R.drawable.default_image,
                        "Berdiri tegak, pegang dumbbell di samping. Ambil langkah besar ke depan, turunkan pinggul hingga kedua lutut membentuk sudut 90 derajat. Dorong kembali ke posisi awal.",
                        Arrays.asList("Dumbbell"),
                        Arrays.asList("Leg", "Core")
                ));

        // 23. Russian Twist (Alat: Bodyweight | Otot: Core)
                list.add(new Exercise(
                        12,
                        "Russian Twist",
                        "Latihan inti yang menargetkan otot perut oblik (samping)",
                        R.drawable.default_image,
                        "Duduk dengan lutut ditekuk dan kaki sedikit terangkat. Condongkan punggung sedikit ke belakang. Putar badan dari sisi ke sisi.",
                        Arrays.asList("Bodyweight"),
                        Arrays.asList("Core")
                ));

        // 24. Pec Deck Fly (Alat: Advanced Machine | Otot: Chest)
                list.add(new Exercise(
                        13,
                        "Pec Deck Fly",
                        "Latihan isolasi untuk otot dada bagian tengah (pektorales)",
                        R.drawable.default_image,
                        "Duduk di mesin pec deck. Dorong bantalan lengan ke tengah, tekan otot dada. Lepaskan perlahan.",
                        Arrays.asList("Advanced Machine"),
                        Arrays.asList("Chest")
                ));

        // 25. Hammer Curl (Alat: Dumbbell | Otot: Arm)
                list.add(new Exercise(
                        14,
                        "Hammer Curl",
                        "Variasi curl yang menargetkan bisep dan otot lengan bawah (brachialis)",
                        R.drawable.default_image,
                        "Berdiri tegak, pegang dumbbell dengan telapak tangan saling berhadapan. Tekuk siku untuk mengangkat dumbbell. Turunkan perlahan.",
                        Arrays.asList("Dumbbell"),
                        Arrays.asList("Arm")
                ));

        // 26. Hyperextension / Back Extension (Alat: Bench | Otot: Back, Core)
                list.add(new Exercise(
                        15,
                        "Hyperextension / Back Extension",
                        "Memperkuat punggung bawah (erector spinae) dan bokong",
                        R.drawable.default_image,
                        "Berbaring telungkup di bench. Turunkan tubuh ke bawah, lalu angkat kembali hingga punggung lurus dengan kontrol.",
                        Arrays.asList("Bench"),
                        Arrays.asList("Back", "Core")
                ));

        // 27. Machine Shoulder Press (Alat: Basic Machine | Otot: Shoulders, Arm)
                list.add(new Exercise(
                        16,
                        "Machine Shoulder Press",
                        "Latihan bahu yang stabil dan ideal untuk pemula",
                        R.drawable.default_image,
                        "Duduk di mesin, pegang pegangan setinggi bahu. Dorong pegangan ke atas. Turunkan kembali dengan kontrol.",
                        Arrays.asList("Basic Machine"),
                        Arrays.asList("Shoulder", "Arm")
                ));

        // 28. Hanging Leg Raise (Alat: Bodyweight | Otot: Core)
                list.add(new Exercise(
                        17,
                        "Hanging Leg Raise",
                        "Latihan inti yang menantang, sangat bagus untuk perut bagian bawah",
                        R.drawable.default_image,
                        "Gantung di palang. Angkat kaki lurus atau ditekuk ke atas ke arah dada. Turunkan perlahan.",
                        Arrays.asList("Bodyweight"),
                        Arrays.asList("Core")
                ));

        // 29. Kettlebell/Dumbbell Goblet Squat (Alat: Dumbbell | Otot: Leg, Core)
                list.add(new Exercise(
                        18,
                        "Kettlebell/Dumbbell Goblet Squat",
                        "Squat yang bagus untuk pemula, membantu menjaga postur tegak",
                        R.drawable.default_image,
                        "Pegang satu dumbbell secara vertikal di depan dada. Lakukan squat, jaga siku di dalam lutut. Dorong kembali ke atas.",
                        Arrays.asList("Dumbbell"),
                        Arrays.asList("Leg", "Core")
                ));

        // 30. Cable Face Pull (Alat: Basic Machine | Otot: Shoulders, Back)
                list.add(new Exercise(
                        19,
                        "Cable Face Pull",
                        "Penting untuk kesehatan bahu, menargetkan deltoid belakang dan otot punggung atas",
                        R.drawable.default_image,
                        "Berdiri di depan mesin kabel (cable machine) tinggi, pegang tali. Tarik tali ke arah wajah, rentangkan siku ke samping. Lepaskan perlahan.",
                        Arrays.asList("Basic Machine"),
                        Arrays.asList("Shoulder", "Back")
                ));

        // 31. Bent-Over Barbell Row (Alat: Barbell | Otot: Back, Arm, Core)
                list.add(new Exercise(
                        20,
                        "Bent-Over Barbell Row",
                        "Latihan compound mendayung yang kuat untuk punggung tengah dan tebal",
                        R.drawable.default_image,
                        "Bungkukkan badan ke depan, pegang barbell. Tarik barbell ke arah perut, remas otot punggung. Turunkan perlahan.",
                        Arrays.asList("Barbell"),
                        Arrays.asList("Back", "Arm", "Core")
                ));

        // 32. Machine Chest Press (Alat: Basic Machine | Otot: Chest, Arm)
                list.add(new Exercise(
                        21,
                        "Machine Chest Press",
                        "Latihan dada yang stabil dan mudah dipelajari",
                        R.drawable.default_image,
                        "Duduk di mesin, pegang pegangan setinggi dada. Dorong pegangan ke depan. Tarik kembali dengan kontrol.",
                        Arrays.asList("Basic Machine"),
                        Arrays.asList("Chest", "Arm")
                ));

        return list;
    }
}
