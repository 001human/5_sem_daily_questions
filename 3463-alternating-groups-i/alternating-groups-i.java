class Solution {
    public int numberOfAlternatingGroups(int[] arr) {
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int j=(i+1)%n;
            int k=(i+2)%n;
            if(arr[i]==arr[k] && arr[i]!=arr[j]) ans++;
        }
        return ans;
    }
}