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
    public int goodNodes(TreeNode root) {
        return countGoodNodes(root, root.val);
    }

    private int countGoodNodes(TreeNode node, int maxSoFar) {
        if (node == null) {
            return 0;
        }

        int count = 0;

        if (maxSoFar <= node.val) {
            maxSoFar = node.val;
            count++;
        }

        count += countGoodNodes(node.left, maxSoFar);
        count += countGoodNodes(node.right, maxSoFar);
        
        return count;
    }
}