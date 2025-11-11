class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
            list.add(nums[i]);
            i=j;
            }
            j++;

        }
        list.add(nums[j-1]);
        for(i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        return list.size();
    }
}