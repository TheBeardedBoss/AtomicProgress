package com.example.atomicprogress.Model.Repository;

import com.example.atomicprogress.Model.Interfaces.Exercise;

import java.util.List;

public interface ExercisesRepository {
    List<Exercise> getExercises();
    List<Exercise> getExerciseByName(String name);
    List<Exercise> getExerciseByType(String type);
    List<Exercise> getExerciseByDifficulty(String difficulty);
}
