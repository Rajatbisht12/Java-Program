package Recursion;

import java.util.ArrayList;

public class FindAllOccurence {
    
    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllIndex(int [] arr, int target, int index){
        if(index == arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    public static ArrayList<Integer> findAllIndex(int [] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    public static ArrayList<Integer> findAllIndex2(int [] arr, int target, int index){
        ArrayList<Integer> list  = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        // this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);


        list.addAll(ansFromBelowCalls);
        return list;
    }
}
