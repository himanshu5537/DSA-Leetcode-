class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int p=0;
        int target=n/3;
        HashMap <Integer,Integer> map=new HashMap<>();
        ArrayList <Integer> list=new ArrayList<>();
        for(int e: nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
     for(Map.Entry<Integer,Integer>e:map.entrySet()){
        if(e.getValue()>n/3){
            list.add(e.getKey());
        }
     }
       return list;     
    }
}