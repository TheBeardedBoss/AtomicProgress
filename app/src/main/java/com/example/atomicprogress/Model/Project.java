package com.example.atomicprogress.Model;

import android.widget.Spinner;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

@Entity()


public class Project {
    @Id(autoincrement = true)
    private Long id;

    @NotNull
    private String projectName;
    private int sessionTime;
    private int BreakTime;
    @Generated(hash = 1740483859)
    public Project(Long id, @NotNull String projectName, int sessionTime,
            int BreakTime) {
        this.id = id;
        this.projectName = projectName;
        this.sessionTime = sessionTime;
        this.BreakTime = BreakTime;
    }
    @Generated(hash = 1767516619)
    public Project() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getProjectName() {
        return this.projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public int getSessionTime() {
        return this.sessionTime;
    }
    public void setSessionTime(int sessionTime) {
        this.sessionTime = sessionTime;
    }
    public int getBreakTime() {
        return this.BreakTime;
    }
    public void setBreakTime(int BreakTime) {
        this.BreakTime = BreakTime;
    }
}

