class Solution {
    public boolean canJump(int[] nums) {
        dp = new Boolean[nums.length+1];
        

        return help(nums, 0);
    }
    Boolean[] dp;
    public boolean help(int[] nums, int i){
        // if(sum>=nums.length-1) return true;
        if(i>=nums.length-1) return true;
        // if(i<0) return false;
        // if(nums[i]==0) return false;
        if(dp[i]!=null)return dp[i];
        // if(i==1) return dp[i][sum]=help(nums, i+1);
        for(int j=1;j<=nums[i];j++){
            if(help(nums, i+j)) return dp[i]=true;
        }
        return dp[i]=false;
    }
}