class Solution {
    public int removeDuplicates(int[] nums) {
        int pos = 1;
        int count = 1;
        int n = nums.length;
        if(n==2 && nums[0] != nums[1]) return 2;
        else if(n==2) return 1;
        for(int i=1; i<n; i++){
        
            // if(nums[i]==nums[i-1])count++;
            // else if(count>1){
            //     count = 1;
            //     nums[pos] = nums[i];
            //     pos++;
            // }
            // else pos++;


            if(nums[i] != nums[i-1]){
                nums[pos++] = nums[i];
            }
        }
        
        return pos;
    }
}