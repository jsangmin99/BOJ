#include <string>
#include <vector>

using namespace std;

int solution(string my_string, string target) {
    int answer = 0;
    answer = (my_string.find(target) != string::npos) ? 1:0;
    return answer;
}