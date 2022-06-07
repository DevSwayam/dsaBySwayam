class Solution {
public:
    int maxProfit(vector<int>& prices) {
    int minVal = INT_MAX; // declare max int value to variable so first vale in any array will always be less 
    int maxVal = 0; // declared maximum profit so all ppositivi profits will be accepted 
        // biggest differnece is made whn you have least and most biggest number 
        for (int i = 0 ; i < prices.size(); i++){ // trace through arrat
            minVal = min(prices[i] , minVal); // find which one is less previous value of minimum or current value at index i 
            maxVal = max(maxVal , prices[i] - minVal); // will give max profit cause we get the lowest element from the array so while trvarsing we have to finf max element 
        }
        return maxVal;
    }
};