/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    int index;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root,sb);
        System.out.println(sb.toString());
        return sb.toString();
    }

    private void preorder(TreeNode root, StringBuilder sb)
    {
        if(root == null){
            sb.append("N");
            sb.append(",");
            return;
        }
        sb.append(String.valueOf(root.val));
        sb.append(",");
        preorder(root.left, sb);
        preorder(root.right, sb);
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] tokens = data.split(",");
        return deserializeTree(tokens);
    }
    private TreeNode deserializeTree(String[] tokens)
    {
        if(tokens[index].equals("N"))
        {
            index++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(String.valueOf(tokens[index])));
        index++;
        root.left = deserializeTree(tokens);
        root.right = deserializeTree(tokens);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));