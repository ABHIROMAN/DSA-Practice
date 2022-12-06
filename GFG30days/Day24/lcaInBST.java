package GFG30days.Day24;

class Node {

    int data;
    Node left, right;
    Node(int data) {

        this.data = data;
        left = null;
        right = null;
    }
}

public class lcaInBST {
    
    Node LCA(Node root, int n1, int n2) {
        
        if(root == null) return null;
        
        //check n1 and n2 are in left subtree
        if(root.data > n1 && root.data > n2) {
            return LCA(root.left, n1, n2);
        }
        //check n1 and n2 are in right subtree
        if(root.data < n1 && root.data < n2) {
            return LCA(root.right, n1, n2);
        }
        //else prsent node will be the LCA
        return root;
    }
}
