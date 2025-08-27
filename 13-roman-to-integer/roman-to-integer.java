class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int x=0;
        int y=0;
        for(char c:s.toCharArray()){
            
           switch (c){
            case 'I':
                x=1;
                break;
            case 'V':
                x= 5;
                break;
            case 'X':
                x= 10;
                break;
            case 'L':
                x= 50;
                break;
            case 'C':
                x= 100;
                break;
            case 'D':
                x=500;
                break;
            case 'M':
                x=1000;
                break;
           }
           if(x>y){
            // res = res-y;
            res+=(x-y)-y;
            y=x;
           }
           else{
           res += x;
           y=x;
           }

        }
        return res;
    }
}