class Solution {
    public int maximumLengthSubstring(String s) {
        int[]fre=new int[26];
        int r=0;
        int l=0;
        int ans=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            fre[ch-'a']++;
            while(fre[ch-'a']>2){
                char ch1=s.charAt(l);
                fre[ch1-'a']--;
                l++;
            }
            ans=Math.max(ans,(r-l+1));
            r++;
        }
        return ans;
    }
}