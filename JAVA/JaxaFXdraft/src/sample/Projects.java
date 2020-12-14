package sample;

import java.util.ArrayList;
import java.io.Serializable;

public class Projects implements Serializable{
    private ArrayList<Project> projectsList = new ArrayList<Project>();

    public void addProject(Project project){
        projectsList.add(project);
    }

    public ArrayList<Project> getProjectsList() {
        return projectsList;
    }

}
