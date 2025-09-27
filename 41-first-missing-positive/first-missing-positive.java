class Solution {
    public int firstMissingPositive(int[] arr) {
        //O(n) and O(1)
        //first swap numbers to original positions
    //     int n=arr.length;
    //     for(int i=0;i<n;i++){
    //         while(arr[i]>0 && arr[i]<=n && arr[i]!=i+1 ){
    //             swap(i,arr[i]-1,arr);
    //         }
    //     }

    //     for(int i=0;i<n;i++){
    //         if(arr[i]!=i+1) return i+1;
    //     }
    //     return n+1;
    // }

    // public void swap(int i,int j,int[]arr){
    //     int temp=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
    // }
        int n=arr.length;
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(arr[i]==1) flag=true;
            if(arr[i]<=0 || arr[i]>n) arr[i]=1;
        }
        if(flag==false) return 1;
        for(int i=0;i<n;i++){
            int x=Math.abs(arr[i]);
            if(arr[x-1]>0) arr[x-1]*=-1;
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0) return i+1;
        }
        return n+1;
    }
}

