class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int i = 0;
        int[] result = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for(i=0;i<nums.length;i++){
            result[i] = -1;
        }
        for( i=0;i<nums.length;i++){
            int x = -1;
            for(int j=1;j<nums.length;j++){
                int idx = (j+i)%nums.length;
                if(nums[i] < nums[idx]){
                    x = nums[idx];
                    break;
                }
            }
            result[i] = x;
        }
        return result;
    }
}