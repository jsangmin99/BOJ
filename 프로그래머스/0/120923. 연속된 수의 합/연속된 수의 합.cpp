#include <string>
#include <vector>

using namespace std;

vector<int> solution(int num, int total) {
    vector<int> answer;
    int idx =0;
    
    if(num%2 ==0)
        idx = (total/num) - (num/2)+1;
    else
        idx = (total/num) - (num/2);   
    
    for(int i = idx; i< idx+num; i++)
        answer.push_back(i);
    return answer;
}