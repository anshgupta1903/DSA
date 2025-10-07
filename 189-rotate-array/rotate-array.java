class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] demo = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for(int i=nums.length-1;i>nums.length-k-1;i--){
            st.push(nums[i]);
        }
        for(int i=0;i<k;i++){
            demo[i] = st.pop();
        }
        for(int i=k;i<nums.length;i++){
            demo[i]=nums[i-k];
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = demo[i];
        }
    }
}