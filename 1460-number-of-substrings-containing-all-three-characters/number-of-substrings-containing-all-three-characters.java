class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr = new int[3];
        int left = 0;
        
        int count = 0;
        for(int right =0;right<s.length();right++){
            char x = s.charAt(right);
            arr[x - 'a']++;
            while(arr[0]>0 && arr[1] > 0 && arr[2] > 0){
                arr[s.charAt(left)-'a']--;
                left++;
                count += s.length()-right;
            }
            
        }
        return count;
    }
}