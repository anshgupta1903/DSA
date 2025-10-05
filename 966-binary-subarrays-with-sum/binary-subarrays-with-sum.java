class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int left = 0;
        int right = 0;
        int count = 0;
        int sum = 0;
        // int maxSum = 0;
        while(right<nums.length){
            
           
            sum += nums[right];
            while(sum > goal){
                sum -= nums[left];
                left++;
            }
            count += right-left+1;
            right++;
        }
        int count2 = 0;
        right = 0;
        left = 0;
        sum = 0;
        while(right<nums.length){
            if(goal-1 < 0){
                count2 = 0;
                break;
            }
            
            sum += nums[right];
            while(sum > goal-1){
                sum -= nums[left];
                left++;
            }
            count2 += right-left+1;
            right++;
        }
        
        return count-count2;
    }
}