class Solution {
    public int subarraysDivByK(int[] nums, int k) {
         int currentsum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int e:nums){
            currentsum=currentsum+e;
            count+=map.getOrDefault(((currentsum % k) + k) % k,0);
            map.put((((currentsum % k) + k) % k),map.getOrDefault(((currentsum % k) + k) % k,0)+1);
        }
        return count;
      }
    }
