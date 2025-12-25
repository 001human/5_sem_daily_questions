class Solution {
    public int countNicePairs(int[] arr) {
        int mod=1000000007;
        long ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int r=reverse(arr[i]);
            if(map.containsKey(arr[i]-r)) ans+=map.get(arr[i]-r);
            map.put(arr[i]-r,map.getOrDefault(arr[i]-r,0)+1);
        }
        return (int)(ans%mod);
    }

    public int reverse(int num) {
        int rev = 0;
        while(num > 0) {
            rev = rev*10 + (num%10);
            num /= 10;
        }
        return rev;
    }
}