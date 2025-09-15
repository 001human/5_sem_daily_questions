class Solution {
    public double myPow(double x, int n) {
        if(x==1 ) return x;
        if(x==-1 && n==Integer.MIN_VALUE) return (double)1;
        if(x==-1 && n==Integer.MAX_VALUE) return x;
        if( n==Integer.MIN_VALUE) return (double)0;
        double a=fun(x,Math.abs(n));
        if(n<0) return 1/a;
        return a;
    }

    public double fun(double x, int n){
        double ans=1;
        if(n==0) return 1;
        double half=fun(x,n/2);
        ans=half*half;
        if(n%2==1) ans=ans*x;
        return ans;
    }
}

