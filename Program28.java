import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program28 {
    public static void main(String[] args) throws IOException{
        Program28 fileWriterDemo = new Program28();
        File bikeInfoWrriter = new File("/Users/rajatbisht/Desktop/InputOutput/bikeInfo.txt");
        fileWriterDemo.writetoFile(bikeInfoWrriter);
    }
    private void writetoFile(File filetowrite) throws IOException{
        FileWriter bikeInfoWrriter = new FileWriter(filetowrite);
        bikeInfoWrriter.write("Ducatti");
        bikeInfoWrriter.flush();
        bikeInfoWrriter.close();
    }
}