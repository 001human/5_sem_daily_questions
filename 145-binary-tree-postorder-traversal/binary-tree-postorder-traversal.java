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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode>st=new Stack<>();
        st.add(root);
        while(!st.isEmpty()){
            TreeNode l=st.peek();
            if(l.right!=null){
                TreeNode temp=l.right;
                l.right=null;
                st.push(temp);
            } 
            if(l.left!=null){
                TreeNode temp=l.left;
                l.left=null;
                st.push(temp);
            }
            if(st.peek().left==null && st.peek().right==null) ans.add(st.pop().val);
        }
        return ans;
    }    
}