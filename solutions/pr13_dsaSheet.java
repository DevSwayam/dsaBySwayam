class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // sort the array 
        List<List<Integer>> output = new LinkedList(); // to get list in list 
        for(int i = 0;i<nums.length-2;i++){// traverse till last 2elements are left 
            if( i == 0 || (i > 0 && nums[i] != nums[i-1])){ // if i is at 0 or their are no duplicates of i traverse to get value of two sum fucntion 
                int low = i+1; // traverse the array from remaining elemets 
                int high = nums.length - 1 ; // 2 pointer approach of two reffer on your own 
                int sum = 0-nums[i]; // you have to find negative sum of 3rd element to make it zero 
                while(low<high){ // until loop raches its mid point 
                    if(nums[low] + nums[high] == sum){
                        output.add(Arrays.asList(nums[i] , nums[low] , nums[high]));
                            while(low < high && nums[low] == nums[low+1]){
                                low ++ ;
                            }
                            while(low<high && nums[high] == nums[high-1]){
                                high--;
                            }
                            low++;
                            high--;
                          }else if(nums[low]+nums[high]>sum){
                            high --;
                         }
                    else{
                        low++;
                    }
                  }
                }
            }
        return output ;
        }
    }

