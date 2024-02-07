package Sorting;

public class Insertion {
    public static void main(String[] args) {
        int [] arr = {23, 45, 1, 11, 45};
        insertion(arr);
        for(int ar: arr){
            System.out.println(ar);
        }
    }

    static void insertion(int [] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
