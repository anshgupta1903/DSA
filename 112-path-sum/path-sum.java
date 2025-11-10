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
    public boolean help(TreeNode root, int target, int sum){
        if(root==null) return false;
        sum +=root.val;
        if(sum==target && root != null && root.left==null && root.right == null) return true;
        // if(sum==target && root != null && (root.left!=null || root.right != null)) return false;
        
        return help(root.left, target, sum) || help(root.right, target, sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // if(root == null || targetSum == 0) return false;
        if(root == null && targetSum == 0) return false; 
        // if(root.val == targetSum && (root.left != null || root.right != null)) return false;
        return help(root, targetSum, 0);

    }
}