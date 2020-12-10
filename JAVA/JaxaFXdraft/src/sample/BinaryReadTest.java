package sample;

import java.io.*;

public class BinaryReadTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String filename = "test.bin";
        File file = new File(filename);

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fis);

        Project project1 = (Project) in.readObject();
        System.out.println(project1.getName());

        in.close();
    }

}
