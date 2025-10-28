class Solution {
    public void help(int[] nums, int idx, List<List<Integer>> res, List<Integer> list){
        if(idx == nums.length){
            // res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(i==idx) {
                list.add(nums[i]);
                res.add(new ArrayList<>(list));
                help(nums, ++idx, res, list);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        help(nums, 0, res, new ArrayList<>());
        res.add(new ArrayList<>());
        return res;
    }
}