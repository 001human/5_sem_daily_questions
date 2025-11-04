class Solution {
    public int longestConsecutive(int[] arr) {

        //O(n)
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }

        // if(arr.length==0) return 0;

        int ans=0;
        for(int i:set){
            int cur=0;
            int len=0;
            if(!set.contains(i-1)){
                cur=i;
                len++;
                while(set.contains(++cur)){
                    len++;
                }
            }
            
            ans=Math.max(ans,len);

        }

        return ans;











        //nlog n
        // TreeMap<Integer,Integer>map=new TreeMap<>();
        // for(int i=0;i<arr.length;i++){
        //     map.put(arr[i],i);
        // }
        // int pre=Integer.MAX_VALUE;
        // int ans=0;
        // int t=0;
        // for(Integer key:map.keySet()){
        //     if(pre==Integer.MAX_VALUE){
        //         pre=key;
        //         t++;
        //     }
        //     else{
        //         if(key==pre+1){
        //             t++;
        //         }
        //         else{
        //             ans=Math.max(ans,t);
        //             t=1;
        //         }
        //         pre=key;
        //     }
        // }
        // return Math.max(ans,t);
    }
}