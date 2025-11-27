class Solution {
    public int minDistance(String word1, String word2) {
      int m = word1.length();
        int n = word2.length();
        dp = new int[m+1][n+1];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        
        return m + n - 2*(lcs(word1,word2,m-1,n-1));
    }
    
    int[][] dp;
    public int lcs(String s1, String s2, int i, int j){
        if(i<0 || j<0) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        if(s1.charAt(i) == s2.charAt(j)) return dp[i][j] = lcs(s1, s2, i-1, j-1)+1;
        return dp[i][j] = Math.max(lcs(s1, s2, i-1,j),lcs(s1,s2,i,j-1));
    }
}