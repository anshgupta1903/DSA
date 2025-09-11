class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>(); 
        int[] arr = new int[nums.length - k + 1];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            
            while(!dq.isEmpty() && dq.peekLast()<nums[i]){
                dq.pollLast();
            }
            dq.addLast(nums[i]);
            if(i>=k-1){
                
                arr[idx++] = dq.peekFirst();
                if(dq.peekFirst()==nums[i-k+1]){
                dq.pollFirst();
                }
            }

        }
        return arr;
    }
}