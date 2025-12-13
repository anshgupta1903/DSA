class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++){
            if(s.equals(goal)) return true;
            s = shift(s);
        }
        return false;
    }
    public String shift(String s){
        s = s.substring(1) + s.charAt(0);
        return s;
    }
}