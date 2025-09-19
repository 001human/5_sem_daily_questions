class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int one=0;
        int zero=0;
        int r=0;
        int l=0;
        int ans=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(ch=='0') zero++;
            else one++;
            while(one>k && zero>k){
                // ans+=(s.length()-r);
                char ch1=s.charAt(l);
                if(ch1=='0') zero--;
                else one--;
                l++;
            }
            ans+=(r-l+1);
            r++;
        }
        return ans;
    }
}
