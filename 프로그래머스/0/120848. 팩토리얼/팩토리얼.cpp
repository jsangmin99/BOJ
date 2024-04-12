#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    int p = 1;
    int sum = 1;
    while(1){
        sum *= p;
        if(sum > n) break;
        p++;
    }
    p--;
    answer = p;
    return answer;
}