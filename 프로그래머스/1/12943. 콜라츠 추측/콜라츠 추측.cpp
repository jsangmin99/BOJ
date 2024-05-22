#include <string>
#include <vector>

using namespace std;


int solution(int num) {
    int answer = 0;
    long long n = num;
    if(n == 1)
        return 0;
 
    while(n != 1){
        if(answer == 500)
            return -1;
        
        n%2 == 0 ? n/=2 : n = 3*n + 1;
        answer++;
    }
    return answer;
}