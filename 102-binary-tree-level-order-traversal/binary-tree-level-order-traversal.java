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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root, res, 0);
        return res ;
    }
    public void helper(TreeNode root, List<List<Integer>> res, int level){
        if(root==null) return;
        if(res.size()==level){
            res.add(new ArrayList<>());
            // return;
        }
        res.get(level).add(root.val);
        helper(root.left, res, level+1);
        helper(root.right,res, level+1);
    }
}