class Solution {
    public long help(String s, int idx, int end){
        if(idx == end){
            return 0;
        }
        long num = help(s, idx+1, end);
        long x = s.charAt(idx) - '0';
        long power = (int)Math.pow(10, end - idx - 1);
        return x * power + num;
    }

    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0) return 0;

        int startIdx = 0;
        boolean isNegative = false;

        if(s.charAt(0) == '-'){
            isNegative = true;
            startIdx = 1;
        } else if(s.charAt(0) == '+'){
            startIdx = 1;
        }

        int endIdx = startIdx;
        while(endIdx < s.length() && Character.isDigit(s.charAt(endIdx))){
            endIdx++;
        }

        long result = help(s, startIdx, endIdx);
        if (isNegative) result = -result;

        if (result > Integer.MAX_VALUE) {
        result = Integer.MAX_VALUE;
        }  
        if(result < Integer.MIN_VALUE){
            result = Integer.MIN_VALUE;
        }

    return (int)result;

    }
}
