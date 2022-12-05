package GFG30days.Day23;

class Node {
    int data;
    Node left;
    Node right;
    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class checkForBST {
    
    Node prev = null;
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        
        if(root == null) return true;
        
        if(!isBST(root.left)) return false;
        
        if(prev != null && prev.data > root.data) return false;
        
        prev = root;
        
        return isBST(root.right);
    }
}
