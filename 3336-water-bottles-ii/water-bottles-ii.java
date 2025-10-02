class Solution {
    public int maxBottlesDrunk(int b, int ex) {
        int ans=b;
        int empty=b; //initially b empty bottles after drinking b bottles
        while(empty>=ex){
            empty=empty-ex;
            ans++;//new bottle is added
            empty++;//new bottle is finished so it becomes empty
            ex++;//icresing numex ny 1
        }
        return ans;
    }
}