package sample;

import java.io.*;

public class BinaryWriteTest {

    public void SaveProject(Project project) throws IOException {
        String filename = "test.bin";
        File file = new File(filename);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fos);

        out.writeObject(project);
        out.close();
    }
}
