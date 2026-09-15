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
    public void findpath(List<String> list, String path,TreeNode root){
        if(root.left==null && root.right==null) {
            list.add(path);
            return;
        }
        if(root.left!=null){
            findpath(list,path+"->"+Integer.toString(root.left.val),root.left);
        }
        if(root.right!=null){
            findpath(list,path+"->"+Integer.toString(root.right.val),root.right);
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        String path=Integer.toString(root.val);
        if(root==null){
            return list;
        }
        findpath(list,path,root);
        return list;
    }
}