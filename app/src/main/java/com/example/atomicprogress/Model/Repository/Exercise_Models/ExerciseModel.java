package com.example.atomicprogress.Model.Repository.Exercise_Models;

import com.example.atomicprogress.Model.Interfaces.Exercise;

public class ExerciseModel implements Exercise {











    @Override
    public String getExerciseName() {
        return ExerciseInfo.getName();
    }

    @Override
    public String getExerciseType() {
        return null;
    }
}
