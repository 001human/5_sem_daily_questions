class Solution {
    public String minWindow(String s, String t) {
        int ans=Integer.MAX_VALUE;
        String fin="";
        if(t.length()>s.length()) return "";
        int[]fre1=new int[52];
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(ch>='A' && ch<='Z') fre1[ch-'A']++;
            else fre1[ch-'a'+26]++;
        }

        int[]fre2=new int[52];
        int l=0;
        int r=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(ch>='A' && ch<='Z') fre2[ch-'A']++;
            else fre2[ch-'a'+26]++;
            boolean flag=true;
            for(int i=0;i<52;i++){
            if(fre1[i]>0){
                if(fre2[i]>=fre1[i]) continue;
                else {
                    flag = false;
                    break;
                    }
                }
            }

            while(flag){

                for(int i=0;i<52;i++){
                if(fre1[i]>0){
                    if(fre1[i]<=fre2[i]) continue;
                    else {
                        flag = false;
                        break;
                        }
                    }
                }
                if(flag==true){
                    if((r-l+1)<ans){
                        fin=s.substring(l,r+1);
                        ans=r-l+1;
                    }
                    char ch1=s.charAt(l);
                    if(ch1>='A' && ch1<='Z') fre2[ch1-'A']--;
                    else fre2[ch1-'a'+26]--;
                    l++;
                }

            }
            
            r++;
        }
        return fin;
    }
}