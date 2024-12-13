/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        List<Integer> nums = new ArrayList<>();

        for (ListNode node = head; node != null; node = node.next) {
            nums.add(node.val);
        }

        int maxSum = 0;
        int n = nums.size();

        for (int i = 0; i < n / 2; i++) {
            maxSum = Math.max(maxSum, nums.get(i) + nums.get(n - 1 - i));
        }

        return maxSum;
    }
}