package com.example.atomicprogress.Controller.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.atomicprogress.R;

public class ProjectsActivity extends AppCompatActivity {
    Toolbar projectsToolBar;
    Button addProjectsButton;
    Button projectOneButton;
    Button projectTwoButton;
    Button projectThreeButton;
    Button projectFourButton;
    Button projectFiveButton;
    Button projectSixButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);
        addProjectsButton = findViewById(R.id.addProjectsButton);
        projectOneButton = findViewById(R.id.projectOneButton);
        projectTwoButton = findViewById(R.id.projectTwoButton);
        projectThreeButton = findViewById(R.id.projectThreeButton);
        projectFourButton = findViewById(R.id.projectFourButton);
        projectFiveButton = findViewById(R.id.projectFiveButton);
        projectSixButton = findViewById(R.id.projectSixButton);


        //toolBar
        projectsToolBar = findViewById(R.id.projectsToolBar);
        setSupportActionBar(projectsToolBar);
        assert getSupportActionBar()!=null;
        getSupportActionBar().setTitle("Projects");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        projectsToolBar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_baseline_arrow_back_24));
        projectsToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        //addprojectsButton
        addProjectsButton.setText("Add Project");
        addProjectsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AddProjectsActivity.class);
                startActivity(intent);
            }
        });

        //ProjectButtons
        projectOneButton.setVisibility(View.GONE);
        projectTwoButton.setVisibility(View.GONE);
        projectThreeButton.setVisibility(View.GONE);
        projectFourButton.setVisibility(View.GONE);
        projectFiveButton.setVisibility(View.GONE);
        projectSixButton.setVisibility(View.GONE);






    }
}