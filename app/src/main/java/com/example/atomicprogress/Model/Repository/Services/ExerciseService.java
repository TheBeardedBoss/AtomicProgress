package com.example.atomicprogress.Model.Repository.Services;

import com.example.atomicprogress.Model.Repository.Exercise_Models.SearchResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface ExerciseService {
    @Headers({"X-Api-Key: JuSkjRpuHdq/LoEmMcJH+A==CzXnSiUaSSz0vQg7","Accept: application/json"})
    @GET("/v1/exercises/")

    Call<List<SearchResponse>> searchExercises(

            @Query("name")String SearchTerm,
            @Query("muscle")String SearchTermTwo



    );





}
