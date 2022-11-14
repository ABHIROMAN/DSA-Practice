package GFG30days.Day7;

class Node {

    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class removeLoopInLinkedList {
    
    public static void removeLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                slow = head;
                while(slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                while(fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
    }
}
