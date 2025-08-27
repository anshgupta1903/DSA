class Solution {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder(s.trim());
        int i=0;
        boolean isneg = false;
        if(sb.length() == 0) return 0;

        // System.out.println(sb.charAt(0)-'0');
        if(sb.charAt(0)=='+') sb.delete(0,1);
        else if(sb.charAt(0)=='-') {
            sb.delete(0,1);
            isneg = true;
        }

        else if(sb.charAt(0)-'0'>9 || sb.charAt(0)-'0'<0){
            return 0;}

        
        while(i<sb.length()){
            // if(i==sb.length()) break;
            char c = sb.charAt(i);
            if(c==' '){
                sb.delete(i,sb.length());
            }
            else if(c=='+'){
                sb.delete(i, sb.length());
                break;
            }
            else if(c=='-'){
                sb.delete(i, sb.length());
                break;
            }
            else if(Character.isDigit(c)){
                i++;
                continue;
            }
            else{
                sb.delete(i, sb.length());
            }
            i++;
        }
        if(sb.length()==0) return 0;
        long res = 0;
        System.out.println(sb);
        if(sb.charAt(0)=='-'){
            sb.delete(0,1);
            isneg = true;
        }
        
        for(char c:sb.toString().toCharArray()){
        int digit = c - '0';  // define digit here

        if(!isneg) {
        if(res > (Integer.MAX_VALUE - digit) / 10) {
            return Integer.MAX_VALUE;
        }
        } else {
            if(-res < (Integer.MIN_VALUE + digit) / 10) {
            return Integer.MIN_VALUE;
            }
        }
            res = (res*10) + (c-'0');
        }

        if(isneg == true) res*=(-1);
        // if(res < Integer.MIN_VALUE) res = Integer.MIN_VALUE;
        // if(res > Integer.MAX_VALUE) res = Integer.MAX_VALUE;
         return (int)res;
    }
}