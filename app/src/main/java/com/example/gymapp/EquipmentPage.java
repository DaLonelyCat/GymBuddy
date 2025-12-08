package com.example.gymapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast; // Import Toast
import androidx.appcompat.app.AppCompatActivity;

public class EquipmentPage extends AppCompatActivity {

    LinearLayout AdvMlayout, BscMachineLayout, DumbellLayout, BarbellLayout, BenchLayout, BodyWeightLayout;
    CheckBox cb_advanceMachine, cb_basicMachine, cb_dumbell, cb_barbell, cb_bench, cb_bodyweight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment_page);
        AdvMlayout = findViewById(R.id.advMLayout);
        BscMachineLayout = findViewById(R.id.bscMachineLayout);
        DumbellLayout = findViewById(R.id.dumbbellLayout);
        BarbellLayout = findViewById(R.id.barbellLayout);
        BenchLayout = findViewById(R.id.benchLayout);
        BodyWeightLayout = findViewById(R.id.bodyweightLayout);

        cb_advanceMachine = findViewById(R.id.cbAdvancedMachine);
        cb_basicMachine = findViewById(R.id.cbBasicMachine);
        cb_dumbell = findViewById(R.id.cbDumbell);
        cb_barbell = findViewById(R.id.cbBarbell);
        cb_bench = findViewById(R.id.cbBench);
        cb_bodyweight = findViewById(R.id.cbBodyWeight);

        Button btnBack1 = (Button) findViewById(R.id.btnBack1);
        btnBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button btnNext1 = (Button) findViewById(R.id.btnNext1);

        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(EquipmentPage.this, MuscleSelectionPage.class);
                startActivity(i);
            }
        });

        DumbellLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Balikkan status checkbox (Checked -> Unchecked atau sebaliknya)
                cb_dumbell.setChecked(!cb_dumbell.isChecked());
            }
        });

        AdvMlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Balikkan status checkbox (Checked -> Unchecked atau sebaliknya)
                cb_advanceMachine.setChecked(!cb_advanceMachine.isChecked());
            }
        });

        BscMachineLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Balikkan status checkbox (Checked -> Unchecked atau sebaliknya)
                cb_basicMachine.setChecked(!cb_basicMachine.isChecked());
            }
        });

        BarbellLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Balikkan status checkbox (Checked -> Unchecked atau sebaliknya)
                cb_barbell.setChecked(!cb_barbell.isChecked());
            }
        });

        BenchLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Balikkan status checkbox (Checked -> Unchecked atau sebaliknya)
                cb_bench.setChecked(!cb_bench.isChecked());
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