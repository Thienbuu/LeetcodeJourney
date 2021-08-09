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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int result = 0;
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        nodes.push(root);
        while (!nodes.empty()) {
            TreeNode node = nodes.pop();
            TreeNode left = node.left;
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) {
                    result += left.val;
                }
                else nodes.push(node.left);
            }
            if (node.right != null) nodes.push(node.right);            
        }
        return result;
    }
    
    // public int sumOfLeftLeaves(TreeNode root) {
    //     if (root == null) return 0;
    //     int result = 0;
    //     if (root.left != null) {
    //         if (root.left.left == null && root.left.right == null) result += root.left.val;
    //         else result += sumOfLeftLeaves(root.left);
    //     }
    //     if (root.right != null) result += sumOfLeftLeaves(root.right);
    //     return result;
    // }
}
