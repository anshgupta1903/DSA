class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        if(m>0 && n>0){
        int idx = 0;
        int i=0,j=0;
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                res[idx] = nums1[i];

                i++;
            }
            else{
                res[idx] = nums2[j];
                j++;
            }
            // System.out.println(res[idx]);

            idx++;
        }
        if(i>=m){
            for(int k = j;k<n;k++){
                res[idx] = nums2[k];
                idx++;
            }
        }
        else if(j>=n){
            for(int k = i;k<m;k++){
                res[idx] = nums1[k];
                idx++;
            }
        }
        for(i=0;i<m+n;i++){
            nums1[i] = res[i];
        }
        }
        if(m==0 && n>0){
            for(int i=0;i<n;i++){
                nums1[i] = nums2[i];
            }
        }
    }
}