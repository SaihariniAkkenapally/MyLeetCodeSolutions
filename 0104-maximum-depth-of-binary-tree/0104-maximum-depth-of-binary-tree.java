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
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
            
        int level = 0;
        Deque<TreeNode> deque = new ArrayDeque<TreeNode>();
        deque.add(root);

        while(!deque.isEmpty())
        {
            level++;
            int size = deque.size();
            for(int index = 0; index < size; index++)
            {
                TreeNode node = deque.removeFirst();
                if(node.left != null)
                    deque.add(node.left);
                if(node.right != null)
                    deque.add(node.right);
            }
        }
        return level;
    }
}