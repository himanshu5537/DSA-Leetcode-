class Solution {
    public int maxDepth(String s) {
        Stack <Character> stck=new Stack<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stck.push('(');
                max=Math.max(max,stck.size());
            }
            else if(s.charAt(i)==')'){
                stck.pop();
            }
        }
        return max;
    }
}