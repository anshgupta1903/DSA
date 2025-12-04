class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0; i<=n;i++){
            int count = 0;
            int x = 1;
            int y = i;
            for(int j=0;j<32;j++){
                count += y&x;
                y=y>>1;
            }
            arr[i] = count;
        }
        return arr;
    }
}