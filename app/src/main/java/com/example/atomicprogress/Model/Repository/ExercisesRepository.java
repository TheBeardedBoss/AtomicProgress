package com.example.atomicprogress.Model.Repository;

import com.example.atomicprogress.Model.Interfaces.Exercise;

import java.util.List;

public interface ExercisesRepository {
    List<Exercise> getExercise();
    List<Exercise> getExerciseByName(String type);
    List<Exercise> getExerciseByType(String type);
    List<Exercise> getExerciseByDifficulty(String type);
}
