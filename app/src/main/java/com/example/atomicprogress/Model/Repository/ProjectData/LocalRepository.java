package com.example.atomicprogress.Model.Repository.ProjectData;

import android.app.Activity;
import android.content.Context;

import com.example.atomicprogress.Controller.Activities.App;
import com.example.atomicprogress.Model.DaoSession;
import com.example.atomicprogress.Model.Interfaces.ProjectRepository;
import com.example.atomicprogress.Model.Project;
import com.example.atomicprogress.Model.ProjectDao;

import java.util.List;

public class LocalRepository implements ProjectRepository {

    //Database
    private DaoSession daoSession ;
    private ProjectDao projectDao;
    private static LocalRepository instance;

    private LocalRepository(Activity activity) {
        //Database
         daoSession = ((App) activity.getApplication()).getDaoSession();
         projectDao = daoSession.getProjectDao();
    }

    public static LocalRepository getInstance(Activity activity) {
        if (instance == null) {
            instance = new LocalRepository(activity);
        } return instance;
    }
    @Override
    public void add(Project project) {

        projectDao.insert(project);

    }

    @Override
    public void edit(Project project) {
        projectDao.update(project);
    }

    @Override
    public Project getById(long id) {
        return projectDao.getSession().load(Project.class, id);

    }

    @Override
    public List<Project> getAllProjects() {
     return projectDao.getSession().loadAll(Project.class);

    }

    @Override
    public void delete(long id) {
        Project project = getById(id);
        projectDao.delete(project);
    }
}
