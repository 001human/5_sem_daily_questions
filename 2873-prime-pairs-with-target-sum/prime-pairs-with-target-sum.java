class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<Integer>arr=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        boolean []visit=new boolean[n+1]; 
        for(int i=2;i<=n;i++){
            if(visit[i]) continue;
            arr.add(i);
            for(long j=1L*i*i;j<=n;j+=i){
                visit[(int)j]=true;
            }
        }

        int start=0;
        int end=arr.size()-1;
        while(start<=end){
            List<Integer>temp=new ArrayList<>();
            if(arr.get(end)+arr.get(start)==n){
                temp.add(arr.get(start));
                temp.add(arr.get(end));
                ans.add(temp);
                start++;
                end--;
            }
            else if(arr.get(end)+arr.get(start)>n){
                end--;
            }
            else start++;
        }

        return ans;
    }
}