class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) return 1;
        if (s.length() == 0) return 0;
        StringBuilder sb = new StringBuilder(Character.toString(s.charAt(0)));
        

        int left = 0;
        int right = 1;
        // String res = new String("");
        int maxLen = 1;
        while(right<s.length()){
            char c = s.charAt(right);
            if(sb.indexOf(Character.toString(c)) ==  -1){
                sb.append(c);
                right ++;
                maxLen = Math.max(maxLen, sb.length());
            }
            else{
                // res = sb.toString();
                sb.deleteCharAt(0);
                left++;
                
            }
        }
        return maxLen;
    }
}