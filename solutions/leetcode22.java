class Solution {
    public List<String> generateParenthesis(int n) {
      List<String> output = new ArrayList(); // INTIALISING ARRAYLIST OF STRINGS 
        bg(output ,"", n , 0 , 0 ); // PASSING OUTPUT LIST WHICH WE HAVE TO RETURN A STRING FOR EVERY COMBINATION AND GIVEN NUMBER TWO ZEROS FOR KEEPING COUNT OF OPENING AND CLOSING BRACKET 
        return output ; // WILL RETURN OUTPUT 
    }
    
    public void bg( List<String> output , String newS , int max , int open , int close){
        if(max*2 == newS.length()){ // IF NUMBER OF OPENING AND CLOSING BRACKET EQUALS THE 2 TIME LENGHT OF GIVEN NUMBER THEN WE GOT OUR COMBINATION AND ADD THAT COMBINATION IN LIST AND RETURN 
            output.add(newS);
            return ;
        }
        if(open<max){
            bg(output , newS + "(" , max , open+1 , close); // AS WE KNOW COMBINATION SHOULD START FROM OPENING BRACKET (SO WE WILL ADD OPENING BRACKET FIRST AND BACKTRACK 
        }
        if(close<open){ // IF THEIR IS ALREADY A OPENING BRACKET THEN ADD CLOSING BRACKETS AND BACKTRACK
            bg(output ,  newS +")" , max , open , close+1);
        }
    }
}
