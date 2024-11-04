package FileHandling;
import java.io.*;

public class FileHandlin{
  public void fun(){
    try(InputStreamReader isr = new InputStreamReader(System.in)){
      System.out.println("Enter some letters");
      int letters = isr.read();
      while(isr.ready()){
        System.out.println((char)letters);
        letters = isr.read();
      }
      isr.close();
      System.out.println();
    }catch(IOException e){
      System.out.println(e.getMessage());
    }
  }

  public void funf(){
    try(FileReader fr = new FileReader("FileHandling/File.txt")){
      int letters = fr.read();
      while(fr.ready()){
        System.out.println((char)letters);
        letters = fr.read();
      }
      // fr.close();
      System.out.println();
    }catch(IOException e){
      System.out.println(e.getMessage());
    }
  }
}

/*
Streams -> Seq of data
-> Byte ---> Input and Output Streams
-> Character(Unicode) ---> Reader and Writer Streams
Streams is Abstraction that java provides
Java Implements these within class Heirarchy in java.io package

*/