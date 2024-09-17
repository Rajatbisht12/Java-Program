package Trees;

// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // BinaryTree tree = new BinaryTree();
        // tree.populate(sc);
        // tree.prettyDisplay();

        BST tree = new BST();
        int[] nums = {76, 50, 99, 44, 60, 30, 71, 37, 18,15, 25, 99, 79,85, 74, 96, 89, 93};
        tree.populate(nums);
        tree.display();
        System.out.println(tree.balanced());
    }   
}
