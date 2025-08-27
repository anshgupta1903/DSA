class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s, i, j)) {   // O(n) check
                    int len = j - i + 1;
                    if (len > max) {
                        max = len;
                        res = s.substring(i, j + 1); // O(n) but only when updating
                    }
                }
            }
        }
        return res;
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
