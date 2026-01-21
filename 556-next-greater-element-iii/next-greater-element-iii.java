class Solution {
    public int nextGreaterElement(int n) {
        String s=String.valueOf(n);
        int[]arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i)-'0';
        }
        long ans= Long.parseLong(nextPermutation(arr));
        if(ans<=n || ans>Integer.MAX_VALUE) return -1;
        return (int)ans;
    }
    public String nextPermutation(int[] arr) {
        int n=arr.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
             reverseArray(arr,0,n-1);   
        }

        else{  
            int j=-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>arr[index]){
                j=i;
                break;
            }
        }

        swap(arr,index,j);
        reverseArray(arr,index+1,n-1);
        }
        String ans="";
        for(int i=0;i<arr.length;i++){
            ans+=arr[i]+"";
        }
        return ans;

    }

    public static void reverseArray(int[] array,int n,int m) {
        int start = n;
        int end = m;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
       
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}