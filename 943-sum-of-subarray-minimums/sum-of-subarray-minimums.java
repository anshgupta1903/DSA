class Solution {
    public int[] nse(int[] arr) {
    Stack<Integer> st = new Stack<>(); // store indexes
    int[] res = new int[arr.length];

    for (int i = arr.length - 1; i >= 0; i--) {
        while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
            st.pop();
        }
        if (st.isEmpty()) {
            res[i] = arr.length;  // no smaller element to the right
        } else {
            res[i] = st.peek(); // index of next smaller
        }
        st.push(i);
    }
    return res;
}

    public int[] pse(int[] arr) {
    Stack<Integer> st = new Stack<>(); // store indexes
    int[] res = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
        while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
            st.pop();
        }
        if (st.isEmpty()) {
            res[i] = -1;  // no smaller element to the left
        } else {
            res[i] = st.peek(); // index of previous smaller
        }
        st.push(i);
    }
    return res;
}

    public int sumSubarrayMins(int[] arr) {
        int[] nse = nse(arr);
        int[] pse = pse(arr);
        long result = 0;
        int mod = 1000000007;
        for(int i=0;i<arr.length;i++){
            long left = i-pse[i];
            long right = nse[i]-i;
            result = (result + (left * right % mod) * arr[i] % mod) % mod;

        }
        return (int)result;
    }
}