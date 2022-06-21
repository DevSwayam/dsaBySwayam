#define pb push_back 
class RandomizedCollection {
    vector<int> v;
    unordered_map<int,int> mymap;
public:
   unordered_map<int,vector<int>> mp;
vector<pair<int,int>> nums;
    
RandomizedCollection() {
    
}

bool insert(int val) {
    
 bool it = mp.find(val) == mp.end();
    
 mp[val].push_back(nums.size());
 nums.push_back({val,mp[val].size()-1});

 return it;
    
}

bool remove(int val) {
    
 bool it = mp.find(val) != mp.end();

    if(it)
    {
        auto last = nums.back();
        mp[last.first][last.second] = mp[val].back();
        nums[mp[val].back()] = last;
        mp[val].pop_back();
        
        if(mp[val].size() == 0)
        {
            mp.erase(val);
        }
        
        nums.pop_back();
    }
    
    return it;
 
    
}

int getRandom() {
    
    return nums[rand()%nums.size()].first;
    
}
};
/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection* obj = new RandomizedCollection();
 * bool param_1 = obj->insert(val);
 * bool param_2 = obj->remove(val);
 * int param_3 = obj->getRandom();
 */