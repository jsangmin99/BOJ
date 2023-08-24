#include <string>
#include <vector>

using namespace std;

int sol(int a, int b){
    if(a%b ==0)
        return b;
    return sol(b,a%b);
}
int solution(int n) {
    int answer = 0;
    answer = n/ sol(n,6);
    return answer;
}