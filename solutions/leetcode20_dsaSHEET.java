class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0 ) return false ; // if length is odd then return false 
        
        Stack <Character> stack = new Stack() ; // intialisingm stacl LIFO
        for(char c : s.toCharArray()){ // to get access over every element 
            if( c == '(' || c == '{' || c == '[' ){ // first element to present should always be any type of opening bracket 
                stack.push(c);
            }else if(c == ')' && !stack.isEmpty() && stack.peek() == '(' ){ // if the previous one is not opening bracket of same type while you get a closing bracket then return false  and stack should not be empty 
                stack.pop();
            }else if(c == '}' && !stack.isEmpty() && stack.peek() == '{' ){ // if the previous one is not opening bracket of same type while you get a closing bracket then return false  and stack should not be empty 
                stack.pop();
            }
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '[' ){ // if the previous one is not opening bracket of same type while you get a closing bracket then return false  and stack should not be empty 
                stack.pop();
            }else{
                return false ; // if all conditions are false their is no chance 
            }
        }
        return stack.isEmpty(); // if still stack contains something means it does not have matching pair return false 
    }
}