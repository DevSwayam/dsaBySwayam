lass Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0; // inoitialise sum 0 
        HashMap <Integer,Integer> map = new HashMap<>(); // intialise hash map
        map.put(0,1); // started map for 0 remainder with 1 repetation 
        int sum =0; // intialsie sum
        int rem =0; // intialise remainder
        for(int i =0 ; i<nums.length; i++){ // trace the whole array until last element 
            sum += nums[i]; // sum of current element is equal to sum till last element + value of current element 
            rem = sum%k; // to finf remainder
            if(rem<0){ // if remainder is negative 
                rem =+ k; // then add the given number 
            }
            if(map.containsKey(rem)){ // for vhecking the repeatation of remainders 
                ans += map.get(rem); // to store the remainder in ans 
                map.put(rem , map.get(rem)+1); // upadtae the remainder if its available 
            }else{
                map.put(rem,1); // if remainder occur for first time then puit value of it in hashmap
            }
        }
        
        return ans; // return answer
    }
}