class Solution {
    public boolean check(int[] nums) {
        int[] arr = new int[nums.length];
        int brkpt = 0;
        int n = nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] > nums[i]){
                brkpt = i;
                break;
            }
        }
        if(brkpt == 0) return true;
        for(int i=0; i<n-brkpt; i++){
            arr[i] = nums[brkpt+i]; 
        }
        for(int i=0;i<brkpt;i++){
            arr[n-brkpt+i] = nums[i];
        }
        if(chk_sorted(arr)) return true;
        return false;
    }
    public boolean chk_sorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1])return false;
        }
        return true;
    }
}