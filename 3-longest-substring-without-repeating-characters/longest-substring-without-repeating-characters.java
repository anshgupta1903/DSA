class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        HashSet<Character> set = new HashSet<>();
        int right = 0;
        int left = 0;

        int maxLen = 0;
        while(right<s.length()){
            char c = s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                right++;
                maxLen = Math.max(maxLen, right-left);
            }
            else{
                set.remove(s.charAt(left));
                left++;

            }
        }
        return maxLen;
    }
}