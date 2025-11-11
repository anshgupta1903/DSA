class Solution {
    public int removeElement(int[] nums, int val) {
        // int[] res = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();
        // int idx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                list.add(nums[i]);
                // idx++;
            }
        }
        int x = list.size();
        for(int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        return x;
    }
}