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

 // O(n)
class Solution {
    public boolean isBalanced(TreeNode root) {
        return balance(root).bal;
    }

    public diapair balance(TreeNode root){
        if(root==null) return new diapair();
        diapair ldp=balance(root.left);
        diapair rdp=balance(root.right);
        diapair sdp=new diapair();
        sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
        boolean sbbal=Math.abs(ldp.ht-rdp.ht)<=1;
        sdp.bal=sbbal && ldp.bal && rdp.bal;
        return sdp; 
    }

    class diapair{
        boolean bal=true;
        int ht=-1;
    }
}



// O(n2)
// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         if(root==null) return true;
//         boolean left=isBalanced(root.left);
//         boolean right=isBalanced(root.right);
//         if(Math.abs(height(root.left)-height(root.right))>1) return false;
//         return left && right;
//     }

//     public int height(TreeNode root){
//         if(root==null) return -1;
//         int ld=height(root.left);
//         int rd=height(root.right);
//         return Math.max(ld,rd)+1;
//     }
// }


// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         if(root==null) return true;
//         int left=height(root.left);
//         int right=height(root.right);
//         if(Math.abs(left-right)>1) return false;
//         return isBalanced(root.left) && isBalanced(root.right);
//     }

//     public int height(TreeNode root){
//         if(root==null) return -1;
//         int ld=height(root.left);
//         int rd=height(root.right);
//         return Math.max(ld,rd)+1;
//     }
// }