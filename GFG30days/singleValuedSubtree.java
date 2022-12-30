package GFG30days;


class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class singleValuedSubtree {
    
    int count;
    public int singlevalued(Node root) {
        //code here
        count = 0;
        isSingleValued(root);
        return count;
    }
    
    public boolean isSingleValued(Node root) {
        if(root == null) return true;
        
        if(root.left == null && root.right == null) {
            count++;
            return true;
        }
        
        boolean left = isSingleValued(root.left);
        boolean right = isSingleValued(root.right);
        
        if (left && right) {
        if (root.left != null && root.data != root.left.data) {
            return false;
        }
        if (root.right != null && root.data != root.right.data) {
            return false;
        }
        
        count++;
        return true;
        }
        return false;
    }
}
