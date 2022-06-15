class Solution {
    public String addBinary(String a, String b) {
       StringBuilder sb =  new StringBuilder();
        int i = a.length() - 1; // to get length 
        int j = b.length()- 1; // to get length 
        int carry = 0; // initialise 
        int sum = 0; // intialise 
        while(i >= 0 || j >= 0){ // if any of the string is still remain to finish then also you have to go in loop 
            sum =  carry ;
            if(i>= 0){ // check wheteher a string is remaining or not 
                sum += a.charAt(i) -'0'; // 1-0 will give 1 and 0-0 will give 0 
            }
             if(j>= 0){  // check wheteher b string is remaining or not 
                sum += b.charAt(j) -'0'; // 1-0 will give 1 and 0-0 will give 0 
            }
            sb.append(sum%2); // will only give 1 or zero to append if even then zero and for odd it will be 1 
            carry = sum/2; // to get carry and add it for next loop 
            i--; // decreasing pointers 
            j--; // decreasing pointers 
        }
        if(carry != 0 ){ // if there is still carry thrn append it 
            sb.append(carry);
        }
        return sb.reverse().toString(); // as we get result in 001 we want it 100 so reverse the string 
    }
}
