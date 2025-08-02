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
    static int max;
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
        fun(root);
        return max;
    }

    public int fun(TreeNode root){
        if(root==null) return 0;
        int left=Math.max(0,fun(root.left));
        int right=Math.max(0,fun(root.right));
        max=Math.max(max,left+right+root.val);
        return Math.max(left,right)+root.val;
    }
}