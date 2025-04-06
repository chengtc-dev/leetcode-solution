class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = prices[0];

        for (int price : prices) {
            maxProfit = Math.max(maxProfit, price - buyPrice);
            buyPrice = Math.min(buyPrice, price);
        }

        return maxProfit;
    }
}