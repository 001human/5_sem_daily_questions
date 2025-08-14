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

    class pair{
        TreeNode Node;
        int index;
        public pair(TreeNode Node, int index){
            this.Node=Node;
            this.index=index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        Queue<pair>q=new LinkedList<>();
        int width=0;
        q.add(new pair(root,0));
        while(!q.isEmpty()){
            pair start=q.peek();
            int s=q.size();
            pair end=null;
            for(int i=0;i<s;i++){
                end=q.poll();
                if(end.Node.left!=null) q.add(new pair(end.Node.left,2*end.index+1));
                if(end.Node.right!=null) q.add(new pair(end.Node.right,2*end.index+2));
            }
            width=Math.max(width,end.index-start.index+1);
        }
        return width;
    }    
}