class Solution {
    public int removeDuplicates(int[] arr) {
        int i=1;
        Arrays.sort(arr);
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[j-1]){
                arr[i++]=arr[j];
            }
        }
        return i;
    }
}