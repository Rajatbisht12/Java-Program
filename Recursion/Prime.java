package Recursion;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if(n % 2 == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
