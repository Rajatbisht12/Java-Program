```
import java.util.Scanner;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] arr = {5, 9, 10, 14, 99};
        for(Integer ar : arr){
            System.out.println(ar);
        }
        change(arr);
        for(Integer ar : arr){
            System.out.println(ar);
        }

        // 2d Array
        Scanner sc = new Scanner(System.in);
        int [][] arr1 = new int[4][];
        
        for(int row = 0; row < arr1.length; row++){
            for(int col = 0; col < arr1[row].length; col++){
                arr1[row][col] = sc.nextInt();
            }
        }

        for(int [] a : arr1){
            System.out.println(a);
        }
        sc.close();
    }

    public static void change(int[] arr) {
        arr[3] = 45;
    }
    
}
```
