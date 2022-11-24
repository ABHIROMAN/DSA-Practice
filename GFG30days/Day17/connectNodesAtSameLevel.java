package GFG30days.Day17;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node nextRight;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
        nextRight = null;
    }
}

public class connectNodesAtSameLevel {

    public void connect(Node root) {

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while(!queue.isEmpty()) {

            int size = queue.size();
            Node next = null;

            for(int i = 0; i < size; i++) {

                Node temp = queue.poll();

                temp.nextRight = next;
                next = temp;

                if(temp.right != null) {
                    queue.offer(temp.right);
                }

                if(temp.left != null) {
                    queue.offer(temp.left);
                }
            }
        }
    }
}