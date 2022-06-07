class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int m = nums.size(); // to get size 
        int j = 0; // for getting non zero numbers at start 
        for(int i=0 ; i < m ; i++ ){ // trace array
            if (nums[i] != 0){ // if you found non zero start adding it from 0th position with help of j 
                nums[j] = nums[i];
                j++; // after addding increase j so next non zero integer will be added to next index 
            }
        }
         // after ending the for loop you will get value of j if that value is less than array size than remaining space have to be filled with 0
         while(j < m){
                nums[j] = 0;
                j++;
            }
    }
};