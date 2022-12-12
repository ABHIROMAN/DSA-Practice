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

public class inOrderTraversalRecur {
    
    ArrayList<Integer> inOrder(Node root) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(root == null) return arr;

        inOrder(root, arr);
        return arr;
    }

    public void inOrder(Node root, ArrayList<Integer> arr) {

        if(root == null) return;
        inOrder(root.left, arr);
        arr.add(root.data);
        inOrder(root.right, arr);
    }

}
