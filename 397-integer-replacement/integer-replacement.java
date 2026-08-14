class Solution {
    static int ans;
    public int integerReplacement(int n) {
        ans=Integer.MAX_VALUE;
        fun(1L*n,0);
        return ans;
    }

    public void fun(long n,int s){
        if(n<=1) {
            ans=Math.min(ans,s);
            return;
        }
        if(n%2==0) fun(n/2,s+1);
        else {
            fun(n-1,s+1);
            fun(n+1,s+1);
        }
    }
}