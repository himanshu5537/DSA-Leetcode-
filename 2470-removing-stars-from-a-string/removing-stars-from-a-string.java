class Solution {
    public String removeStars(String s) {
        Stack<Character> stck=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stck.isEmpty() && s.charAt(i)=='*'){
                stck.pop();
            }
            else if(stck.isEmpty() && s.charAt(i)=='*'){
               continue;
            }
            else{
                stck.push(s.charAt(i));
            }
        }
        String s1="";
        while(!stck.isEmpty()){
            s1=stck.pop()+s1;
        }
        return s1;
    }
}