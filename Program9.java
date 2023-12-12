public class Program9 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Edureka");
        StringBuffer newString = s1.append("!!!");
//        System.out.println(newString);
        System.out.println(newString.reverse());
        System.out.println(newString.capacity() );
    }
}