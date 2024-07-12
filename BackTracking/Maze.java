package BackTracking;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(count(3, 3));

        allPath("", 3, 3);
    }

    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);

        return left + right;
    }

    static void allPath(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            allPath(p+'V', r-1, c);
        }
        if(c>1){
            allPath(p+'H', r, c-1);
        }
        if(r>1 && c>1){
            allPath(p+'D', r-1, c-1);
        }
    }
}
