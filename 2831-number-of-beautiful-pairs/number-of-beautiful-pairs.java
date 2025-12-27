class Solution {
    public int countBeautifulPairs(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int a=String.valueOf(arr[i]).charAt(0)-'0';
                if(gcd(a,arr[j]%10)==1) ans++;
            }
        }
        return ans;
    }

    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}