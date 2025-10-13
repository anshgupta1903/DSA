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
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root == null) return res;
        q.offer(root);


        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int n = q.size();
            while(n!=0){
                TreeNode current = q.poll();
                // Store this val of node;
                level.add(current.val);
                n--;
                if(current.left != null) q.offer(current.left);
                if(current.right != null) q.offer(current.right);
            }
            
            res.add(level);

        }
        return res;
    }
}