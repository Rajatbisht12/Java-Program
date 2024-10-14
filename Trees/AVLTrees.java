class AVLTrees {
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

    public AVLTrees(){}
  
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
      return rotate(node);
    }
    
    private Node rotate(Node node){
      if(height(node.left) - height(node.right) > 1){
        // Left heavy
        if(height(node.left.left) - height(node.left.right) > 0){
          // Left Left Case
          return rightRotate(node);
        }
        if(height(node.left.left) - height(node.left.right) < 0){
          // Left Left Case
          node.left = leftRotate(node);
          return rightRotate(node);
        }
      }

      if(height(node.left) - height(node.right) < -1){
        // Right heavy
        if(height(node.left.left) - height(node.left.right) < 0){
          // Right Right Case
          return leftRotate(node);
        }
        if(height(node.left.left) - height(node.left.right) > 0){
          // Left Left Case
          node.right = rightRotate(node);
          return leftRotate(node);
        }
      }
      
      return node;
    }

    private Node rightRotate(Node p){
      Node c = p.left;
      Node t = c.right;

      c.right = p;
      p.left = t;

      p.height = Math.max(height(p.left), height(p.right)+1);
      c.height = Math.max(height(c.left), height(c.right)+1);

      return c;
    }

    private Node leftRotate(Node c){
      Node p = c.right;
      Node t = p.left;

      p.left = c;
      c.right = t;
      
      p.height = Math.max(height(p.left), height(p.right)+1);
      c.height = Math.max(height(c.left), height(c.right)+1);
      return p;
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