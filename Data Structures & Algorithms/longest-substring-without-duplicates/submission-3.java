class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
      HashSet<Character>  myHash= new HashSet<>();
      int left=0,right=0,max=1;
      
      while(right<s.length()){
        if(myHash.add(s.charAt(right))){
            right++;
        }else{
            left++;
            right=left;
            max=Math.max(max,myHash.size());
            myHash.clear();
        }
                    max=Math.max(max,myHash.size());

      }
      return max;
    }
}
