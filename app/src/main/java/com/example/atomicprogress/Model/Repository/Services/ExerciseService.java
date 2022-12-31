package com.example.atomicprogress.Model.Repository.Services;

import com.example.atomicprogress.Model.Repository.Exercise_Models.SearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ExerciseService {
    @GET("/v1/exercises")
    Call<SearchResponse> searchExercises(@Query("q") String SearchTerm);
}
