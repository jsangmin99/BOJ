#include <string>
#include <vector>

using namespace std;

int solution(int n, int k) {
    int answer = 0;
    int sum =0;
    sum = (n*12000) +(k * 2000);
    sum = sum - ((n/10) * 2000);
    answer = sum;
    return answer;
}