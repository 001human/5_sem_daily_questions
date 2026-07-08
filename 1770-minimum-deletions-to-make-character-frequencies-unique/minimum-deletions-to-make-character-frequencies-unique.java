class Solution {
    public int minDeletions(String s) {
        int[]arr=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;
        }
        Arrays.sort(arr);
        int ans=0;
        for(int i=24;i>=0;i--){
            if(arr[i]==0) break;
            if(arr[i]>=arr[i+1]){
                int pre=arr[i];
                arr[i]=Math.max(0,arr[i+1]-1);
                ans+=(pre-arr[i]);
            }
        }
        return ans;
    }
}