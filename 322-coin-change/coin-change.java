class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        if(amount == 0) return 0;
        dp = new int[amount+1];
        
        Arrays.fill(dp, -1);
        
        int res = help(coins, amount);
        
        if(res==Integer.MAX_VALUE) return -1;
        return res;
    }
    int[] dp;
    public int help(int[] coins, int amount){
        if(amount<0) return Integer.MAX_VALUE;
        if(amount==0) return 0;
        if(dp[amount]!=-1) return dp[amount];
        int min = Integer.MAX_VALUE;
        for(int coin:coins){
            if(amount>=coin){
                int res = help(coins, amount-coin);
                if(res!=Integer.MAX_VALUE){
                    min = Math.min(min, 1+res);
                }
            }
        }
        return dp[amount] = min;
    }
}