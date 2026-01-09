// class Solution {
//     static int ans;
//     public int maximumLength(int[] arr, int k) {
//         ans=0;
//         List<Integer>ls=new ArrayList<>();
//         fun(arr,0,k,ls);
//         return ans;
//     }

//     public void fun(int[]arr,int i,int k,List<Integer>ls){
//         if(i==arr.length){
//             if(ls.size()==1 ||ls.size()==0 ) return;
//             int a=(ls.get(0)+ls.get(1))%k;
//             for(int j=1;j<ls.size()-1;j++){
//                 if( a!=(ls.get(j)+ls.get(j+1))%k ) return;
//             }
//             ans=Math.max(ans,ls.size());
//         }
//         if(i>=arr.length) return;
//         ls.add(arr[i]);
//         fun(arr,i+1,k,ls);
//         ls.removeLast();
//         fun(arr,i+1,k,ls);
//     }
// }

class Solution {
    public int maximumLength(int[] arr, int k) {
        int[][] dp = new int[arr.length+1][k+1];
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                int val = ( arr[i] + arr[j] )%k; 
                dp[i][val] = dp[j][val]+1; 
                ans = Math.max(ans, dp[i][val]);
            }
        }
        return ++ans; 
    }
}