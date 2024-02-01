import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        // list.add(14);
        // list.add(15);
        // list.add(11);
        // System.out.println(list);

        // User Input

        for(int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        }
        
        //Printing the ArrayList
        for(Integer arr : list){
            System.out.println(arr);
        }

        sc.close();
    }
}
