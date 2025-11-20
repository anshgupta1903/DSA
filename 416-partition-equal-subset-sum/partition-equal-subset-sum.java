class Solution {
    // int[][] dp =  new int[200][200];
    Boolean[][] dp;
    public boolean canPartition(int[] nums) {
        int sum  = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        // for(int i=0;i<200;i++){
        //     for(int j=0;j<200;j++){
        //         dp[i][j] = -1;
        //     }
        // }
        int target = sum/2;
        dp = new Boolean[nums.length+1][target+1];
        return help(nums, nums.length-1, target);
    }

    public boolean help(int[] nums, int n, int target){
        if(target == 0) return true;
        if(n<0 || target<0) return false;

        if(dp[n][target] != null) return dp[n][target];
        return dp[n][target] = help(nums, n-1, target-nums[n]) || help(nums, n-1, target); 
    }
}