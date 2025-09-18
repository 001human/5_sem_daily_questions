class Solution {
    public int numberOfSubstrings(String s) {
        int a=0;
        int b=0;
        int c=0;
        int r=0;
        int l=0;
        int ans=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(ch=='a') a++;
            else if(ch=='b') b++;
            else c++;
            while(a>0 && b>0 && c>0){
                char ch1=s.charAt(l);
                if(ch1=='a') a--;
                else if(ch1=='b') b--;
                else c--;
                l++;
                ans+=s.length()-r;
            }
            r++;
        }
        return ans;
    }
}



