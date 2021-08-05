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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        Stack<TreeNode> nodeVals = new Stack<TreeNode>();
        
        nodes.push(root);
        while (!nodes.empty()) {
            TreeNode node = nodes.pop();
            
            //check if current node is child node of top node in nodeVals stack
            //if not, remove top node
            while (!nodeVals.empty() && nodeVals.peek().left != node && nodeVals.peek().right != node)
                nodeVals.pop();
            
            //node is leaf
            if (node.left == null && node.right == null) {
                String s = toString(nodeVals, node);
                result.add(s);
                continue;
            }
            nodeVals.push(node);
            
            if (node.right != null) nodes.push(node.right);
            if (node.left != null) nodes.push(node.left);
        }
        return result;
    }
    
    public String toString(Stack<TreeNode> nodes, TreeNode leaf) {
        StringBuilder s = new StringBuilder();
        if (nodes.empty()) return s.append(leaf.val).toString();
        for (TreeNode node : nodes) {
            s.append(node.val).append("->");
        }
        s.append(leaf.val);
        return s.toString();
    }
    
    
//     public List<String> binaryTreePaths(TreeNode root) {
//         List<String> result = new ArrayList<String>();
//         Stack<TreeNode> nodes = new Stack<TreeNode>();
//         Stack<String> nodePaths = new Stack<String>();
        
//         nodes.push(root);
//         nodePaths.push(root.val + "");
        
//         while (!nodes.empty()) {
//             TreeNode node = nodes.pop();
//             StringBuilder s = new StringBuilder(nodePaths.pop());
            
//             //node is leaf
//             if (node.left == null && node.right == null) {
//                 result.add(s.toString());
//                 continue;
//             }
            
//             int length = s.length();
//             if (node.right != null) {
//                 nodePaths.push(s.append("->").append(node.right.val).toString());
//                 nodes.push(node.right);
//             }

//             s.setLength(length);
//             if (node.left != null) {
//                 nodePaths.push(s.append("->").append(node.left.val).toString());
//                 nodes.push(node.left);
//             }

//         }
//         return result;
//     }
}
