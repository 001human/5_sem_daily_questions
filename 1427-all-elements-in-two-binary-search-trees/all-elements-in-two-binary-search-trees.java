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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>a1=new ArrayList<>();
        fun(root1,a1);
        fun(root2,a1);
        Collections.sort(a1);
        return a1;
    }

    public void fun(TreeNode root,List<Integer>arr){
        if(root==null) return;
        fun(root.left,arr);
        arr.add(root.val);
        fun(root.right,arr);
    }
}