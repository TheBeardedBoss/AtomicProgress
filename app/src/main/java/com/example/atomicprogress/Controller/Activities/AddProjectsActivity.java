package com.example.atomicprogress.Controller.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.atomicprogress.Model.Interfaces.ProjectRepository;
import com.example.atomicprogress.Model.Project;
import com.example.atomicprogress.Model.Repository.ProjectData.RepositoryProvider;
import com.example.atomicprogress.Model.Repository.ProjectData.Tags;
import com.example.atomicprogress.R;

public class AddProjectsActivity extends AppCompatActivity {


    public static final int NO_PROJECT = -1;
    private String[] sessions;
    private String[] breaks;
    private EditText projectNameEditText;
    private Spinner sessionTimeSpinner;
    private Spinner breakSpinner;
    private Button saveButton;
    private ProjectRepository projectRepository;
    private Project project;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_projects);
        projectRepository = RepositoryProvider.getInstance(this);
        TextView projectNameTextview = findViewById(R.id.projectNameTextview);
        projectNameEditText = findViewById(R.id.projectNameEditText);
        TextView sessionTimeTextView = findViewById(R.id.sessionTimeTextView);
        sessionTimeSpinner = findViewById(R.id.sessionTimeSpinner);
        TextView breakTextView = findViewById(R.id.breakTextView);
        breakSpinner = findViewById(R.id.breakSpinner);
        saveButton = findViewById(R.id.saveButton);
        Button deleteButton = findViewById(R.id.deleteButton);

        String[] sessions = {"10", "20", "25", "30"};
        String[] breaks = {"5", "10", "15", "20"};


        ArrayAdapter sessionsAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, sessions);
        sessionsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sessionTimeSpinner.setAdapter(sessionsAdapter);
        sessionTimeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), sessions[1], Toast.LENGTH_SHORT).cancel();
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
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(), breaks[1], Toast.LENGTH_SHORT).cancel();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //lambda function view onclicklistener
        saveButton.setOnClickListener(v -> saveProject());
        long projectId = getIntent().getLongExtra(Tags.PROJECT_ID, NO_PROJECT);
        if (projectId != NO_PROJECT ){
            deleteButton.setOnClickListener(v -> deleteProject(projectId));
            deleteButton.setVisibility(View.VISIBLE);
            project = projectRepository.getById(projectId);
            updateUI(project);
        } else {
            deleteButton.setVisibility(View.GONE);
        }
        


    }

    private void deleteProject(long projectId) {

        projectRepository.delete(projectId);
    }

    private void updateUI(Project project) {
        if (project != null){

            projectNameEditText.setText(project.getProjectName());

        }
    }

    private void saveProject() {
        String title = projectNameEditText.getText().toString();
        String session = sessionTimeSpinner.getSelectedItem().toString();
        String sessionBreak   =  breakSpinner.getSelectedItem().toString();



        if (project == null) {
            Project project = new Project();
            project.setProjectName(title);
            project.setSessionTime(Integer.parseInt(session));
            project.setBreakTime(Integer.parseInt(sessionBreak));
            projectRepository.add(project);
        } else {
            project.setProjectName(title);
            project.setSessionTime(Integer.parseInt(session));
            project.setBreakTime(Integer.parseInt(sessionBreak));
            projectRepository.edit(project);
        }
        Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show();
        finish();

    }


}