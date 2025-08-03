class Solution {
    public int maxTotalFruits(int[][] fruits, int start, int k) {
        int n=2*100000+1;
        int []pre=new int[2*100000+1];
        for(int[]num:fruits){
            pre[num[0]]=num[1];
        }
        //prefix sum
        for(int i=1;i<pre.length;i++){
            pre[i]=pre[i]+pre[i-1];
        }

        int ans=0;
        //right and turn left
        for(int i=start;i<=Math.min(start+k,n-1);i++){
            int r=i;
            int l=start-(k-2*(i-start));
            int sum=pre[r];
            if(l>0) sum-=pre[l-1];
            ans=Math.max(ans,sum);
        }

        //left and turn right
        for(int i=start;i>=Math.max(0,start-k);i--){
            int l=i;
            int r=start+(k-2*(start-i));
            
            int sum=0;
            if(r<pre.length) sum+=pre[r];
            if(l>0)sum-=pre[l-1];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}