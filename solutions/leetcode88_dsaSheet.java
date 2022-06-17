class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m -- ; // given 
        n--; // given 
        for(int i = nums1.length -1 ;i>= 0 ; i-- ){ // reverse traversal 
            if(n<0){ // if we ran out of elements return 
                return ;
            }
            if(m>= 0 && nums1[m]>nums2[n]){
                nums1[i] = nums1[m];  // if we get a greater value update 
                m -- ;
            }
            else{
                nums1[i] = nums2[n]; // else value at nth index will be gretaer update that 
                n-- ;
            }
        }
    }
}
