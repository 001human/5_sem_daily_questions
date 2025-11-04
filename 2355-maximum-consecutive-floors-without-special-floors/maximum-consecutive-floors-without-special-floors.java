class Solution {
    public int maxConsecutive(int bot, int top, int[] arr) {

        Arrays.sort(arr);
        int n=arr.length;
        int ans=Math.max(arr[0]-bot,top-arr[n-1]);
        for(int i=1;i<arr.length;i++){
            ans=Math.max(ans,arr[i]-arr[i-1]-1);
        }
        return ans;

        //tle due to 1e9
        // HashSet<Integer>set=new HashSet<>();
        // for(int num:arr){
        //     set.add(num);
        // }

        // HashSet<Integer>mset=new HashSet<>();
        // for(int i=bot;i<=top;i++){
        //     if(!set.contains(i)){
        //         mset.add(i);
        //     }
        // }

        // int ans=0;
        // for(int n:mset){
        //     int len=0;
        //     if(!mset.contains(n-1)){
        //         len++;
        //         int cur=n;
        //         while(mset.contains(++cur)){
        //             len++;
        //         }
        //     }
        //     ans=Math.max(ans,len);
        // }
        // return ans;
    }
}