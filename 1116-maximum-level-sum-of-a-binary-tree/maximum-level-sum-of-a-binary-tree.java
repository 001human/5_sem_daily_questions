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
        q.add(root);
        int idx=1;
        int ans=0;
        int sum=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int s=q.size();
            int temp=0;
            for(int i=0;i<s;i++){
                TreeNode p=q.poll();
                temp+=p.val;
                if(p.left!=null) q.add(p.left);
                if(p.right!=null) q.add(p.right);
            }
            if(temp>sum) {
                ans=idx;
                sum=temp;
            }
            if(temp==sum) ans=Math.min(ans,idx);
            idx++;
        }
        return ans;
    }
}