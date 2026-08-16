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
    public static int height(TreeNode root){
    if(root == null){
        return 0;
    }
    return 1 + Math.max(height(root.left), height(root.right));
}
    public static void level(TreeNode root,List<Integer>list,List<List<Integer>>ans,int n){
         if(root==null){
            return;
         }
         if(n==1){
            list.add(root.val);
            return;
         }
         level(root.left,list,ans,n-1);
         level(root.right,list,ans,n-1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        int n=height(root);
        for(int i=1;i<=n;i++){
        List<Integer>list=new ArrayList<>();
        level(root,list,ans,i);
        ans.add(list);
        }
        return ans;
    }
}