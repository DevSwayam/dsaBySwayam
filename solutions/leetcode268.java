class Solution {
    public int missingNumber(int[] nums) {
        int m = nums.length  ; // as we know the array is starting 0 to n(highest value in the array ) so size of array will also be n 
        int sum = m*(m+1)/2 ; // generalise formula from arithematic progression 
        int sumOfArray = 0 ; // to get total summ of array
        for(int i = 0 ; i < nums.length ; i++){
            sumOfArray += nums[i];
        }
        return sum-sumOfArray ; // the missing number will be totsl sum till max number - sum of actual array 
    }
}
