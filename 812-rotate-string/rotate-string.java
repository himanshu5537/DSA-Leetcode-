class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        String sb=s;
            for(int i=0;i<n;i++){
               sb=sb.charAt(n-1)+sb.substring(0,n-1);
               if(sb.equals(goal)){
                return true;
               }
            }
        return false;
    }
}