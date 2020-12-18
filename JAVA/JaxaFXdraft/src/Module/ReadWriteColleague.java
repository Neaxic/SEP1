package Module;

import java.io.*;

public class ReadWriteColleague {

    public void saveKollega(KollegaList kollegaList) throws IOException {
        String filename = "DatabaseColleague.bin";
        File file = new File(filename);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fos);

        out.writeObject(kollegaList);
        out.close();
    }

    public KollegaList readKollega() throws IOException, ClassNotFoundException {
        String filename = "DatabaseColleague.bin";
        File file = new File(filename);

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fis);

        KollegaList kollegaList = (KollegaList) in.readObject();

        in.close();
        return kollegaList;
    }
}
