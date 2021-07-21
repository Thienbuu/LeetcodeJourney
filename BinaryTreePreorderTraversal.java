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
    public List<Integer> preorderTraversal(TreeNode root) {
        //Iteration way
        // return preorderTraversalInteration(root);
        //Recursion
        return preorderTraversal(root, new LinkedList<Integer>());
    }
    
    //Recursion
    public List<Integer> preorderTraversal(TreeNode root, List<Integer> result) {
        if (root == null) return result;
        result.add(root.val);
        preorderTraversal(root.left, result);
        preorderTraversal(root.right, result);
        return result;
    }
    
    //Iteration
    public List<Integer> preorderTraversalInteration(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        if (root == null) return result;
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        nodes.push(root);
        
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.pop();
            result.add(node.val);
            if (node.right != null) nodes.push(node.right);
            if (node.left != null) nodes.push(node.left);
        }
        return result;
        
    }
}
