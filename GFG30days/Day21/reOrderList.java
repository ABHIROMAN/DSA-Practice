package GFG30days.Day21;

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class reOrderList {
    
    Node reorderlist(Node head) {
        // Your code here
        int n=0;

        Node curr=head;

        while(curr!=null){

            curr=curr.next;

            n++;

        }

        int half=(n+1)/2;

        curr=head;

        for(int i=0;i<half-1;i++){

            curr=curr.next;

        }

 

        // reverse second half

        Node temp=curr;

        curr=curr.next;

        temp.next=null;

        

        Node prev=null;

        while(curr!=null){

            Node next=curr.next;

            curr.next=prev;

            prev=curr;

            curr=next;

        }

 

        //creating new List by combining 2 halfs

        Node newHead=prev;

        curr=head;

        while(curr!=null && newHead!=null){

            Node next=curr.next;

            curr.next=newHead;

            curr=curr.next;

            newHead=next;

        }

        return head;
    }
}
