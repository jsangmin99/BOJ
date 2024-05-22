#include <string>
#include <vector>
#include <algorithm>

using namespace std;
bool compare(int x, int y){
    return x > y;
}

string solution(string s) {
    string answer = "";
    sort(s.begin(),s.end(), compare);
    answer = s;
    return answer;
}