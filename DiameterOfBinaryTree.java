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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        getDepth(root);
        
        return diameter;
    }
    
    public int getDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        
        diameter = Math.max(diameter, leftDepth + rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }
        
//     public int diameterOfBinaryTree(TreeNode root) {
//         if (root == null) return 0;
//         int left = getDepth(root.left);
//         int right = getDepth(root.right);
//         diameterOfBinaryTree(root.right);
//         diameterOfBinaryTree(root.left);
        
//         diameter = Math.max(left + right, diameter);
        
        
//         return diameter;
//     }
    
//     public int getDepth(TreeNode root) {
//         if (root == null) return 0;
//         int leftDepth = 1 + getDepth(root.left);
//         int rightDepth = 1 + getDepth(root.right);
//         return Math.max(leftDepth, rightDepth);
//     }
}
