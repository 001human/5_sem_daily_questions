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
    static int max;
    static int ans;
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        max=Integer.MIN_VALUE;
        ans=0;
        q.add(root);
        fun(root,q);
        return ans;
    }

    public void fun(TreeNode root,Queue<TreeNode>q){
        int x=0;
        while(!q.isEmpty()){
            int s=q.size();
            int sum=0;
            for(int i=0;i<s;i++){
                TreeNode r=q.remove();
                sum+=r.val;
                if(r.left!=null) q.add(r.left);
                if(r.right!=null) q.add(r.right);
            }
            x++;
            if(sum>max){
                max=sum;
                ans=x;
            }
        }
    }
}
