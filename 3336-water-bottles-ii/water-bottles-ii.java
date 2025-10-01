class Solution {
    public int maxBottlesDrunk(int b, int ex) {
        int ans=b;
        int empty=b;
        while(empty>=ex){
            empty=empty-ex;
            ans++;
            empty++;
            ex++;
        }
        return ans;
    }
}