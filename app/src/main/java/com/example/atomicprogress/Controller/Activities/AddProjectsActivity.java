package com.example.atomicprogress.Controller.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.atomicprogress.R;

public class AddProjectsActivity extends AppCompatActivity {


    private String[] sessions;
    private String[] breaks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_projects);
        TextView projectNameTextview = findViewById(R.id.projectNameTextview);
        EditText projectNameEditText = findViewById(R.id.projectNameEditText);
        TextView sessionTimeTextView = findViewById(R.id.sessionTimeTextView);
        Spinner sessionTimeSpinner = findViewById(R.id.sessionTimeSpinner);
        TextView breakTextView = findViewById(R.id.breakTextView);
        Spinner breakSpinner = findViewById(R.id.breakSpinner);

        String[] sessions = {"10 Minutes", "20 Minutes", "30 Minutes"};
        String[] breaks = {"5 Minutes", "10 Minutes", "20 Minutes"};


        ArrayAdapter sessionsAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, sessions);
        sessionsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sessionTimeSpinner.setAdapter(sessionsAdapter);
        sessionTimeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), sessions[1], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter breakAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, breaks);
        sessionsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        breakSpinner.setAdapter(breakAdapter);
        breakSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), breaks[1], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }


}