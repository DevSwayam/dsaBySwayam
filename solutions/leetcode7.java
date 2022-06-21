class Solution {
    public int reverse(int x) {
        int rev = 0 ; //will return this number 
        int pop ; // int pop for storing 3 in 1st iteration 2 in second and 1 in last 
        while(x != 0){ // while x id not equal to zero for 123 after 1st pass 3 then 2 then 1 and then zero 
            pop = x%10; // 123 % 10 = 3 ; 12 % 10 = 2 ; 1 %10 = 1 ; 0  
            x /= 10 ; // 123 will reduce to 12 // 12 will recure to 1 // then 1 will reduce to 0 
            if(rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10  && pop > 7){
                return 0 ; // wont work for max value or greater than max value 
            }
            if(rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE && pop < -8){
                return 0 ; // wont work for min value or lesser than min value 
            }
            rev = (rev*10) + pop; // after getting 3 revis 0 then 0*10 will be 0 + in pop it will 3 in second pas it will be 3*10 + 2 = 32 ;  int third pass it will be 32 *10 = 320 + 1 = 321 
        }
        return rev; // return 321 
    }
}