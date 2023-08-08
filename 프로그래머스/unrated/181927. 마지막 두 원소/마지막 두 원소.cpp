#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> num_list) {
    vector<int> answer = num_list;
    int last = num_list.back();
    int second = num_list[num_list.size() - 2];
    if(last > second)
        answer.push_back(last-second);
    else
        answer.push_back(last * 2);
    return answer;
}