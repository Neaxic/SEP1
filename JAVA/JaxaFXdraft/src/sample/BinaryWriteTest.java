package sample;

import java.io.*;

public class BinaryWriteTest {

    public static void main(String[] args) throws IOException {

        String filename = "test.bin";
        File file = new File(filename);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fos);

        String text = "Test";

        out.writeUTF(text);
        out.flush();

        out.close();
        System.out.println("End writing data to file: " + file.getAbsolutePath());

    }

}
