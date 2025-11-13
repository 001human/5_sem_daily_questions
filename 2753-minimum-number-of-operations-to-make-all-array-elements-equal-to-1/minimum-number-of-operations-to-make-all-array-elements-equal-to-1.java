class Solution {
    public int minOperations(int[] arr) {
        int[]temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        int n=arr.length;
        temp[arr.length-1]=arr[arr.length-1];
        int o=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1) o++;
        }
        if(o==n) return 0;
        if(o!=0) return arr.length-o; 

        int t=51;
        while(t-->0){
            for(int i=0;i<arr.length-1;i++){
                temp[i]=gcd(temp[i+1],temp[i]);
                if(temp[i]==1) return (n-1+(51-t));
            }
        }
        return -1;
    }

    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}