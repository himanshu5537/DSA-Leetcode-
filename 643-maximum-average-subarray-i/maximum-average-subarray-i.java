class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int left=0;
        int maxsum=Integer.MIN_VALUE;
       for(int right=0;right<n;right++){
           sum+=nums[right];
           if(right-left+1==k){
            maxsum=Math.max(sum,maxsum);
            sum-=nums[left];
            left++;
           }
       }
    return (double)maxsum/k;
}
}