package com.example.gymapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GymDatabaseHelper extends SQLiteOpenHelper {

    // Konfigurasi Database
    private static final String DATABASE_NAME = "GymApp.db";
    private static final int DATABASE_VERSION = 1;

    // Nama Tabel & Kolom
    private static final String TABLE_EXERCISES = "exercises";
    private static final String COL_ID = "id";
    private static final String COL_NAME = "name";
    private static final String COL_DESC = "description";
    private static final String COL_IMAGE = "image_resource_id";
    private static final String COL_STEPS = "steps";
    private static final String COL_EQUIPMENT = "equipment_tags"; // Disimpan sebagai String: "Dumbbell,Bench"
    private static final String COL_MUSCLE = "muscle_tags";       // Disimpan sebagai String: "Chest,Arm"
    private static final String COL_SETS = "sets";
    private static final String COL_REPS = "reps";

    public GymDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Membuat Tabel
        String createTable = "CREATE TABLE " + TABLE_EXERCISES + " (" +
                COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_NAME + " TEXT, " +
                COL_DESC + " TEXT, " +
                COL_IMAGE + " INTEGER, " +
                COL_STEPS + " TEXT, " +
                COL_EQUIPMENT + " TEXT, " +
                COL_MUSCLE + " TEXT, " +
                COL_SETS + " INTEGER, " +
                COL_REPS + " INTEGER)";
        db.execSQL(createTable);

        // Isi Data Awal (Seeding) agar database tidak kosong saat pertama install
        insertInitialData(db);
    }
    public void forceResetDatabase() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EXERCISES);
        onCreate(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EXERCISES);
        onCreate(db);
    }

    private void insertInitialData(SQLiteDatabase db) {
        // 1. Push Up
        addExerciseRaw(db, "Push Up", "Latihan dasar untuk dada", R.drawable.pushup,
                "Turunkan badan...", "Bodyweight", "Chest,Arm,Core", 2, 12);

        // 2. Dumbbell Bench Press
        addExerciseRaw(db, "Dumbbell Bench Press", "Latihan dada dengan dumbbell", R.drawable.dbbenchpress,
                "Berbaring di bench...", "Dumbbell,Bench", "Chest,Arm", 2, 12);

        // 3. Barbell Squat
        addExerciseRaw(db, "Barbell Squat", "Latihan kaki utama", R.drawable.barbellsquat,
                "Start by standing...", "Barbell", "Leg,Core", 2, 12);

        // 4. Seated Bicep Curl
        addExerciseRaw(db, "Dumbbell Curl", "Melatih otot bicep", R.drawable.seatedbicepcurl,
                "Sit on a bench...", "Dumbbell", "Arm", 2, 12);

        // 5. Dumbbell Shrug
        addExerciseRaw(db, "Dumbbell Shrug", "Melatih otot shoulder", R.drawable.dbshrug,
                "Stand upright...", "Dumbbell", "Shoulder", 2, 12);

        // 6. Dumbbell Bent Over Rows
        addExerciseRaw(db, "Dumbbell Bent Over Rows", "Primarily targets back muscle...", R.drawable.dbbentoverrows,
                "Stand with your feet...", "Dumbbell", "Back,Biceps", 2, 12);

        // 7. Barbell Bench Press
        addExerciseRaw(db, "Barbell Bench Press", "Best exercise to develop Chest and Arm", R.drawable.barbellbenchpress,
                "Lie flat on a bench...", "Barbell,Bench", "Chest,Arm", 2, 12);

        // 8. Inclined Dumbbell Chest Press
        addExerciseRaw(db, "Inclined Dumbbell Chest Press", "Effective for Upper Chest and Triceps", R.drawable.inclinedbbchestpress,
                "Set an incline bench...", "Dumbbell,Bench", "Arm,Chest,Shoulder", 2, 12);

        // 9. Weighted Crunches
        addExerciseRaw(db, "Weighted Crunches", "Increased intensity of the Classic Crunch", R.drawable.weightedcrunches,
                "Lie flat on your back...", "Dumbbell", "Core,Shoulder", 2, 12);

        // 10. Barbell Seated Calf Raises
        addExerciseRaw(db, "Barbell Seated Calf Raises", "Targets Calf Muscles", R.drawable.barbellseatedcalfraises,
                "Sit on a bench...", "Dumbbell,Bench", "Leg", 2, 12);

        // 11. Push Up (Detailed)
        addExerciseRaw(db, "Push Up (Detailed)", "Latihan dasar untuk kekuatan dada, trisep, dan inti", R.drawable.pushup,
                "Mulai dalam posisi plank...", "Bodyweight", "Chest,Arm,Core", 2, 12);

        // 12. Dumbbell Bench Press (Detailed)
        addExerciseRaw(db, "Dumbbell Bench Press (Detail)", "Latihan utama untuk dada", R.drawable.dbbenchpress,
                "Berbaring di bench datar...", "Dumbbell,Bench", "Chest,Arm", 2, 12);

        // 13. Barbell Squat (Detailed)
        addExerciseRaw(db, "Barbell Squat (Detail)", "Raja latihan kaki", R.drawable.barbellsquat,
                "Letakkan barbell di punggung...", "Barbell", "Leg,Core", 2, 12);

        // 14. Deadlift
        addExerciseRaw(db, "Deadlift", "Latihan seluruh tubuh", R.drawable.deadlift,
                "Berdiri di depan barbell...", "Barbell", "Back,Leg,Core,Arm", 2, 12);

        // 15. Overhead Press
        addExerciseRaw(db, "Overhead Press", "Latihan fundamental untuk bahu", R.drawable.overheadpress,
                "Pegang barbell setinggi bahu...", "Barbell", "Shoulder,Arm,Core", 2, 12);

        // 16. Pull Up
        addExerciseRaw(db, "Pull Up", "Latihan compound untuk punggung", R.drawable.pullup,
                "Gantung pada palang...", "Bodyweight", "Back,Arm,Core", 2, 12);

        // 17. Leg Press
        addExerciseRaw(db, "Leg Press", "Latihan kaki terisolasi", R.drawable.legpress,
                "Duduk di mesin leg press...", "Basic Machine", "Leg", 2, 12);

        // 18. Seated Cable Row
        addExerciseRaw(db, "Seated Cable Row", "Latihan mendayung", R.drawable.seatedcablerow,
                "Duduk di mesin cable row...", "Basic Machine", "Back,Arm", 2, 12);

        // 19. Dumbbell Lateral Raise
        addExerciseRaw(db, "Dumbbell Lateral Raise", "Latihan isolasi bahu samping", R.drawable.dblateralraise,
                "Berdiri tegak...", "Dumbbell", "Shoulder", 2, 12);

        // 20. Barbell Bicep Curl
        addExerciseRaw(db, "Barbell Bicep Curl", "Latihan utama massa bisep", R.drawable.barbellbicepcurl,
                "Berdiri tegak...", "Barbell", "Arm", 2, 12);

        // 21. Triceps Pushdown
        addExerciseRaw(db, "Triceps Pushdown", "Latihan isolasi trisep", R.drawable.tricepspushdown,
                "Berdiri di depan mesin kabel...", "Basic Machine", "Arm", 2, 12);

        // 22. Dumbbell Lunges
        addExerciseRaw(db, "Dumbbell Lunges", "Latihan unilateral kaki", R.drawable.dblunges,
                "Berdiri tegak...", "Dumbbell", "Leg,Core", 2, 12);

        // 23. Russian Twist
        addExerciseRaw(db, "Russian Twist", "Latihan inti perut samping", R.drawable.russiantwist,
                "Duduk dengan lutut ditekuk...", "Bodyweight", "Core", 2, 12);

        // 24. Pec Deck Fly
        addExerciseRaw(db, "Pec Deck Fly", "Latihan isolasi dada tengah", R.drawable.pecdeckfly,
                "Duduk di mesin pec deck...", "Advanced Machine", "Chest", 2, 12);

        // 25. Hammer Curl
        addExerciseRaw(db, "Hammer Curl", "Variasi curl bisep & lengan bawah", R.drawable.hammerlcurl,
                "Berdiri tegak...", "Dumbbell", "Arm", 2, 12);

        // 26. Hyperextension
        addExerciseRaw(db, "Hyperextension", "Memperkuat punggung bawah", R.drawable.hyperextension,
                "Berbaring telungkup...", "Bench", "Back,Core", 2, 12);

        // 27. Machine Shoulder Press
        addExerciseRaw(db, "Machine Shoulder Press", "Latihan bahu stabil", R.drawable.mcshoulderpress,
                "Duduk di mesin...", "Basic Machine", "Shoulder,Arm", 2, 12);

        // 28. Hanging Leg Raise
        addExerciseRaw(db, "Hanging Leg Raise", "Latihan perut bawah", R.drawable.hanginglegraise,
                "Gantung di palang...", "Bodyweight", "Core", 2, 12);

        // 29. Dumbbell Goblet Squat
        addExerciseRaw(db, "Dumbbell Goblet Squat", "Squat untuk pemula", R.drawable.dbgobletsquat,
                "Pegang satu dumbbell...", "Dumbbell", "Leg,Core", 2, 12);

        // 30. Cable Face Pull
        addExerciseRaw(db, "Cable Face Pull", "Kesehatan bahu & punggung atas", R.drawable.cablefacepull,
                "Berdiri di depan mesin kabel...", "Basic Machine", "Shoulder,Back", 2, 12);

        // 31. Bent-Over Barbell Row
        addExerciseRaw(db, "Bent-Over Barbell Row", "Latihan compound mendayung", R.drawable.bentoverbarbellrow,
                "Bungkukkan badan...", "Barbell", "Back,Arm,Core", 2, 12);

        // 32. Machine Chest Press
        addExerciseRaw(db, "Machine Chest Press", "Latihan dada stabil", R.drawable.machinechestpress,
                "Duduk di mesin...", "Basic Machine", "Chest,Arm", 2, 12);
    }

    // Helper private untuk insert data
    private void addExerciseRaw(SQLiteDatabase db, String name, String desc, int img, String steps,
                                String eqTags, String muscleTags, int sets, int reps) {
        ContentValues values = new ContentValues();
        values.put(COL_NAME, name);
        values.put(COL_DESC, desc);
        values.put(COL_IMAGE, img);
        values.put(COL_STEPS, steps);
        values.put(COL_EQUIPMENT, eqTags);
        values.put(COL_MUSCLE, muscleTags);
        values.put(COL_SETS, sets);
        values.put(COL_REPS, reps);
        db.insert(TABLE_EXERCISES, null, values);
    }

    public ArrayList<Exercise> getAllExercisesFromDB() {
        ArrayList<Exercise> exerciseList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_EXERCISES, null);

        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(cursor.getColumnIndexOrThrow(COL_ID));
                String name = cursor.getString(cursor.getColumnIndexOrThrow(COL_NAME));
                String desc = cursor.getString(cursor.getColumnIndexOrThrow(COL_DESC));
                int imgRes = cursor.getInt(cursor.getColumnIndexOrThrow(COL_IMAGE));
                String steps = cursor.getString(cursor.getColumnIndexOrThrow(COL_STEPS));
                
                // Ambil String Tags (csv) -> Convert balik ke ArrayList
                String eqString = cursor.getString(cursor.getColumnIndexOrThrow(COL_EQUIPMENT));
                String muscleString = cursor.getString(cursor.getColumnIndexOrThrow(COL_MUSCLE));
                
                ArrayList<String> eqList = convertStringToArrayList(eqString);
                ArrayList<String> muscleList = convertStringToArrayList(muscleString);

                int sets = cursor.getInt(cursor.getColumnIndexOrThrow(COL_SETS));
                int reps = cursor.getInt(cursor.getColumnIndexOrThrow(COL_REPS));

                // Masukkan ke object Exercise
                exerciseList.add(new Exercise(id, name, desc, imgRes, steps, eqList, muscleList, sets, reps));

            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return exerciseList;
    }

    // Helper: Mengubah "Dumbbell,Bench" menjadi ArrayList ["Dumbbell", "Bench"]
    private ArrayList<String> convertStringToArrayList(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str != null && !str.isEmpty()) {
            String[] items = str.split(",");
            list.addAll(Arrays.asList(items));
        }
        return list;
    }
}