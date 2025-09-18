class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int ans=0;
        int[]arr=new int[26];
        int maxf=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            arr[ch-'A']++;
            maxf=Math.max(maxf,arr[ch-'A']);
            while((r-l+1)-maxf>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}
