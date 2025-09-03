class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n==1) return true;
        int x = n&(n-1);
        if(n>0&&x==0) return true;
        return false;
    }
}