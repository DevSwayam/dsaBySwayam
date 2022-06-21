class Solution {
public:
    int findMaxValueOfEquation(vector<vector<int>>& points, int k) {
        priority_queue<pair<int,int>> p ; // intialise priority queue
        int ans = INT_MIN; // lowest ans of int 
        for(int i =0 ;i<points.size() ;i++ ){ // iterate through the arrays 
            while((!p.empty()) && (points[i][0] - p.top().second > k )) p.pop(); // if p is not empty amd the value at top - current value of p at that ith position is greater than k then pop it out 
            if(!p.empty()){ /// if still p is not empty then find the max value 
                ans = max(ans , points[i][0]+points[i][1]+p.top().first); 
            }
            p.push({points[i][1] - points[i][0] , points[i][0]}); // to get | [xj -  xi]| + yi + yj 
        }
        return ans ; // returns max value
    }
};