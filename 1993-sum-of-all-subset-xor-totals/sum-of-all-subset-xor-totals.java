class Solution {
    static int ans;
    public int subsetXORSum(int[] arr) {
        ans=0;
        fun(arr,0,0);
        return ans;
    }

    public void fun(int[]arr,int i,int t){
        if(i>arr.length) return;
        if(i==arr.length){
            ans+=t;
            return;
        }
        fun(arr,i+1,t^arr[i]);
        fun(arr,i+1,t);
    }
}