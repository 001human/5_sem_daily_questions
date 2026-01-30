class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer>ls=new ArrayList<>();
        for(int i=1;i<=n;i++) ls.add(i);
        int cur=0;  //0 =1
        while(ls.size()!=1){
            cur=(cur+k-1)%ls.size();
            ls.remove(cur);
        }
        return ls.get(0);
    }
    //cur=1
    // 3
}