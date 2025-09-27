class Solution {
    public double largestTriangleArea(int[][] arr) {
        double area=0;
        
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            double x1=arr[i][0];
            double y1=arr[i][1];
            for(int j=i+1;j<n-1;j++){
                double x2=arr[j][0];
                double y2=arr[j][1];
                for(int k=j+1;k<n;k++){
                    double x3=arr[k][0];
                    double y3=arr[k][1];
                    area=Math.max(area,0.5*Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2)));
                }
            }
        }
        return area;
    }
}