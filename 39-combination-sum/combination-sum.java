class Solution {
    public static void solve(int i,int[]candidate,List<Integer>ld, List<List<Integer>>list,int target){
    
        if(i==candidate.length || target<0){
            return;
        }
        if(target==0){
            if(!list.contains(new ArrayList<>(ld))){
            list.add(new ArrayList<>(ld));
            }
            return;

     }
        ld.add(candidate[i]);
        solve(i,candidate,ld,list,target-candidate[i]);
        ld.remove(ld.size()-1);
        solve(i+1,candidate,ld,list,target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer>ld=new ArrayList<>();
        List<List<Integer>>list=new ArrayList<>();
        solve(0,candidates,ld,list,target);
        return list;

    }
}