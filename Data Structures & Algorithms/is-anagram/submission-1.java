class Solution {
    public boolean isAnagram(String s, String t) {
    //         int[] tabS=new int[26];
    //         int[] tabT=new int[26];
    //         int lengthS = s.length();
    //         int lengthT = t.length();
    //         if (lengthS!= lengthT) return false;
    //         char r,k;
    //         for(int i=0; i<26 ; i++){
    //             tabS[i]=0;
    //             tabT[i]=0;
    //         }
    //         for(int j=0;j<lengthS;j++){
    //             r=s.charAt(j);
    //             k=t.charAt(j);
    //         switch(r){
    //             case 'a' : tabS[0]++;
    //             case 'b' : tabS[1]++;
    //             case 'c' : tabS[2]++;
    //             case 'd' : tabS[3]++;
    //             case 'e' : tabS[4]++;
    //             case 'f' : tabS[5]++;
    //             case 'g' : tabS[6]++;
    //             case 'h' : tabS[7]++;
    //             case 'i': tabS[8]++;
    //             case 'j' : tabS[9]++;
    //             case 'k' : tabS[10]++;
    //             case 'l' : tabS[11]++;
    //             case 'm' : tabS[12]++;
    //             case 'n' : tabS[13]++;
    //             case 'o' : tabS[14]++;
    //             case 'p' : tabS[15]++;
    //             case 'q' : tabS[16]++;
    //             case 'r' : tabS[17]++;
    //             case 's' : tabS[18]++;
    //             case 't' : tabS[19]++;
    //             case 'u' : tabS[20]++;
    //             case 'v' : tabS[21]++;
    //             case 'w' : tabS[22]++;
    //             case 'x' : tabS[23]++;
    //             case 'y' : tabS[24]++;
    //             case 'z' : tabS[25]++;
    //         }
    //             switch(k){
    //             case 'a' : tabT[0]++;
    //             case 'b' : tabT[1]++;
    //             case 'c' : tabT[2]++;
    //             case 'd' : tabT[3]++;
    //             case 'e' : tabT[4]++;
    //             case 'f' : tabT[5]++;
    //             case 'g' : tabT[6]++;
    //             case 'h' : tabT[7]++;
    //             case 'i' : tabT[8]++;
    //             case 'j' : tabT[9]++;
    //             case 'k' : tabT[10]++;
    //             case 'l' : tabT[11]++;
    //             case 'm' : tabT[12]++;
    //             case 'n' : tabT[13]++;
    //             case 'o' : tabT[14]++;
    //             case 'p' : tabT[15]++;
    //             case 'q' : tabT[16]++;
    //             case 'r' : tabT[17]++;
    //             case 's' : tabT[18]++;
    //             case 't' : tabT[19]++;
    //             case 'u' : tabT[20]++;
    //             case 'v' : tabT[21]++;
    //             case 'w' : tabT[22]++;
    //             case 'x' : tabT[23]++;
    //             case 'y': tabT[24]++;
    //             case 'z' : tabT[25]++;
    //         }

    //         }
    //         for (int e=0;e<26;e++){
    //             if(tabT[e]==tabS[e]){
    //                  continue;    
    //             } else{
    //                 return false;
    //             } 
    //         }
    //         return true;
    int[] count=new int[26];
    if (s.length()!= t.length()) return false;
    for(int i=0; i<s.length();i++){
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
    }
    for(int nums : count){
        if(nums!=0) return false;
        
    }
    return true;
     }
}
