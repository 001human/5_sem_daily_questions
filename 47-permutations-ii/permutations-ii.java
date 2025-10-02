class Solution {
    public List<List<Integer>> permuteUnique(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        int[]visit=new int[arr.length];
        fun(ans,temp,arr,visit);
        return ans;
    }

    public void fun(List<List<Integer>>ans,List<Integer>temp,int[]arr,int[]visit){
        if(temp.size()==arr.length){
            ans.add(new ArrayList(temp));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1] && visit[i-1]==0) continue;
            if(visit[i]==0 ){
                    visit[i]=1;
                    temp.add(arr[i]);
                    fun(ans,temp,arr,visit);
                    visit[i]=0;
                    temp.removeLast();
            }
        }
    }
}

