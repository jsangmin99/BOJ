#include <string>
#include <vector>

using namespace std;

bool solution(string s) {
    bool answer = false;
    if(4 == s.size() or s.size() == 6){
        for(char c : s){
            if('0' <= c and c <= '9'){
                answer = true;
            }else{
                answer = false;
                break;
            }
        }
    }
    
    return answer;
}