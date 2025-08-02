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
    static int x;
    public int findTilt(TreeNode root) {
        x=0;
        fun(root);
        return x;
    }

    public int fun(TreeNode root){
        if(root==null) return 0;
        int left=fun(root.left);
        int right=fun(root.right);
        x+=Math.abs(left-right);
        return left+right+root.val;
    }
}
