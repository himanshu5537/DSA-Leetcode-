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
       if(root==null) return 0;
       int count=0;
       Queue<TreeNode> q=new LinkedList<>();
       q.offer(root);
       while(!q.isEmpty()){
        int size=q.size();
        count++;
        for(int i=0;i<size;i++){
            TreeNode temp=q.poll();
            if(temp.left==null && temp.right==null){
                return count;
            }
            if(temp.left!=null) q.offer(temp.left);
            if(temp.right!=null) q.offer(temp.right);
        }
       }
       return 0;
    }
}