class Solution {
    public int centeredSubarrays(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            HashSet<Integer>set=new HashSet<>();
            int sum=0;
            for(int j=i;j<arr.length;j++){
                set.add(arr[j]);
                sum+=arr[j];
                if(set.contains(sum)) ans++;
            }
        }
        return ans;
    }
}