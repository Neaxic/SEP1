package sample;

import java.io.Serializable;

public class Project implements Serializable{
    private String name;
    private Projects Liste = new Projects();
    private String description;

    public Project(String name){
        this.name = name;
        description = "None set yet!";
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void addToProjects(Project project){
        Liste.addProject(project);
    }

    public String getName() {
        return name;
    }
}

