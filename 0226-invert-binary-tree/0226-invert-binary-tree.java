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
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;

        Deque<TreeNode> deque = new ArrayDeque<TreeNode>();
        deque.add(root);

        while(!deque.isEmpty())
        {
            TreeNode currentNode = deque.removeFirst();
            TreeNode leftPointer = currentNode.left;
            currentNode.left = currentNode.right;
            currentNode.right = leftPointer;

            if(currentNode.left != null)
                deque.add(currentNode.left);
            if(currentNode.right != null)
                deque.add(currentNode.right);  
        }
        return root;
    }
}