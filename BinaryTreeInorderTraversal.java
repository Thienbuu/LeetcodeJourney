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
    public List<Integer> inorderTraversal(TreeNode root) {
        //Recursion
        // return printNodes(root,  new LinkedList<Integer>());
        //Iteration
        return printNodes(root);
    }
    
    //Recursion
    public List<Integer> printNodes(TreeNode root, List<Integer> result) {
        if (root == null) return result;
        printNodes(root.left, result);
        result.add(root.val);
        printNodes(root.right, result);
        return result;       
    }
    
    //Iteration
    public List<Integer> printNodes(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        if (root == null) return result;
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        
        while (root != null || !nodes.isEmpty()) {
            //get left leaf
            while (root != null) {
                nodes.push(root);
                root = root.left;
            }
            root = nodes.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }
}
