class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,1));
        // List<Integer> res = new ArrayList<>();
        if(rowIndex == 0) return new ArrayList<>(Arrays.asList(1));
        
        solve(rowIndex, 2, list);
        return list;
    }
    public void solve(int n, int i, List<Integer> list){
        if(i>n) return;
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for(int k=1;k<i;k++){
            res.add(list.get(k-1)+list.get(k));
        }
        res.add(1);
        list.clear();
        list.addAll(res);
        solve(n,i+1,list);
    }
}