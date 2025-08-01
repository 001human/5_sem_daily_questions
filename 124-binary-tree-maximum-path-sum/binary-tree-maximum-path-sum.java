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
    public int maxPathSum(TreeNode root) {
       this.x=Integer.MIN_VALUE;
       fxn(root);
       return x;
    }
    static int fxn(TreeNode root){
         if(root==null){
            return 0;
        }
       int l= Math.max(0,fxn(root.left));
       int r= Math.max(0,fxn(root.right));
       x= Math.max(l+r+root.val,x);
       return Math.max(l,r)+root.val;
    }
}