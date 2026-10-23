class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[]left=new int[n];
        int[]right=new int[n];
        int maxArea=Integer.MIN_VALUE;
        Stack<Integer>stck=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stck.isEmpty() && heights[i]<=heights[stck.peek()]){
                stck.pop();
            }
            left[i]=stck.isEmpty()?-1:stck.peek();
            stck.push(i);
        }
        stck.clear();
         for(int i=n-1;i>=0;i--){
            while(!stck.isEmpty() && heights[i]<=heights[stck.peek()]){
                stck.pop();
            }
            right[i]=stck.isEmpty()?n:stck.peek();
            stck.push(i);
        }
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            maxArea=Math.max(maxArea,heights[i]*width);
        }
        return maxArea;
    }
}