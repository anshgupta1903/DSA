class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        // int n=0;
        for(int j=0;j<32;j++){
            int x = 0;

            for(int i=0;i<nums.length;i++){
                if(((1<<j)&nums[i])!=0){
                    x++;
                }
            }
            if(x%3!=0){
                // ans += Math.pow(2,j)
                ans = (ans | (1<<j));
            }
            // n++;
        }
        return ans;
    }
}