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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode>q=new LinkedList<>();
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        q.offer(root);
        fun(q,ans);
        return ans;
    }

    public void fun(Deque<TreeNode>q,List<List<Integer>>ans){
        boolean rev=false;
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer>temp=new ArrayList<>();
            for(int i=0;i<s;i++){
                if(!rev){
                    TreeNode r=q.pollFirst();
                    temp.add(r.val);
                    if(r.left!=null) q.addLast(r.left);
                    if(r.right!=null) q.addLast(r.right);
                }
                else {
                    TreeNode r=q.pollLast();
                    temp.add(r.val);
                    if(r.right!=null) q.addFirst(r.right);
                    if(r.left!=null) q.addFirst(r.left);
                }
            }
            ans.add(temp);
            rev=!rev;
        }
    }
}