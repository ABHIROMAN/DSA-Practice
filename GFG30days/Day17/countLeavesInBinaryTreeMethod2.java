package GFG30days.Day17;

import java.util.*;

class Node {

    int data;
    Node left, right;
}

public class countLeavesInBinaryTreeMethod2 {

    int countLeaves(Node node) {

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);

        int count = 0;

        while(!queue.isEmpty()) {

            Node temp = (Node)queue.peek();
            queue.remove();

            if(temp.left != null) {
                queue.add(temp.left);
            }

            if(temp.right != null) {
                queue.add(temp.right);
            }

            if(temp.left == null && temp.right == null) {
                count++;
            }
        }

        return count;

    }

}
