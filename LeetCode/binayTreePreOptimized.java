package LeetCode;

import java.util.*;

class TreeNode {
    int val; 
    TreeNode left, right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class binayTreePreOptimized {

    public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> answer = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    stack.add(root);

    while(!stack.isEmpty()) {
        TreeNode currNode = stack.peek();
        stack.pop();

        if(currNode != null) {
            answer.add(currNode.val);
            stack.add(currNode.right);
            stack.add(currNode.left);
        }
    }
    return answer;
    }
}
