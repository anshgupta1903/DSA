class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        // int count = 0;
        int max_count = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0)+1);
            while(map.get(c)>1){
                map.put(s.charAt(left),map.get(s.charAt(left)) -1);
                left++;
            }
            max_count = Math.max(max_count, right-left+1);
            right++;
            
        }
        return max_count;
    }
}