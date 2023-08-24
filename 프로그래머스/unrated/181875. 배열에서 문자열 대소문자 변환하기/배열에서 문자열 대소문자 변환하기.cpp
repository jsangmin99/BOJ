#include <string>
#include <vector>

using namespace std;

vector<string> solution(vector<string> strArr) {
    vector<string> answer;
    
    for (int i = 0; i < strArr.size(); ++i) {
        string str = strArr[i];
        for (int j = 0; j < str.size(); ++j) {
            if (i % 2 == 0) {
                str[j] = tolower(str[j]);
            } else {
                str[j] = toupper(str[j]);
            }
        }
        answer.push_back(str);
    }
    
    return answer;
}