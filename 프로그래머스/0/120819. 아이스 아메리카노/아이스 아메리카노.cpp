#include <string>
#include <vector>

using namespace std;

vector<int> solution(int money) {
    vector<int> answer;
    int cnt =0;
    int remain = 0;
    cnt = money / 5500;
    remain = money%5500;
    answer.push_back(cnt);
    answer.push_back(remain);
    return answer;
}