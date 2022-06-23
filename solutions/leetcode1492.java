class Solution {
    public int kthFactor(int n, int k) {
        int count = 0;
        for(int i =1 ; i <= n ; i++ ){ // traverse from 1 to n
            if(n%i == 0){ // if modular operator gives zero 
                count ++; // count ++
            }
            if(count == k){ // if count equals to k then we got our element 
                return i ;
            }
        }
        return -1; // or return -1
    }
}