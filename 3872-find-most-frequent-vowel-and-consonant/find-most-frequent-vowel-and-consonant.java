class Solution {
    public int maxFreqSum(String s) {
        int []fre=new int[26];
        for(int i=0;i<s.length();i++){
            fre[s.charAt(i)-'a']++;
        }
        int c=0;
        int v=0;
        for(int i=0;i<26;i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20){
                v=Math.max(v,fre[i]);
            }
            else c=Math.max(c,fre[i]);
        }
        return v+c;
    }
}