package GFG30days.Day7;

class Node {

    int value;
    Node next;
    Node(int value) { 
        this.value = value;
    }
}
public class reverseALinkedList {

    Node reverseList(Node head) {

        Node prev = null;
        Node next = null;
        Node curr = head;

        while(curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    
}
