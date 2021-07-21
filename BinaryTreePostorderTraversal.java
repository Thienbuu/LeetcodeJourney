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
    public List<Integer> postorderTraversal(TreeNode root) {
        //Recursion
        // return postOrderTraversalRecursion(root, new LinkedList<Integer>());
        //Iteration
        return postOrderTraversalIteration(root);
    }
    
    //Recursion
    public List<Integer> postOrderTraversalRecursion(TreeNode root, List<Integer> result) {
        if (root == null) return result;
        postOrderTraversalRecursion(root.left, result);
        postOrderTraversalRecursion(root.right, result);
        result.add(root.val);
        return result;
    }
    
    //Iteration
    public List<Integer> postOrderTraversalIteration(TreeNode root) {
        if (root == null) return new LinkedList<Integer>();
        
        LinkedList<Integer> result = new LinkedList<Integer>();
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        nodes.add(root);
        
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.pop();
            result.addFirst(node.val);
            if (node.left != null) nodes.add(node.left);
            if (node.right != null) nodes.add(node.right);
        }
        return result;
    }
}
