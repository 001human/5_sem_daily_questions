class Solution {
    public boolean asteroidsDestroyed(int mn, int[] arr) {
        Arrays.sort(arr);
        long m=mn;
        for(int i=0;i<arr.length;i++){
            if(m>=arr[i]) m+=arr[i];
            // else if(m>arr[arr.length-1]) return true;
            else return false;
        }
        return true;
    }
}