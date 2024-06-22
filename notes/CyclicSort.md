
```
package Sorting;

public class Csort {
    public static void main(String[] args) {
        int [] arr = {5, 4, 2, 3, 1};
        sort(arr);
        for(int ar: arr){
            System.out.println(ar);
        }
    }

    static void sort(int [] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i += 1;
            }
        }
    }

    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
```
