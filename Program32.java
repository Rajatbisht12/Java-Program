import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program32 {
    public static void main(String[] args) {
        List liSt = new Program32().createArraylist();
        new Program32().printArraylistDemo(liSt);
    }

    private List createArraylist(){
        List <String> cars =new ArrayList<>();
        cars.add("BMW");
        cars.add("Merceddes");
        cars.add("Alto");
        cars.add("Nano");

        return cars;
    }

    private void printArraylistDemo(List list){
        Iterator listIterator = list.iterator();
        while (listIterator.hasNext()){
            System.out.println("Print the list "+listIterator.next());
        }
    }
}