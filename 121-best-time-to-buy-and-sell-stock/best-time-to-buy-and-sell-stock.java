class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0;
        int min = prices[0];
        // int max  0;
        int min_idx = 0;
        for(int i=0;i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
                min_idx = i;
            }
            if(prices[i] > min ){
                diff = Math.max(prices[i]- min, diff);
            } 
        }
        return diff;
    }
}