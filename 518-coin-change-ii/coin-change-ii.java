class Solution {
    int[][] dp;
    public int change(int amount, int[] coins) {
        int n = coins.length;
        dp = new int[amount+1][n+1];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        return help(amount, coins, n-1);
    }
    public int help(int amount, int[] coins, int i){
        if(amount<0) return 0;
        if(i<0) return 0;
        if(dp[amount][i] != -1) return dp[amount][i];
        if(amount==0) return 1;
        return dp[amount][i] = help(amount-coins[i], coins,i)+help(amount, coins, i-1);
    }
}