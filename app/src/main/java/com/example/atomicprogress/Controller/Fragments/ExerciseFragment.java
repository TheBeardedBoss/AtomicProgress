package com.example.atomicprogress.Controller.Fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.InputType;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
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
    ProgressBar loadingProgressBar;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_exercise, container, false);
        exerciseRecyclerView = view.findViewById(R.id.exerciseRecyclerView);
        loadingProgressBar = view.findViewById(R.id.loadingProgressBar);
        EditText searchEditText = view.findViewById(R.id.searchEditText);
        Button searchButtton = view.findViewById(R.id.searchButtton);


//        Commented out is the manual code for getting exercises before using an api
        setupRecyclerView();


        apiHelper = new ApiHelper();
//       searchButtton.setOnClickListener(v -> search(searchEditText.getText().toString()));

        searchButtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search(searchEditText.getText().toString());
            }
        });

//        searchEditText.setRawInputType(InputType.TYPE_CLASS_TEXT);
//        searchEditText.setImeOptions(EditorInfo.IME_ACTION_SEARCH);

        searchEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView view, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {



                        search(searchEditText.getText().toString());

                        return true;
                }
                return false;
            }
            });




        return view;
    }

    private void closeKeyboard(){
//        View view = getActivity().getCurrentFocus();
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

    }

    private void setupRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        exerciseRecyclerView.setLayoutManager(layoutManager);
        exerciseRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),layoutManager.getOrientation()));
    }

    private void search(String searchTerm) {
        loadingProgressBar.setVisibility(View.VISIBLE);
        exerciseRecyclerView.setVisibility(View.GONE);
        apiHelper.searchExercices(searchTerm,this);
        closeKeyboard();


    }

    @Override
    public void onSuccess(SearchResponse data) {
        loadingProgressBar.setVisibility(View.GONE);
        exerciseRecyclerView.setVisibility(View.VISIBLE);
        Toast.makeText(getActivity(),"" + data.getExercises(), Toast.LENGTH_SHORT);
        exerciseRecyclerView.setAdapter((new ExerciseAdapter(data.getExercises(), getActivity())));

    }

    @Override
    public void onFailure(String message) {
        loadingProgressBar.setVisibility(View.GONE);
        exerciseRecyclerView.setVisibility(View.VISIBLE);
        Toast.makeText(getActivity(),message, Toast.LENGTH_SHORT);

    }
}