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
    static List<Integer>x;
    public int findBottomLeftValue(TreeNode root) {
        x=new ArrayList<>();
        int h=height(root);
        fun(root,h,0);
        return x.get(0);
    }

    public int height(TreeNode root){
        if(root==null) return -1;
        return Math.max(height(root.left),height(root.right))+1;
    }

    public void fun(TreeNode root,int h,int cl){
        if(root==null) return;
        if(cl==h) {
            x.add(root.val);
            return;
        }
        fun(root.left,h,cl+1);
        fun(root.right,h,cl+1);
    }
}
