#include <string>
#include <vector>

using namespace std;

int gcd(int a, int b){
    if(b ==0)
        return a;
	return gcd(b, a%b);
}

vector<int> solution(int numer1, int denom1, int numer2, int denom2) {
    vector<int> answer;
    int up, down, divisor;
    up = numer1 * denom2 + numer2 * denom1;
    down = denom2 * denom1;
    
    divisor = gcd(up, down);
    
    up /= divisor;
    down /= divisor;
    
    answer.push_back(up);
    answer.push_back(down);
    
    return answer;
}