class Solution {
    int[] dp;
    public int tribonacci(int n) {
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return help(n);
    }
    public int help(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=help(n-1)+help(n-2)+help(n-3);
    }
}