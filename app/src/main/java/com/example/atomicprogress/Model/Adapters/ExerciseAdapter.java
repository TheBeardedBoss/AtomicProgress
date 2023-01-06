package com.example.atomicprogress.Model.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.atomicprogress.Model.Interfaces.Exercise;
import com.example.atomicprogress.R;

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
        View view = LayoutInflater.from(context).inflate(R.layout.exercise_item_layout,parent,false);
        return new ExerciseViewHolder(view);
    }
    //binds data to view
    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
        bindExercise(holder,exerciseList.get(position),position);

    }

    private void bindExercise(ExerciseViewHolder holder, Exercise exercise, int position) {
        holder.exerciseNameTextView.setText(exercise.getExerciseName());
        holder.exerciseTypeTextView.setText(exercise.getExerciseType());
        holder.exerciseMuscleTextView.setText(exercise.getExerciseMuscle());
        holder.exerciseEquipmentTextView.setText(exercise.getExerciseEquipment());
        holder.exerciseDifficultyTextView.setText(exercise.getExerciseDifficulty());
        holder.exerciseInstructionTextView.setText(exercise.getExerciseInstructions());
        if (position % 2 == 0) {
            holder.containerLayout.setBackgroundColor(context.getResources().getColor(R.color.exercise_background_2));
        } else {
            holder.containerLayout.setBackgroundColor(context.getResources().getColor(R.color.shadow_blue));
        }

    }

    //returns item count ~~ easy
    @Override
    public int getItemCount() {

        return exerciseList.size();
    }


    static class   ExerciseViewHolder extends RecyclerView.ViewHolder {
        TextView exerciseNameTextView;
        TextView exerciseTypeTextView;
        TextView exerciseMuscleTextView;
        TextView exerciseEquipmentTextView;
        TextView exerciseDifficultyTextView;
        TextView exerciseInstructionTextView;
        ConstraintLayout containerLayout;
        public ExerciseViewHolder(@NonNull View itemView) {
            super(itemView);
            exerciseNameTextView = itemView.findViewById(R.id.exerciseNameTextView);
            exerciseTypeTextView = itemView.findViewById(R.id.exerciseTypeTextView);
            exerciseMuscleTextView = itemView.findViewById(R.id.exerciseMuscleTextView);
            exerciseEquipmentTextView = itemView.findViewById(R.id.exerciseEquipmentTextView);
            exerciseDifficultyTextView = itemView.findViewById(R.id.exerciseDifficultyTextView);
            exerciseInstructionTextView = itemView.findViewById(R.id.exerciseInstructionTextView);
            containerLayout = itemView.findViewById(R.id.containerLayout);

        }
    }
}
