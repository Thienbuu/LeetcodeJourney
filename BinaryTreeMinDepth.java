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
    public int minDepth(TreeNode root) {
        //Recursion DFS
        // if (root == null) return 0;
        // int left = minDepth(root.left);
        // int right = minDepth(root.right);   
        // if (left == 0 || right == 0) return 1 + Math.max(right, left);
        // return 1 + Math.min(left, right);
        //Iteration BFS
        return minDepthBFS(root);
    } 
    
    public int minDepthBFS(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        int level = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                //if current Node is leaf
                if (head.left == null && head.right == null) return level;
                if (head.left != null) queue.offer(head.left);
                if (head.right != null) queue.offer(head.right);
            }
            level++;
        }
        return level;
    }
    
}
