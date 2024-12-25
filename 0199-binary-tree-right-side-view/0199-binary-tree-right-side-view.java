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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> view = new ArrayList<>();

        findRightSideView(root, 0, view);

        return view;
    }

    private void findRightSideView(TreeNode node, int dept, List<Integer> view) {
        if (node == null) {
            return;
        }

        if (view.size() == dept) {
            view.add(node.val);
        }

        findRightSideView(node.right, dept + 1, view);
        findRightSideView(node.left, dept + 1, view);
    }
}