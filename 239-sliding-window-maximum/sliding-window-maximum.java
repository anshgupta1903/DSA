class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>(); 
        // int max = Integer.MIN_VALUE;
        int[] arr = new int[nums.length - k + 1];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            
            while(!dq.isEmpty() && dq.peekLast()<nums[i]){
                dq.pollLast();
            }
            dq.addLast(nums[i]);
            // j++;
            if(i>=k-1){
                // j=0;
                // list.add(dq.peekFirst());
                arr[idx++] = dq.peekFirst();
                if(dq.peekFirst()==nums[i-k+1]){
                dq.pollFirst();
                }
            }

        }
        // int[] arr = list.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}