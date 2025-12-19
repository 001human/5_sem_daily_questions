class Solution {
    public String longestCommonPrefix(String[] arr) {
        if(arr.length==0 || arr==null){
            return "";
        }
        // if(arr.length==1){
        //     return arr[0];
        // }
     
        int count=0;
        count=hello(arr);
        if(count==0){
            return "";
        }
        else{
            return arr[0].substring(0,count);
        }
    }

    public int hello(String []arr){
        int n=arr[0].length();
        for(int i=1;i<arr.length;i++){
            n=Math.min(n,arr[i].length());
        }
        // int n=arr.length;
        int count=0;
        int ans=0;
        for(int i=0;i<n;i++){
            char c=arr[0].charAt(i);
            for(int j=0;j<arr.length;j++){
                if(arr[j].charAt(i)!=c){
                    return ans;
                }
            }
            // if(count==n){
            //     ans++; 
            //     count=0;
            // }
            ans++;
        }
        return ans;
    }
}
