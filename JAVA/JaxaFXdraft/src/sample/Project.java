package sample;

import java.io.Serializable;

public class Project implements Serializable{
    private String name;

    public Project(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String readName() {
        return name;
    }
}

