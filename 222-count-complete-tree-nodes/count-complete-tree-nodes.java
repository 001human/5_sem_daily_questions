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
    static int c;
    public int countNodes(TreeNode root) {
        c=0;
        if(root==null) return 0;
        fun(root);
        return c;
    }

    public void fun(TreeNode root){
        if(root==null) return;
        c=c+1;
        fun(root.right);
        fun(root.left);
    }
}