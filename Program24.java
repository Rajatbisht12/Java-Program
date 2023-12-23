// NESTED TRY-BLOCK

public class Program24 {
    public static void main(String[] args) {
        try{
            try{
                int a = 50;
                int b = 0;
                System.out.println("Division is "+a/b);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Arithmetic exception (Divide by zero) has occurred");
            }

            try {
                int a[] = {1,3,5};
                System.out.println(a[5]);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("You are trying to access element of array, which is out of bound");
            }
        }
        catch (Exception e){
            System.out.println("Exception occurred");
        }
    }
}