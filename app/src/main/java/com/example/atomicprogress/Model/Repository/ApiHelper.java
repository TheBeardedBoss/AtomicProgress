package com.example.atomicprogress.Model.Repository;

import android.util.Log;

import com.example.atomicprogress.Model.Repository.CallBacks.GetExercisesCallback;
import com.example.atomicprogress.Model.Repository.Exercise_Models.SearchResponse;
import com.example.atomicprogress.Model.Repository.Services.ExerciseService;

import java.time.LocalDate;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiHelper {
    public static final String TAG = "API_HELPER";
    private Retrofit retrofit;

    public ApiHelper() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)
         //       .addInterceptor(authorisation)
                .build();
         retrofit = new Retrofit.Builder()
                 .client(client)
                .baseUrl("https://api.api-ninjas.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }
    public void searchExercices(String searchTerm, GetExercisesCallback callback){
        ExerciseService exerciseService = retrofit.create(ExerciseService.class);
        Call<SearchResponse> call = exerciseService.searchExercises(searchTerm);
        call.enqueue(new Callback<SearchResponse>() {
            @Override
            public void onResponse(Call<SearchResponse> call, Response<SearchResponse> response) {

                if (response.isSuccessful()){
                    SearchResponse body = response.body();
                    callback.onSuccess(body);


                } else {
                    callback.onFailure("Response Unsuccessful: " + response.errorBody().toString() );

                }

            }

            @Override
            public void onFailure(Call<SearchResponse> call, Throwable t) {
                callback.onFailure("Check your internet");
                t.printStackTrace();

            }
        });
    }
}
