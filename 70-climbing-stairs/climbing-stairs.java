class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return help(arr, n);
    }
    int[] dp;
    public int help(int[] arr, int n){
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n]!=-1)return dp[n];
        int sum = 0;
        for(int k=0;k<2;k++){
            int temp = help(arr, n-arr[k]);
            sum+=temp;
        }
        return dp[n]=sum;
    }

}