class Solution {
    // int total;
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i:nums){
            sum+=i;
        }
        // total = sum;
        int n = nums.length;
        dp = new int[n+1][sum+1];
        for(int[] a : dp){
            Arrays.fill(a, -1);
        }
        return help(nums, target, nums.length-1, sum,0);
    }
    int[][] dp;
    public int help(int[] nums, int target, int n, int sum1, int sum2){
        // if(sum1-sum2 == target) return 1;
        if(n<0) return sum1-sum2==target ? 1:0;
        if(dp[n][sum1]!=-1) return dp[n][sum1];
        // if(sum1-nums[n])
        int take = help(nums, target, n-1, sum1-nums[n], sum2+nums[n]);
        int notTake = help(nums, target, n-1, sum1, sum2);
        return dp[n][sum1] = take+notTake;

    }
}