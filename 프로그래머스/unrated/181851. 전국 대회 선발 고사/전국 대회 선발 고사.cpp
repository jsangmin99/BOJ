#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> rank, vector<bool> attendance) {
    int answer = 0;
    vector<pair<int,int>> rankIndex;
    for(int i = 0 ; i < rank.size(); i++){
        rankIndex.push_back({rank[i],i});
    }
    
    sort(rankIndex.begin(), rankIndex.end());
    
    vector<int> th;
    for(auto s : rankIndex){
        if(attendance[s.second]){
            th.push_back(s.second);
            if(th.size() ==3) break;
        }
    }
    answer = 10000 * th[0] + 100 *th[1] + th[2];
    return answer;
}