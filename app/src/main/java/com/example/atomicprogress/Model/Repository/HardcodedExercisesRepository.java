package com.example.atomicprogress.Model.Repository;

import com.example.atomicprogress.Model.Interfaces.Exercise;
import com.example.atomicprogress.Model.Interfaces.HardcodedExercise;

import java.util.ArrayList;
import java.util.List;

public class HardcodedExercisesRepository implements ExercisesRepository {

    @Override
    public List<Exercise> getExercise() {
        List<Exercise> list = new ArrayList();
        list.add(new HardcodedExercise("Bicep Curl", "Strength"));
        list.add(new HardcodedExercise("Bench Press", "Powerlifting"));
        list.add(new HardcodedExercise("Bulgarian Split Squat", "Powerlift"));
        return list;
    }

    @Override
    public List<Exercise> getExerciseByName(String type) {
        return null;
    }

    @Override
    public List<Exercise> getExerciseByType(String type) {
        return null;
    }

    @Override
    public List<Exercise> getExerciseByDifficulty(String type) {
        return null;
    }
}
