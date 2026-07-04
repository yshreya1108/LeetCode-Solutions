class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int mProfit = 0;
        int n = prices.length;
        for (int i = 1 ; i<n ; i++) {
            int cost = prices[i] - mini;
            mProfit = Math.max(mProfit, cost);
            mini = Math.min(mini, prices[i]);

        }
        return mProfit;
    }
}