package GFG30days;

class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

public class largestSubtreeSum {
    
    static int ans = Integer.MIN_VALUE;
    
    public static int isSafe(Node root) {
        
        if(root == null) return 0;
        int a = isSafe(root.left);
        int b = isSafe(root.right);
        
        ans = Math.max(root.data + a + b, ans);
        
        return root.data+a+b;
    }
    public static int findLargestSubtreeSum(Node root) {
        // code here
        ans = Integer.MIN_VALUE;
        isSafe(root);
        
        return ans;
    }

}
