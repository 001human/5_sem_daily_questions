class Solution {
    public int minCost(String s, int[] arr) {
        int ans=0;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            char ch1=s.charAt(i-1);
            if(ch==ch1){
                ans+=Math.min(arr[i],arr[i-1]);
                arr[i]=Math.max(arr[i],arr[i-1]);
            }
        }
        return ans;
    }
}