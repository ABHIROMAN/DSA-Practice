package GFG30days.Day6;

class Node {

    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
public class reverseALinkedListInGroups {

    public static Node reverse(Node node, int k) {

        if(node == null || node.next == null) {
            return node;
        }

        Node prev = null;
        Node curr = node;

        Node next = null;
        int c = k;

        while(curr != null) {
            if(k == 0) break;
            k--;
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node.next = reverse(curr, c);
        return prev;
    }
    
    }
    
}
