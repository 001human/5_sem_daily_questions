class Solution {
    public int[] pivotArray(int[] arr, int p) {
        int[]arr1=new int[arr.length];
        Arrays.fill(arr1,Integer.MAX_VALUE);
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<p) arr1[idx++]=arr[i];
        }

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==p) count++;
        }

        int[]arr2=new int[arr.length];
        Arrays.fill(arr2,Integer.MAX_VALUE);
        idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>p) arr2[idx++]=arr[i];
        }

        idx=0;
        int[]ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr1[i]!=Integer.MAX_VALUE) ans[idx++]=arr1[i];
            else break;
        }
        
        while(count-->0){
            ans[idx++]=p;
        }

        for(int i=0;i<arr.length;i++){
            if(arr2[i]!=Integer.MAX_VALUE) ans[idx++]=arr2[i];
        }
        return ans;
    }
}