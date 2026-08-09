class Solution {
    public static void subsets(int index,int[]nums,List<Integer>ds,List<List<Integer>>list){
        if(index==nums.length){
            list.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[index]);
        subsets(index+1,nums,ds,list);
        ds.remove(ds.size()-1);
        int i=index+1;
        while(i<nums.length && nums[i]==nums[i-1]){
            i++;
        }
        subsets(i,nums,ds,list);
        }
    public List<List<Integer>> subsetsWithDup(int[] nums) { 
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        Arrays.sort(nums);
        subsets(0,nums,ds,list);
        return list;
    
}
}
