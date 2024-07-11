package SubsetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        // dice("", 4);

        // System.out.println(diceArray("", 4));
        System.out.println(diceArraySUb(0, 4));
    }

    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= 6 && i <= target; i++){
            dice(p+i, target-i);
        }
    }

    static ArrayList<String> diceArray(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++){
            ans.addAll(diceArray(p+i, target-i));
        }
        return ans;
    }

    static List<List<Integer>> diceArraySUb(Integer p, int target){
        if(target == 0){
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>());
            return list;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++){
            List<List<Integer>> subResults = diceArraySUb(p + i, target - i);
            for(List<Integer> subResult : subResults){
                List<Integer> newCombinaation = new ArrayList<>(subResult);
                newCombinaation.add(i);
                ans.add(newCombinaation);
            }
        }
        return ans;
    }
}
