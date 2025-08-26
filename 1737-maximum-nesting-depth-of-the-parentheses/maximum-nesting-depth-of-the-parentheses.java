class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        int max = 0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
                max = Math.max(count, max);
            }
            else if(c==')'){
                count--;
            }
        }
        return max;
    }
}