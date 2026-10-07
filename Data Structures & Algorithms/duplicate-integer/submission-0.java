class Solution {
    public boolean hasDuplicate(int[] nums) {
        int lengthN = nums.length;
        // for(int i=0 ; i<lengthN ; i++){
        //     for(int j=i+1; j<lengthN ;j++){
        //         if (nums[i]== nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        HashSet numsHash = new HashSet();
         for(int i=0 ; i<lengthN ; i++){
         if(numsHash.add(nums[i])==false){
            return true;
         }
         }
         return false; 


    }
}