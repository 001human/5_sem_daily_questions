class Solution {
    public int robotSim(int[] arr, int[][] o) {
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<o.length;i++){
            int a=o[i][0];
            int b=o[i][1];
            set.add(a+","+b);
        }
        int x=0;
        int y=0;
        long ans=0;
        char ch='N';
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                if(ch=='N') ch='E';
                else if(ch=='S') ch='W';
                else if(ch=='E') ch='S';
                else ch='N';
            }
            else if(arr[i]==-2){
                if(ch=='N') ch='W';
                else if(ch=='S') ch='E';
                else if(ch=='E') ch='N';
                else ch='S';
            }
            else{
                int k=arr[i];
                int fl=0;
                if(ch=='E'){
                    for(int r=1;r<=k;r++){
                        if(set.contains((x+r)+","+y)){
                            fl=1;
                            x+=(r-1);
                            break;
                        }
                    }
                    if(fl==0) x+=k;
                }

                else if(ch=='W'){
                    for(int r=1;r<=k;r++){
                        if(set.contains((x-r)+","+y)){
                            fl=1;
                            x-=(r-1);
                            break;
                        }
                    }
                    if(fl==0) x-=k;
                }

                else if(ch=='N'){
                    for(int c=1;c<=k;c++){
                        if(set.contains(x+","+ (y+c) )){
                            fl=1;
                            y+=(c-1);
                            break;
                        }
                    }
                    if(fl==0) y+=k;
                }

                else {
                    for(int r=1;r<=k;r++){
                        if(set.contains(x+","+(y-r) )){
                            fl=1;
                            y-=(r-1);
                            break;
                        }
                    }
                    if(fl==0) y-=k;
                }

                
            }
            ans=Math.max(ans,(1L*x*x)+(1L*y*y));
        }
        return (int)ans;
    }
}