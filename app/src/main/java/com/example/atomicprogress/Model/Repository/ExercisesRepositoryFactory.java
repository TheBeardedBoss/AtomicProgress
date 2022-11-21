package com.example.atomicprogress.Model.Repository;

public class ExercisesRepositoryFactory  {

    public static ExercisesRepository getExercisesRepository(){
        return new HardcodedExercisesRepository();

    }


}
