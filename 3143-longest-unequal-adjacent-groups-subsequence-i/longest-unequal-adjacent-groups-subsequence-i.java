class Solution {
    public List<String> getLongestSubsequence(String[] w, int[] g) {
        List<String>ans=new ArrayList<>();
        int pre=g[0];
        ans.add(w[0]);
        for(int i=1;i<w.length;i++){
            if(g[i]!=pre){
                pre=g[i];
                ans.add(w[i]);
            }
            else continue;
        }
        return ans;
    }
}