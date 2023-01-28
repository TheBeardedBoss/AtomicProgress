package com.example.atomicprogress.Controller.Activities;

import android.app.Application;
import android.content.Context;

import com.example.atomicprogress.Model.DaoMaster;
import com.example.atomicprogress.Model.DaoSession;
import com.example.atomicprogress.Model.ProjectDao;

import org.greenrobot.greendao.database.Database;

public class App extends Application {
    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        // regular SQLite database
        DaoMaster.OpenHelper helper = new DaoMaster.DevOpenHelper(this, "projects-db");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

    }

