package MathInjava;

/**
 * Fibonacci
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibOfFormula(50));
    }

    static long fibOfFormula(int n){
        return (long)(Math.pow(((1 + Math.sqrt(5)) / 2) , n));
    }
}