package GFG30days;

class Node{
    int data;
    Node left,right;
    Node(int d){
    	data=d;
    	left=null;
    	right=null;
    }
}

public class transformToSumTree {
    
    public int toSumTreeUtil(Node node) {
        
        if(node == null) return 0;
        
        int old_val = node.data;
        
        node.data = toSumTreeUtil(node.left) + toSumTreeUtil(node.right);
        
        return node.data + old_val;
    }
    
    public void toSumTree(Node root){
         //add code here.
         toSumTreeUtil(root);
    }
}
