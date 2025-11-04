class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        //keep cost1 constant or cost2 constant 
        long a=total/cost1;
        long ans1=0;
        long ans2=0;
        for(long i=0;i<=a;i++){
            long q=cost1*i;
            long rem=(total-q)/cost2;
            ans1+=(rem+1);
        }

        long b=total/cost2;
        for(long i=0;i<=b;i++){
            long q=cost2*i;
            long rem=(total-q)/cost1;
            ans2+=(rem+1);
        }
        return Math.max(ans1,ans2);
    }
}