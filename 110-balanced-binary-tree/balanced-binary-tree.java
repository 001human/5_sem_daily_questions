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
class Node{
    int h=0;
    boolean val=true;
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        return fun(root).val;
    }

    public Node fun(TreeNode root){
       if(root==null) return new Node();
       Node left=fun(root.left);
       Node right=fun(root.right);
       Node self=new Node();
       int h1=Math.max(left.h,right.h);
       if(Math.abs(left.h-right.h)>1) self.val=left.val & right.val & false;
       else self.val=left.val & right.val;
       self.h=h1+1;
       return self;
    }
}