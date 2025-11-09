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
    public void levelOrder(TreeNode root, List<List<Integer>> level, int l){
        if(root==null) return;
        if(level.size() == l){
            level.add(new ArrayList<>());
        }
        level.get(l).add(root.val);
        levelOrder(root.left, level, l+1);
        levelOrder(root.right, level, l+1);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> level = new ArrayList<>();
        levelOrder(root, level, 0);
        for(int i=0;i<level.size();i++){
            if(i%2!=0) Collections.reverse(level.get(i));
        }
        return level;
    }
}