class Solution {
    public int minOperations(int[][] arr, int x) {
        int r=arr.length;
        int c=arr[0].length;
        List<Integer>ls=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ls.add(arr[i][j]);
            }
        }
        Collections.sort(ls);
        int ans=0;
        int mid=ls.get((ls.size())/2);
        for(int i=0;i<ls.size();i++){
            int t=Math.abs(ls.get(i)-mid);
            if(t%x!=0) return -1;
            ans+=(t/x);
        }
        return ans;
    }
}