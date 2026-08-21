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
    public int min_height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            return 1;
        }

        // Only right child exists
        if (root.left == null) {
            return 1 + min_height(root.right);
        }

        // Only left child exists
        if (root.right == null) {
            return 1 + min_height(root.left);
        }

        // Both children exist
        return 1 + Math.min(
            min_height(root.left),
            min_height(root.right)
        );
    }

    public int minDepth(TreeNode root) {
        return min_height(root);
    }
}