class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int left = 1, right = 1;
        int[] ans = new int[len];

        for (int i = 0; i < len; i++) {
            ans[i] = 1;
            ans[i] *= left;
            left *= nums[i];
        }

        for (int i = len - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= nums[i];
        }

        return ans;
    }
}