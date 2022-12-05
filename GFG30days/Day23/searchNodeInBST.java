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
public class searchNodeInBST {
    
    boolean search(Node root, int x) {
        
        if(root == null) return false;
        
        if(root.data == x) return true;
        
        if(x < root.data) {
            
            return search(root.left, x);
        }
        
        else {
            return search(root.right, x);
        }
    }
}
