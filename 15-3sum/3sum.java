class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int start=i+1;
            int end=n-1;
            while(start<end){
                int sum=arr[i]+arr[start]+arr[end];
                if(sum==0){
                    ans.add(Arrays.asList(arr[i],arr[start],arr[end]));
                    while(start<end && arr[start]==arr[start+1]) start++;
                    while(start<end && arr[end]==arr[end-1]) end--;
                    start++;
                    end--;
                }
                else if(sum>0) end--;
                else start++;
            }
        }
        return ans;
    }
}