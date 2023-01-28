package com.example.atomicprogress.Model.Interfaces;

import com.example.atomicprogress.Model.Project;

import java.util.List;

public interface ProjectRepository {
    void add(Project project);
    void edit(Project project);
    Project getById(long id);
    List<Project> getAllProjects();
    void delete (long id);

}
