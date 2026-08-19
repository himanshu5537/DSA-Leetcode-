class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        q.offer(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {

            int size = q.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();

                list.add(temp.val);

                if (temp.left != null) {
                    q.offer(temp.left);
                }

                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }

            if (!leftToRight) {
                Collections.reverse(list);
            }

            ans.add(list);
            leftToRight = !leftToRight;
        }

        return ans;
    }
}