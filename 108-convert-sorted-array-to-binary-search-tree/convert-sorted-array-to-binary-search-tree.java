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
    public TreeNode sortedArrayToBST(int[] arr) {
        TreeNode root=fun(arr,0,arr.length-1);
        return root;
    }

    public TreeNode fun(int[]arr,int start,int end){
        if(start>end) return null;
        int mid=start+(end-start)/2;
        TreeNode nn=new TreeNode();
        nn.val=arr[mid];
        nn.left=fun(arr,start,mid-1);
        nn.right=fun(arr,mid+1,end);
        return nn;
    }

}