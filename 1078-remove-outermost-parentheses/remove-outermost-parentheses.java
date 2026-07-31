class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        String s1="";
        Stack<Character>stck=new Stack<>();
        for(int i=0;i<n;i++){
           if(s.charAt(i)=='('){
            if(!stck.isEmpty()){
                s1=s1+"(";
            }
            stck.push('(');
           }
           else{
            stck.pop();
            if(!stck.isEmpty()){
               s1=s1+")";
            }
            else{
                continue;
            }
           }
        }
        return s1;
    }
} 