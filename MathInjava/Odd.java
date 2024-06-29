package MathInjava;

public class Odd {
    public static void main(String[] args) {
        System.out.println(isOdd(34));
    }

    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
