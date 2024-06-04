#include <iostream>
#include <vector>
#include <string>
#include <unordered_map>
#include <unordered_set>

using namespace std;

vector<int> solution(vector<string> gems) {
    //보석 종류별 갯수
    unordered_set<string> gemType(gems.begin(), gems.end());
    int gemTypeCount = gemType.size();
    
    unordered_map<string, int> gemCountMap; 
    int start = 0, end = 0;
    int minStart = 0;
    int minLength = gems.size() + 1;
    
    // 보석 종류를 확인하고 개수에 +1씩 추가하며 탐색ㅓ
    while (end < gems.size()) { 
        gemCountMap[gems[end]]++;
        end++;
        // 먼저 찾은 보석 종류의 갯수가 같을 때까지 반복
        while (gemCountMap.size() == gemTypeCount) {
            if (end - start < minLength) {
                minStart = start;
                minLength = end - start;
            }
            
            gemCountMap[gems[start]]--;
            if (gemCountMap[gems[start]] == 0) {
                gemCountMap.erase(gems[start]);
            }
            start++;
        }
    }
    
    return {minStart + 1, minStart + minLength};
}