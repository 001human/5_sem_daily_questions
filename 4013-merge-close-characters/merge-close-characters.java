class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int[]fre=new int[26];
        int del=0;
        Arrays.fill(fre,-1);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(fre[ch-'a']==-1){
                fre[ch-'a']=i-del;
                sb.append(ch);
            }
            else{
                int t=fre[ch-'a'];
                if(Math.abs(i-del-t)<=k) del++;
                else {
                    fre[ch-'a']=i-del;
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
