```
public class MaxinArray {
    public static void main(String[] args) {
      int [] nums = {23, 45, 75, 54, 60};
      for(Integer arr : nums){
        System.out.println(arr);
      }
      int max = max(nums);
      System.out.println("The max in the array is " + max);
    }

    public static int max(int [] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
```
