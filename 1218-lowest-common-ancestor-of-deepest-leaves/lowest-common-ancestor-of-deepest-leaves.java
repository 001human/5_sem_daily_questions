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
    int max=0;
    TreeNode ans=null;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        fun(root,0);
        return ans;
    }

    public int fun(TreeNode root,int cur){
        if(root==null){
            max=Math.max(max,cur);
            return cur;
        }
        int left=fun(root.left,cur+1);
        int right=fun(root.right,cur+1);
        if(left==max && right==max){
            ans=root;
        }
        return Math.max(left,right);
    }
}