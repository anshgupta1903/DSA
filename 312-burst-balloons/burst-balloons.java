class Solution {
    public int maxCoins(int[] nums) {
        int[] arr = new int[nums.length+2];
        arr[0]=1;
        arr[arr.length-1]=1;
        for(int i=1;i<=nums.length;i++){
            arr[i] = nums[i-1];
        }
        dp = new int[nums.length+2][nums.length+2];
        for(int[] x : dp){
            Arrays.fill(x, -1);
        }
        return solve(arr, 1,nums.length);
        
    }
    int[][] dp;
    public int solve(int[] nums, int i, int j){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int res = 0;
        for(int k=i;k<=j;k++){
            
            int temp = solve(nums, i,k-1)+solve(nums,k+1,j)+(nums[i-1]*nums[k]*nums[j+1]);
            res = Math.max(temp,res);
        }
        return dp[i][j]=res;
    }
}