#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    int answer = 0;
    int odd = 0;
    int even = 0;
    for(int i =0; i < num_list.size(); i+=2){
        even += num_list[i];
    }
    for(int i =1; i < num_list.size(); i+=2){
        odd += num_list[i];
    }
    if(odd > even){
        answer = odd;
    }else if(odd < even){
        answer = even;
    }else{
        answer = even;
    }
    return answer;
}