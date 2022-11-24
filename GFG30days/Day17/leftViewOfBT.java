package GFG30days.Day17;

import java.util.*;

class Node {

    int data;
    Node left , right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class leftViewOfBT {
    
    ArrayList<Integer> leftView(Node root) {

        Queue<Node> q = new LinkedList<>();

        ArrayList<Integer> res = new ArrayList<>();

        if(root == null) return res;

        q.add(root);

        while(q.size() > 0) {

            int num = q.size();

            for(int i  = 1; i <= num; i++) {

                Node n = q.poll();

                if(i == 1) {
                    res.add(n.data);
                }

                if(n.left != null) {
                    q.add(n.left);
                }

                if(n.right != null) {
                    q.add(n.right);
                }
            }
        }
        return res;
    }
}
