class Solution {

    public int checksum(TreeNode root, long target) {

        if (root == null) {
            return 0;
        }

        int count = 0;

        // Current node itself completes the path
        if (root.val == target) {
            count++;
        }

        // Continue the path
        count += checksum(root.left, target - root.val);
        count += checksum(root.right, target - root.val);

        return count;
    }

    public int pathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return 0;
        }

        // Start a path from this node
        int count = checksum(root, targetSum);

        // Try starting from every node
        count += pathSum(root.left, targetSum);
        count += pathSum(root.right, targetSum);

        return count;
    }
}