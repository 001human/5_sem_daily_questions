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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int change=0;
        while(!q.isEmpty()){
            int s=q.size();
            if(change==0){
                int pre=0;
                for(int i=0;i<s;i++){
                    TreeNode r=q.remove();
                    if(r.val%2==0 || r.val<=pre) return false;
                    else {
                        pre=r.val;
                        if(r.left!=null) q.add(r.left);
                        if(r.right!=null) q.add(r.right);
                    }
                }
            }
            else{
                int pre=Integer.MAX_VALUE;
                for(int i=0;i<s;i++){
                    TreeNode r=q.remove();
                    if(r.val%2==1 || r.val>=pre) return false;
                    else {
                        pre=r.val;
                        if(r.left!=null) q.add(r.left);
                        if(r.right!=null) q.add(r.right);
                    }
                }
            }
            change=change^1;
        }
        return true;
    }
}