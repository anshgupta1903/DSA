class Solution {
    int max = 0; // global variable to store max diameter
    
    public int height(TreeNode root){
        if(root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        // update max diameter at this node
        max = Math.max(max, left + right);

        // return height of this node
        return Math.max(left, right) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max;
    }
}
