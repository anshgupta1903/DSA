class Solution {
    public double help(double x, int n){
        if(n==0) return 1;
        double half = help(x, n/2);
        if(n%2==0){
            return half*half;
        }
        return half*half*x;
    }
    public double myPow(double x, int n) {
        boolean isNeg = false;
        if(n<0) {
            isNeg = true;
            n *= -1;
        }
        double res = help(x, n);
        if(isNeg){
            res = 1/res;
        }
        return res;
    }
}