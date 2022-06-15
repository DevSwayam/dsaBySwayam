class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums); // will sort the array 
        int n = nums.length; // will give length of array 
        return Math.max(nums[n-1]*nums[0]*nums[1] , nums[n-1]*nums[n-2]*nums[n-3]); // will give product for first 3and last 3 numbers but first 3 cause for negative numbers first three will be greater in negative like -3 - 2 sor by multiplying both will get + 6 and multiplying it by larget nyumber which will be last after sorting array will give max 
    }
}