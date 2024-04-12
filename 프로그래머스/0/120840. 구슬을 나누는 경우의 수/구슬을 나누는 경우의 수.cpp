#include <string>
#include <vector>

using namespace std;

int solution(int balls, int share) {
    long answer = 1;
    int arr[31];
    arr[0] = 1;
    int a = (balls - share < share) ? balls - share : share;
    for(int i = 1; i <= a; i++ ){
        answer *= (balls-i+1);
        answer /= i;
    }
    return answer;
}