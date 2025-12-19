class Solution {
    public int[] twoSum(int[] arr, int target) {
       
        int x=0,y=0;
        int n=arr.length;
        int []temp=new int [n];
        for (int i=0;i<n;i++){
            temp[i]=arr[i];
        }
         Arrays.sort(arr);
        int []ar=new int[2];
        int start=0;
        int end=n-1;
        while(start<end){
            if(arr[start]+arr[end]==target){
                x=arr[start];
                y=arr[end];
                break;
            }
            else if(arr[start]+arr[end]>target){
                end--;
            }
            else{
                start++;
            }
        }
        for (int i=0;i<n;i++){
            if(x==temp[i]){
                ar[0]=i;
                break;
            }
        }
        for (int i=n-1;i>=0;i--){
            if(y==temp[i]){
                ar[1]=i;
                break;
            }
        }
        return ar;
    }
}

