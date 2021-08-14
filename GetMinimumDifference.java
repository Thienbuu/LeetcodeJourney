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
    int min = Integer.MAX_VALUE;
    Integer prev = null;
    //O(n)
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;
        
        getMinimumDifference(root.left);
        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        getMinimumDifference(root.right);
        return min;
    }
    
    //O(2n)
//     public int getMinimumDifference(TreeNode root) {
//         Stack<TreeNode> nodes = new Stack<TreeNode>();
//         ArrayList<Integer> vals = new ArrayList<Integer>();
//         nodes.push(root);
//         while (!nodes.empty()) {
//             TreeNode node = nodes.pop();
//             vals.add(node.val);
//             if (node.left != null) nodes.push(node.left);            
//             if (node.right != null) nodes.push(node.right);
//         }

//         Collections.sort(vals);
//         for (int i = 1; i < vals.size(); i++) {
//             min = Math.min(min, vals.get(i) - vals.get(i-1));
//         }
        
//         return min;
//     }
}
