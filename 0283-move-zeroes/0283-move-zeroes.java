class Solution {
    public void moveZeroes(int[] nums) {
        for (int left = 0, right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int tmp = nums[right];
                nums[right] = nums[left];
                nums[left] = tmp;
                left++;
            }
        }
    }
}