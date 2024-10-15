package Trees;

public class SegmentTrees {
   private class Node{
     int data;
     int start;
     int end;
     Node left;
     Node right;

     public Node(int start, int end){
       this.start = start;
       this.end = end;
     }
   }
  Node root;

  public SegmentTrees(int[] arr){
    // creaete a tree using this array

    this.root = constructTree(arr, 0, arr.length-1);
  }

  private Node constructTree(int[] arr, int start, int end){
    if(start == end){
      Node leaf = new Node(start, end);
      leaf.data = arr[start];

      return leaf;
    }
    Node node = new Node(start, end);
    int mid = (start + end)/2;

    node.left = this.constructTree(arr, start, mid);
    node.right = this.constructTree(arr, mid+1, end);
    
    node.data = node.left.data + node.right.data;
    return node;
  }

  public void display(){
    display(this.root);
  }

  private void display(Node node){
    String str = "";
    if(node.left != null){
      str += "Interval=["+ node.left.start + "-" + node.left.end + "] and data: " + node.left.data + "+ ->";
    }else{
      str += "No left child";
    }

    str += "Interval=["+ node.start + "-" + node.end + "] and data: " + node.data + "+ ->";
  
      if(node.right != null){
        str += "Interval=["+ node.right.start + "-" + node.right.end + "] and data: " + node.right.data + "+ ->";
      }else{
        str += "No right child";
      }

    System.out.println(str);

    if(node.left != null){
      display(node.left);
    }

    if(node.right != null){
      display(node.right);
    }
  }

  public int query(int qsi, int qei){
    return this.query(this.root, qsi, qei);
  }

  private int query(Node node, int qsi, int qei){
    if(node.start >= qsi && node.end <= qei){
      // Node is completely lying inside the query interval
      return node.data;
    }else if(node.start > qei || node.end > qsi){
      return 0;
    }else{
      return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
    }
  }

  public void update(int index, int value){
    this.root.data = update(this.root, index, value);
  }
  private int update(Node node, int ind, int val){
    if(ind >= node.start && ind <= node.end){
      if(ind == node.start && ind == node.end){
        node.data = val;
        return node.data;
      }else{
        int leftAns = this.update(node.left, ind, val);
        int rightAns = this.update(node.right, ind, val);

        node.data = leftAns + rightAns;
        return node.data;
      }
    }
    return node.data;
  }
}