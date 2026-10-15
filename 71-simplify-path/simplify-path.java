class Solution {
    public String simplifyPath(String path) {
        String []split=path.split("/");
        Stack<String>stck=new Stack<>();
        for(String i : split){
            if(i.equals("..")){
                if(stck.isEmpty()){
                    continue;
                }
                stck.pop();
            }
            else if(i.equals(".") || i.equals("")){
                continue;
            }
            else{
                stck.push(i);
            }   
        }
        StringBuilder ans = new StringBuilder();
        for(String dir : stck){
            ans.append("/").append(dir);
        }
        return ans.length() == 0 ? "/" : ans.toString();
    }
    }
