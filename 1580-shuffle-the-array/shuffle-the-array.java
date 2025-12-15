class Solution {
    public int[] shuffle(int[] nums, int n) {
        n = 2*n;
        int[] res = new int[n];
    
        int j=n/2;
        int i=0;
        int k=0;
        while(j<n &&i+1<n){
            res[i] = nums[k];
            res[i+1] = nums[j];
            k++;
            j++;
            i+=2;
        }
        return res;
    }
}