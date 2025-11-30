class Solution {
    public String fractionAddition(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='/') c++;
        }
        int[]n=new int[c];
        int[]d=new int[c];
        int index=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='/'){
                int num=s.charAt(i-1)-'0';
                boolean pos=true;
                if(i-2>=0){
                    if(s.charAt(i-2)=='1'){
                        num=10;
                        if(i-3>=0) {
                            if(s.charAt(i-3)=='-') pos=false;
                        }
                    }
                    else if (s.charAt(i-2)=='-') pos=false;
                }
                if(pos==false) num=num*-1;
                n[index]=num;
                d[index]=s.charAt(i+1)-'0';
                if((i+2)<s.length()){
                    if(s.charAt(i+2)=='0') d[index]=10;
                }
                index++;
            }
        }
        
        int lcm = d[0];
        for (int i = 1; i < d.length; i++) {
            lcm = lcm * d[i] / gcd(lcm, d[i]);
        }

        int ans=0;
        for(int i=0;i<d.length;i++){
            int temp=lcm/d[i];
            ans+=(temp*n[i]);
        }

        for(int i=2;i<=9;i++){
            while(ans%i==0 && lcm%i==0){
                ans=ans/i;
                lcm=lcm/i;
            }
        }
        
        return String.valueOf(ans+"/"+lcm);
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}