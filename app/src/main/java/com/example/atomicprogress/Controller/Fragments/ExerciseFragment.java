package com.example.atomicprogress.Controller.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.atomicprogress.Model.Adapters.ExerciseAdapter;
import com.example.atomicprogress.Model.Repository.ApiHelper;
import com.example.atomicprogress.Model.Repository.CallBacks.GetExercisesCallback;
import com.example.atomicprogress.Model.Repository.Exercise_Models.SearchResponse;
import com.example.atomicprogress.R;


public class ExerciseFragment extends Fragment  implements GetExercisesCallback {

    View view;
    RecyclerView exerciseRecyclerView;
    private ApiHelper apiHelper;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_exercise, container, false);
        exerciseRecyclerView = view.findViewById(R.id.exerciseRecyclerView);
        EditText searchEditText = view.findViewById(R.id.searchEditText);
        Button searchButtton = view.findViewById(R.id.searchButtton);


//        Commented out is the manual code for getting exercises before using an api
        setupRecyclerView();


        apiHelper = new ApiHelper();
        searchButtton.setOnClickListener(v -> search(searchEditText.getText().toString()));




        return view;
    }

    private void setupRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        exerciseRecyclerView.setLayoutManager(layoutManager);
        exerciseRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),layoutManager.getOrientation()));
    }

    private void search(String searchTerm) {
        apiHelper.searchExercices(searchTerm,this);


    }

    @Override
    public void onSuccess(SearchResponse data) {
        Toast.makeText(getActivity(),"" + data.getExercises(), Toast.LENGTH_SHORT);
        exerciseRecyclerView.setAdapter((new ExerciseAdapter(data.getExercises(), getActivity())));

    }

    @Override
    public void onFailure(String message) {
        Toast.makeText(getActivity(),message, Toast.LENGTH_SHORT);

    }
}