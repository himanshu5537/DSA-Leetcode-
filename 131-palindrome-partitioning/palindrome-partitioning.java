class Solution {
    public static boolean isPalindrome(String s,int start,int end){
          while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
          }
          return true;
    }
    public static void checkfunction(String s, List<List<String>>ans, List<String> path,int index){
        if (index==s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                path.add(s.substring(index,i+1));
                checkfunction(s,ans,path,i+1);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String> path=new ArrayList<>();
        checkfunction(s,ans,path,0);
        return ans;
    }
}