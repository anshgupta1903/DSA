class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        res.add(new ArrayList<>(temp));
        if(numRows==1) return res;
        temp.add(1);
        res.add(temp);
        help(numRows, 2, res);
        return res;
    }
    public void help(int numRows, int i, List<List<Integer>> res){
        if(i>=numRows){
            // res.add(new ArrayList<>(list));
            return;
        }
        List<Integer> list = new ArrayList<>();
        // if(list.size()==i) res.add(new ArrayList<>(list));
        List<Integer> h = res.get(i-1);
        list.add(1);
        for(int k=1;k<i;k++){
            list.add(h.get(k)+h.get(k-1));
        }
        list.add(1);
        res.add(new ArrayList<>(list));
        help(numRows, i+1, res);

    }
}