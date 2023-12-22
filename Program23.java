public class Program23 {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 0;
            int c = a/b;
            int d[] = {1,2,3,4};
            System.out.println(d[10]);
        }

        catch (ArithmeticException e)
        {
            System.out.println("Can't divide by zero");
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bound");
        }

        catch (Exception e)
        {
            System.out.println("Exception has occurred");
        }
    }
}