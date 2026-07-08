class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        //sliding window for true
        int l=0;
        int r=0;
        int ans=0;
        int n=s.length();
        int c=0;
        while(r<n){
            char ch=s.charAt(r);
            if(ch=='F' && c<=k ) c++;

            while(c>k){
                char ch1=s.charAt(l);
                if(ch1=='F') c--;
                l++;
            }
            ans=Math.max(ans,(r-l+1));
            r++;
        }
        
        l=0;
        r=0;
        c=0;
        //sliding window for false
        while(r<n){
            char ch=s.charAt(r);
            if(ch=='T' && c<=k ) c++;

            while(c>k){
                char ch1=s.charAt(l);
                if(ch1=='T') c--;
                l++;
            }
            ans=Math.max(ans,(r-l+1));
            r++;
        }
        return ans;
    }
}