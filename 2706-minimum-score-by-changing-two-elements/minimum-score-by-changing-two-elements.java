class Solution {
    public int minimizeSum(int[] arr) {
        // high score = lst and last element
        //low score = 1st and 2nd element
        Arrays.sort(arr);
        if(arr.length==3) return 0;
        int n=arr.length;
       
        int ans=0;
        int ft=arr[0];
        for(int i=1;i<arr.length-2;i++){
            ans=Math.max(ans,arr[i]-ft);
        }
        int max=0;
        for(int i=2;i<arr.length-1;i++){
            max=Math.max(arr[n-1]-arr[i],max);
        }
        int dif=arr[n-2]-arr[1];
        return Math.min(dif, Math.min(max,ans)); 
    }
}