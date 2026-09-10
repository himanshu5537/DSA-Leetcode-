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

class Pair {
    TreeNode node;
    int row;
    int col;

    Pair(TreeNode node, int row, int col) {
        this.node = node;
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        // col -> list of (row, value)
        TreeMap<Integer, List<int[]>> map = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(root, 0, 0));

        while (!q.isEmpty()) {

            Pair temp = q.poll();

            int row = temp.row;
            int col = temp.col;
            int value = temp.node.val;

            // If column doesn't exist, create it
            map.putIfAbsent(col, new ArrayList<>());

            // Store row and value
            map.get(col).add(new int[]{row, value});

            // Left child
            if (temp.node.left != null) {
                q.offer(new Pair(
                    temp.node.left,
                    row + 1,
                    col - 1
                ));
            }

            // Right child
            if (temp.node.right != null) {
                q.offer(new Pair(
                    temp.node.right,
                    row + 1,
                    col + 1
                ));
            }
        }

        // Process every column
        for (List<int[]> list : map.values()) {

            // Sort by:
            // 1. row
            // 2. value if row is same

            list.sort((a, b) -> {

                if (a[0] != b[0]) {
                    return a[0] - b[0];
                }

                return a[1] - b[1];
            });

            List<Integer> column = new ArrayList<>();

            for (int[] arr : list) {
                column.add(arr[1]);
            }

            ans.add(column);
        }

        return ans;
    }
}