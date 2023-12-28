import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program29 {
    public static void main(String[] args) throws IOException {
        Program29 pg = new Program29();
        pg.writeToFile(new File("/Users/rajatbisht/Desktop/InputOutput/Message.txt"));
    }

    private void writeToFile(File file) throws IOException
    {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write("Hello folks hope you are enjoying it !!".getBytes());
        fileOutputStream.close();
    }
}