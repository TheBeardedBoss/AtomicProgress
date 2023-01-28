package com.example.atomicprogress.Controller.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.atomicprogress.Model.Adapters.ProjectsAdapter;
import com.example.atomicprogress.Model.DaoSession;
import com.example.atomicprogress.Model.Interfaces.ProjectRepository;
import com.example.atomicprogress.Model.Project;
import com.example.atomicprogress.Model.ProjectDao;
import com.example.atomicprogress.Model.Repository.ProjectData.RepositoryProvider;
import com.example.atomicprogress.R;

import java.util.List;

public class ProjectsActivity extends AppCompatActivity {
    Toolbar projectsToolBar;
    Button addProjectsButton;
    Button projectOneButton;
    Button projectTwoButton;
    Button projectThreeButton;
    Button projectFourButton;
    Button projectFiveButton;
    Button projectSixButton;
    RecyclerView projectsRecyclerView;
    private List<Project> projects;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);
        projectsRecyclerView = findViewById(R.id.projectsRecyclerView);
        addProjectsButton = findViewById(R.id.addProjectsButton);

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










    }

    @Override
    protected void onResume() {
        super.onResume();


        ProjectRepository projectRepository = RepositoryProvider.getInstance(this);

        //get all projects
        List<Project> projects = projectRepository.getAllProjects();

        //RecyclerView Adapter
        ProjectsAdapter projectsAdapter = new ProjectsAdapter(this, projects);
        projectsRecyclerView.setAdapter(projectsAdapter);
    }

    void addedProjects(){
        int position = 0;
        Project project = projects.get(position);
         projectOneButton.setText(project.getProjectName());
        projectTwoButton.setText(project.getProjectName());
        projectThreeButton.setText(project.getProjectName());
        projectFourButton.setText(project.getProjectName());
        projectFiveButton.setText(project.getProjectName());
        projectSixButton.setText(project.getProjectName());
    }



}