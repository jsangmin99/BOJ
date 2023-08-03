#include <string>
#include <vector>

using namespace std;

int solution(string my_string, string is_prefix) {
    int answer = 0;
    answer = my_string.substr(0,is_prefix.length()) == is_prefix ? 1:0;
    return answer;
}