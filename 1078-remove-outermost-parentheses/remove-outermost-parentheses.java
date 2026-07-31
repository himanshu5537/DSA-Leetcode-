class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        Stack<Character>stck=new Stack<>();
        for(int i=0;i<n;i++){
           if(s.charAt(i)=='('){
            if(!stck.isEmpty()){
                sb.append("(");
            }
            stck.push('(');
           }
           else{
            stck.pop();
            if(!stck.isEmpty()){
               sb.append(")");
            }
            else{
                continue;
            }
           }
        }
        return sb.toString();
    }
} 