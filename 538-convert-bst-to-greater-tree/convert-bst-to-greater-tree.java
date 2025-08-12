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
    int sum;
    public TreeNode convertBST(TreeNode root) {
        sum=0;
        fun(root);
        return root;
    }

    public void fun(TreeNode root){
        if(root==null) return;
        fun(root.right);
        root.val=root.val+sum;
        sum=root.val;
        fun(root.left);
    }
}