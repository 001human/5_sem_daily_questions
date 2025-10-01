class Solution {
    public boolean checkInclusion(String p, String s) {
        int[]fre1=new int[26];
        for(int i=0;i<p.length();i++){
            fre1[p.charAt(i)-'a']++;
        }
        if(p.length()>s.length()) return false;
        int r=p.length();
        int l=0;
        int[]fre2=new int[26];
        for(int i=0;i<p.length();i++){
            fre2[s.charAt(i)-'a']++;
        }

        boolean fl=false;
        for(int i=0;i<26;i++){
            if(fre1[i]!=fre2[i]){
                fl=true;
                break;
            }
        }

        if(fl==false) return true;
        while(r<s.length()){
            char ch=s.charAt(r);
            fre2[ch-'a']++;
            fre2[s.charAt(l)-'a']--;
            l++;
            boolean flag=false;
            for(int i=0;i<26;i++){
            if(fre1[i]!=fre2[i]){
                    flag=true;
                    break;
                }
            }
            if(flag==false) return true;
            
            r++;
        }
        return false;
    }
}

