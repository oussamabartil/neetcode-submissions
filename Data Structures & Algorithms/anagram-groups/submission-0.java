class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     


        Map<String, List<String>> resultat = new HashMap<>();

        for (String mot : strs) {
            int[] count=new int[26];
            String n =new String();
            for(int i=0; i<mot.length();i++){
             count[mot.charAt(i) - 'a']++;
            }
             for(int j=0; j<26;j++){
                n+=count[j]+',';
            }
            resultat.computeIfAbsent(n, k -> new ArrayList<>()).add(mot);
        }   
        return new ArrayList<>(resultat.values());         
    }
}
