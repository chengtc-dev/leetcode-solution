class Solution {
    public int removeDuplicates(int[] nums) {
        int indexOfLastUniqueNum = 0;

        for (int num : nums) {
            if (nums[indexOfLastUniqueNum] != num) {
                indexOfLastUniqueNum++;
                nums[indexOfLastUniqueNum] = num;
            }
        }

        return indexOfLastUniqueNum + 1;
    }
}