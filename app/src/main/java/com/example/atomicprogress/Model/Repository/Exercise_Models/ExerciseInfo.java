package com.example.atomicprogress.Model.Repository.Exercise_Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExerciseInfo {
    @SerializedName("name")
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("muscle")
    @Expose
    private String muscle;
    @SerializedName("equipment")
    @Expose
    private String equipment;
    @SerializedName("difficulty")
    @Expose
    private String difficulty;
    @SerializedName("instructions")
    @Expose
    private String instructions;

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

}
