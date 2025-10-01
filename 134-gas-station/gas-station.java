class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int t=0;
        for(int n:gas){
            t+=n;
        }
        int c=0;
        for(int n:cost){
            c+=n;
        }
        if((t-c)<0) return -1;
        int tank=0;
        int ans=0;
        for(int i=0;i<gas.length;i++){
            tank+=(gas[i]-cost[i]);
            if(tank<0) {
                tank=0;
                ans=i+1;
            } 
        }
        return ans;
    }
}