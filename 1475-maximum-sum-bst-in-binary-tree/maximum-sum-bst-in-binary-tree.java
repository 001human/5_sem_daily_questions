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

    class pair{
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        boolean bst=true;
        int ans=0;
    }

    public int maxSumBST(TreeNode root) {
        return fun(root).ans;
    }

    public pair fun(TreeNode root){
        if(root==null) return new pair();
        pair ldp=fun(root.left);
        pair rdp=fun(root.right);
        pair sdp=new pair();
        sdp.max=Math.max(root.val,Math.max(rdp.max,ldp.max));
        sdp.min=Math.min(root.val,Math.min(rdp.min,ldp.min));
        sdp.sum=ldp.sum+rdp.sum+root.val;
        sdp.bst=ldp.bst && rdp.bst && root.val>ldp.max && root.val<rdp.min;
        if(sdp.bst) sdp.ans=Math.max(sdp.sum,Math.max(ldp.ans,rdp.ans));
        else sdp.ans=Math.max(rdp.ans,ldp.ans);
        return sdp;
    }
}
