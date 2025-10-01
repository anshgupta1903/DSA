class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;
        int res = 0;
        while(right<s.length()){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c,0) + 1);
            max = Math.max(max, map.get(c));
            while((right - left + 1) - max > k){
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
            }
            res = Math.max(res, right-left+1);
            right++;
        }
        return res;
    }
}