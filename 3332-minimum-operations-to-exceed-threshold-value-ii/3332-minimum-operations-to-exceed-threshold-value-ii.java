class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue();

        for (int num : nums) {
            minHeap.add(Long.valueOf(num));
        }

        int operations = 0;

        while (minHeap.peek() < k) {
            Long x = minHeap.remove();
            Long y = minHeap.remove();
            minHeap.add(Math.min(x, y) * 2 + Math.max(x, y));
            operations++;
        }

        return operations;
    }
}