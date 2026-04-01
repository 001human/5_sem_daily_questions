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
    public TreeNode reverseOddLevels(TreeNode root) {
        Deque<TreeNode>q=new ArrayDeque<>();
        q.add(root);
        fun(q);
        return root;
    }

    public void fun(Deque<TreeNode>q ){
        int l=0;
        while(!q.isEmpty()){
            List<TreeNode>ls=new ArrayList<>();
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode r=q.poll();
                ls.add(r);
                if(r.left!=null) q.add(r.left);
                if(r.right!=null) q.add(r.right);
            }
            if(l%2==1) swap(ls);
            l++;
        }
    }

    public void swap(List<TreeNode>ls){
        int i=0;
        int j=ls.size()-1;
        while(i<j){
            TreeNode a=ls.get(i);
            TreeNode b=ls.get(j);
            int temp=a.val;
            a.val=b.val;
            b.val=temp;
            i++;
            j--;
        }
    }
}