class Solution {
    public int countPrimes(int n) {
        boolean[]arr=new boolean[n];
        int ans=0;
        for(int i=2;i<n;i++){
            if(arr[i]) continue;
            ans++;
            for(long j=(long)i*i;j<n;j+=i){
                arr[(int)j]=true;
            }
        }
        return ans;
    }
}

