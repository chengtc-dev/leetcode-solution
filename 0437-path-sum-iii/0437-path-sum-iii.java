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
public class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        int pathsFromRoot = countPathsFromNode(root, targetSum, 0);

        int pathsFromLeft = pathSum(root.left, targetSum);
        int pathsFromRight = pathSum(root.right, targetSum);

        return pathsFromRoot + pathsFromLeft + pathsFromRight;
    }

    private int countPathsFromNode(TreeNode node, int targetSum, long currentSum) {
        if (node == null) {
            return 0;
        }

        int count = 0;
        currentSum += node.val;
        if (currentSum == targetSum) {
            count++;
        }

        count += countPathsFromNode(node.left, targetSum, currentSum);
        count += countPathsFromNode(node.right, targetSum, currentSum);

        return count;
    }
}