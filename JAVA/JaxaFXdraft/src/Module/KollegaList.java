package Module;

import java.util.ArrayList;
import java.io.Serializable;

public class KollegaList implements Serializable{
    private ArrayList<Kollega> KollegaList = new ArrayList<>();

    public void addKollega(Kollega kollega){
        KollegaList.add(kollega);
    }

    public ArrayList<Kollega> getKollegaList() {
        return KollegaList;
    }
}
