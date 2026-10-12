class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start=0;
        int end=arr.length-1;
        List<Integer>ans=new ArrayList<>();
        while(start<=end){
            if(end-start+1==k) {
                for(int i=start;i<=end;i++){
                    ans.add(arr[i]);
                }
                break;
            }
            else if(Math.abs(arr[start]-x)>Math.abs(arr[end]-x)) start++;
            else if((Math.abs(arr[start]-x)<Math.abs(arr[end]-x))) end--;
            else{
                if(Math.abs(arr[start]-x)==Math.abs(arr[end]-x)){
                    if(arr[start]<arr[end]) end--;
                    else start++;
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}