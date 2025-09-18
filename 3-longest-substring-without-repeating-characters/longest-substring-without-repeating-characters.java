class Solution {
    public int lengthOfLongestSubstring(String s) {
        int []arr=new int[256];
        int r=0;
        int l=0;
        int ans=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            arr[ch]++;
            while(arr[ch]>1){
                char ch1=s.charAt(l);
                arr[ch1]--;
                l++;
            }
            ans=Math.max(r-l+1,ans);
            r++;
        }
        return ans;
    }
}
