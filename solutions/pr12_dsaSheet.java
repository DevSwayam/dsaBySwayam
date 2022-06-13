class Solution {
    public int maxArea(int[] height) {
        int max_area = 0; // intialise max area 
        int i = 0; // start pointer from i till j
        int j = height.length -1 ; // from last till first 
        while(i<j){ // if they dont meet each other 
           if(height[i]<height[j]){ // if i is less 
            max_area = Math.max(max_area, height[i]*(j-i)); // height of i and distance between i and j
            i++; 
                  }
            else{
                max_area = Math.max(max_area, height[j]*(j-i)); // same for j
                j-- ;
            }
        }
        return max_area ; // return max area 
        
    }
}