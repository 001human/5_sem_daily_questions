class Solution {
    public boolean canPartitionGrid(int[][] arr) {
        long t=0;
        long[]row=new long[arr.length];
        for(int i=0;i<arr.length;i++){
            long cur=0;
            for(int j=0;j<arr[0].length;j++){
                cur+=arr[i][j];
            }
            row[i]=cur;
            t+=cur;
        }

        long temp=0;
        for(int i=0;i<arr.length;i++){
            temp+=row[i];
            if(temp==(t-temp)) return true;
        }

        
        long[]col=new long[arr[0].length];
        for(int j=0;j<arr[0].length;j++){
            long cur=0;
            for(int i=0;i<arr.length;i++){
                cur+=arr[i][j];
            }
            col[j]=cur;
        }

        temp=0;
        for(int i=0;i<arr[0].length;i++){
            temp+=col[i];
            if(temp==(t-temp)) return true;
        }

        return false;
        
    }
}