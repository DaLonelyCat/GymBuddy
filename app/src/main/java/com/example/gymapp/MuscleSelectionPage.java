package com.example.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MuscleSelectionPage extends AppCompatActivity {
    ArrayList<String> receivedEquipments;
    LinearLayout Shoulderlayout, ArmLayout, ChestLayout, BackLayout, LegLayout, BodyWeightLayout;
    CheckBox cb_shoulder, cb_arm, cb_chest, cb_back, cb_leg, cb_bodyweight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_selection_page);

        receivedEquipments = getIntent().getStringArrayListExtra("DATA_EQUIPMENT");

        Shoulderlayout = findViewById(R.id.shoulderLayout);
        ArmLayout = findViewById(R.id.armLayout);
        ChestLayout = findViewById(R.id.chestLayout);
        BackLayout = findViewById(R.id.backLayout);
        LegLayout = findViewById(R.id.legLayout);
        BodyWeightLayout = findViewById(R.id.bodyweightLayout);

        cb_shoulder = findViewById(R.id.cbShoulder);
        cb_arm = findViewById(R.id.cbArm);
        cb_chest = findViewById(R.id.cbChest);
        cb_back = findViewById(R.id.cbBack);
        cb_leg = findViewById(R.id.cbleg);
        cb_bodyweight = findViewById(R.id.cbBodyWeight);

        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button btnNext = (Button) findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> selectedMuscles = new ArrayList<>();
                if (cb_shoulder.isChecked()) selectedMuscles.add("Shoulder");
                if (cb_arm.isChecked()) selectedMuscles.add("Arm");
                if (cb_chest.isChecked()) selectedMuscles.add("Chest");
                if (cb_back.isChecked()) selectedMuscles.add("Back");
                if (cb_leg.isChecked()) selectedMuscles.add("Leg");
                if (cb_bodyweight.isChecked()) selectedMuscles.add("Body Weight");


                Intent i = new Intent(MuscleSelectionPage.this, exercisesPage.class);
                // Oper lagi data equipment yang tadi diterima
                i.putStringArrayListExtra("DATA_EQUIPMENT", receivedEquipments);

                // Tambahkan data muscle yang baru dipilih
                i.putStringArrayListExtra("DATA_MUSCLE", selectedMuscles);
                startActivity(i);
            }
        });

        Shoulderlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Balikkan status checkbox (Checked -> Unchecked atau sebaliknya)
                cb_shoulder.setChecked(!cb_shoulder.isChecked());
            }
        });

        ArmLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Balikkan status checkbox (Checked -> Unchecked atau sebaliknya)
                cb_arm.setChecked(!cb_arm.isChecked());
            }
        });

        ChestLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Balikkan status checkbox (Checked -> Unchecked atau sebaliknya)
                cb_chest.setChecked(!cb_chest.isChecked());
            }
        });

        BackLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Balikkan status checkbox (Checked -> Unchecked atau sebaliknya)
                cb_back.setChecked(!cb_back.isChecked());
            }
        });

        LegLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Balikkan status checkbox (Checked -> Unchecked atau sebaliknya)
                cb_leg.setChecked(!cb_leg.isChecked());
            }
        });

        BodyWeightLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Balikkan status checkbox (Checked -> Unchecked atau sebaliknya)
                cb_bodyweight.setChecked(!cb_bodyweight.isChecked());
            }
        });
    }
}