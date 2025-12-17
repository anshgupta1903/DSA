class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        solve(candidates, target, 0,new ArrayList<>(),res);
        return res;
    }
    public void solve(int[] arr, int target, int n, List<Integer> list,List<List<Integer>> res){
        if(n>=arr.length)return;
        if(target == 0){
            // list.add(arr(n));
            // list = Collections.reverse(list);
            res.add(new ArrayList<>(list));
            // n--;
            return;
        }
        if(target<0) return;

            list.add(arr[n]);
            solve(arr, target-arr[n], n,list, res);
            list.remove(list.size()-1);
            solve(arr, target, n+1, list, res);
            
        
        
    }
}