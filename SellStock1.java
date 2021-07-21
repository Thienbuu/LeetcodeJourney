class Solution {
    public int maxProfit(int[] prices) {
        int bought = prices[0];
        int best = 0;
        for (int i = 0; i < prices.length; i++) {
            if (bought > prices[i]) bought = prices[i];
            else best = Math.max(best, prices[i] - bought);
        }
        
        return best;
    }
}
