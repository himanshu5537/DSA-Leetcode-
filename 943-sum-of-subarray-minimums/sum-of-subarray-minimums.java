class Solution {
    public int[] leftsmallest(int[]arr,int n){
        int[]left=new int[n];
        Stack<Integer>stck=new Stack<>();
         for(int i=0;i<n;i++){
            while(!stck.isEmpty() && arr[i]<=arr[stck.peek()]){
                stck.pop();
            }
            left[i]=stck.isEmpty()?-1:stck.peek();
            stck.push(i);
         }
         return left;
    }
      public int[] rightsmallest(int[]arr,int n){
        int[]right=new int[n];
        Stack<Integer>stck=new Stack<>();
         for(int i=n-1;i>=0;i--){
            while(!stck.isEmpty() && arr[i]<arr[stck.peek()]){
                stck.pop();
            }
            right[i]=stck.isEmpty()?n:stck.peek();
            stck.push(i);
         }
         return right;
    }
    public int sumSubarrayMins(int[] arr) {
        long sum=0;
        int n=arr.length;
        int mod=1000000007;
        int[]left=leftsmallest(arr,n);
        int[]right=rightsmallest(arr,n);
        for(int i=0;i<n;i++){
            long no_left=i-left[i]-1;
            long no_right=right[i]-i-1;
            long no_subarray_in_range=(no_left+1)*(no_right+1);
           sum = (sum + (arr[i] * no_subarray_in_range) % mod) % mod;
        }
return (int)sum;
    }
}