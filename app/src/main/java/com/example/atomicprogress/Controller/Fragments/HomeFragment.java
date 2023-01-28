package com.example.atomicprogress.Controller.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.atomicprogress.Controller.Activities.ProjectsActivity;
import com.example.atomicprogress.Model.DaoSession;
import com.example.atomicprogress.Model.ProjectDao;
import com.example.atomicprogress.R;


public class HomeFragment extends Fragment {
    View view;
    Button projectsButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        projectsButton = view.findViewById(R.id.projectsButton);
        projectsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProjectsActivity();
            }
        });




        return view;
    }

    public void openProjectsActivity() {
        Intent intent = new Intent(this.getActivity(), ProjectsActivity.class);
        startActivity(intent);
    }






}