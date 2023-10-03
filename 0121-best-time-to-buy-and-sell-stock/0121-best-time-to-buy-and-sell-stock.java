class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for(int index = 0; index < prices.length ; index++)
        {
            if(minPrice >= prices[index])
                minPrice = prices[index];
            else
                maxProfit = Math.max(maxProfit , prices[index] - minPrice);
        }
        return maxProfit;
    }
}