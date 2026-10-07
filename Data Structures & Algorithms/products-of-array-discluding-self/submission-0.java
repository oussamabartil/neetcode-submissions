class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output=new int[nums.length];
        int left=1;  
        for(int j=0;j<nums.length;j++){
           output[j]=1;  
            output[j]*=left;
            left*=nums[j];
        }
        int right=1;
          for(int i=nums.length-1;i>=0;i--){
            output[i]*=right;
            right*=nums[i];
        }
        return output;
    }
}  
