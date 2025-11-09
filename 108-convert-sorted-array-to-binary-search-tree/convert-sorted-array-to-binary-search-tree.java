/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode inorder(int[] nums, int start, int end){
        if(start > end) return null;

        TreeNode root = new TreeNode(nums[(end+start)/2]);
        root.left = inorder(nums, start, ((start+end)/2) - 1);
        root.right = inorder(nums, (start+end)/2 + 1, end);
        return root;
    } 
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = inorder(nums, 0, nums.length-1);
        return root;
    }
}