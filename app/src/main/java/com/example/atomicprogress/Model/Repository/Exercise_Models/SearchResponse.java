package com.example.atomicprogress.Model.Repository.Exercise_Models;

import com.example.atomicprogress.Model.Interfaces.Exercise;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SearchResponse {



    @SerializedName("exercises")
    private List<ExerciseModel> exercises;

    public SearchResponse(List<ExerciseModel> exercises) {
        this.exercises = exercises;
    }


    // Added List parameter
    public List<Exercise> getExercises(){
        List<Exercise> exerciseList = new ArrayList<>();
        exerciseList.addAll(exercises);
        return exerciseList;
    };

}














































    //    @SerializedName("name")
//    private String name;
//    @SerializedName("type")
//    private String type;
//    @SerializedName("muscle")
//    private String muscle;
//    @SerializedName("equipment")
//    private String equipment;
//    @SerializedName("difficulty")
//    private String difficulty;
//    @SerializedName("instructions")
//    private String instructions;
//
//    @SerializedName("exercises")
//    private List<ExerciseModel> exercises;
//
//
////    public SearchResponse(String name) {
////        this.name = name;
////    }
//
//
//    getExercises
//
//
//    public String getName() {
//
//        return name;
//    }
//
////    public List<Exercise> getExercises() {
////    }
//}
