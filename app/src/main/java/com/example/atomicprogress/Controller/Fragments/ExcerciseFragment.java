package com.example.atomicprogress.Controller.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atomicprogress.Model.Interfaces.Exercise;
import com.example.atomicprogress.Model.Repository.ExercisesRepositoryFactory;
import com.example.atomicprogress.R;

import java.util.List;


public class ExcerciseFragment extends Fragment {

    View view;
    RecyclerView exerciseRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_exercise, container, false);
        exerciseRecyclerView = view.findViewById(R.id.exerciseRecyclerView);
        List<Exercise> exerciseList =ExercisesRepositoryFactory.getExercisesRepository().getExercise();
        exerciseRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));






        return view;
    }

}