#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    int answer = 0;
    int sum =0;
    int re1 =1;
    int re2 =0;
    for(int i =0; i < num_list.size(); i++){
        sum += num_list[i];
        re1 *= num_list[i];
    }
    re2 = sum * sum;
    if(re1 > re2)
        answer = 0;
    else
        answer = 1;
    return answer;
}