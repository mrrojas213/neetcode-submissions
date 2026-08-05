class Solution {
    public int maxProfit(int[] prices) {
        int left = prices[0], max = 0;

        for(int right = 1; right < prices.length; right++){
            int profit = prices[right] - left;

            max = Math.max(max, profit);
            left = Math.min(left, prices[right]);
        }

        return max;
    }
}
