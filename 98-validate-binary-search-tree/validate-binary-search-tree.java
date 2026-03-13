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
        return fun(root).isbst;
    }

    public pair fun(TreeNode root){
        if(root==null) return new pair();
        pair left=fun(root.left);
        pair right=fun(root.right);
        pair self=new pair();
        self.min=Math.min(left.min,root.val);
        self.max=Math.max(right.max,root.val);
        self.isbst=right.isbst && left.isbst && root.val>left.max && root.val<right.min;
        return self;
    }

    class pair{
        Long max=Long.MIN_VALUE;
        Long min=Long.MAX_VALUE;
        boolean isbst=true;
    }
}