package GFG30days.Day24;

class Node {

    int data;
    Node left, right;
}

public class countLeavesInBT {
    
    int countLeaves(Node node) {

        if(node == null) return 0;

        if(node.left == null && node.right == null) return 1;

        return countLeaves(node.left) + countLeaves(node.right);
    }
}
