class Solution {
    public boolean isAnagram(String s, String t) {
     HashMap<Character,Integer> map=new HashMap<>();
     for(char e:s.toCharArray()){
            map.put(e,map.getOrDefault(e,0)+1);
     }
     for(char el:t.toCharArray()){
        if(!map.containsKey(el)){
            return false;
        }
        map.put(el,map.getOrDefault(el,0)-1);
        if(map.get(el)==0){
          map.remove(el);
        }
     }
     if(map.size()==0){
        return true;
     }
     return false;
    }
}