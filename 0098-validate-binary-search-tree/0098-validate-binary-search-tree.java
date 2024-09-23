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
    public boolean isValidBST(TreeNode root) {
        return validBST(Long.MIN_VALUE, root, Long.MAX_VALUE);
    }
    boolean validBST(long min, TreeNode root, long max)
    {
        if(root == null)
            return true;
        return (root.val > min && root.val < max) && validBST(min, root.left, root.val) && validBST(root.val, root.right, max);
    }
}