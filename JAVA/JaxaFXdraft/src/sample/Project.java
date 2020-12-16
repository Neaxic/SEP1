package sample;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Project implements Serializable{
    private String name;
    private String description;
    private String deadline;

    private ArrayList<Krav> kravListe = new ArrayList<>();
    private ArrayList<String> kollegaerListe = new ArrayList<>();
    private ArrayList<String> kollegaerRoller = new ArrayList<>();

    public Project(String name){
        this.name = name;
        description = "None set yet!";
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

    public void addKrav(Krav krav){
        kravListe.add(krav);
    }

    public ArrayList<Krav> getKrav(){
        return kravListe;
    }

    public void setKollegaerListe(ArrayList<String> kollegaerListe) {
        this.kollegaerListe = kollegaerListe;
    }

    public void setKollegaerRoller(ArrayList<String> kollegaerRoller) {
        this.kollegaerRoller = kollegaerRoller;
    }

    public ArrayList<String> getKollegaer(){
        return kollegaerListe;
    }
}

