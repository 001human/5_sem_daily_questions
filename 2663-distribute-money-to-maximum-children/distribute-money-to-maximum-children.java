class Solution {
    public int distMoney(int m, int c) {
        if(m<c) return -1;
        if(m<8) return 0;
        int a=m/8;
        int rem=m%8;
        // if(m%8==0){
        //     if(m/8==c) return m/8;
        //     if(m/8>c) return c;
        //     if(m/8<c){
        //         if((m-8*(a-1))>=c) return a-1;
        //         return 0;
        //     }
        // }
        // if(rem==4 && (c-a)==1) return a-1;
        // if(rem>=c-a) return a;
        // return 0;
        if(a==c && rem==0) return c;
        if(a>=c) return c-1;
        if(rem==4 && c-a==1) return c-2;
        if(rem>=c-a) return a;
        int val=c-a;
        while(rem<val){
            val++;
            rem+=8;
            a--;
        }
        return a;
    }
}