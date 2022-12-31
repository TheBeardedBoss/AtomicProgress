package com.example.atomicprogress.Model.Repository.CallBacks;

import com.example.atomicprogress.Model.Repository.Exercise_Models.SearchResponse;

public interface GetExercisesCallback {
    void onSuccess(SearchResponse data);
    void onFailure(String message);
}
