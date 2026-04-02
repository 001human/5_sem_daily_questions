class Solution {
    public int captureForts(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==1){

                //front part
                int cur=0;
                int fl=0;
                int fl2=0;
                int j=i+1;
                while(j<arr.length){
                    if(arr[j]==-1) {
                        fl2=1;
                        break;
                    }
                    if(arr[j]==1) {
                        fl=1;
                        break;
                    }
                    j++;
                    cur++;
                }
                if(fl2==1 && fl==0) ans=Math.max(ans,cur);

                //checking for the back part
                cur=0;
                fl=0;
                j=i-1;
                fl2=0;
                while(j>=0){
                    if(arr[j]==-1) {
                        fl2=1;
                        break;
                    }
                    if(arr[j]==1){
                        fl=1;
                        break;
                    }
                    j--;
                    cur++;
                }
                if(fl2==1 && fl==0) ans=Math.max(ans,cur);
            }
        }
        return ans;
    }
}