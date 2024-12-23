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
    int maxLongestZigZag = 0;

    public int longestZigZag(TreeNode root) {
        exploreZigZag(root.left, 1, true);
        exploreZigZag(root.right, 1, false);

        return maxLongestZigZag;
    }

    private void exploreZigZag(TreeNode node, int currentLength, boolean isLeftDirection) {
        if (node == null) {
            return;
        }

        maxLongestZigZag = Math.max(maxLongestZigZag, currentLength);

        if (isLeftDirection) {
            exploreZigZag(node.left, 1, true);
            exploreZigZag(node.right, currentLength + 1, false);
        } else {
            exploreZigZag(node.right, 1, false);
            exploreZigZag(node.left, currentLength + 1, true);
        }
    }
}