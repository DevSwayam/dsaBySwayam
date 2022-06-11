class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int [] counts = new int[k]; // for stroing counts 
        int sum = 0; // intialising sum 
        for(int i =0 ; i<nums.length ; i++ ){ // to get reminder 
            sum += (nums[i]%k) + k; // for negative elements we will get negative remsinder do adding back k will give us exact value 
            counts[sum%k]++; // store the number of times the remainder is repeated in counts array 
        }
        int result = counts[0]; // if started counts equal to 0 then qst element is divisible 
        for(int j = 0 ; j<k ; j++){ // to gwt total results
            result += (counts[j]*(counts[j]-1))/2; // n c r formula from 12th 
        }
        return result ; // return result 
    }
}