class Solution {
    public int largestPrime(int n) {
        boolean[]arr=new boolean[n+1];
        List<Integer>temp=new ArrayList<>();
        countPrimes(n,temp,arr);
        int ans=0;
        int sum=0;
        for(int i=0;i<temp.size();i++){
            sum+=temp.get(i);
            if(sum>n) break;
            if(arr[sum]==false) ans=sum;
        }
        return ans;
    }

    public void countPrimes(int n,List<Integer>temp,boolean[]arr) {
        
        for(int i=2;i<=n;i++){
            if(arr[i]) continue;
            temp.add(i);
            for(long j=(long)i*i;j<=n;j+=i){
                arr[(int)j]=true;
            }
        }
    }
}
