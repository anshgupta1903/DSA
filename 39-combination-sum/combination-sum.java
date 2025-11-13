class Solution {
    public void help(int[] candidates, int target, List<List<Integer>> res, List<Integer> list, int i){
        if(i>=candidates.length) return;
        if(target == 0){
            res.add(new ArrayList(list));
            return;
        }
        if(target<0){
            return;
        }
        list.add(candidates[i]);
        help(candidates, target-candidates[i], res, list, i);
        list.remove(list.size()-1);
        help(candidates, target, res, list, i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        help(candidates, target, res, new ArrayList<>(), 0);
        return res;
    }
}