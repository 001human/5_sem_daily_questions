class Solution {
    public int areaOfMaxDiagonal(int[][] arr) {
        double max=0.0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int a=arr[i][0];
            int b=arr[i][1];
            double t=Math.sqrt(a*a+b*b);
            if(max<t){
                max=t;
                ans=a*b;
            }
            else if(max==t){
                ans=Math.max(ans,a*b);
            }
        }
        return ans;
    }
}