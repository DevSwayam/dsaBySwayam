class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> output_arr = new ArrayList(); // arraylist intialisiation 
        for(int i = 0 ; i< nums.length ; i++){ // trace throught the array 
            int index = Math.abs( nums[i]) - 1; // get the element upadte to its negative element 
            if( nums[index] < 0){ // if the element is already negative then add it to arraylist 
                output_arr.add(index+1); // add duplicatews to ARRylist 
            }
            else{
                nums[index] = -nums[index]; // f at that index eleemnt want negative then make it negative 
            }
        }
      return output_arr ; // return the output array 
    }
}