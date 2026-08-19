class Solution {
    public int maxNumberOfFamilies(int n, int[][] arr) {
        
        HashMap<Integer,int[]>map=new HashMap<>();

        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int a=arr[i][0];
            set.add(a);
        }

        for(int i=0;i<arr.length;i++){
            int a=arr[i][0];
            int b=arr[i][1];
            
            if(map.get(a)==null) map.put(a,new int[11]);
            map.get(a)[b]++;
        }

        int ans=0;
        int rem=n-set.size();
        ans+=(rem*2);

        for(int i:set){
            int[]temp=map.get(i);
            int ch1=0,ch2=0,ch3=0;

            for(int j=2;j<=5;j++){
                if(temp[j]!=0){
                    ch1=1;
                    break;
                }
            }

            if(ch1==1){ for(int j=4;j<=7;j++){
                if(temp[j]!=0){
                    ch2=1;
                    break;
                }
            }

            }
            else ch2=1;

            if(ch2==1) {for(int j=6;j<=9;j++){
                if(temp[j]!=0){
                    ch3=1;
                    break;
                }

            }}
            else ch3=1;
            if(ch1==0) ans++;
            if(ch2==0) ans++;
            if(ch3==0) ans++;

        }
        return ans;

    }
}