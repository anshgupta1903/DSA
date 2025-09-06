class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            if(!st.isEmpty() && st.peek()<=nums[i]){
                while(!st.isEmpty() && !(nums[i]<st.peek())){
                    st.pop();
                }
            }
            if(st.isEmpty()){
                arr[i]=Integer.MIN_VALUE;
                st.push(nums[i]);
            }
            else if(st.peek()>nums[i]){
                arr[i] = st.peek();
                st.push(nums[i]);
            }
        }

        st.clear();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==Integer.MIN_VALUE){
                for(int j=0;j<i;j++){
                    if(nums[j]>nums[i]){
                        arr[i] = nums[j];
                        break;
                    }
                    
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==Integer.MIN_VALUE){
                arr[i] = -1;
            }
        }
        return arr;
    }
}