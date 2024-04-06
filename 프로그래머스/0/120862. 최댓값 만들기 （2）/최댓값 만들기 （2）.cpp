#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> numbers) {
    int answer = 0;
    sort(numbers.begin(), numbers.end());    
    
    // 처음 2개의 수 vs 마지막 2개의 수
    answer = max(numbers[0] * numbers[1], numbers[numbers.size()-1] * numbers[numbers.size()-2]) ;

    return answer;
}