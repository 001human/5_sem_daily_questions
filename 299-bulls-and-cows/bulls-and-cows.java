class Solution {
    public String getHint(String secret, String guess) {
        StringBuilder sb=new StringBuilder(String.valueOf(secret));
        StringBuilder sb1=new StringBuilder(String.valueOf(guess));
        int []s=new int[10];
        int []g=new int[10];
        int b=0;
        int c=0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                sb.setCharAt(i,'#');
                sb1.setCharAt(i,'#');
                b++;
            }
        }

        for(int i=0;i<sb.length();i++){
           if(sb.charAt(i)!='#') s[sb.charAt(i)-'0']++;
        }

        for(int i=0;i<sb.length();i++){
            if(sb1.charAt(i)!='#') g[sb1.charAt(i)-'0']++;
        }

        for(int i=0;i<10;i++){
            if(s[i]!=0 && g[i]!=0) c+=Math.min(s[i],g[i]);
        }

        return b+"A"+c+"B";
    }
}