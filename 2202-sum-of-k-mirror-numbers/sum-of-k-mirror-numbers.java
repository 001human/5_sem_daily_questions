class Solution {
    public long kMirror(int k, int n) {
        //converting into base k
        long sum=0;
        int l=1;
        while(n>0){
            long half=(l+1)/2;
            long min=(long)Math.pow(10,half-1);
            long max=(long)Math.pow(10,half)-1;
            for(long num=min;num<=max;num++){
                StringBuilder sb=new StringBuilder(String.valueOf(num));
                String rev=sb.reverse().toString();
                String pal=String.valueOf(num);
                if(l%2==1) pal=pal+rev.substring(1);
                else pal=pal+rev;
                if(base(Long.parseLong(pal),k)){
                    sum+=Long.parseLong(pal);
                    n--;
                    if(n==0) break;
                }
            }
            l++;
        }
        return sum;
    }

    public boolean base(long n,int k){
        StringBuilder sb=new StringBuilder();
        while(n!=0){
            long rem=n%k;
            sb.append(rem);
            n=n/k;
        }
        String s=sb.toString();
        return sb.reverse().toString().equals(s);
    }
}