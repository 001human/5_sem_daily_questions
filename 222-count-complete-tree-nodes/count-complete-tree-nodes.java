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
    static int c=0;
    public int countNodes(TreeNode root) {
        c=0;
        fun(root);
        return c;
    }
    
    public void fun(TreeNode root){
        if(root==null) return;
        c++;
        fun(root.left);
        fun(root.right);
    }
}