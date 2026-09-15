class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numsHashMap =new HashMap<>();
        for (int i=0 ; i<nums.length ; i++){
            int reste =target- nums[i];
            if(numsHashMap.containsKey(reste)){
                return new int[]{numsHashMap.get(reste),i};
            }
            numsHashMap.put(nums[i],i);
        }

        return new int[]{};
    }
}
