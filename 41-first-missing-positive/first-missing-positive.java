class Solution {
    public int firstMissingPositive(int[] arr1) {
        Set<Integer>set=new HashSet<>();
        for(int num:arr1){
            set.add(num);
        }
        int x=0;
        int[]arr=new int[set.size()];
        for(int num:set){
            arr[x++]=num;
        }
        Arrays.sort(arr);
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=0) index=i;
        }
        int a=1;
        // if(index==-1) index=0;
        int fl=0;
        for(int i=index+1;i<arr.length;i++){
            if(arr[i]==a) a++;
            else return a;
            fl=1;
        }
        if(fl==0) {
            if(arr[0]==1) return 2;
            return a;
        }
        return a;
    }
}
