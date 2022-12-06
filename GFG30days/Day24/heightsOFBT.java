package GFG30days.Day24;

class Node {

    int data;
    Node left, right;

    Node(int item) {

        data = item;
        left = right = null;
    }
}

public class heightsOFBT {

    int height(Node node) {

        if(node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
    
}
