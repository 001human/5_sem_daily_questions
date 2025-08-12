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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer>temp=new ArrayList<>();
        fun(temp,root);
        return temp.get(k-1);
    }

    public void fun(List<Integer>temp,TreeNode root){
        if(root==null) return;
        fun(temp,root.left);
        temp.add(root.val);
        fun(temp,root.right);
    }
}