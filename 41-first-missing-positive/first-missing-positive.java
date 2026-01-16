class Solution {
    public int firstMissingPositive(int[] arr) {
        //put the elements in their original positions and then the number which is not
        //present on that particular index will be the mssing nuber and return it
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i+1) continue;
            else {
                int t1=0;
                int t2=0;
                int c=0;
                while(arr[i]>0 && arr[i]<=arr.length && arr[i]!=i+1){
                    swap(arr,arr[i]-1,i);
                    if(c>0 && t1==arr[i]-1 && t2==i) break;
                    c++;
                    t1=arr[i]-1;
                    t2=i;

                }
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1) return i+1;
        }
        return arr.length+1;
    }

    public void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}