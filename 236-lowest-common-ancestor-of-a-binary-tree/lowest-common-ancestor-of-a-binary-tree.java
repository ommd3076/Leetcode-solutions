/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base cases: if we hit a null node or find either p or q, return it
        if (root == null || root == p || root == q) {
            return root;
        }

        // Look for p and q in the left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both left and right are non-null, this node is the LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return the one that is not null (if both are null, this returns null)
        return left != null ? left : right;
    }
}