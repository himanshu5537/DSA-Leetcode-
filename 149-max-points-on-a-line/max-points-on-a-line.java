class Solution {
    public int maxPoints(int[][] points) {
        if(points.length==1) return 1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                int count=2;
                int dx=points[i][0]-points[j][0];
                int dy=points[i][1]-points[j][1];
                for(int k=j+1;k<points.length;k++){
                    int dx1=points[i][0]-points[k][0];
                    int dy1=points[i][1]-points[k][1];
                    if(dx*dy1==dy*dx1) {
                       count++;
                    }
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}