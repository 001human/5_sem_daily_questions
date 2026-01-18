class Solution {
    public int longestBalanced(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            HashSet<Integer>set=new HashSet<>();
            int ans1=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]%2==0 && !set.contains(arr[j])) ans1++;
                else if(arr[j]%2==1 && !set.contains(arr[j])) ans1--;
                set.add(arr[j]);
                if(ans1==0) ans=Math.max(ans,j-i+1);
            }
            
        }
        return ans;
    }

    public boolean fun(int[]arr,int i,int j){
        int ans=0;
        
        for(int k=i;k<=j;k++){
            
        }
        if(ans!=0) return false;
        return true;
    }
}