class Solution {
    public boolean isPalindrome(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String sc="";
        int count=0;
        int max=-1;
        if(s.length()==0){
            return "";
        }
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
               if(isPalindrome(s,i,j)){
                   count=j-i+1;
                   if(count>max){
                      max=Math.max(max,count);
                      sc=s.substring(i,j+1);
                   }
               }
            }
        }
        return sc;
    }
}