class Solution {
    static int mod=1000000007;
    public int concatenatedBinary(int n) {
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++){
            String s=Integer.toBinaryString(i);
            sb.append(s);
        }
        String s=String.valueOf(sb);
        long ans=0%mod;
        long mul=1%mod;
        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)=='1'){
                ans=((ans+mul)%mod+0L)%mod;
            }
            mul=(1L*mul*2)%mod;
            i--;
        }
        return (int)ans%mod;
    }
}