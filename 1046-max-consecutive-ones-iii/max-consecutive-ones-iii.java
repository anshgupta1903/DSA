class Solution {
    public int longestOnes(int[] nums, int k) {
        int sum = 0;
        int left = 0;
        int right = 0;
        int x = k;
        int max = 0;
        while(right<nums.length){
            int n = nums[right];
            if(n==1 || x>0){
                // sum++;
                if(n==0) x--;
                right++;
            }
            
            else{
                while(x<=0){
                    if(nums[left]==0) x++;
                    left++;
                }
            }
            max = Math.max(max,right-left);
        }
        return max;
    }
}