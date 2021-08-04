/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    //Iteration
     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (p.val > q.val) {
            TreeNode temp = p;
            p = q;
            q = temp;
        }
        
        while (root != null) {
            if (root.val > p.val && root.val < q.val) return root;
            if (root.val == q.val || root.val == p.val) return root;
            if (root.val > q.val) root = root.left;
            else if (root.val < p.val) root = root.right; 
        } 
        
        return null;
    }
    
    //Recursion
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if (root == null) return null;
//         if (p.val > q.val) {
//             TreeNode temp = p;
//             p = q;
//             q = temp;
//         }
        
//         if (root.val > p.val && root.val < q.val) return root;
//         if (root.val == q.val || root.val == p.val) return root;
//         if (root.val > q.val) root = root.left;
//         else if (root.val < p.val) root = root.right; 
        
//         return lowestCommonAncestor(root, p, q);
//     }
}
