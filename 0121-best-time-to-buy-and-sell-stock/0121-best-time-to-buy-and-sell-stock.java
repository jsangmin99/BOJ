class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minValue = Integer.MAX_VALUE;
        for(int i = 0 ; i < prices.length; i++){
            if(prices[i] < minValue){
                minValue = prices[i];
            }
            else if (prices[i] - minValue > max){
                max = prices[i] - minValue;
            }
        }
        return max;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna