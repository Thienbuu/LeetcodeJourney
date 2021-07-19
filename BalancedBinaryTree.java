/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        
        int left = getDiffDepth(root.left, 0);
        int right = getDiffDepth(root.right, 0);
        //sub tree is not balanced
        if (left == -1 || right == -1) return false;
        return Math.abs(left - right) <= 1 ? true : false;
    }
    
    public int getDiffDepth(TreeNode root, int depth) {
        if (root == null) return depth;
        int left = getDiffDepth(root.left, depth + 1);
        int right = getDiffDepth(root.right, depth + 1);
        //if subtree is not balanced, return -1 as invalid
        if (Math.abs(left - right) > 1) return -1;
        //return max depth of sub tree
        return Math.max(left, right);
    }

}
