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
    public void checksum( List<List<Integer>> ans,List<Integer> list,TreeNode root,int target){
        if(target==0 && (root.left==null && root.right==null)){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(root.left!=null){
            list.add(root.left.val);
            checksum(ans,list,root.left,target-root.left.val);
            list.remove(list.size() - 1);
        }
        if(root.right!=null){
            list.add(root.right.val);
            checksum(ans,list,root.right,target-root.right.val);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
         List<List<Integer>> ans=new ArrayList<>();
         List<Integer> list=new ArrayList<>();
         if(root==null) return ans;
         int target=targetSum-root.val;
         list.add(root.val);
         checksum(ans,list,root,target);
         return ans;
    }
}