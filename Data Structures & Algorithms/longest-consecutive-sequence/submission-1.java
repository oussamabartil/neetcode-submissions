class Solution {
    public int longestConsecutive(int[] nums) {
        int count=1;
        int count1=1;
         int sec;
        if (nums.length == 0) return 0;
        TreeSet<Integer> numbers = new TreeSet<>();

        for(int i =0;i<nums.length;i++){
             numbers.add(nums[i]);
        }
        int min =numbers.pollFirst();
        while(!numbers.isEmpty()){
                 sec = numbers.pollFirst();
             if(sec==(min+1))
                count++;
             else 
                count =1;             
            count1 = Math.max(count1, count);
            min=sec;
        }       

        return count1;
    } 
}
