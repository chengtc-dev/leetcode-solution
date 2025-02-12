class Solution {
    public int maximumSum(int[] nums) {
        int result = -1;
        int[] digitMapping = new int[82]; // 1 <= digit <= 10^9

        for (int num : nums) {
            int digitSum = 0;
            for (int tmpNum = num; tmpNum != 0; tmpNum /= 10) {
                digitSum += tmpNum % 10;
            }

            if (digitMapping[digitSum] > 0) {
                result = Math.max(result, digitMapping[digitSum] + num);
            }

            digitMapping[digitSum] = Math.max(digitMapping[digitSum], num);
        }

        return result;
    }
}