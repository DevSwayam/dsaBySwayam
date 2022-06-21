class Solution {
    public:
        bool isHappy(int n) {
            set<int> myset ;
            int val; // to insert in set 
            int index ; // to get squaes of unit places 
            while(1){ // endless loop till get repetative values 
                val = 0 ;  // reset val after every calculation 
                while(n){ // till breaking down of give number dosent give you zero 
                    index = n%10 ; // split 123 into 13 and 2
                    val += index*index; // update 4 means 2's square 
                    n /= 10 ; // now again for 13 repeat the thing 
                }
                if (val == 1){ // if we get 1 return true 
                    return true;
                }else if(myset.find(val)!=myset.end()){ // if we get the elemnt it will breakthe loop 
                    return false ;
                }
                myset.insert(val); // if not that then add the new number in set 
                n = val ; // new number will be val 
            }
            return false;
        }
    };