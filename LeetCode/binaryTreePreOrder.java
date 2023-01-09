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

public class binaryTreePreOrder {
    
    private List<Integer> answer = new ArrayList<>();

    private void dfs(TreeNode node) {
        if(node == null) {
            return ;
        }
        answer.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }

    public List<Integer> preOrderTraversal(TreeNode root) {

        dfs(root);
        return answer;
    }
}
