class Solution {
    public int maxRepeating(String s, String x) {
        String w=x;
        int ans=0;
        int t=0;
        for(int i=0;i<=100;i++){
            if(s.contains(w)){
                t++;
                ans=Math.max(ans,t);
                w=w+x;
            }
            else return ans;
        }
        return -1;
    }
}