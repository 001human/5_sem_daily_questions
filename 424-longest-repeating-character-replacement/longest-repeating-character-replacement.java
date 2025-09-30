class Solution {
    public int characterReplacement(String s, int k) {
        int[]arr=new int[26];
        int r=0;
        int l=0;
        int ans=0;
        int maxf=0;
        while(r<s.length()){
            arr[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,arr[s.charAt(r)-'A']);
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

