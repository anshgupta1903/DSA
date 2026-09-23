class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n/2];
        int[] arr2 = n/2==0? new int[n/2] : new int[(n/2) + 1];
        int x=0;
        int y = 0;
        for(int i: nums){
            if(i>0) arr1[x++]=i;
            else arr2[y++] = i;
        }

        x = 0;
        y=0;
        for(int i=0;i<n;i++){
            nums[i] = arr1[x++];
            nums[++i] = arr2[y++];
        }
        return nums;
    }
}