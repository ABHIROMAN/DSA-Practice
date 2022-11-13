package GFG30days.Day6;

public class detectLoopInLinkedList {

    public static boolean detectLoop(Node head) {

        if(head == null || head.next == null || head.next.next == null) {
            return false;
        }

        Node slow = head.next;
        Node fast = head.next.next;

        while(slow != fast) {

            if(fast.next == null || fast.next.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    
}
