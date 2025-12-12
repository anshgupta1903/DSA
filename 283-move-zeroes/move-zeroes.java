class Solution {
    public void moveZeroes(int[] nums) {

       int n = nums.length;
    //    if(n==0) return;
       int j=0;
       for(int i=0;i<n;i++){
        if(nums[i]!=0&&i!=j){
            nums[j++]=nums[i];
            nums[i] = 0;
        } else if(nums[i] != 0) {
            j++;
        } 
       }
    }
    
}