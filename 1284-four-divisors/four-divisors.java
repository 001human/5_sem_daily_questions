class Solution {
    public int sumFourDivisors(int[] arr) {
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=fun(arr[i]);
        }
        return ans;
    }

    public int fun(int n){
        int count=0;
        int sum=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                sum+=i;
                count++;
                if(i!=n/i){
                    count++;
                    sum+=n/i;
                }
            }
            if(count>4) break;
        }
        if(count==4){
            return sum;
        }
        return 0;
    }
}
