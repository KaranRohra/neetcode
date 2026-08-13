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
    int res;
    public int diameterOfBinaryTree(TreeNode root) {
        maxLen(root);
        return res;
    }

    public int maxLen(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxLen(root.left);
        int right = maxLen(root.right);
        res = Math.max(res, left + right);
        return Math.max(left, right) + 1;
    }
}
