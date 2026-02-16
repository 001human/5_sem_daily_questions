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
    static int ans;
    public int maxDepth(TreeNode root) {
        ans=0;
        fun(root,0);
        return ans;
    }

    public void fun(TreeNode root,int h){
        if(root==null){
            ans=Math.max(ans,h);
            return;
        }
        fun(root.left,h+1);
        fun(root.right,h+1);
    }

}