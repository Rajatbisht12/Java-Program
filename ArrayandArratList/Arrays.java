import java.util.Scanner;

class Arrays{
    public static void main(String[] args){
        int [] rnos = {23, 12, 45, 32, 25};
        for(Integer arr : rnos){
            System.out.println(arr + " ");
        }

        // User Input

        Scanner sc = new Scanner(System.in);
        int [] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //Printing the array
        for(Integer ar : arr){
            System.out.println(ar);
        }
        sc.close();
    }
}