class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int profit = 0; // declare profit as zero inital profit 
        for(int i =0 ; i<prices.size()-1; i++){ // travers in loop till last element  
            if(prices[i+1]>prices[i]){ // if their is slightest chance of generation of profit then add that prfit 
                profit = profit + prices[i+1] - prices[i]; // profirt formula
            }
        }
        return profit; // return profit 
    }
};