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
    int idx;
    public int search(int[] inorder,int rootvalue){
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==rootvalue) return i;
        }
        return -1;
    }
    public TreeNode build(int start,int end, int[] inorder,int[] postorder){
            if(start>end || end<start ) return null;
            int rootvalue=postorder[idx--];
            TreeNode root=new TreeNode(rootvalue);
            int i=search(inorder,rootvalue);
            root.right=build(i+1,end,inorder,postorder);
             root.left=build(start,i-1,inorder,postorder);
            return root;
    }
     public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx=postorder.length-1;
        return build(0,inorder.length-1,inorder,postorder);
    }
}