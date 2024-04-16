#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> sides) {
    int answer = 0;
    int mx = max(sides[0], sides[1]);
    int mi = min(sides[0], sides[1]);
    //mx가 가장 긴변일 경우
    for(int i = mx-mi+1; i <= mx; i++)
        answer++;
    for(int i = mx+1; i < mx+mi; i++)
        answer++;
    return answer;
}