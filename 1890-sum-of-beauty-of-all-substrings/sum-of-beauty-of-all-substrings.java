class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
              int []arr=new int[26];
            for(int j=i;j<s.length();j++){
             arr[s.charAt(j)-'a']++;
             int max=Integer.MIN_VALUE;
             int min=Integer.MAX_VALUE;
             for(int f:arr){
                if(f>0){
                 max=Math.max(f,max);
                 min=Math.min(f,min);
                }
             }
             ans+=(max-min);
            }
        }
        return ans;
    }
}