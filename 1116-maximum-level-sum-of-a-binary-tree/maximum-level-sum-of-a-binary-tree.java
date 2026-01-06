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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        long sum=Integer.MIN_VALUE;
        int ans=0;
        q.add(root);
        int l=0;
        while(!q.isEmpty()){
            int s=q.size();
            long t=0;
            for(int i=0;i<s;i++){
                TreeNode r=q.poll();
                t+=r.val;
                if(r.left!=null) q.add(r.left);
                if(r.right!=null) q.add(r.right);
            }
            l++;
            if(t>sum){
                sum=t;
                ans=l;
            }
        }
        return ans;
    }
}