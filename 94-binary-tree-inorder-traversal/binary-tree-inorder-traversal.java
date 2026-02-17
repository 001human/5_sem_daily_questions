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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode>st=new Stack<>();
        st.add(root);
        while(!st.isEmpty()){
            TreeNode t=st.pop();
            if(t.right!=null){
                st.add(t.right);
                t.right=null;
            }
            TreeNode lf=null;
            if(t.left!=null){
                lf=t.left;
                t.left=null;
            }
            st.push(t);
            if(lf!=null) st.push(lf);
            if(st.peek().left==null && st.peek().right==null){
                ans.add(st.pop().val);
            }
        }
        return ans;
    }
}