package GFG30days.Day17;

public class countLeavewsMethod1 {
    
    int countLeaves(Node node) {
         
        if(node == null) return 0;
        
        if(node.left == null && node.right == null) return 1;
        
        return countLeaves(node.left) + countLeaves(node.right);
   }
}
