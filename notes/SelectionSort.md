```
package Sorting;

public class Selection {
    public static void main(String[] args) {
        int [] arr = {5, 3, 6, 1};
        selection(arr);
        for(int a : arr){
            System.out.println(a);
        }
    }
    
    static void selection(int [] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMax(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static int getMax(int[]arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
```
