#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool sssort(pair<int, int> a, pair<int, int> b){
    return a.second < b.second;
}

int solution(vector<int> food_times, long long k) {
    vector<pair<int,int>> time_foodN; // 음식시간, 음식번호
    int n = food_times.size();
    for (int i = 0; i < n; i++){
        time_foodN.push_back(make_pair(food_times[i], i + 1));
    }
    
    sort(time_foodN.begin(), time_foodN.end());
    
    int prevTime =0;
    for(auto i = time_foodN.begin(); i != time_foodN.end(); i++, n--){
        int timeGap = i->first -prevTime;
        long long spendTime = (long long)timeGap * n;
        
        if(timeGap ==0) continue;
        
        if(spendTime <= k){
            k -= spendTime;
            prevTime = i -> first;
        }
        else{
            k %= n;
            sort(i, time_foodN.end(), sssort);
            return (i + k)->second;
        }
        
    }
    return -1;
}