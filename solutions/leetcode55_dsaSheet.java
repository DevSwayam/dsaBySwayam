class Solution {
    public boolean canJump(int[] nums) {
       int lst = nums.length - 1 ; // to get length 
        for( int  i = nums.length-1 ; i >= 0 ; i--){ // trverse from last index to 0 ;
            if(i + nums[i] >= lst){ // if the sum of index and value can surpass ;st then update lst to i 
                lst = i ;
            }
        }
        return lst == 0 ; // if we reach to 0 then we are done 
    }
}
