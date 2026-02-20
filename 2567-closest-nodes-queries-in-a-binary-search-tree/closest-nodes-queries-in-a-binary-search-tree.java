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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> q) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        fun(root,temp);
        for(int i=0;i<q.size();i++){
            int low=bs_low(q.get(i),temp);
            int high=bs_high(q.get(i),temp);
            List<Integer>t=new ArrayList<>();
            t.add(low);
            t.add(high);
            ans.add(t);
        }
        return ans;
    }

    public void fun(TreeNode root,List<Integer>temp){
        if(root==null) return ;
        fun(root.left,temp);
        temp.add(root.val);
        fun(root.right,temp);
    }

    public int bs_low(int t,List<Integer>arr){
        int start=0;
        int end=arr.size()-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr.get(mid)<=t){
                ans=Math.max(ans,arr.get(mid));
                start=mid+1;
            }
            else end=mid-1;
        }
        if(ans==-1) return -1;
        return ans;
    }

    public int bs_high(int t,List<Integer>arr){
        int start=0;
        int end=arr.size()-1;
        int ans=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr.get(mid)>=t){
                ans=Math.min(ans,arr.get(mid));
                end=mid-1;
            }
            else start=mid+1;
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}