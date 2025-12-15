class Solution {
    public int[] findErrorNums(int[] nums) {
       Set<Integer> set = new HashSet<>();
       int[] res = new int[2];
       int sum = 0;
       for(int i: nums){
        if(set.contains(i)) res[0]=i;
        set.add(i);
        sum+=i;
       } 
       int c = (nums.length*(nums.length+1))/2;
       res[1] = (c-sum)+res[0];
       return res;
    }
}