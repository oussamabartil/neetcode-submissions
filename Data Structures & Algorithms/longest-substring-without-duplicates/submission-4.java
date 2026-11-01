class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,count=0,max=0;
        Map<Character,Integer> myMap=new HashMap<>();
        while(right<s.length()){
           
            if(!myMap.containsKey(s.charAt(right))){
                 myMap.put(s.charAt(right),right);
                 right++;
                 max=Math.max(max,right-left);
            }else{
                left = Math.max(left, myMap.get(s.charAt(right)) + 1);
                max=Math.max(max,right-left+1);
                myMap.put(s.charAt(right),right);
                right++; 
            }
        }
        return max;
    }
}
