class Solution {
    public long maximumSubsequenceCount(String s, String p) {
        //add pattern[0] at  begin and [1] at end
        long ans=0;
        long c1=0,c2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==p.charAt(1)){
                ans+=c1;
                c2++;
            }
            if(s.charAt(i)==p.charAt(0)) c1++;
        }
        return ans+Math.max(c1,c2);
    }
}