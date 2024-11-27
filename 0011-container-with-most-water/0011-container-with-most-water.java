class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            if (height[left] < height[right]) {
                ans = Math.max(ans, (right - left) * height[left++]);
            } else {
                ans = Math.max(ans, (right - left) * height[right--]);
            }
        }

        return ans;
    }
}