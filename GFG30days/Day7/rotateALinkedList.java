package GFG30days.Day7;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class rotateALinkedList {

    public Node rotate(Node head, int k) {

        Node curr = head;
        Node prev = head;
        Node last = head;

        for(int i = 0; i < k; i++) {
            curr = curr.next;
        }
        if(curr == null) {
            return head;
        }
        for(int i = 0; i < k - 1; i++) {
            prev = prev.next;
        }

        while(last.next != null) {
            last = last.next;
        }
        
        last.next = head;
        prev.next = null;

        return curr;

    }
    
}
