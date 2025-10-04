class Solution {
    public int trap(int[] height) {
        int leftmax = 0;
        int rightmax = 0;
        int left = 0;
        int right = height.length-1;
        int sum = 0;
        while(left < right){
            leftmax = Math.max(leftmax, height[left]);
            rightmax = Math.max(rightmax, height[right]);
            if(leftmax < rightmax){
                sum += leftmax - height[left];
                left++;
            }
            else{
                sum += rightmax - height[right];
                right--;
            }
            
        }
        return sum;
    }
}