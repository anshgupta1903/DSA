class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for(int i=2*nums.length-1;i>=0;i--){
            int n=nums.length;
            int idx=i%n;
            
                while(!st.isEmpty() && nums[st.peek()]<=nums[idx]){
                    st.pop();
                }
            
            if(st.isEmpty()){
                arr[idx]=-1;
                
            }
            else{
                arr[idx] = nums[st.peek()];
                
            }
            st.push(idx);
        }

        return arr;
    }
}