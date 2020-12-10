package sample;

import java.io.*;

public class ReadWrite {

    public void SaveProject(Projects project) throws IOException {
        String filename = "test.bin";
        File file = new File(filename);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fos);

        out.writeObject(project);
        out.close();
    }

    public Projects readProjects() throws IOException, ClassNotFoundException {
        String filename = "test.bin";
        File file = new File(filename);

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fis);

        Projects project1 = (Projects) in.readObject();

        in.close();
        return project1;
    }
}
