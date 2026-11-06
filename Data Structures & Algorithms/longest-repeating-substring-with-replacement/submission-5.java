class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,right=0,maxLen=0,maxFreq = 0;
        Map<Character, Integer> myMap=new HashMap<>();
        while(right<s.length()){
                myMap.put(s.charAt(right), myMap.getOrDefault(s.charAt(right), 0) + 1);
                maxFreq = Math.max(maxFreq, myMap.get(s.charAt(right)));
                
                if((right-left+1)-maxFreq<=k){
                  maxLen=Math.max(maxLen, right-left+1);  
                }else{
                    myMap.put(s.charAt(left), myMap.getOrDefault(s.charAt(left), 0) - 1);
                    left++;
                }
        right++;


        }
         return maxLen;
    }
}
