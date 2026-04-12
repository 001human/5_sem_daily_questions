class Solution {
    public int minOperations(int[] arr) {
        int ans=0;
        int n=110000;
        boolean[]temp=new boolean[n+1];
        temp[0]=true;
        temp[1]=true;
        for(int i=2;i*i<n;i++){
            if(temp[i]) continue;
            for(long j=(long)i*i;j<n;j+=i){
                temp[(int)j]=true;
            }
        }
     
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                if(temp[arr[i]]==false ) continue;
                else ans+=(find(temp ,arr[i]) -arr[i] );
            }
            else{
                if(arr[i]==2) ans+=2;
                else if(temp[arr[i]]==false) ans++;
                else continue;
            }
        }
        return ans;
    }

    public int find(boolean[]arr,int n){
        for(int i=n+1;i<arr.length;i++){
            if(arr[i]==false && i>n) return i;
        }
        return n;
    }



}