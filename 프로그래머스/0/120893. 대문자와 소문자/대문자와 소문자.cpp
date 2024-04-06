#include <string>
#include <vector>

using namespace std;

string solution(string my_string) {
    string answer = "";
     for (char c : my_string) {
        if (islower(c)) {
            answer += toupper(c); // 소문자를 대문자로 변환
        } else if (isupper(c)) {
            answer += tolower(c); // 대문자를 소문자로 변환
        }
    }
    return answer;
}