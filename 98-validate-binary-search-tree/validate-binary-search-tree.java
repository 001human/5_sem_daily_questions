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
    public boolean isValidBST(TreeNode root) {
        return valid(root).isbst;
    }

    public pair valid(TreeNode root){
        if(root==null) return new pair();
        pair lbp=valid(root.left);
        pair rbp=valid(root.right);
        pair sbp=new pair();
        sbp.max=Math.max(root.val,Math.max(lbp.max,rbp.max));
        sbp.min=Math.min(root.val,Math.min(lbp.min,rbp.min));
        sbp.isbst=lbp.isbst && rbp.isbst && root.val>lbp.max && root.val<rbp.min;
        return sbp;
    }

    class pair{
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        boolean isbst =true;
    }
}
