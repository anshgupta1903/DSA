class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=heights.length;i++){
            int curr = (i==heights.length) ? 0:heights[i];
            while(!st.isEmpty() && curr<heights[st.peek()]){
                int height = heights[st.pop()];
                int width = st.isEmpty() ? i:i-st.peek()-1;
                max = Math.max(max,height*width);
            }
            st.push(i);
        }
        return max;
    }
}