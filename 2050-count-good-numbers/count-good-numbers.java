class Solution {
    int mod;
    public int countGoodNumbers(long n) {
        mod=1000000007;
        long even=0;
        long odd=0;
        if(n%2==1){
            even=n/2+1;
            odd=n/2;
        }
        else{
            even=n/2;
            odd=n/2;
        }
        return (int)(fun(even,5)*fun(odd,4)%mod);
    }

    public long fun(long b,long a){ //binary exponentiation
        long ans=1;
        if(b==0) return 1;
        long half=fun(b/2,a);
        ans=(half*half)%mod;
        if(b%2==1) ans=(ans*a)%mod;
        return ans;
    }
}