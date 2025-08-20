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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return create(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }

    public TreeNode create(int[] inorder,int ilo,int ihi,int[] postorder,int plo,int phi){
        if(ilo>ihi || plo>phi) return null;
        TreeNode root=new TreeNode();
        root.val=postorder[phi];
        int index=find(inorder,ilo,ihi,root.val);
        int c=index-ilo;
        root.left=create(inorder,ilo,index-1,postorder,plo,plo+c-1);
        root.right=create(inorder,index+1,ihi,postorder,plo+c,phi-1);
        return root;
    }

    public int find(int[]arr,int start,int end,int item){
        for(int i=start;i<=end;i++){
            if(arr[i]==item) return i;
        }
        return -1;
    }
}