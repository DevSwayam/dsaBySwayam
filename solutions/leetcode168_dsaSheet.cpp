public class leetcode168_dsaSheet {
    class Solution {
public:
    string convertToTitle(int columnNumber) {
       
        string arr = "";
        while(columnNumber){ // while column number dosent end 
            char c = 'A' + (columnNumber - 1) % 26; // will give character 
            arr = c + arr ; // add the new character 
          columnNumber= (columnNumber-1)/26; // will reduce the number 26 to add next char 
        } 
        return arr ;
    }
};
}
