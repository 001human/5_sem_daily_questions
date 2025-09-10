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
    public boolean isBalanced(TreeNode root) {
        return fun(root).bal;
    }

    public di fun(TreeNode root){
        if(root==null) return new di();
        di left=fun(root.left);
        di right=fun(root.right);
        di mid=new di();
        mid.ht=Math.max(left.ht,right.ht)+1;
        boolean check=Math.abs(left.ht-right.ht)<=1;
        mid.bal=left.bal && right.bal && check;
        return mid;
    }

    class di{
        int ht=-1;
        boolean bal=true;
    }

}