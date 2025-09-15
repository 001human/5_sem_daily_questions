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

    public long fun(long exp,long base){ //binary exponentiation
        long ans=1;
        while(exp>0){
            if(exp%2==0){
                base=(base*base)%mod;
                exp=exp/2;
            }
            else{
                ans=(ans*base)%mod;
                exp-=1;
            }
        }
        return ans;
    }
}