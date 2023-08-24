#include <string>
#include <vector>
#include <algorithm>
#include <sstream>

using namespace std;

vector<string> solution(string myString) {
    vector<string> answer;
    stringstream ss(myString);
    string str;
    while(getline(ss ,str , 'x')){
        if(!str.empty()){
            answer.push_back(str);
        }
    }
    sort(answer.begin(), answer.end());
    return answer;
}