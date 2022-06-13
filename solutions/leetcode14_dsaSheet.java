class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){ // if string is empty then return null 
            return "" ;
        }
        String prefix = strs[0] ; // consider 1st string as substring 
        for(int i = 1; i < strs.length ; i++){ // and start iterating from 2nd substring 
            while(strs[i].indexOf(prefix) != 0 ){ // if legth of substring becomes zero then end loop 
                prefix = prefix.substring( 0 , (prefix.length())-1); //or else keep reducing length of string till prefix equals to every sub string 
            }
        }
        return prefix ; // return substring 
    }
}
