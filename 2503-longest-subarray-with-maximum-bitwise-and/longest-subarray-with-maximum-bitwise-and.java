class Solution {
    public int longestSubarray(int[] arr) {
        //find the max number as it will be the max possible 
        int max=0;
        for(int n:arr){
            max=Math.max(max,n);
        }
        //find max length of continuous max number
        int max_len=1;
        int cur=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                cur++;
                max_len=Math.max(max_len,cur);
            }
            else{
                cur=0;
            }
        }
        return max_len;
    }
}