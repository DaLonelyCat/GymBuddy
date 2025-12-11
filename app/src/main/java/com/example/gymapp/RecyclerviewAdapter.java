package com.example.gymapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ExerciseViewHolder> {

    private ArrayList<Exercise> exerciseList;

    public RecyclerviewAdapter(ArrayList<Exercise> exerciseList) {
        this.exerciseList = exerciseList;
    }

    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.exercisecard, parent, false);
        return new ExerciseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
        Exercise currentItem = exerciseList.get(position);

        holder.tvName.setText(currentItem.getName());
        holder.imgExercise.setImageResource(currentItem.getImageResId());

        holder.tvSetsCount.setText(String.valueOf(currentItem.getSets()));
        holder.tvRepsCount.setText(String.valueOf(currentItem.getReps()));

        holder.btnSetsPlus.setOnClickListener(v -> {
            int currentSets = currentItem.getSets();
            currentItem.setSets(currentSets + 1); // Update Model
            holder.tvSetsCount.setText(String.valueOf(currentItem.getSets())); // Update UI
        });

        holder.btnSetsMinus.setOnClickListener(v -> {
            int currentSets = currentItem.getSets();
            if (currentSets > 1) { // Prevent going below 1
                currentItem.setSets(currentSets - 1);
                holder.tvSetsCount.setText(String.valueOf(currentItem.getSets()));
            }
        });

        holder.btnRepsPlus.setOnClickListener(v -> {
            int currentReps = currentItem.getReps();
            currentItem.setReps(currentReps + 1);
            holder.tvRepsCount.setText(String.valueOf(currentItem.getReps()));
        });

        holder.btnRepsMinus.setOnClickListener(v -> {
            int currentReps = currentItem.getReps();
            if (currentReps > 1) {
                currentItem.setReps(currentReps - 1);
                holder.tvRepsCount.setText(String.valueOf(currentItem.getReps()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return exerciseList.size();
    }

    public static class ExerciseViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgExercise;
        public TextView tvName, tvSetsCount, tvRepsCount;
        public TextView btnSetsPlus, btnSetsMinus, btnRepsPlus, btnRepsMinus;

        public ExerciseViewHolder(@NonNull View itemView) {
            super(itemView);
            imgExercise = itemView.findViewById(R.id.imgExercise);
            tvName = itemView.findViewById(R.id.tvExerciseName);

            tvSetsCount = itemView.findViewById(R.id.tvSetsCount);
            btnSetsPlus = itemView.findViewById(R.id.btnSetsPlus);
            btnSetsMinus = itemView.findViewById(R.id.btnSetsMinus);

            tvRepsCount = itemView.findViewById(R.id.tvRepsCount);
            btnRepsPlus = itemView.findViewById(R.id.btnRepsPlus);
            btnRepsMinus = itemView.findViewById(R.id.btnRepsMinus);
        }
    }
}