#include <string>
#include <vector>

using namespace std;

vector<string> solution(string my_str, int n) {
    vector<string> answer;
    for(int i = 0; i < (my_str.size() / n); i++){
        string s="";
        for(int j = i*n; j < i*n+n; j++){
            s+= my_str[j];
        }
        answer.push_back(s);
    }
    if(my_str.length() % n >0) 
        answer.push_back(my_str.substr(n*(my_str.size() / n)));
    return answer;
}