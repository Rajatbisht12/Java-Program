package Recursion;

class RotatedBinarySearch{
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 10};
        System.out.println(search(arr, 10, 0, arr.length));
    }

    static int search(int [] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int m = s + (e - s) / 2;
        if(arr[m] == target){
            return m;
        }
        if(arr[s] <= arr[m]){
            if(target >= arr[s] && target <= arr[m]){
                return search(arr, target, s, m-1);
            }else{
                return search(arr, target, m+1, e);
            }
        }
        if(target >= arr[m] && target <= arr[e]){
            return search(arr, target, m+1, e);
        }
        return search(arr, target, s, m-1);
    }
}