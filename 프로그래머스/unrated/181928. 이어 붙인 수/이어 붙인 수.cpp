#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    int answer = 0;
    int odd=0;
    int parity=0;
    
    for(int i:num_list){
        if(i % 2==0)
            parity = parity * 10 + i;
        else
            odd = odd * 10 + i;
    }
    answer = odd + parity;
    return answer;
}