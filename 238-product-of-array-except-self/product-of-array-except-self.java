class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[]ans=new int[n];
        int product=nums[0];
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=product;
            product*=nums[i];
        }
        product=1;
        for(int j=n-1;j>=0;j--){
             ans[j]*=product;
             product*=nums[j];
        }
       return ans;
     }
}