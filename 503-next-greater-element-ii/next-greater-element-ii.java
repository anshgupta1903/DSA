class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[nums.length];
        int n = nums.length;
        // st.push(0);
        for(int i=2*n - 1;i>=0;i--)
        {
            int x = i%n;
            while(!st.isEmpty() && nums[x] >=nums[st.peek()]){
                // arr[st.pop()] = nums[x];
                st.pop();
            }
            if(st.isEmpty()) arr[x] = -1;
            else arr[x] = nums[st.peek()];
            st.push(x);
        }
        
        return arr;
    }
}