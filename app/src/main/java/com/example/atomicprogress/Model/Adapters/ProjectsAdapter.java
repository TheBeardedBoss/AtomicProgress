package com.example.atomicprogress.Model.Adapters;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.atomicprogress.Controller.Activities.AddProjectsActivity;
import com.example.atomicprogress.Model.Project;
import com.example.atomicprogress.Model.Repository.ProjectData.Tags;
import com.example.atomicprogress.R;

import java.util.List;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder> {
    private Context context;
    private List<Project> projects;

    public ProjectsAdapter(Context context, List<Project> projects) {
        this.context = context;
        this.projects = projects;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProjectViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.project_item_layout, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        Project project = projects.get(position);
        holder.titleTextView.setText(project.getProjectName());
        holder.sessionTime.setText("Session time (mins): " + project.getSessionTime());
        holder.breakTime.setText("BreakTime (mins): " + project.getBreakTime() );

        holder.singleProjectItemLayout.setOnClickListener(v -> openProjectDetails(project.getId()));

    }

    private void openProjectDetails(Long id) {
        Intent intent = new Intent(context, AddProjectsActivity.class);
        intent.putExtra(Tags.PROJECT_ID, id);
        context.startActivity(intent);

    }

    @Override
    public int getItemCount() {
        int limit = 100;
        return Math.min(projects.size(),limit);
    }



    static class ProjectViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView, sessionTime, breakTime;
        View singleProjectItemLayout;

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.titleTextView);
            sessionTime = itemView.findViewById(R.id.sessionTime);
            breakTime = itemView.findViewById(R.id.breakTime);
            singleProjectItemLayout = itemView.findViewById(R.id.singleProjectItemLayout);

        }
    }

}
