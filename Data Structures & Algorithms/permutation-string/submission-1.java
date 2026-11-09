class Solution {
    public boolean checkInclusion(String s1, String s2) {
         int[] counts = new int[26];
         int left=0,right=0;  
         for(int i=0;i<s1.length();i++){
            counts[s1.charAt(i)-'a']++;
         }
        while(left<=right && right<s2.length()&&(right-left+1)<=s1.length()){
                         
            if(counts[s2.charAt(right)-'a'] > 0){
               counts[s2.charAt(right)-'a']--;
               right++; 
            }else{
 
                while(left!=right){
                counts[s2.charAt(right-1)-'a']++;
                right--;
                }
              
                left++;
                right++;
            }
        }
        
         return Arrays.stream(counts).allMatch(c -> c == 0);
    }
}
