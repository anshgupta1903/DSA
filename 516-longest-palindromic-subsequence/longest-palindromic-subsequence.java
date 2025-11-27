class Solution {
    public int longestPalindromeSubseq(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        int m = s.length();
        int n = s2.length();
        dp = new int[m+1][n+1];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }

        return help(s, s2, m-1, n-1);
    }

    int[][] dp;

    public int help(String s, String s2, int i, int j){
        if(i<0 || j<0){
            return 0;
        }

        if(dp[i][j] != -1) return dp[i][j];

        if(s.charAt(i)==s2.charAt(j)) return dp[i][j] = help(s, s2, i-1, j-1)+1;
        return dp[i][j] = Math.max(help(s, s2, i-1,j),help(s,s2, i,j-1));
    }
}