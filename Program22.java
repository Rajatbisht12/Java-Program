public class Program22 {
    public static void main(String[] args) {
        int a =9;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch (Exception e)
        {
            System.out.println("We cannot divide any number by zero. Divide by zero Exception has occurred");
        }
    }
}