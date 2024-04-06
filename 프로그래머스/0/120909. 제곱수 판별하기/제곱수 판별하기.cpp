#include <string>
#include <vector>
#include <cmath>

using namespace std;

int solution(int n) {
    int answer = 0;
    answer = sqrt(n);
    if (pow(answer, 2) == n)
        return 1;
    else
        return 2;
}