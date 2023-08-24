#include <string>
#include <vector>

using namespace std;

int sol1(int a, int b){
    int temp = b;
    while (temp > 0) {
        a *= 10;
        temp /= 10;
    }
    return a + b;
}
int solution(int a, int b) {
    int answer = 0;
    int result1 = sol1(a,b);
    int result2 = 2 * a * b;
    
    if(result1 >= result2)
        answer = result1;
    else
        answer = result2;
    return answer;
}