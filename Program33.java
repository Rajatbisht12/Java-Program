import java.util.ArrayList;

public class Program33 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(23);
        l1.add(56);
        l1.add(23);
        l1.add(5);

        l2.add(44);
        l2.add(34);
        l2.add(54);
        l2.add(45);

        l1.addAll(l2);
//
//        for (int i= 0; i < l1.size(); i++)
//        {
//            System.out.println("Element's are "+l1.get(i));
//        }
        System.out.println(l1.contains(7));
    }
}