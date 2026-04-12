class Solution {
    public double[] internalAngles(int[] arr) {
        //sum of 2 sides must be greater than 3rd one (a+b>c)
        Arrays.sort(arr);
        double[]ans=new double[3];
        int a = arr[0], b = arr[1], c = arr[2];
        if(arr[0]+arr[1]<=arr[2]) return new double[]{};
        double A = Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2.0 * b * c)));
        double B = Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2.0 * a * c)));
        double C = Math.toDegrees(Math.acos((a*a + b*b - c*c) / (2.0 * a * b)));
        
        ans[0] = A;
        ans[1] = B;
        ans[2] = C;
        Arrays.sort(ans);
        return ans;
    }
}