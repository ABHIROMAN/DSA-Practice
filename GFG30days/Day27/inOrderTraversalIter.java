package GFG30days.Day27;

import java.util.*;

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}

public class inOrderTraversalIter {

    ArrayList<Integer> inOrder(Node node) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Node> st = new Stack<Node>();

        while(st.size() > 0 || node != null) {
            while(node != null) {
                st.push(node);
                node = node.left;
            }
            node = st.pop();
            list.add(node.data);
            node = node.right;
        }

        return list;
    }
}
