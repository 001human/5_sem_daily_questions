class Solution {
    public long perfectPairs(int[] arr) {
        //dif bw max an min cab b max 2 from both dir max<=2*min
        for(int i=0;i<arr.length;i++){
            arr[i]=Math.abs(arr[i]);
        }
        Arrays.sort(arr);
        long ans=0;
        for(int i=1;i<arr.length;i++){
            ans+=pos(i,arr);
        }
        return ans;
    }

    public int pos(int st,int []arr){
        int end=arr.length-1;
        int start=st;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[st-1]*2>=arr[mid]){
                ans=mid;
                start=mid+1;
            }
            else end=mid-1;
        }
        if(ans==-1) return 0;
        return ans-st+1;
    }
}//1234