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
    public int[] findFrequentTreeSum(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        max=0;
        HashMap<Integer,Integer>map=new HashMap<>();        
        fun(root,ans,map); 
        List<Integer>tmp=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)==max) tmp.add(key);
        }

        int[]fin=new int[tmp.size()];
        for(int i=0;i<tmp.size();i++){
            fin[i]=tmp.get(i);
        }
        return fin;
    }
    public int fun(TreeNode root,List<Integer>ans,HashMap<Integer,Integer>map){
        if(root==null) return 0;
        int left=fun(root.left,ans,map);
        int right=fun(root.right,ans,map);
        int sum=left+right+root.val;
        ans.add(sum);
        map.put(sum,map.getOrDefault(sum,0)+1);
        max=Math.max(max,map.get(sum));
        return sum;
    }
}