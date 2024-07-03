package Recursion;

public class SelectionSort {
    static void selecton(int [] arr, int r, int c, int max){
        if(r == 0){
            return;
        }
        if(c > r){
            if(arr[c] > arr[max]){
                selecton(arr, r, c+1, c);
            }else{
                selecton(arr, r, c+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selecton(arr, r-1, 0 , 0);
        }
    }
}
