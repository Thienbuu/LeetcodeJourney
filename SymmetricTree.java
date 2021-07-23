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
    public boolean isSymmetric(TreeNode root) {
        //recursion
        // return isSymmetric(root.left, root.right);
        //DFS iteration
        // return isMirror_DFS(root);
        //BFS iteration
        return isMirror_BFS(root);
    }
    
    //Recursion
    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
    
    //Depth first search iteration
    private boolean isMirror_DFS(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        if (root.left == null && root.right != null) return false;
        if (root.left != null && root.right == null) return false;
        Stack<TreeNode> childNodes = new Stack<TreeNode>();   
        
        childNodes.push(root.right);
        childNodes.push(root.left);
        
        while (childNodes.size() > 0) {
            TreeNode left = childNodes.pop();
            TreeNode right = childNodes.pop();
            if (left.val != right.val) return false;
            
            if (left.left != null) {
                if (right.right == null) return false;
                childNodes.push(right.right);
                childNodes.push(left.left);
            }
            else {
                if (right.right != null) return false;
            }
          
            
            if (left.right != null) {
                if (right.left == null) return false;
                childNodes.push(right.left);
                childNodes.push(left.right);
            }
            else {
                if (right.left != null) return false;
            }
        }
        return true;
    }
    
    //Breadth first search iteration
    private boolean isMirror_BFS(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        if (root.left == null && root.right != null) return false;
        if (root.left != null && root.right == null) return false;
        Queue<TreeNode> childNodes = new LinkedList<TreeNode>();   
        
        childNodes.add(root.left);
        childNodes.add(root.right);
        
        while (childNodes.size() > 0) {
            TreeNode left = childNodes.poll();
            TreeNode right = childNodes.poll();
            if (left.val != right.val) return false;
            
            if (left.left != null) {
                if (right.right == null) return false;
                childNodes.add(left.left);
                childNodes.add(right.right);
            }
            else {
                if (right.right != null) return false;
            }
          
            
            if (left.right != null) {
                if (right.left == null) return false;
                childNodes.add(left.right);
                childNodes.add(right.left);
            }
            else {
                if (right.left != null) return false;
            }
        }
        return true;
    }
}
