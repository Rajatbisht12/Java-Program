package Sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllNum {
    
    static List<Integer> findDisaperNums(int [] nums){
        
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i += 1;
            }
        }

        // Finding numbers
        List<Integer> missing = new ArrayList<Integer>(0);
        for(int index = 0; index < nums.length; i++){
            if(nums[index] != index +1){
                missing.add(index + 1);
            }
        }

        return missing;
    }

    

    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
