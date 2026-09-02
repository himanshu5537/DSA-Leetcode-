class Solution {
    int ans = 0;

    public int dfs(TreeNode root) {
        if (root == null)
            return 0;

        int left = dfs(root.left);
        int right = dfs(root.right);

        int lh = 0;
        int rh = 0;

        if (root.left != null && root.left.val == root.val) {
            lh = left;
        }

        if (root.right != null && root.right.val == root.val) {
            rh = right;
        }

        ans = Math.max(ans, lh + rh);

        return 1 + Math.max(lh, rh);
    }

    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return ans;
    }
}