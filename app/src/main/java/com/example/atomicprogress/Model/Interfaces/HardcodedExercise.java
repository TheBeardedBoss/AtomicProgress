package com.example.atomicprogress.Model.Interfaces;

import com.example.atomicprogress.Model.Interfaces.Exercise;

public class HardcodedExercise implements Exercise {
    private String ExerciseName;
    private String ExerciseType;

    public HardcodedExercise(String exerciseName, String exerciseType) {
        ExerciseName = exerciseName;
        ExerciseType = exerciseType;
    }

    @Override
    public String getExerciseName() {
        return ExerciseName;
    }

    @Override
    public String getExerciseType() {
        return ExerciseType;
    }
}
