package com.example.gymapp;

import java.util.ArrayList;
import java.util.List;

public class ExerciseFilter {
    public static ArrayList<Exercise> filterExercises(ArrayList<Exercise> allExercises,
                                                 ArrayList<String> userEquipment,
                                                 ArrayList<String> userMuscle) {

        ArrayList<Exercise> filteredList = new ArrayList<>();

        for (Exercise exercise : allExercises) {

            // Kita asumsikan user harus punya SEMUA alat yang diminta exercise.
            // Logika: exercise.needed C user.owned

            boolean isEquipmentComplete = true;

            // Ambil kebutuhan alat dari exercise
            List<String> requiredTools = exercise.getEquipmentCategories();

            if (requiredTools != null && !requiredTools.isEmpty()) {
                for (String tool : requiredTools) {
                    // Jika alat yang dibutuhkan TIDAK ada di pilihan user
                    if (!userEquipment.contains(tool)) {
                        isEquipmentComplete = false;
                        break; // Gagal, lanjut ke exercise berikutnya
                    }
                }
            }
            // Catatan: Jika requiredTools kosong (misal bodyweight murni tanpa tag),
            // dianggap true (bisa dilakukan).


            // Kita asumsikan exercise cukup kena SALAH SATU otot yang dipilih user.

            boolean isMuscleTargeted = false;

            // Ambil target otot dari exercise
            List<String> targetMuscles = exercise.getMuscleGroups();

            if (targetMuscles != null) {
                for (String muscle : targetMuscles) {
                    // Jika salah satu target otot exercise ADA di pilihan user
                    if (userMuscle.contains(muscle)) {
                        isMuscleTargeted = true;
                        break; // Ketemu satu aja cukup
                    }
                }
            }


            // Masukkan ke list jika Alat Lengkap DAN Otot Sesuai
            if (isEquipmentComplete && isMuscleTargeted) {
                filteredList.add(exercise);
            }
        }

        return filteredList;
    }
}
