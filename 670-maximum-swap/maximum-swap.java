class Solution {
    public int maximumSwap(int n) {
        int a=-1;
        int b=-1;
        String s1=String.valueOf(n);
        char[]s=s1.toCharArray();
        for(int i=0;i<s.length;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[j]>s[i]){
                    if(b==-1) b=j;
                    else {
                        if(s[j]>=s[b]) b=j;
                    }
                }
            }
            if(b!=-1){
                char t = s[b];
                s[b]=s[i];
                s[i]=t;
                break;
            }
        }
        String ans=new String(s);
        return Integer.parseInt(ans);
    }
}