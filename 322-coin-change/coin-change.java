class Solution {
    int dp[];
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int res = help(coins, amount);
        if(res==Integer.MAX_VALUE) return -1;
        return res;
    }
    public int help(int[] coins, int amount){
        if(amount<0) return Integer.MAX_VALUE;
        if(dp[amount]!=-1) return dp[amount];
        if(amount==0) return 0;
        int min = Integer.MAX_VALUE;
        for(int coin:coins){
            int res = help(coins, amount-coin);
            if(res!=Integer.MAX_VALUE){
                min = Math.min(min, res+1);
            }
        }
        return dp[amount]=min;
    }
}