package com.example.atomicprogress.Model.Repository.Exercise_Models;

import com.example.atomicprogress.Model.Interfaces.Exercise;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SearchResponse implements Exercise {

    public final List<SearchResponse> exercises;

    @SerializedName("name")
    private String name;

    @SerializedName("type")
    private String type;

    @SerializedName("muscle")
    private String muscle;

    @SerializedName("equipment")
    private String equipment;

    @SerializedName("difficulty")
    private String difficulty;

    @SerializedName("instructions")
    private String instructions;

    public SearchResponse(List<SearchResponse> exercises) {
        this.exercises = exercises;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMuscle() {
        return muscle;
    }

    public void setMuscle(String muscle) {
        this.muscle = muscle;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String getExerciseName() {
        return this.getName();
    }

    @Override
    public String getExerciseType() {
        return this.getType();
    }

    public List<Exercise> getExercises() {
        List<Exercise> exerciseList = new ArrayList<>();
        exerciseList.addAll(exercises);
        return exerciseList;
    }
}















//    @SerializedName("exercises")
//    private final List<ExerciseModel> exercises;
//
//    public SearchResponse(List<ExerciseModel> exercises) {
//        this.exercises = exercises;
//    }
//
//
//    // Added List parameter
//    public List<Exercise> getExercises(){
//        List<Exercise> exerciseList = new ArrayList<>();
//        exerciseList.addAll(exercises);
//        return exerciseList;
//    };















































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
