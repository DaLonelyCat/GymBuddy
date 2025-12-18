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

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EXERCISES);
        onCreate(db);
    }

    // --- METHOD UNTUK MENYIMPAN DATA (Otomatis saat pertama kali dibuat) ---
    private void insertInitialData(SQLiteDatabase db) {
        // Contoh Data 1: Dumbbell Bench Press
        addExerciseRaw(db, "Dumbbell Bench Press", "Latihan dada dengan dumbbell", R.drawable.chest,
                "Berbaring dan dorong...", "Dumbbell,Bench", "Chest,Arm", 3, 12);

        // Contoh Data 2: Push Up
        addExerciseRaw(db, "Push Up", "Latihan bodyweight", R.drawable.chest,
                "Posisi plank...", "Bodyweight,Matras", "Chest,Arm,Core", 3, 15);

        // Contoh Data 3: Squat
        addExerciseRaw(db, "Barbell Squat", "Latihan kaki", R.drawable.chest,
                "Jongkok dengan beban...", "Barbell,Rack", "Leg,Core", 4, 10);
        
        // Tambahkan data lainnya di sini...
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

    // --- METHOD UTAMA: MENGAMBIL SEMUA DATA ---
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