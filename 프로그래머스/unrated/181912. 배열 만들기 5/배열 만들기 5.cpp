#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<string> intStrs, int k, int s, int l) {
    vector<int> answer;
    for(const string& str : intStrs){
        if(str.size() >= s + l){
            string temp = str.substr(s,l);
            int n = stoi(temp);
            if(n >k)
                answer.push_back(n);
        }
    }
    return answer;
}