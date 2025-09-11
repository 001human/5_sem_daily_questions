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
    public void flatten(TreeNode root) {
        fun(root);
    }

    public TreeNode fun(TreeNode root){
        if(root==null) return null;
        if(root.left==null && root.right==null) return root;
        TreeNode leftt=fun(root.left);
        TreeNode rightt=fun(root.right);
        if(root.left!=null){
            leftt.right=root.right;
            root.right=root.left;
            root.left=null;
        }
        return rightt!=null?rightt : leftt;
    }
}