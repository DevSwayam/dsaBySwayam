class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0){ 
            return new ArrayList<>(); // if length is 0 or numm then just return the blank arraylist 
         }
        Map<String, List<String>> map = new HashMap<>(); // to store the string value to return 
        for (String s : strs) { // for every string in the list 
            char[] ca = new char[26]; // to store the repetation of characters 
            for (char c : s.toCharArray()) { // for every substring select every character 
                ca[c - 'a']++; // for every character increase the value 
              } 
            String keyStr = String.valueOf(ca); // store it as a key in hashmap 
            if (!map.containsKey(keyStr)){  // if map doses not contain the key 
                map.put(keyStr, new ArrayList<>()); // then add that key in arraylist 
            }
            map.get(keyStr).add(s); // add correseponsting string in hashmap 
        }
        return new ArrayList<>(map.values()); // return hashmap
    }
}