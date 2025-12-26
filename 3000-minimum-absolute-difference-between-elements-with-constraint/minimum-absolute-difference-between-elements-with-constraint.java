class Solution {
    public int minAbsoluteDifference(List<Integer> arr, int x) {
        TreeSet<Integer>st=new TreeSet<>();
        int ans=Integer.MAX_VALUE;
        for(int i=x;i<arr.size();i++){
            st.add(arr.get(i-x));
            Integer low=st.ceiling(arr.get(i));
            if(low!=null) ans=Math.min(ans,Math.abs(arr.get(i)-low));
            Integer high=st.floor(arr.get(i));
            if(high!=null) ans=Math.min(ans,Math.abs(arr.get(i)-high));
        }
        return ans;
    }
}