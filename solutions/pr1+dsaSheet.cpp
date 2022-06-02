// problem is to find duplicate from given array 


class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        sort(nums.begin() , nums.end()); // to sort the array in asscending order 
        for ( int i = 1 ; i < nums.size() ; i++){ // for loop from 1st element to last with help of size of operator 
            if(nums[i] == nums[i-1]){ // somapiring each element with last element 
                return nums[i]; // if match found return value 
            }
        }
        return -1 ; // if match not found in whole iteration return -1 
    }
};