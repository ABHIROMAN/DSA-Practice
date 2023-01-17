package GFG30days;

class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}

public class findTheFirstNode {
    
    public static int findFirstNode(Node head){
        //code here
        Node slow = head;
        Node fast = head;
        Node temp = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) {
                while(slow != temp) {
                    slow = slow.next;
                    temp = temp.next;
                }
                return temp.data;
            }
        }
        return -1;
    }
}
