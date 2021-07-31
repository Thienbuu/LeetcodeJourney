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
    //Recursion
    // public TreeNode invertTree(TreeNode root) {
    //     if (root == null) return null;
    //     TreeNode left = root.left;
    //     TreeNode right = root.right;
    //     root.left = invertTree(right);
    //     root.right = invertTree(left);
    //     return root;
    // }
    
    //Iteration DFS
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        Stack<TreeNode> nodes = new Stack<TreeNode>();
        nodes.push(root);
        while (!nodes.empty()) {
            TreeNode node = nodes.pop();
            TreeNode left = node.left;
            
            node.left = node.right;
            node.right = left;

            if (node.right != null) nodes.push(node.right);
            if (node.left != null) nodes.push(node.left);
        }
        return root;
    }
}
