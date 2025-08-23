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
    String ans=null;
    public String smallestFromLeaf(TreeNode root) {
        fun(root,"");
        return ans;
    }
    public void fun(TreeNode root,String t){
        if(root==null) return;
        t=t+(char)('a'+root.val);
        
        if(root.left==null && root.right==null){
            StringBuilder sb=new StringBuilder(t);
            sb.reverse();
            if(ans==null || sb.toString().compareTo(ans)<0 ){
                ans=sb.toString();
            }
        }
        fun(root.left,t);
        fun(root.right,t);
    }

}