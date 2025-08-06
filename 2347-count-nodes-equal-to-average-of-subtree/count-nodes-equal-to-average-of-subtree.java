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
        int sum=0;
        int c=0;
        int ans=0;
    }

    public int averageOfSubtree(TreeNode root) {
        return fun(root).ans;
    }

    public pair fun(TreeNode root){
        if(root==null) return new pair();
        pair left=fun(root.left);
        pair right=fun(root.right);
        pair sdp=new pair();
        sdp.sum=left.sum+right.sum+root.val;
        sdp.c=left.c+right.c+1;
        if(root.val==sdp.sum/sdp.c) {
            sdp.ans=left.ans+right.ans+1;
        }
        else {
            sdp.ans=left.ans+right.ans;
        }
      return sdp;

    }
}