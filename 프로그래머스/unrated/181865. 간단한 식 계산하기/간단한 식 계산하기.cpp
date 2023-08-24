#include <string>
#include <vector>
#include <sstream>

using namespace std;

int solution(string binomial) {
    int answer = 0;
    int a, b;
    char sign;
    
    stringstream ss(binomial);
    ss >> a >> sign >> b;
    
    switch(sign){
        case '+':
            return answer = a+b;
        case '-':
            return answer = a-b;
        case '*':
            return answer = a*b;
    }
    
    return answer;
}