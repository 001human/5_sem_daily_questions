class Solution {
    public int maxDistance(int[] arr1, int[] arr2) {
        // arr1<=arr2 && i<=j
        int ans=0;
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length ){
            if(arr1[i]<=arr2[j] ){
                if(i<=j) {
                    ans=Math.max(ans,j-i);
                    j++;
                    }
                else j++;
            }
                else if(arr1[i]>arr2[j]) i++;
                
        }
        // ans=Math.max(ans,j-i);
        return ans;
    }
}