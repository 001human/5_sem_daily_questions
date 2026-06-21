class Solution {
    public int maxIceCream(int[] arr, int t) {
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(t>=arr[i]){
                t-=arr[i];
                ans++;
            }
        }
        return ans;
    }
}