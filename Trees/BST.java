package Trees;

public class BST {
    class Node{
        int val;
        Node left;
        Node right;
        int height;
        
        public Node(int val){
            this.val = val;
        }

        public int getVal(){
            return val;
        }
    }

    private Node root;

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public void populate(int[] nums){
        for(int i = 0; i < nums.length; i++){
            this.insert(nums[i]);
        }
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root, "Root Node : ");
    }

    private void display(Node node, String string) {
        if(node == null){
            return;
        }

        System.out.println(string + node.getVal());

        display(node.left, "Left Child of "+node.getVal() + " is ");
        display(node.right, "Right child of " + node.getVal()+ " is ");
    }

    private Node insertNode(int val, Node node){
        if(node == null){
            node = new Node(val);
            return node;
        }
        if(val < node.val){
            node.left = insertNode(val, node.left);
        }
        if(val > node.val){
            node.right = insertNode(val, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)+1);
        return node;
    }

    public void insert(int val){
        root = insertNode(val, root);
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if(node == null) return true;
        return Math.abs(height(node.left)-height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
}
