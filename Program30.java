import java.io.FileInputStream;
import java.io.IOException;

public class Program30 {
    public static void main(String[] args) throws IOException {
        Program30 pg = new Program30();
        pg.readFromFile("/Users/rajatbisht/Desktop/InputOutput/bikeInfo.txt");
    }
    private void readFromFile(String fileToRead) throws IOException{
        FileInputStream inputStream = new FileInputStream(fileToRead);
        int integerReadFromFile;
        while ((integerReadFromFile = inputStream.read()) != -1){
            System.out.println("Character read from file is "+(char)integerReadFromFile);
        }
        inputStream.close();
    }
}