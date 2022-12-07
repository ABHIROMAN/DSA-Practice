package GFG30days.Day25;

class Node {

    int data;
    Node left, right;

    public Node(int d) {

        data = d;
        left = right = null;
    }
}

public class kthSmallestElementInBST {
    
    public int KthSmallestElement(Node root, int K) {

        if(K <= 0) return -1;

        int cnt = 0;
        Node curr = root;

        while(curr != null) {
            if(curr.left == null) {
                cnt++;
                if(cnt == K) return curr.data;
                curr = curr.right;
            }
            else {
                Node prev = curr.left;
                while(prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }
                if(prev.right == null) {
                    prev.right = curr;
                    curr = curr.left;
                } else {
                    cnt++;
                    if(cnt == K) return curr.data;
                    prev.right = null;
                    curr = curr.right;
                }
            }
        }
        return -1;
    }
}
