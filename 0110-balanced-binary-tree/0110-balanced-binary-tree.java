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
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return (Math.abs(leftHeight - rightHeight) < 2 && isBalanced(root.left) && isBalanced(root.right));
    }
    private int getHeight(TreeNode root)
    {
        if(root == null)
            return 0;
        int leftSubtree = getHeight(root.left);
        int rightSubtree = getHeight(root.right);
        return 1 + Math.max(leftSubtree, rightSubtree);
    }
}