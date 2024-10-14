import Trees.*;

public class Main {
    public static void main(String[] args) {
        AVLTrees tree = new AVLTrees();

        for(int i = 0; i < 10; i++){
            tree.insert(i);   
        }

        // System.out.println(tree.height());
    }   
}