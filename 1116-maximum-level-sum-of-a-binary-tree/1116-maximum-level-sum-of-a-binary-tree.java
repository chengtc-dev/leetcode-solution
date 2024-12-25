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
    public int maxLevelSum(TreeNode root) {
        Map<Integer, Integer> sums = new HashMap<>();

        findMaxLevelSum(root, sums, 1);

        int maxKey = -1;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : sums.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }

    private void findMaxLevelSum(TreeNode node, Map<Integer, Integer> sums, int level) {
        if (node == null) {
            return;
        }

        sums.put(level, sums.getOrDefault(level, 0) + node.val);

        findMaxLevelSum(node.left, sums, level + 1);
        findMaxLevelSum(node.right, sums, level + 1);
    }
}