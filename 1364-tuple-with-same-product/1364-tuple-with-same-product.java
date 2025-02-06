class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> countProduct = new HashMap<>();
        int totalNumber = 0, n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                int count = countProduct.getOrDefault(product, 0);
                totalNumber += count * 8;
                countProduct.put(product, count + 1);
            }
        }

        return totalNumber;
    }
}