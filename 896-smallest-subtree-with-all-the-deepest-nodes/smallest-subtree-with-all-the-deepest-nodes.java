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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        int h=height(root);
        TreeNode ans=fun(root,h);
        return ans;
    }

    public int height(TreeNode root){
        if(root==null) return -1;
        return Math.max(height(root.left),height(root.right))+1;
    }

    public TreeNode fun(TreeNode root,int h){
        if(root==null) return null;
        if(h==0) return root;
        TreeNode left=fun(root.left,h-1);
        TreeNode right=fun(root.right,h-1);
        if(left!=null && right!=null) return root;
        if(left==null) return right;
        else return left;
        
    }
}