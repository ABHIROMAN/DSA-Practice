package GFG30days.Day23;

public class symmetricTree {
    
    static boolean isSafe(Node node1, Node node2) {
        
        if(node1 == null && node2 == null) return true;
        
        if(node1 == null || node2 == null) return false;
        
        if(node1.data != node2.data) {
            
            return false;
        }
        
        return isSafe(node1.left, node2.right) && isSafe(node1.right, node2.left);
    }
    
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root) {
        
        if(root == null) return true;
        
        return isSafe(root.left, root.right);
    }
}
