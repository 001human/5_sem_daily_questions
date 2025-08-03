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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>ans=new ArrayList<>();
        fun(root,ans,"");
        return ans;
    }
    public void fun(TreeNode root,List<String>ans,String s){
        if(root==null) return;
        if(root.left==null && root.right==null){
            ans.add(s+root.val);
            return;
        }
        fun(root.left,ans,s+root.val+"->");
        fun(root.right,ans,s+root.val+"->");
    }
}