#include <string>
#include <vector>
#include <map>
#include <algorithm>

using namespace std;

int solution(vector<string> strArr) {
    int answer = 0;
    map<int, int> m;
    int maxN = 0;
    for(const string& s : strArr){
        m[s.length()]++;
    }
    
    for(const auto& n : m){
        maxN = max(maxN, n.second);
    }
    return maxN;
}