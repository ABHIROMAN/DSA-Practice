package GFG30days.Day28;

import java.util.*;

class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }

public class preOrderTraversal {
    
    static ArrayList<Integer> preorder(Node root) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Stack<Node> st = new Stack();
        
        st.push(root);
        
        while(!st.empty()) {
            
            Node temp = st.pop();
            ans.add(temp.data);
            
            if(temp.right != null) {
                st.push(temp.right);
            }
            if(temp.left != null) {
                st.push(temp.left);
            }
        }
        return ans;
    }

};
