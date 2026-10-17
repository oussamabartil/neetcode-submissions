class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3){
            return List.of();
        }
        Arrays.sort(nums);
        int gauche;
        int droite;
        List<List<Integer>> myList = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
             if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            gauche = i + 1;
            droite = nums.length - 1;

         while (gauche < droite) {
            
                if(nums[i] + nums[gauche] + nums[droite]<0){
                gauche++;
                }else{
                    if(nums[i] + nums[gauche] + nums[droite]>0){
                        droite--;
                    }else{
                        myList.add(List.of(nums[i], nums[gauche], nums[droite]));
                        droite--;
                        gauche++;
                        while (gauche < droite && nums[gauche] == nums[gauche - 1]) {
                            gauche++;
                        }
                        while (gauche < droite && nums[droite] == nums[droite + 1]) {
                            droite--;
                        }
            
                }
          }
        
          }       
        }


        return myList;
    }
}
