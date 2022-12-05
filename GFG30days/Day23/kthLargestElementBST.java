package GFG30days.Day23;

public class kthLargestElementBST {
    
    int i = 0;
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K) {
        //Your code here
        
        if(root == null) return -1;
        
        int a = kthLargest(root.right, K);
        
        if(i == K) return a;
        i++;
        
        if(i == K) return root.data;
        
        int b = kthLargest(root.left, K);
        
        if(i == K) return b;
        
        return -1;
    }
}
