#include <bits/stdc++.h>
using namespace std;
// 가장 깔끔하고 정리된 방법
int solution(vector<int> nums) {
    unordered_set<int> s(nums.begin(), nums.end());

    return min(nums.size() / 2, s.size());
}