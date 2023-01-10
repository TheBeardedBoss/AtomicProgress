package com.example.atomicprogress.Model;

import java.util.HashMap;

public class SearchExercisesQuery {

    HashMap<String,String> searchExercisesQuery;
    public SearchExercisesQuery(HashMap<String, String> searchExercisesQuery) {

        this.searchExercisesQuery = searchExercisesQuery;

        searchExercisesQuery.put("SearchTerm", "name");
        searchExercisesQuery.put("SearchTermTwo", "type");
        searchExercisesQuery.put("SearchTermThree", "muscle");
        searchExercisesQuery.put("SearchTermFour", "equipment");
        searchExercisesQuery.put("SearchTermFive", "difficulty");
        searchExercisesQuery.put("SearchTermSix", "instructions");

    }

    public HashMap<String, String> getSearchExercisesQuery() {
        return searchExercisesQuery;
    }

    public void setSearchExercisesQuery(HashMap<String, String> searchExercisesQuery) {
        this.searchExercisesQuery = searchExercisesQuery;


    }





}
