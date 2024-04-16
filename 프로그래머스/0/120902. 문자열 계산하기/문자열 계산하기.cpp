#include <string>
#include <vector>
#include <sstream>

using namespace std;

int solution(string my_string) {
    int answer = 0;
    stringstream ss(my_string);
    ss >> answer;
    int i;
    char c;
    
    while(ss >> c >> i){
        if(c == '+') answer+=i;
        else answer-=i;
    }
    
    
    return answer;
}