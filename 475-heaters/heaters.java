class Solution {
    public int findRadius(int[] house, int[] heater) {
        Arrays.sort(house);
        Arrays.sort(heater);
        int start=0;
        int ans=0;
        int end=Math.max(house[house.length-1],heater[heater.length-1]);
        while(start<=end){
            int mid=start+(end-start)/2;
            if(pos(mid,house,heater)){
                ans=mid;
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }
    
    public boolean pos(int rad,int[]house,int[]heater){
        int i=0;
        int j=0;
        int ans=0;
        while(i<house.length && j<heater.length){
            if(house[i]>= heater[j]-rad && house[i]<=heater[j]+rad){
                ans++;
                i++;
            }
            else j++;
        }
        return ans==house.length;
    }
}