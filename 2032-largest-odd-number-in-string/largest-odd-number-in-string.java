class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        int left=0;
        int right=n-1;
        while(right>=0){
            if((num.charAt(right)-'0')%2!=0){
                return num.substring(left,right+1);
            }
            right--;
        }
        return "";
    }
}