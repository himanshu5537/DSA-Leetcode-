/*class Solution {
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
*/
class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int candidate1 = 0;
        int candidate2 = 0;

        int count1 = 0;
        int count2 = 0;

        // Step 1: Find two candidates
        for (int num : nums) {

            if (num == candidate1) {
                count1++;
            }
            else if (num == candidate2) {
                count2++;
            }
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            }
            else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify candidates
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            }
            else if (num == candidate2) {
                count2++;
            }
        }

        if (count1 > nums.length / 3) {
            ans.add(candidate1);
        }

        if (count2 > nums.length / 3) {
            ans.add(candidate2);
        }

        return ans;
    }
}