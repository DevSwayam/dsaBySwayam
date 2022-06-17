class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){return nums[0]; } // if there is only one element 
        HashMap<Integer , Integer>map = new HashMap <Integer , Integer>();  // to store value and its occurenece 
        for( int i : nums){
            if(map.containsKey(i) && map.get(i) + 1 > nums.length / 2 ){ // if we get the required element returnn the value 
                return i ;
            }else{
                map.put(i , map.getOrDefault(i , 0) + 1) ; // if we didnt get the element or we saw it for first time then add it in hashmap
            }
        }
        return -1;
    }
}
