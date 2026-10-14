class Solution {
    public boolean isPalindrome(String s) {
      
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int size=s.length()/2;
        int a=0,b=s.length()-1;
        while(size!=0){    
                 if (Character.toLowerCase(s.charAt(a)) == Character.toLowerCase(s.charAt(b))) {  
                    a++;
                    b--;
                    size--;
                }else{
                    return false;
                }
        }
        return true;
    }
}
