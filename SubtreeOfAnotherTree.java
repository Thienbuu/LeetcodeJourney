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
    //Iteration
//     public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//         if (root == null || subRoot == null) return false;
//         TreeNode tempSubRoot = subRoot;
//         TreeNode tempRoot = root;
        
//         boolean foundRoot = false;
//         Stack<TreeNode> nodes = new Stack<TreeNode>();
//         Stack<TreeNode> subNodes = new Stack<TreeNode>();
        
//         nodes.push(root);
//         subNodes.push(subRoot);
//         while (!nodes.empty() && !subNodes.empty()) {
//             TreeNode node = nodes.pop();
//             TreeNode subNode = subNodes.peek();
//             // System.out.printf("node: %d, subNode: %d\n", node.val, subNode.val);
//             if (isEqualNodes(node, subNode)) {
//                 if (!foundRoot) foundRoot = !foundRoot;
//                 subNodes.pop();
//                 tempRoot = node;
//                 if (subNode.right != null) subNodes.push(subNode.right);
//                 if (subNode.left != null) subNodes.push(subNode.left);                
//             } 
//             else if (!isEqualNodes(node, subNode) && foundRoot) {
//                 foundRoot = !foundRoot;
//                 subRoot = tempSubRoot;
//                 subNodes.clear();
//                 subNodes.push(subRoot);
                
//                 node = tempRoot;
//             }                    
            
//             if (node.right != null) nodes.push(node.right);
//             if (node.left != null) nodes.push(node.left);
//         }
//         return subNodes.empty() == true;
//     }
    
    //Recursion
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (isEqualNodes(root, subRoot)) return true;
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    //Compare 2 nodes
    private boolean isEqualNodes(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;
        if (node1.val != node2.val) return false;
        
        return isEqualNodes(node1.left, node2.left) && isEqualNodes(node1.right, node2.right);
        
    }
}
