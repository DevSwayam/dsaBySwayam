class Solution {
    public String reverseWords(String s) {
        
        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        
        int i = s.length()-1;
        while(i >= 0) {
            if(sb.length()!=0 && s.charAt(i) == ' ') { // if length is not equal to 0 and we get _ then
                ans.append(" "); // first add space 
                ans.append(sb.reverse()); // then add reverse of sb 
                sb.setLength(0); // reset sb length to 0 so that we can add next substring 
            } else if(s.charAt(i) != ' ') { // if we get character for first time 
                sb.append(s.charAt(i)); // add characters of s 
            }
            i--;
        }
		
		// maybe at last we have something to add to ans, but our loop ends so, we add last letter to ans by reversing sb.
        // suppose for xyz_ it will add after we get '_' so for last letter we will miss hence we will add another if
        if(sb.length()!=0) { // if sb still have something to add 
           ans.append(" "); // then first add psace 
            ans.append(sb.reverse()); // then add reverse of sb in ans 
        }
		
		// there would be an extra space at 0 index of ans, so we removed that.
        ans.delete(0,1); // as while adding each time we first add _ so on 0th index we will get _ we have to reove that 
        return ans.toString(); // return answer in format of string 
    }
}
