package Sorting;

class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        for (int ar : arr) {
            System.out.println(ar);
        }
    }

    static void sort(int[] nums, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int s = lo;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        sort(nums, lo, e);
        sort(nums, s, hi);
    }
}