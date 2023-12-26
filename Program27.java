import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Program27 {
    public static void main(String[] args) {
        File employeeinfofile = new File("/Users/rajatbisht/Desktop/InputOutput/Employeeinfo.txt");
        Program27 demo = new Program27();
        demo.writetoFile(employeeinfofile);

    }
    public void writetoFile(File filetowrite)
    {
        PrintWriter employeeinfowriter = null;
        try {
            employeeinfowriter = new PrintWriter(filetowrite);
            employeeinfowriter.println("Binod");
            employeeinfowriter.println("12rr45");
        }
        catch (FileNotFoundException e){
            System.out.println("Given file not found on the local disk "+filetowrite.getName());
            throw new RuntimeException(e);
        }
        finally {
            employeeinfowriter.close();
        }
    }
}