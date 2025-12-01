class Solution {
    public int bestTeamScore(int[] score, int[] age) {
        //similar to lis
        int[][]arr=new int[age.length][2];
        for(int i=0;i<age.length;i++){
            arr[i][0]=score[i];
            arr[i][1]=age[i];
        }
        int ans=0;
        Arrays.sort(arr,(a,b)->{
            if(a[1]==b[1]) return Integer.compare(a[0],b[0]);
            return Integer.compare(a[1],b[1]);
        });
        int[]dp=new int[age.length];
        for(int i=0;i<age.length;i++){
            dp[i]=arr[i][0];
            for(int j=i-1;j>=0;j--){
                if(arr[i][0]>=arr[j][0]){
                    dp[i]=Math.max(dp[i],dp[j]+arr[i][0]);
                }
            }
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}