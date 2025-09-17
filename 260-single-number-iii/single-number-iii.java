class Solution {
    public int[] singleNumber(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            n=n^nums[i];
        }
        int pos=0;
        for(int i=0;i<32;i++){
            if(((1<<i)&n)!=0){
                pos = i;
                break;
            }
        }
        int[] ans = new int[2];
        int a = 0;
        int b = 0;
        for(int i=0;i<nums.length;i++){
            if(((1<<pos)&nums[i])!=0){
                a = a^nums[i];
                
            }
            else{
                b=b^nums[i];
            }
        }
        ans[0] = a;
        ans[1] = b;
        return ans;

    }
}