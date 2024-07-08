package SubsetQuestions;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        skipseq("", "avdde");
    }

    static void skipseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        skipseq(p + ch, up.substring(1));
        skipseq(p, up.substring(1));
    }

    static ArrayList<String> skipseqA(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = skipseqA(p + ch, up.substring(1));
        ArrayList<String> right = skipseqA(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
