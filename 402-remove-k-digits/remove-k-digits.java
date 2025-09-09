class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k) return "0";
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<num.length();i++){
            int x = num.charAt(i)-'0';
            while(!st.isEmpty() && st.peek()>x && k>0){
                st.pop();
                k--;
            }
           
            
            
            st.push(x);
        }
        while(!st.isEmpty()&&k>0){
                st.pop();
                k--;
            }
        StringBuilder sb = new StringBuilder("");
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        
        while (sb.length() > 1 && sb.charAt(0) == '0') {
    sb.deleteCharAt(0);
}
        return sb.toString();
    }
}