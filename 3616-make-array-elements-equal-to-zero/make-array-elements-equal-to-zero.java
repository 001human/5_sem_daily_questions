class Solution {
    static int ans;
    public int countValidSelections(int[] arr) {
        ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                fun(arr,i,1); 
                fun(arr,i,0);
                 //1 means right direction and 0 means left
            }
        }
        return ans;
    }

    public void fun(int[]arr,int i,int d){

        if(i>=arr.length || i<0){
            boolean fl=false;
            for(int num:arr){
                if(num!=0){
                    fl=true;
                    break;
                }
            }
            if(fl==false) ans++;
            return;
        } 

        if(arr[i]==0) {
            if(d==1) fun(arr,i+1,1);
            else fun(arr,i-1,0);
        }

        if(arr[i]!=0){
            arr[i]--;
            if(d==0) fun(arr,i+1,1);
            else fun(arr,i-1,0);
            arr[i]++;
        }

    }
}