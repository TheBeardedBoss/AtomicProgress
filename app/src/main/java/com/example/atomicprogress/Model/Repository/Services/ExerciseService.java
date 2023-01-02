package com.example.atomicprogress.Model.Repository.Services;

import com.example.atomicprogress.Model.Repository.Exercise_Models.SearchResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ExerciseService {
    @Headers("X-Api-Key: JuSkjRpuHdq/LoEmMcJH+A==CzXnSiUaSSz0vQg7")
    @GET("/v1/exercises")
    Call<List<SearchResponse>>searchExercises(@Query("q") String SearchTerm);
     //Call<SearchResponse> searchExercises(@Query("q") String SearchTerm);
}
