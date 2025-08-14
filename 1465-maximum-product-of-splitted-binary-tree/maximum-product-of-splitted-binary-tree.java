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
    long ans=0;
    long sum=0;
    int mod=1000000007;
    long x=0;
    public int maxProduct(TreeNode root) {
        fun(root);
        fun1(root);
        return (int)(ans%mod);
    }

    public void fun(TreeNode  root){
        if(root==null) return;
        sum+=root.val;
        fun(root.left);
        fun(root.right);
    }

    public long fun1(TreeNode root){
        if(root==null) return 0;
        long left=fun1(root.left);
        long right=fun1(root.right);
        ans=Math.max(ans,((left+right+root.val)*(sum-(left+right+root.val))));
        return left+right+root.val;
    }
}
