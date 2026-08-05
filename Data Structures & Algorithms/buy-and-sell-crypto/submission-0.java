class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int sellPrice: prices){
            maxProfit = Math.max(maxProfit, sellPrice - minPrice);
            minPrice = Math.min(sellPrice, minPrice);
        }
        return maxProfit;
    }
}
