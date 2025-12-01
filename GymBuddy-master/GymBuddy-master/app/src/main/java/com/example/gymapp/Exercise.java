package com.example.gymapp;

import java.util.List;

public class Exercise {
    private int id;
    private String namaExercise;
    private String description;
    private int imageResId;
    private String steps;

    private List<String> equipmentCategories; // Contoh: ["Dumbbell", "Bench"]
    private List<String> muscleGroups;        // Contoh: ["Chest", "Arm"]

    // Constructor
    public Exercise(int id, String namaExercise, String description, int imageResId, String steps,
                    List<String> equipmentCategories, List<String> muscleGroups) {
        this.id = id;
        this.namaExercise = namaExercise;
        this.description = description;
        this.imageResId = imageResId;
        this.steps = steps;
        this.equipmentCategories = equipmentCategories;
        this.muscleGroups = muscleGroups;
    }

    // Getters
    public int getId() { return id; }
    public String getNamaExercise() { return namaExercise; }
    public String getDescription() { return description; }
    public int getImageResId() { return imageResId; }
    public String getSteps() { return steps; }
    public List<String> getEquipmentCategories() { return equipmentCategories; }
    public List<String> getMuscleGroups() { return muscleGroups; }
}
