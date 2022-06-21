class Solution {
    public String intToRoman(int num) {
        int [] intCode = {1000 , 900 , 500 , 400 , 100 , 90,  50 , 40 , 10 , 9 , 5 , 4 , 1}; // ACCORDING TO EVERY character STORE THE value 
        String[] code =  {"M"  , "CM", "D" , "CD", "C" , "XC", "L","XL" , "X", "IX" , "V" , "IV" , "I" } ; // store every character in string according to value 
        StringBuilder sb = new StringBuilder(); // to return the result 
            for(int i = 0 ; i< intCode.length; i++){ // traverse through the array of int code 
                while(intCode[i]<=num){ // if the intcode is equal or less than number then subtract it from num and add the same index character from the string of code 
                    num -= intCode[i]; // update num 
                    sb.append(code[i]); // append characters 
                }
            }
        return sb.toString() ; // return string 
     }
}
