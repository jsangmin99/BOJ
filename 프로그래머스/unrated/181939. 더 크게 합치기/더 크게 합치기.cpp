#include <string>
#include <vector>

using namespace std;

int solution(int a, int b) {
    int answer = 0;
    string a_str = to_string(a);
    string b_str = to_string(b);
    string a_b = a_str + b_str;
    string b_a = b_str + a_str;
    
    if(a_b > b_a)
        answer = stoi(a_b);
    else
        answer = stoi(b_a);
    return answer;
}