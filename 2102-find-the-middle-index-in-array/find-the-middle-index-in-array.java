class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int rightsum=0;
        int leftsum=0;
        int totalsum=0;
        for(int j=0;j<n;j++){
             totalsum+=nums[j];
        }
        for(int i=0;i<n;i++){
          rightsum=totalsum-leftsum-nums[i];
          if(leftsum==rightsum){
              return i;
          }
          leftsum+=nums[i];
    }
    return -1;
}
}