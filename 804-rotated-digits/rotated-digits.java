class Solution {
    static int[]ls={0,1,5,-1,-1,2,9,-1,8,6};
    public int rotatedDigits(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            ans+=fun(i);
        }
        return ans;
    }

    public int fun(int n){
        String s=String.valueOf(n);
        boolean check=false;
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i)-'0';
            if(ls[ch]==-1 ) return 0;
            if(ls[ch]!=ch) check=true;
        }
        if(check) return 1;
        return 0;
    }
}