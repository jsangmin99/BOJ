#include <string>
#include <vector>

using namespace std;

int solution(int hp) {
    /* 
    장군 5
    병정 3
    일  1
    */
    int answer = 0;
    answer += hp /5;
    hp%=5;
    answer += hp /3;
    hp%=3;
    answer += hp /1;
    
    return answer;
}