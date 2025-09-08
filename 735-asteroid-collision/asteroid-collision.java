class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // int[] arr = new int[asteroids.length];
        Stack<Integer> st = new Stack<>();
        // int x = asteroids[0];
        for(int i=0;i<asteroids.length;i++){
            int y = asteroids[i];
            boolean destroyed = false;
            while(!st.isEmpty() && y<0 && st.peek()>0){
                if(Math.abs(y)>Math.abs(st.peek())){
                    st.pop();
                    continue;
                }
                else if(Math.abs(st.peek()) == Math.abs(y)){
                    st.pop();
                }
                destroyed = true;
                break;
            }
            if(!destroyed){
                st.push(y);
            }

            
        }
        int[] arr = new int[st.size()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i] = st.pop();
        }
        return arr;
    }
}