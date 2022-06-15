class Solution {
    public int minMoves(int[] nums) {
        int i =  0; // intialising i 
        int min = nums[0]; // taking first value as a min 
        int result = 0; // result as zero 
        for(int j = 0 ; j < nums.length ; j++){ // will give the smallest value from array 
            if(min > nums[j]){
                min =  nums[j];
            }
        }
        for( int k = 0 ; k < nums.length ; k++){ // will give max how many moves you have to made to change the array 
            result = result + nums[k] - min ;
        }
   return result ;
    }
}

// for [1,2,3]
// [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
// so lets take it as we have to make 2 and 3 as 1 
// so for 2 to become 1 we have to make [2-1] = 1 (1 operation) 
// so for 3 to become 1 we have to make [3-1] = 2 -> [2-1] = 1 (2 operation)
// in total 3 opeartion 
