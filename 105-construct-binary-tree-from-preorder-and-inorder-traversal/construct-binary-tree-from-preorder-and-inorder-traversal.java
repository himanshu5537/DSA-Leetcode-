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
    int idx=0;
    public int search(int[] inorder,int rootvalue){
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==rootvalue) return i;
        }
        return -1;
    }
    public TreeNode build(int start,int end,int[] preorder, int[] inorder){
            if(start>end || end<start ) return null;
            int rootvalue=preorder[idx];
            TreeNode root=new TreeNode(rootvalue);
            int i=search(inorder,rootvalue);
            idx++;
            root.left=build(start,i-1,preorder,inorder);
            root.right=build(i+1,end,preorder,inorder);
            return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(0,preorder.length-1,preorder,inorder);
    }
}