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
        fun(root,t);
        if(root.left==null && root.right==null && root.val==t) return null;
        return root;
    }

    public void fun(TreeNode root,int t){
        if(root==null) return;
        fun(root.left,t);
        if(root.left!=null) {
            if(root.left.left==null && root.left.right==null && root.left.val==t){
                root.left=null;
            }
        }

        fun(root.right,t);
        if(root.right!=null) {
            if(root.right.left==null && root.right.right==null && root.right.val==t){
                root.right=null;
            }
        }
        
    }
}