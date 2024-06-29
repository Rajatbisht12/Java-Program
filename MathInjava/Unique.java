package MathInjava;

public class Unique {
    public static void main(String[] args) {
        int [] arr = {2, 2, 3, 4, 5, 4, 6, 5, 6};
        System.out.println(ans(arr));
    }

    public static int ans(int [] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
