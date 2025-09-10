class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] arr = new int[matrix[0].length];
        int max = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1') arr[j]++;
                else arr[j]=0;

                
            }
            max = Math.max(max, hist(arr));

        }
        return max;

        // Stack<Integer> st = new Stack<>();
        // int max = 0;
        // for(int i=0;i<=arr.length;i++){
        //     int curr = i==arr.length ? 0:arr[i];
        //     while(!st.isEmpty() && curr<arr[st.peek()]){
        //         int height = arr[st.pop()];
        //         int width = st.isEmpty() ? i:i-st.peek()-1;
        //         max = Math.max(max, height*width);
        //     }
        //     st.push(i);
        // }
        // return max;
    }
    private int hist(int[] arr){
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for(int i=0;i<=arr.length;i++){
            int curr = i==arr.length ? 0:arr[i];
            while(!st.isEmpty() && curr<arr[st.peek()]){
                int height = arr[st.pop()];
                int width = st.isEmpty() ? i:i-st.peek()-1;
                max = Math.max(max, height*width);
            }
            st.push(i);
        }
        return max;
    }
}