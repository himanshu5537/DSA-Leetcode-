class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[]result=new int[n];
        Stack<Integer>stck=new Stack<>();
        for(int i=n-1;i>=0;i--){
               stck.push(nums[i]);
        }
        for(int i=n-1;i>=0;i--){
            while(!stck.isEmpty() && nums[i]>=stck.peek()){
                stck.pop();
            }
            result[i]=stck.isEmpty()?-1:stck.peek();
            stck.push(nums[i]);
        }
    return result;
    }
}