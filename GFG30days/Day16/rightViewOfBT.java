package GFG30days.Day16;

import java.util.*;

class Node {

    int data;
    Node left, right;

    public Node(int data) {

        this.data = data;
        left = right = null;
    }
}

public class rightViewOfBT {
    
    ArrayList<Integer> rightView(Node node) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        
        if(node == null) return ans;
        
        q.add(node);
        
        while(!q.isEmpty()) {
            
            int size = q.size();
            for(int i = 0; i < size; i++) {
                
                Node curr = q.poll();
                
                if(i == size-1) {
                    ans.add(curr.data);
                }
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        return ans;
    }
}
