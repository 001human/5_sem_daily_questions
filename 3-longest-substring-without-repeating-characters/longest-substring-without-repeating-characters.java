class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int []arr=new int[256];
        int ans=0;
        int left=0;
        int right=0;
        int c=1;
        while(right<s.length()){
            char ch=s.charAt(right);
            arr[ch]++;
            
            while(left<s.length() && arr[ch]>1){
                arr[s.charAt(left)]--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}