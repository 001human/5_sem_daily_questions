class Solution {
    public int findPairs(int[] arr, int k) {
        Arrays.sort(arr);
        HashSet<List<Integer>>set=new HashSet<>();
        for(int i=0;i<arr.length-1;i++){
            int val=find(arr,k,i+1);
            if(val!=Integer.MAX_VALUE) {
                List<Integer>temp=new ArrayList<>();
                temp.add(arr[i]);
                temp.add(val);
                set.add(temp);
            }
            
        }
        return set.size();
    }

    public int find(int[]arr,int k,int start){
        int in=start-1;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(Math.abs(arr[in]-arr[mid])==k) return arr[mid];
            else if(Math.abs(arr[in]-arr[mid])>k) end=mid-1;
            else start=mid+1; 
        }
        return Integer.MAX_VALUE;
    }
}