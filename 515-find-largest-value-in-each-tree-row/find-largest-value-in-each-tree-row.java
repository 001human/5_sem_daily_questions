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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        List<Integer>ans=new ArrayList<>();
        if(root==null) return ans;
        q.add(root);
        fun(root,q,ans);
        return ans;
    }

    public void fun(TreeNode root,Queue<TreeNode>q,List<Integer>ans){
        while(!q.isEmpty()){
            int s = q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<s;i++){
                TreeNode r=q.remove();
                max=Math.max(max,r.val);
                if(r.left!=null) q.add(r.left);
                if(r.right!=null) q.add(r.right);
            }
            ans.add(max);
        }
    }
}