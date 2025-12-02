package com.example.gymapp;

import java.util.List;

public class Exercise {
    private int id;
    private String namaExercise;
    private String description;
    private int imageResId;
    private String steps;
    private List<String> equipmentCategories;
    private List<String> muscleGroups;
    private int sets;
    private int reps;

    public Exercise(int id, String namaExercise, String description, int imageResId, String steps,
                    List<String> equipmentCategories, List<String> muscleGroups, int sets, int reps) {
        this.id = id;
        this.namaExercise = namaExercise;
        this.description = description;
        this.imageResId = imageResId;
        this.steps = steps;
        this.equipmentCategories = equipmentCategories;
        this.muscleGroups = muscleGroups;

        this.sets = sets;
        this.reps = reps;
    }

    public int getId() { return id; }
    public String getNamaExercise() { return namaExercise; }

    public String getName() { return namaExercise; }

    public String getDescription() { return description; }
    public int getImageResId() { return imageResId; }
    public String getSteps() { return steps; }
    public List<String> getEquipmentCategories() { return equipmentCategories; }
    public List<String> getMuscleGroups() { return muscleGroups; }

    public int getSets() { return sets; }
    public void setSets(int sets) { this.sets = sets; }

    public int getReps() { return reps; }
    public void setReps(int reps) { this.reps = reps; }
}