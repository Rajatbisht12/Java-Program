package Recursion;

/**
 * LinearSearch
 */
public class LinearSearch {
    public static void main(String[] args) {
        
    }

    public static boolean find(int [] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index +1);
    }

    public static int findIndex(int [] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }else{
            return findIndex(arr, target, index +1);
        }
    }
}