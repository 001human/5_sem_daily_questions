class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[]arr=new int[256];
        int r=0;
        int l=0;
        int ans=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            arr[ch]++;
            while(arr[s.charAt(r)]>1){
                arr[s.charAt(l)]--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}