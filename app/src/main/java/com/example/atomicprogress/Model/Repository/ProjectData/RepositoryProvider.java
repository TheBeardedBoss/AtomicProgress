package com.example.atomicprogress.Model.Repository.ProjectData;

import android.app.Activity;
import android.content.Context;

import com.example.atomicprogress.Model.Interfaces.ProjectRepository;

public class RepositoryProvider {
    public static ProjectRepository getInstance(Activity activity) {
        return LocalRepository.getInstance(activity);
    }
}
