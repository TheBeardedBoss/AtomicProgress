package com.example.atomicprogress.Model.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.atomicprogress.Model.Interfaces.Exercise;

import org.w3c.dom.Text;

import java.util.List;

// Adapter necessary for recyclerview, extends Recyclerview.Adapter, and needs a viewholder which is usually within the class (static within this class so it can only access whats here). The adapter requires the methods below
public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder> {
    //adapter needs a private list and always needs a CONTEXT!
    private List<Exercise> exerciseList;
    private Context context;

    public ExerciseAdapter(List<Exercise> exerciseList, Context context) {
        this.exerciseList = exerciseList;
        this.context = context;
    }

    //inflates/creates the view for the recyclerview
    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }
    //binds data to view
    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {

    }
    //returns item count ~~ easy
    @Override
    public int getItemCount() {

        return exerciseList.size();
    }


    static class ExerciseViewHolder extends RecyclerView.ViewHolder {
        TextView exerciseNameTextView;
        TextView exerciseTypeTextView;
        TextView exerciseMuscleTextView;
        TextView exerciseDifficultyTextView;
        public ExerciseViewHolder(@NonNull View itemView) {
            super(itemView);
            //exerciseNameTextView = itemView.findViewById()
        }
    }
}