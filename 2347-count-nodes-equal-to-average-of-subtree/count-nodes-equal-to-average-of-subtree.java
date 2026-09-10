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

    class pair{
        int sum=0;
        int count=0;
        int ans=0;    
    }

    public int averageOfSubtree(TreeNode root) {
        return fun(root).ans;
    }

    public pair fun(TreeNode root){
        if(root==null) return new pair();
        pair right=fun(root.right);
        pair left=fun(root.left);
        pair child=new pair();
        child.sum=right.sum+left.sum+root.val;
        child.count=right.count+left.count+1;
        child.ans=right.ans+left.ans;
        if(child.sum/child.count==root.val) child.ans++;
        return child;

    }
}

