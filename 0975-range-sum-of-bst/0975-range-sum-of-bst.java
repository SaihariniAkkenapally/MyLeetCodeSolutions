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
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        getRangeSum(root,low,high);
        return sum;
    }
    void getRangeSum(TreeNode root, int low, int high)
    {
        if(root == null)
            return;
        if(root.val <= high && root.val >= low)
            sum = sum + root.val;
        getRangeSum(root.left, low, high);
        getRangeSum(root.right, low, high);
    }
}