package sample;

import java.io.*;

public class BinaryWriteTest {

    public static void main(String[] args) throws IOException {

        String filename = "test.bin";
        File file = new File(filename);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fos);

        Project project1 = new Project("RWD");

        out.writeObject(project1);

        out.close();
        System.out.println("End writing data to file: " + file.getAbsolutePath());

    }

}
