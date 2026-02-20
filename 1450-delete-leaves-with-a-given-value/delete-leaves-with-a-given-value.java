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
    public TreeNode removeLeafNodes(TreeNode root, int t) {
        return fun(root,t);
    }

    public TreeNode fun(TreeNode root,int t){
        if(root==null) return null;
        root.left=fun(root.left,t);
        root.right=fun(root.right,t);
        if(root.left==null && root.right==null && root.val==t) return null;
        return root;
    }
}