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
//  TC=n
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val<key){
            root.right=deleteNode(root.right,key);
        }
        else if(root.val>key){
            root.left=deleteNode(root.left,key);
        }
        else {
            //0 or 1 child
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            //2 child(left ka max or right ka min)
            else {
                int m=max(root.left);
                root.left=deleteNode(root.left,m);
                root.val=m;
            }
        }
        return root;
    }

    public int max(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,max(root.right));
    }
}
