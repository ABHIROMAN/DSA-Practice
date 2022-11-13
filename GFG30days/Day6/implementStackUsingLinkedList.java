package GFG30days.Day6;


public  class implementStackUsingLinkedList {

    class StackNode {
        int data;
        StackNode next;
    
        StackNode(int a) {
            data = a;
            next = null;
        }}
    
    StackNode top;

    void push(int a) {
        StackNode n = new StackNode(a);
        if(top == null) {
            top = n;
            return;
        }
        n.next = top;
        top = n;
    }

    int pop() {

        if(top != null) {

            int deletedValue = top.data;
            top = top.next;
            return deletedValue;
        }
        else {
            return -1;
        }
    }
}
