class Solution {
    public int helper(int[] nums, int k){
        int right = 0;
        int left = 0;
        int count = 0;
        int odd = 0;
        while(right<nums.length){
            if(nums[right]%2!=0) odd++;
            while(odd>k){
                if(nums[left++]%2!=0) odd--;
            }
            count += right-left+1;
            right++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k-1);
    }
}