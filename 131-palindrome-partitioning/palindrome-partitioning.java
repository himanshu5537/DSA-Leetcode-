class Solution {
    public static boolean isPalindrome(String s,int start,int end){
          while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
          }
          return true;
    }
    public static void checkfunction(String s, List<List<String>>ans, List<String> path){
        if (s.length()==0){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<s.length();i++){
            if(isPalindrome(s,0,i)){
                path.add(s.substring(0,i+1));
                checkfunction(s.substring(i+1),ans,path);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String> path=new ArrayList<>();
        checkfunction(s,ans,path);
        return ans;
    }
}