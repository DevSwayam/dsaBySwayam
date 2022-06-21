class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0){ // if there is only zero it is palindrome 
            return true;
        }
        if(x < 0 || x%10 == 0){
            return false ;
        }
        int reverse_int = 0 ;
        while( x > reverse_int ){
            int pop = x% 10 ;
            x /= 10 ;
           reverse_int = (reverse_int * 10) + pop ;
        }
        if ( x == reverse_int || x == reverse_int / 10){
            return true ;
        }else{
            return false ;
        }
    }
}