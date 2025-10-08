class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = 0;
        int m = 0;
        int[] arr = new int[nums1.length + nums2.length];
        int i = 0;
        while(n!=nums1.length && m != nums2.length){
            if(nums1[n] < nums2[m]){
                arr[i] = nums1[n];
                n++;
            }
            else{
                arr[i] = nums2[m];
                m++;
            }
            i++;
        }
        if(n==nums1.length){
            for(int j=m;j<nums2.length;j++){
                arr[i] = nums2[j];
                i++;
            }
        }
        else{
            for(int j=n;j<nums1.length;j++){
                arr[i] = nums1[j];
                i++;
            }
        }
        if(arr.length%2 == 0) return (arr[arr.length/2]+arr[(arr.length/2)-1])/2.0;
        return arr[(int)(arr.length/2)];
    }
}