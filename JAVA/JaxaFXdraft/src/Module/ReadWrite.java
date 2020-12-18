package Module;

import java.io.*;
import Module.*;

public class ReadWrite {

    public void SaveProject(Projects projects) throws IOException {
        String filename = "../Database.bin";
        File file = new File(filename);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fos);

        out.writeObject(projects);
        out.close();
    }

    public Projects readProjects() throws IOException, ClassNotFoundException {
        String filename = "../Database.bin";
        File file = new File(filename);

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fis);

        Projects project1 = (Projects) in.readObject();

        in.close();
        return project1;
    }
}
