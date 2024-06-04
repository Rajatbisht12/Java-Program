public class ReverseOfarray {
    public static void main(String[] args) {
        int [] nums = {34, 35, 6, 56, 40};
        for(Integer arr: nums){
            System.out.print(arr + " ");
        }
        System.out.println();
        reverse(nums);
        for(Integer arr: nums){
            System.out.print(arr + " ");
        }
    }

    public static void swap(int [] arr, int right, int left){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static int [] reverse(int [] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            swap(arr, right, left);
            right--;
            left++;
        }
        return arr;
    }
}
