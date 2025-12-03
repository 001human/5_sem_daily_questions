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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer>temp=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode r=q.poll();
                temp.add(r.val);
                if(r.left!=null) q.add(r.left);
                if(r.right!=null) q.add(r.right);
            }
            ans.add(temp);
        }
        return ans;
    }
}