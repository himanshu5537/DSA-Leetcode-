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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root==p) return p;
        if(root==q) return q;
        TreeNode left_lca=lowestCommonAncestor(root.left,p,q);
        TreeNode right_lca=lowestCommonAncestor(root.right,p,q);
        if(left_lca!=null && right_lca!=null) return root;
        else if(left_lca!=null){
            return left_lca;
        }
        else{
            return right_lca;
        }
    }
}