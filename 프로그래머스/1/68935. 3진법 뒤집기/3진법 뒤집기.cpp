#include <string>
#include <vector>
#include <cmath>

using namespace std;

int solution(int n) {
    string s ="";
    while(n > 0){
        s = to_string(n % 3) + s;
        n /= 3;
    }
    //뒤집기
    for(int i = 0; i < s.size()/2; i++){
        char temp = s[i];
        s[i] = s[s.size()-1-i];
        s[s.size()-1-i] = temp;
    }
    // 10진법으로 변환
    int answer = 0;
    for(int i = 0; i < s.size(); i++){
        answer += (s[i]-'0') * pow(3, s.size()-1-i);
    }
    return answer;
}