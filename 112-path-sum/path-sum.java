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
    public boolean hasPathSum(TreeNode root, int t) {
        if(root==null) return false; 
        return fun(root,t) ;
    }

    public boolean fun(TreeNode root,int t){
        if(root==null) return false;
        if(t-root.val==0 && root.left==null && root.right==null) return true;
        boolean l=fun(root.left,t-root.val);
        boolean r=fun(root.right,t-root.val);
        return l || r;
    }
}