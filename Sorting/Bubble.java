package Sorting;

public class Bubble{
    public static void main(String[] args) {
        int [] nums = {5, 3, 4, 2, 1};
        bubble(nums);
        for(int arr: nums){
            System.out.println(arr);
        }
    }
    static void  bubble(int []arr){
        for(int i = 0; i < arr.length; i++){
            boolean swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}