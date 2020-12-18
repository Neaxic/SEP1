package sample;

import java.io.Serializable;

import java.util.ArrayList;

public class Project implements Serializable{
    private String name;
    private String description;
    private String deadline;

    private ArrayList<String> requirements = new ArrayList<>();
   private ArrayList<String> kollegaerNavneListe = new ArrayList<String>();
   private ArrayList<String> kollegaerRoller = new ArrayList<>();



    public Project(String name){
        this.name = name;
        description = "None set yet!";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }


    public void setKollegaerListe(ArrayList<String> kollegaerNavneListe) {
        this.kollegaerNavneListe = kollegaerNavneListe;
    }

    public void setKollegaerRoller(ArrayList<String> kollegaerRoller) {
        this.kollegaerRoller = kollegaerRoller;
    }

    public ArrayList<String> getKollegaer(){
        return kollegaerNavneListe;
    }

    public ArrayList<String> getKollegaerRoller() {
        return kollegaerRoller;
    }

    public void setRequirements(ArrayList<String> Requirement) {
        requirements = Requirement;
    }

    public ArrayList<String> getRequirements() {
        return requirements;
    }

    public Project copy(Project project, String navn){
        Project project1 = new Project(navn);
        project = (Project) project1;
        return project1;
    }
}