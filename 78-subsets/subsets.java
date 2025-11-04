class Solution {

    public void backtrack(int[] nums, int i, List<List<Integer>> res, List<Integer> help){

        if(i==nums.length) {
            // res.add(new ArrayList<>(help));
            return;
            }
        
        for(int j=0;j<nums.length;j++){
            if(j==i){
            help.add(nums[j]);
            res.add(new ArrayList<>(help));
            backtrack(nums, ++i, res, help);
            help.remove(help.size()-1);
            }
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> help = new ArrayList<>();
        backtrack(nums, 0, res, help);
        res.add(new ArrayList<>());
        return res;
    }
}