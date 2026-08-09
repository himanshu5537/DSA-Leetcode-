class Solution {

    public void solve(int index,
                      int[] candidates,
                      int target,
                      List<Integer> ds,
                      List<List<Integer>> ans) {
                         if(target == 0){
            ans.add(new ArrayList<>(ds));  
            return;
        }

                        if(index==candidates.length|| target<0){
                            return;
                        }

       
            ds.add(candidates[index]);

            solve(index+1,candidates,target-candidates[index],ds,ans);

            ds.remove(ds.size() - 1);

            int i=index+1;

            while(i<candidates.length && candidates[i]==candidates[i-1]){
               i++;
            }
            solve(i,candidates,target,ds,ans);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        solve(0,candidates,target,new ArrayList<>(),ans);

        return ans;
    }
}