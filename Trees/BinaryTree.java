package Trees;

import java.util.Scanner;

public class BinaryTree {
    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    private Node root;

    public void populate(Scanner sc){
        System.out.println("enter the root node");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc,root);
    }

    private void populate(Scanner sc, Node node){
        System.out.println("do you want to enter in the left" + node.val);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the new left val");
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc, node.left);
        }

        System.out.println("do you want to enter in the right" + node.val);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the new left val");
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc, node.right);
        }
    }

    public void display(){
        display(root, " ");
    }

    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
}
