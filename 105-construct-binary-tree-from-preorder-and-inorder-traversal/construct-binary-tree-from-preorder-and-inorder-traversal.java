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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return createTree(preorder,inorder,0,inorder.length-1,0,preorder.length-1);
    }

    public TreeNode createTree(int[] pre, int[] in,int ilo,int ihi,int plo,int phi){
        if(ilo>ihi || plo>phi) return null;
        TreeNode node=new TreeNode(pre[plo]);
        int index=find(in,ilo,ihi,pre[plo]);
        int c=index-ilo;
        node.left=createTree(pre,in,ilo,index-1,plo+1,plo+c);
        node.right=createTree(pre,in,index+1,ihi,plo+c+1,phi);
        return node;
    }

    public int find(int []in,int low,int high,int itm){
        for(int i=low;i<=high;i++){
            if(in[i]==itm){
                return i;
            }
        }
        return 0;
    }

}