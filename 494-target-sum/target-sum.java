class Solution {
    // int total;
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i:nums){
            sum+=i;
        }
        // total = sum;
        return help(nums, target, nums.length-1, sum,0);
    }

    public int help(int[] nums, int target, int n, int sum1, int sum2){
        // if(sum1-sum2 == target) return 1;
        if(n<0) return sum1-sum2==target ? 1:0;
        
        // if(sum1-nums[n])
        int take = help(nums, target, n-1, sum1-nums[n], sum2+nums[n]);
        int notTake = help(nums, target, n-1, sum1, sum2);
        return take+notTake;

    }
}